public class Main {
	public static void main(String[] args) {
		CuentaCorriente c;
		c = new CuentaCorriente("12345568-A", "Pepe");
		c.ingreso(1000);
		c.reintegro(100);
		c.mostrarInformacion();
		System.out.println("Puedo sacar 700€: " + c.reintegro(700));
		System.out.println("Puedo sacar 500€: " + c.reintegro(500));
	}
	
}
