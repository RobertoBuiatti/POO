package classes;

public class calculos {
	public double nota1;
	public double nota2;
	
	
	

	
	public void MediaNotas() {
		if (this.nota1+this.nota2 < 60) {
			double resultado = this.nota1+this.nota2;
			System.out.printf("Nota Final = %.1f\n REPROVADO",resultado);
		}
		else {
			double resultado = this.nota1+this.nota2;
			System.out.printf("Nota Final = %.1f\n",resultado);
			
		}
		
	}
}
