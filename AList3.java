import java.util.*;
public class AList3 {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        ArrayList <String> animals=new ArrayList<String>();
        int salir=0;
        String eleccion="";
        while (salir==0){
            System.out.println("Introduce animales para introducir en su ArrayList");
            eleccion=entrada.next();
            if (eleccion.equalsIgnoreCase("salir")==false){                
                animals.add(eleccion);
                System.out.println("Añadido con éxito");
            for (int i=0; i<animals.size(); i++){
                System.out.println((i+1) + ": " + animals.get(i));
            }
        } else {
            salir=1;
        }
        }
        entrada.close();
    }
}
