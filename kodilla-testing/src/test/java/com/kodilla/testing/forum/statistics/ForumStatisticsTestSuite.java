package com.kodilla.testing.forum.statistics;

import com.kodilla.testing.forum.statistics.*;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ForumStatisticsTestSuite {
    @Test //users: 0, posts:0, comments:0
    public void testCalculateStatisticsCase1() {
        Statistics statisticsMock = mock(Statistics.class);
        CalculateAdvStatistics calculateAdvStatistics = new CalculateAdvStatistics(statisticsMock);

        Assert.assertEquals(0, calculateAdvStatistics.usersCount);
        Assert.assertEquals(0, calculateAdvStatistics.averagePostsPerUser, 0.01);
        Assert.assertEquals(0, calculateAdvStatistics.averageCommentsPerUser, 0.01);
        Assert.assertEquals(0, calculateAdvStatistics.averageCommentsPerPost, 0.01);
    }

    @Test //users: 100, posts:1000, comments:100
    public void testCalculateStatisticsCase2() {
        Statistics statisticsMock = mock(Statistics.class);
        ArrayList<String>names = new ArrayList<String>();
        for (int i = 0; i<100; i++){names.add("user" + i);}

        when(statisticsMock.usersNames()).thenReturn(names);
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(100);

        CalculateAdvStatistics calculateAdvStatistics = new CalculateAdvStatistics(statisticsMock);

        Assert.assertEquals(100, calculateAdvStatistics.usersCount);
        Assert.assertEquals(10, calculateAdvStatistics.averagePostsPerUser, 0.01);
        Assert.assertEquals(1, calculateAdvStatistics.averageCommentsPerUser, 0.01);
        Assert.assertEquals(0.1, calculateAdvStatistics.averageCommentsPerPost, 0.01);
    }

    @Test //users: 100, posts:1000, comments:10000
    public void testCalculateStatisticsCase3() {
        Statistics statisticsMock = mock(Statistics.class);
        ArrayList<String> names = new ArrayList<String>();
        for (int i = 0; i < 100; i++) {
            names.add("user" + i);
        }

        when(statisticsMock.usersNames()).thenReturn(names);
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(10000);

        CalculateAdvStatistics calculateAdvStatistics = new CalculateAdvStatistics(statisticsMock);

        Assert.assertEquals(100, calculateAdvStatistics.usersCount);
        Assert.assertEquals(10, calculateAdvStatistics.averagePostsPerUser, 0.01);
        Assert.assertEquals(100, calculateAdvStatistics.averageCommentsPerUser, 0.01);
        Assert.assertEquals(10, calculateAdvStatistics.averageCommentsPerPost, 0.01);
    }
}
