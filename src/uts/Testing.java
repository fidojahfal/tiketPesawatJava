/*
    Double Linked DoubleCircularLinkedList Circular DoubleCircularLinkedList
*/
package uts;

import uts.forms.*;
import java.util.Scanner;

public class Testing {

    public static void main(String[] args) {
        ListBooked listBooked = new ListBooked();
        ListUnbooked listUnbooked = new ListUnbooked();
        for (int i = 1; i <= 20; i++) {
            String j = Integer.toString(i);
            listUnbooked.insertLast("", "", "09.00", "A" + j, "Ekonomi");
        }
        for (int i = 1; i <= 10; i++) {
            String j = Integer.toString(i);
            listUnbooked.insertLast("", "", "09.00", "B" + j, "Bisnis");
        }
        for (int i = 1; i <= 6; i++) {
            String j = Integer.toString(i);
            listUnbooked.insertLast("", "", "09.00", "C" + j, "First Class");
        }
        
        /*listBooked.insertFirst("0001", "Reza Adi Kurniawan", "Jam 7.00", "A01", "Ekonomi");
        listBooked.insertLast("0002", "Reza Adi Setiyawan", "Jam 7.00", "A02", "Ekonomi");
        listBooked.insertLast("0003", "Febri Adi Kurniawan", "Jam 7.00", "A03", "Ekonomi");
        listBooked.insertLast("0004", "Reza Faza Ramadani", "Jam 7.00", "A04", "Ekonomi");
        listBooked.insertLast("0005", "Irza Adi Kurniawan", "Jam 7.00", "A05", "Ekonomi");*/
//        fOrder f = new fOrder(listBooked, listUnbooked);
          fPesan f = new fPesan(listUnbooked, listBooked);
//        new fPesan(listUnbooked).setVisible(true);
//        f.setLayout(null);
          f.setVisible(true);
    }
}
