package ru.stqa.pfr.adressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pfr.adressbook.model.TestBase;

public class GroupDeletionTests extends TestBase {

  @Test
  public void testGroupDeletion() throws Exception {
    app.gotoGroupPage();
    app.selectGroup();
    app.deleteSelectedGroups();
    app.returnToGroupPage();
  }

}


