/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perkenalanmahasiswa;

/**
  * @author
 * NAMA			: Riski Dwi Sabariyanto
 * KELAS		: IF-1
 * NIM			: 10118026
 * Deksripsi Program : Program ini berisi program data diri mahasiswa 
 * berbasis objek oriented
 */
public class Perkenalanmahasiswa {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
     
     Mahasiswa mhs = new Mahasiswa();
     
     mhs.nim = "10110269";
     mhs.nama = "Rizki Adam Kurniawan";
     mhs.perkenalkanDiri(mhs.nim,mhs.nama);
     
     Mahasiswa mhs1 = new Mahasiswa();
     
     mhs1.nim = "10110270";
     mhs1.nama = "Indra Tiola";
     mhs1.perkenalkanDiri(mhs1.nim,mhs1.nama);
     
     Mahasiswa mhs2 = new Mahasiswa();
     
     mhs2.nim = "10110271";
     mhs2.nama = "RObi Tansil Genefi";
     mhs2.perkenalkanDiri(mhs2.nim,mhs2.nama);
     
     Mahasiswa mhs3 = new Mahasiswa();
     
     mhs3.nim = "10110269";
     mhs3.nama = "Muhammad Nur Awaludin";
     mhs3.perkenalkanDiri(mhs3.nim,mhs3.nama);
    }
    
}
