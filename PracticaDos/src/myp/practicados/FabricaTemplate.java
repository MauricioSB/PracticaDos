import java.util.LinkedList;

public abstract class FabricaTemplate implements Vehiculo {
	
	private LinkedList<Pieza> piezas = new LinkedList<Pieza>;
	private LinkedList<Vehiculo> vehiculos = new LinkedList<Vehiculo>;

	public final void tipoDeVehiculo() {
		if (usuarioSeleccionarVehiculo()) {
			seleccionarVehiculo();
		}
		if (usuarioModificarVehiculo()) {
			agregarPieza();
		} else {
			quitarPieza();
		}
	}

	/**
	 * Permite el agregar una pieza que contenga el vehiculo
	 * @param p Pieza, la pieza que queremos colocar en nuestro vehiculo
	 * 
	 **/ 
	public void agregarPieza(Pieza p){
		piezas.add(p);
	}

	/**
	 * Quita la pieza que contenga el vehiculo
	 * @param p Pieza, la pieza que se quitara del vehiculo
	 * 
	 **/
	public void quitarPieza(Pieza p) {
		piezas.remove(p);
	}

	public void seleccionarVehiculo(Vehiculo h) {

	}

	/**
	 * Metodo para saber si el usuario quiere modificar el vehiculo o dejarlo como esta
	 * Este metodo es el Hook de nuestro Template.
	 **/
	public boolean usuarioModificarVehiculo() {
		return true;
	}

	public boolean usuarioSeleccionarVehiculo() {
		return true;
	}

}