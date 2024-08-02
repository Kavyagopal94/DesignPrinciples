// Interface for basic printing functionality
interface Printer {
    void print(String document);
}

// Interface for additional functionalities that some printers might have
interface AdvancedPrinter {
    void scan(String document);
    void fax(String document);
}

// A basic printer that only supports printing
class BasicPrinter implements Printer {
    @Override
    public void print(String document) {
        System.out.println("Printing document: " + document);
    }
}

// An advanced printer that supports printing, scanning, and faxing
class AllInOnePrinter implements Printer, AdvancedPrinter {
    @Override
    public void print(String document) {
        System.out.println("Printing document: " + document);
    }

    @Override
    public void scan(String document) {
        System.out.println("Scanning document: " + document);
    }

    @Override
    public void fax(String document) {
        System.out.println("Faxing document: " + document);
    }
}

public class ISP {
    public static void main(String[] args) {
        Printer basicPrinter = new BasicPrinter();
        Printer allInOnePrinter = new AllInOnePrinter();

        basicPrinter.print("Basic Printer Document");

        allInOnePrinter.print("All-in-One Printer Document");
        //The cast (AdvancedPrinter) is used to convert allInOnePrinter from its current type (AllInOnePrinter) to the AdvancedPrinter type.
        AdvancedPrinter advancedPrinter = (AdvancedPrinter) allInOnePrinter;
        advancedPrinter.scan("All-in-One Scanner Document");
        advancedPrinter.fax("All-in-One Fax Document");
    }
}
