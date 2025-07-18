# eSpace-Selenium

## 1-Setup instructions

### clone the online repo "git clone https://github.com/mena7899/eSpace-Selenium"

## 2-Tools Used

### Chrome Version 138.0.7204.101

### Java 17

### Selenium 4.34

### TestNG 7.11.0

### WebDriverManager 6.1.1

### Maven (added to the environmetal varibles)

### REST AUSSERD 5.3.1 (the authentication handled through frontend using selenium and cookies)

## 3-How to run the test

### use git no navigate to the project folder and run "mvn clean install -DskipTests" and "mvn test"

### the selenium task will open a google chrome UI and the REST Assured will run headless

### a test report will be generated in the following path "target/surefire-reports/emailable-report.html"