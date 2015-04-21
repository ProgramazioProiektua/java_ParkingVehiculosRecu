package com.zubiri.parking;

import java.util.ArrayList;
import java.util.Scanner;


public class Main {
	

	public static void main (String args[]) {
	
		Scanner sc = new Scanner(System.in);
		int opcion1 = 0;
		while (opcion1 != 5){
		System.out.println("Que quieres hacer?");
		System.out.println("Añadir vehiculo:   1");
		System.out.println("Borrar vehiculo:   2");
		System.out.println("Buscar vehiculo:   3");
		System.out.println("Mostrar todo el parking:   4");
		System.out.println("Salir:   5");

		opcion1 = sc.nextInt();
		
				switch (opcion1 ) {
		case 1:
			ParkingVehiculos parkingvehiculos = new ParkingVehiculos(sc);
			ParkingVehiculos.addVehi(sc);
			break;
		case 2:
			ParkingVehiculos.deleteVehiculo();
			break;
		case 3:
			ParkingVehiculos.findVehiculo();
			break;
		case 4:
			ParkingVehiculos.mostrarParking();
			break;
		}
		}
	}
}