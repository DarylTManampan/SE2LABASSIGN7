public class ProcessedDocument{
    public static void main(String[] args) {

        System.out.println("\n");
        DocumentRegistry registry = new DocumentRegistry();

        System.out.println();

        Document pdf = registry.createPdfDocument("annual_report_2024.pdf", "Acme Corp", 150);
        pdf.open();
        System.out.println("Type: " + pdf.getType() + ", File: " + ((PdfDocument) pdf).getFileName() + 
                         ", Author: " + ((PdfDocument) pdf).getAuthor() + ", Pages: " + ((PdfDocument) pdf).getPageCount());

        Document text = registry.createTextDocument();
        text.open();
        System.out.println("Type: " + text.getType() + ", Path: " +  ((TextDocument) text).getFilePath() + 
                         ", Encoding: " + ((TextDocument) text).getEncoding() + ", Words: " + ((TextDocument) text).getWordCount());

        Document spreadsheet = registry.createSpreadsheetDocument();
        spreadsheet.open();
        System.out.println("Type: " + spreadsheet.getType() +  ", Name: " + ((SpreadsheetDocument) spreadsheet).getSpreadsheetName() + 
                         ", Rows: " + ((SpreadsheetDocument) spreadsheet).getRowCount() + ", Columns: " + ((SpreadsheetDocument) spreadsheet).getColumnCount()); 
        System.out.println();

        Document anotherPDF = registry.createPdfDocument("summary_report.pdf", "Acme Corp", 30);
        anotherPDF.open();
        System.out.println("\n");
    }
}