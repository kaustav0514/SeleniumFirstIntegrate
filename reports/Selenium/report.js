$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/features/Selenium.feature");
formatter.feature({
  "name": "Search and place order for vegetable",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Search for items and then move to check out page for \"\u003cTC\u003e\"",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@test3"
    }
  ]
});
formatter.step({
  "name": "User is on GreenCart Landing page",
  "keyword": "Given "
});
formatter.step({
  "name": "User serch for \"\u003cName\u003e\" vegetable",
  "keyword": "When "
});
formatter.step({
  "name": "Added items to cart",
  "keyword": "Then "
});
formatter.step({
  "name": "User Proceed to check out page",
  "keyword": "And "
});
formatter.step({
  "name": "Verify selected \"\u003cName\u003e\" items are displayed in Checkout page",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "TC",
        "Name"
      ]
    },
    {
      "cells": [
        "TC01",
        "Cucumber"
      ]
    },
    {
      "cells": [
        "TC02",
        "Beetroot"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Search for items and then move to check out page for \"TC01\"",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@test3"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is on GreenCart Landing page",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefinations.Step.user_is_on_GreenCart_Landing_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User serch for \"Cucumber\" vegetable",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefinations.Step.user_serch_for_vegetable(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Added items to cart",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinations.Step.added_items_to_cart()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User Proceed to check out page",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinations.Step.user_Proceed_to_check_out_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify selected \"Cucumber\" items are displayed in Checkout page",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinations.Step.verify_selected_items_are_displayed_in_Checkout_page(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Search for items and then move to check out page for \"TC02\"",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@test3"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is on GreenCart Landing page",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefinations.Step.user_is_on_GreenCart_Landing_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User serch for \"Beetroot\" vegetable",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefinations.Step.user_serch_for_vegetable(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Added items to cart",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinations.Step.added_items_to_cart()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User Proceed to check out page",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinations.Step.user_Proceed_to_check_out_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify selected \"Beetroot\" items are displayed in Checkout page",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinations.Step.verify_selected_items_are_displayed_in_Checkout_page(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});