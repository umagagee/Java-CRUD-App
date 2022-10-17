/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crudapp;

import java.nio.charset.Charset;
import java.util.Date;
import java.util.Random;

/**
 *
 * @author BIGUY
 */
public class CRUDApp {
    static final String ALPHA_NUMERIC_STRING = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       String GenratedCode=randomAlphaNumeric(10);
        // TODO code application logic here
        System.out.println(GenratedCode);
 
    }
     public static String randomAlphaNumeric(int count) {
StringBuilder builder = new StringBuilder();
while (count-- != 0) {
int character = (int)(Math.random()*ALPHA_NUMERIC_STRING.length());
builder.append(ALPHA_NUMERIC_STRING.charAt(character));
}
return builder.toString();
}
    
}
