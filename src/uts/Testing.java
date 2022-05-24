/*
    Double Linked DoubleCircularLinkedList Circular DoubleCircularLinkedList
 */
package uts;

import uts.forms.*;

public class Testing {

    public static void main(String[] args) {
        ListBooked listBooked = new ListBooked();
        ListUnbooked listUnbooked = new ListUnbooked();
        for (int k = 0; k < 3; k++) {
            for (int i = 1; i <= 20; i++) {
                String j = Integer.toString(i);
                listUnbooked.insertLast("", "", Integer.toString(9 + (3 * k)) + ".00", "A" + j, "Ekonomi");
            }
            for (int i = 1; i <= 10; i++) {
                String j = Integer.toString(i);
                listUnbooked.insertLast("", "", Integer.toString(9 + (3 * k)) + ".00", "B" + j, "Bisnis");
            }
            for (int i = 1; i <= 6; i++) {
                String j = Integer.toString(i);
                listUnbooked.insertLast("", "", Integer.toString(9 + (3 * k)) + ".00", "C" + j, "First Class");
            }
        }
        fMenu f = new fMenu(listUnbooked, listBooked);
        f.setVisible(true);
        f.setResizable(false);
//        new fPesan(listUnbooked).setVisible(true);
//        f.setLayout(null);

    }
}
