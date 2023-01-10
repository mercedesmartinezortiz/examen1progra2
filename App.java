
import java.util.Scanner;

public class App {
    private Integrante integrante;
    private String mmClave;
    private String mmUsuario;
    static String mmUserProfe = "profe";
    static String mmPassProfe = "1234";
    static String mmUser = "mercedes.martinez@epn.edu.ec";
    static String mmPass = "1752864379";

    static String mmTema = "mercedes.martinez@epn.edu.ec";
    private String mmCedula;
    private String mmNombreCompleto;
    private String mmCorreoEleectronico;

    public Boolean mmLoginMercedes() {

        if (mmUsuario.equals(mmUserProfe) && mmClave.equals(mmPassProfe)) {
            return true;
        }
        if (mmUsuario.equals(mmUser) && mmClave.equals(mmPass)) {
            return true;
        }
        return false;

    }

    void mmMenu() {
        System.out.println("------------------------------------------");
        System.out.println("NETWORKIN DE " + mmTema);
        System.out.println("------------------------------------------");
        System.out.println(" Usuario" + this.mmUsuario);
        int x = 10;
        Scanner leer = new Scanner(System.in);
        while (x != 0) {
            System.out.println("MENU:");

            System.out.println("1.- AGREGAR AMIGO");
            System.out.println("2.- AGREGAR AMIGO DE AMIGO");
            System.out.println("3.- MOSTRAR NETWORK");
            System.out.println("0.- SALIR");
            x = leer.nextInt();
            switch (x) {
                case 1: {
                    System.out.println("------------------------------------------");
                    System.out.println("NETWORKIN DE " + mmTema);
                    System.out.println("------------------------------------------");
                    System.out.println(" Usuario" + this.mmUsuario);
                    this.integrante.addAmigo();
                    break;

                }
                case 2: {

                    System.out.println("------------------------------------------");
                    System.out.println("NETWORKIN DE " + mmTema);
                    System.out.println("------------------------------------------");
                    System.out.println(" Usuario" + this.mmUsuario);
                    this.integrante.addAmigoDe();
                    break;

                }
                case 3: {

                    break;

                }
                case 0: {

                    System.out.println("SALIR.");

                    break;

                }
                default: {
                    System.out.println("Opcion incorrecta");

                }

            }
        }
    }



    public static void main(String[] args) {
        System.out.println("------------------------------------------");
        System.out.println("NETWORKIN DE " + mmTema);
        System.out.println("------------------------------------------");
        int mmIntentos = 3;
        App mmApp = new App();
        while (mmIntentos > 0) {
            Scanner leer = new Scanner(System.in);
            try {
                System.out.println("-----------------");
                System.out.println("+usuario:");
                mmApp.mmUsuario = leer.nextLine();
                System.out.println("clave:");
                mmApp.mmClave = leer.nextLine();
                System.out.println("-----------------");
                mmIntentos--;
                System.out.println("*Nro. de intentos:" + mmIntentos);
                if (mmApp.mmLoginMercedes()) {
                    System.out.println(" Bienvenido " + mmApp.mmUsuario);
                    System.out.println(" <+> Por favor registra: ");
                    System.out.println("+ Codigo:");
                    int mmCodigo = leer.nextInt();
                    leer.nextLine();
                    System.out.println("+ Nombre o nick :");
                    String mmNick = leer.nextLine();
                    leer.nextLine();
                    System.out.println("+ Edad :");
                    int mmEdad = leer.nextInt();
                    leer.nextLine();
                    System.out.println("+ Sexo :");
                    String mmSexo = leer.nextLine();

                    mmApp.integrante = new Integrante(mmCodigo, mmNick);
                    mmApp.mmMenu();

                }
            } catch (Exception e) {
                System.out.println("Error " + e.getMessage());
            }

        }
        System.out.print(" Lo sentimos tu usuario y clave son incorrectos..!");

    }

}
