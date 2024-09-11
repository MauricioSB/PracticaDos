public class VentanasPolarizadas extends Pieza {
	
	public VentanasPolarizadas(Vehiculo vehiculoDecorado) {
		super(vehiculoDecorado);
	}

	@Override
	public void tipoDeVehiculo() {
		super.tipoDeVehiculo();
		System.out.println("Se agregaron ventanas Polarizadas al vehiculo");
	}
}