package com.kodilla.spring.portfolio;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BoardTestSuite {

    @Test
    public void testTaskAdd() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring.portfolio");
        Board board = context.getBean(Board.class);
        board.toDoList.tasks.add("TaskOne");
        board.inProgressList.tasks.add("TaskTwo");
        board.doneList.tasks.add("TaskThree");

        //When
        String s1 = board.toDoList.tasks.get(0);
        String s2 = board.inProgressList.tasks.get(0);
        String s3 = board.doneList.tasks.get(0);

        //Then
        Assert.assertEquals("TaskOne", s1);
        Assert.assertEquals("TaskTwo", s2);
        Assert.assertEquals("TaskThree", s3);
        System.out.println(s1 + " " + s2 + " " + s3);

    }
}

