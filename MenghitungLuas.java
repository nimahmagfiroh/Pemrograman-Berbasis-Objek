/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menghitungluas;
import java.util.Scanner;
/**
 *
 * @author lenovo
 */
public class MenghitungLuas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        if (input == 1){
            int s = sc.nextInt();
            System.out.println(persegi(s));
        }
        else if (input == 2){
            double alas = sc.nextDouble();
            double tinggi = sc.nextDouble();
            System.out.println(segitiga(alas, tinggi));
        }
        else if (input== 3){
            double jari2 = sc.nextDouble();
            if (jari2%7 == 0){
                System.out.println(lingkaran(jari2));
            }
            else 
             System.out.println(lingkaran2(jari2));
        }
        else System.out.println("Input yang anda masukan tidak sesuai");
    }
    public static int persegi(int sisi){
        int hsl = sisi*sisi;
        return hsl;
    }
    public static int segitiga(Double a, Double t){
        int hsl = (int) (a*t/2);
        return hsl;
    }
    public static double lingkaran(double r){
        double hsl = 22 / 7 * r * r;
        return hsl;
    }
    public static double lingkaran2(double r){
        double hsl = 3.14 * r* r;
        int result = (int)hsl; 
        return result;
    }
}