Feature: to get a set of items that and their prices
Scenario: to get the list of products and thier prices
Given  the user should be present in the flipkart home page
When  the user must enter iphone in the search box
And  click the search button
And  print the list of products apeared with prices
And print the price in ascending order
Then to validate the prices in ascending order
