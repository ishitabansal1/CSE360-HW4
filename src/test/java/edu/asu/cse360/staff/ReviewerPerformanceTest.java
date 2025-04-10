package edu.asu.cse360.staff;

import org.junit.jupiter.api.*;

public class ReviewerPerformanceTest {

    @Test
    public void testApprovalRate() {
        ReviewerPerformance rp = new ReviewerPerformance("Alice", 8, 2, 1);
        Assertions.assertEquals(80.0, rp.getApprovalRate());
    }

    @Test
    public void testBiasDetection() {
        ReviewerPerformance rp = new ReviewerPerformance("Bob", 5, 5, 6);
        Assertions.assertTrue(rp.isPotentiallyBiased());
    }
} 
