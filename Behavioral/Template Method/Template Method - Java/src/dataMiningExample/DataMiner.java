package dataMiningExample;

public abstract class DataMiner {


    // The template method defines the skeleton of an algorithm.
    public void mine(String filePath) {
        String file = openFile(filePath);
        String data = extractData(file);
        String dataParsed = parseData(data);
        String analysis = analyzeData(dataParsed);
        sendReport(analysis);
        closeFile(filePath);
    }

    private String analyzeData(String data) {
        System.out.println("Analysis processing..........");
        return "Analysis";
    }

    private void sendReport(String analyze) {
        System.out.println("Send report");
    }


    protected abstract String  openFile(String filePath);
    protected abstract String extractData(String fileName);
    protected abstract String parseData(String data);
    protected abstract void closeFile(String filePath);
}
