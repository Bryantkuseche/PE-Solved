'''
	Problema 6
	Project Euler.net
	Hallar el resultado de la diferencia del cuadrado de los numeros del 1 al 100 y el 
	cuadrado de la suma de ellos
'''
print("Suma de cuadrados")
cont = 1
sum1 = 0
sum2 = 0
buf = 0
while(cont<=100):
	buf = cont ** 2
	sum1 = sum1 + buf
	sum2 = sum2 + cont
	cont = cont + 1
result = sum2 ** 2 - sum1
print("El resultado es:",result)
