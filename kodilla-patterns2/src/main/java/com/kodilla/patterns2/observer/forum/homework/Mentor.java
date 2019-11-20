package com.kodilla.patterns2.observer.forum.homework;

public class Mentor implements MentorInterface {
    private final String mentorName;
    private int updateCount;

    public Mentor(String mentorName) {
        this.mentorName = mentorName;
    }

    @Override
    public void update(Queue queue) {
        System.out.println("Hey mentor " + mentorName +
                ", You have a new task to check in user queue: " +
                queue.getName() +
                "\n" +
                " (total: " +
                queue.getTasks().size() +
                " task)");
        updateCount++;
    }

    public String getUsername() {
        return mentorName;
    }

    public int getUpdateCount() {
        return updateCount;
    }
}
