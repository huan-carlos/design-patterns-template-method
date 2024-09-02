import com.manoelcampos.retornoboleto.LeituraRetornoBancoBrasil;
import com.manoelcampos.retornoboleto.ProcessarBoletos;

import java.net.URI;
import java.net.URISyntaxException;

public class Principal {
    public static void main(String[] args) throws URISyntaxException {
        final var processador = new LeituraRetornoBancoBrasil();

        URI caminhoArquivo = Principal.class.getResource("banco-brasil-1.csv").toURI();
        System.out.println("Lendo arquivo " + caminhoArquivo + "\n");

        processador.processar(caminhoArquivo);
    }
}
