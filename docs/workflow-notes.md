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





## Task 4 — Commit Hygiene Audit

### Last 10 Commits

```text
9111c44 (HEAD -> feature/rename-field-b, origin/feature/rename-field-b) docs: document merge conflict resolution
1c99ed8 fix: resolve rename conflict with main
7b75ff5 (origin/main, origin/HEAD) refactor: rename rollNo to studentId (#9)
3bc923f refactor: rename rollNo to idNumber
2aa2088 (main) feat(gradebook): add Student.average() method (#6)
3585956 Add average method to calculate score average
67bee65 docs: update README
2e08391 Create workflow-notes.md
3914d5a Update feature_request.md
57aaeff Enhance bug report template with severity checkbox



### Two Weak Commit Messages and Improvements

#### 1. Weak Commit Message.
`3585956 Add average method to calculate score average`

#### Improved Conventional Commit.
`feat(gradebook): add Student.average() method`

#### Why the improved version is better.
The original message does not follow the Conventional Commits format. The improved version uses the `feat` type, identifies the `gradebook` scope, and clearly describes the new functionality.


#### 2. Weak Commit Message.
`2e08391 Create workflow-notes.md`

#### Improved Conventional Commit.
`docs: add workflow notes`

#### Why the improved version is better.
The original message does not follow the Conventional Commits format. The improved version uses the `docs` type to clearly communicate that documentation was added. It is more consistent and easier to understand when reviewing Git history.




## Task 5 — Rebase Practice

I created the `feature/interactive-rebase-practice` branch and made four small messy commits:

- `wip`
- `fix typo`
- `more fixes`
- `done`

I then used `git rebase -i main` to squash the four commits into a single clean commit.

The final commit message was:

`feat(workflow): practice interactive rebase`

The rebase produced a cleaner history by replacing several unclear commits with one meaningful Conventional Commit.
