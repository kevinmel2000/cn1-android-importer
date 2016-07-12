package ca.weblite.testui;

import com.codename1.ui.Container;
import com.codename1.ui.Form;
import com.codename1.ui.Dialog;
import com.codename1.ui.util.Resources;


public class FoldableLinearlayout extends Container  {
    public FoldableLinearlayout(com.codename1.ui.util.Resources resourceObjectInstance) {
        initGuiBuilderComponents(resourceObjectInstance);
    }

//-- DON'T EDIT BELOW THIS LINE!!!
    private com.codename1.ui.Container gui_foldableControl = new com.codename1.ui.Container(new com.codename1.ui.layouts.BoxLayout(com.codename1.ui.layouts.BoxLayout.X_AXIS));
    private com.codename1.ui.Label gui_foldableIcon = new com.codename1.ui.Label();
    private com.codename1.ui.Label gui_foldableText = new com.codename1.ui.Label();
    private com.codename1.ui.Container gui_foldableContainer = new com.codename1.ui.Container(new com.codename1.ui.layouts.BoxLayout(com.codename1.ui.layouts.BoxLayout.Y_AXIS));


// <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initGuiBuilderComponents(com.codename1.ui.util.Resources resourceObjectInstance) {
        setLayout(new com.codename1.ui.layouts.BoxLayout(com.codename1.ui.layouts.BoxLayout.Y_AXIS));
        setUIID("Container3Android");
        setName("FoldableLinearlayout");
        addComponent(gui_foldableControl);
        gui_foldableControl.setUIID("Container3Android");
        gui_foldableControl.setName("foldableControl");
        gui_foldableControl.addComponent(gui_foldableIcon);
        gui_foldableControl.addComponent(gui_foldableText);
        gui_foldableIcon.setUIID("Label10Android");
        gui_foldableIcon.setName("foldableIcon");
        gui_foldableText.setText("");
        gui_foldableText.setUIID("Label10Android");
        gui_foldableText.setName("foldableText");
        addComponent(gui_foldableContainer);
        gui_foldableControl.setUIID("Container3Android");
        gui_foldableControl.setName("foldableControl");
        gui_foldableContainer.setUIID("Container3Android");
        gui_foldableContainer.setName("foldableContainer");
    }// </editor-fold>

//-- DON'T EDIT ABOVE THIS LINE!!!
}
