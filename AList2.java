import java.util.*;
public class AList2 {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        int eleccion;
        Integer contador=0;
        ArrayList <Integer> numeros=new ArrayList<Integer>(5);
        
        
        for (int i=0; i<5; i++){
            System.out.println("Introduce el valor en la posición " + i);
            numeros.add(entrada.nextInt());
        }
        System.out.println("¿Qué desea hacer a continuación?");
        System.out.println("1. Calcular la media");
        System.out.println("2. Mostrar todos los valores y calcular media");
        eleccion=entrada.nextInt();

        switch (eleccion) {
            case 1: ;
            System.out.print(" La media de los números introducidos es: ");
            for (int i=0; i<numeros.size(); i++){
                contador=contador+numeros.get(i);
                
            }
            System.out.println(contador/numeros.size());
                break;
        
            case 2: 
            System.out.println("Los números son los siguientes");
            for (int i=0; i<numeros.size(); i++){
                System.out.print(numeros.get(i) + " ");
            }
            System.out.println("");
            
            for (int i=0; i<numeros.size(); i++){
                contador=contador+numeros.get(i);
                
            }

            System.out.print(" La media de los números introducidos es: " + contador/numeros.size() );
                break;
        }

        entrada.close();
    }
}
