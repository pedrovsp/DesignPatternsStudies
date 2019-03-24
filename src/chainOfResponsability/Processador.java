package chainOfResponsability;

import java.io.IOException;

public abstract class Processador {
	private Processador proximoProcessador;
	
	public Processador(Processador proximo) {
		this.proximoProcessador = proximo;
	}	
	public Processador() {
		this.proximoProcessador = new ProcessaDefault(null);
	}
	
	public byte[] processarCadeia(byte[] bytes) throws IOException {
		bytes = processaConteudo(bytes);
		if(proximoProcessador != null) {
			bytes = proximoProcessador.processarCadeia(bytes);
		}
		return bytes;
	}
	
	protected abstract byte[] processaConteudo(byte[] bytes) throws IOException;
	
}
