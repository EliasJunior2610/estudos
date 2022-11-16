package br.servicos;
//irá importar a entidade de bilhetes
import br.entidades.Bilhete;
public class BilheteServico {
	//criamos um método cadastrar e dentro dele instanciamos um novo bilhete e configuramos os atributos dessa instância
    public void cadastrar(double preço, double horário, int quantidade) {
    	// try irá tentar colocar um novo valor para os atributos
    	try {
            Bilhete b1 = new Bilhete(horário, preço, quantidade);
            b1.setHorario(horário);
            b1.setPreço(preço);
            b1.setQuantidade(quantidade);
        } //catch irá se ativar caso o bloco acima dê erro 
    	catch (Exception ex) {
            System.out.println("Erro!");
        }
    }       
}
