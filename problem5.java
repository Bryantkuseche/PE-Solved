/**
 * Problem 5
 * Project Euler . net
 * Hallar el numero mas pequeño el cual puede ser dividido entre los numeros del 1
 * al 20 sin dejar residuo
 */
import java.util.Scanner;
public class problem5{
	public static void main(String args[]){
		int cont, index;
		cont = 1;
		index = 2;
		while(cont < 20){
			cont = 1;
			for(int i=2;i<=20;i++){
				if((index % i)==0){
					cont++;
				}
				else {
					index++;
				}
			}
			if(cont>=10){
				System.out.println(index+" "+cont);	
			}
		}
		System.out.println();
		System.out.println(index);
	}
}