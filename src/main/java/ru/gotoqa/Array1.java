package ru.gotoqa;

public class Array1 {

    //Array-1
    public boolean firstLast6(int[] nums) {
        if(nums [0] == 6 || nums [nums.length-1] == 6){
            return true;
        }else return false;

    }


    public boolean sameFirstLast(int[] nums) {
        if(nums.length < 1){
            return false;
        }

        if(nums [0] == nums [nums.length-1] & nums.length >= 1){
            return true;
        }else return false;
    }


    public boolean sameFirstLast2(int[] nums) {
        return (nums.length >= 1 && nums [0] == nums [nums.length-1]);
    }


    public int[] makePi() {
        int[] pi = {3, 1, 4};
        return pi;
    }


    public boolean commonEnd(int[] a, int[] b) {
        return (a[0] == b[0] || a[a.length-1] == b[b.length-1]);
    }


    public int sum3(int[] nums) {
        return nums [0] + nums [1] + nums [2];

    }


    public int[] rotateLeft3(int[] nums) {
        return new int[]{(nums[1]),  (nums[2]), (nums[0])};
    }

    //Given an array of ints length 3, return a new array with the elements in reverse order, so {1, 2, 3} becomes {3, 2, 1}.
    public int[] reverse3(int[] nums) {
        return new int[]{(nums[2]),  (nums[1]), (nums[0])};
    }

    //Given an array of ints length 3, figure out which is larger, the first or last element in the array,
    // and set all the other elements to be that value. Return the changed array.
    public int[] maxEnd3(int[] nums) {
        int a = nums[0];
        int b = nums[2];
        if(a > b){
            return new int[]{(nums[0]),  (nums[0]), (nums[0])};
        }else return new int[]{(nums[2]),  (nums[2]), (nums[2])};
    }


    public int sum2(int[] nums) {
        if(nums.length ==0){
            return 0;
        }

        if(nums.length == 1){
            return nums[0];
        }

        if(nums.length >= 2){
            return nums[0] + nums[1];
        }else return nums[0] + nums[1];

    }


    public int[] middleWay(int[] a, int[] b) {
        return new int[]{(a[1]),  (b[1])};
    }


    //Given an array of ints, return a new array length 2 containing the first and last elements from the original array.
    // The original array will be length 1 or more.
    public int[] makeEnds(int[] nums) {
        return new int[]{(nums[0]),  (nums[nums.length-1])};
    }

    //Given an int array length 2, return true if it contains a 2 or a 3.
    public boolean has23(int[] nums) {
        return (nums[0] == 2 || nums[0] == 3 || nums[1] == 2 || nums[1] == 3);
    }

    //Given an int array length 2, return true if it does not contain a 2 or 3.
    public boolean no23(int[] nums) {
        return !(nums[0] == 2 || nums[0] == 3 || nums[1] == 2 || nums[1] == 3);
    }

    //------------------------------------
    //Given an int array, return a new array with double the length where its last element is the same as the original array,
    // and all the other elements are 0. The original array will be length 1 or more. Note: by default, a new int array contains all 0's.
    public int[] makeLast(int[] nums) {
        int a = nums[nums.length-1];
        int b = nums[2];
        if(a > b){
            return new int[]{(nums[0]),  (nums[0]), (nums[0])};
        }else return new int[]{(nums[2]),  (nums[2]), (nums[2])};


    }


    public boolean double23(int[] nums) {
        if (nums.length == 1 || nums.length == 0){
            return false;
        }

        if(nums[0] == 2 && nums[1] ==2 || nums[0] == 2 && nums[1] ==2){
            return true;
        }

        if(nums[0] == 3 && nums[1] == 3 || nums[0] == 3 && nums[1] == 3){
            return true;
        }

        else return false;
    }






    public static void main(String[] args) {
        int[] b = new int[5];
        int[] maxVal = new int[1];
        System.out.println(true);

    }

}