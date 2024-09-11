public class Scouter extends VehiculoDecorator {
	
	public Scouter(Vehiculo vehiculoDecorado) {
		super(vehiculoDecorado);
	}

	@Override
	public void tipoDeVehiculo() {
		super.tipoDeVehiculo();
		System.out.println("Ha seleccionado un Scouter");
	}	

}