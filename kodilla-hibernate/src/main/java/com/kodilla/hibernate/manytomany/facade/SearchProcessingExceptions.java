package com.kodilla.hibernate.manytomany.facade;

public class SearchProcessingExceptions extends Exception{

    public static String ERR_EMPL_NOT_FOUND = "Employee not found";
    public static String ERR_COMP_NOT_FOUND = "company not found";

    public SearchProcessingExceptions(String message){
        super(message);
    }
}

