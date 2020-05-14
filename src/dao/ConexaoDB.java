package dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoDB {
	static {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		}
		catch(ClassNotFoundException e) {
			throw new RuntimeException(e);
		}
	}

	public static Connection conectar() throws SQLException {
		String servidor = "localhost";
		String porta = "3306";
		String database = "projetopi";
		String usuario = "root";
		String senha = "Ab21850398@";
		return DriverManager.getConnection("jdbc:mysql://"+servidor+":"+porta+"/"+database+"?useSSL=true&useTimezone=true&serverTimezone=UTC", usuario, senha);

	}

	public static void desconectar(Connection conexao) throws SQLException {
		conexao.close();
	}
}
