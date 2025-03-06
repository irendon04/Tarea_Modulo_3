/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.libro;
import java.util.Scanner;

/**
 *
 * @author rendo
 */
public class Main {
    
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("\nMenu Biblioteca Virtual");
            System.out.println("1. Agregar libro");
            System.out.println("2. Buscar por titulo");
            System.out.println("3. Buscar por autor");
            System.out.println("4. Prestar libro");
            System.out.println("5. Devolver libro");
            System.out.println("6. Mostrar libros disponibles");
            System.out.println("7. Salir");
            System.out.print("Elige una opcion: ");
            
            int opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Titulo: ");
                    String titulo = scanner.nextLine();
                    System.out.print("Autor: ");
                    String autor = scanner.nextLine();
                    System.out.print("Ano de publicacion: ");
                    int anio = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Genero: ");
                    String genero = scanner.nextLine();
                    biblioteca.agregarLibro(new Libro(titulo, autor, anio, genero));
                    break;
                case 2:
                    System.out.print("Ingrese el titulo del libro: ");
                    String buscarTitulo = scanner.nextLine();
                    biblioteca.buscarPorTitulo(buscarTitulo);
                    break;
                case 3:
                    System.out.print("Ingrese el autor del libro: ");
                    String buscarAutor = scanner.nextLine();
                    biblioteca.buscarPorAutor(buscarAutor);
                    break;
                case 4:
                    System.out.print("Ingrese el titulo del libro a prestar: ");
                    String prestarTitulo = scanner.nextLine();
                    biblioteca.prestarLibro(prestarTitulo);
                    break;
                case 5:
                    System.out.print("Ingrese el titulo del libro a devolver: ");
                    String devolverTitulo = scanner.nextLine();
                    biblioteca.devolverLibro(devolverTitulo);
                    break;
                case 6:
                    biblioteca.mostrarLibrosDisponibles();
                    break;
                case 7:
                    System.out.println("Saliendo...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opcion no valida, intenta de nuevo.");
            }
        }
    }
}

