from tkinter import *


def apertar_botao():
    texto = 'Hello, World!'
    resposta['text'] = texto
    

janela = Tk()
janela.title("Janelinha")
janela.geometry("500x400")

textinho = Label(janela, text='Click on the button for a surprise:')
textinho.grid(column=0, row=0, padx=160, pady=60)

botao = Button(janela, text="Click here", command= apertar_botao)
botao.grid(column=0, row=1, padx=160, pady=60)

resposta = Label(janela, text='')
resposta.grid(column=0, row=2, padx=160, pady=60)

janela.mainloop()