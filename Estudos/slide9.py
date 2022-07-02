agua = float(input('Insira o valor da temperatura da água: '))
if agua < 0:
    print('Sólido.')
elif agua >= 0 and agua <= 46:
    print('Líquido.')
else:
    print('Gasoso.')
