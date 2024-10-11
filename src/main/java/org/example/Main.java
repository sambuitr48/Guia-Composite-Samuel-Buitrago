package org.example;

import org.example.component.FileComponent;
import org.example.composite.Folder;
import org.example.leaf.File;

public class Main {
    public static void main(String[] args) {
        // Crear archivos individuales
        FileComponent file1 = new File("Document.txt");
        FileComponent file2 = new File("Image1.png");
        FileComponent file3 = new File("Image2.png");

        // Crear carpetas y añadir archivos
        Folder imagesFolder = new Folder("Images");
        imagesFolder.add(file2);
        imagesFolder.add(file3);

        Folder rootFolder = new Folder("Root");
        rootFolder.add(file1);
        rootFolder.add(imagesFolder);

        // Mostrar detalles de la estructura de archivos
        rootFolder.showDetails();
    }
}