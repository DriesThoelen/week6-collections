package be.pxl.collections.opdracht2;

import java.util.ArrayDeque;
import java.util.Deque;

public class Robot {
    private String name;
    private Deque<Command> commandList;
    private Command idleCommand = new Command(Action.IDLE, "0");

    public Robot(String name) {
        this.name = name;
        this.commandList = new ArrayDeque<>();
    }

    public String getName() {
        return name;
    }

    public void addCommand(Action action, String value) {
        Command command = new Command(action, value);
        this.commandList.add(command);
    }

    public int getCommandCount() {
        return this.commandList.size();
    }

    public void executeNext() {
        if (getCommandCount() != 0) {
            System.out.println(this.commandList.pollLast().display());
        } else if (getCommandCount() == 0){
            System.out.println(idleCommand.display());
        }
    }


    protected class Command implements Comparable<Command> {
        private Action action;
        private String value;
        private int priority;

        public Command(Action action) {
            this(action, null, 0);
        }

        public Command(Action action, String value) {
            this(action, value, 0);
        }

        public Command(Action action, String value, int priority) {
            this.action = action;
            this.value = value;
            this.priority = priority;
        }

        public Action getAction() {
            return action;
        }

        public String getValue() {
            return value;
        }

        public int getPriority() {
            return priority;
        }

        public String display() {
            if (value == null) {
                return action.toString();
            }
            return action.toString() + "<" + value + ">";
        }

        @Override
        public int compareTo(Command command2) {
            if (this.priority > command2.priority) {
                return 1;
            }
            else if (this.priority < command2.priority) {
                return -1;
            }

            return 0;
        }
    }
}
