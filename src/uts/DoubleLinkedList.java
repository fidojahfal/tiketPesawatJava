/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uts;

/**
 *
 * @author fidoj
 */
public class DoubleLinkedList {

    ElemenUnbooked first;
    ElemenUnbooked last;

    DoubleLinkedList() {
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
        } else if (posisi < 1) {
            System.out.println("Posisi harus 1 atau lebih!");

        } else if (posisi == 1) {
            if (first != null) {
                elemenBaru.next = first;
                first = elemenBaru;
            }
            first = elemenBaru;
        } else {
            ElemenUnbooked pointer = first;

            while (posisi-- != 0) {
                if (posisi == 1 && pointer != null) {
                    elemenBaru.next = pointer.next;
                    pointer.next = elemenBaru;
                    break;
                }
                if (pointer != null) {
                    pointer = pointer.next;
                } else {
                    System.out.print("\nPosisi yang anda masukkan terlalu jauh!\n");
                    break;
                }

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

void deleteAt(int posisi) {
        if (first == null) {
            System.out.println("Tidak ada data, masukkan data terlebih dahulu!");
        } else if (posisi < 1) {
            System.out.println("Posisi harus 1 atau lebih!");
        } else if (posisi == 1 && first != null) {
            ElemenUnbooked penghapus = first;
            first = first.next;
            penghapus = null;
        } else {
            ElemenUnbooked pointer = first;
            for (int i = 1; i < posisi - 1; i++) {
                if (pointer != null) {
                    pointer = pointer.next;
                }
            }
            if (pointer != null && pointer.next != null) {
                ElemenUnbooked penghapus = pointer.next;
                pointer.next = pointer.next.next;
                penghapus = null;
            } else {
                System.out.print("\nPosisi yang anda masukkan terlalu jauh!\n");
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
                System.out.println("Nama : " + (pointer.data.nama));
                System.out.println("NIM : " + (pointer.data.nim));
                System.out.println("IPK : " + (pointer.data.ipk));
                pointer = pointer.next;
                i++;
            }
        }
    }
}
