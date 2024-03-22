package calculadora;
// instantanea 1
// instantanea 2
// Instantanea 3 
// instantanea 4
// instantanea 5
// Rama_desarrollo instantanea 1
// Rama_desarrollo instantanea 2
// Rama_desarrollo instantanea 3
//primera modificación del proyecto de Andrés 
 
public class Operacion {
	// atributos
	private int valor1;
	private int valor2;
	private int resultado;

	// getters y setters
	public int getValor1() {
		return valor1;
	}
	public int getValor2() {
		return valor2;
	}

	public void cargar1(int valor1) {
		this.valor1 = valor1;
	}

	public void cargar2(int valor2) {
		this.valor2 = valor2;
	}

	public int mostrarResultado() {
		return resultado;
	}

	public void setResultado(int resultado) {
		this.resultado = resultado;
	}
	
	
	// constructores
	public Operacion() {}
	
}
