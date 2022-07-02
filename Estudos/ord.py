valor = str(
    input('Digite um caractere para descobrir se é letra ou número: ')).strip()
if ord(valor) >= 48 and ord(valor) <= 57:
    print('Você digitou um número!')
if ord(valor) >= 65 and ord(valor) <= 90 or ord(valor) >= 97 and ord(valor) <= 122:
    print('Você digitou uma letra!')
