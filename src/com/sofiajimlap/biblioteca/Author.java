package com.sofiajimlap.biblioteca;

import java.util.Date;

public class Author {

    //Atributos

        private Integer id;
        private String name;
        private String surname;
        private Date birthday;
        private String placeBrith;

    //Metodos

        public Integer getId() {return id;}
        public void setId(Integer id) {this.id = id;}

        public String getName() {return name;}
        public void setName(String name){this.name = name;}

        public String getSurname() {return surname;}
        public void setSurname(String surname) {this.surname = surname;}

        public Date getBirthday() {return birthday;}
        public void setBirthday(Date birthday) {this.birthday = birthday;}

        public String getPlaceBrith() {return placeBrith;}
        public void setPlaceBrith(String placeBrith) {this.placeBrith = placeBrith;}

}
