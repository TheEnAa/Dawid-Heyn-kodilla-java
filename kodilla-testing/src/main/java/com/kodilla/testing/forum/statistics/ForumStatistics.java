package com.kodilla.testing.forum.statistics;

public class ForumStatistics {
    private int userNumber;
    private int commentNumber;
    private int postNumber;
    private double avgPostUser;
    private double avgCommentUser;
    private double avgCommentPost;

    public void calculateAdvStatistics(Statistics statistics) {
        this.userNumber = statistics.usersNames().size();
        this.commentNumber = statistics.commentsCount();
        this.postNumber = statistics.postsCount();
        if (userNumber < 0) {
            this.avgPostUser = postNumber / userNumber;
        }
        if (commentNumber < 0) {
            this.avgCommentUser = commentNumber / userNumber;
        }
        if(postNumber < 0) {
            this.avgCommentPost = commentNumber / postNumber;
        }
    }
    public void ShowStatistics(){
        System.out.println("We have : " + userNumber + " registered users."  + "\n" +
                            "Our users have posted : " + postNumber + " posts, and " + commentNumber + "comments" + "\n"
                            + "Averaging each user wrote : " + avgCommentPost + " posts, and " + avgCommentUser +
                            "comments" + "\n" +
                            "Average number of comments on the post : " + avgCommentPost);
    }
    public int getUserNumber() {
        return userNumber;
    }
    public int getCommentNumber() {
        return commentNumber;
    }
    public int getPostNumber() {
        return postNumber;
    }
    public double getAvgPostUser() {
        return avgPostUser;
    }
    public double getAvgCommentUser() {
        return avgCommentUser;
    }
    public double getAvgCommentPost() {
        return avgCommentPost;
    }
}