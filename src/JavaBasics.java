import java.util.Scanner;

import static java.lang.System.in;

public class JavaBasics {
    public static void main(String args[]){
       // System.out.println("Hello World!");
        // Strongly Typed
        int bati = 999999999;//3byte
        long boroBati=922337203;//4byte
        short chotoBati=78;//2byte
        byte shobCheyeChoto=4;//1byte

        double decimal=7.377777777777777;//8byte
        float shortDecimal=5.777777777f;//4byte

        char letter='y';

        boolean trueOrFalse=true;

        bati=(int) boroBati;

        //Arithmetic operator
        //+
        //-
        //*
        ///
        //%


        //Assignment operator
        // =
        // +=
        // -=
        // *=
        // /=
        // %=

        int newVar =9;
        newVar+=5;
        //Comparison
        // >
        // <
        // ==
        // !=
        // >=
        // <=

        boolean compare= 5<=6;
        //System.out.println(compare);

        //Logical operator
        // &&
        // ||

        compare = true && true;
        //System.out.println(compare);
        compare = false && true;
        //System.out.println(compare);
        compare = true && false;
        //System.out.println(compare);
        compare = false && false;
        //System.out.println(compare);



        compare = true || true;
        //System.out.println(compare);
        compare = false || true;
        //System.out.println(compare);
        compare = true || false;
        //System.out.println(compare);
        compare = false || false;
        //System.out.println(compare);

        int maksura=3;
        int ela=50;

        if(ela<maksura){
            bati=100;
        }else if(maksura>5){
            bati=20;
        }else {
            bati=0;
        }


        if(ela == 50){
            boroBati=900;
        }
        if(maksura!=9 || ela <50){
            boroBati=800;
        }

        bati=60;

        switch(bati) {
            case 60:
                System.out.println("case 1");
                break;
            case 70:
                System.out.println("case 2");
                break;
            default:
                System.out.println("default case");
        }

        if(bati>80){
            bati=800;
        }else {
            bati=0;
        }
        bati = bati > 80 ? 800 : 0;

        //loop
        //for loop
        //while loop
        //do while
        //foreach
        
        int i=0;
        for (;i<-1;){
            System.out.println(2*i+1);
            i++;
        }

        char continueLoop='n';
        Scanner obj = new Scanner(in);

        while(continueLoop!='y'){
            System.out.println("hello do you want to continue?");
            continueLoop = obj.nextLine().charAt(0);

        }

        do{
            System.out.println("hello do you want to continue?");
            continueLoop = obj.nextLine().charAt(0);

        }while(continueLoop!='n');

    }
}
