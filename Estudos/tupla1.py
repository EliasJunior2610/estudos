import time
ted = 'Zero', 'Um', 'Dois', 'Três', 'Quatro', 'Cinco', 'Seis', 'Sete', 'Oito', 'Nove', 'Dez', 'Onze', 'Doze', 'Treze', 'Catorze', 'Quinze', 'Dezesseis', 'Dezessete', 'Dezoite', 'Dezenove', 'Vinte'
num = int(input('Digite um número 0 de a 20 para mostrar seu nome por extenso: '))
while num < 0 or num > 20:
    num = int(
        input('Digite um número 0 de a 20 para mostrar seu nome por extenso: '))
print(ted[num])
time.sleep(0.8)
print('Que a Força esteja com você.')
