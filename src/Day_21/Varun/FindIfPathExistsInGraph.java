package Day_21.Varun;
import java.util.*;
public class FindIfPathExistsInGraph {
    public static void main(String[] args) {
        int[][] edges = {
                {0,1},{0,2},{3,5},{5,4},{4,3}
        };
        int n = 6;
        int start = 0;
        int end = 5;
        boolean pathExists = findPath(n,edges,start,end);
        System.out.println(pathExists);
    }

    private static boolean findPath(int n, int[][] edges, int source, int destination) {
        List<List<Integer>> list = new ArrayList<>();
        for(int i = 0; i < n; i++){
            list.add(new ArrayList<>());
        }
        for(int[] i : edges){
            list.get(i[0]).add(i[1]);
            list.get(i[1]).add(i[0]);
        }
        boolean[] vis = new boolean[n];
        Queue<Integer> queue = new LinkedList<>();
        queue.add(source);
        vis[source] = true;
        while(!queue.isEmpty()){
            Integer out = queue.poll();
            if(out == destination) return true;
            for(Integer i : list.get(out)){
                if(!vis[i]){
                    queue.add(i);
                    vis[i] = true;
                }
            }
        }
        return false;
    }
}
