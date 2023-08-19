# Selenide Java Cucumber BDD GitHub Actions
Example of project with UI tests created using Selenide and Cucumber (Behavior-driven development (BDD)) with Page Object model and integration with GitHub actions

## :gear: Prerequisites:

- [Oracle OpenJDK](https://www.oracle.com/java/technologies/downloads/)
- [Apache Maven](https://maven.apache.org/download.cgi)

## :gear: Setup

1. `git clone [https://github.com/maksr13/cypress-page-object-circleci.git`](https://github.com/maksr13/selenide-java-cucumber-bdd-github-actions.git)
2. cd to `selenide-java-cucumber-bdd-github-actions` folder

## :heavy_check_mark: Run tests

- **Running tests locally**
    - Run `npm test`
- **Running tests on GitHub Actions**: (Note: when we push code to branch, tests don't run automatically. It's because of `workflow_dispatch` option in config file for GitHub Actions workflow.)
    - Open repo on GitHub
    - Go to 'Actions'
    - Select 'Selenide 'Test' workflow
    - Click 'Run Workflow' button
    - Select branch on which you want to run tests
    - Click 'Run Workflow' button
      ![image](https://github.com/maksr13/selenide-java-cucumber-bdd-github-actions/assets/22858879/af7a2b83-7a3b-4d49-b756-33563c5c513f)
    - After tests are completed, an html reports will be available in Artifacts section
      ![image](https://github.com/maksr13/selenide-java-cucumber-bdd-github-actions/assets/22858879/d4f8ff48-c490-48e9-bff3-4e05777d1658)


## :bulb: Information
:file_folder: Tests are located in `src/test/resources/features` folder.
It has a structure like this - each folder corresponds to the menu item of the Web Site, and each subfolder corresponds to each sub-menu item.

![image](https://github.com/maksr13/selenide-java-cucumber-bdd-github-actions/assets/22858879/fb3a3594-fb33-4c90-9ff9-938e9d021b15)
![image](https://github.com/maksr13/cypress-page-object-circleci/assets/22858879/ef417a58-d549-4ad6-86d3-56e7eeee6cea)

:file_folder: Step definitions are located in `src/test/java/steps` folder.

:file_folder: Page objects are located in `src/test/java/pages` folder

Each page object has its own class for Step definitions
![image](https://github.com/maksr13/selenide-java-cucumber-bdd-github-actions/assets/22858879/bd24ee43-1a83-48a5-acd3-bdea4bf1e9f6)

📝 Reporter
    - Cucumber tool has its own reporter that looks like this
    ![image](https://github.com/maksr13/selenide-java-cucumber-bdd-github-actions/assets/22858879/82a1de0c-047d-450e-a92f-5dfd715c64e1)


#### :hammer_and_wrench: Configuration
Config files:
1. `pom.xml` - contains information about the project and configuration details used by Maven to build the project.
2. `.github/workflows/test-selenide.yml` - contains GitHub Actions workflow configuration
