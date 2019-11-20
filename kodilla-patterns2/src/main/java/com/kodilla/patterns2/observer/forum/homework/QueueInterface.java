package com.kodilla.patterns2.observer.forum.homework;

public interface QueueInterface {
    void registerMentor (MentorInterface mentor);
    void notifyMentors();
    void removeMentor(MentorInterface mentor);
}
