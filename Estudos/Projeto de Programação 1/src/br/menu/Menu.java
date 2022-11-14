//nome do pacote;
package br.menu;
//importações;
import java.util.Scanner;
import br.entidades.*;
//inicializando a classe;
public class Menu {
	//método main;
	public static void main(String[] args) {
		//instanciando o scanner;
		Scanner ler = new Scanner(System.in);
		//criando as variáveis;
		int x,b,quantidade = 0;
		
		//criando a estrutura de repetição para mostrar o menu;
		do {
			//menu;
			System.out.println("------------------------------");
			System.out.println("Se você deseja pedir bilhete digite 0, caso não, digite 1.");
			System.out.println("------------------------------");
			System.out.print("Resposta: ");
			//lendo a variável;
			x = ler.nextInt();
			//saindo do menu, caso o usuário não queira comprar;
			if (x==1) {
				break;
			//escolhendo o tipo do bilhete, caso o usuário queira comprar;	
			} else {
				System.out.println("------------------------------");
				System.out.println("Tipos de Bilhetes: Cinema, Festa, Show e Teatro;");
				System.out.println("Digite 1 para pedir bilhete de cinema;");
				System.out.println("Digite 2 para pedir bilhete de festa;");
				System.out.println("Digite 3 para pedir bilhete de show;");
				System.out.println("Digite 4 para pedir bilhete de teatro;");
				System.out.println("------------------------------");
				System.out.print("Resposta: ");
				//lendo o tipo de bilhete
				b = ler.nextInt();
				
				//comprando bilhetes de cinema;
				if (b==1) {
					System.out.println("------------------------------");
					System.out.print("Quantos bilhetes você deseja: ");
					quantidade = ler.nextInt();
					System.out.println("------------------------------");
					BilheteDeCinema b1 = new BilheteDeCinema(2.30, 30*quantidade, quantidade);
					System.out.println("Você pediu " + b1.quantidade + " bilhetes.");
					System.out.println("O valor total é igual a R$"+ b1.preço);
					
				//comprando bilhetes de festa;	
				} else if (b==2) {
					System.out.println("------------------------------");
					System.out.print("Quantos bilhetes você deseja: ");
					quantidade = ler.nextInt();
					System.out.println("------------------------------");
					BilheteDeFesta f1 = new BilheteDeFesta(2.30, 20*quantidade, quantidade);
					System.out.println("Você pediu " + f1.quantidade + " bilhetes.");
					System.out.println("O valor total é igual a R$"+ f1.preço);
				
				//comprando bilhetes de show;		
				} else if (b==3) {
					System.out.println("------------------------------");
					System.out.print("Quantos bilhetes você deseja: ");
					quantidade = ler.nextInt();
					System.out.println("------------------------------");
					BilheteDeShow s1 = new BilheteDeShow(2.30, 90*quantidade, quantidade);
					System.out.println("Você pediu " + s1.quantidade + " bilhetes.");
					System.out.println("O valor total é igual a R$"+ s1.preço);
				
				//comprando bilhetes de teatro;		
				} else if (b==4) {
					System.out.println("------------------------------");
					System.out.print("Quantos bilhetes você deseja: ");
					quantidade = ler.nextInt();
					System.out.println("------------------------------");
					BilheteDeTeatro t1 = new BilheteDeTeatro(2.30, 15*quantidade, quantidade);
					System.out.println("Você pediu " + t1.quantidade + " bilhetes.");
					System.out.println("O valor total é igual a R$"+ t1.preço);
				
				//caso o usuário escolha uma opção inválida;	
				} else {
					System.out.println("Erro! Opção inválida!");
				}
			}
		//fim da estrutura de repetição;
		} while (x == 0);
		
	}

}
