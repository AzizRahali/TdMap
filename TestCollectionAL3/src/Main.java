import java.util.ArrayList;
import java.util.Collection;
import java.util.Objects;
public class Main {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add(1);
        list.add("test");
        list.add(6);
        Person p1 = new Person(1, 20, "Arij", "Arfaoui");
        Person p2 = new Person(2, 22, "Ahmed", "Oueslati");
        Person p3 = new Person(3, 82, "Mayssa", "Mohamed");
        Person p4 = new Person(1, 20, "Arij", "Arfaoui");

        list.add(p1);
        list.add(p2);
        list.add(p3);

        //parcourir toute la liste
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));

        }
        for (var p : list) {
            System.out.println(p);
        }
        //parcourir et afficher les noms des Persons
        for (int i = 0; i < list.size(); i++) {
            Object ob = list.get(i);
            if (ob instanceof Person) {
                Person p = (Person) ob;
                System.out.println("nom :" + p.getNom());
            }
        }
        for (Object obj : list) {
            if (obj instanceof Person)
                System.out.println(((Person) obj).getNom());
        }

        ArrayList<Person> listper = new ArrayList<>();
        listper.add(p1);
        listper.add(p2);
        listper.add(p3);
        System.out.println(listper.contains(p1));
        System.out.println(listper.contains(p4));

        ArrayList<Integer> listInt = new ArrayList<>();
        ArrayList<String> listStr = new ArrayList<>();
        listInt.add(2);
        listInt.add(58);
        listInt.add(89);
        listInt.add(17);
        for (int j = 0; j < listInt.size(); j++) {
            for (int k = 0; k < listInt.size(); k++) {
                if (listInt.get(k) > listInt.get(j)) {
                    Integer x;
                    x = listInt.get(k);
                    listInt.set(k, listInt.get(j));
                    listInt.set(j, x);
                }
            }
        }

        System.out.println(listInt);
        listper.sort();
    }
}