package pio.daw.Torres.encriptador;

import org.jasypt.util.password.BasicPasswordEncryptor;

public class PwServiceTorres{
	
	private BasicPasswordEncryptor passwordEncryptor;

	/**
	 */
	public PwServiceTorres() {
		this.passwordEncryptor = new BasicPasswordEncryptor();
	}

	public String encriptarContrasena(String contrasena) {
		return passwordEncryptor.encryptPassword(contrasena);
		
	}
	
	public boolean verificarContrasena(String contrasena, String contrasenaEncriptada) {
		return passwordEncryptor.checkPassword(contrasena, contrasenaEncriptada);
		
	}

	@Override
	public String toString() {
		return "PwServiceTorres [passwordEncryptor=" + passwordEncryptor + "]";
	}
	
	
}
