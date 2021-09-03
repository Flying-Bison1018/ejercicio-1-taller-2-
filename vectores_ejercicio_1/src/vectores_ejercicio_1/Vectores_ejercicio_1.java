/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vectores_ejercicio_1;

/**
 *
 * @author PC
 */
import java.util.Scanner;
public class Vectores_ejercicio_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int n,i,totalProductos=0,aux;
        double totalIngreso=0,aux2;
        long masVendido=0,masCostoso=0;
             
            do{
            System.out.println("Introduce la cantidad de productos vendidos");
            n= entrada.nextInt();
            }while(n<=0);
            
            long[] vector_a = new long [n]; //almacena los codigos
            double[] vector_b = new double [n]; //almacena el valor de venta de cada producto
            int[] vector_c = new int [n]; //cantidad de unidades vendidas
            
            System.out.println("Almacenar codigos");
            for (i=0; i<n; i++)
            {    
                vector_a[i]=entrada.nextLong();
            }
            System.out.println("Digite el valor de venta (Cada producto)");
            for (i=0; i<n; i++)
            {               
                vector_b[i]=entrada.nextDouble();
                totalIngreso = vector_b[i]+totalIngreso;
            }
            System.out.println("Almacenar Unidades");
            for (i=0; i<n; i++)
            {     
                vector_c[i]=entrada.nextInt();
                totalProductos = vector_c[i]+totalProductos;
            }
            
           aux = vector_c[0];
           aux2 =vector_b[0];
           for (i=0; i<n; i++)
           {
               if (vector_c[i]>aux)
               {
                   aux = vector_c[i];
               }
               masVendido = vector_a[i];
               
               if (vector_b[i]>aux2)
               {
                   aux2 = vector_b[i];
               }
               masCostoso =vector_a[i];
           }
            System.out.println("---Informe---");
            System.out.println("Total Porductos vendidos al dia es: "+totalProductos);
            System.out.println("Total Ingresos por venta del dia es: "+totalIngreso);
            System.out.println("El producto mas vendio es: "+masVendido);
            System.out.println("El mas costoso es:"+masCostoso);
           
       }
          
 }
