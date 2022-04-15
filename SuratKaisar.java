/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package suratkaisar;
import java.util.Scanner;
/**
 *
 * @author lenovo
 */
public class SuratKaisar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int N = sc.nextInt();
        String hsl = excute(s, N);
        System.out.println(hsl);
    }
    
    public static String excute(String s, int N){
        String huruf2 = "";
        for(int i = 0; i < s.length(); i++){
            char krk = s.charAt(i);
            int huruf1 = krk;
            int count = huruf1 + N;
            if(krk >= 'a' && krk <= 'z'){
                if(count > 122 ){
                     count = 96 + (count - 122);
                }
                    huruf2 += String.valueOf((char)count);   
            }else if(krk >= 'A' && krk <= 'Z'){
                if(count > 90 ){
                     count = 64 + (count - 90);
                }
                    huruf2 += String.valueOf((char)count); 
            }else{
                    huruf2 += String.valueOf(krk);
            }
        }
        return huruf2;
    }
}