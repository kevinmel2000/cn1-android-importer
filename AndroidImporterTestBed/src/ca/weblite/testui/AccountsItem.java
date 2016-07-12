package ca.weblite.testui;

import com.codename1.ui.Container;
import com.codename1.ui.Form;
import com.codename1.ui.Dialog;
import com.codename1.ui.util.Resources;


public class AccountsItem extends Container  {
    public AccountsItem(com.codename1.ui.util.Resources resourceObjectInstance) {
        initGuiBuilderComponents(resourceObjectInstance);
    }

//-- DON'T EDIT BELOW THIS LINE!!!
    private com.codename1.ui.Container gui_chip = new com.codename1.ui.Container(new com.codename1.ui.layouts.FlowLayout());
    private com.codename1.ui.Container gui_ = new com.codename1.ui.Container(new com.codename1.ui.layouts.BoxLayout(com.codename1.ui.layouts.BoxLayout.Y_AXIS));
    private com.codename1.ui.Label gui_description = new com.codename1.ui.Label();
    private com.codename1.ui.Label gui_email = new com.codename1.ui.Label();
    private com.codename1.ui.Container gui_activeicons = new com.codename1.ui.Container(new com.codename1.ui.layouts.BoxLayout(com.codename1.ui.layouts.BoxLayout.Y_AXIS));
    private com.codename1.ui.Container gui_flaggedmessagecountwrapper = new com.codename1.ui.Container(new com.codename1.ui.layouts.BoxLayout(com.codename1.ui.layouts.BoxLayout.X_AXIS));
    private com.codename1.ui.Container gui_flaggedmessagecounticon = new com.codename1.ui.Container(new com.codename1.ui.layouts.FlowLayout());
    private com.codename1.ui.Label gui_flaggedmessagecount = new com.codename1.ui.Label();
    private com.codename1.ui.Container gui_newmessagecountwrapper = new com.codename1.ui.Container(new com.codename1.ui.layouts.BoxLayout(com.codename1.ui.layouts.BoxLayout.X_AXIS));
    private com.codename1.ui.Container gui_newmessagecounticon = new com.codename1.ui.Container(new com.codename1.ui.layouts.FlowLayout());
    private com.codename1.ui.Label gui_newmessagecount = new com.codename1.ui.Label();
    private com.codename1.ui.Container gui_folderbuttonwrapper = new com.codename1.ui.Container(new com.codename1.ui.layouts.BoxLayout(com.codename1.ui.layouts.BoxLayout.X_AXIS));
    private com.codename1.ui.Container gui__1 = new com.codename1.ui.Container(new com.codename1.ui.layouts.FlowLayout());
    private com.codename1.ui.Button gui_folders = new com.codename1.ui.Button();


// <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initGuiBuilderComponents(com.codename1.ui.util.Resources resourceObjectInstance) {
        setLayout(new com.codename1.ui.layouts.BoxLayout(com.codename1.ui.layouts.BoxLayout.X_AXIS));
        setUIID("Container3Android");
        setName("AccountsItem");
        addComponent(gui_chip);
        addComponent(gui_);
        gui_.setUIID("Container166Android");
        gui_.setName("");
        gui_.addComponent(gui_description);
        gui_.addComponent(gui_email);
        gui_description.setUIID("Label10Android");
        gui_description.setName("description");
        gui_email.setUIID("Label10Android");
        gui_email.setName("email");
        addComponent(gui_activeicons);
        gui_activeicons.setUIID("Container3Android");
        gui_activeicons.setName("activeicons");
        gui_activeicons.addComponent(gui_flaggedmessagecountwrapper);
        gui_flaggedmessagecountwrapper.setUIID("Container158Android");
        gui_flaggedmessagecountwrapper.setName("flaggedmessagecountwrapper");
        gui_flaggedmessagecountwrapper.addComponent(gui_flaggedmessagecounticon);
        gui_flaggedmessagecountwrapper.addComponent(gui_flaggedmessagecount);
        gui_flaggedmessagecounticon.setUIID("Container3Android");
        gui_flaggedmessagecounticon.setName("flaggedmessagecounticon");
        gui_flaggedmessagecount.setUIID("Label10Android");
        gui_flaggedmessagecount.setName("flaggedmessagecount");
        gui_activeicons.addComponent(gui_newmessagecountwrapper);
        gui_newmessagecountwrapper.setUIID("Container158Android");
        gui_newmessagecountwrapper.setName("newmessagecountwrapper");
        gui_newmessagecountwrapper.addComponent(gui_newmessagecounticon);
        gui_newmessagecountwrapper.addComponent(gui_newmessagecount);
        gui_newmessagecounticon.setUIID("Container3Android");
        gui_newmessagecounticon.setName("newmessagecounticon");
        gui_newmessagecount.setUIID("Label10Android");
        gui_newmessagecount.setName("newmessagecount");
        gui_flaggedmessagecountwrapper.setUIID("Container158Android");
        gui_flaggedmessagecountwrapper.setName("flaggedmessagecountwrapper");
        gui_newmessagecountwrapper.setUIID("Container158Android");
        gui_newmessagecountwrapper.setName("newmessagecountwrapper");
        addComponent(gui_folderbuttonwrapper);
        gui_folderbuttonwrapper.setUIID("Container3Android");
        gui_folderbuttonwrapper.setName("folderbuttonwrapper");
        gui_folderbuttonwrapper.addComponent(gui__1);
        gui_folderbuttonwrapper.addComponent(gui_folders);
        gui__1.setUIID("Container3Android");
        gui__1.setName("_1");
        gui_folders.setUIID("Button176Android");
        gui_folders.setName("folders");
        gui_chip.setUIID("Container3Android");
        gui_chip.setName("chip");
        gui_.setUIID("Container166Android");
        gui_.setName("");
        gui_activeicons.setUIID("Container3Android");
        gui_activeicons.setName("activeicons");
        gui_folderbuttonwrapper.setUIID("Container3Android");
        gui_folderbuttonwrapper.setName("folderbuttonwrapper");
    }// </editor-fold>

//-- DON'T EDIT ABOVE THIS LINE!!!
}
