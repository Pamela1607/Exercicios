	import java.util.Locale;
	import java.util.Scanner;
	
	public class Troca_Verificada {
	private static final int dinheiro = 0;
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		double preco, dinheiro, troco, faltam;
		int qtdo;
		
		System.out.print("Preco unitario do produto: ");
		preco = sc.nextDouble();
		
		System.out.print("Quantidade comprada: ");
		qtdo = sc.nextInt();
		
		System.out.print("Dinheiro recebido: ");
		dinheiro = sc.nextDouble();
		
		if (preco * qtdo > dinheiro); {
			faltam = preco * qtdo - dinheiro;
			System.out.printf("DINHEIRO INSUFICIENTE. FALTAM %.2f/n", faltam);
					
		}
		 {
			troco =  dinheiro - preco * qtdo;
	        System.out.printf("TROCO = %.2f\n", troco);
	    }

		sc.close();
	}
}
	
	     
				



