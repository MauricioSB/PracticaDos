public class Autobus extends VehiculoDecorator {
	
	public Autobus(Vehiculo vehiculoDecorado) {
		super(vehiculoDecorado);
	}

	@Override
	public void tipoDeVehiculo() {
		super.tipoDeVehiculo();
		System.out.println("Ha seleccionado un Autobus");
	}	

}