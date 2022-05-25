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
        ElementUnbooked elemenBaru = new ElementUnbooked(id, nama, jadwal, kursi, kelas);
        String tempJadwal, tempKelas;
        String[] lJadwal = {"9.00", "12.00", "15.00"};
        String[] lKelas = {"Ekonomi", "Bisnis", "First Class"};
        String value = kursi;
        String alphabet = value.replaceAll("[^A-C]", "");
        int number = Integer.parseInt(value.replaceAll("[^0-9]", "")) - 1;
        String tempKursi = alphabet + Integer.toString(number);
        if (number == 0) {
            int indexJadwal = 0;
            int indexKelas = 0;
            for (int i = 0; i < 3; i ++) {
                if (jadwal.equals(lJadwal[i])) {
                    indexJadwal = i;
                }
                if (kelas.equals(lKelas[i])) {
                    indexKelas = i;
                }
            }
            //if ((indexJadwal != 0) && (indexKelas != 0)) {
            if (indexKelas == 0 && indexJadwal != 0) {
                kelas = lKelas[2];
                jadwal = lJadwal[indexJadwal - 1];
                tempKursi = "C6";
            } else if (indexKelas != 0) {
                kelas = lKelas[indexKelas - 1];
                switch (alphabet) {
                    case "B":
                        tempKursi = "A20";
                        break;
                    case "C":
                        tempKursi = "B10";
                        break;
                            
                }
            } else if (indexKelas == 0 && indexJadwal == 0) {
                System.out.println("InsertFirst");
                elemenBaru.next = first;
                first.prev = elemenBaru;
                first = elemenBaru;
                return;
            }
        }
        System.out.println(tempKursi);

        if (first == null) {
            first = elemenBaru;
        } /*else if (number == 0) { 
            elemenBaru.next = first;
            first.prev = elemenBaru;
            first = elemenBaru;
        }*/ else {
            ElementUnbooked pointer = first;
            while (!(pointer.data.jadwal.equals(jadwal) && pointer.data.kelas.equals(kelas) && pointer.data.kursi.equals(tempKursi))) {
                pointer = pointer.next;
            }
            if (pointer.next != null) {
                elemenBaru.next = pointer.next;
                pointer.next.prev = elemenBaru;
                elemenBaru.prev = pointer;
                pointer.next = elemenBaru;
            } else {
                last.next = elemenBaru;
                elemenBaru.prev = last;
                last = elemenBaru;
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

//    void printKursi(String jadwal) {
//        ElementUnbooked pointer = first;
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
