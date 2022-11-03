package com.sofiajimlap.biblioteca;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main (String[]args) throws ParseException {

        //permitir al usuario introducir libros
        Book book = new Book();
        Genre genre = new Genre();
        Author author = new Author();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce el id del libro:");
        book.setId(scanner.nextInt());
        System.out.println("Introduce el titulo del libro:");
        book.setTitle(scanner.next());
        System.out.println("Introduce el ISBN del libro:");
        book.setIsbn(scanner.nextInt());
        System.out.println("Introduce la fecha de publicacion del libro:");
            //Recoger la fecha como texto y convertirla a Date para almacenarla
            String fechaComoTexto = scanner.next();
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            Date fecha = sdf.parse(fechaComoTexto);
            book.setPublicationDate(fecha);

        //Introducir autores
        System.out.println("¿cuantos autores quiere introducir?");
        int numAuthors = scanner.nextInt();

        for (int i = 1 ; i <= numAuthors ; i ++){
            System.out.println("Introduce el id del autor:");
            author.setId(scanner.nextInt());
            System.out.println("Introduce el nombre del autor:");
            author.setName(scanner.next());
            System.out.println("Introduce los apellidos del autor:");
            author.setSurname(scanner.next());
            //resto de atributos
            book.addAuthor(author);
        }

        //Introducir géneros
        System.out.println("¿cuantos géneros quiere introducir?");
        int numGenres = scanner.nextInt();
        for (int j = 1 ; j <= numGenres ; j++) {
            System.out.println("Introduce el id del genero:");
            genre.setId(scanner.nextInt());
            System.out.println("Introduce el nombre del genero:");
            genre.setName(scanner.next());
            System.out.println("Introduce la descripcion del genero:");
            genre.setDescription(scanner.next());
            book.addGenre(genre);
        }
    }

}
