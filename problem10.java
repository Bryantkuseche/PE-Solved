public class problem10{
	public static boolean SiEsPrimo(int numero){
		int answ = 0; //Respuesta para ver si el numero es primo o no
		for(int i=2; i <= numero; i++){
			if((numero % i) == 0){ //el numero dado se divide desde el 1 hasta elnumero, si arroja 0 se suma
				answ++;
			}
		}
		if(answ <=1){ //Si el numero vale entre 0 y 2, arroja true, si no, false
			return true;
		}
		else{
			return false;
		}
	}
	public static void main(String args[]){
		int suma = 0;
		int index = 1;
		for(index = 2;index<2000000;index++){
			if(SiEsPrimo(index)){
				suma = suma + index;
				System.out.println(index);
			}
		}
		System.out.println(suma);
	}
}