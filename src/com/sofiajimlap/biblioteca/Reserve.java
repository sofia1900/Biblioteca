package com.sofiajimlap.biblioteca;

import java.util.Date;

public class Reserve {

    //Atributos

    private Integer id;
    private Date startDate;
    private Date stopDate;

    //USER
    //BOOK


    //Metodos

    public Integer getId(){return id;}
    public void setId (Integer id){this.id = id;}

    public Date getStartDate(){return startDate;}
    public void setStartDate(Date startDate){this.startDate = startDate;}

    public Date getStopDate(){return stopDate;}
    public void setStopDate(Date startDate){this.stopDate = stopDate;}

}
