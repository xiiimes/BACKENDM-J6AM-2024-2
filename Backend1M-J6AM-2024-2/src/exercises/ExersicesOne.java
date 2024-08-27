package exercises;

import java.util.Scanner;

public class ExersicesOne {
    // aqui vamos a ir introduciendo a orientación a objetos

    static int customerId;
    static String customerName;
    static String email;
    static String password;
    static boolean status;

    static Scanner sc = new Scanner(System.in);



    public static void main(String[] args){


        createCostumer();
        printCostumerData();
        selectStatus();

    }
    public static void createCostumer(){
        System.out.println("ingrese el ID: ");
            customerId = sc.nextInt();
            sc.nextLine();
        System.out.println("Ingrese el Nombre: ");
            customerName = sc.nextLine();
        System.out.println("Ingrese el Email: ");
            email = sc.nextLine();
        System.out.println("Ingrese la contraseña: ");
            password = sc.nextLine();
        System.out.println("Seleccione un estado: ");
    }

    public static void printCostumerData(){

        System.out.println("Id" + customerId+ "\n" +
                "Nombre" + customerName + "\n" +
                "Correo" + email + "\n" +
                "Contraseña" + password + "\n" +
                "Status" );
    }

    public static String selectStatus(){
        if (selection == 1){

            String active = String.valueOf(StatusCustomer.TRUE);

            return active;

        } else if (selection == 2) {
            String inactive = String.valueOf(StatusCustomer.FALSE)
        }
    }




}
