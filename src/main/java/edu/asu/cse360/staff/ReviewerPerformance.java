package edu.asu.cse360.staff;

public class ReviewerPerformance {
    private String reviewerName;
    private int approved;
    private int rejected;
    private int flagged;

    public ReviewerPerformance(String reviewerName, int approved, int rejected, int flagged) {
        this.reviewerName = reviewerName;
        this.approved = approved;
        this.rejected = rejected;
        this.flagged = flagged;
    }

    public String getReviewerName() { return reviewerName; }
    public double getApprovalRate() {
        int total = approved + rejected;
        return total == 0 ? 0 : (double) approved / total * 100;
    }

    public boolean isPotentiallyBiased() {
        return flagged > 5;
    }
}
