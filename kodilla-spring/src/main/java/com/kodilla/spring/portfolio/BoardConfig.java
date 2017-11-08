package com.kodilla.spring.portfolio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class BoardConfig {
    @Autowired
    @Qualifier ("firstList")
    TaskList toDoList;
    @Autowired
    @Qualifier ("sacondList")
    TaskList inProgressList;
    @Autowired
    @Qualifier ("thirdList")
    TaskList doneList;
    @Bean(name = "firstList")
    @Scope("prototype")
    public TaskList getTasksFirst() {
        return new TaskList();
    }
    @Bean(name = "sacondList")
    @Scope("prototype")
    public TaskList getTasksSecond() {
        return new TaskList();
    }
    @Bean(name = "thirdList")
    @Scope("prototype")
    public TaskList getTasksThird() {
        return new TaskList();
    }
    @Bean (name = "board")
    public Board getBoard() {
        return new Board(toDoList, inProgressList, doneList);
    }
}