# Sample project - Serenity BDD with Selenium & Junit demo
A sample gradle project demonstrating UI acceptance tests using Selenium, Junit, and Serenity BDD.

## Build.gradle
Serenity plugin is required in order to run Serenity tests with Gradle.

In addition, these dependencies are required:
- Serenity core
- Serenity JUnit
- Serenity Rest Assured

## Usage 
use `gradle clean test` to run tests.
Gradle's default test reports are in the build/reports directory. In addition, Serenity report which shows only the serenity tests can be found in the target/site/serenity directory. 

## Further information
[Introduction to Serenity BDD](http://thucydides.info/docs/articles/introduction-to-serenity-with-junit.html)
