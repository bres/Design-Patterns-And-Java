package designPatterns.Behavioral.Visitor;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Elevator elevator1 = new Elevator();
        Elevator elevator2 = new Elevator();


        Floor floor1 = new Floor();
        Floor floor2 = new Floor();
        Floor floor3 = new Floor();

        ArrayList <IElement> visitables = new ArrayList<IElement>();
        visitables.add(elevator1);
        visitables.add(elevator2);
        visitables.add(floor1);
        visitables.add(floor2);
        visitables.add(floor3);

        VisitorEmployee employee1 = new VisitorEmployee("takis");
        VisitorGuest guest1 = new VisitorGuest("george");

        for (IElement iterator:visitables) {
            iterator.accept(employee1);
            iterator.accept(guest1);
        }

    }
}
