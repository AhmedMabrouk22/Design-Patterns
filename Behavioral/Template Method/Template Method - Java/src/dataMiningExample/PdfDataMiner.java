package dataMiningExample;

public class PdfDataMiner extends DataMiner{

    @Override
    protected String openFile(String filePath) {
        System.out.println("Open pdf file on path: " + filePath + ".....");
        return "Pdf file";
    }

    @Override
    protected String extractData(String fileName) {
        System.out.println("Extracting data from " + fileName);
        return "Data in pdf file";
    }

    @Override
    protected String parseData(String data) {
        System.out.println("Parsing pdf " + data);
        return "Data";
    }

    @Override
    protected void closeFile(String filePath) {
        System.out.println("Close pdf file on path: " + filePath + ".....");
    }
}
