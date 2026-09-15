# Boundary Value Analysis — letter_grade()

## Boundary Analysis

The valid score domain for `letter_grade()` is 0 to 100. The grade
boundaries are 60, 70, 80, and 90.

| Boundary | Value-1 | Expected | Value | Expected | Value+1 | Expected |
|---|---:|---|---:|---|---:|---|
| 0 | -1 | IllegalArgumentException | 0 | F | 1 | F |
| 60 | 59 | F | 60 | D | 61 | D |
| 70 | 69 | D | 70 | C | 71 | C |
| 80 | 79 | C | 80 | B | 81 | B |
| 90 | 89 | B | 90 | A | 91 | A |
| 100 | 99 | A | 100 | A | 101 | IllegalArgumentException |

## Boundary Values

The complete set of BVA values is:

- `-1, 0, 1`
- `59, 60, 61`
- `69, 70, 71`
- `79, 80, 81`
- `89, 90, 91`
- `99, 100, 101`

These values are selected to test the points immediately below, at, and
immediately above each boundary.
