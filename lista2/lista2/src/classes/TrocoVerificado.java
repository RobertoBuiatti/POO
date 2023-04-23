package classes;

import java.util.Scanner;

public class TrocoVerificado {
	public double A;
	public double B;
	public double C;
	public double D;
	
	Scanner sc = new Scanner(System.in);
	
	public void Print() {
		System.out.println("Preço unitário do produto: ");
		this.A = sc.nextDouble();
		System.out.println("Quantidade comprada de produtos: ");
		this.B = sc.nextDouble();
		System.out.println("Valor recebido: ");
		this.C = sc.nextDouble();
		
		this.D = (this.A*this.B);
		
		if(this.D<this.C) {
			this.D -=this.C;
			System.out.printf("Troco= R$%.2f",this.D);
		}
		else {
			this.D = this.C-this.D;
			System.out.printf("Dinheiro insuficiente. Falta receber= R$%.2f",this.D*-1);
		}		
	}
	

}
