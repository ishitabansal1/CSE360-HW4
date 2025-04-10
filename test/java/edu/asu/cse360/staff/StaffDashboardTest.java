package edu.asu.cse360.staff;

import org.junit.jupiter.api.*;
import java.util.*;

/**
 * Unit tests for the {@link StaffDashboard} class.
 * <p>These tests validate the core CRUD and filter operations on flagged content.</p>
 * 
 * @author Ishita
 */
public class StaffDashboardTest {

    private StaffDashboard dashboard;

    /**
     * Sets up a sample StaffDashboard with one flagged item
     * before each test is executed.
     */
    @BeforeEach
    public void setUp() {
        dashboard = new StaffDashboard();
        dashboard.addFlaggedContent(new FlaggedContent("1", "Inappropriate comment"));
    }

    /**
     * Tests that a flagged content's status can be successfully updated.
     */
    @Test
    public void testUpdateFlagStatus() {
        dashboard.updateFlagStatus("1", "reviewed");
        Assertions.assertEquals("reviewed", dashboard.getAllFlaggedContent().get(0).getStatus());
    }

    /**
     * Tests that an internal note can be added to a flagged item.
     */
    @Test
    public void testAddInternalNote() {
        dashboard.addInternalNote("1", "Checked and valid.");
        Assertions.assertEquals("Checked and valid.", dashboard.getAllFlaggedContent().get(0).getInternalNote());
    }

    /**
     * Tests that filtering flagged content by status works correctly.
     */
    @Test
    public void testFilterByStatus() {
        dashboard.updateFlagStatus("1", "escalated");
        List<FlaggedContent> result = dashboard.filterByStatus("escalated");
        Assertions.assertEquals(1, result.size());
        Assertions.assertEquals("1", result.get(0).getId());
    }
}
