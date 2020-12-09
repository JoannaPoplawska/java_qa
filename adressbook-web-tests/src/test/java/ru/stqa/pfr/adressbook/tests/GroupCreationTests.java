package ru.stqa.pfr.adressbook.tests;

import org.testng.annotations.*;
import ru.stqa.pfr.adressbook.model.TestBase;

public class GroupCreationTests extends TestBase {

    @Test
    public void testGroupCreation() throws Exception {

        app.getNavigationHelper().gotoGroupPage();
        app.getGroupHelper().initGroupCreation();
        app.getGroupHelper().fillGroupFrom(new GroupData("test1", "test2", "test3"));
        app.getGroupHelper().submitGroupCreation();
        app.getGroupHelper().returnToGroupPage();
        //  wd.findElement(By.linkText("Logout")).click();
    }

}

