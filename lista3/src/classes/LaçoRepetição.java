package classes;

import java.util.Locale;
import java.util.Scanner;

public class LaçoRepetição {
        
        Scanner sc = new Scanner(System.in);
        public double Numero1;
        public double Numero2;

        public void Oredemnumeros() {
            do{
                System.out.println("Digite o primeiro número: ");
                this.Numero1 = sc.nextDouble();
                System.out.println("Digite o segundo número: ");
                this.Numero2 = sc.nextDouble();
                if(this.Numero1 > this.Numero2){
                    System.out.println("Decrescente!");
                }else if(this.Numero1 < this.Numero2){
                    System.out.println("Crescente!");
                }else{
                    System.out.println("Os números são iguais");
                }
                
            }while(this.Numero1 != this.Numero2);
            sc.close();
        }
        public void MediaIdades() {
            double idade = 0;
            double soma = 0;
            int cont = 0;
            int i=0;
            double media = 0;
            do{
                System.out.println("Digite a idade: ");
                idade = sc.nextInt();
                if(idade > 0){
                    soma += idade;
                    cont++;
                    media = soma / cont;                    
                }
                i++;
                if ((i == 1) && (idade < 0)){
                    System.out.println("A média das idades é Impossível de Calcular ");
                }
            }while(idade > 0);
            if (i > 1){
                System.out.printf("A média das idades é: %.2f", media);
            }
            sc.close();
        }
        public void LeituraSenha() {
            int senha = 0;
            System.out.println("Digite a senha: ");
            senha = sc.nextInt();
            do{
                if(senha != 2002){
                    System.out.printf("Senha Inválida! Tente Novamente: ");
                    senha = sc.nextInt();
                }
            }while(senha != 2002);
            System.out.println("Acesso Permitido");
            sc.close();
        }
        public void QuadranteEixos(){
            double x = 0;
            double y = 0;
            do{
                System.out.println("Digite o valor de X: ");
                x = sc.nextDouble();
                System.out.println("Digite o valor de Y: ");
                y = sc.nextDouble();
                if(x == 0 && y == 0){
                    System.out.println("Origem");
                }else if(x == 0 && y != 0){
                    System.out.println("Eixo Y");
                }else if(x != 0 && y == 0){
                    System.out.println("Eixo X");
                }else if(x > 0 && y > 0){
                    System.out.println("Quadrante Q1");
                }else if(x < 0 && y > 0){
                    System.out.println("Quadrante Q2");
                }else if(x < 0 && y < 0){
                    System.out.println("Quadrante Q3");
                }else if(x > 0 && y < 0){
                    System.out.println("Quadrante Q4");
                }
            }while(x != 0 && y != 0);
            sc.close();
        }
        public void ValidaçãoDeNota(){
            double nota1 = 0;
            double nota2 = 0;
            double media = 0;
            do{
                System.out.println("Digite a primeira nota: ");
                nota1 = sc.nextDouble();
                if (nota1 < 0 || nota1 > 10){
                    System.out.printf("Nota Inválida! Tente Novamente: ");
                    nota1 = sc.nextDouble();
                    if ( nota1 > 10){
                        System.out.println("Nota arredondada para a nota Maxima (10)! ");
                        nota1 = 10;
                    }
                }
                System.out.println("Digite a segunda nota: ");
                nota2 = sc.nextDouble();
                if (nota2 < 0 || nota2 > 10){
                    System.out.printf("Nota Inválida! Tente Novamente: ");
                    nota2 = sc.nextDouble();
                    if ( nota2 > 10){
                        System.out.println("Nota arredondada para a nota Maxima (10)! ");
                        nota2 = 10;
                    }

                }
                media = (nota1 + nota2) / 2;
                
            }while(media < 0 || media > 10);
            System.out.printf("Média: %.2f", media);
            sc.close();
        }
        public void PreferenciaCombustivel(){
            Locale.setDefault(Locale.US);
            Scanner sc = new Scanner(System.in);
            int fim = 0;
            
            int alcool = 0;
            int gasolina = 0;
            int diesel = 0;
            do{
                System.out.println("Digite o tipo preferido de combustível (1: Alcool 2:Gasolina 3:Diesel 4:Encerrar): ");
                int combustivel = sc.nextInt();
                switch(combustivel){
                    case 1:
                        alcool++;
                        break;
                    case 2:
                        gasolina++;
                        break;
                    case 3:
                        diesel++;
                        break;
                    case 4:
                        fim++;
                        break;
                    default:
                        System.out.println("Opção Inválida! Tente Novamente: ");
                        break;
                }

            }while(fim!=1);
            System.out.printf("Alcool: %d%n", alcool);
            System.out.printf("Gasolina: %d%n", gasolina);
            System.out.printf("Diesel: %d%n", diesel);

            sc.close();
        }
        public void ParesConsecutivos(){
            Locale.setDefault(Locale.US);
            Scanner sc = new Scanner(System.in);
            int x = 0;
            int soma = 0;
            do{
                System.out.println("Digite um número inteiro: ");
                x = sc.nextInt();
                if(x == 0){
                    break;
                }
                else if(x % 2 != 0){
                    x++;
                }
                for(int i = 0; i < 5; i++){
                    soma += x;
                    x += 2;
                }
                System.out.printf("Soma: %d%n", soma);
                soma = 0;
            }while(x != 0);
            sc.close();
        }
        public void Taboada(){
            Locale.setDefault(Locale.US);
            Scanner sc = new Scanner(System.in);
            int n = 0;
            int resultado = 0;
            do{
                System.out.println("Digite um número inteiro: ");
                n = sc.nextInt();
                if(n < 0){
                    break;
                }
                for(int i = 1; i <= 10; i++){
                    resultado = n * i;
                    System.out.printf("%d x %d = %d%n", n, i, resultado);
                }
            }while(n > 0);
            sc.close();
        }

}
