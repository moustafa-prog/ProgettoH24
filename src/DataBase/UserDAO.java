package DataBase;

import Model.User;

public interface UserDAO <Login>{

	boolean verificaCredenziali(String username, String password, String specializzazione, String idSpecializzazione);

	String getNomeDottore(String username);

	boolean registraUtente(User user);

	void setTipoDiUtente(String tipoUtente);

}


