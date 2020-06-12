package com.okeyobia.questiontwo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CoinTossTest {

    @Test
    void ReverseHeadsToTailsOrTailsToHeads() {
        CoinToss coinToss = new CoinToss();
        assertEquals("heads", coinToss.reverseHeadsOrTails("tails"));
    }

}