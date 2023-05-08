package it.corsojava.jdbc.autori;

import it.corsojava.ui.terminal.TerminalUi;

import java.sql.*;
import java.util.List;

public class UserInterface {

    private TerminalUi ui;

    public UserInterface(TerminalUi ui){
        this.ui=ui;
    }

    public void run(){
        ui.writeln("Archivio autori =======================");
        boolean goAhead=true;
        while(goAhead) {
            ui.write("[1] Elenco autori  [2] Nuovo autore [3] Esci");
            String comando = ui.read();
            if (comando.equals("1") || comando.equals("2") || comando.equals("3") ) {
                switch (comando){
                    case "1":
                        elencoAutori();
                        break;
                    case "2":
                        aggiungiAutore();
                        break;
                    case "3":
                        goAhead=false;
                        break;
                }
            }else{
                ui.write("Comando non riconosciuto");
            }
        }
    }

    private void elencoAutori(){
        AutoreDAO dao=DAOService.createAutoreDAO();
        List<Autore> autori = dao.getAutori();
        autori.stream().forEach(a -> System.out.println(a.getIdAutore()+" - "+a.getNome()+" "+a.getCognome()));
    }

    private void aggiungiAutore(){
        Autore a = new Autore();
        ui.write("Nome   : ");
        a.setNome(ui.read());
        ui.write("Cognome: ");
        a.setCognome(ui.read());
        AutoreDAO dao = DAOService.createAutoreDAO();
        dao.addAutore(a);
    }
}




