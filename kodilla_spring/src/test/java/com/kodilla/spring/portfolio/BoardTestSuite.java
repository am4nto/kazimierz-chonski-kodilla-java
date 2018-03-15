package com.kodilla.spring.portfolio;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BoardTestSuite {
    @Test
    public void testTaskAdd() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);

        //When
        board.addTodoTask("task1");
        board.addInProgressTask("task2");
        board.addDoneTask("task3");

        String tasks1 = board.getToDoList().tasks.toString();
        String tasks2 = board.getInProgressList().tasks.toString();
        String tasks3 = board.getDoneList().tasks.toString();

        //Then
        Assert.assertEquals("[task1]", tasks1);
        Assert.assertEquals("[task2]", tasks2);
        Assert.assertEquals("[task3]", tasks3);
    }

}
