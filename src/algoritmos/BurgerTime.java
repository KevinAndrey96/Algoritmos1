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
public class BurgerTime {    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int L=scanner.nextInt();
        if(L==0)
        {
            System.exit(0);
        }
        String Cadena=scanner.next();
        String Caracter;
        
        int intIndex= Cadena.indexOf("Z");
        if(intIndex == - 1){
            int cont=1;
            int distancia=0;
            while(L>0)
            {
                try{
                    Caracter=Cadena.substring(0,1);
                    Cadena=Cadena.substring(1);
                }catch(Exception e)
                {
                    break;
                }
                if(Caracter.equals("."))
                {
                    
                }else
                {
                    if(Caracter.equals("R"))
                    {
                        while(L>0)
                        {
                            try{
                                Caracter=Cadena.substring(0,1);
                                Cadena=Cadena.substring(1);
                            }catch(Exception e)
                            {
                                break;
                            }
                            
                            if(Caracter.equals("."))
                            {
                                cont++;
                            }else
                            {
                                if(Caracter.equals("D"))
                                {
                                    if(distancia==0)
                                    {
                                        distancia=cont;
                                        cont=1;
                                        break;
                                    }else
                                    {
                                        if(cont<=distancia)
                                        {
                                            distancia=cont;
                                            cont=1;
                                            break;
                                        }
                                    }
                                }else
                                {
                                    if(Caracter.equals("R"))
                                    {
                                        cont=1;
                                        break;
                                    }
                                }
                            }
                            L=Cadena.length();
                        }
                    }
                    if(Caracter.equals("D"))
                    {
                        while(L>0)
                        {
                            try{
                                Caracter=Cadena.substring(0,1);
                                Cadena=Cadena.substring(1);
                            }catch(Exception e)
                            {
                                break;
                            }
                            if(Caracter.equals("."))
                            {
                                cont++;
                            }else
                            {
                                if(Caracter.equals("R"))
                                {
                                    if(distancia==0)
                                    {
                                        distancia=cont;
                                        cont=1;
                                        break;
                                    }else
                                    {
                                        if(cont<=distancia)
                                        {
                                            distancia=cont;
                                            cont=1;
                                            break;
                                        }
                                    }
                                }
                                else
                                {
                                    if(Caracter.equals("D"))
                                    {
                                        cont=1;
                                        break;
                                    }
                                }
                            }
                            L=Cadena.length();
                        }
                    }
                }
                L=Cadena.length();
            }
            System.out.println(distancia);
            
        }else
        {
            System.out.println("0");
        }
    }
}
