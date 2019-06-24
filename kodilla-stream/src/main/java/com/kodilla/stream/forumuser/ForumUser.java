package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.time.Period;


public final class ForumUser {
    private final int peselUserID;
    private final String userName;
    private final char userSex;
    private final LocalDate dateOfBirth;
    private final int postedPosts;

    public ForumUser(int peselUserID, String userName, char userSex, int yearOfBirth, int monthOfBirth, int dayOfBirth, int postedPosts) {
        this.peselUserID = peselUserID;
        this.userName = userName;
        this.userSex = userSex;
        this.dateOfBirth = LocalDate.of(yearOfBirth, monthOfBirth, dayOfBirth);
        this.postedPosts = postedPosts;
    }

    public int getPeselUserID() {
        return peselUserID;
    }

    public String getUserName() {
        return userName;
    }

    public char getUserSex() {
        return userSex;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public int getPostedPosts() {
        return postedPosts;
    }
    public int calculateAge(LocalDate birthDate, LocalDate currentDate) {
        if ((birthDate != null) && (currentDate != null)) {
            return Period.between(birthDate, currentDate).getYears();
        } else {
            return 0;
        }
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                " peselUserID = " + peselUserID +
                ", userName = '" + userName + '\'' +
                ", userSex = " + userSex +
                ", dateOfBirth = " + dateOfBirth +
                ", postedPosts = " + postedPosts +
                '}';
    }
}
