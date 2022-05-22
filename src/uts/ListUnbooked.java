/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uts;

/**
 *
 * @author fidoj
 */
public class ListUnbooked {

    ElemenUnbooked first;
    ElemenUnbooked last;

    ListUnbooked() {
        first = null;
        last = null;
    }

    void insertFirst(String id, String nama, String jadwal, String kursi, String kelas) {
        ElemenUnbooked elemenBaru = new ElemenUnbooked(id, nama, jadwal, kursi, kelas);
        if (first == null) {
            first = elemenBaru;
            last = elemenBaru;
        } else {
            elemenBaru.next = first;
            first.prev = elemenBaru;
            first = elemenBaru;
        }

    }

    void insertLast(String id, String nama, String jadwal, String kursi, String kelas) {
        ElemenUnbooked elemenBaru = new ElemenUnbooked(id, nama, jadwal, kursi, kelas);

        if (first == null) {
            first = elemenBaru;
            last = elemenBaru;
        } else {
            ElemenUnbooked pointer = first;
            while (pointer.next != null) {
                pointer = pointer.next;
            }
            pointer.next = elemenBaru;
            elemenBaru.prev = pointer;
            last = elemenBaru;
        }
    }

    void insertAt(String id, String nama, String jadwal, String kursi, String kelas) {
        ElemenUnbooked elemenBaru = new ElemenUnbooked(id, nama, jadwal, kursi, kelas);
        if (first == null) {
            first = elemenBaru;
        }else{
            ElemenUnbooked pointer = first;
            while(!pointer.data.jadwal.equals(jadwal) && !pointer.data.kelas.equals(kelas) && !pointer.data.kursi.equals(kursi)){
                pointer = pointer.next;
            }
        }
    }

    void deleteFirst() {
        if (first == null) {
            System.out.println("Tidak ada data, masukkan data terlebih dahulu!");
        } else if (first.next == null) {
            first = null;
        } else {
            first = first.next;
            first.prev = null;
        }
    }

    void deleteLast() {
        if (first == null) {
            System.out.println("Tidak ada data, masukkan data terlebih dahulu!");
        } else if (first.next == null) {
            first = null;
        } else {
            ElemenUnbooked pointer = first;
            while (pointer.next != last) {
                pointer = pointer.next;
            }
            pointer.next = null;
            last.prev = null;
            last = pointer;
        }
    }

    void deleteAt(String jadwal, String kelas, String kursi) {

        if (first == null) {
            System.out.println("Tidak ada data, masukkan data terlebih dahulu!");
        } else {
            ElemenUnbooked pointer = first;
            if (pointer.next == null && pointer.prev == null) {
                first = null;
            }
            while (!pointer.data.jadwal.equals(jadwal) && !pointer.data.kelas.equals(kelas) && !pointer.data.kelas.equals(kursi)) {
                pointer = pointer.next;
            }
            if (pointer.next != null && pointer.prev != null) {
                pointer.next.prev = pointer.prev;
                pointer.prev.next = pointer.next;
            } else if (pointer.next == null && pointer.prev != null) {
                last = last.prev;
                last.next = null;
            } else if (pointer.prev == null && pointer.next != null) {
                first = first.next;
                first.prev = null;
            }
        }
    }

    void print() {
        ElemenUnbooked pointer = first;

        if (pointer == null) {
            System.out.println("Linked List Kosong!");
        } else {
            int i = 1;
            while (pointer != null && i <= 99) {
                System.out.println("-------------" + i + "------------");
                System.out.println("Id : " + (pointer.data.id));
                System.out.println("Nama : " + (pointer.data.nama));
                System.out.println("Jadwal : " + (pointer.data.jadwal));
                System.out.println("Kursi : " + (pointer.data.kursi));
                System.out.println("Kelas : " + (pointer.data.kelas));
                pointer = pointer.next;
                i++;
            }
        }
    }

//    void printKursi(String jadwal) {
//        ElemenUnbooked pointer = first;
//        int e = 1;
//        int j;
//        for (char x = 'A'; x < 'D'; x++) {
//            for (int i = 1; i < 2; i++) {
//                String a = Character.toString(x);
//                if (e < 10 && e >= 1) {
//                    for (j = e; j <= e + 8; j++) {
//                        if(pointer.data.jadwal.equals(jadwal)){
//                            String c = Integer.toString(j);
//                        if (j == 3 || j == 6 || j == 9) {
//                            if (pointer.data.kursi.equals(c)) {
//                                System.out.print(j + a + "o" + "   ");
//                            } else {
//                                System.out.print(j + a + "x" + "   ");
//                            }
//                        } else {
//                            if (pointer.data.kursi.equals(c)) {
//                                System.out.print(j + a + "o" + "  ");
//                            } else {
//                                System.out.print(j + a + "x" + "  ");
//                            }
//                        }
//                        pointer = pointer.next;
//                        }else{
//                            
//                        }
//                    }
//                    e = j;
//                } else if (e >= 10 && e < 19) {
//                    for (j = e; j <= e + 8; j++) {
//                        String c = Integer.toString(j);
//                        if (j == 12 || j == 15 || j == 18) {
//                            if (pointer.data.kursi.equals(c)) {
//                                System.out.print(j + a + "o" + "  ");
//                            } else {
//                                System.out.print(j + a + "x" + "  ");
//                            }
//                        } else {
//                            if (pointer.data.kursi.equals(c)) {
//                                System.out.print(j + a + "o" + " ");
//                            } else {
//                                System.out.print(j + a + "x" + " ");
//                            }
//                        }
//                    }
//                    e = j;
//                } else {
//                    for (j = e; j <= e + 8; j++) {
//                        String c = Integer.toString(j);
//                        if (j == 21 || j == 24 || j == 27) {
//                            if (pointer.data.kursi.equals(c)) {
//                                System.out.print(j + a + "o" + "  ");
//                            } else {
//                                System.out.print(j + a + "x" + "  ");
//                            }
//                        } else {
//                            if (pointer.data.kursi.equals(c)) {
//                                System.out.print(j + a + "o" + " ");
//                            } else {
//                                System.out.print(j + a + "x" + " ");
//                            }
//                        }
//                    }
//                    e = j;
//                }
//            }
//            System.out.println("");
//        }
//    }
}