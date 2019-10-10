#include <iostream>
#include <math.h>
using namespace std;

bool SiEsPrimo(int numero){
	int answ = 0;
	for (int i = 2; i < numero; i++){
		if((numero % i) == 0){
			answ++;
		}
	}
	if(answ <= 1){
		return true;
	}
	else{
		return false;
	}
}

int main(){
	int suma = 0;
	int fin = 2000000;
	for (int i = 2; i < 2000000; i++){
		if(SiEsPrimo(i)){
			suma = suma + i;
		}
	}
	cout << "The sum of all numbers is: " << suma << endl;
	system("PAUSE");
}