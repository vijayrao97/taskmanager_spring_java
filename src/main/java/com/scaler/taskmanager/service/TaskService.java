package com.scaler.taskmanager.service;

import com.scaler.taskmanager.entities.TaskEntity;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;

@Service
public class TaskService {
    private ArrayList<TaskEntity> tasks = new ArrayList<>();
    private int taskID = 1;

<<<<<<< HEAD
    public void addTask(String title, String description, String deadline){
=======
    public TaskEntity addTask(String title, String description, String deadline){
>>>>>>> 6145daa (Controllers is added)
        TaskEntity task = new TaskEntity();
        task.setId(taskID);
        task.setTitle(title);
        task.setDescription(description);
        task.setDeadline(new Date(deadline)); // Validate Date format YYYY-MM-DD
        task.setCompleted(false);
        tasks.add(task);
        taskID++;
<<<<<<< HEAD
=======
        return task;
>>>>>>> 6145daa (Controllers is added)
    }

    public ArrayList<TaskEntity> getTasks() {
        return tasks;
    }

    public TaskEntity getTaskById(int id) {
        for(TaskEntity task : tasks){
            if( task.getId() == id ){
                return task;
            }
        }
        return null;
    }
}
