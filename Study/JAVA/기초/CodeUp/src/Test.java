
public class Test {

    public static void main(String[] args) {

        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = new int[arr1.length];
        int temp1 = 0;
        int temp2 = 0;

        for (int i = 1; i < arr1.length - 1; i++) {
            if (temp1 < arr2[i]) {
                temp1 = arr2[i];
            } else if (temp1 > temp2) {
                arr2[i] = temp1;
            } else {
                arr2[i] = temp2;
            }

        }

    }

}
