package assets.runner;

import assets.src.TaskManager;

import java.util.Scanner;

public class TaskManagerApp {
    public static void main(String[] args) {
        TaskManager taskManager = new TaskManager();
        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.println("\nTaskManager");
            System.out.println("1. Add Task");
            System.out.println("2. View Tasks");
            System.out.println("3. Mark Task as Completed");
            System.out.println("4. Unmark Task");
            System.out.println("5. Delete Task");
            System.out.println("6. Exit Task Manager");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); //Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter task desc.: ");
                    String description = scanner.nextLine();
                    taskManager.addTask(description);
                    break;
                case 2:
                    taskManager.displayTasks();
                    break;
                case 3:
                    System.out.print("Enter task number to mark as completed: ");
                    int completedIndex = scanner.nextInt() - 1;
                    taskManager.completeTask(completedIndex);
                    break;
                case 4:
                    System.out.print("Enter task number to unmark: ");
                    int unmarkIndex = scanner.nextInt() - 1;
                    taskManager.unMarkTask(unmarkIndex);
                    break;
                case 5:
                    System.out.print("Enter task number to delete: ");
                    int deleteIndex = scanner.nextInt() - 1;
                    taskManager.deleteTask(deleteIndex);
                    break;
                case 6:
                    System.out.println("Exiting Task Manager. Goodbye!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}
