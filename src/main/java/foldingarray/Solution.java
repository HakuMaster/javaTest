package foldingarray;

/**
 * @author liulang
 */
public class Solution {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8};
        int[] req = {0, 0, 0};
        System.out.print("折叠前：  ");
        printArray(nums);
        int[][] ints = consoleNumber(nums, req);
        for (int i = 0; i < ints.length; i++) {
            nums[i] = ints[i][0];
        }
        System.out.print("折叠后：  ");
        printArray(nums);
    }

    private static int[][] consoleNumber(int[] nums, int[] req) {
        if ((int) (Math.log(nums.length) / Math.log(2)) != req.length) {
            throw new IllegalArgumentException("参数错误！");
        }
        int num[][] = new int[1][nums.length];
        num[0] = nums;
        for (int i : req) {
            int[][] temp = new int[num.length * 2][num[0].length / 2];
            if (i == 0) {
                for (int j = 0; j < temp.length; j++) {
                    if (j < temp.length / 2) {
                        temp[j] = perversion(getLeftHalf(num[num.length - j - 1]));
                    } else {
                        temp[j] = getRightHalf(num[j - num.length]);
                    }
                }
            } else {
                for (int j = 0; j < temp.length; j++) {
                    if (j < temp.length / 2) {
                        temp[j] = perversion(getRightHalf(num[num.length - j - 1]));
                    } else {
                        temp[j] = getLeftHalf(num[j - num.length]);
                    }
                }
            }
            num = temp;
        }
        return num;
    }

    private static int[] perversion(int[] arr) {
        int[] newArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[arr.length - 1 - i];
        }
        return newArr;
    }

    private static int[] getLeftHalf(int[] arr) {
        int[] newArr = new int[arr.length / 2];
        for (int i = 0; i < newArr.length; i++) {
            newArr[i] = arr[i];
        }
        return newArr;
    }

    private static int[] getRightHalf(int[] arr) {
        int[] newArr = new int[arr.length / 2];
        for (int i = 0; i < newArr.length; i++) {
            newArr[i] = arr[newArr.length + i];
        }
        return newArr;
    }

    public static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + ", ");
        }
        System.out.println();
    }
}