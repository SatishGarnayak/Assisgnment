$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("flipkart.feature");
formatter.feature({
  "line": 1,
  "name": "flipkart test",
  "description": "",
  "id": "flipkart-test",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Title of your scenario",
  "description": "",
  "id": "flipkart-test;title-of-your-scenario",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "user launches app",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user select mobiles from mainmenu",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user click on view all",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefs.launchApp()"
});
