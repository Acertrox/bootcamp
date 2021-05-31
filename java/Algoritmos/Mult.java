package bootcamp.java.algoritmos;

public class Mult{
    public static void main(String[] args){
        int result = Multiplicar(3,5,7);
        System.out.println(result);
        String result2 = Descomponer(1542);
        System.out.println(result2);
    }
    public static int Multiplicar(int num1,int num2,int num3){
        int sum = 0;
        for(int i=1; i<=num2; i++){
            sum+=num1;
        }
        int temp = sum;
        for(int i=1; i<num3; i++){
            sum+= temp;
        }
        return sum;
    }
    public static String Descomponer(Integer num){
        String newNum = num.toString();
        String output = newNum+" = ";
        for(int i=0; i<newNum.length(); i++){
            if(newNum.charAt(i)!='0'){
                output+=newNum.charAt(i);
                int count = newNum.length()-1-i;
                while(count>0){
                    output+="0";
                    count-=1;
                } 
                if (i<newNum.length()-1){
                    output+=" + ";
                }
            }
        }
        return output;
    }
}