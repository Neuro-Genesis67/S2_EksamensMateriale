package dobbeltrettet_personmany_group01;

public class TestP0mG01 {

    public static void main(String[] args) {
        Group g1 = new Group("G1");
        Group g2 = new Group("G2");

        Person p1 = new Person("P1");
        Person p2 = new Person("P2");

        // Before: No connections
        // After: g1 <--> p1
        p1.setGroup(g1);

        System.out.println("Test 1:");
        System.out.println(g1.getPersons().contains(p1));
        System.out.println(p1.getGroup() == g1);

        // Before: g1 <--> p1
        // After: g2 <--> p1
        // Please note, that p1 can't be connected to 2 groups. 
        p1.setGroup(null);
        p1.setGroup(g2);

        System.out.println("Test 2:");
        System.out.println(g2.getPersons().contains(p1));
        System.out.println(p1.getGroup() == g2);
        System.out.println(!g1.getPersons().contains(p1));

        // Before: g2 <--> p1
        // After: g2 <--> p1, g1 <--> p2
        p2.setGroup(g1);

        System.out.println("Test 3:");
        System.out.println(g2.getPersons().contains(p1));
        System.out.println(p1.getGroup() == g2);
        System.out.println(g1.getPersons().contains(p2));
        System.out.println(p2.getGroup() == g1);

        // Before: g2 <--> p1, g1 <--> p2
        // After: g2 <--> p1 and p2
        p2.setGroup(null);
        p2.setGroup(g2);

        System.out.println("Test 4:");
        System.out.println(g2.getPersons().contains(p1));
        System.out.println(g2.getPersons().contains(p2));
        System.out.println(p1.getGroup() == g2);
        System.out.println(p2.getGroup() == g2);
        System.out.println(!g1.getPersons().contains(p2));

        // Before: g2 <--> p1 and p2
        // After: g2 <--> p2
        p1.setGroup(null);

        System.out.println("Test 5:");
        System.out.println(!g2.getPersons().contains(p1));
        System.out.println(p1.getGroup() == null);
        System.out.println(g2.getPersons().contains(p2));
        System.out.println(p2.getGroup() == g2);
    }
}
