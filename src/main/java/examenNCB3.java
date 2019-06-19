/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author Laboratorio
 */
public class examenNCB3 {
    public void imprimir(int[][] matriz){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j]+"\t");
            }
            System.out.println("");
        }
    }

public int[][] ejer6(int dimen, int NumInit){
          System.out.println("Ejercicio 6: ");
          int[][] matriz=new int[dimen][dimen];
         int contador=0;
          for (int i = 0; i < matriz.length ; i++) {
               for (int j = 0; j < matriz.length ; j++) {
                  if ( j<i+1){
                      matriz[i][j] = NumInit;
                      NumInit++;
                      contador++;
                     }else{
                matriz[i][j]=-1;
                }   
              }contador=0;
          }
          return matriz;
     }
public int[][] ejer26(int dimen, int NumInit){
         System.out.println("Ejercicio 26: ");
         int[][] matriz=new int[dimen][dimen];
          int contador=0;
          for (int i = 0; i< matriz.length ; i ++) {
                if(contador%2==0){
                    for (int j = matriz[0].length-1; j>=0; j--) { 
                    matriz[i][j]=NumInit; 
                    NumInit++;
                    contador++;
         }
         }else{
               for (int j = 0; j< matriz.length ; j ++) {
                matriz[i][j]=NumInit;
                NumInit++;
                contador++;
                }
            } 
            } contador=0;         
    return matriz;
    }
public int[][] ejer12(int dimen, int NumInit){
          System.out.println("Ejercicio 12: ");
          int[][] matriz=new int[dimen][dimen];
         int contador=0;
          for (int i = 0; i < matriz.length ; i++) {
              for (int j = matriz[0].length-1; j>=0; j--) {
                  if (j>=i){
                      matriz[i][j] = NumInit;
                      NumInit++;
                      contador++;
                     }else{
                matriz[i][j]=-1;
                }
            } contador=0;
        }
          return matriz;
     }
public int[][] ejer30(int dimen, int NumInit){
     System.out.println("Ejercicio 30: ");
        int[][] matriz=new int[dimen][dimen];
        for (int c = 0; c < dimen/2; c++) {
             for (int ldx = c;ldx < dimen-c-1; ldx++) {
                matriz[ldx][dimen-1-c]= NumInit;
                NumInit++;   
            }
             for (int lix = dimen-c-1;lix > c; lix--) {
                matriz[dimen-1-c][lix]= NumInit;
                NumInit++;
            }
           for (int lxx = dimen-c-1;lxx > c; lxx--) {
                matriz[lxx][c]= NumInit;
                NumInit++;  
           }
            for (int lsx = c; lsx < dimen-c-1; lsx++) {
                matriz[c][lsx]= NumInit;
             NumInit++;   
            }
        }
            if(dimen%2!=0){
                matriz[dimen/2][dimen/2]=NumInit;
            }

        return matriz;
 }
public int[][] ejer9(int dimen, int NumInit){
          System.out.println("Ejercicio 9: ");
          int[][] matriz=new int[dimen][dimen];
         int contador=0;
          for (int i = 0; i < matriz.length ; i++) {
               for (int j = 0; j < matriz.length ; j++) {
                  if (j>=dimen-(i+1)){
                      matriz[i][j] = NumInit;
                      NumInit++;
                      contador++;
                     }else{
                matriz[i][j]=-1;
                }
            } contador=0;
        }
          return matriz;
     } 
   public static void main(String[] args) {
       examenNCB3 or=new examenNCB3();
        System.out.println("INGRESE LA OPCIÓN DEL ALGORITMO QUE DESEA PROBAR");
        Scanner leer=new Scanner(System.in);
        int opcion =leer.nextInt();
        Scanner o=new Scanner(System.in);
               System.out.println("Ingrese la dimencion de la matriz: ");
               int din=o.nextInt();
               System.out.println("Ingrese el numero de inicio: ");
               int ini=o.nextInt();
               System.out.println("\n");
          while (opcion!=0) {            
            switch(opcion){
            case 1: or.imprimir(or.ejer6(5, 0)); break;
            case 2: or.imprimir(or.ejer26(5, 0)); break;
            case 3: or.imprimir(or.ejer12(5, 0)); break;
            case 4: or.imprimir(or.ejer30(5, 0)); break;
            case 5: or.imprimir(or.ejer9(5, 0)); break;
        default: System.out.println("Opción Inválida!!");break;
            }  
                 System.out.println("INGRESE LA OPCIÓN DEL ALGORITMO QUE DESEA PROBAR");            
                 opcion =leer.nextInt();
        }
    }
   
}


