package dao;

import java.util.List;

import model.Utente;

//DAO: Data Access Object
public interface IDaoService {

	public boolean insert(Utente u);
	//overload di read()
	public Utente read(int id);
	public List<Utente> read();
	public boolean update(Utente u);
	public boolean delete(int id);
	
}
