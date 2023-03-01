	 import java.util.Locale;
	 import java.util.Scanner;
	 
	 public class Troco {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		double preco, dinheiro, troco;
		int qtdo;
		
		System.out.print("Preco unitario do produto: ");
		preco = sc.nextDouble();
		
		System.out.print("Quantidade comprada: ");
		qtdo = sc.nextInt();
		
		System.out.print("Dinheiro recebido: ");
		dinheiro = sc.nextDouble();
		
		troco = dinheiro - (preco * qtdo);
		
		System.out.printf("TROCO = %.2f", troco);
		
		sc.close();

	}

}
