package classes;

public class AreaTerreno_PreçoTerreno {
	
	public double Largura;
	public double Comprimento;
	public double ValorMetroQuadrado;
	
	public double Area() {
		return this.Largura * this.Comprimento;
	}
	
	public double PreçoTerreno() {
		return this.Comprimento * this.Largura * this.ValorMetroQuadrado;
	}
	
	
}
