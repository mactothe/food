package food.common;

import food.AlertApplication;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = { AlertApplication.class })
public class CucumberSpingConfiguration {}
