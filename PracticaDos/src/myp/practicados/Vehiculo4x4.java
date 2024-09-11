public class Vehiculo4x4 extends VehiculoDecorator {
	
	public Vehiculo4x4(Vehiculo vehiculoDecorado) {
		super(vehiculoDecorado);
	}

	@Override
	public void tipoDeVehiculo() {
		super.tipoDeVehiculo();
		System.out.println("Ha seleccionado un Vehiculo4x4");
	}	

}