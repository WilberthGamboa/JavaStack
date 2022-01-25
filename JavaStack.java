import java.util.Scanner;
import java.util.Stack;

public class JavaStack {

    private Stack<Long> pilarKny = new Stack<Long>();

    public void eleccion() {
        int opcion;
        long valorPila;
        Scanner reader = new Scanner(System.in);
        Scanner readerFunciones = new Scanner(System.in);

        System.out.println(
                "1)Agregar, 2)Eliminar 3)Consultar Top 4)Consultar Vacio 5)Salir del programa");
        try {
            do {
                System.out.println("Inserte la opcion");
                opcion = reader.nextInt();

                switch (opcion) {
                    case 1:
                        System.out.println("Inserte el valor a agregar");
                        valorPila = readerFunciones.nextLong();
                        pilarKny.push(valorPila);
                        break;
                    case 2:

                        if (pilarKny.isEmpty()) {
                            System.out.println("Pila vacia, no se puede eliminar");
                        } else {
                            System.out.println("Se ha eliminado el valor " + pilarKny.peek());
                            pilarKny.pop();
                        }
                        break;
                    case 3:
                    if (pilarKny.isEmpty()) {
                        System.out.println("Pila vacia, no hay tope");
                    } else {
                        System.out.println("El tope es: " + pilarKny.peek());
                    }

                        

                        break;
                    case 4:
                        if (pilarKny.isEmpty()) {
                            System.out.println("La pila está vacía");
                        } else {
                            System.out.println("La pila no está vacía y el tope es:" + pilarKny.peek());

                        }
                        break;
                    case 5:

                        break;

                    default:
                        break;

                }

            } while (opcion != 5);

        } catch (Exception e) {
            reader.close();
            readerFunciones.close();
            // TODO: handle exception
        }

    }

}
