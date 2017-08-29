package com.kodilla.testing.forum.statistics;

import org.junit.*;


import java.util.ArrayList;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ForumStatisticsTestSuite {
    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }
    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to test number " + testCounter + ".");
    }
    @After
    public void afterEveryTest() {
        System.out.println("Test number " + testCounter + " ended.");
    }
    @AfterClass
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @Test
    public void testCalculateAdvStatistics0Post() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        when(statisticsMock.postsCount()).thenReturn(0);
        ForumStatistics forumStatistics = new ForumStatistics();
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        Assert.assertEquals(0, forumStatistics.getPostNumber());
    }
    @Test
    public void testCalculatedAdvStatistics1000Post() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        when(statisticsMock.postsCount()).thenReturn(1000);
        ForumStatistics forumStatistics = new ForumStatistics();
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        Assert.assertEquals(1000, forumStatistics.getPostNumber());
    }
    @Test
    public void testCalculatedAdvStatistics0Comments() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        when(statisticsMock.commentsCount()).thenReturn(0);
        ForumStatistics forumStatistics = new ForumStatistics();
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        Assert.assertEquals(0, forumStatistics.getCommentNumber());
    }
    @Test
    public void testCalculatedAdvStatisticsMorePostsThenComments() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        when(statisticsMock.commentsCount()).thenReturn(500);
        when(statisticsMock.postsCount()).thenReturn(1000);
        ForumStatistics forumStatistics = new ForumStatistics();
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        Assert.assertEquals(500, forumStatistics.getCommentNumber());
        Assert.assertEquals(1000, forumStatistics.getPostNumber());
        Assert.assertTrue(forumStatistics.getCommentNumber() < forumStatistics.getPostNumber());
    }
    @Test
    public  void testCalculatedAdvStatisticsMoreCommentsThenPosts() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        when(statisticsMock.commentsCount()).thenReturn(1000);
        when(statisticsMock.postsCount()).thenReturn(500);
        ForumStatistics forumStatistics = new ForumStatistics();
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        Assert.assertEquals(1000, forumStatistics.getCommentNumber());
        Assert.assertEquals(500, forumStatistics.getPostNumber());
        Assert.assertTrue(forumStatistics.getCommentNumber() > forumStatistics.getPostNumber());
    }
    @Test
    public void testCalculatedAdvStatistics0Users() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        ArrayList<String> userList = new ArrayList<String>();
        when(statisticsMock.usersNames()).thenReturn(userList);
        ForumStatistics forumStatistics = new ForumStatistics();
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        Assert.assertEquals(0,forumStatistics.getUserNumber());
    }
    @Test
    public void testCalculatedAdvStatistics100Users () {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        ArrayList<String> userList = new ArrayList<String>();
        for(int n = 0;n < 100;n++){
            userList.add("User" + (n+1));
        }
        when(statisticsMock.usersNames()).thenReturn(userList);
        ForumStatistics forumStatistics = new ForumStatistics();
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        Assert.assertEquals(100,forumStatistics.getUserNumber());
    }
}
