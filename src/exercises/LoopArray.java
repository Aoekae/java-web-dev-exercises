package exercises;

public class LoopArray {
        public static void main (String[] args) {
            int[] numberArray = {1, 1, 2, 3, 5, 8};

//            for (int index: numberArray) {
//                System.out.println(index);

            for (int index : numberArray) {

                if (index % 2 != 0) {
                    System.out.println(index);
                }
            }
        }
}
