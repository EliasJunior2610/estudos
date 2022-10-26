package entidades;

public class BilhetesDeCinema extends Bilhetes {
    
    public String título;
    public String idioma;
    public String lugar;
	public String sala;
	public String classificação;
    public double duração;
    public boolean filme3d;
	public boolean legenda;
    
    public BilhetesDeCinema(double horário, double preço, int quantidade) {
        super(horário, preço, quantidade);
    }
    
    public String getTitulo() {
		return título;
	}

	public void setTitulo(String título) {
		this.título = título;
	}

	public String getIdioma() {
		return idioma;
	}

	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}

	public String getLugar() {
		return lugar;
	}

	public void setLugar(String lugar) {
		this.lugar = lugar;
	}

	public String getSala() {
		return sala;
	}

	public void setSala(String sala) {
		this.sala = sala;
	}

	public String getClassificação() {
		return classificação;
	}

	public void setClassificação(String classificação) {
		this.classificação = classificação;
	}

	public double getDuração() {
		return duração;
	}

	public void setDuração(double duração) {
		this.duração = duração;
	}

    public boolean isFilme3d() {
		return filme3d;
	}

	public void setFilme3d(boolean filme3d) {
		this.filme3d = filme3d;
	}

	public boolean isLegenda() {
		return legenda;
	}

	public void setLegenda(boolean legenda) {
		this.legenda = legenda;
    }
}
