public class FarosDeNiebla extends Pieza {
	
	public FarosDeNiebla(Vehiculo vehiculoDecorado) {
		super(vehiculoDecorado);
	}

	@Override
	public void tipoDeVehiculo() {
		super.tipoDeVehiculo();
		System.out.println("Se agregaron ventanas Polarizadas al vehiculo");
	}
}