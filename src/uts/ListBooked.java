package uts;

/*
Author : Kyroline
 */
public class ListBooked {

    public ElementBooked first, last;

    ListBooked() {
        first = null;
        last = null;
    }

    public void insertFirst(String id, String nama, String jadwal, String kursi, String kelas) {
        ElementBooked elemenBaru = new ElementBooked(id, nama, jadwal, kursi, kelas);
        elemenBaru.next = first;
        if (first != null) {
            first.prev = elemenBaru;
            first = elemenBaru;
        } else {
            first = elemenBaru;
            last = elemenBaru;
        }
    }

    public void insertLast(String id, String nama, String jadwal, String kursi, String kelas) {
        ElementBooked elemenBaru = new ElementBooked(id, nama, jadwal, kursi, kelas);
        if (first == null) {
            first = elemenBaru;
            last = elemenBaru;
        } else {
            last.next = elemenBaru;
            elemenBaru.prev = last;
            last = elemenBaru;
        }
        /*else {
            ElementBooked pointer = first;
            while(pointer.next != null) {
                pointer = pointer.next;
            } 
            pointer.next = elemenBaru;
            elemenBaru.prev = pointer;
            last = elemenBaru;
            
        }*/
    }

    public void deleteFirst() {
        if (first == null) {
            first = null;
        } else if (first.next == null) {
            first = null;
        } else {
            first.next.prev = null;
            first = first.next;
        }
    }

    public void deleteLast() {
        if (first == null) {
            first = null;
        } else if (first.next == null) {
            first = null;
        } else {
            last.prev.next = null;
            last = last.prev;
        }
        /*else if (first.next == null) {
            first = null;
        } else {
            ElementBooked pointer = first;
            while(pointer.next.next != null) {
                pointer = pointer.next;
            }
            pointer.next = null;
        }*/
    }

    public void insertAt(String tujuan, String tujuanNama, String id, String nama, String jadwal, String kursi, String kelas) {
        ElementBooked elemenBaru = new ElementBooked(id, nama, jadwal, kursi, kelas);
        if (first.data.id.equals(tujuan) && first.data.nama.equals(tujuanNama)) {
            elemenBaru.next = first.next;
            elemenBaru.prev = first;
            if (first.next != null) {
                first.next.prev = elemenBaru;
            }
            first.next = elemenBaru;
        } else if (last.data.id.equals(tujuan) && last.data.nama.equals(tujuanNama)) {
            last.next = elemenBaru;
            elemenBaru.prev = last;
            last = elemenBaru;
        } else {
            ElementBooked pointer = first;
            while (pointer.next != null) {
                if (pointer.data.id.equals(tujuan) && pointer.data.nama.equals(tujuanNama)) {
                    elemenBaru.next = pointer.next;
                    elemenBaru.prev = pointer;
                    pointer.next.prev = elemenBaru;
                    pointer.next = elemenBaru;
                    break;
                } else {
                    pointer = pointer.next;
                }
            }
        }
    }

    public void deleteAt(String tujuan) {
        if (first.data.id.equals(tujuan)) {
            if (first.next != null) {
                first.prev = null;
            }
            first = first.next;
        } else if (last.data.id.equals(tujuan)) {
            last.prev.next = null;
            last = last.prev;
        } else {
            ElementBooked pointer = first;
            while (pointer.next != null) {
                if (pointer.next.data.id.equals(tujuan)) {
                    pointer.next.next.prev = pointer;
                    pointer.next = pointer.next.next;
                } else {
                    pointer = pointer.next;
                }
            }
        }
    }

    public void printFirst() {
        ElementBooked pointer = first;
        if (first == null) {
            System.out.println("LINKED LIST KOSONG");
        } else {
            while (pointer != null) {
                System.out.print((pointer.data.id) + "\t");
                System.out.print((pointer.data.nama) + "\t");
                System.out.print((pointer.data.jadwal) + "\t");
                System.out.print((pointer.data.kelas) + "\t");
                System.out.println((pointer.data.kursi) + "\t");
                pointer = pointer.next;
            }
        }
    }

    public void printLast() {
        ElementBooked pointer = last;
        if (last == null) {
            System.out.println("LINKED LIST KOSONG");
        } else {
            while (pointer != null) {/*
                System.out.print((pointer.data.nama) + "      ");
                System.out.print((pointer.data.nim) + "      ");
                System.out.println(pointer.data.ipk);*/
                pointer = pointer.prev;
            }
        }
    }
}
