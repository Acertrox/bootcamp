package algoritmos.algoritmosVII;

public class Funciones {
    public String upperCase(String cadena){
        String resultado = "";
        for (int i = 0; i < cadena.length(); i++) {
            if ((int)cadena.charAt(i) >= 97 && (int)cadena.charAt(i) <= 122) {
                resultado += (char)((int)cadena.charAt(i)-32);
            }
            else{
                resultado += cadena.charAt(i);
            }
        }
        return resultado;
    }
    
    public boolean isMayusOrSpace(int ascii){
        if ((ascii>=65 && ascii<=90) || ascii==32) {
            return true;
        }
        return false;
    }


    public boolean noNumber(String[] arreglo){
        for (String string : arreglo) {

            string = upperCase(string);
            
            for (int i = 0; i < string.length(); i++) {

                int asciiletra = (int)string.charAt(i);

                if (!isMayusOrSpace(asciiletra)) {
                    return false;
                }
            }
        }
        return true;
    }

}
