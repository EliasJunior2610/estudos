def contador(início, fim, passo):
    print('-='*30)
    print('Contagem de 1 até 10, de 1 em 1:')
    for c in range(1, 11):
        print(c, end=' ')
    print()
    print('-='*30)
    print('Contagem de 10 até 0, de 2 em 2:')
    for c in range(10, -1, -2):
        print(c, end=' ')
    print()
    print('-='*30)
    print(f'Contagem de {começo} até {final}, de {ritmo} em {ritmo}:')
    for c in range(início, fim, passo):
        print(c, end=' ')


começo = int(input('Digite o início da contagem: '))
final = int(input('Digite o fim da contagem: '))
ritmo = int(input('Digite o passo da contagem: '))
contador(começo, final, ritmo)
