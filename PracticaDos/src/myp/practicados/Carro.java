public class Carro extends VehiculoDecorator {
	
	public Carro(Vehiculo vehiculoDecorado) {
		super(vehiculoDecorado);
	}

	@Override
	public void tipoDeVehiculo() {
		super.tipoDeVehiculo();
		System.out.println("Ha seleccionado un carro");
	}
}