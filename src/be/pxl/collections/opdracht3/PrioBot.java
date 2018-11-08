package be.pxl.collections.opdracht3;

import be.pxl.collections.opdracht2.Action;
import be.pxl.collections.opdracht2.Robot;

import java.util.PriorityQueue;

public class PrioBot extends Robot {
    private PriorityQueue<Command> commandList;

    public PrioBot(String name) {
        super(name);
        this.commandList = new PriorityQueue<>();
    }

    public void addCommand(Action action, String value, int priority) {
        Command command = new Command(action, value, priority);
        this.commandList.add(command);
    }

    @Override
    public int getCommandCount() {
        return this.commandList.size();
    }

    @Override
    public void executeNext() {
        if (getCommandCount() != 0) {
            System.out.println(this.commandList.poll().display());
        }
    }
}
