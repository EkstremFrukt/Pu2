package oppgave41;

public class Oppgave41 {

    public static void main(String[] args) {
            Generic<Integer> staticlist = new Generic<>(5);

        staticlist.add(4);
        staticlist.add(3);
        staticlist.add(2);
        staticlist.add(1);
        System.out.println("SIZE: " + staticlist.size());
        staticlist.add(0);
        Integer fire = staticlist.get(0);
        Integer tre = staticlist.get(1);
        Integer to = staticlist.get(2);
        Integer en = staticlist.get(3);
        Integer nul = staticlist.get(4);
        System.out.println(fire);
        System.out.println(tre);
        System.out.println(to);
        System.out.println(en);
        System.out.println(nul);
    }
    
}
