package com.kodilla.patterns.strategy.social;

import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {
    @Test
    public void testDefaultSharingStrategies() {
        //Given
        User user1 = new YGeneration("Edek123");
        User user2 = new ZGeneration("ZenekXXX");
        User user3 = new Millenials("Mariolka11");

        //When
        String user1Post = user1.sharePost();
        System.out.println(user1.getName() + ": " + user1Post);
        String user2Post = user2.sharePost();
        System.out.println(user2.getName() + ": " + user2Post);
        String user3Post = user3.sharePost();
        System.out.println(user3.getName() + ": " + user3Post);

        Assert.assertEquals("Opublikowano na Facebooku", user1Post);
        Assert.assertEquals("Opublikowano na Twitterze", user2Post);
        Assert.assertEquals("Opublikowano na Snapchacie", user3Post);
    }

    @Test
    public void testIndividualSharingStrategy() {
        //Given
        User user = new Millenials("Mariolka11");

        //When
        String post = user.sharePost();
        System.out.println(user.getName() + ": " + post);
        user.setSocialMedia(new FacebookPublisher());
        post = user.sharePost();
        System.out.println(user.getName() + ": " + post);

        //Then
        Assert.assertEquals("Opublikowano na Facebooku", post);
    }
}
