/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kartu.pelajar.siswa;

import java.util.Scanner;
/**
 *
 * @author Manda Salsa
 */
public class KartuPelajarSiswa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Deklarasi variabel 
        String nama, NIS, nomerinduk, tempattanggallahir, agama, alamatrumah, asalsekolah;
        Scanner input = new Scanner(System.in);
       
        System.out.println("----------KARTU PELAJAR SISWA-------------");
        System.out.print("Nama           : ");
        nama = input.nextLine();
        System.out.print("NIS            : ");
        NIS = input.nextLine();
        System.out.print("Nomer Induk    : ");
        nomerinduk = input.nextLine();
        System.out.print("Tanggal Lahir  : ");
        tempattanggallahir = input.nextLine();
        System.out.print("Alamat Rumah   : ");
        alamatrumah = input.nextLine();
        System.out.print("Asal Sekolah   : ");
        asalsekolah = input.nextLine ();
        System.out.println("--------------------------------------------");
    }
    
}
