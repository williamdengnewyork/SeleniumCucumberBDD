package commandLine;

import org.junit.runner.RunWith; 
import cucumber.junit.Cucumber; 

@RunWith(Cucumber.class) 
@Cucumber.Options(format = {"pretty", "html:target/cucumber"}) 

public class runTest { }



/*
Open a command prompt.

Go to the directory where this package “commandLine” resides. e:\Workspace\LoginTest\src>cd test\java

Run the command "
mvn test
You will see that all the scenario, described in the feature file have been 
executed (if there isn’t any error). Finally, at the bottom you will find the following information.

mvn test -Dcucumber.options="--help"

mvn test -Dcucumber.options="--tags @SmokeTest" 
 -- on command prompt. It will run only tags, which are marked with @SmokeTest.
 
*
*/

