/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package saldonasabah;
import java.util.Scanner;
/**
 *
 * @author lenovo
 */
public class SaldoNasabah {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int saldoAwal = sc.nextInt();
        int setoran = sc.nextInt();
        int total = saldoAwal+setoran;
        int biayaAdmin = total - 7000;
        double bonus = biayaAdmin + (biayaAdmin * 0.0005);
        System.out.println(bonus);
    }
}