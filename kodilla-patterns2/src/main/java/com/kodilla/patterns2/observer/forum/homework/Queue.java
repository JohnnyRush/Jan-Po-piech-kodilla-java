package com.kodilla.patterns2.observer.forum.homework;

import java.util.ArrayList;
import java.util.List;

public class Queue implements QueueInterface {
    private final List<MentorInterface> mentors;
    private final List<String> tasks;
    private final String name;

    public Queue(String name) {
        mentors = new ArrayList<>();
        tasks = new ArrayList<>();
        this.name = name;
    }

    @Override
    public void registerMentor(MentorInterface mentor) {
        mentors.add(mentor);
    }

    @Override
    public void notifyMentors() {
        for(MentorInterface mentor: mentors){
            mentor.update(this);
        }
    }

    @Override
    public void removeMentor(MentorInterface mentor) {
        mentors.remove(mentor);
    }

    public void addTask(String task){
        tasks.add(task);
        notifyMentors();
    }

    public List<MentorInterface> getMentors() {
        return mentors;
    }

    public List<String> getTasks() {
        return tasks;
    }

    public String getName() {
        return name;
    }
}
