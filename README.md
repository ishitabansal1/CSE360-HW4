# CSE360 - Individual Homework 4
### Author: Ishita Bansal

## 📚 Overview
This project implements the staff-role functionality for the CSE360 Team Project system. The features developed are based on original user stories created from team discussions, and include tools for staff members to manage, review, and escalate flagged content within the system.

This project is a continuation of TP3 and builds on the system architecture and design established earlier.

---

## ✅ Features Implemented
Each feature is implemented as per custom staff-role user stories:

1. **View Flagged Content** – Staff can view all flagged content in a centralized dashboard.
2. **Update Flag Status** – Staff can mark items as "pending", "reviewed", or "escalated".
3. **Leave Internal Notes** – Staff can leave private notes visible only to instructors.
4. **Escalate to Instructors** – Staff can escalate flagged content to instructors with priority.
5. **Filter & Sort Flagged Content** – Content can be filtered by urgency, type, date, and status.
6. **View Reviewer Performance** – Staff can view reviewer metrics to assess bias or misuse.

---

## 🧪 Testing
JUnit 5 tests are provided to ensure the correctness of:
- Flagged content CRUD functionality
- Escalation logic
- Filtering and sorting
- Reviewer performance metrics

Run the test suite using your preferred Java IDE or using:

```bash
