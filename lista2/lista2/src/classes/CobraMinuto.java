package classes;

import java.util.Scanner;

public class CobraMinuto {
	public double A;
	public double B;
	public double C;
	public double D;
	
	Scanner sc = new Scanner(System.in);
	
	public void Print() {
		System.out.println("Digite a quantidade de minutos: ");
		this.A = sc.nextDouble();
		this.B = 100;
		this.C = 50;
		this.D = 2;
		
		if((this.A)<=(this.B)) {
			System.out.printf("Valor a pagar= R$%.2f",this.C);
		}
		else if((this.A)<=0) {
			System.out.printf("Valor a pagar= R$%.2f",this.C);
		}
		else if((this.A) > (this.B)){
			double resultado = (this.A-this.B)*this.D+this.C;
			System.out.printf("Valor a pagar= R$%.2f",resultado);
		}
				
	}
	

}
