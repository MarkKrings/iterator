package Iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {

    // Ein Iterator ist ein Objekt, das eine bestimmte Datenstruktur sequenziell
    // durchläuft. Mit jedem Aufruf seiner Methode next liefert der Iterator jeweils
    // das nächstfolgende Element (Cursor-Objekt) Mithilfe der Methode hasNext stellt
    // der Iterator fest, ob noch weitere Elemente vorhanden sind.
    // Wir erstellen also eine Referenz auf ein Objekt, von dem wir dann den Inhalt
    // abrufen möchten und von diesem Element wird danach wieder eine Referenz auf das
    // nächste Element gezeigt.

    public static void main(String[] args) {


        List<String> namen = new ArrayList();
        namen.add("Dieter");
        namen.add("Anna");
        namen.add("Robert");
        namen.add("Susi");

        System.out.println("Größe der Liste "+namen.size()+"\n----------------------");

        Iterator<String> iterator = namen.iterator();

        // hasnext() Überprüft ob diese Referenz auf die wir gerade zeigen ein Nachfolgendes Element hat
        // next() gibt das nächste Element zurück
        // remove() löscht das Element

        while (iterator.hasNext()) {
            String name = iterator.next();

            System.out.println("Der Name lautet: "+name);

            if (name.equals("Robert")) {
                iterator.remove();
                System.out.println("Robert wird entfernt...");
            }
        }

        System.out.println("----------------------");

        for (String name:namen) {
            System.out.println("Der Name lautet: "+name);
        }

        System.out.println("----------------------"+"\nGröße der Liste "+namen.size());
    }
}

