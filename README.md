# CSE360 - Individual Homework 4 (HW4)

## Author
**Ishita Bansal**  
Computer Science, Arizona State University  
Spring 2025

---

## 🧠 Overview

This project implements **Staff Role Functionality** for a collaborative Q&A application, based on the user stories generated from the Staff Epic. It builds upon the Team Project Phase 3 (TP3) foundation and includes full **CRUD** support, internal documentation, Javadoc, and JUnit test cases.

---

## ✅ Features Implemented

The staff role enables:

- Viewing all flagged content in a centralized dashboard
- Updating status of flagged items (`pending`, `reviewed`, `escalated`)
- Adding internal notes (visible only to instructors)
- Escalating serious issues to instructors with priority tagging
- Filtering and sorting flagged content
- Viewing reviewer performance metrics to detect bias or misuse

---

## 📁 Folder Structure

```bash
CSE360-HW4/
├── README.md
├── javadocOutput/                  # Generated Javadoc HTML files
├── src/
│   ├── main/
│   │   └── java/
│   │       └── edu/asu/cse360/staff/
│   │           ├── FlaggedContent.java
│   │           ├── ReviewerPerformance.java
│   │           └── StaffDashboard.java
│
│   └── test/
│       └── java/edu/asu/cse360/staff/
│           ├── FlaggedContentTest.java
│           ├── ReviewerPerformanceTest.java
│           └── StaffDashboardTest.java
