package test.theinternet.com.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions (features = "src/test/resources/test.theinternet.com.resourses/Login.feature",
        glue = "test.theinternet.com.stepsdefinitions",
        snippets = SnippetType.CAMELCASE
)

public class LoginRunner {


}

