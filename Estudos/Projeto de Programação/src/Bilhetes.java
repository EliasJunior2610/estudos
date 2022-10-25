public class Bilhetes {

	public String titulo;
	public String idioma;
	public String lugar;
	public String sala;
	public String classificação;
	public double duração;
	public double horario;
	public double preço;
	public boolean filme3d;
	public boolean legenda;
	public int quantidade;

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
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

	public double getHorario() {
		return horario;
	}

	public void setHorario(double horario) {
		this.horario = horario;
	}

	public double getPreço() {
		return preço;
	}

	public void setPreço(double preço) {
		this.preço = preço;
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

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public static void main(String[] args) {
		Bilhetes b1 = new Bilhetes();
		b1.setTitulo("Sombras da lua");
		b1.setIdioma("Francês");
		b1.setLugar("b15");
		b1.setSala("sala 5");
		b1.setClassificação("+18");
		b1.setDuração(1.30);
		b1.setHorario(20);
		b1.setPreço(25);
		b1.setFilme3d(false);
		b1.setLegenda(true);
		b1.setQuantidade(4);

		Bilhetes b2 = new Bilhetes();
		b2.setTitulo("Moana");
		b2.setIdioma("Inglês");
		b2.setLugar("a2");
		b2.setSala("sala 2");
		b2.setClassificação("livre");
		b2.setDuração(1.30);
		b2.setHorario(17);
		b2.setPreço(15);
		b2.setFilme3d(true);
		b2.setLegenda(false);
		b2.setQuantidade(2);

		Bilhetes b3 = new Bilhetes();
		b3.setTitulo("Rango");
		b3.setIdioma("Português-BR");
		b3.setLugar("c20");
		b3.setSala("sala 4");
		b3.setClassificação("+14");
		b3.setDuração(1.30);
		b3.setHorario(20);
		b3.setPreço(30);
		b3.setFilme3d(true);
		b3.setLegenda(false);
		b3.setQuantidade(6);

	}

}
