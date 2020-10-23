/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menumakanan;
import java.util.Scanner;
/**
 *
 * @author USER
 */
public class Menumakanan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Daftar menu yang ada di Restoran");
        System.out.println("1. Paket 1");
        System.out.println("2. Paket 2");
        System.out.println("3. Paket 3");
        System.out.println("4. Paket 4");
        System.out.println("Pilihlah paket makanan yang sudah ada di menu");
        int pilihan = sc.nextInt();
        
        //
        switch(pilihan){
            case 1 : System.out.println("Daftar makanan yang ada di Paket 1");
            System.out.println("A.Chiken Katsu");
            System.out.println("B. Nasi");
            System.out.println("C. Salad");
            System.out.println("D. Chiken Burger");
            System.out.println("E. Coca Cola");
            System.out.println("Total nya yaitu 150.000");
        break;
            case 2 : System.out.println("Daftar menu makanan yang ada di paket 2");
            System.out.println("A. Bubur ayam");
            System.out.println("B. Bubur kacang hijau");
            System.out.println("C. Teh panas");
            System.out.println("D. Kerupuk");
            System.out.println("Total nya yaitu 50.000");
        break;
            case 3 : System.out.println("Daftar menu makanan yang ada di paket 3");
            System.out.println("A. Steak sirloin");
            System.out.println("A. Kentang Goreng");
            System.out.println("A. Salad");
            System.out.println("A. Milkshake");
            System.out.println("Total nya yaitu 200.000");
        break;
            default: System.out.println("Kode anda salah");
        break;
        }
    }
    
}
