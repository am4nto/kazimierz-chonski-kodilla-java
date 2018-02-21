package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.*;

public final class Forum {
    private final List<ForumUser>usersList = new ArrayList<>();

    DateTimeFormatter germanFormatter = DateTimeFormatter.ofLocalizedDate(
            FormatStyle.MEDIUM).withLocale(Locale.GERMAN);

    public Forum(){
        usersList.add(new ForumUser(1, "User1", 'M', LocalDate.parse("01.12.1985", germanFormatter), 1));
        usersList.add(new ForumUser(2, "Ankaxxx", 'F', LocalDate.parse("06.01.1991", germanFormatter), 14));
        usersList.add(new ForumUser(3, "Edzio123", 'M', LocalDate.parse("01.04.1961",germanFormatter), 0));
        usersList.add(new ForumUser(4, "Killer11", 'M', LocalDate.parse("22.11.2001",germanFormatter), 621));
        usersList.add(new ForumUser(5, "MADAO", 'M', LocalDate.parse("06.11.1979", germanFormatter), 21 ));
        usersList.add(new ForumUser(6, "Zenekk", 'M', LocalDate.parse("06.02.1989", germanFormatter), 5));
    }

    public List<ForumUser>getUsersList(){
        return new ArrayList<>(usersList);
    }

}
