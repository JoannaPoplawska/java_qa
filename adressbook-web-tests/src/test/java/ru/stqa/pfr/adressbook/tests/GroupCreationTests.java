package ru.stqa.pfr.adressbook.tests;

import org.testng.annotations.*;
import ru.stqa.pfr.adressbook.model.TestBase;

public class GroupCreationTests extends TestBase {

  @Test
  public void testGroupCreation() throws Exception {

    app.gotoGroupPage();
    app.initGroupCreation();
    app.fillGroupFrom(new GroupData("test1", "test2", "test3"));
    app.submitGroupCreation();
    app.returnToGroupPage();
  //  wd.findElement(By.linkText("Logout")).click();
  }

}

