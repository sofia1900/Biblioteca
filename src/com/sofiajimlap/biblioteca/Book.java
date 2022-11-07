package com.sofiajimlap.biblioteca;

import java.util.ArrayList;
import java.util.Date;

public class Book implements Books {

    //Atributos

        private Integer id;
        private String title;
        private Integer isbn;
        private Date publicationDate;
        //autores
        private ArrayList<Author> authors = new ArrayList<>();
        //generos
        private ArrayList<Genre> genres = new ArrayList<>();


    //Metodos

        public Integer getId(){return id;}
        public void setId (Integer id){this.id = id;}


        public Date getPublicationDate() {return publicationDate;}
        public void setPublicationDate (Date publicationDate){this.publicationDate = publicationDate;}

        public void addAuthor (Author author) {this.authors.add(author);}
        public ArrayList<Author> setAuthors() {return this.authors;}

        public void addGenre (Genre genre) {this.genres.add(genre);}
        public ArrayList<Genre> setGenre() {return this.genres;}

        @Override
        public void setIsbn(Integer isbn) {
                this.isbn = isbn;
        }

        @Override
        public Integer getIsbn() {
                return isbn;
        }

        @Override
        public void setTitle(String title) {
                this.title = title;
        }

        @Override
        public String setTitle() {
                return title;
        }
}
