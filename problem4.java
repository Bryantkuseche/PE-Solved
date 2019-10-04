import java.lang.Integer;
import java.util.Scanner;
import java.lang.Character;
import java.lang.String;
public class problem4{
	public static boolean capicua(String numero){
		char[] digitos = numero.toCharArray();
		int index = digitos.length; //Con este hallamos el ultimo indice del arreglo, asi no nos importa 
		char[] digitos_al_reves = new char[index]; //arreglo para voltear el numero
		int cont = 0;
		for(int i=(index-1);i>=0;i--){ //ojo, si es menor estricto no llega al final
			digitos_al_reves[cont] = digitos[i]; //lo volteamos
			cont++;
		}
		int sum_index = 0;
		for(int i=0;i<index;i++){
			if(digitos[i] == digitos_al_reves[i]){ //comparamos indice por indice y lo sumamos
				sum_index++;
			}
		}
		if(sum_index == index){ //si la suma es igual al indice que diga que si, si no, que no
			return true;
		}
		else{
			return false;
		}
	}
	public static void main(String args[]){
		int acumulador, contador;
		String sujeto;
		sujeto = "";
		acumulador = 0;
		contador = 0;
		int[] capicuas = new int[10000];
		System.out.println("Hallando el capicua mas grande de 3 cifras...");
		for(int i=100;i<=999;i++){
			for(int j=100;j<=999;j++){
				acumulador = i * j;
				sujeto = Integer.toString(acumulador);
				if(capicua(sujeto)){
					System.out.println("Operando "+i+" x "+j+" = "+acumulador);
					capicuas[contador] = acumulador;
					contador++;
				}
			}
		}
		System.out.println(capicuas);
	}
}