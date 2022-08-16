package application;

import devices.ComboDevice;
import devices.ConcretePrinter;
import devices.ConcreteScanner;
import javafx.scene.control.ComboBox;

public class Program {
    public static void main(String[] args) {
        ConcretePrinter p = new ConcretePrinter("1080");
        p.processDoc("My Letter");
        p.print("My Letter");

        System.out.println();
        ConcreteScanner s = new ConcreteScanner("2003");
        s.processDoc("My Email");
        System.out.println("Scan result: " + s.scan());

        System.out.println();
        ComboDevice c = new ComboDevice("2081");
        c.processDoc("My Dissertation");
        c.print("My Dissertation");
        System.out.println("Scan result: " + c.scan());
    }
}
