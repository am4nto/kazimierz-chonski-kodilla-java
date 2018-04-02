package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TaskListDaoTestSuite {
    @Autowired
    private TaskListDao taskListDao;
    private static final String NAME = "Lista1";
    private static final String DESCRIPTION = "Lista testowa";

    @Test
    public void testFindByListName(){
        //Given
        TaskList list = new TaskList(NAME, DESCRIPTION);
        taskListDao.save(list);
        String name = list.getListName();

        //When
        List<TaskList>taskLists = taskListDao.findByListName(NAME);

        //Then
        Assert.assertEquals(1, taskLists.size());

        //Cleanup
        int id = taskLists.get(0).getId();
        taskListDao.delete(id);
    }
}
