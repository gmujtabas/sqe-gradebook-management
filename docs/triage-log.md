# Triage Log

## Triage Meeting

The five GradeBook defects were reviewed and ranked based on severity, priority, impact on core functionality, data integrity, and urgency.

## Fix Ranking

### 1. Empty Score List Crash

* Severity: High
* Priority: P1
* Decision: Fix this sprint.
* Reason: The application crashes when calculating an average for a student with no scores, affecting a core GradeBook function.

### 2. Negative Score Accepted

* Severity: High
* Priority: P1
* Decision: Fix this sprint.
* Reason: The application accepts invalid negative scores, which can result in incorrect grades and statistics.

### 3. Duplicate Roll Numbers

* Severity: High
* Priority: P1
* Decision: Fix this sprint.
* Reason: Duplicate roll numbers can cause student records to be confused and affect the integrity of student data.

### 4. Incorrect Average Rounding

* Severity: Medium
* Priority: P2
* Decision: Do not fix this sprint.
* Reason: The issue affects the presentation of averages but does not crash the application or prevent the main GradeBook functions from working.

### 5. Case-Sensitive Name Comparison

* Severity: Low
* Priority: P3
* Decision: Do not fix this sprint.
* Reason: The issue mainly affects search convenience and does not affect grade calculations or student data integrity.

## Severity vs Priority Trade-offs

Severity measures how seriously a defect affects the system, while priority measures how urgently the defect should be fixed.

The empty score list crash is High severity and P1 priority because it causes the application to fail during a core operation, so it should be fixed immediately.

The incorrect average rounding issue is Medium severity and P2 priority. Although accurate averages are important, the application remains usable and the defect does not cause a crash. Therefore, the team can prioritize the three High severity P1 defects first.

The case-sensitive name comparison issue is Low severity and P3 priority. It causes inconvenience during searching but does not affect important GradeBook data, so it can be postponed.

## Sprint Decision

The team will fix these three issues during the current sprint:

1. Empty score list crash
2. Negative score accepted
3. Duplicate roll numbers

The team will not fix these two issues during the current sprint:

4. Incorrect average rounding
5. Case-sensitive name comparison
