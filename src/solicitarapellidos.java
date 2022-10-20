import java.util.Scanner;

public class solicitarapellidos {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String apellido1;
        String apellido2;
        String auxiliar;

        System.out.print("Introduce tu primer apellido: ");
        apellido1 = leer.nextLine(); //leer un String

        System.out.print("Introduce tu segundo apellido: ");
        apellido2 = leer.nextLine(); //leer un String

        auxiliar = apellido1;
        apellido1 = apellido2;
        apellido2 =auxiliar;

        System.out.println("Los apellidos intercambiados son:" + apellido1 + apellido2);

    }

}