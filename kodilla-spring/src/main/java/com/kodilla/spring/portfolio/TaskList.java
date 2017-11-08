package com.kodilla.spring.portfolio;

import java.util.ArrayList;
import java.util.List;

public class TaskList {
    List<String> tasks;

    public TaskList() {
        tasks = new ArrayList<>();
    }
    @Override
    public String toString() {
        return "tasks = " + tasks;
    }
    public List<String> getTasks() {
        return tasks;
    }
}