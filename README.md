# SE-public
## Run unit tests with GitHub Actions

### Overview of tools

- uses gradlew to build and run tests
- uses publish-unit-test-result-action by EnricoMi to publish a test summary
- uses GitHub Windows container to run the workflow job

### Work log / challenges

- used standard example from GitHub as basis for setting up the jobs
- it took some effort to find the right combination of Java version and OS
- using Ubuntu first caused file permission issues on gradlew
- the publish-unit-test-result-action needed to be configured with the right directory for the test results

- (the file "Actions · techconvert_SE-public.pdf" contains output from the actions tab as of 2021-11-02)


