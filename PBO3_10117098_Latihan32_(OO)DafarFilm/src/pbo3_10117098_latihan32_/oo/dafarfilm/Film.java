/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3_10117098_latihan32_.oo.dafarfilm;

/**
 *
 * @author 
 * NAMA     : Santi Susanti
 * KELAS    : PBO3
 * NIM      : 10117098
 * Deskripsi Program : program ini berisi program yang menampilkan daftar film
 *                     dengan genre, durasi, dan rating yang sudah ada/sudah 
 *                     ditentukan
 */
public class Film {
     public  String nama;
     public  String genre;
     public  String rating;
     public  String durasi;
    
     public void nowPlaying (String nama,String genre,String rating,String 
             durasi){
        System.out.println("Judul Film\t: "+nama);
        System.out.println("Genre Film\t: "+genre);
        System.out.println("Rating Film\t: "+rating);
        System.out.println("Durasi Film\t: "+durasi+"\n");
     }
       
       
}
