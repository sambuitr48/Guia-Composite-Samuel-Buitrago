package org.example.composite;

import org.example.component.FileComponent;

import java.util.ArrayList;
import java.util.List;

// Composición
// Representa una carpeta que puede contener archivos o subcarpetas
public class Folder implements FileComponent {
    private String name;
    private List<FileComponent> contents = new ArrayList<>();

    // Constructor para inicializar la carpeta con su nombre
    public Folder(String name) {
        this.name = name;
    }

    // Método para agregar archivos o carpetas a la carpeta actual
    public void add(FileComponent component) {
        contents.add(component);
    }

    // Método para eliminar archivos o carpetas de la carpeta actual
    public void remove(FileComponent component) {
        contents.remove(component);
    }

    // Implementación del método showDetails que imprime los detalles de la carpeta
    @Override
    public void showDetails() {
        System.out.println("Folder: " + name);
        // Imprime los detalles de cada componente dentro de la carpeta
        for (FileComponent component : contents) {
            component.showDetails();
        }
    }
}
