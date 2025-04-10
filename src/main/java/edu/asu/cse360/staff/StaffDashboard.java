package edu.asu.cse360.staff;

import java.util.*;

public class StaffDashboard {
    private List<FlaggedContent> flaggedItems = new ArrayList<>();

    public void addFlaggedContent(FlaggedContent content) {
        flaggedItems.add(content);
    }

    public List<FlaggedContent> getAllFlaggedContent() {
        return flaggedItems;
    }

    public void updateFlagStatus(String id, String newStatus) {
        for (FlaggedContent fc : flaggedItems) {
            if (fc.getId().equals(id)) {
                fc.setStatus(newStatus);
            }
        }
    }

    public void addInternalNote(String id, String note) {
        for (FlaggedContent fc : flaggedItems) {
            if (fc.getId().equals(id)) {
                fc.setInternalNote(note);
            }
        }
    }

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
