public class TextDocument implements Document {
    private String filePath = "meeting_notes.txt";
    private String encoding = "UTF-8";
    private int wordCount = 250;

    public TextDocument() {
        System.out.println("Creating a Text Document prototype.");
    }

    @Override
    public TextDocument clone() {
        try {
            return (TextDocument) super.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println("Cloning not supported!");
            return null;
        }
    }

    @Override
    public void open() {
        System.out.println("Opening Text Document: " + filePath + " with encoding: " + encoding + " (" + wordCount + " words)");
    }

    @Override
    public String getType() {
        return "Text";
    }

    public String getFilePath() {
        return filePath;
    }

    public String getEncoding() {
        return encoding;
    }

    public int getWordCount() {
        return wordCount;
    }
}