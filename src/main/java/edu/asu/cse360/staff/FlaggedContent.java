package edu.asu.cse360.staff;

public class FlaggedContent {
    private String id;
    private String content;
    private String status; // e.g., pending, reviewed, escalated
    private String internalNote;

    public FlaggedContent(String id, String content) {
        this.id = id;
        this.content = content;
        this.status = "pending";
        this.internalNote = "";
    }

    public String getId() { return id; }
    public String getContent() { return content; }
    public String getStatus() { return status; }
    public String getInternalNote() { return internalNote; }

    public void setStatus(String status) { this.status = status; }
    public void setInternalNote(String note) { this.internalNote = note; }
}
