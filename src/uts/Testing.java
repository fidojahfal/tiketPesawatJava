/*
    Double Linked DoubleCircularLinkedList Circular DoubleCircularLinkedList
*/
package uts;

import uts.forms.*;
import java.util.Scanner;

public class Testing {

    public static void main(String[] args) {
        ListBooked newList = new ListBooked();
        newList.insertFirst("0001", "Reza Adi Kurniawan", "Jam 7.00", "A01", "Ekonomi");
        newList.insertLast("0002", "Reza Adi Setiyawan", "Jam 7.00", "A02", "Ekonomi");
        newList.insertLast("0003", "Febri Adi Kurniawan", "Jam 7.00", "A03", "Ekonomi");
        newList.insertLast("0004", "Reza Faza Ramadani", "Jam 7.00", "A04", "Ekonomi");
        newList.insertLast("0005", "Irza Adi Kurniawan", "Jam 7.00", "A05", "Ekonomi");
        menuAwal f = new menuAwal();
        f.setLayout(null);
        f.setVisible(true);
    }
}
