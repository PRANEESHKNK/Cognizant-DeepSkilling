public class FactoryMethodTest  {
    public static void main(String args[]){
        DocumentFactory wordFactory = new WordFactory();
        Document word = wordFactory.createDocument();
        word.open();
        DocumentFactory PdfFactory = new PdfFactory();
        Document pdf = PdfFactory.createDocument();
        pdf.open();
        DocumentFactory ExcelDocument = new ExcelFactory();
        Document excel=ExcelDocument.createDocument();
        excel.open();
    }
}
