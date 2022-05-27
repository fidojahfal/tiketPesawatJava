package uts;

import uts.forms.*;

public class Main {

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
        listBooked.insertLast("EK7450", "Fido", "9.00", "A6", "Ekonomi");
        listBooked.insertLast("BI6580", "Jahfal", "12.00", "B2", "Bisnis");
        listBooked.insertLast("FC9310", "Prayoga", "15.00", "C4", "First Class");
        listBooked.insertLast("EK2020", "Febri", "12.00", "A2", "Ekonomi");
        listBooked.insertLast("BI8231", "Adi", "9.00", "B6", "Bisnis");
        listBooked.insertLast("BI1400", "Setiyawan", "9.00", "B1", "Bisnis");
        listBooked.insertLast("BI9080", "Rizky", "12.00", "B1", "Bisnis");
        listBooked.insertLast("EK9310", "Wahyu", "15.00", "A4", "Rkonomi");
        listBooked.insertLast("FC1110", "Dewantoro", "12.00", "C1", "First Class");
        listBooked.insertLast("BI8310", "Ravi", "9.00", "B1", "Bisnis");

        listUnbooked.insertAt("EK7450", "Fido", "9.00", "A6", "Ekonomi");
        listUnbooked.insertAt("BI6580", "Jahfal", "12.00", "B2", "Bisnis");
        listUnbooked.insertAt("FC9310", "Prayoga", "15.00", "C4", "First Class");
        listUnbooked.insertAt("EK2020", "Febri", "12.00", "A2", "Ekonomi");
        listUnbooked.insertAt("BI8231", "Adi", "9.00", "B6", "Bisnis");
        listUnbooked.insertAt("BI1400", "Setiyawan", "9.00", "B1", "Bisnis");
        listUnbooked.insertAt("BI9080", "Rizky", "12.00", "B1", "Bisnis");
        listUnbooked.insertAt("EK9310", "Wahyu", "15.00", "A4", "Rkonomi");
        listUnbooked.insertAt("FC1110", "Dewantoro", "12.00", "C1", "First Class");
        listUnbooked.insertAt("BI8310", "Ravi", "9.00", "B1", "Bisnis");

        fMenu f = new fMenu(listUnbooked, listBooked);
        f.setVisible(true);
        f.setResizable(false);

    }
}
