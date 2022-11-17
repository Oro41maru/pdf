import java.io.*;

import com.aspose.pdf.Document;
import com.aspose.pdf.Font;
import com.aspose.pdf.SaveFormat;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;


public class Main {
    public Main() throws IOException {
    }

    public static void main(String[] args) {
        Document doc = new Document("C:\\Users\\egefr\\Downloads\\Telegram Desktop\\Сессия 3.pdf");

        doc.save("C:\\Users\\egefr\\Downloads\\Telegram Desktop\\qw.docx", SaveFormat.DocX);
    }
}
