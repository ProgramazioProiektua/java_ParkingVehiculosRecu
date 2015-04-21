package com.zubiri.parking;

import java.util.Scanner;


public abstract class Vehiculo {

	int numRuedas = 0;
	boolean motor = false;
	static String marca = null;

	//Constructores
	
	public Vehiculo(Scanner sc) {
		System.out.println("Inserta el numero de ruedas: ");
		this.setNumRuedas(sc.nextInt());
		System.out.println("Tiene motor? ");
		this.setMotor(sc.nextBoolean());
		System.out.println("Inserta la marca: ");
		this.setMarca(sc.next());}
		
	public Vehiculo(int numRuedas, boolean motor, String marca) {
			
			this.numRuedas = numRuedas;
			this.motor = motor;
			this.marca = marca;
		}
	
	//Metodos getter y setter
		
		public int getNumRuedas() {
			
			return numRuedas;
		}

		public void setNumRuedas(int numRuedas) {
			
			this.numRuedas = numRuedas;
		}

		public boolean getMotor() {
			
			return motor;
		}

		public void setMotor(boolean motor) {
			
			this.motor = motor;
		}

		public static String getMarca() {
			
			return marca;
		}
		
		private void setMarca(String marca) {
			
			this.marca = marca;
		}
	//Otros metodos
	public String formatted() {
		String vehiculoFormatted = 
				"\nMarca:\t" + this.getMarca() + "\n"
						+ "Numero de ruedas:\t" + this.getNumRuedas() + "\n"
						+ "Motor? " + this.getMotor() + "\n";
		
		return vehiculoFormatted;
	}

	public void mostrarVehiculo(){
		
		System.out.println("Vehiculo:");
		System.out.println("\tMarca: " + this.marca);
		System.out.println("\tNumero de ruedas: " + this.numRuedas);
		System.out.println("\tMotor: " + this.motor);

	}
}
