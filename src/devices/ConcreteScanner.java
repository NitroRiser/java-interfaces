package devices;

public class ConcreteScanner extends Device implements Scanner{

    private static final String SCANNED_CONTENT = "Scanned content.";

    public ConcreteScanner(String serialNumber) {
        super(serialNumber);
    }

    @Override
    public void processDoc(String doc) {
        System.out.println("Scanner processing: " + doc);
    }

    public String scan() {
        return SCANNED_CONTENT;
    }
    
}
