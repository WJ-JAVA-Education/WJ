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
        /*
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
         */
        int[] arr = {13, 25, 32, 41, 53};

        int temp0 = 0;
        int temp1 = 0;
        int[] arr2 = new int[arr.length];

        for (int i = 1; i <= arr.length -1 ; i++) {
            if (temp0 < arr[i]){
                temp0 = arr[i];
            } else if (temp0 > temp1) {
                arr2[i] += temp0;
            }
        }

        for (int i : arr2) {
            System.out.println(i);
        }

    }
}