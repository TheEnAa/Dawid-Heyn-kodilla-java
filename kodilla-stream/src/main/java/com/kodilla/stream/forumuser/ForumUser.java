package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public class ForumUser {
    private final String name;
    private final int id;
    private final char sex;
    private final LocalDate dateOfBirth;
    private final int numberOfPosts;

    public ForumUser( final String name,final int id, final char sex, final int yearOfBirth, final
    int monthOfBirth, final int dayOfBirth, final int numberOfPosts) {
        this.name = name;
        this.id = id;
        this.sex = sex;
        this.dateOfBirth = LocalDate.of(yearOfBirth, monthOfBirth, dayOfBirth);
        this.numberOfPosts = numberOfPosts;
    }
    public String getName() {
        return name;
    }
    public int getIdNumber() {
        return id;
    }
    public char getSex() {
        return sex;
    }
    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }
    public int getNumberOfPosts() {
        return numberOfPosts;
    }
    @Override
    public String toString() {
        return "ForumUser(" +
                "Name: " + name +
                ", ID: " + id +
                ", sex: " + sex +
                ", date of birth: " + dateOfBirth +
                ", number of posts: " + numberOfPosts + ")";
    }
}
