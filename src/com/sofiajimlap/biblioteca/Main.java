package com.sofiajimlap.biblioteca;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Main {

    static ArrayList<Book> books = new ArrayList<>();
    static ArrayList<User> users = new ArrayList<>();
    public static void main(String[] args) throws ParseException {

        Scanner scanner = new Scanner (System.in);

        int opcionMenu;
        System.out.println("¿Qué desea hacer? \n 1. Introducir un libro \n 2. Realizar un prestamo \n 3.Salir");
        opcionMenu = scanner.nextInt();

        while (opcionMenu != 3) {
            if (opcionMenu == 1) {
                //permitir al usuario introducir libros
                Book book = new Book();
                Genre genre = new Genre();
                Author author = new Author();

                //Introducir libro
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

                for (int i = 1; i <= numAuthors; i++) {
                    System.out.println("Introduce el id del autor:");
                    author.setId(scanner.nextInt());
                    System.out.println("Introduce el nombre del autor:");
                    author.setName(scanner.next());
                    System.out.println("Introduce los apellidos del autor:");
                    author.setSurname(scanner.next());
                    System.out.println("Introduce la fecha de nacimiento del autor:");
                    //Recoger la fecha como texto y convertirla a Date para almacenarla
                    fechaComoTexto = scanner.next();
                    sdf = new SimpleDateFormat("dd/MM/yyyy");
                    fecha = sdf.parse(fechaComoTexto);
                    author.setBirthday(fecha);
                    System.out.println("Introduce el lugar de nacimiento del autor:");
                    author.setPlaceBrith(scanner.next());

                    book.addAuthor(author);
                }

                //Introducir géneros
                System.out.println("¿cuantos géneros quiere introducir?");
                int numGenres = scanner.nextInt();
                for (int j = 1; j <= numGenres; j++) {
                    System.out.println("Introduce el id del genero:");
                    genre.setId(scanner.nextInt());
                    System.out.println("Introduce el nombre del genero:");
                    genre.setName(scanner.next());
                    System.out.println("Introduce la descripcion del genero:");
                    genre.setDescription(scanner.next());

                    book.addGenre(genre);
                }

                books.add(book); //Añade el nuevo libro con todos sus campos a array de libros
            } else if (opcionMenu == 2) {
                //Hacer una reserva
                Loan loan = new Loan();

                //Id reserva
                System.out.println("Introduce el id de la reserva:");
                loan.setId(scanner.nextInt());

                //Identificar usuario ; Comentado porque no está hecha la opcion de introducir un usuario
                /*
                for (int usuario = 0; usuario < users.size(); usuario++) {
                    System.out.println(users.get(usuario).getId() + ". " + users.get(usuario).getName());
                }
                System.out.println("Introduce el numero del usuario:");
                int idUserIntroducido = scanner.nextInt();

                int idUserActual;
                int p = 0;
                boolean encontrado = false;

                while (encontrado == false) {
                    while (p < books.size() || encontrado == false) {
                        idUserActual = books.get(p).getId();
                        if (idUserIntroducido == idUserActual) {
                            encontrado = true;
                        } else {
                            p++;
                        }
                    }
                    System.out.println("Numero introducido no encontrado");
                    System.out.println("Introduce el numero del usuario");
                    idUserIntroducido = scanner.nextInt();
                }
                loan.setBook(books.get(p));
                */

                //Elegir libro
                System.out.println("Libros actuales:");
                for (int libro = 0; libro < books.size(); libro++) {
                    System.out.println(books.get(libro).getId() + ". " + books.get(libro).getTitle());
                }
                System.out.println("");
                System.out.println("Introduce el numero del libro:");
                int idBookIntroducido = scanner.nextInt();

                int idBookActual;
                int k = 0;
                boolean encontrada = false;

                while (encontrada == false) {
                    while (encontrada == false || k < books.size()) {
                        idBookActual = books.get(k).getId();
                        if (idBookIntroducido == idBookActual) {
                            encontrada = true;
                        } else {
                            k++;
                        }
                    }
                    System.out.println("Numero introducido no encontrado");
                    System.out.println("Introduce el numero del libro");
                    idBookIntroducido = scanner.nextInt();
                }

                loan.setBook(books.get(k));

                //Introducir fecha inicio
                System.out.println("Introduce la fecha de inicio de la reserva:");
                    //Recoger la fecha como texto y convertirla a Date para almacenarla
                    String fechaComoTexto = scanner.next();
                    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                    Date fecha = sdf.parse(fechaComoTexto);
                    loan.setStartDate(fecha);

                //Introducir fecha fin
                System.out.println("Introducir la fecha de finalizacion de la reserva:");
                    //Recoger la fecha como texto y convertirla a Date para almacenarla
                    fechaComoTexto = scanner.next();
                    sdf = new SimpleDateFormat("dd/MM/yyyy");
                    fecha = sdf.parse(fechaComoTexto);
                    loan.setStopDate(fecha);

            } else {
                System.out.println("Ha introducido una opcion invalida");
            }

            System.out.println("¿Qué desea hacer? \n 1. Introducir un libro \n 2. Realizar un prestamo \n 3.Salir");
            opcionMenu = scanner.nextInt();
        }
    }
}
