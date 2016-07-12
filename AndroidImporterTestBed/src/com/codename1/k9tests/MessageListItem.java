package com.codename1.k9tests;

import com.codename1.ui.Container;
import com.codename1.ui.Form;
import com.codename1.ui.Dialog;
import com.codename1.ui.util.Resources;


public class MessageListItem extends Container  {
    public MessageListItem(com.codename1.ui.util.Resources resourceObjectInstance) {
        initGuiBuilderComponents(resourceObjectInstance);
    }

//-- DON'T EDIT BELOW THIS LINE!!!
    private com.codename1.ui.Container gui_chip = new com.codename1.ui.Container(new com.codename1.ui.layouts.FlowLayout());
    private com.codename1.ui.Container gui_selectedcheckboxwrapper = new com.codename1.ui.Container(new com.codename1.ui.layouts.BoxLayout(com.codename1.ui.layouts.BoxLayout.Y_AXIS));
    private com.codename1.ui.CheckBox gui_selectedcheckbox = new com.codename1.ui.CheckBox();
    private com.codename1.ui.Label gui_contactbadge = new com.codename1.ui.Label();
    private com.codename1.ui.Container gui_listiteminner = new com.codename1.ui.Container(new com.codename1.ui.layouts.BoxLayout(com.codename1.ui.layouts.BoxLayout.Y_AXIS));
    private com.codename1.components.SpanLabel gui_preview = new com.codename1.components.SpanLabel();
    private com.codename1.ui.Container gui_subjectwrapper = new com.codename1.ui.Container(new com.codename1.ui.layouts.BoxLayout(com.codename1.ui.layouts.BoxLayout.X_AXIS));
    private com.codename1.ui.Label gui_sendercompact = new com.codename1.ui.Label();
    private com.codename1.ui.Label gui_subject = new com.codename1.ui.Label();
    private com.codename1.components.SpanLabel gui_threadcount = new com.codename1.components.SpanLabel();
    private com.codename1.ui.CheckBox gui_flaggedcenterright = new com.codename1.ui.CheckBox();
    private com.codename1.ui.Label gui_date = new com.codename1.ui.Label();
    private com.codename1.ui.CheckBox gui_flaggedbottomright = new com.codename1.ui.CheckBox();


// <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initGuiBuilderComponents(com.codename1.ui.util.Resources resourceObjectInstance) {
        setLayout(new com.codename1.ui.layouts.BoxLayout(com.codename1.ui.layouts.BoxLayout.X_AXIS));
        setName("MessageListItem");
        addComponent(gui_chip);
        addComponent(gui_selectedcheckboxwrapper);
        gui_selectedcheckboxwrapper.setName("selectedcheckboxwrapper");
        gui_selectedcheckboxwrapper.addComponent(gui_selectedcheckbox);
        gui_selectedcheckbox.setName("selectedcheckbox");
        addComponent(gui_contactbadge);
        addComponent(gui_listiteminner);
        gui_listiteminner.setName("listiteminner");
        gui_listiteminner.addComponent(gui_preview);
        gui_listiteminner.addComponent(gui_subjectwrapper);
        gui_subjectwrapper.setName("subjectwrapper");
        gui_subjectwrapper.addComponent(gui_sendercompact);
        gui_subjectwrapper.addComponent(gui_subject);
        gui_subjectwrapper.addComponent(gui_threadcount);
        gui_sendercompact.setText("");
        gui_sendercompact.setName("sendercompact");
        gui_subject.setText("");
        gui_subject.setName("subject");
        gui_threadcount.setText("");
        gui_threadcount.setName("threadcount");
        gui_listiteminner.addComponent(gui_flaggedcenterright);
        gui_listiteminner.addComponent(gui_date);
        gui_listiteminner.addComponent(gui_flaggedbottomright);
        gui_preview.setText("");
        gui_preview.setName("preview");
        gui_subjectwrapper.setName("subjectwrapper");
        gui_flaggedcenterright.setName("flaggedcenterright");
        gui_date.setText("");
        gui_date.setName("date");
        gui_flaggedbottomright.setName("flaggedbottomright");
        gui_chip.setName("chip");
        gui_selectedcheckboxwrapper.setName("selectedcheckboxwrapper");
        gui_contactbadge.setName("contactbadge");
        gui_listiteminner.setName("listiteminner");
    }// </editor-fold>

//-- DON'T EDIT ABOVE THIS LINE!!!
}