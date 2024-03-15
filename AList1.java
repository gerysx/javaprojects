import java.util.*;

public class AList1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int eleccion = 0;
        String escribir = "";
        String mod = "";
        ArrayList<String> empleados = new ArrayList<String>();
        int salir = 0;
        while (salir == 0) {
            System.out.println("Seleccione que le gustaría hacer");
            System.out.println("1. Agregar nombres");
            System.out.println("2. Modificar nombres");
            System.out.println("3. Borrar nombres");
            System.out.println("4. Buscar un nombre");
            System.out.println("5. Visualizar todos los nombres");
            System.out.println("6. Salir");
            eleccion = entrada.nextInt();

            switch (eleccion) {
                case 1:
                    System.out.println("¿Cúantos nombres desea añadir?");
                    eleccion = entrada.nextInt();
                    for (int i = 0; i < eleccion; i++) {
                        System.out.println("Escriba el nombre que desea añadir: " + (i + 1));
                        empleados.add(entrada.next());
                    }
                    System.out.println("La operación se realizó con éxito");

                    break;

                case 2:
                    do {
                        System.out.println("¿Cómo desea modificar: por posición (1) o por nombre (2)?");
                        eleccion = entrada.nextInt();
                        if (eleccion != 1 && eleccion != 2) {
                            System.out.println("Introduzca un valor correcto");
                        }
                    } while (eleccion != 1 & eleccion != 2);

                    if (eleccion == 1) {
                        System.out.println("¿Qué posición quiere modificar?");
                        for (int i = 0; i < empleados.size(); i++) {
                            System.out.println((i) + ":" + empleados.get(i));
                        }
                        eleccion = entrada.nextInt();
                        System.out.println("Escriba el nuevo nombre");
                        empleados.remove(eleccion);
                        empleados.add(eleccion, entrada.next());
                        System.out.println("La operación se realizó con éxito");
                    } else if (eleccion == 2) {
                        System.out.println("¿Qué nombre desea modificar?");
                        for (int i = 0; i < empleados.size(); i++) {
                            System.out.println((i + 1) + ":" + empleados.get(i));
                        }
                        escribir = entrada.next();
                        System.out.println("Escriba el nuevo nombre");
                        mod = entrada.next();
                        int indice = empleados.indexOf(escribir);
                        if (indice > 0) {
                            empleados.set(indice, mod);
                            System.out.println("La operación se realizó con éxito");

                        } else {
                            System.out.println("El nombre que quiso modificar no se encuentra en el sistema");
                        }

                    }

                    break;

                case 3:
                    do {
                        System.out.println("¿Cómo desea borrar: por posición (1) o por nombre (2)?");
                        eleccion = entrada.nextInt();
                        if (eleccion != 1 && eleccion != 2) {
                            System.out.println("Introduzca un valor correcto");
                        }
                    } while (eleccion != 1 & eleccion != 2);

                    if (eleccion == 1) {
                        System.out.println("Seleccione el empleado que desea borrar");
                        for (int i = 0; i < empleados.size(); i++) {
                            System.out.println((i + 1) + ":" + empleados.get(i));
                        }
                        eleccion = entrada.nextInt();
                        empleados.remove(eleccion - 1);
                        System.out.println("La operación se realizó con éxtio");
                    } else if (eleccion == 2) {
                        System.out.println("¿Qué nombre desea modificar?");
                        for (int i = 0; i < empleados.size(); i++) {
                            System.out.println((i + 1) + ":" + empleados.get(i));
                        }
                        escribir = entrada.next();
                        int indice = empleados.indexOf(escribir);
                        empleados.remove(indice);
                        System.out.println("La operación se realizó con éxtio");
                    }
                    break;

                case 4:
                    System.out.println("¿Qué nombre desea saber si está en nuestro sistema?");
                    escribir = entrada.next();
                    if (empleados.contains(escribir) == true) {
                        int indice =empleados.indexOf(escribir);
                        System.out.println(escribir + " se ecuentra en nuestro sistema de empleados en la posición: " + indice);
                    } else {
                        System.out.println(escribir + " no se ecuentra en nuestro sistema de empleados. ");
                    }
                    break;

                case 5:
                    System.out.println("Estos son todos los datos de los empleados");
                    for (int i = 0; i < empleados.size(); i++) {
                        System.out.println((i + 1) + ":" + empleados.get(i));
                    }
                    break;

                case 6:
                    System.out.println("Muchas gracias por su tiempo, hasta pronto");
                    salir++;
                    break;

            }
        }
        entrada.close();
    }
}