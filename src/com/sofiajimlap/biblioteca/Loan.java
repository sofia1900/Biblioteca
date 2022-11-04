package com.sofiajimlap.biblioteca;

import java.util.Date;

public class Loan {

    //Atributos

        private Integer id;
        private Date startDate;
        private Date stopDate;
        //USER
        private User user;
        //BOOK
        private Book book;


    //Metodos

        public Integer getId(){return id;}
        public void setId (Integer id){this.id = id;}

        public Date getStartDate(){return startDate;}
        public void setStartDate(Date startDate){this.startDate = startDate;}

        public Date getStopDate(){return stopDate;}
        public void setStopDate(Date startDate){this.stopDate = stopDate;}

        public User getUser() {return user;}
        public void setUser(User user) {this.user = user;}

        public Book getBook() {return book;}
        public void setBook(Book book) {this.book = book;}

}
