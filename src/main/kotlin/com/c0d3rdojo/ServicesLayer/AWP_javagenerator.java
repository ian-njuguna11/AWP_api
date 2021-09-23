package com.c0d3rdojo.ServicesLayer;

import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Cell;
import com.itextpdf.layout.element.IBlockElement;
import com.itextpdf.layout.element.Table;

public class AWP_javagenerator {
    public static void main(String args[]) throws Exception {
        // Creating a PdfDocument object
        String dest = "C:/itextExamples/addingTable.pdf";
        PdfWriter writer = new PdfWriter(dest);

        // Creating a PdfDocument object
        PdfDocument pdf = new PdfDocument(writer);

        // Creating a Document object
        Document doc = new Document(pdf);

        // Creating a table
        float [] pointColumnWidths = {150F, 150F, 150F};
        Table table = new Table(pointColumnWidths);

//        String name = "John";

        // Adding cells to the table
        table.addCell(new Cell());
        table.addCell(new Cell());
        table.addCell(new Cell());
        table.addCell(new Cell());
        table.addCell(new Cell());

        doc.add(table);

        // Closing the document
        doc.close();
        System.out.println("Table created successfully..");
    }
}