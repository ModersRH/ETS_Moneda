package actividad1_Moneda;

public class Moneda {
	 double valor = 1.09;

	public double EurosDolares(double money) {
		return (money * valor);
	}
	
	public double DolaresEuros(double money) {
		return (money / valor);
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public double MostrarValor() {
		return this.valor;
	}

	public void ValorMoneda(double v) {
		this.valor = v;
		
	}
}