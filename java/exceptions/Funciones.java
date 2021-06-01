package exceptions;

import java.util.ArrayList;

public class Funciones {
    public void castearArreglo(ArrayList<Object> arreglo){
        for (int i=0; i<arreglo.size(); i++) {
            try {
                int castedValue = (int) arreglo.get(i);
                System.out.println(castedValue+" works!! \n");
            } catch (ClassCastException e) {
                System.out.println(e+"\n"+arreglo.get(i)+" doesn't work at index: "+i+"\n");
                continue;
            }
        }
    }
}
