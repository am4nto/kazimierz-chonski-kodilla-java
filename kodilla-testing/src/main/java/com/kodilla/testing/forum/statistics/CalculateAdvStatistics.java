package com.kodilla.testing.forum.statistics;

import java.util.List;

public class CalculateAdvStatistics {

    public int usersCount;
    public double averagePostsPerUser;
    public double averageCommentsPerUser;
    public double averageCommentsPerPost;

    public CalculateAdvStatistics(Statistics statistics){
        this.usersCount =statistics.usersNames().size();
        if(statistics.usersNames().size() != 0) {
                double posts = statistics.postsCount();
                this.averagePostsPerUser =posts / statistics.usersNames().size();
        }
            else {
                System.out.println("Blad - dzielenie przez zero");
            }
        if(statistics.usersNames().size() != 0) {
                double comments = statistics.commentsCount();
                this.averageCommentsPerUser = comments / statistics.usersNames().size();
        }
            else {
            System.out.println("Blad - dzielenie przez zero");
        }
        if (statistics.postsCount() != 0) {
                double comments = statistics.commentsCount();
                this.averageCommentsPerPost = comments / statistics.postsCount();
        }
            else {
                System.out.println("Blad - dzielenie przez zero");
        }
    }

    public void ShowStatistics(){
        System.out.println(this.usersCount + " " + this.averagePostsPerUser + " " + this.averageCommentsPerPost + " " + this.averageCommentsPerPost);
    }
}
