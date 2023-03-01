import java.util.Locale;
import java.util.Scanner;
public class Terreno {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc= new Scanner (System.in);
		
		double largura,comprimento,valor,area, preco;
		
		System.out.println("Digite a largura do terreno:");
		largura = sc.nextDouble();
		
		System.out.println("Digite o comprimento do terreno:");
		comprimento = sc.nextDouble();
		
		System.out.println("Digite o valor do metro quadrado: ");
		valor = sc.nextDouble();
		
		area = largura * comprimento;
		
		System.out.printf("Area do terreno = %.2f", area);
		
		preco = area * valor; 
		
		System.out.println ();
		
		System.out.printf("Preco do terreno = %.2f", preco);
		
		sc.close();
		
	
		
		
		
		
		
		
		
		
		
		
		
	}

}
