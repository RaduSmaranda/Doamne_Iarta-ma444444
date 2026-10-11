package com.example.myapplication;



//Joystickuri DONE
//DPad sus/Jos DONE arm pivot 0.85, 0.2
//Butonul x deschide sau inchide gheara


import java.security.KeyStore;
import java.util.Scanner;
public class TemaCod {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the forward-backward direction of the joystick");
        int fpull=scanner.nextInt();
        System.out.print("Enter the left-right direction of the joystick");
        int lrpull=scanner.nextInt();
        System.out.print("Enter the pivot of the arm (0.85 or 0.2)");
        double pivot=scanner.nextDouble();
        if (fpull>-1) {
            if (fpull<1){
                System.out.print("Ok");
            } else {
                fpull=1;
            }
        } else{
            fpull=-1;
        }
        System.out.println("The  forward-backward pull of the joystick is " + lrpull);


        if (lrpull>-1) {
            if (lrpull<1){
                System.out.print("Ok");
            } else {
                lrpull=1;
            }
        } else{
            lrpull=-1;
        }
        System.out.println("The  left-right pull of the joystick is " + lrpull);

        boolean ClawOn=false;
        System.out.print("Introdu x pentru a inchide/deshide gheara.");
        char tasta = scanner.next().toLowerCase().charAt(0);
        if (tasta=='x'){
            if(!ClawOn){
                ClawOn= true;
            } else{
                ClawOn= false;
            }
        }
        scanner.close();
    }
}


