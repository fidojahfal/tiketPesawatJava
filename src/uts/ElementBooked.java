package uts;
/*
Author : Kyroline
*/
public class ElementBooked {
    Booked data;
    ElementBooked next;
    ElementBooked prev;
    public ElementBooked(String id, String nama, String jadwal, String kursi, String kelas) {
        data = new Booked(id, nama, jadwal, kursi, kelas);
        next = null;
        prev = null;
    }
}
