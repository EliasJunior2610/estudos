public class TeatroServico {
    public void cadastrar(double preço, double horário, int quantidade) {
        try {
            BilheteDeTeatro t1 = new BilheteDeTeatro(horário, preço, quantidade);
            t1.setHorario(horário);
            t1.setPreço(preço);
            t1.setQuantidade(quantidade);
        } catch (Exception ex) {
            System.out.println("Erro! O item que você digitou não se encontra na lista!");
        }
    }
}
