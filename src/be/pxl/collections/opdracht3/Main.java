package be.pxl.collections.opdracht3;

import be.pxl.collections.opdracht2.Action;
import be.pxl.collections.opdracht2.Robot;

public class Main {
    public static void main(String[] args) {
        PrioBot awesomo = new PrioBot("AWESOM-O");
        PrioBot xatm092 = new PrioBot("X-ATM092");
        PrioBot bgh251f2 = new PrioBot("BGH251F2");

        awesomo.addCommand(Action.MOVELEFTFOOTFORWARD, "1", 2);
        awesomo.addCommand(Action.MOVERIGHTFOOTFORWARD, "1", 2);
        awesomo.addCommand(Action.MOVELEFTFOOTBACKWARDS, "1", 3);
        awesomo.addCommand(Action.MOVERIGHTFOOTBACKWARDS, "1", 3);
        awesomo.addCommand(Action.RAISELEFTARM, "1", 2);
        awesomo.addCommand(Action.RAISERIGHTARM, "1", 2);
        awesomo.addCommand(Action.LOWERLEFTARM, "1", 3);
        awesomo.addCommand(Action.LOWERRIGHTARM, "1", 3);
        awesomo.addCommand(Action.TURNLEFT, "1", 2);
        awesomo.addCommand(Action.TURNRIGHT, "1", 2);
        awesomo.addCommand(Action.TURNHEADLEFT, "0.5", 2);
        awesomo.addCommand(Action.TURNHEADRIGHT, "0.5", 2);
        awesomo.addCommand(Action.TURNHEADTOMIDDLE, "0.5", 3);
        awesomo.addCommand(Action.GRABITEM, "1", 2);
        awesomo.addCommand(Action.DROPITEM, "1", 2);
        awesomo.addCommand(Action.POWERDOWN, "1", 10);
        awesomo.addCommand(Action.POWERUP, "1", 0);
        awesomo.addCommand(Action.SYSTEMCHECK, "1", 1);

        xatm092.addCommand(Action.MOVELEFTFOOTFORWARD, "1", 2);
        xatm092.addCommand(Action.MOVERIGHTFOOTFORWARD, "1", 2);
        xatm092.addCommand(Action.MOVELEFTFOOTBACKWARDS, "1", 3);
        xatm092.addCommand(Action.MOVERIGHTFOOTBACKWARDS, "1", 3);
        xatm092.addCommand(Action.RAISELEFTARM, "1", 2);
        xatm092.addCommand(Action.RAISERIGHTARM, "1", 2);
        xatm092.addCommand(Action.LOWERLEFTARM, "1", 3);
        xatm092.addCommand(Action.LOWERRIGHTARM, "1", 3);
        xatm092.addCommand(Action.TURNLEFT, "1", 2);
        xatm092.addCommand(Action.TURNRIGHT, "1", 2);

        bgh251f2.addCommand(Action.TURNLEFT, "1", 2);
        bgh251f2.addCommand(Action.TURNRIGHT, "1", 2);

        while (awesomo.getCommandCount() > 0) {
            awesomo.executeNext();
        }

        System.out.println();

        while (xatm092.getCommandCount() > 0) {
            xatm092.executeNext();
        }

        System.out.println();

        while (bgh251f2.getCommandCount() > 0) {
            bgh251f2.executeNext();
        }
    }
}
