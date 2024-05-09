package Day_8.Varun;
import java.util.*;
public class NumberofStudentsUnabletoEatLunch {
    public static void main(String[] args) {
        int[] students = {1,1,1,0,0,1};
        int[] sandwiches = {1,0,0,0,1,1};
        int cnt = solution1(students, sandwiches);
        System.out.println("Students who did not eat  : "+ cnt);
        cnt = solution2(students,sandwiches);
        System.out.println("Students who did not eat  : "+ cnt);
    }
    private static int solution1(int[] students, int[] sandwiches) {
        Stack<Integer> stack = new Stack<>();
        Queue<Integer> queue = new LinkedList<>();
        int cnt = 0;
        for(int i = sandwiches.length-1; i >= 0; i--){
            stack.push(sandwiches[i]);
        }
        for(int i = 0; i < students.length; i++){
            queue.add(students[i]);
        }

        while(!queue.isEmpty()){
            int size = queue.size();
            int preSize = size;
            while(size > 0){
                int stu = queue.poll();
                if(stack.peek() == stu){
                    stack.pop();
                    cnt++;
                }else{
                    queue.add(stu);
                }
                size--;
            }
            if(queue.size() == preSize) break;
        }
        return students.length - cnt;

    }
    private static int solution2(int[] students, int[] sandwiches) {
        int cir = 0;
        int sqr = 0;
        for(int i : students){
            if(i == 1)sqr++;
            else cir++;
        }
        for(int i : sandwiches){
            if(i == 1 && sqr > 0) sqr--;
            else if(i == 0 && cir > 0)cir--;
            else return sqr + cir;
        }
        return 0;
    }


}
