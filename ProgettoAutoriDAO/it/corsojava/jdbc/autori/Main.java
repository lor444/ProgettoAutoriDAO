package it.corsojava.jdbc.autori;

import it.corsojava.ui.terminal.TerminalUi;

public class Main {

    public static void main(String[] args) {

        DAOService.setConnectionString("jdbc:postgresql://localhost:5432/corsosql");
        DAOService.setUserName("corsosql");
        DAOService.setUserPass("corsosql");

        TerminalUi tui = TerminalUi.getBuilder().build();
        UserInterface ui = new UserInterface(tui);

        ui.run();

    }

}
