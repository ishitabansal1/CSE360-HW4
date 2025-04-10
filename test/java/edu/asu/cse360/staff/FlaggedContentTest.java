package edu.asu.cse360.staff;

/**
 * The {@code FlaggedContent} class represents a piece of content flagged by a user
 * for staff review. It holds relevant data including an ID, the content itself,
 * the review status, and internal notes for instructors.
 * 
 * <p>This class supports common operations such as:
 * <ul>
 *   <li>Viewing ID, content, status, and internal notes</li>
 *   <li>Updating review status and internal notes</li>
 * </ul>
 * 
 * @author Ishita
 * @version 1.0
 */
public class FlaggedContent {
    
    /** Unique identifier for the flagged content */
    private String id;

    /** The actual content that was flagged */
    private String content;

    /** Status of the content: "pending", "reviewed", or "escalated" */
    private String status;

    /** Internal note visible only to instructors */
    private String internalNote;

    /**
     * Constructs a new {@code FlaggedContent} object with the given ID and content.
     * Status is initialized to "pending" and internal note is empty.
     *
     * @param id The unique identifier of the content
     * @param content The content text that was flagged
     */
    public FlaggedContent(String id, String content) {
        this.id = id;
        this.content = content;
        this.status = "pending";
        this.internalNote = "";
    }

    /**
     * Returns the ID of the flagged content.
     *
     * @return the content ID
     */
    public String getId() { return id; }

    /**
     * Returns the content that was flagged.
     *
     * @return the content text
     */
    public String getContent() { return content; }

    /**
     * Returns the current review status of the content.
     *
     * @return the status string
     */
    public String getStatus() { return status; }

    /**
     * Returns the internal note added by staff/instructor.
     *
     * @return the internal note
     */
    public String getInternalNote() { return internalNote; }

    /**
     * Updates the status of the flagged content.
     *
     * @param status the new status to assign (e.g., "reviewed")
     */
    public void setStatus(String status) { this.status = status; }

    /**
     * Sets the internal note for this flagged content.
     *
     * @param note the note text to set
     */
    public void setInternalNote(String note) { this.internalNote = note; }
}
