package com.zubiri.parking;

import java.util.Scanner;

public class Coche extends Vehiculo {

	boolean automatico = false;
	int consumo100km = 0;
	
	//Constructores
	public Coche(String matricula, int numRuedas, String combustible, String marca, boolean automatico, int consumo100km) {
		super(matricula, numRuedas, combustible, marca);
		this.automatico = automatico;
		this.consumo100km = consumo100km;
	}
	
	public Coche(Scanner sc){
		super(sc);
		System.out.println("Es automatico? ");
		this.setAutomatico(sc.nextBoolean());
		System.out.println("Consumo por cada 100 km: ");
		this.setConsumo100km(sc.nextInt());		
		
	}
	
	//Metodos getter y setter

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
				super.formatted() +
				"Automatico:	" + this.getAutomatico() + "<br/>" +
				"Consumo a los 100km:	" + this.getConsumo100km();
		
		return cocheFormatted;
	}

@Override
    public void mostrarVehiculo(){
		
		super.mostrarVehiculo();
		System.out.println("	Automatico? " + this.automatico);
		System.out.println("	Consumo por cada 100km: " + this.consumo100km + "<br/><br/>");
		System.out.println("	--------	<br/><br/>");

	}
	
}
