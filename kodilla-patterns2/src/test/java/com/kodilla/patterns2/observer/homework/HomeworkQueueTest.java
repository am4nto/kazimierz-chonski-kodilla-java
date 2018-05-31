package com.kodilla.patterns2.observer.homework;

import org.junit.Test;

import static org.junit.Assert.*;

public class HomeworkQueueTest {

    @Test
    public void testUpdate() {
        //Given
        HomeworkQueue mariansQueue = new HomeworkQueue("Marian Zielonek");
        HomeworkQueue zdzislawsQueue = new HomeworkQueue("Zdzislaw Popiernik");
        HomeworkQueue onufrysQueue = new HomeworkQueue("Onufry Żołądek");
        HomeworkQueue mariolasQueue = new HomeworkQueue("Mariola Zimnicka");
        HomeworkQueue genowefasQueue = new HomeworkQueue("Genowefa Zbychowska");
        HomeworkQueue ziutasQueue = new HomeworkQueue("Ziuta Zdzisławska");
        Mentor marekZajac = new Mentor("Marek Zając");
        Mentor damianKowalski = new Mentor("Damian Kowalski");

        mariansQueue.registerObserver(marekZajac);
        zdzislawsQueue.registerObserver(marekZajac);
        onufrysQueue.registerObserver(damianKowalski);
        mariolasQueue.registerObserver(marekZajac);
        genowefasQueue.registerObserver(damianKowalski);
        ziutasQueue.registerObserver(damianKowalski);

        //When
        mariansQueue.addHomework("Utworzyc pierwsza klase");
        mariansQueue.addHomework("Dodac konstruktor");
        mariansQueue.addHomework("Dodac gettery");
        zdzislawsQueue.addHomework("Utworzyc pierwsza klase");
        onufrysQueue.addHomework("Napisac testy");
        mariolasQueue.addHomework("Dodac gettery");
        genowefasQueue.addHomework("Zastosowac petle foreach");
        genowefasQueue.addHomework("Zastosowac petle for");
        ziutasQueue.addHomework("Utworzyc pierwsza klase");

        //Then
        assertEquals(marekZajac.getUpdateCount(), 5);
        assertEquals(damianKowalski.getUpdateCount(), 4);
    }

}