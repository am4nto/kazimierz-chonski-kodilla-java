package com.kodilla.rps;

import org.junit.Assert;
import org.junit.Test;

import java.util.Random;

public class RPSTestSuite {
    @Test
    public void testMove() {
        MoveMaker maker = new MoveMaker();
        MoveProcessor processor = new MoveProcessor();
        Random generator = new Random();
        int count = 10;

        for (int i = 0; i <= count; i++) {
            int random1 = generator.nextInt(3);
            int random2 = generator.nextInt(3);
            //System.out.println(random);
            String moves = "RPS";
            String response = moves.charAt(random1) + "";
            //System.out.println(response);
            try {
                Move yuourMove = maker.yourMove(response);
                Move myMove = maker.myMove(random2);
                processor.process(yuourMove, myMove);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        System.out.println("Wynik: " + processor.getWinCount() + ":" + processor.getLoseCount());
    }

    @Test public void testYouWin() {
        MoveMaker maker = new MoveMaker();
        MoveProcessor processor = new MoveProcessor();
        try {
            Move yuourMove = maker.yourMove("R");
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
            Move yuourMove = maker.yourMove("R");
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
            Move yuourMove = maker.yourMove("R");
            Move myMove = maker.myMove(0);
            processor.process(yuourMove, myMove);
        } catch (Exception e) {
            System.out.println(e);
        }
        Assert.assertEquals(0, processor.getWinCount());
        Assert.assertEquals(0, processor.getLoseCount());
    }

}
