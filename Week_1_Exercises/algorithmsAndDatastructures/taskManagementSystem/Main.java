class Node {
    Task task;
    Node next;

    Node(Task task) {
        this.task = task;
        this.next = null;
    }
}

public class Main {
    private Node head;

    public Main() {
        head = null;
    }

    public void addTask(Task task) {
        Node newNode = new Node(task);
        newNode.next = head;
        head = newNode;
    }

    public Task searchTask(String taskId) {
        Node current = head;
        while (current != null) {
            if (current.task.getTaskId().equals(taskId)) {
                return current.task;
            }
            current = current.next;
        }
        return null;
    }

    public void traverseTasks() {
        Node current = head;
        while (current != null) {
            System.out.println("Task ID: " + current.task.getTaskId() +
                               ", Name: " + current.task.getTaskName() +
                               ", Status: " + current.task.getStatus());
            current = current.next;
        }
    }

    public void deleteTask(String taskId) {
        Node current = head;
        Node previous = null;

        if (current != null && current.task.getTaskId().equals(taskId)) {
            head = current.next;
            return;
        }

        while (current != null && !current.task.getTaskId().equals(taskId)) {
            previous = current;
            current = current.next;
        }

        if (current == null) {
            System.out.println("Task not found.");
            return;
        }

        previous.next = current.next;
    }

    public static void main(String[] args) {
        Main tms = new Main();

        Task t1 = new Task("1", "Task One", "Pending");
        Task t2 = new Task("2", "Task Two", "Completed");
        Task t3 = new Task("3", "Task Three", "In Progress");

        tms.addTask(t1);
        tms.addTask(t2);
        tms.addTask(t3);

        System.out.println("Traversing tasks:");
        tms.traverseTasks();

        System.out.println("\nSearching for task with ID 2:");
        Task t = tms.searchTask("2");
        System.out.println(t != null ? t.getTaskName() : "Task not found");

        System.out.println("\nDeleting task with ID 3:");
        tms.deleteTask("3");

        System.out.println("\nTraversing tasks after deletion:");
        tms.traverseTasks();
    }
}
