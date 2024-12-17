import com.katalon.plugin.databuilder.DataBuilderHelper

/*
 * fix the issue error for the below mentioned code
 * i want to generate 10 random email id start witj mohit and end withj domain katalon.com
 * print email
 */

// Import necessary libraries
import org.apache.commons.lang3.RandomStringUtils

// Generate a random email ID starting with "mohit" and ending with "katalon.com"
String randomEmail = "mohit" + RandomStringUtils.randomAlphanumeric(5) + "@katalon.com"

// Print the generated email
println(randomEmail)
 
