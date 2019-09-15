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
public class CommonSubsequence {
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        String A=scanner.next();
        String B=scanner.next();
        double Coincidencia=A.length();
        Coincidencia=Coincidencia*0.99;
        int match=(int) Math.floor(Coincidencia);
        String Subcadena="";
        Boolean brothers=false;
        for(int i=0;i<A.length();i++)
        {
            try{
                Subcadena=A.substring(i,match+i);
            }catch(Exception e)
            {
                break;
            }
            int intIndex= B.indexOf(Subcadena);
            if(intIndex == - 1){
                brothers=false;
            }else
            {
                brothers=true;
                break;
            }
        }
        if(brothers)
        {
            System.out.println("Long lost brothers D:");
        }else
        {
            System.out.println("Not brothers :(");
        }   
    }
}
