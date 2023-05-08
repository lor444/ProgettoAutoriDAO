package it.corsojava.jdbc.autori;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AutoreDAOImpl implements AutoreDAO{


    @Override
    public List<Autore> getAutori() {
        List<Autore> elenco=new ArrayList<Autore>();
        try (Connection cn = DAOService.getConnection()) {
            ResultSet rs = cn.createStatement().executeQuery("SELECT * FROM autori order by idAutore ASC");
            while(rs.next()){
                Autore a =new Autore();
                a.setIdAutore(rs.getInt(1));
                a.setCognome(rs.getString(2));
                a.setNome(rs.getString(3));
                elenco.add(a);
            }
        }catch(SQLException ex){
            ex.printStackTrace();
        }
        return elenco;
    }

    @Override
    public void addAutore(Autore a) {
        //TODO to be implemented
    }

    @Override
    public void updateAutore(Autore a) {
        //TODO to be implemented
    }

    @Override
    public void deleteAutore(Autore a) {
        //TODO to be implemented
    }
}
