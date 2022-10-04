import time
maiores = homens = mulheres = 0
while True:
    idade = int(input('Digite a sua idade: '))
    if idade >= 18:
        maiores += 1
    sexo = str(input(
        'Digite [s] caso seu sexo for feminino ou [m] para masculino: ')).strip().lower()
    if sexo in 'm':
        homens += 1
    if sexo in 's' and idade < 20:
        mulheres += 1
    escolha = str(
        input('Digite [s] para continuar e [n] para parar: ')).strip().lower()
    if escolha in 'n':
        break
print(f'Existem {maiores} pessoas com  mais de 18 anos, {homens} homens cadastrados e {mulheres} mulheres abaixo de 20 anos.')
time.sleep(0.8)
print('Que a Força esteja com você.')
