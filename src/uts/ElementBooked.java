package uts;
/*
Author : Kyroline
*/
public class ElementBooked {
    public Booked data;
    public ElementBooked next;
    public ElementBooked prev;
    public ElementBooked(String id, String nama, String jadwal, String kursi, String kelas) {
        data = new Booked(id, nama, jadwal, kursi, kelas);
        next = null;
        prev = null;
    }
}
