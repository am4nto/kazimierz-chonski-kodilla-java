package com.kodilla.spring.portfolio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

public class BoardConfig {
    @Autowired
    @Qualifier("list1")
    TaskList toDoList;

    @Autowired
    @Qualifier("list2")
    TaskList inProgressList;

    @Autowired
    @Qualifier("list3")
    TaskList doneList;

    @Bean(name = "list1")
    @Scope("prototype")
    public TaskList getList1() {
        return new TaskList();
    }

    @Bean(name = "list2")
    @Scope("prototype")
    public TaskList getList2() {
        return new TaskList();
    }

    @Bean(name = "list3")
    @Scope("prototype")
    public TaskList getList3() {
        return new TaskList();
    }

    @Bean
    public Board getBoard() {
        return new Board(toDoList, inProgressList, doneList);
    }
}
