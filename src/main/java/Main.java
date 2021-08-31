
import com.david.retorno.boleto.LeituraRetornoBradesco;
import com.david.retorno.boleto.ProcessarBoletos;
import java.io.File;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Path;

/**
 *
 * @author David
 */
public class Main {

    public static void main(String[] args) throws URISyntaxException {

        final ProcessarBoletos processador = new ProcessarBoletos(new LeituraRetornoBradesco());

        URL url = Main.class.getClassLoader().getResource("bradesco-1.csv");
        Path scriptPath = new File(url.getPath()).toPath();
        String nomeArquivo = scriptPath.toString();
        System.out.println("Lendo arquivo " + nomeArquivo + "\n");
        processador.processar(nomeArquivo);
    }
}
