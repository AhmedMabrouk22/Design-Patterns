import dataMiningExample.DataMiner;
import dataMiningExample.DocDataMiner;
import dataMiningExample.PdfDataMiner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Data miner example");
        System.out.println("==============================");

        DataMiner dataMiner = new PdfDataMiner();
        dataMiner.mine("pdf path");

        System.out.println();
        System.out.println();

        dataMiner = new DocDataMiner();
        dataMiner.mine("doc path");

    }
}