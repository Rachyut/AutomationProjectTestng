$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("classpath:feature/Backgroundcolour.feature");
formatter.feature({
  "name": "Validation for the background changing colors.",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@Regression"
    }
  ]
});
formatter.scenario({
  "name": "User should be able to change the background color to blue.",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Regression"
    },
    {
      "name": "@Scenario1"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is on the set SkyBlue Background button",
  "keyword": "Given "
});
formatter.match({
  "location": "steps.BackgroundColorSteps.user_is_on_the_set_SkyBlue_Background_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on the set SkyBlue Background button",
  "keyword": "When "
});
formatter.match({
  "location": "steps.BackgroundColorSteps.user_clicks_on_the_set_SkyBlue_Background_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The background color should change to sky blue",
  "keyword": "Then "
});
formatter.match({
  "location": "steps.BackgroundColorSteps.the_background_color_should_change_to_sky_blue()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "User should be able to change the background color to white.",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Regression"
    },
    {
      "name": "@Scenario2"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is on the set SkyWhite Background button",
  "keyword": "Given "
});
formatter.match({
  "location": "steps.BackgroundColorSteps.user_is_on_the_set_SkyWhite_Background_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on the set SkyWhite Background button",
  "keyword": "When "
});
formatter.match({
  "location": "steps.BackgroundColorSteps.user_clicks_on_the_set_SkyWhite_Background_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The background color should change to White",
  "keyword": "Then "
});
formatter.match({
  "location": "steps.BackgroundColorSteps.the_background_color_should_change_to_White()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});