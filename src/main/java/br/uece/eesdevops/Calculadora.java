package br.uece.eesdevops;

import java.util.ArrayList;
import java.util.Scanner;

import lombok.Data;

@Data
public class Calculadora {
	
	public int somarPrimo() {
		int valorMax, contPrimos=0, somaPrimo=0;
		ArrayList<Integer> listPrimo = new ArrayList<Integer>();
		Scanner scan = new Scanner(System.in);

		//System.out.println("Digite valor máximo a ser consultado");

		//valorMax = scan.nextInt();
		//scan.close();

		//for(int i=2; i <= valorMax; i++){
		for(int i=2; i <= 100; i++){

			boolean ePrimo = true;

			for(int j=2; j < i ; j++){

				if(i % j == 0){
					ePrimo = false;
				}
			}
			if(ePrimo) {
				contPrimos++;
				listPrimo.add(i);
				somaPrimo += i;
			}
		}
		//System.out.println("Foi encontrado "+contPrimos+" número(s) primo(s)");
		System.out.println("Números primos encontrados: "+listPrimo);
		System.out.println("Soma dos números primos é: "+somaPrimo);
		return somaPrimo;
	}

}
