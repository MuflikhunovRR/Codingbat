package ru.gotoqa;

public class Logic1 {

    public static boolean cigarParty(int cigars, boolean isWeekend) {
        if (isWeekend == false & 40 <= cigars & 60 >= cigars) {
            return true;
        }

        if (isWeekend == true & cigars >= 40) {
            return true;
        } else return false;
    }


    public static int dateFashion(int you, int date) {
        if (you <= 2 || date <= 2) {
            return 0;
        }
        if (you >= 8 || date >= 8) {
            return 2;
        } else return 1;

    }


    //noooooooo
    public static boolean squirrelPlay(int temp, boolean isSummer) {
        if (60 >= temp || 90 >= temp && isSummer == true) {
            return true;
        }

        if (60 >= temp || 100 >= temp && isSummer == false) {
            return true;
        } else return false;



/*        if (isSummer == ) {
            return (60 >= temp && 90 >= temp);
        } else {
            return (60 >= temp && 100 >= temp);
        }*/
    }


    public int caughtSpeeding(int speed, boolean isBirthday) {
        if(speed<=60 && isBirthday == false){
            return 0;
        }

        if(speed>=61 && speed <=80 && isBirthday == false){
            return 1;
        }

        if(speed >=80 && isBirthday == false){
            return 2;
        }

        if(speed<=65 && isBirthday == true){
            return 0;
        }

        if(speed>=66 && speed <=85 && isBirthday == true){
            return 1;
        }

        if(speed >=85 && isBirthday == true){
            return 2;
        }else return speed;
    }


    public static int sortaSum(int a, int b) {
        int c = a+b;

        if(c<=9){
            return c;
        }

        if(c>=21){
            return c;
        } else return 20;
    }


    public boolean love6(int a, int b) {
        if(a ==6 || b == 6 || a+b == 6 || Math.abs(a-b) == 6){
            return true;
        }else return false;
    }

    //----------------------------------------
    public boolean in1To10(int n, boolean outsideMode) {
        if (n >= 1 || n <= 10 && outsideMode == false) {
            return true;
        }

        if (n>10 && outsideMode == true){
            return true;
        }else return false;

    }

    //----------------------------------------
    public boolean more20(int n) {
        if(n % 1 == 1 || n % 1 == 2){
            return true;
        }else return false;

    }









    public static void main(String[] args) {
        System.out.println(squirrelPlay(67, true));

    }








}
