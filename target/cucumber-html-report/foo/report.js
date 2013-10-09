$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("cucumberdemo/GoogleSearch.feature");
formatter.feature({
  "id": "google-search-feature",
  "description": "In order to ensure that Google Search works\r\nI want to run a quick Hello World search.",
  "name": "Google Search Feature",
  "keyword": "Feature",
  "line": 1
});
formatter.before({
  "duration": 72791,
  "status": "passed"
});
formatter.scenario({
  "id": "google-search-feature;hello-world-scenario",
  "description": "",
  "name": "Hello World Scenario",
  "keyword": "Scenario",
  "line": 5,
  "type": "scenario"
});
formatter.step({
  "name": "The search is Hello World",
  "keyword": "Given ",
  "line": 6
});
formatter.step({
  "name": "The Search is performed",
  "keyword": "When ",
  "line": 7
});
formatter.step({
  "name": "The browser title should have Hello World",
  "keyword": "Then ",
  "line": 8
});
formatter.match({
  "location": "GoogleSearchFeature.The_search_is_Hello_World()"
});
formatter.write("img - 1");
formatter.embedding("image/png", "embedded0.png");
formatter.result({
  "duration": 14620633663,
  "status": "passed"
});
formatter.match({
  "location": "GoogleSearchFeature.The_Search_is_performed()"
});
formatter.embedding("image/png", "embedded1.png");
formatter.result({
  "duration": 1286657231,
  "status": "passed"
});
formatter.match({
  "location": "GoogleSearchFeature.The_browser_title_should_have_Hello_World()"
});
formatter.embedding("image/png", "embedded2.png");
formatter.result({
  "duration": 2115057300,
  "status": "passed"
});
});