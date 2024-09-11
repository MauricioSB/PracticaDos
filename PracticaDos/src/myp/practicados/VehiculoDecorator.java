public abstract class VehiculoDecorator implements Vehiculo {
	
	protected Vehiculo vehiculoDecorado;

	public VehiculoDecorator(Vehiculo vehiculoDecorado) {
		this.vehiculoDecorado = vehiculoDecorado;
	}

	@Override
	public void tipoDeVehiculo() {
		vehiculoDecorado.tipoDeVehiculo();
	}

}