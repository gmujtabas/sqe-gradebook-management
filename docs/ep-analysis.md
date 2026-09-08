# Equivalence Partitioning Analysis

## 1. Number of Scores

Business rule: A student must have between 1 and 6 scores.

| Equivalence Class | Input Range | Valid/Invalid | Representative Value | Expected Behavior |
|---|---:|---|---:|---|
| Invalid-low | 0 | Invalid | 0 | Input should be rejected |
| Valid | 1–6 | Valid | 3 | Input should be accepted |
| Invalid-high | 7+ | Invalid | 8 | Input should be rejected |


## 2. Student Name

Business rule: The student name must be a non-empty string, have a maximum
length of 50 characters, and contain only letters, spaces, and hyphens.

| Equivalence Class | Example/Range | Valid/Invalid | Representative Value | Expected Behavior |
|---|---|---|---|---|
| Valid typical name | 1–50 characters containing letters, spaces, or hyphens | Valid | `Ali Khan` | Input should be accepted |
| Empty string | 0 characters | Invalid | `""` | Input should be rejected |
| Over-length string | More than 50 characters | Invalid | 51-character name | Input should be rejected |
| Digits/symbols | Contains digits or disallowed symbols | Invalid | `Ali123` | Input should be rejected |
