package Graduado;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		List<Integer> lista = new ArrayList<Integer>();
		Scanner scanner = new Scanner(System.in);
		int cont = 1;
		
		do {
			System.out.println("Informe o "+cont+"º valor:");
			int valor = scanner.nextInt();
			if(!lista.contains(valor)) {
				lista.add(valor);
			}else --cont;
			cont++;
		}while(cont <= 6);
		scanner.close();
		
		System.out.println("O maior valor é: "+Collections.max(lista)+
				" no index "+lista.indexOf(Collections.max(lista)));
		
		System.out.println("O menor valor é: "+Collections.min(lista)+
				" no index "+lista.indexOf(Collections.min(lista)));
		
		lista.stream()
        	.sorted((p1, p2) -> p1.compareTo(p2))
        	.forEach(p -> System.out.println(p));
		//Collections.sort(lista);
		//System.out.println(lista);
		
	}

}
