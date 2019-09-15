/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritmos;

import java.util.Scanner;

/**
 *
 * @author Andrey
 */
public class IntegerPrefix {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String T=scanner.next();
        String Caracter;
        String Salida="";
        while(T.length()>0)
        {
            Caracter=T.substring(0,1);
            T=T.substring(1);
            if(Caracter.equals("0") || Caracter.equals("1") || Caracter.equals("2") || Caracter.equals("3") || Caracter.equals("4") || Caracter.equals("5") || Caracter.equals("6") || Caracter.equals("7") || Caracter.equals("8") || Caracter.equals("9"))
            {
                Salida+=Caracter;
            }else
            {
                break;
            }
        }
        if(Salida.equals(""))
        {
            System.out.println("-1");
        }else
        {
            System.out.println(Salida);
        }
    }
}
