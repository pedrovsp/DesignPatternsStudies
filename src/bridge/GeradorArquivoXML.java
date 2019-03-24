package bridge;

import java.util.Map;

public class GeradorArquivoXML extends GeradorArquivo {
	
	public GeradorArquivoXML(Processador processador) {
		super(processador);
	}
	
	@Override
	public String gerarConteudo(Map<String,Object> propriedades) {
		//gera xml
		StringBuilder propFileBuilder = new StringBuilder();
		propFileBuilder.append("<properties>");
		for (String prop: propriedades.keySet()) {
			propFileBuilder.append("<"+prop+">"+propriedades.get(prop)+"</"+prop+">");
		}
		propFileBuilder.append("</propriedades>");
		return propFileBuilder.toString();
	}
}
