package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;


@RunWith(SpringRunner.class)
@Transactional
@SpringBootTest
public class TaskListDaoTestSuite {

    @Autowired
    private TaskListDao taskListDao;
    private static final String LISTNAME = "ToDo";
    private static final String DESCRIPTION = "Test: Learn Hibernate";



    @Test
    @Transactional
    public void testFindByListName() {
        //Given
        TaskList taskList = new TaskList(LISTNAME, DESCRIPTION);

        //When
        taskListDao.save(taskList);

        //Then
        String lN = taskList.getListName();
        List<TaskList> readTaskList = taskListDao.findByListName(lN);
        Assert.assertEquals(1, readTaskList.size());
    }
}
