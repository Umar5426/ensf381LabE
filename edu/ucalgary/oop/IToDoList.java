package edu.ucalgary.oop;
import java.util.*;


public interface IToDoList {
    void addTask(Task task);

    void completeTask(String id);

    void deleteTask(Task task);

    void editTask(int taskId, String newTitle, boolean isCompleted);

    void undo();

    List<Task> listTasks();
}
