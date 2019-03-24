package observer;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Connection;

public class LogDao {
	public void salvarLog(Log log) throws SQLException, ClassNotFoundException {
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost/dbArquivo", "root", "");
		Class.forName("com.mysql.jdbc.Driver");
		PreparedStatement ps = c.prepareStatement("insert into tb_login(ds_tipo, ds_titulo, ds_valor)"
				+ " values (?,?,?");
		ps.setString(1, log.getTipo());
		ps.setString(2, log.getTitulo());
		ps.setString(3, log.getValor());
		ps.execute();
	}
}
