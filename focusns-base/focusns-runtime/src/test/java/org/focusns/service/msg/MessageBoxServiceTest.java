package org.focusns.service.msg;

import java.util.Date;

import org.focusns.model.msg.MessageBox;
import org.focusns.service.AbstractServiceTest;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

@Ignore
public class MessageBoxServiceTest extends AbstractServiceTest {

    @Autowired
    private MessageBoxService messageBoxService;

    @Test
    public void testCreateMessageBox() {
         MessageBox messageBox = new MessageBox();
         messageBox.setLabel("收件箱");
         messageBox.setType(MessageBox.TYPE_IN);
         messageBox.setProjectId(1);
         messageBox.setCreateAt(new Date());
         messageBox.setCreateById(1);
         messageBoxService.createMessageBox(messageBox);
    }
}
