package Day_13.Bhavuk;

public class PermutationWithCaseChange {
    public static void main(String[] args) {
        Recursion1 recursion1 = new Recursion1();
        recursion1.permutationWithSpaces("ab","");
    }
}
class Recursion1{
    public void permutationWithSpaces(String input,String output){
        if (input.isEmpty()) {
            System.out.println(output);
            return;
        }
        StringBuilder stringBuilder = new StringBuilder(output);
        String output1 = String.valueOf(stringBuilder.append(input.charAt(0)));
        String output2 = String.valueOf(stringBuilder);
        if (stringBuilder.length() > 0) {
            char ch = Character.toUpperCase(stringBuilder.charAt(stringBuilder.length() - 1));
            stringBuilder.setCharAt(stringBuilder.length() - 1, ch);
            output2 = stringBuilder.toString();
        }
        input = input.substring(1);
        permutationWithSpaces(input, output1);
        permutationWithSpaces(input, output2);
        return;
    }
}
