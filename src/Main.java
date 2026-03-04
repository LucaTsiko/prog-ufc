import java.util.Scanner;

public class Main{
    public static void main(String[] args){

    }

    public static int pedirNumeroPeleadores(int cantidadMaxPeleadores) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el numero de peleadores: ");
        cantidadMaxPeleadores = sc.nextInt();

        return cantidadMaxPeleadores;
    }
}