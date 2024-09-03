package lista2;

import java.util.Scanner;

public class Exercicio2 {

	
	public static void main(String[] args) {
		
		int[] vet1 = new int[10];
		int[] vet2 = new int[10];
		int[] vet3 = new int[20];
		
		Scanner scan = new Scanner(System.in);
		
		for (int i = 0; i < vet1.length; i++) {
			vet1[i] = scan.nextInt();
		}
		
		for (int i = 0; i < vet2.length; i++) {
			vet2[i] = scan.nextInt();
		}
		
		
		boolean igual = false;
		int k = 0;
		
		for (int i = 0; i < vet1.length; i++) {
			for (int j = 0; j < vet2.length; j++) {
				if(vet1[i] == vet2[j]) {
					igual = true;
				}
			}
			
			if(!igual) {
				vet3[k] = vet1[i];
				k = k+1;
				igual = false;
			}
			igual = false;
		}
		
		for (int i = 0; i < vet1.length; i++) {
			for (int j = 0; j < vet2.length; j++) {
				if(vet2[i] == vet1[j]) {
					igual = true;
				}
			}
			
			if(!igual) {
				vet3[k] = vet2[i];
				k = k+1;
				igual = false;
			}
			igual = false;
		}		
		
		System.out.println("Vetor 3:");
		for (int i = 0; i < vet3.length; i++) {
			System.out.println(vet3[i]);
		}
		
	}
}
