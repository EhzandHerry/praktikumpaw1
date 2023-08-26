package com.helloworld;

public class SwitchTanpaYield {
    public static void main(String[] args) {
        var nilai = "A";
        String ucapan;

        switch (nilai) {
            case "A":
                ucapan = "Wow Anda Lulus dengan Baik";
                break;
            case "B":
            case "C":
                ucapan = "Anda Lulus";
                break;
            case "D":
                ucapan = "Anda Tidak Lulus";
                break;
            default:
                ucapan = "Mungkin Anda Salah jurusan";
                break;
        }

        System.out.println(ucapan);
    }
}

