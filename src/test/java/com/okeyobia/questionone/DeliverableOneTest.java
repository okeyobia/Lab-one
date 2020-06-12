package com.okeyobia.questionone;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DeliverableOneTest {

    @Test
    void shouldReturnVacationType() {
        assertEquals("New Orleans", DeliverableOne.getDestination("musical"));
    }

    @Test
    void shouldReturnFlightType() {
        assertEquals("Charter Flight", DeliverableOne.getFlightType(10));
    }

}