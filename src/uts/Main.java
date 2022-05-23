/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uts;

import java.util.Scanner;

/**
 *
 * @author fidoj NYOBA PULL (pull udah dicoba)
 */
public class Main {

    public static void main(String[] args) {
        String pilihan;
        int pilihan1 = 1;
        Scanner myObj = new Scanner(System.in);
        ListUnbooked unbooked = new ListUnbooked();
        ElementUnbooked list = unbooked.first;

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
                        unbooked.print();
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
//                            listMahasiswa.insertFirst(nama, nims, ipks);

                            System.out.println("\n------- List Anda --------");
                            unbooked.print();
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
//                            listMahasiswa.insertLast(nama, nim, ipk);

                            System.out.println("\n------- List Anda --------");
                            unbooked.print();
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
//                            listMahasiswa.insertAt(posisi, nama, nim, ipk);

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
                    case 8 -> {
//                        for (int i = 1; i <= 10; i++) {
//                            String j = Integer.toString(i);
//                            unbooked.insertLast("", "", "09.00", j, "ekonomi");
//                        }
                        unbooked.insertLast("", "", "09.00", "21", "ekonomi");
                        unbooked.insertLast("", "", "12.00", "10", "ekonomi");
                        unbooked.insertLast("", "", "15.00", "5", "ekonomi");

                    }
                    case 9 -> {
//                        tampilKursi(list.data.kursi);
                        System.out.println("1. 09.00");
                        System.out.println("2. 12.00");
                        System.out.println("3. 15.00");
                        System.out.print("Kursi dari jadwal mana yang ingin ditampilkan : ");
                        String jadwal = myObj.next();
                        switch (jadwal) {
                            case "1" -> {
                                unbooked.printKursi("09.00");
                                break;
                            }
                            case "2" -> {
                                unbooked.printKursi("12.00");
                                break;
                            }
                            case "3" -> {
                                unbooked.printKursi("15.00");
                                break;
                            }
                            default -> {
                                System.out.println("Tolong pilih jadwal yang ada!");
                                break;
                            }
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
        unbooked.print();
        System.out.println("---------End List---------");
    }

//    static void tampilKursi(String kursi) {
//        int b = 1;
//        int j;
//        for (char x = 'A'; x < 'D'; x++) {
//            for (int i = 1; i < 2; i++) {
//                for (j = b; j < b + 8; j += 3) {
//                    String a = Character.toString(x);
//                    if (j < 10) {
//                        if()
//                        System.out.print(j + a + "  ");
//                        System.out.print(j + 1 + a + "  ");
//                        System.out.print(j + 2 + a + "  ");
//                        System.out.print("   ");
//                    } else {
//                        System.out.print(j + a + " ");
//                        System.out.print(j + 1 + a + " ");
//                        System.out.print(j + 2 + a + " ");
//                        System.out.print("   ");
//                    }
//
//                }
//                b = j;
//            }
//            System.out.println("");
//        }
//    }
}
