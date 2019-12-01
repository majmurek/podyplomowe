public class Array3D {
    public static void main(String[] args) {

        int[][][] arr = {{{5},{5,7,8,9},{4,4}},{{3},{3,3,3,3}}};

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                for (int k = 0; k < arr.length; k++) {
                    System.out.print("arr[" + i + "][" + j + "][" + k + "] = ");
                    System.out.println(arr[i][j][k]);

                }
            }
        }
    }
}