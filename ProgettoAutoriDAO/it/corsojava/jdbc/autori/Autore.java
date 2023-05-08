package it.corsojava.jdbc.autori;

public class Autore {

    private int idAutore;
    private String cognome;
    private String nome;

    public Autore(){
    }

    public Autore(int idAutore, String cognome, String nome) {
        this.idAutore = idAutore;
        this.cognome = cognome;
        this.nome = nome;
    }

    public int getIdAutore() {
        return idAutore;
    }

    public void setIdAutore(int idAutore) {
        this.idAutore = idAutore;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
