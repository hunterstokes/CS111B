package Midterm;
public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to the ToDo List!");
        ToDoItem item1 = new ToDoItem("Do the dishes", 1, false);
        ToDoItem item2 = new ToDoItem("Do the laundry", 3, false);
        ToDoItem item3 = new ToDoItem("Do the homework", 4, false);


        // Call the urgentAndIncomplete method and print the result
        int count = urgentAndIncomplete(item1, item2, item3);
        System.out.println("Number of urgent and incomplete items: " + count);
    }

    public static int urgentAndIncomplete(ToDoItem item1, ToDoItem item2, ToDoItem item3) {
        int count = 0;

        if (item1.getPriority() > 3 && !item1.getIsCompleted()) {
            count++;
        }

        if (item2.getPriority() > 3 && !item2.getIsCompleted()) {
            count++;
        }

        if (item3.getPriority() > 3 && !item3.getIsCompleted()) {
            count++;
        }

        return count;
    }
}
