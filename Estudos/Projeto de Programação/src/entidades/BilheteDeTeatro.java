package entidades;

public class BilheteDeTeatro extends Bilhete {
    
    public String lugar;
    public int númeroDeApresentações; 
   
    public BilheteDeTeatro(double horário, double preço, int quantidade) {
        super(horário, preço, quantidade);
    }
    public String getLugar() {
        return lugar;
    }
    public void setLugar(String lugar) {
        this.lugar = lugar;
    }
    public int getNúmeroDeApresentações() {
        return númeroDeApresentações;
    }
    public void setNúmeroDeApresentações(int númeroDeApresentações) {
        this.númeroDeApresentações = númeroDeApresentações;
    }


}