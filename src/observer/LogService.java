package observer;

public class LogService implements Observador {

	@Override
	public void notificarArquivoGerado(String nome, String conteudo) {
		System.out.println("Novo arquivo:" + nome + " conteudo: " + conteudo);
		
	}

}
