package com.zubiri.parking;

import java.util.Scanner;


public abstract class Vehiculo {

	String matricula = null;
	int numRuedas = 0;
	String combustible = null;
	String marca = null;

	//Constructores
	
	public Vehiculo(Scanner sc) {
		System.out.println("Inserta la matricula: ");
		this.setMatricula(sc.next());
		System.out.println("Inserta el numero de ruedas: ");
		this.setNumRuedas(sc.nextInt());
		System.out.println("Gasolina/Diesel? ");
		this.setCombustible(sc.next());
		System.out.println("Inserta la marca: ");
		this.setMarca(sc.next());}
		
	public Vehiculo(String matricula, int numRuedas, String combustible, String marca) {
		
			this.matricula = matricula;
			this.numRuedas = numRuedas;
			this.combustible = combustible;
			this.marca = marca;
		}
	
	//Metodos getter y setter
	
		public String getMatricula() {
		
		return matricula;
		}
	
		public void setMatricula(String matricula) {
		
		this.matricula = matricula;		
		}
		
		public int getNumRuedas() {
			
			return numRuedas;
		}

		public void setNumRuedas(int numRuedas) {
			
			this.numRuedas = numRuedas;
		}

		public String getCombustible() {
			
			return combustible;
		}
		
		public void setCombustible(String combustible) {
			
			this.combustible = combustible;
		}
		

		public String getMarca() {
			
			return marca;
		}
		
		public void setMarca(String marca) {
			
			this.marca = marca;
		}
	//Otros metodos
		public String formatted() {
		String vehiculoFormatted = 
						"<br/>Matricula:	" + this.getMatricula() + 
						"<br/>Marca:	" + this.getMarca() + "<br/>"
						+ "Numero de ruedas:	" + this.getNumRuedas() + "<br/>"
						+ "Combustible: 	" + this.getCombustible() + "<br/>";
		
		return vehiculoFormatted;
	}

	public void mostrarVehiculo(){
		
		System.out.println("Coche:");
		System.out.println("	Marca: " + this.marca);
		System.out.println("	Numero de ruedas: " + this.numRuedas);
		System.out.println("	Tipo de combustible: " + this.combustible);
	}
}
