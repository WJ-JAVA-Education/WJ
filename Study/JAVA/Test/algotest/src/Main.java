import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
//        Solution sol = new Solution();
//
//        int[] array = {1, 5, 2, 6, 3, 7, 4};
//        int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
//        int[] result = Solution.solution(array, commands);
//        for(int i : result) {
//            System.out.print(i + " ");
//        }
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);

        stack.pop();

        System.out.println(stack.toString());

        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        queue.add(2);
        queue.poll();
        System.out.println(queue.toString());
        Deque<Integer> deque = new LinkedList<>();
        deque.addFirst(1);
        deque.addFirst(2);
        System.out.println(deque.toString());
    }
}
