package observer;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public abstract class GeradorArquivo {
	
	private Processador processador;
	private List<Observador> observadores;
	
	public GeradorArquivo(Processador processador) {
		this.processador = processador;
		this.observadores = new ArrayList<Observador>();
	}
	
	public final void gerarArquivo(String nome, Map<String,Object> propriedades) throws IOException {	

		String conteudo = gerarConteudo(propriedades);
		byte[] bytes = processador.processaConteudo(conteudo.getBytes());
		FileOutputStream fileout = new FileOutputStream(nome);
		fileout.write(bytes);
		fileout.close();
		notificar(nome, conteudo);
	}
	
	public void notificar(String nome, String conteudo) {
		for (Observador observer : observadores) {
			observer.notificarArquivoGerado(nome, conteudo);
		}
	}
	
	public void addObservador(Observador observer) {
		this.observadores.add(observer);
	}
	
	protected abstract String gerarConteudo(Map<String,Object> propriedades);

}