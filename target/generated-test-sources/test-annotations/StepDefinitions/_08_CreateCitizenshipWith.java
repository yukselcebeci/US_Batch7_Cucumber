package StepDefinitions;

import Pages.DialogContent;
import Utilities.ExcelUtilities;
import io.cucumber.java.en.Then;

import java.awt.*;
import java.util.ArrayList;

public class _08_CreateCitizenshipWith {
    DialogContent dc = new DialogContent();
    @Then("Create a citizenship by Apache POI")

    public void createACitizenshipByApachePOI() {
        dc.clickMethod(dc.getAddButton());
        ArrayList<ArrayList<String>> citizenShipData=
                ExcelUtilities.getDataFromExcel("src/test/java/ApachePOI/Resources/ApacheExcel2.xlsx","testCitizen",2);
    dc.sendKeysMethod(dc.getFormNameInput(),citizenShipData.get(0).get(0));
    dc.sendKeysMethod(dc.getCitizenshipShortName(),citizenShipData.get(0).get(1));
    dc.clickMethod(dc.getSaveButton());
    dc.verifyContainsText(dc.getSuccessMessage(),"success");
    }
}
