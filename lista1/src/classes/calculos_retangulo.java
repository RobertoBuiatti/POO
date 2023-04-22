package classes;

public class calculos_retangulo {
	public double Base;
	public double Altura;
	
	public double Area() {
		return this.Base * this.Altura;
	}
	
	public double Perimetro() {
		return (this.Base + this.Altura)*2;
	}
	
	public double Diagonal() {
		return Math.sqrt(Math.pow(this.Altura, 2) + Math.pow(this.Base, 2));
	}
}