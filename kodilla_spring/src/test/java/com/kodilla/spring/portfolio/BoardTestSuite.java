package com.kodilla.spring.portfolio;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BoardTestSuite {
    @Test
    public void testTaskAdd() {
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);

        board.toDoList.tasks.add("task1");
        board.inProgressList.tasks.add("task2");
        board.doneList.tasks.add("task3");

        System.out.println(board.toDoList.tasks);
        System.out.println(board.inProgressList.tasks);
        System.out.println(board.doneList.tasks);
    }

}
