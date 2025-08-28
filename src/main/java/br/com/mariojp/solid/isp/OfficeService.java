package br.com.mariojp.solid.isp;

public class OfficeService {
    
    private final Printer printer;

    public OfficeService(Printer printer) {
        this.printer = printer;
    }

    public void printReport() {
        printer.print();
    }
}
