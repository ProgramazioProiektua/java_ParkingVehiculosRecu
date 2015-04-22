package com.zubiri.parking;

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
			new ParkingVehiculos(sc);
			//ParkingVehiculos parkingvehiculos = new ParkingVehiculos(sc);
			ParkingVehiculos.addVehi(sc);
			break;
		case 2:
			System.out.print("Introduce la matricula del coche a borrar: ");
			ParkingVehiculos.deleteVehiculo(sc.next());
			break;
		case 3:
			System.out.print("Matricula a buscar: ");
			ParkingVehiculos.findVehiculo(sc.next());
			break;
		case 4:
			System.out.println(ParkingVehiculos.formattedParking());
			break;
		}
		}
	}
}