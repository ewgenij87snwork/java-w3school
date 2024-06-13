public class Arrays {
    public static void main(String[] args) {
//        int[][] sample = {{1, 2, 3}, {4, 5, 6}, {8,9}};
//        int x = sample[2][0];
//        System.out.println(x);


        int[] arr = new int[3];
        for (int i = 0; i < 3; i++) {
            arr[i] = i;
        }

        int res = arr[0] + arr[2];
        System.out.println(res);
    }
}
