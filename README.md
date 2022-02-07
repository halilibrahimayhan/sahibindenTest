# Sahibindencom Test Case for Search Scenario  
<hr>
It contains test search scenarios of sahibinden.com homepage and category pages.
Our application was created with Intellij Idea IDE and java-maven infrastructure.<br>
There are 3 packages in main. Business packages contains concretes and pages packages. FilterByListingDate,SearchBox classes are included in package "concretes" inherits from PageCommon<br>ProductPage,ProductDetailsPage,HomePage,CategoryPage classes are included in package "pages".<br>Log classes is included in package utilities.result 
<hr>
<b>Technologies used in the project:</b><br>
<ul>
<li>Apache Maven 3.6+</li>
<li>SeleniumHQ 3.141.59</li>
<li>JUnit 5.8.2</li>
<li>BoniGarcia WebDriverManager 4.4.3</li>
</ul><hr>
<b>Docker Install</b><br>
For install Docker Engine https://docs.docker.com/engine/install/<br>
<hr>
<b>Get Starter</b><br>
git clone git@github.com:halilibrahimayhan/SahibindenTest.git<br>
mvn compile<br><hr>
<b>Docker Compose</b><br>
To Run Docker Compose docker-compose up -d<hr>
<b>Build</b><br>
mvn clean install -DskipTests<hr>
<b>Test</b><br>
mvn surefire:test -Dtest=TestSearchOnHomePage#searchOnHomePage<hr>
<b>Allure Report</b><br>
allure serve allure-results<br>
When you run the above code, the reports will be generated in the "{localtemp}\{GUID}\allure-report" directory<hr>
