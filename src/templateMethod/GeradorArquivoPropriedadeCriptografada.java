package templateMethod;

import java.util.Map;

public class GeradorArquivoPropriedadeCriptografada extends GeradorArquivo {

	@Override
	public byte[] processaConteudo(byte[] bytes) {
		byte[] newBytes = new byte[bytes.length];
		for (int i = 0; i<bytes.length;i++) {
			newBytes[i] = (byte)((bytes[i]+10) % Byte.MAX_VALUE);
		}
		return newBytes;
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
