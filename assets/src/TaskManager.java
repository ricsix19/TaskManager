package assets.src;

import assets.exception.*;

import java.util.ArrayList;

public class TaskManager {
    private ArrayList<Task> tasks;

    public TaskManager(){
        tasks = new ArrayList<>();
    }

    //Add a task

    public void addTask(String description){
        tasks.add(new Task(description, false));
        System.out.println("Task added: " + description);
    }

    //Display all tasks
    public void displayTasks(){
        if(tasks.isEmpty()){
            System.out.println("No tasks found!");
            return;
        }
        System.out.println("Here are your tasks:");
        for (int i = 0; i < tasks.size(); i++) {
            System.out.println((i+1) + ". " + tasks.get(i).toString());
        }
    }

    //Mark a task as completed
    public void completeTask(int taskIndex) throws TaskException {
        if(taskIndex < 0 || taskIndex >= tasks.size()){
            throw new TaskException("Invalid task number!");
        }
        tasks.get(taskIndex).markAsCompleted();
        System.out.println("Task marked as completed: " + tasks.get(taskIndex).getDescription());
    }

    //Unmark a task
    public void unMarkTask(int taskIndex) throws TaskException{
        if(taskIndex < 0 || taskIndex >= tasks.size()){
            throw new TaskException("Invalid task number!");
        }
        tasks.get(taskIndex).markAsUncompleted();
        System.out.println("Task unmarked: " + tasks.get(taskIndex).getDescription());
    }

    //Delete a task
    public void deleteTask(int taskIndex) throws TaskException{
        if(taskIndex < 0 || taskIndex >= tasks.size()){
            throw new TaskException("Invalid task number!");
        }
        System.out.println("Task deleted: " + tasks.get(taskIndex).getDescription());
        tasks.remove(taskIndex);
    }
}