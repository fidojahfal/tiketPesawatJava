/*
    Double Linked DoubleCircularLinkedList Circular DoubleCircularLinkedList
*/
package uts;

import uts.forms.*;
import java.util.Scanner;

public class Testing {

    public static void main(String[] args) {
        ListBooked newList = new ListBooked();
        fOrder f = new fOrder(newList);
        f.setSize(640, 480);
        f.setLayout(null);
        f.setVisible(true);
        /*
        Scanner input = new Scanner(System.in);
        Scanner Input = new Scanner(System.in);
        int option = 0;
        String tujuan, id, nama, jadwal, kursi, kelas;
        System.out.println("Main Menu");
            System.out.println("1. Cetak List");
            System.out.println("2. Masukkan data di depan");
            System.out.println("3. Masukkan data di belakang");
            System.out.println("4. Masukkan data di tengah");
            System.out.println("5. Hapus data di depan");
            System.out.println("6. Hapus data di belakang");
            System.out.println("7. Hapus data di tengah");
            System.out.println("8. Keluar");
            System.out.print("Pilihan (1-8) : ");
        do {
            option = input.nextInt();
            switch (option) {
                case 1:
                    newList.printFirst();
                    break;
                case 2:
                    System.out.println("Menambah Data di Depan");
                    System.out.print("Masukkan ID : ");
                    id = Input.nextLine();
                    System.out.print("Masukkan Nama : ");
                    nama = Input.nextLine();
                    System.out.print("Masukkan Jadwal : ");
                    jadwal = Input.nextLine();
                    System.out.print("Masukkan Kursi : ");
                    kursi = Input.nextLine();
                    System.out.print("Masukkan Kelas : ");
                    kelas = Input.nextLine();
                    newList.insertFirst(id, nama, jadwal, kursi, kelas);
                    break;
                case 3:
                    System.out.println("Menambah Data di Belakang");
                    System.out.print("Masukkan ID : ");
                    id = Input.nextLine();
                    System.out.print("Masukkan Nama : ");
                    nama = Input.nextLine();
                    System.out.print("Masukkan Jadwal : ");
                    jadwal = Input.nextLine();
                    System.out.print("Masukkan Kursi : ");
                    kursi = Input.nextLine();
                    System.out.print("Masukkan Kelas : ");
                    kelas = Input.nextLine();
                    newList.insertLast(id, nama, jadwal, kursi, kelas);
                    break;
                case 4:
                    System.out.println("Menambah Data di Tengah");
                    System.out.print("Masukkan Tujuan : ");
                    tujuan = Input.nextLine();
                    System.out.print("Masukkan ID : ");
                    id = Input.nextLine();
                    System.out.print("Masukkan Nama : ");
                    nama = Input.nextLine();
                    System.out.print("Masukkan Jadwal : ");
                    jadwal = Input.nextLine();
                    System.out.print("Masukkan Kursi : ");
                    kursi = Input.nextLine();
                    System.out.print("Masukkan Kelas : ");
                    kelas = Input.nextLine();
                    newList.insertAt(tujuan, id, nama, jadwal, kursi, kelas);
                    break;
                case 5:
                    System.out.println("Menghapus data di depan");
                    newList.deleteFirst();
                    break;
                case 6:
                    System.out.println("Menghapus data di belakang");
                    newList.deleteLast();
                    break;
                case 7:
                    System.out.println("Menghapus data di tengah");
                    System.out.print("Masukkan Tujuan : ");
                    tujuan = Input.nextLine();
                    newList.deleteAt(tujuan);
                    break;
            }
        } while (option != 8);*/
    }
}
