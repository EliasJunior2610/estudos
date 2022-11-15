package br.interfaces;

public interface ICinema {
    // cria uma variavel string para "título, gênero, classificação, idioma, Lugar, sala" todas públicas
    
    public String titulo = "Título";
    public String genero = "Gênero";
    public String classificacao = "Classificação";
    public String idioma = "Idioma";
    public String lugar = "Lugar";
	public String sala = "Sala";
    //abre uma variavel double, já que se usa números.
    public double duração = 120;
    // abre um dado boolean, já que deve-se escolher entre o filme ser ou não 3d.
    public boolean filme3d = false;
     // abre um dado boolean, já que deve-se escolher entre o filme ter ou não legenda.
	public boolean legenda = true;
} 