/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum5;

import java.util.Scanner;

class Baju{
    String tipe;
    int harga;
    int total;

    public Baju(String a, int b){
        this.tipe = a;
        this.total = b;
    }
    
    int baju_1= 100000;
    int baju_2 = 125000;
    int baju_3 = 175000;

    void harga_1(){
        if(total > 100){
        harga = 95000;
        }else
        harga = baju_1;
    }

    void harga_2(){
        if (total > 100){
        harga = 120000;
        }else
        harga = baju_2;
    }

    void harga_3(){
        if (total > 100){
        harga = 160000;
        }else
        harga = baju_3;
    }

    void display(){
        if(tipe.equalsIgnoreCase("a")) {
            harga_1();
        }else if(tipe.equalsIgnoreCase("b")) {
            harga_2();
        }else if(tipe.equalsIgnoreCase("c")){
            harga_3();
        }

        System.out.println("Tipe yang dibeli : " + tipe);
        System.out.println("Harga satuan : " + harga);
        System.out.println("Total harga : " + harga*total);

    }
}
public class Praktikum5 {

    public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
        System.out.println("===========================");
        System.out.println("|   Tipe baju  | Harga   |");
        System.out.println("===========================");
        System.out.println("|       a     | 100000  |");
        System.out.println("|       b     | 125000  |");
        System.out.println("|       c     | 175000  |");
    String tipe = sc.nextLine();
    int total = sc.nextInt();

    Baju dipilih = new Baju (tipe, total);
    dipilih.display();
    }
}
