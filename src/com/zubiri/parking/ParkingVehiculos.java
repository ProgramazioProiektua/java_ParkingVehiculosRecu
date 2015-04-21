package com.zubiri.parking;

import java.util.ArrayList;
import java.util.Scanner;

public class ParkingVehiculos {

	//atributos
	private static ArrayList<Vehiculo> parkingvehiculos = new ArrayList<Vehiculo>();
	private static int numVehiculos = 0;
	private static int contVehiculos = 0;
	
	
	//constructores
	public ParkingVehiculos(Scanner sc) {
			System.out.println("Cuantos vehiculos vas a insertar? ");
			this.setContVehiculos(sc.nextInt());
		
	};
	
	public ParkingVehiculos(ArrayList<Vehiculo> vehiculos) {
		setParkingVehiculos(vehiculos);
	}

	//metodo para insertar un vehiculo nuevo
		public static void addVehi(Scanner sc) {
			System.out.println("¿Que vehiculo quieres añadir?");
			for (int i = 0; getContVehiculos() > i; i++){
			System.out.println("Coche------------------------1");
			System.out.println("Bici-------------------------2");
			int opcion = sc.nextInt();
			switch (opcion) {
			case 1:
				parkingvehiculos.add(new Coche(sc));
				ParkingVehiculos.sumarVehiculo();
				break;
			case 2:
				parkingvehiculos.add(new Bicicleta(sc));
				ParkingVehiculos.sumarVehiculo();
				break;
			}
			}
		}
	
		public static void mostrarParking() {
			if (getParkingVehiculos().size() == 0) {
				System.out.println("No se han cargado los vehículos");
			}
			
			for (int i=0; i<getParkingVehiculos().size(); i++) {
				Vehiculo vehi = getParkingVehiculos().get(i);
				vehi.mostrarVehiculo();
			}
		}
		
		public static String formattedParking() {
			String parkingFormateada =
					"\n*******************************************" + 
					"\n*----------Parking al completo----------*";
			for (int f = 0; f < parkingvehiculos.size(); f++) {
				parkingFormateada += parkingvehiculos.get(f).formatted();
			}
			parkingFormateada += 
					"\n*------------------FIN--------------------*" +
					"\n*******************************************";
			return parkingFormateada;
		}
		
		public static void sumarVehiculo() {
			setNumVehiculos(numVehiculos++);
			
		}
		
		public static void deleteVehiculo(){
			parkingvehiculos.remove(findVehiculo());
	  		/*for (int i = 0; i < parkingvehiculos.size(); i++) {
	  			if (parkingvehiculos.get(i).equals(Vehiculo.getMarca())) {
	  				parkingvehiculos.remove(i);
	  		break;
	  			}
	  		}*/
	  	}
		
	  	public static Vehiculo findVehiculo(){
	  		Vehiculo vehiculo = null;
			Scanner sc = new Scanner(System.in);
	  		System.out.println("Marca del vehiculo que desea buscar: ");
			String pedirMarca = sc.next();
	  		for (int i = 0; i < parkingvehiculos.size(); i++) {
	  			if (parkingvehiculos.get(i).getMarca().equals(pedirMarca)) {
	  				vehiculo = parkingvehiculos.get(i);
	  				break;
	  			}
	  		}
	  		return vehiculo;
	  	}
		
	//Getter setter
		public void setParkingVehiculos(ArrayList<Vehiculo> vehiculos) {
			ParkingVehiculos.parkingvehiculos = vehiculos;
		}
		
		public static ArrayList<Vehiculo> getParkingVehiculos() {
			return parkingvehiculos;
		}
		
		public static int getNumVehiculos() {
			return numVehiculos;
		}
		public static void setNumVehiculos(int numVehiculos) {
			ParkingVehiculos.numVehiculos = numVehiculos;
		}
		
		public static int getContVehiculos() {
			return contVehiculos;
		}
		public void setContVehiculos(int contVehiculos) {
			ParkingVehiculos.contVehiculos = contVehiculos;
		}
		//
	
}
