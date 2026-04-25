
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author srosr
 */
public class ejercicio2 {
    public static void main(String[]args){
        Scanner lector= new Scanner(System.in);
        double descuento = 0;
        System.out.print("Ingrese la pension base:");
        double pension = lector.nextDouble();
        System.out.print("Ingrese el promedio ponderado:");
        double promedio= lector.nextDouble();
        System.out.print("¿pagara al contado? (1:Si/2:No):");
        int contado= lector.nextInt();
        
        if(promedio>=18&&promedio<=20){
            descuento=0.20;
        }else if (promedio>=15&&promedio<=17.99){
            descuento=0.10;
        }else if(promedio>=13&&promedio<=14.99){
            descuento=0.05;
        }else{
            descuento=0.0;
        }
        double montodescuento = pension * descuento;
        double bono=(contado==1)? 50:0;
        double total= pension-montodescuento-bono;
        
        System.out.println("---DESGLOSE DE MATRICULA---");
        System.out.printf("Pension base: S/ %.2f\n", pension);
        System.out.printf("Descuento por promedio(%.0f%%): S/ %.2f\n", descuento *100, montodescuento);
        System.out.printf("Bono pago al contado: S/ %.2f\n", bono);
        System.out.printf("Monto final a pagar: S/ %.2f\n", total);
    }
}
