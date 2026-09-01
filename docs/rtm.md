# Requirements Traceability Matrix — GradeBook

The Requirements Traceability Matrix (RTM) maps each selected functional requirement to the test cases that verify it. Every requirement must have at least one linked test case.

| Requirement ID | Requirement                                                                                                                               | Test Case ID(s)        | Coverage Status                 |
| -------------- | ----------------------------------------------------------------------------------------------------------------------------------------- | ---------------------- | ------------------------------- |
| REQ-1          | The system shall reject adding a student whose roll number already exists on the roster.                                                  | TC-007                 | Covered                         |
| REQ-2          | The system shall require a student name to be a non-empty string of at most 50 characters containing only letters, spaces, or hyphens.    | TC-008                 | Covered                         |
| REQ-3          | The system shall reject a negative score when adding a score to a student's record.                                                       | TC-002, TC-003         | Covered                         |
| REQ-4          | The system shall reject a score outside the range 0–100 (inclusive) when adding a score.                                                  | TC-009, TC-010         | Covered                         |
| REQ-5          | The system shall allow a student to have between 0 and 6 scores recorded; a 7th score shall be rejected.                                  | TC-013               | Covered |
| REQ-6          | The system shall compute a student's average as the arithmetic mean of their recorded scores, returning 0.0 for a student with no scores. | TC-004, TC-005, TC-006 | Covered                         |
| REQ-7          | The system shall map a student's average score to a letter grade using the defined grading schedule.                                      | TC-011, TC-012         | Covered                         |
| REQ-8          | The system shall compute the class average as the mean of all students' individual averages.                                              | TC-014               | Covered |



## RTM Coverage Review

All eight selected requirements have at least one linked test case. REQ-5 is verified by TC-013, which tests rejection of a seventh score. REQ-8 is verified by TC-014, which tests calculation of the class average. Therefore, there are no untraced requirements among REQ-1 through REQ-8.
