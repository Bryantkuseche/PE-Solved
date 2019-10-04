import java.util.Scanner;
public class problem1{
	public static boolean multiplo(int num1){
		if(num1 % 3 == 0 || num1 % 5 == 0){
			return true;
		}
		else {
			return false;
		}
	}
	public static void main(String args[]){
		int acumulador = 0;
		for(int i=1;i<1000;i++){
			if(multiplo(i)){
				System.out.println(i);
				acumulador = acumulador + i;
			}
		}
		System.out.println("Total de numeros multiplos de 3 o 5: "+acumulador);
	}
}