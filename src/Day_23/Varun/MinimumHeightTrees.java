package Day_23.Varun;

import java.util.*;

public class MinimumHeightTrees {
    public static void main(String[] args) {
        int[][] edges = {
                {1,0},{1,2},{1,3}
        };
        int n = 4;
        List<Integer> ans = findMinimumHeightTrees(n,edges);
        System.out.println(ans);
    }

    private static List<Integer> findMinimumHeightTrees(int n, int[][] edges) {
        List<Integer> list = new ArrayList<>();
        if(edges.length == 0){
            list.add(0);
            return list;
        }
        int[] inDegree = new int[n];
        HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();
        for(int i = 0; i < n; i++){
            map.put(i, new ArrayList<>());
        }
        for(int i = 0; i < edges.length; i++){
            inDegree[edges[i][0]]++;
            inDegree[edges[i][1]]++;
            map.get(edges[i][0]).add(edges[i][1]);
            map.get(edges[i][1]).add(edges[i][0]);
        }

        Queue<Integer> queue = new LinkedList<>();
        for(int i = 0; i < n; i++){
            if(inDegree[i] == 1) queue.add(i);
        }

        int cnt = 0;
        while(!queue.isEmpty()){
            int size = queue.size();
            cnt += size;
            for(int i = 0; i < size; i++){
                Integer out = queue.poll();
                inDegree[out]--;
                if(cnt == n) list.add(out);

                for(Integer adj : map.get(out)){
                    if(inDegree[adj] != 0){
                        inDegree[adj]--;
                        if(inDegree[adj] == 1){
                            queue.add(adj);
                        }
                    }
                }
            }
        }
        return list;
    }
}
