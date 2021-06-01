package puzzleJava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class PuzzleJava {
    public ArrayList<Integer> mayorQue(ArrayList<Integer> arreglo, int valor){
        ArrayList<Integer> resultado = new ArrayList<>();
        int sum = 0;
        for (Integer i : arreglo) {
            sum += i.intValue();
            if (i > valor){
                resultado.add(i);
            }
        }
        System.out.println(sum);
        return resultado;
    }
    
    
    public ArrayList<String> masDe5(ArrayList<String> arreglo){
        ArrayList<String> resultado = new ArrayList<>();
        Collections.shuffle(arreglo);
        for (String string : arreglo) {
            if (string.length()>5) {
                resultado.add(string);
            }
            System.out.println(string);
        }
        return resultado;
    }

    public void crearAlfabeto(){
        ArrayList<Character> resultado = new ArrayList<>();
        for (int i = 97; i <= 122; i++) {
            resultado.add((char)i);
        }
        Collections.shuffle(resultado);
        if (resultado.get(0) == 'a' || resultado.get(0) == 'e' || resultado.get(0) == 'i' || resultado.get(0) == 'o' || resultado.get(0) == 'u') {
            System.out.println("la primera letra es vocal!");
        }
        else{
            System.out.println("la primera letra es: "+resultado.get(0));
        }
        
        System.out.println("la ultima letra es: "+resultado.get(resultado.size()-1));
    }

    public ArrayList<Integer> creaListaRandom(int inicio, int fin, int cantidad){
        ArrayList<Integer> resultado = new ArrayList<>();
        Random r = new Random();
        for (int i = 0; i < cantidad; i++) {
            resultado.add(r.nextInt(fin-inicio+1)+inicio);
        }
        return resultado;
    }

    public int minList(ArrayList<Integer> lista){
        Integer minimo = lista.get(0);
        for (int i = 1; i < lista.size(); i++) {
            if (minimo>lista.get(i)) {
                minimo = lista.get(i);
            }
        }
        return minimo.intValue();
    }

    public int maxList(ArrayList<Integer> lista){
        Integer maximo = lista.get(0);
        for (int i = 1; i < lista.size(); i++) {
            if (maximo<lista.get(i)) {
                maximo = lista.get(i);
            }
        }
        return maximo.intValue();
    }

    public String createString(){
        Random r = new Random();
        String resultado = "";
        for (int i = 0; i < 5; i++) {
            resultado+= (char) (r.nextInt(126-33)+33) ;
        }
        return resultado;
    }

    public String joinString(int cantidad, String separador){
        String resultado = "";
        for (int i = 0; i < cantidad; i++) {
            resultado += createString() + separador;
        }
        return resultado;
    }

    public void printArray(ArrayList<Integer> lista){
        for (Integer object : lista) {
            System.out.println(object);
        }
    }
}
