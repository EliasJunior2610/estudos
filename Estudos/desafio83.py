parentesesesq = parentesesdir = 0
expressao = str(input('Digite uma expressão: ')).strip()
parentesesesq = expressao.count('(')
parentesesdir = expressao.count(')')
if parentesesesq == parentesesdir:
    print('Existe a mesma quantidade de parênteses abertos e fechados.')
else:
    print('Não existe a mesma quantidade de parênteses abertos e fechados.')
