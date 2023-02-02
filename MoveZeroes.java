public class MoveZeroes {
    public static void moveZeroes(int[] nums) {
        int zeroes = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0)
                zeroes++;
            else if (zeroes > 0) {
                int temp = nums[i];
                nums[i] = 0;
                nums[i - zeroes] = temp;
            }
        }

    }

    public static void main(String[] args) {

        int[] firstArray = new int[6];
        int[] secondArray = new int[6];
        firstArray[0] = 0;
        firstArray[1] = 1;
        firstArray[2] = 0;
        firstArray[3] = 3;
        firstArray[4] = 12;

        secondArray[0] = 0;
        secondArray[1] = 0;
        secondArray[2] = 3;
        secondArray[3] = 0;
        secondArray[4] = 5;

        System.out.print("The first array is: ");
        for (int i = 0; i < firstArray.length; i++) {
            System.out.print(firstArray[i] + ",");
        }

        System.out.println();

        System.out.print("The second array is: ");
        for (int i = 0; i < secondArray.length; i++) {
            System.out.print(secondArray[i] + ",");
        }

        System.out.println();

        moveZeroes(firstArray);
        moveZeroes(secondArray);

        System.out.print("The first array after move zeroes called is: ");
        for (int i = 0; i < firstArray.length; i++) {
            System.out.print(firstArray[i] + ",");
        }

        System.out.println();

        System.out.print("The second array after move zeroes called is: ");
        for (int i = 0; i < secondArray.length; i++) {
            System.out.print(secondArray[i] + ",");
        }

        System.out.println();

    }

}
