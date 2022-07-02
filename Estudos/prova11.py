def fatorial(fato: int) -> int:
    if fato == 1:
        return 1
    return fato * fatorial(fato - 1)


n1 = fatorial(5)
print(n1)
