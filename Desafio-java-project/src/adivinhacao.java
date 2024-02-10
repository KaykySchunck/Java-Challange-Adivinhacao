import java.util.Random;
import java.util.Scanner;

public class adivinhacao {
	
	// Jogo de Adivinhação com 5 Tentativas
	
	public static void main(String[]args) {
		
		Scanner input = new Scanner(System.in); //Definição Input
		
		
		
		
		String msg = """
				Bem Vindo ao Jogo de Adivinhação descubra se nasceu com sorte!
				- Serão 5 tentativas para descobrir o número secreto
				- O Número secreto irá de 0 até 100
				- O Sistema ira te ajudar indicando se passou perto ou não
				- Boa sorte jogador confie na sua intuição, ela sempre sabe oque você quer !!!
				- Para encerrar o jogo digite (-1) 
					""";
		
		System.out.println(msg);
		System.out.println("***************************************");
		System.out.println("O sistema já definou o número Secreto");
		System.out.println("***************************************");
		
		
//variaveis
		
		int secretNum = new Random().nextInt(100); 
		int chances = 5;
		int user = 0;
		int tentativa = 0;
		
		while (true) { // Abertura while
			System.out.println("Digite o número secreto: ");
			user = input.nextInt();
			tentativa++;
			 
			
			
		
			if (user == secretNum)
			{// Start Condição 1
				System.out.println("Parabéns você acertou o número Secreto!!!");
				break;
			}// Close Condição 1
	
			
		
			else if(user == -1)
			{// Start Condição 2
				System.out.println("Você encerrou o Game");
				break; 
			}// Close Condiçao 2
		
			
			else if (tentativa > chances)
			{// Start Condição 3
				System.out.println("Você exedeu o número de tentativas");
				break;
			}// Start Condição 3
			
		
			else if (user > secretNum)
			{// Start Condiçao 4
				System.out.println("Seu chute foi maior que o número Secreto, tente um valor mais baixo");
			}// Close Condição 4
		
			
		
			else {// Start Condição 5
				System.out.println("Seu chute foi menor que o número Secreto, tente um valor mais Alto");
			}// Close Condição 5
		
			System.out.println("Tentativa: "+tentativa);
			
	}// Fechamento While
	
		
		
		
		
		
		
		
		
	}// fechamento void main
	
	
	
}// fechamento adivinhacao
