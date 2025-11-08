//Modelos de inventarios


import java.util.Scanner;

public class main{
    public static void main(String []args){
        Scanner sc= new Scanner (System.in);
        byte opcion=0;
        do{
            System.out.println("\n\n\t Modelos de inventarios (EOQ)");
            System.out.println("1.Modelo EOQ Clasico");
            System.out.println("2.Modelo EOQ con descuento");
            System.out.println("Salir");
            System.out.println("Opcion");
            opcion=sc.nextByte();

        switch (opcion){
            case 1-> {

            }
            case 2-> {

            }
        }    
        }while(opcion!=3);
    }

    }
}