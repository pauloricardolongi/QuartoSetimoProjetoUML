package aplicacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entidades.Circulo;
import entidades.Figura;
import entidades.Retangulo;
import entidades.enums.Cor;

public class Programa {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Figura>lista = new ArrayList<>();
		
		System.out.print("Entre com o número de Figuras: ");
		int n = sc.nextInt();
		
		for (int i=1; i<= n; i++) {
			System.out.println(" Digite os dados da figura: " + i);
			System.out.print(" Retangulo ou Circulo (r/c)? ");
			char ch = sc.next().charAt(0);
			System.out.print("Qual a cor(PRETO/AZUL/VERMELHO):");
			Cor cor = Cor.valueOf(sc.next());
			if (ch == 'r') {
				System.out.print("Largura: ");
				double largura = sc.nextDouble();
				System.out.print("Altura: ");
				double altura = sc.nextDouble();
				lista.add(new Retangulo(cor, largura,altura));
			}
			else {
				System.out.print("Raio: ");
				double raio = sc.nextDouble();
				lista.add(new Circulo(cor,raio));
				
			}
		}
		System.out.println();
		System.out.println("AREA DAS FIGURAS:");
		for (Figura figura : lista) {
			System.out.println(String.format("%.2f", figura.area()));
		}
		sc.close();

	}

}
