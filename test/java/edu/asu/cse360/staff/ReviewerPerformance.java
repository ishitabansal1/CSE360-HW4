package edu.asu.cse360.staff;

/**
 * The ReviewerPerformance class represents performance metrics of a reviewer,
 * including how many items they approved, rejected, or had flagged.
 * It is used by staff members to detect potential reviewer bias or misuse.
 */
public class ReviewerPerformance {

    private String reviewerName;
    private int approved;
    private int rejected;
    private int flagged;

    /**
     * Constructs a ReviewerPerformance object with specified metrics.
     *
     * @param reviewerName the name of the reviewer
     * @param approved the number of approved items
     * @param rejected the number of rejected items
     * @param flagged the number of flagged items
     */
    public ReviewerPerformance(String reviewerName, int approved, int rejected, int flagged) {
        this.reviewerName = reviewerName;
        this.approved = approved;
        this.rejected = rejected;
        this.flagged = flagged;
    }

    /**
     * Returns the name of the reviewer.
     *
     * @return the reviewer's name
     */
    public String getReviewerName() {
        return reviewerName;
    }

    /**
     * Calculates and returns the reviewer's approval rate as a percentage.
     *
     * @return the approval rate in percentage, or 0 if total is 0
     */
    public double getApprovalRate() {
        int total = approved + rejected;
        return total == 0 ? 0 : (double) approved / total * 100;
    }

    /**
     * Determines whether the reviewer may be potentially biased,
     * based on the number of flagged items.
     *
     * @return true if the reviewer is potentially biased; otherwise, false
     */
    public boolean isPotentiallyBiased() {
        return flagged > 5;
    }
}
