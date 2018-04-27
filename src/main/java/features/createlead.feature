Feature: Create the lead with mandatory feilds

Scenario Outline: Create the leads positive


And enter username as <uName>

And enter the password as <pwd>

When click on Login button

Then Login is successful

When click on CRM/SFA link

And click on Leads link

And click on Create Lead link

Given enter mandatory fields as <companyName> <firstName> <lastName>

When click on create lead button

Then lead is created successfully with the given details 
Examples:
|uName|pwd|companyName|firstName|lastName|
|DemoSalesManager|crmsfa|Google|srujana|thrinadh|


