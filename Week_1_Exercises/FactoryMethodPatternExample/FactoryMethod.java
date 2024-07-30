public class FactoryMethod{
    public static void main(String args[]){
        DocumentFactory pdf = new PdfDocumentFactory();
        DocumentFactory word = new WordDocumentFactory();
        DocumentFactory excel = new ExcelDocumentFactory();

        pdf.createDocument();
        word.createDocument();
        excel.createDocument();
    }
}