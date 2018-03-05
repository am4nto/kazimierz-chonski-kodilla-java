package com.kodilla.good.patterns.challenges;

import java.time.LocalDate;

public interface Order {
    boolean orderAccepted(LocalDate orderDate, User user);
}
