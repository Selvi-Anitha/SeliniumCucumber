$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("classpath:pack2/ChangePassword.feature");
formatter.feature({
  "name": "Change",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@tag"
    }
  ]
});
formatter.scenario({
  "name": "ChangePassword",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@tag"
    },
    {
      "name": "@tag1"
    }
  ]
});
formatter.step({
  "name": "I enter password as \"sham@123\"",
  "keyword": "Given "
});
formatter.match({
  "location": "changeSetup.i_enter_password_as(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter confirm password as \"sham@123\"",
  "keyword": "And "
});
formatter.match({
  "location": "changeSetup.i_enter_confirm_password_as(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The password is changed",
  "keyword": "Then "
});
formatter.match({
  "location": "changeSetup.the_password_is_changed()"
});
formatter.result({
  "status": "passed"
});
});