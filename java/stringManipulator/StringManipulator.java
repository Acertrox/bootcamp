package stringmanipulator;

public class StringManipulator {
    public String trimAndConcat(String str1, String str2){
        String resultado = str1.trim()+str2.trim();
        return resultado;
    }
    public int getIndexOrNull(String str, char letter){
        return str.indexOf(letter);
    }
    public int getIndexOrNull(String str, String substr){
        return str.indexOf(substr);
    }
    public String concatSubstring(String str, int inicio, int fin, String str2){
        String resultado = str.substring(inicio, fin)+str2;
        return resultado;
    }
}
