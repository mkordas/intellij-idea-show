package com.michalkordas.intellij.show.newfeatures;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class DebuggingTest {

    @Test
    public void returnsMyFamily() throws Exception {
        assertTrue(new Debugging().myFamily().size() == 3);
    }

    @Test
    public void whatIsTheAnswer() throws Exception {
        assertEquals(42, new Debugging().answerToEverything());
    }
}