package edu.asu.cse360.staff;

import java.util.*;

/**
 * The StaffDashboard class provides an interface for staff members to manage and monitor
 * flagged content submitted by users. It includes functionality to view, update, filter, and annotate flagged submissions.
 *
 * <p>This class is central to enabling the staff user role to operate on user-reported issues efficiently.</p>
 *
 * @author Ishita Bansal
 * @version 1.0
 */
public class StaffDashboard {

    /** List of all flagged content items visible to the staff. */
    private List<FlaggedContent> flaggedItems = new ArrayList<>();

    /**
     * Adds a new flagged content item to the dashboard.
     *
     * @param content the flagged content to be added
     */
    public void addFlaggedContent(FlaggedContent content) {
        flaggedItems.add(content);
    }

    /**
     * Retrieves a list of all currently flagged content items.
     *
     * @return a list of FlaggedContent
     */
    public List<FlaggedContent> getAllFlaggedContent() {
        return flaggedItems;
    }

    /**
     * Updates the status of a specific flagged content item by ID.
     *
     * @param id the unique identifier of the flagged content
     * @param newStatus the new status to be set (e.g., "pending", "reviewed", "escalated")
     */
    public void updateFlagStatus(String id, String newStatus) {
        for (FlaggedContent fc : flaggedItems) {
            if (fc.getId().equals(id)) {
                fc.setStatus(newStatus);
            }
        }
    }

    /**
     * Adds an internal note to a specific flagged content item by ID.
     *
     * @param id the unique identifier of the flagged content
     * @param note the note to be added for internal reference
     */
    public void addInternalNote(String id, String note) {
        for (FlaggedContent fc : flaggedItems) {
            if (fc.getId().equals(id)) {
                fc.setInternalNote(note);
            }
        }
    }

    /**
     * Filters and returns a list of flagged content items that match a specific status.
     *
     * @param status the status to filter by
     * @return a list of FlaggedContent items with the specified status
     */
    public List<FlaggedContent> filterByStatus(String status) {
        List<FlaggedContent> result = new ArrayList<>();
        for (FlaggedContent fc : flaggedItems) {
            if (fc.getStatus().equalsIgnoreCase(status)) {
                result.add(fc);
            }
        }
        return result;
    }
}
