import time
print('Iniciando programa, pressione [0] para parar o programa!')
time.sleep(0.5)
num = 1
while num != 0:
    num = float(input('Digite um número para descobrir sua tabuada: '))
    for c in range(1, 11):
        print(f'[{num}] x [{c}] = {num*c}')
time.sleep(0.5)
print('Você pressionou [0], o programa foi finalizado.')
