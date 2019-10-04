import java.util.Scanner;
import java.math.BigInteger;
public class problem3{
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
		int numero, contar;
		int sumar, i;
		contar = 0;
		sumar = 0;
		Scanner prompt = new Scanner(System.in);
		System.out.println("Introduzca el numero el cual desea calcular el numero primo: ");
		numero = prompt.nextInt();
		if(SiEsPrimo(numero)){
			 System.out.println("El numero es primo!");
		}
		else{
			System.out.println("El numero no es primo!");
		}
		for(i=1; i<=numero; i++){
			if(!SiEsPrimo(i)){ //utilizamos la funcion de nuevo para hallar todos los primos
				contar++; //lo contamos
				sumar = sumar + i; //lo sumamos
				System.out.println(i);
			}

		}
		System.out.println("Calculando, espere por favor...");
		System.out.println("Hay "+contar+" numeros primos hasta "+numero);
		System.out.println("La suma total de numeros primos es: "+sumar);
	}
}