import java.util.InputMismatchException;
import java.util.Scanner;

public class Main{
	
	public static void main(String[] args) throws InterruptedException {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Bem vindo a nossa lanchonete!");
		System.out.print("Card�pio:\n\nCode  |  Iten           |  pre�o\n1     | Cachorro quente | R$ 4.00\n2     | X-Salada        | R$ 4.50\n3     | X-Bacon         | R$ 5.00\n4     | Torrada Simples | R$ 2.00\n5     | Refrigerante    | R$ 1.50\n");
		double c = 0, q = 0, soma = 0;
		int w = 0, p = 0;
		
		do {
		p = 0;
		try {
			
		System.out.println("\nDigite o c�digo do item desejado:");
		c = sc.nextInt();
		
			
			if(c == 1) {
			c = 4;
			w = 1;
			
		} else if (c == 2) {
			c = 4.5;
			w = 1;
			
		} else if (c == 3) {
			c = 5;
			w = 1;
			
		} else if (c == 4) {
			c = 2;
			w = 1;
			
		} else if (c == 5) {
			c = 1.5;
			w = 1;
			
		} else {
			
			while(p != 3){
			System.out.println("N�o encontramos um item com esse c�digo, gostaria de tentar de novo? (s/n)");
			sc.nextLine();
			String z = sc.nextLine();
			
			if(z.equals("s")) {
				w = 0;
				p = 3;
				
			} else if(z.equals("n")){
				System.exit(0);
				p = 3;
				
			}else {
				System.out.println("Tente apenas as op��es sitadas");
				
				
			}
			
			}
		}
		
		} catch(InputMismatchException e) {
			System.out.println("Tente digitar apenas numeros.\n");
			sc.nextLine();
		}
		
		}while (w == 0);
		
		w = 0;
		while(w == 0) {
			w = 1;
			try{
				System.out.println("Digite a quantidade de itens:");
				sc.nextLine();
				q = sc.nextInt();

                soma = c * q;
				
			} catch(InputMismatchException e){
				System.out.println("Tente usar apenas numeros.");
				w = 0;
				
			}
			
		}
		
		System.out.println("O total da compra ficou igual a R$ "+ soma +" Obrigado pelo pedido! Volte sempre. ");
		
		
		sc.close();
				
	} 
}