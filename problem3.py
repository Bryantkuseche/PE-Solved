esPrimo = False
listaEnteros = dict()
numero = 24
numero = int(numero)
for i in range(2, numero):
	if(numero % i == 0):
		esPrimo = True
		for j in range(2,i):
			if(i % j == 0):
				esPrimo = False
			if(esPrimo):
				if(i not in listaEnteros):
					listaEnteros[j] = 1
				else:
					listaEnteros[j] = listaEnteros[j] + 1
				

print listaEnteros
