package StepDefinitions;

import Utilities.DriverClass;
import io.cucumber.java.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {

    @Before // This method runs before every scenario
    public void beforeScenario(){
        System.out.println("Scenario has started");
    }

    @After // This method runs after every scenario
    public void afterScenario(Scenario scenario){
        System.out.println("Scenario has ended");

        if(scenario.isFailed()){
            byte[]byteImage=((TakesScreenshot) DriverClass.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(byteImage,"image/png","screenShot name");
        }
        //Saves the screenshot on our computer.
        /* if (scenario.isFailed()){
            TakesScreenshot takesScreenshot = (TakesScreenshot) DriverClass.getDriver();
            File file=takesScreenshot.getScreenshotAs(OutputType.FILE);

            LocalDateTime timeOfError= LocalDateTime.now();
            DateTimeFormatter formatter= DateTimeFormatter.ofPattern("MM_dd_yyyy_HH_mm_ss");


            try {
                FileUtils.copyFile(file,new File("ScreenShots/screenshot"+timeOfError.format(formatter)+".png"));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }*/
        DriverClass.quitDriver();

    }

//    @BeforeStep
//    public void beforeStep(){
//        System.out.println("Step has started");
//    }
//
//    @AfterStep
//    public void afterStep(){
//        System.out.println("Step has ended");
//    }



}
