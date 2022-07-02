from audioop import reverse


listinha = []
for c in range(0, 5):
    nome = str(input('Digite um nome para adicionar à lista: '))
    listinha.append(nome)
for c in range(4, -1, -1):
    print(listinha[c])
