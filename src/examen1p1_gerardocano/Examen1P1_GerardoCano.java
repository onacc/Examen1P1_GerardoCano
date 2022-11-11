/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examen1p1_gerardocano;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author gcano
 */
public class Examen1P1_GerardoCano {
static Scanner read = new Scanner (System.in);
static Random random = new Random();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int op;
        do{
            System.out.println("Menu");
            System.out.println("1.Dvisores Primos");
            System.out.println("2.Contorno Piramide");
            System.out.println("3.Vecinos");
            System.out.println("4.Salir");
        op =read.nextInt();
        switch(op){
            case 1:
                System.out.println("Ingrese un numero entero ");
                String n = read.next();
                System.out.println("Los numero primos que dividen el numero "+n+" son "+primos(n));
            break;
            case 2:
                System.out.println("Ingrese un entero impar ");
                int N = read.nextInt();
                contorno(N);
            break;
            case 3:
                System.out.println("Ingrese una cadena ");
                String cad = read.next();
                System.out.println(vecinos(cad));
            break;
            case 4:
                System.out.println("Saliendo");
            break;
        }
        }while(op!=0);
    }
    public static String primos(String n){
        int N, res;
        String divs="", divs1="";
        N = Integer.parseInt(n);
        int int2 = 2;
        for (int i = 1; i <=N; i++) {
           res=N/int2;
        boolean verif = false;
        while (int2 <= res / 2){
            if (res % i == 0){
            verif = true;
                   break;
                       }
                  int2++;
               if (!verif){
                 divs1+=res+",";
               }
               else{
                    res=0;           
              }}
        if(N/2!=0){
            divs="2,"+divs1;
        }
        }
        return "1,"+divs+n;
    }
    public static void contorno(int N){
        if(N%2==0){
            System.out.println("Opcion invalida");
            System.out.println("Ingrese un numero impar");
        }
        
        else{
            for (int i = 0; i <=N; i++) {
                System.out.print("");
                for (int j = 0; j <= i; j++) {
                    System.out.print("+");
                }
                for (int j = 0; j <= N; j++) {
                    System.out.print("");
                }
                System.out.println("");
            }
            
        }
    }
    public static String vecinos(String cad){
        int c=0,r = 0 + random.nextInt(1);
        String cad2="";
        for (int i = 0; i < cad.toLowerCase().length(); i++) {
            char letr = cad.charAt(i);
            if (letr>='a'&&letr<='z'){//verif
                c++;
            }}
            if(c!=cad.length()){
                System.out.println("Ingrese una cadena que solo contenga letras ");
            }
            else {
               for (int k = 64; k <= 123; k++) {//ASCII del @ a {
                        for (int j = 0; j < cad.length(); j++) {
                            char letr = cad.charAt(j);
                            if(r==0){
                                k = (int)letr-1;
                                cad2+=cad.charAt(k);
                            }
                            else if(r==1){
                                k = (int)letr+1;
                                cad2+=cad.charAt(k);
                            }}}}
            
         return cad2;
                                
    }
    
}
