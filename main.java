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
                calcularEOQClasico(sc);
            }
            case 2-> {

            }
        }    
        }while(opcion!=3);
    }
    public static void calcularEOQClasico (Scanner sc){
        System.out.println("Ingresa la demanda por unidad de tiempo (D):");
        double D = sc.nextDouble();
        System.out.println("Ingresa el costo por pedido (K):");
        double K = sc.nextDouble();
        System.out.println("Ingresa costo de mantenimiento por unidad en el mismo  periodo de la demanda (h):");
        double h = sc.nextDouble();
        System.out.println("Ingresa el tiempo de entrega (L):");
        double L = sc.nextDouble();
        
        double y= Math.sqrt((2*K*D)/h);
        double t0=y/D;
        int n=(int) (L/t0);
        double Lc=L-n*t0;
        double ROP=D*Lc;

        System.out.println("RESULTADOS DEL MODELO EOQ: ");
        System.out.println("Cantidad economica de pedido (EOQ): "+ y);
        System.out.println("Duracion del ciclo (t0): " + t0);
        System.out.println("Numero de pedidos dentro del tiempo de entrega (n): " + n);
        System.out.println("Tiempo restante (Lc): " + Lc);
        System.out.println("Punto de reorden (ROP): " + ROP);
        
    }
}