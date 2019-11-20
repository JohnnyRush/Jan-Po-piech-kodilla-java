package com.kodilla.patterns2.observer.forum.homework;

import org.junit.Test;

import static org.junit.Assert.*;

public class MentorTestSuite {

    @Test
    public void testUpdate() {
        //Given
        Queue johnRushQueue = new JohnRushQueue();
        Queue elvisPresleyQueue = new ElvisPresleyQueue();
        Queue sylvesterStalloneQueue = new SylvesterStaloneQueue();
        Mentor andrew = new Mentor("Andrew");
        Mentor dalaiLama = new Mentor("Dalai Lama");
        johnRushQueue.registerMentor(andrew);
        johnRushQueue.registerMentor(dalaiLama);
        elvisPresleyQueue.registerMentor(dalaiLama);
        sylvesterStalloneQueue.registerMentor(andrew);
        //When
        johnRushQueue.addTask("Task: patterns part 2");
        johnRushQueue.addTask("Task: patterns part 2");
        elvisPresleyQueue.addTask("Task: patterns part 2");
        sylvesterStalloneQueue.addTask("Task: patterns part 2");
        sylvesterStalloneQueue.addTask("Task: patterns part 2");
        //Then
        assertEquals(4, andrew.getUpdateCount());
        assertEquals(3, dalaiLama.getUpdateCount());
    }
}