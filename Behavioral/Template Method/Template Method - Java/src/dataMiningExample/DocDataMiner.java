package dataMiningExample;

public class DocDataMiner extends DataMiner{
    @Override
    protected String openFile(String filePath) {
        System.out.println("Open doc file on path: " + filePath + ".....");
        return "Doc file";
    }

    @Override
    protected String extractData(String fileName) {
        System.out.println("Extracting data from " + fileName);
        return "Data in doc file";
    }

    @Override
    protected String parseData(String data) {
        System.out.println("Parsing doc" + data);
        return "Data";
    }

    @Override
    protected void closeFile(String filePath) {
        System.out.println("Close doc file on path: " + filePath + ".....");
    }
}
