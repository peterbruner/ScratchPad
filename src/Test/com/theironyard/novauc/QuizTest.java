package com.theironyard.novauc;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by peter on 2/24/17.
 */
public class QuizTest {
    Quiz quiz = new Quiz();

    @Test
    public void missingChar() throws Exception {
        assertTrue(quiz.missingChar("ktten", 1), true);
    }

    @Test
    public void nearHundred() throws Exception {
        assertEquals(quiz.nearHundred(93), true);
    }

    @Test
    public void frontBack() throws Exception {
        assertTrue(quiz.frontBack("eodc"), true);
    }

    @Test
    public void backAround() throws Exception {
        assertTrue(quiz.backAround("oHelloo"), true);
        assertTrue(quiz.backAround("aaa"), true);
        assertFalse(quiz.backAround("Helloo"), false);
    }

    @Test
    public void startHi() {
        assertEquals(quiz.startHi("hi"), true);
        assertFalse(quiz.startHi("hhi"));
    }

    @Test
    public void hasTeen() {
        assertTrue(quiz.hasTeen(4, 15, 26));
    }

    @Test
    public void mixStart() throws Exception {
        assertEquals(quiz.mixStart(".*ix.*"), true);
        assertTrue(quiz.mixStart(".*ix.*"));
    }

    @Test
    public void close10() {
        assertEquals(quiz.close10(1,19), 0);
        assertEquals(quiz.close10(2,14), 14);
        assertEquals(quiz.close10(9,55), 9);
    }

    @Test
    public void stringE() {
        assertEquals(quiz.stringE("ee"), true);
        assertEquals(quiz.stringE("Hippopotamus"), false);
        assertEquals(quiz.stringE("cheesee"), false);
    }

    @Test
    public void everyNth() {
        assertEquals(quiz.everyNth("Miracle", 2), "Mrce");
        assertEquals(quiz.everyNth("Chocolates", 3), "Cca");

    }

}