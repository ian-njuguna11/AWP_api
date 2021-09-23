import com.itextpdf.kernel.pdf.PdfDocument
import com.itextpdf.kernel.pdf.PdfWriter
import com.itextpdf.layout.Document
import com.itextpdf.layout.element.Cell
import com.itextpdf.layout.element.Table
//import org.bouncycastle.asn1.x500.style.RFC4519Style.name

fun awp_gen(){
    // Creating a PdfDocument object

    // Creating a PdfDocument object
    val dest = "C:\\Users\\user\\Desktop\\addingTable.pdf"
    val writer = PdfWriter(dest)

    // Creating a PdfDocument object

    // Creating a PdfDocument object
    val pdf = PdfDocument(writer)

    // Creating a Document object

    // Creating a Document object
    val doc = Document(pdf)

    // Creating a table

    // Creating a table
    val pointColumnWidths = floatArrayOf(150f, 150f, 150f)
    val table = Table(pointColumnWidths)

//        String name = "John";

    // Adding cells to the table

//        String name = "John";
    val name:String = ""

    // Adding cells to the table
//    table.addCell(Cell().add("name"))
//    table.addCell(Cell())
//    table.addCell(Cell())
//    table.addCell(Cell())
//    table.addCell(Cell())

    // Adding Table to document

    // Adding Table to document
    doc.add(table)

    // Closing the document

    // Closing the document
    doc.close()
    println("Table created successfully..")
}