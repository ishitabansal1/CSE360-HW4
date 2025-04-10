package edu.asu.cse360.staff;

import org.junit.jupiter.api.*;

/**
 * Unit tests for the {@link ReviewerPerformance} class.
 * <p>These tests validate approval rate calculation and bias detection logic.</p>
 * 
 * @author Ishita
 */
public class ReviewerPerformanceTest {

    /**
     * Tests whether the approval rate is correctly calculated
     * based on the number of approved and rejected items.
     */
    @Test
    public void testApprovalRate() {
        ReviewerPerformance rp = new ReviewerPerformance("Alice", 8, 2, 1);
        Assertions.assertEquals(80.0, rp.getApprovalRate());
    }

    /**
     * Tests whether the system detects a potentially biased reviewer
     * based on the number of flags received.
     */
    @Test
    public void testBiasDetection() {
        ReviewerPerformance rp = new ReviewerPerformance("Bob", 5, 5, 6);
        Assertions.assertTrue(rp.isPotentiallyBiased());
    }
}
