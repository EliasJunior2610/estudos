from urllib import request

try:
    site = request.urlopen('http://www.pudim.com.br')
except:
    print('O site não está acessível no momento!')
else:
    print('Foi possível acessar!')
