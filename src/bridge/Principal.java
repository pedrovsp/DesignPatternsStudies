package bridge;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Principal {
	
	public static void main(String[] args) throws IOException {
		Map<String, Object> mapa = new HashMap<>();
		mapa.put("nome", "Leonam");
		mapa.put("idade", 32);
		
		GeradorArquivo gerador = new GeradorArquivoPropriedade(new ProcessaCriptografado());
		gerador.gerarArquivo("c:\\Gerador\\Cripto.txt", mapa);
		
		GeradorArquivo gerador1 = new GeradorArquivoXML(new ProcessaCompactado());
		gerador1.gerarArquivo("c:\\Gerador\\XML.zip", mapa);		
		
		GeradorArquivo gerador2 = new GeradorArquivoPropriedade(new ProcessaDefault());
		gerador2.gerarArquivo("c:\\defautl.txt", mapa);		
	}

}