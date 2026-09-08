# Equivalence Partitioning Analysis

## 1. Number of Scores

Business rule: A student must have between 1 and 6 scores.

| Equivalence Class | Input Range | Valid/Invalid | Representative Value | Expected Behavior |
|---|---:|---|---:|---|
| Invalid-low | 0 | Invalid | 0 | Input should be rejected |
| Valid | 1–6 | Valid | 3 | Input should be accepted |
| Invalid-high | 7+ | Invalid | 8 | Input should be rejected |
