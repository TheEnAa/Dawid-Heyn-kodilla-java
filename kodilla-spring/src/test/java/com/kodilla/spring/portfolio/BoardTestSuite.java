package com.kodilla.spring.portfolio;


import org.junit.Assert;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
public class BoardTestSuite {
    @Test
    public void testTaskAdd(){
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);
        board.toDoList.tasks.add("to do");
        board.inProgressList.tasks.add("in progress");
        board.doneList.tasks.add("done");
        System.out.println(board);
        Assert.assertEquals("to do", board.getToDoList().getTasks().get(0));
        Assert.assertEquals("in progress", board.getInProgressList().getTasks().get(0));
        Assert.assertEquals("done", board.getDoneList().getTasks().get(0));
    }
}