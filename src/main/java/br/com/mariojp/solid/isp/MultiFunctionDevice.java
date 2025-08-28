package br.com.mariojp.solid.isp;

public class MultiFunctionDevice implements Printer, Scanner{

    @Override
    public void print() {
        System.out.println("Printing document...");
    }

    @Override
    public void scan() {
        System.out.println("Scanning document...");
    }

}
