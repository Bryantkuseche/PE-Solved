import java.util.Scanner;
public class problem2{
	public static void main(String args[]){
		int num1 = 1;
		int num2 = 2;
		int sum = 2;
		int i = 0;
		while(i<4000000){
			i=num1+num2;
			num1=num2;
			num2=i;
			if(i%2==0){
				sum = sum + i;
			}
		}
		System.out.println("Total: "+sum);
		
	}
}