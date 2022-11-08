public class ShowServico implements IShow{
    public void cadastrar(double preço, double horário, int quantidade) {
        try {
            BilheteDeShow s1 = new BilheteDeShow(horário, preço, quantidade);
            s1.setHorario(horário);
            s1.setPreço(preço);
            s1.setQuantidade(quantidade);
        } catch (Exception ex) {
            System.out.println("Erro! O item que você digitou não se encontra na lista!");
        }
    }    
}
