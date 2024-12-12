import com.katalon.plugin.databuilder.DataBuilderHelper


name = DataBuilderHelper.getRandomValue('{mohit}')
println(name)
email = DataBuilderHelper.getRandomValue('mohit{123}@katalon.com')
println(email)
println(DataBuilderHelper.getRandomValue("+91{1234567890}"));
