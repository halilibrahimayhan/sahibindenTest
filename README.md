# Sahibindencom Test Case for Search Scenario  
<hr>
It contains test search scenarios of sahibinden.com homepage and category pages.
Our application was created with Intellij Idea IDE and java-maven infrastructure.<br>
There are 2 packages in Business folder; abstracts and concretes. "abstracts" packages contains a class called BasePage.<br>
Classes CategoryPage,FilterByListingDate,HomePage,ProductDetailPage,ProductPage,SarchBox found in concretes packages inherits from BasePage.
<hr>
<b>Technologies used in the project:</b><br>
<ul>
<li>Apache Maven 3.6+</li>
<li>SeleniumHQ 3.141.59</li>
<li>JUnit 5.8.2</li>
<li>BoniGarcia WebDriverManager 4.4.3</li>
</ul><hr>
<b>Build</b><br>
mvn clean install<hr>
<b>Test</b><br>
mvn surefire:test -Dtest=TestSearchOnHomePage#searchOnHomePage<hr>
<b>Allure Report</b><br>
allure serve allure-results<hr>
