# SQE Workflow Notes

## Development Workflow

The workflow for making a change to the SQE Library Management Java project is:

```text
Idea
  ↓
Issue
  ↓
Branch
  ↓
Pull Request
  ↓
Review
  ↓
Merge
  ↓
CI
  ↓
Release


# Git Workflow Notes

## Task 3 — Merge Conflict

A merge conflict occurred between `feature/rename-field-b` and `main` because both branches modified the same field in `src/gradebook/gradebook.java`.

The `feature/rename-field-b` branch renamed `rollNo` to `idNumber`, while `main` had renamed the same field from `rollNo` to `studentId`.

To resolve the conflict locally, I updated the local references to the remote `main` branch and merged `origin/main` into `feature/rename-field-b`. Git reported a conflict in `src/gradebook/gradebook.java`.

I opened the file, removed the conflict markers, and kept the `studentId` version as the final implementation. I then staged the resolved file with `git add`, created the merge commit, and pushed the resolved branch to GitHub.

The conflict occurred because both branches changed the same lines differently. Git could not determine automatically which version should be kept, so manual resolution was required.
