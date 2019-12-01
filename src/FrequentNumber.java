public class FrequentNumber {
    public static void main(String[] args) {
        int[] arr = {1,2,3,3,7};
        int[] counters = new int[10]; //10 bo tyle mamy cyfr możliwych

        for (int i = 0; i < arr.length; i++) {
            int index = arr[i];
            counters[index]++;
        }
        for (int i = 0; i < 10; i++) { //counters = 10

            System.out.println(i + " -> " + counters[i]);
        }

    }
}
