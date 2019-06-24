package com.kodilla.stream;


import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;


import java.time.LocalDate;
import java.util.Map;
import java.util.stream.Collectors;


public class StreamMain {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        System.out.println("Today is : " + today);
        Forum forum = new Forum();
        Map<Integer, ForumUser> theFilteredForumUsersList =
                 forum.getUsersList().stream()
                .filter(ForumUser -> ForumUser.getUserSex() == 'M')
                .filter(ForumUser -> ForumUser.calculateAge(ForumUser.getDateOfBirth(), today) >= 20)
                .filter(ForumUser -> ForumUser.getPostedPosts() > 0)
                .collect(Collectors.toMap(ForumUser::getPeselUserID, ForumUser -> ForumUser));

        System.out.println("Number of users on the filtered list: " + theFilteredForumUsersList.size());
        theFilteredForumUsersList.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())
                .forEach(System.out::println);
    }
}