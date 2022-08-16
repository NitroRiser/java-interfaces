package devices;

public class Scanner extends Device{

    private static final String SCANNED_CONTENT = "Scanned content.";

    public Scanner(String serialNumber) {
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
