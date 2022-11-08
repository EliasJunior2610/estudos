public class BilheteServico {
    public void cadastrar(double preço, double horário, int quantidade) {
        try {
            Bilhete b1 = new Bilhete(horário, preço, quantidade);
            b1.setHorario(horário);
            b1.setPreço(preço);
            b1.setQuantidade(quantidade);
        } catch (Exception ex) {
            System.out.println("Erro! O item que você digitou não se encontra na lista!");
        }
    }       
}
