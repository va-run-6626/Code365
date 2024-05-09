package Day_3.Varun;

public class WordSearch {
    public static void main(String[] args) {
        char[][] matrix = {
                {'A','B','C','E'},
                {'S','F','C','S'},
                {'A','D','E','E'}
        };
        String word = "ABCCED";
        boolean found = exist(matrix,word);
        System.out.println(found);
    }

    private static boolean exist(char[][] matrix, String word) {
        if(matrix == null ||matrix.length == 0 || word.isEmpty()){
            return false;
        }
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                if(dfs(matrix, i, j, word, 0)){
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean dfs(char[][] matrix, int i, int j, String word, int k) {
        if(k == word.length()) return true;
        if(i < 0 || i >= matrix.length || j < 0 || j > matrix[0].length || matrix[i][j] != word.charAt(k)){
            return false;
        }
        char temp = matrix[i][j];
        matrix[i][j] = '#';
        boolean found = dfs(matrix,i-1,j,word,k+1)||dfs(matrix,i+1,j,word,k+1)||dfs(matrix,i,j-1,word,k+1)||dfs(matrix,i,j+1,word,k+1);
        matrix[i][j] = temp;
        return found;
    }
}
