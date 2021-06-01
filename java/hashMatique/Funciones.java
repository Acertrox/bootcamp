package hashMatique;

import java.util.HashMap;
import java.util.Set;

public class Funciones {
    public String extraerCancion(String titulo, HashMap<String, String> canciones){
        return canciones.get(titulo);
    }

    public String extraerCanciones(HashMap<String, String> canciones){
        String resultado = "";
        Set<String> keys = canciones.keySet();
        for (String string : keys) {
            resultado+= string +" : "+ canciones.get(string)+"\n\n";
        }
        return resultado;

    }
}
