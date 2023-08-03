package com.helloworld;

public class OpIfStatement {
    public static void main(String[] args) {
        var nilai = 70;
        var absen = 90;

        if (nilai >= 75 && absen >= 75){
            System.out.println("Anda Lulus");
        }
        else{System.out.println("Anda Tidak Lulus");}
    }
}
