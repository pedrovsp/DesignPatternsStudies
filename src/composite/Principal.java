package composite;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Principal {
	
	public static void main(String[] args) throws IOException {
		Map<String, Object> mapa = new HashMap<>();
		mapa.put("nome", "Leonam");
		mapa.put("idade", 32);
		
		List<Processador> processadores = new ArrayList<Processador>();
		processadores.add(new ProcessaCriptografado());
		processadores.add(new ProcessaCompactado());
		
		List<Processador> processadores1 = new ArrayList<Processador>();
		processadores1.add(new ProcessaCompactado());
		processadores1.add(new ProcessaCriptografado());
		
		List<Processador> processadores2 = new ArrayList<Processador>();
		processadores2.add(new ProcessaDefault());
		processadores2.add(new ProcessaCompactado());
		
		GeradorArquivo gerador = new GeradorArquivoPropriedade(new ProcessadorComposite(processadores));
		gerador.gerarArquivo("c:\\Gerador\\CriptoComposite.zip", mapa);
		
		GeradorArquivo gerador1 = new GeradorArquivoXML(new ProcessadorComposite(processadores1));
		gerador1.gerarArquivo("c:\\Gerador\\XMLComposite.txt", mapa);		
		
		GeradorArquivo gerador2 = new GeradorArquivoPropriedade(new ProcessaDefault());
		gerador2.gerarArquivo("c:\\defaultComposite.txt", mapa);		
	}

}