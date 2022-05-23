/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uts;

/**
 *
 * @author fidoj
 */
public class ElementUnbooked {

    public Unbooked data;
    public ElementUnbooked next;
    public ElementUnbooked prev;

    public ElementUnbooked(String id, String nama, String jadwal, String kursi, String kelas) {
        prev = null;
        data = new Unbooked(id, nama, jadwal, kursi, kelas);
        next = null;
    }
}
