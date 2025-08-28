import br.com.mariojp.solid.isp.OfficeService;
import br.com.mariojp.solid.isp.Printer;
import br.com.mariojp.solid.isp.SimplePrinter;

public class Main {
	public static void main(String[] args) {

		Printer printer = new SimplePrinter();
        OfficeService service = new OfficeService(printer);

        // Não deve lançar exceção
        service.printReport();
	}
}
