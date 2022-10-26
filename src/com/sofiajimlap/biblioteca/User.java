package com.sofiajimlap.biblioteca;

public class User {

    //Atributos

        private Integer id;
        private String name;
        private String surname;
        private String dni;
        private Integer phone;
        private String address;

    //Metodos

        public Integer getId() {return id;}
        public void setId(Integer id) {this.id = id;}

        public String getName(){return name;}
        public void setName(String name) {this.name = name;}

        public String getSurname(){return surname;}
        public void setSurname(String surname) {this.surname = surname;}

        public String getDni() {return dni;}
        public void setDni (String dni) {this.dni = dni;}

        public Integer getPhone() {return phone;}
        public void setPhone (Integer phone) {this.phone = phone;}

        public String getAddress() {return address;}
        public void setAddress(String address) {this.address = address;}

}
