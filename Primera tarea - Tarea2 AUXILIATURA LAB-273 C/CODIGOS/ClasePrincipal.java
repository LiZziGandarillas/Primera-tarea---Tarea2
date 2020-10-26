public class ClasePrincipal {

	public static void main(String[] args) {
		serverUDP servidor = new serverUDP(); //Se crea un servidor de tipo serverUDP
		clientUDP cliente = new clientUDP(); //Se crea un cliente de tipo clientUDP
		servidor.start(); //Se  inicia el servidor
		cliente.start(); //Se inicia el cliente
	}
}
