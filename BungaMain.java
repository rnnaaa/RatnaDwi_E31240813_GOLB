/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo;
// Kelas induk (superclass)
class Bunga {
    void mekar() {
        System.out.println("Bunga sedang mekar.");
    }
}

// Kelas turunan (subclass) pertama
class Mawar extends Bunga {
    @Override
    void mekar() {
        System.out.println("Bunga mawar mekar dengan indah dan berwarna merah.");
    }
}

// Kelas turunan (subclass) kedua
class Melati extends Bunga {
    @Override
    void mekar() {
        System.out.println("Bunga melati mekar dengan wangi yang harum.");
    }
}

// Kelas utama untuk menjalankan program
public class BungaMain {
    public static void main(String[] args) {
        Bunga bunga1 = new Mawar();
        Bunga bunga2 = new Melati();

        // Polimorfisme: Memanggil metode yang sesuai dengan objeknya
        bunga1.mekar();
        bunga2.mekar();
    }
}

    

