# Software Test Plan — GradeBook

## 1. Introduction

This Test Plan defines the testing approach for the GradeBook module. The purpose of testing is to verify that GradeBook correctly manages students, scores, averages, grades, and class-level calculations according to the defined functional requirements. Testing will focus mainly on functional and negative/error-path behavior. The plan provides the scope, approach, resources, schedule, risks, and pass/fail criteria for testing.

## 2. Test Items

The primary test item is the GradeBook module and its student and score management functionality. The following areas will be tested:

* Student creation and validation
* Duplicate roll number handling
* Score addition and validation
* Maximum score limit
* Student average calculation
* Letter-grade conversion
* Class average calculation

REST API functionality will be considered where it is implemented in the current codebase.

## 3. Features to be Tested

The following features are included in the test scope:

* Adding valid students to the roster
* Rejecting duplicate roll numbers
* Validating student names
* Adding valid scores
* Rejecting negative and out-of-range scores
* Enforcing the maximum of six scores per student
* Calculating student averages
* Converting averages into letter grades
* Calculating the class average
* Handling boundary values such as scores of 0 and 100

Both valid inputs and invalid inputs will be tested to verify normal and error behavior.

## 4. Features Not to be Tested

The visual web UI will not be tested in this test plan if it is outside the scope of the current GradeBook library/module implementation. UI appearance, page layout, colors, fonts, and browser-specific behavior are therefore excluded. Performance testing and security penetration testing are also outside the scope of this lab because the objective is primarily functional test planning and test case management.

## 5. Test Approach

Testing will primarily use black-box functional testing based on the documented requirements. Positive tests will verify that valid inputs produce the expected results, while negative tests will verify that invalid inputs are rejected correctly. Boundary-value testing will be used for important limits such as scores of 0 and 100 and the maximum of six scores. Regression testing will be performed after defects are corrected to ensure that existing functionality continues to work.

## 6. Pass/Fail Criteria

The test execution will be considered successful when:

* At least **95% of all planned test cases pass**.
* **100% of Critical defects are closed** before test completion.
* No requirement covered by the test plan has an unresolved Critical or High-severity defect.
* All mandatory negative/error-path tests execute successfully.
* Any failed test has a corresponding defect record or documented explanation.

A test case is marked **Pass** when the actual result matches the expected result. A test case is marked **Fail** when the actual result differs from the expected result. A test case is marked **Blocked** when it cannot be executed because of an environment, dependency, or implementation issue.

## 7. Test Deliverables

The following testing documents will be produced:

* `docs/test-plan.md` — Test Plan
* `docs/test-cases.md` — Detailed test cases
* `docs/rtm.md` — Requirements Traceability Matrix
* Manual test execution results
* GitHub Issues for confirmed defects, where required

These deliverables will be stored in the GradeBook GitHub repository.

## 8. Environmental Needs

Testing will be performed using the development environment used for the GradeBook project. The required source code, Python environment, dependencies, and test data must be available before execution. GitHub will be used to store and manage the testing documents and defect issues. A Python shell or the project's test environment may be used for manual execution.

## 9. Schedule

Testing activities will follow the Lab 4 schedule:

| Activity                         | Planned Time |
| -------------------------------- | -----------: |
| Test Plan preparation            |   60 minutes |
| Test Case preparation            |   75 minutes |
| Requirements Traceability Matrix |   30 minutes |
| Manual Test Execution            |   35 minutes |
| **Total**                        |  **3 hours** |

Test execution and defect reporting will be completed after the test cases and RTM have been prepared.

## 10. Risks and Mitigations

| Risk                                                         | Mitigation                                                   |
| ------------------------------------------------------------ | ------------------------------------------------------------ |
| Requirements may not fully match the current implementation. | Review the GradeBook code and requirements before execution. |
| A test may fail because of an implementation defect.         | Record the failure and create a GitHub Issue when required.  |
| Test environment or dependencies may be unavailable.         | Verify the environment before manual execution.              |
| Some requirements may have no linked test case.              | Review the RTM and add tests for any untraced requirement.   |
| Changes made while fixing defects may introduce new defects. | Perform regression testing after fixes.                      |

## 11. Test Responsibilities

The student/tester is responsible for preparing the test plan, writing test cases, maintaining the RTM, executing the tests, and recording the results. The tester is also responsible for documenting failures and creating GitHub Issues for confirmed defects. Any corrected defects should be retested to verify that the fix works as expected.

## 12. Approval

This Test Plan is prepared for the GradeBook module as part of Lab 4: Test Planning and Test Case Management. The plan will be reviewed before test execution and updated if significant changes are made to the requirements or implementation.
