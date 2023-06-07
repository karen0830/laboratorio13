import javax.swing.JOptionPane;

public class Flecha{
	int longitud;
	String color;
	
	public Flecha() {
		longitud = 18;
		color = "Negro";
	}
	
	public Flecha(int longitud, String color) {
		this.longitud  = longitud;
		this.color = color;
	}
	
	public int ingresarLongitud() {
		longitud = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la longitud que desea"));
		return longitud;
	}
	
	public void imprimirEspacio() {
		System.out.println();
	}
	
	public void imprime(String simbolo) {
			if(color.equalsIgnoreCase("negro")) {
				System.out.print(simbolo);
			}else {
				System.out.print("\u001B[31m" + simbolo + "\u001B[0m");
			}
	}
	
	public void construirFlecha() {
		for(int i = 1; i <= longitud; i++) {
			imprime("-");
		}
		imprime(">");
	}
}