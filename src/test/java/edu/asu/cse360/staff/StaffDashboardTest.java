package edu.asu.cse360.staff;

import org.junit.jupiter.api.*;
import java.util.*;

public class StaffDashboardTest {

    private StaffDashboard dashboard;

    @BeforeEach
    public void setUp() {
        dashboard = new StaffDashboard();
        dashboard.addFlaggedContent(new FlaggedContent("1", "Inappropriate comment"));
    }

    @Test
    public void testUpdateFlagStatus() {
        dashboard.updateFlagStatus("1", "reviewed");
        Assertions.assertEquals("reviewed", dashboard.getAllFlaggedContent().get(0).getStatus());
    }

    @Test
    public void testAddInternalNote() {
        dashboard.addInternalNote("1", "Checked and valid.");
        Assertions.assertEquals("Checked and valid.", dashboard.getAllFlaggedContent().get(0).getInternalNote());
    }

    @Test
    public void testFilterByStatus() {
        dashboard.updateFlagStatus("1", "escalated");
        List<FlaggedContent> result = dashboard.filterByStatus("escalated");
        Assertions.assertEquals(1, result.size());
        Assertions.assertEquals("1", result.get(0).getId());
    }
}
