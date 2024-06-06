package dao;

import java.sql.*;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import static connettore.Connettore.*;
import model.Utente;

public class DaoService implements IDaoService {

	@Override
	public boolean insert(Utente u) {
		Connection conn = getInstance().openConnection();
		PreparedStatement ps = null;
		String comandoSQL = 
				"insert into utenti (nome,cognome,cf,dataNascita,stipendio)"
				+ "values (?,?,?,?,?)";
		try {
			ps = conn.prepareStatement(comandoSQL);
			ps.setString(1, u.getNome());
			ps.setString(2, u.getCognome());
			ps.setString(3, u.getCf());
			ps.setDate(4, u.getDataNascita());
			ps.setDouble(5, u.getStipendio());
			ps.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				ps.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
				return false;
			}
		}
		return true;
	}

	@Override
	public Utente read(int id) {
		Connection conn = getInstance().openConnection();
		PreparedStatement ps = null;
		ResultSet rs = null;
		Utente u = null;
		String comandoSQL = 
				"select * from utenti where id=?";
		try {
			ps = conn.prepareStatement(comandoSQL);
			ps.setInt(1, id);
			rs = ps.executeQuery();
			if(rs.next()) { //next() iteratore
				u = new Utente();
				u.setId(rs.getInt("id"));
				u.setNome(rs.getString("nome"));
				u.setCognome(rs.getString("cognome"));
				u.setCf(rs.getString("cf"));
				u.setDataNascita(rs.getDate("dataNascita"));
				u.setStipendio(rs.getDouble("stipendio"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				ps.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
				return null;
			}
		}
		return u;
	}

	@Override
	public List<Utente> read() {
		Connection conn = getInstance().openConnection();
		PreparedStatement ps = null;
		ResultSet rs = null;
		Utente u = null;
		List<Utente> utenti = new ArrayList<Utente>();
		String comandoSQL = 
				"select * from utenti";
		try {
			ps = conn.prepareStatement(comandoSQL);
			rs = ps.executeQuery();
			while(rs.next()) { //next() iteratore
				u = new Utente();
				u.setId(rs.getInt("id"));
				u.setNome(rs.getString("nome"));
				u.setCognome(rs.getString("cognome"));
				u.setCf(rs.getString("cf"));
				u.setDataNascita(rs.getDate("dataNascita"));
				u.setStipendio(rs.getDouble("stipendio"));
				utenti.add(u);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				ps.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
				return null;
			}
		}
		return utenti;
	}

	@Override
	public boolean update(Utente u) {
		Connection conn = getInstance().openConnection();
		PreparedStatement ps = null;
		String comandoSQL = 
				"update utenti set nome= ?, cognome= ?, cf= ?, dataNascita= ?,"
				+" stipendio= ? where id= ?";
		try {
			ps = conn.prepareStatement(comandoSQL);
			ps.setString(1, u.getNome());
			ps.setString(2, u.getCognome());
			ps.setString(3, u.getCf());
			ps.setDate(4, u.getDataNascita());
			ps.setDouble(5, u.getStipendio());
			ps.setInt(6, u.getId());
			ps.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				ps.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
				return false;
			}
		}
		return true;
	}

	@Override
	public boolean delete(int id) {
	Connection conn = getInstance().openConnection();
	PreparedStatement ps = null;
	String comandoSQL = 
			"delete from utenti "
			+"where id= ?";
	try {
		ps = conn.prepareStatement(comandoSQL);
		ps.setInt(1, id);
		ps.execute();
	} catch (SQLException e) {
		e.printStackTrace();
	} finally {
		try {
			ps.close();
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
	}
	return true;
	}
	
	

}
