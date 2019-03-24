package observer;

import java.sql.SQLException;

public class LogBO implements Observador {

	@Override
	public void notificarArquivoGerado(String nome, String conteudo) {
		LogDao logDao = new LogDao();
		Log log = new Log("Arquivo", nome, conteudo);
		
		try {
			logDao.salvarLog(log);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
