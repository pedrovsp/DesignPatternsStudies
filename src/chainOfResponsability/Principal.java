package chainOfResponsability;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Principal {
	
	public static void main(String[] args) throws IOException {
		Map<String, Object> mapa = new HashMap<>();
		mapa.put("nome", "Leonam");
		mapa.put("idade", 32);
		
		Processador processaCompactado = new ProcessaCompactado();
		Processador processaCripto = new ProcessaCriptografado(processaCompactado);
		
		GeradorArquivo gerador = new GeradorArquivoPropriedade(processaCripto);
		gerador.gerarArquivo("c:\\Gerador\\chainOfResponsability.zip", mapa);	
	}

}