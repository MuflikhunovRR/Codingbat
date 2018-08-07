package ru.gotoqa;

public class Warmup1 {

    public static boolean sleepIn(boolean weekday, boolean vacation) {
        if(weekday == false && vacation == false || weekday == false && vacation == true || weekday == true && vacation == true){
            return true;
        }else return false;
    }

    public static boolean sleepIn2(boolean weekday, boolean vacation) {
        return (!weekday || vacation);
    }




    public static void main(String [] Args){
        System.out.println();
    }

}
