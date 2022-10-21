public class Printer {

    public static void main(String[] args) {
        Printer printer = new Printer();
        printer.addToner(25);
        printer.addToner(10);
        printer.addToner(100);
        printer.tonerStatus();
        printer.pagesToPrint(23);
        printer.pagesToPrint(7);
        printer.statusOfPages();
    }

    private int tonerLevel = 0;
    private int pagesPrinted;
    private boolean duplexPrinter;

    public void addToner(int toner) {
        if (this.tonerLevel + toner >= 100) {
            System.out.println("Possible toner overload");
        } else {
            tonerLevel += toner;
        }
    }

    public void tonerStatus() {
        System.out.println("The toner level is at: " + tonerLevel + "%");
    }

    public void pagesToPrint(int pages) {
        pagesPrinted += pages;
    }

    public void statusOfPages() {
        System.out.println("The total pages printed thus far is: " + pagesPrinted + " pages");
    }


}
