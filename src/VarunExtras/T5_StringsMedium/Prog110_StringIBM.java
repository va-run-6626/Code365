package VarunExtras.T5_StringsMedium;
import java.util.*;
public class Prog110_StringIBM {
    public static void main(String[] args) {
        int n = 37;
        List<Integer> ans = Solve(n);
        System.out.println(ans);
    }

    private static List<Integer> Solve(int n) {
        String binaryString = Integer.toBinaryString(n);
        int numberOfOnes = countOnes(binaryString);
        List<Integer> onePositions = findOnePositions(binaryString);
        List<Integer> ans = new ArrayList<>();
        ans.add(numberOfOnes);
        for(Integer i : onePositions){
            ans.add(i);
        }
        return ans;
    }
    public static int countOnes(String binaryString) {
        int count = 0;
        for (char c : binaryString.toCharArray()) {
            if (c == '1') {
                count++;
            }
        }
        return count;
    }

    public static List<Integer> findOnePositions(String binaryString) {
        List<Integer> positions = new ArrayList<>();
        for (int i = 0; i < binaryString.length(); i++) {
            if (binaryString.charAt(i) == '1') {
                positions.add(i + 1);
            }
        }
        Collections.sort(positions);
        return positions;
    }
}
