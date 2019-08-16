$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src\\test\\resources\\features\\login\\login.feature");
formatter.feature({
  "name": "Login",
  "description": "  As user I want to login under different roles",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Login as a help desk employee",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user is on the login page",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginStepDefinitions.user_is_on_the_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user logs in as a help desk employee",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefinitions.user_logs_in_as_a_help_desk_employee()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});