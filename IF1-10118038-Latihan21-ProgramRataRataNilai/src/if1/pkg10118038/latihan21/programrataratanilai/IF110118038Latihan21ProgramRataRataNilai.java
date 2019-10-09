/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10118038.latihan21.programrataratanilai;
import java.util.Scanner;
/**
 *
 * @author Lingga
 * NAMA : Lingga Purnama Al Hamdi
 * KELAS : IF1
 * NIM : 10118038
 * Deskripsi Program : program ini berisi program yang akan menampilkan Program Rata Rata Nilai
 */
public class IF110118038Latihan21ProgramRataRataNilai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan Banyaknya Mahasiswa : ");
        int mahasiswa = sc.nextInt();
        double rataRata = 0;
        double nilai = 0;
        int i = 1;
        while( i <= mahasiswa ){
            System.out.print("Nilai Mahasiswa ke-" + i++ + " : ");
            nilai = sc.nextDouble();
            rataRata = rataRata + nilai;
            
        }
        rataRata = rataRata / mahasiswa;
        
        System.out.println("Maka, Rata-rata Nilainya adalah "+ rataRata);
        System.out.println("Developed by : Lingga Purnama Al Hamdi");
        
    }
    
}
