package com.zubiri.parking;

import java.util.Scanner;

public final class Bicicleta extends Vehiculo {

	int numPiñones = 0;
	String tipo = null; //Donde los tipos posibles son "montaña", "paseo" o "carreras"
	
	//Constructores
	
	public Bicicleta(int numRuedas, boolean motor, String marca) {
		super(numRuedas, motor, marca);
		this.numPiñones = numPiñones;
		this.tipo = tipo;
	}
	
	public Bicicleta(Scanner sc){
		super(sc);
		System.out.println("Introduce el numero de piñones: ");
		this.setNumPiñones(sc.nextInt());
		System.out.println("Introduce el tipo: (Montaña, paseo o carreras) ");
		this.setTipo(sc.next());		
		
	}

	
	//Metodos getter y setter
	
	public int getNumPiñones() {
		
		return numPiñones;
	}
	
	public void setNumPiñones(int numPiñones) {
		
		this.numPiñones = numPiñones;
	}
	
	public String getTipo() {
		
		return tipo;
	}
	
	public void setTipo(String tipo) {
		
		this.tipo =  tipo;
	}		
	//Otros metodos
	
	public void mostrarBici(){
		
		System.out.println("Bicicleta:");
		System.out.println("\tNumero de piñones: " + this.numPiñones);
		System.out.println("\tTipo de bicicleta: " + this.tipo);
	}
	
	 public String formatted() {
			String biciFormatted = 
					"\nNumero de piñones:\t" + this.getNumPiñones() + "\n"
							+ "Tipo:\t" + this.getTipo() + "\n";
			
		return biciFormatted;
		}
}
