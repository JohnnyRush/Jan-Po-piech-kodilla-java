package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public final class Forum {

    private final List<ForumUser> theForumUsersList = new ArrayList<>();

    public Forum() {
        theForumUsersList.add(new ForumUser(1, "John", 'M', 1999, 6, 24, 2));
        theForumUsersList.add(new ForumUser(2, "Johhny", 'M', 1980, 4, 4, 12));
        theForumUsersList.add(new ForumUser(3, "Monica", 'F', 1992, 6, 6, 5));
        theForumUsersList.add(new ForumUser(4, "Carol", 'F', 1989, 12, 8, 4));
        theForumUsersList.add(new ForumUser(5, "Mick", 'M', 1993, 10, 10, 32));
        theForumUsersList.add(new ForumUser(6, "Tom", 'M', 1999, 7, 12, 0));
        theForumUsersList.add(new ForumUser(7, "Peter", 'M', 1977, 3, 14, 15));
        theForumUsersList.add(new ForumUser(8, "Alice", 'F', 1982, 2, 16, 3));
        theForumUsersList.add(new ForumUser(9, "Isabel", 'F', 1990, 5, 18, 0));
        theForumUsersList.add(new ForumUser(10, "Hannah", 'F', 1985, 8, 20, 100));
        theForumUsersList.add(new ForumUser(11, "Bob", 'M', 1970, 9, 22, 26));
        theForumUsersList.add(new ForumUser(12, "Andrew", 'M', 1975, 11, 24, 25));
    }

    public List<ForumUser> getUsersList() {
        return new ArrayList<>(theForumUsersList);
    }
}
