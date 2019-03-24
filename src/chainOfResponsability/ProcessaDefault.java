package chainOfResponsability;

import java.io.IOException;

public class ProcessaDefault extends Processador {

	public ProcessaDefault(Processador proximo) {
		super(proximo);
		// TODO Auto-generated constructor stub
	}	
	public ProcessaDefault() {
	}

	@Override
	protected byte[] processaConteudo(byte[] conteudo) throws IOException {
		return conteudo;
	}
}
