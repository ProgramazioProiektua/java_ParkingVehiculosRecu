package com.zubiri.parking;

import java.util.Scanner;

public class Coche extends Vehiculo {

	String matricula = null;
	boolean automatico = false;
	int consumo100km = 0;
	
	//Constructores
	public Coche(int numRuedas, boolean motor, String marca, String matricula, boolean automatico, int consumo100km) {
		super(numRuedas, motor, marca);
		this.matricula = matricula;
		this.automatico = automatico;
		this.consumo100km = consumo100km;
	}
	
	public Coche(Scanner sc){
		super(sc);
		System.out.println("Inserta la matricula: ");
		this.setMatricula(sc.next());
		System.out.println("Es automatico? ");
		this.setAutomatico(sc.nextBoolean());
		System.out.println("Consumo por cada 100 km: ");
		this.setConsumo100km(sc.nextInt());		
		
	}
	
	//Metodos getter y setter
	
	public String getMatricula() {
		
		return matricula;
	}
	
	private void setMatricula(String matricula) {
		
		this.matricula = matricula;		
	}

	public boolean getAutomatico() {
		
		return automatico;
	}
	
	public void setAutomatico(boolean automatico) {
		
		this.automatico = automatico;
	}
	
	public int getConsumo100km() {
		
		return consumo100km;
	}
	
	public void setConsumo100km(int consumo100km) {
		
		this.consumo100km =  consumo100km;
	}
	
	
	//Otros metodos
    double calcConsumo(int numKm, double precioGasoil) {
    	
    	double consumoTotal = (numKm / consumo100km) * precioGasoil;    	
    	
    	return consumoTotal;
    }
    
    public String formatted() {
		String cocheFormatted = 
				"\nMatricula:\t" + this.getMatricula() + "\n" + 
				"\nAutomatico:\t" + this.getAutomatico() + "\n"
						+ "Consumo a los 100km:\t" + this.getConsumo100km() + "\n";
		
		return cocheFormatted;
	}
    
    public void mostrarCoche(){
		
		System.out.println("Coche:");
		super.mostrarVehiculo();
		System.out.println("\nMatricula " + this.matricula);
		System.out.println("\tAutomatico? " + this.automatico);
		System.out.println("\tConsumo por cada 100km: " + this.consumo100km);
	}
	
}
