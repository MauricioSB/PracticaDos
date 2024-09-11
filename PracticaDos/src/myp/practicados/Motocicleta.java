public class Motocicleta extends VehiculoDecorator {
	
	public Motocicleta(Vehiculo vehiculoDecorado) {
		super(vehiculoDecorado);
	}

	@Override
	public void tipoDeVehiculo() {
		super.tipoDeVehiculo();
		System.out.println("Ha seleccionado una Motocicleta");
	}	

}