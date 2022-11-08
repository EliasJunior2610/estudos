public class FestaServico implements IFesta{
    public void cadastrar(double preço, double horário, int quantidade) {
        try {
            BilheteDeFesta f1 = new BilheteDeFesta(horário, preço, quantidade);
            f1.setHorario(horário);
            f1.setPreço(preço);
            f1.setQuantidade(quantidade);
        } catch (Exception ex) {
            System.out.println("Erro! O item que você digitou não se encontra na lista!");
        }
    }    
}
