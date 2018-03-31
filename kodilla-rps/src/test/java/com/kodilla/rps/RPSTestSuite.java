package com.kodilla.rps;

import org.junit.Assert;
import org.junit.Test;

import java.util.Random;

public class RPSTestSuite {

    @Test public void testYouWin() {
        MoveMaker maker = new MoveMaker();
        MoveProcessor processor = new MoveProcessor();
        try {
            Move yuourMove = maker.yourMove("R", 3);
            Move myMove = maker.myMove(2);
            processor.process(yuourMove, myMove);
        } catch (Exception e) {
            System.out.println(e);
        }
        Assert.assertEquals(1, processor.getWinCount());
        Assert.assertEquals(0, processor.getLoseCount());
    }

    @Test public void testYouLose() {
        MoveMaker maker = new MoveMaker();
        MoveProcessor processor = new MoveProcessor();
        try {
            Move yuourMove = maker.yourMove("R", 3);
            Move myMove = maker.myMove(1);
            processor.process(yuourMove, myMove);
        } catch (Exception e) {
            System.out.println(e);
        }
        Assert.assertEquals(0, processor.getWinCount());
        Assert.assertEquals(1, processor.getLoseCount());
    }

    @Test public void testDraw() {
        MoveMaker maker = new MoveMaker();
        MoveProcessor processor = new MoveProcessor();
        try {
            Move yuourMove = maker.yourMove("R", 3);
            Move myMove = maker.myMove(0);
            processor.process(yuourMove, myMove);
        } catch (Exception e) {
            System.out.println(e);
        }
        Assert.assertEquals(0, processor.getWinCount());
        Assert.assertEquals(0, processor.getLoseCount());
    }

}
