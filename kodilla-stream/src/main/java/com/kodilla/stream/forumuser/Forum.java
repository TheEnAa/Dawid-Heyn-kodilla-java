package com.kodilla.stream.forumuser;

import java.util.ArrayList;
import java.util.List;

public class Forum {
    private final List<ForumUser> forumUserList = new ArrayList<>();

    public Forum() {
        forumUserList.add(new ForumUser("Magda Dąb",1,'F',1995,1,2,
                10));
        forumUserList.add(new ForumUser("Marek Nowak",2,'M',1999,12,22,
                124));
        forumUserList.add(new ForumUser("Daria Kowal",3,'F',2000,5,12,
                2));
        forumUserList.add(new ForumUser("Patryk Klój",4,'M',1998,11,30,
                43));
        forumUserList.add(new ForumUser("Magdalena Maj",5,'F',1992,7,16,
                184));
        forumUserList.add(new ForumUser("Michał Tauryn",6,'M',2002,2,14,
                88));
        forumUserList.add(new ForumUser("Sylwia Ster",7,'F',1994,8,1,
                73));
        forumUserList.add(new ForumUser("Wiktor Nerg",8,'M',1990,10,20,
                10));
        forumUserList.add(new ForumUser("Joanna Tyna",9,'F',1989,3,15,
               0));
        forumUserList.add(new ForumUser("Dawid Kas",10,'M',1996,6,6,
                1));
    }
    public List<ForumUser> getUserList() {
        return new ArrayList<>(forumUserList);
    }
}
