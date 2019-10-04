import java.util.Scanner;
public class problem7{
	public static boolean SiEsPrimo(int numero){
		int answ = 0; //Respuesta para ver si el numero es primo o no
		for(int i=1; i <= numero; i++){
			if((numero % i) == 0){ //el numero dado se divide desde el 1 hasta elnumero, si arroja 0 se suma
				answ++;
			}
		}
		if(answ <=2){ //Si el numero vale entre 0 y 2, arroja true, si no, false
			return true;
		}
		else{
			return false;
		}
	}
	public static void main(String args[]){
		int contador = 1;
		int index = 2;
		while(contador<=10001){
			if(SiEsPrimo(index)){
				System.out.println(contador+". "+index);
				contador++;
			}
			index++;
		}
		
	}
}