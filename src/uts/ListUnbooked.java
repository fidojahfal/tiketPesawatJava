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

    public ElementUnbooked first;
    public ElementUnbooked last;

    public ListUnbooked() {
        first = null;
        last = null;
    }

    void insertFirst(String id, String nama, String jadwal, String kursi, String kelas) {
        ElementUnbooked elemenBaru = new ElementUnbooked(id, nama, jadwal, kursi, kelas);
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
        ElementUnbooked elemenBaru = new ElementUnbooked(id, nama, jadwal, kursi, kelas);

        if (first == null) {
            first = elemenBaru;
            last = elemenBaru;
        } else {
            ElementUnbooked pointer = first;
            while (pointer.next != null) {
                pointer = pointer.next;
            }
            pointer.next = elemenBaru;
            elemenBaru.prev = pointer;
            last = elemenBaru;
        }
    }

    public void insertAt(String id, String nama, String jadwal, String kursi, String kelas) {
        ElementUnbooked pointer = first;
        while (pointer.next != null) {
            if (pointer.data.jadwal.equals(jadwal) && pointer.data.kelas.equals(kelas) && pointer.data.kursi.equals(kursi)) {
                pointer.data.id = id;
                pointer.data.nama = nama;
            }
            pointer = pointer.next;
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
            ElementUnbooked pointer = first;
            while (pointer.next != last) {
                pointer = pointer.next;
            }
            pointer.next = null;
            last.prev = null;
            last = pointer;
        }
    }

    public void deleteAt(String jadwal, String kursi, String kelas) {
        if (first == null) {
            System.out.println("Tidak ada data, masukkan data terlebih dahulu!");
        } else {
            ElementUnbooked pointer = first;
            if (pointer.next == null && pointer.prev == null) {
                first = null;
            }
            while (!(pointer.data.jadwal.equals(jadwal) && pointer.data.kursi.equals(kursi) && pointer.data.kelas.equals(kelas))) {
                pointer = pointer.next;

            }
            if (pointer == last) {
                last = last.prev;
                last.next = null;
            } else if (pointer == first) {
                first = first.next;
                first.prev = null;
            } else {
                pointer.next.prev = pointer.prev;
                pointer.prev.next = pointer.next;
            }
        }

    }

    public void print() {
        ElementUnbooked pointer = first;

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
}
