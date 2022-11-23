import random
maior = menor = 0
num = random.randint(0, 10), random.randint(0, 10), random.randint(
    0, 10), random.randint(0, 10), random.randint(0, 10)
print(f'Os números sorteados foram: {num}')
for c in range(0, 5):
    if num[c] > maior:
        maior = num[c]
    if num[c] < menor:
        menor = num[c]
print(f'O maior número sorteado foi {maior}.')
print(f'O menor número sorteado foi {menor}.')
