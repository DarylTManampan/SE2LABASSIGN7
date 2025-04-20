public class DocumentRegistry {
    private PdfDocument pdfPrototype = new PdfDocument("Default", "Uknown", 0);
    private TextDocument textDocumentPrototype = new TextDocument();
    private SpreadsheetDocument spreadsheetPrototype = new SpreadsheetDocument();

    public Document createPdfDocument(String fileName, String author, int pageCount) {
        PdfDocument newPdf = pdfPrototype.clone();
        newPdf.setFileName(fileName);
        newPdf.setAuthor(author);
        newPdf.setPageCount(pageCount);
        return newPdf;
    }

    public Document createTextDocument() {
        return textDocumentPrototype.clone();
    }

    public Document createSpreadsheetDocument() {
        return spreadsheetPrototype.clone();
    }
}