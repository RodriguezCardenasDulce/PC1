
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author srosr
 */
public class ejercicio1 {
    public static void main(String[]args){
        Scanner lector=new Scanner(System.in);
        
        System.out.print("Ingrese horas(0-23):");
        int h= lector.nextInt();
        System.out.print("Ingrese minutos(0-59):");
        int m= lector.nextInt();
        System.out.print("Ingrese segundos(0-59):");
        int s= lector.nextInt();
        boolean condicion =((h>=0&&h<=23)&&(m>=0&&m<=59)&&(s>=0&&s<=59));
        
        if (condicion){
            s++;
            if(s==60){
                s=0;
                m++;
            }
            if(m==60){
                m=0;
                h++;
            }
            if(h==24){
                h=0;
            }
            System.out.printf("La hora en el siguiente segundo sera: %02d:%02d:%02d\n",h,m,s);
            
        }else{
            System.out.println("Error: hora invalida");
        }
    }
}
