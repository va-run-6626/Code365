package Day_13.Bhavuk;

public class PermutationWithSpaces {
    public static void main(String[] args) {
        Recursion recursion = new Recursion();
        recursion.permutationWithSpaces("BC","A");
    }
}

class Recursion{
    public void permutationWithSpaces(String input,String output){
        if(input.isEmpty()){
            System.out.println(output);
            return;
        }
        StringBuilder stringBuilder = new StringBuilder(output);
        String output1 = String.valueOf(stringBuilder.append(" "+input.charAt(0)));
        String output2 = String.valueOf(stringBuilder.deleteCharAt(stringBuilder.length()-2));
        input  = input.substring(1);
        permutationWithSpaces(input,output1);
        permutationWithSpaces(input,output2);
        return;
    }
}
