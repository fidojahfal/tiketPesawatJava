/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uts;

import java.util.Scanner;

/**
 *
 * @author fidoj
 */
public class Main {

    public static void main(String[] args) {
        String pilihan;
        int pilihan1 = 1;
        Scanner myObj = new Scanner(System.in);
        DoubleLinkedList listMahasiswa = new DoubleLinkedList();

        do {
            System.out.println("Pilih menu dibawah ini : ");
            System.out.println("1. Print linked list");
            System.out.println("2. Insert First (user input nama, nim dan ipk)");
            System.out.println("3. Insert Last (user input nama, nim dan ipk)");
            System.out.println("4. Insert At (user input nama, nim dan ipk)");
            System.out.println("5. Delete First (Menghapus data urutan 1)");
            System.out.println("6. Delete Last (Menghapus data urutan terakhir)");
            System.out.println("7. Delete At (Menghapus data sesuai inputan)");
            System.out.println("0. Exit");
            System.out.print("Masukkan pilihan : ");
            pilihan = myObj.nextLine();

            try {
                pilihan1 = Integer.parseInt(pilihan);

                switch (pilihan1) {
                    case 1 -> {
                        System.out.println("\n------- List Anda --------");
                        listMahasiswa.print();
                        System.out.println("---------End List---------");
                        System.out.println("");
                        break;
                    }
                    case 2 -> {
                        System.out.print("Masukkan nama : ");
                        String nama = myObj.nextLine();
                        
                        System.out.print("Masukkan NIM : ");
                        String nim = myObj.nextLine();
                        
                        System.out.print("Masukkan IPK : ");
                        String ipk = myObj.nextLine();
                        
                        int nims;
                        float ipks;

                        try {
                            nims = Integer.parseInt(nim);
                            ipks = Float.parseFloat(ipk);
                            listMahasiswa.insertFirst(nama, nims, ipks);
                            
                            System.out.println("\n------- List Anda --------");
                            listMahasiswa.print();
                            System.out.println("---------End List---------");
                            System.out.println("");
                            break;
                            
                        } catch (NumberFormatException e) {
                            System.out.println("\nAda inputan selain angka!\n");
                        }
                    }
                    case 3 -> {
                        System.out.print("Masukkan nama : ");
                        String nama = myObj.nextLine();
                        
                        System.out.print("Masukkan NIM : ");
                        String NIM = myObj.nextLine();
                        
                        System.out.print("Masukkan IPK : ");
                        String IPK = myObj.nextLine();
                        
                        int nim;
                        float ipk;

                        try {
                            nim = Integer.parseInt(NIM);
                            ipk = Float.parseFloat(IPK);
                            listMahasiswa.insertLast(nama, nim, ipk);
                            
                            System.out.println("\n------- List Anda --------");
                            listMahasiswa.print();
                            System.out.println("---------End List---------");
                            System.out.println("");
                            break;
                        } catch (NumberFormatException e) {
                            System.out.println("\nAda inputan selain angka!\n");
                        }
                    }
                    case 4 -> {
                        System.out.println("\n------- List Anda --------");
                        listMahasiswa.print();
                        System.out.println("---------End List---------");
                        System.out.println("");

                        System.out.print("Ingin menambahkan dari posisi berapa? ");
                        String POSISI = myObj.nextLine();
                        System.out.print("Masukkan nama : ");
                        
                        String nama = myObj.nextLine();
                        System.out.print("Masukkan NIM : ");
                        
                        String NIM = myObj.nextLine();
                        System.out.print("Masukkan IPK : ");
                        String IPK = myObj.nextLine();
                        
                        int posisi;
                        int nim;
                        float ipk;

                        try {
                            posisi = Integer.parseInt(POSISI);
                            nim = Integer.parseInt(NIM);
                            ipk = Float.parseFloat(IPK);
                            listMahasiswa.insertAt(posisi, nama, nim, ipk);
                            
                            System.out.println("\n------- List Anda --------");
                            listMahasiswa.print();
                            System.out.println("---------End List---------");
                            System.out.println("");
                            break;
                        } catch (NumberFormatException e) {
                            System.out.println("\nAda inputan selain angka!\n");
                        }
                    }
                    case 5 -> {
                        listMahasiswa.deleteFirst();
                        System.out.println("\n------- List Anda --------");
                        listMahasiswa.print();
                        System.out.println("---------End List---------");
                        System.out.println("");
                        break;
                    }
                    case 6 -> {
                        listMahasiswa.deleteLast();
                        System.out.println("\n------- List Anda --------");
                        listMahasiswa.print();
                        System.out.println("---------End List---------");
                        System.out.println("");
                        break;
                    }
                    case 7 -> {
                        System.out.println("\n------- List Anda --------");
                        listMahasiswa.print();
                        System.out.println("---------End List---------");
                        System.out.println("");

                        System.out.print("Ingin menghapus posisi berapa? ");
                        String POSISI = myObj.nextLine();
                        int posisi;
                        try {
                            posisi = Integer.parseInt(POSISI);
                            listMahasiswa.deleteAt(posisi);
                            
                            System.out.println("");
                            System.out.println("\n------- List Anda --------");
                            listMahasiswa.print();
                            System.out.println("---------End List---------");
                            System.out.println("");
                            break;
                            
                        } catch (NumberFormatException e) {
                            System.out.println("\nAda inputan selain angka!\n");
                        }

                    }
                    case 0 -> {
                        System.out.println("\nExiting...\n");
                    }
                    default -> {
                        System.out.println("\nPilihan yang anda masukkan, tidak ada!\n");
                    }

                }
            } catch (NumberFormatException e) {
                System.out.println("\nHanya menerima inputan angka dari pilihan yang ada!\n");
            }

        } while (pilihan1 != 0);
        System.out.println("------- List Anda --------");
        listMahasiswa.print();
        System.out.println("---------End List---------");
    }
}
