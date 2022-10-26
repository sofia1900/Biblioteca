package com.sofiajimlap.biblioteca;

import java.util.Date;

public class Book {

    //Atributos

    private Integer id;
    private String title;
    private String isbn;
    private Date publicationDate;
        //autores
        //generos


    //Metodos

    public Integer getId(){return id;}
    public void setId (Integer id){this.id = id;}

    public String getTitle(){return title;}
    public void setTitle (String title){this.title = title;}

    public String getIsbn (){return isbn;}
    public void setIsbn (String isbn){this.isbn = isbn;}

    public Date getPublicationDate() {return publicationDate;}
    public void setPublicationDate (Date publicationDate){this.publicationDate = publicationDate;}

}
