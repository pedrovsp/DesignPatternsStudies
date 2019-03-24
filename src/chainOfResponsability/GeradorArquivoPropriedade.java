package chainOfResponsability;

import java.util.Map;

public class GeradorArquivoPropriedade extends GeradorArquivo {
	
	public GeradorArquivoPropriedade(Processador processador) {
		super(processador);
	}
	
	
	@Override
	public String gerarConteudo( Map<String,Object> propriedades) {
		StringBuilder propFileBuilder = new StringBuilder();
		for (String prop: propriedades.keySet()) {
			propFileBuilder.append(prop+"m"+propriedades.get(prop)+"\n");
		}
		return propFileBuilder.toString();
		
	}
}
