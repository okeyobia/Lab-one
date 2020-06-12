package com.okeyobia.questiontwo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DeliverableTwoTest {


    @Test
    void shouldReturnPercentageOfCorrectGuess() {
        double result = DeliverableTwo.calculateStatistics(10, 4);
        assertEquals(result, 40);
    }

}