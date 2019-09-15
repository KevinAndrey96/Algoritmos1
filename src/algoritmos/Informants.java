/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritmos;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Andrey
 */
public class Informants {
    public static void main (String args[])
    {
        Scanner scanner= new Scanner(System.in);
        String Cadena=scanner.nextLine();
        int A=Integer.parseInt(Cadena.substring(0,1));
        Cadena=Cadena.substring(2);
        int B=Integer.parseInt(Cadena);
        while(A!=0 && B!=0)
        {
            ArrayList<Integer> Excluidos = new ArrayList<>();
            int Confianza[]=new int[A];
            for(int j=0;j<A;j++)
            {
                Confianza[j]=0;
            }
            for(int i=0;i<B;i++)
            {
                Cadena=scanner.nextLine();
                int A1=Integer.parseInt(Cadena.substring(0,1));
                Cadena=Cadena.substring(2);
                int B1=Integer.parseInt(Cadena);
                
                
                
                if(!Excluidos.contains(A1))
                {
                    if(B1>=0)
                    {
                        Confianza[B1-1]++;
                    }else
                    {
                        B1=B1*-1;
                        if(!Excluidos.contains(B1))
                        Excluidos.add(B1);
                    }
                }
                
            }
            int max=0;
            int confiable=0;
            for(int j=0;j<Confianza.length;j++)
            {
                if(Confianza[j]>max)
                {
                    max=Confianza[j];
                    confiable=j+1;
                }
            }
            System.out.println(confiable);
            Cadena=scanner.nextLine();
            A=Integer.parseInt(Cadena.substring(0,1));
            Cadena=Cadena.substring(2);
            B=Integer.parseInt(Cadena);
        }
    }
}
