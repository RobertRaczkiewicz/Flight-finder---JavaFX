import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ComputerItems computer = new ComputerItems();
        computer.displayItems();
    }
}
class ComputerItems {
    ArrayList<String> list = new ArrayList<String>();

    public ComputerItems() {
        list.add("Manchester United");
        list.add("Liverpool");
        list.add("West Ham Unted");
        list.add("Newcastle United");
        list.add("Leeds United");
        list.add("Cardiff City");
    }

    public void displayItems() {
        for (int i = 0; i < list.size(); i++) {
            String element = list.get(i);
            if (element.length() > 12) {
                System.out.println(element);
            }

        }
    }
}

