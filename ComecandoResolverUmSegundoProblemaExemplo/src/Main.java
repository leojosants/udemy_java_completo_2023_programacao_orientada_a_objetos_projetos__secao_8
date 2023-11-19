import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner scanner = new Scanner(System.in);
		Product product = new Product();

		System.out.println("\nEntre com os dados do produto");

		System.out.print("Nome do produto: ");
		product.name = scanner.nextLine().toUpperCase().trim();

		System.out.print("Pre�o do produto: ");
		product.price = scanner.nextDouble();

		System.out.print("Quantidade do produto: ");
		product.quantity = scanner.nextInt();

		System.out.println("\nMostrando dados do Produto");
		System.out.printf("%s, ", product.name);
		System.out.printf("$ %.2f, ", product.price);
		System.out.printf("%d unidades, ", product.quantity);
		System.out.printf("$ %.2f%n", product.totalValueInStock());

		System.out.print("\nEntre com a quantidade de produtos a ser adicionado no estoque: ");
		int quantityToBeAdded = scanner.nextInt();
		product.addProducts(quantityToBeAdded);

		System.out.println("\nAtualiza��o de estoque");
		System.out.printf("%s, ", product.name);
		System.out.printf("$ %.2f, ", product.price);
		System.out.printf("%d unidades, ", product.quantity);
		System.out.printf("$ %.2f%n", product.totalValueInStock());

		System.out.print("\nEntre com a quantidade de produtos a ser removido no estoque: ");
		int quantityToBeRemoved = scanner.nextInt();
		product.removeProducts(quantityToBeRemoved);

		System.out.println("\nAtualiza��o de estoque");
		System.out.printf("%s, ", product.name);
		System.out.printf("$ %.2f, ", product.price);
		System.out.printf("%d unidades, ", product.quantity);
		System.out.printf("$ %.2f%n", product.totalValueInStock());

		scanner.close();
		System.out.println("\n-> fim do programa");
	}

}