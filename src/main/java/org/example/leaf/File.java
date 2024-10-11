package org.example.leaf;

import org.example.component.FileComponent;

/**
 * Hoja
 * Representa un archivo individual en el sistema
 */
public class File implements FileComponent {
    private String name;

    // Constructor para inicializar el archivo con su nombre
    public File(String name) {
        this.name = name;
    }

    // Implementación del método showDetails que imprime el nombre del archivo
    @Override
    public void showDetails() {
        System.out.println("File: " + name);
    }
}
