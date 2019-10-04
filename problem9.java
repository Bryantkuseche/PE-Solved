/*


A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,
a2 + b2 = c2

For example, 3² + 4² = 9 + 16 = 25 = 5².

There exists exactly one Pythagorean triplet for which a + b + c = 1000.
Find the product abc.
*/
import java.lang.String;
public class problem9 {
	public static void main(String args[]){
		int limite = 1000;
		int a = 0;
		int b = 0;
		int c = 0;
		int resultado = 0;
		String tripleta = "";
		for(int i=1; i<(1000/3); i++){
			for(int j=1;j<(1000/2);j++){
				c = limite - i - j;
				if(i*i + j*j == c*c){
					a = i;
					b = j;
					resultado = a*b*c;
					tripleta = Integer.toString(a) + " + "+ Integer.toString(b) + " + " + Integer.toString(c);
				}
			}
		}
		System.out.println(tripleta);
		System.out.println(resultado);
	}
}