public abstract class Pieza implements Vehiculo {

	protected Vehiculo vehiculoDecorado;

	public Pieza(Vehiculo vehiculoDecorado) {
		this.vehiculoDecorado = vehiculoDecorado;
	}

	@Override
	public void tipoDeVehiculo() {
		vehiculoDecorado.tipoDeVehiculo();
	}	
	
}