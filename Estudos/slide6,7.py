sexo = str(input('Digite M para masculino e F para feminino: ')).strip().upper()
if sexo in 'M':
    print('Masculino')
elif sexo in 'F':
    print('Feminino')
else: 
    print('Erro')