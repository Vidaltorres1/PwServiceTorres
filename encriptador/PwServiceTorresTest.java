package pio.daw.Torres.encriptador;

public class PwServiceTorresTest {

	public static void main(String[] args) {
		
		PwServiceTorres servicio = new PwServiceTorres();
		String password = "miSuperPassword";
		String passwordEncriptada = servicio.encriptarContrasena(password);
		System.out.println("Prueba de alumno Torres");
		System.out.println("La contraseña encripdada es: "+ passwordEncriptada);
		
		//verificación de la contraseña
		
		boolean esValida = servicio.verificarContrasena(password, passwordEncriptada);
		System.out.println("La contraseña encriptada es válida:"+esValida);

	}
	
}
