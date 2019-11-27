$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/features/MyTest.feature");
formatter.feature({
  "line": 1,
  "name": "Here page loads and internal links are accessible",
  "description": "",
  "id": "here-page-loads-and-internal-links-are-accessible",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Verify page loads and internal links are accessible",
  "description": "",
  "id": "here-page-loads-and-internal-links-are-accessible;verify-page-loads-and-internal-links-are-accessible",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "the user visits the application",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "the page loads properly",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user can verify broken links",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.the_user_visits_the_application()"
});
formatter.result({
  "duration": 9632751967,
  "status": "passed"
});
formatter.match({
  "location": "Steps.the_page_loads_properly()"
});
formatter.result({
  "duration": 8739843,
  "status": "passed"
});
formatter.match({
  "location": "Steps.user_can_verify_broken_links()"
});
formatter.result({
  "duration": 142135367718,
  "status": "passed"
});
});