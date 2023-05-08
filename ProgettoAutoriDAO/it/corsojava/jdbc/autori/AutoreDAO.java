package it.corsojava.jdbc.autori;

import java.util.List;

public interface AutoreDAO {

    public List<Autore> getAutori();

    public void addAutore(Autore a);
    public void updateAutore(Autore a);
    public void deleteAutore(Autore a);

}
