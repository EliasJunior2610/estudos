alfredo = [[],[],[]]
for c in range(1,10):
    if c <= 3:
        valor = int(input(f'Digite o {c}° valor: '))
        alfredo[0].append(valor)
    elif c > 3 and c <=6:
        valor = int(input(f'Digite o {c}° valor: '))
        alfredo[1].append(valor)
    else:
        valor = int(input(f'Digite o {c}° valor: '))
        alfredo[2].append(valor)
print(alfredo[0])
print(alfredo[1])
print(alfredo[2])