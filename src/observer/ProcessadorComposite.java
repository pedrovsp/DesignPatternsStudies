package observer;

import java.io.IOException;
import java.util.List;

public class ProcessadorComposite implements Processador {
	
	private List<Processador> processadores;
	
	public ProcessadorComposite(List<Processador> processadores) {
		this.processadores = processadores;
	}

	@Override
	public byte[] processaConteudo(byte[] bytes) throws IOException {
		for(Processador processador : processadores) {
			bytes = processador.processaConteudo(bytes);
		}
		
		return bytes;
	}
	
	

}
