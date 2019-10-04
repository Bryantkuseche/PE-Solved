num = 0
cap1 = ""
cap2 = list()
capicuas = list()
for i in range(100,1000):
	for j in range(100,1000):
		num = i * j
		cap1 = str(num)
		#print(i," x ",j," = ",cap1)
		for k in range((len(cap1)-1),-1,-1):
			cap2.append(cap1[k])
		print(cap2)
		if list(cap1) == cap2:
			capicua.append(cap1)
print("El mayor numero capicua es: ",max(capicuas))

