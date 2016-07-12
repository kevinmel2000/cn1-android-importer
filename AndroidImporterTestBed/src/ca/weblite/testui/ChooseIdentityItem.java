package ca.weblite.testui;

import com.codename1.ui.Container;
import com.codename1.ui.Form;
import com.codename1.ui.Dialog;
import com.codename1.ui.util.Resources;


public class ChooseIdentityItem extends Container  {
    public ChooseIdentityItem(com.codename1.ui.util.Resources resourceObjectInstance) {
        initGuiBuilderComponents(resourceObjectInstance);
    }

//-- DON'T EDIT BELOW THIS LINE!!!
    private com.codename1.ui.Label gui_name = new com.codename1.ui.Label();
    private com.codename1.ui.Label gui_description = new com.codename1.ui.Label();


// <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initGuiBuilderComponents(com.codename1.ui.util.Resources resourceObjectInstance) {
        setLayout(new com.codename1.ui.layouts.BoxLayout(com.codename1.ui.layouts.BoxLayout.Y_AXIS));
        setUIID("AndroidContainer204");
        setName("ChooseIdentityItem");
        addComponent(gui_name);
        addComponent(gui_description);
        gui_name.setUIID("Label10Android");
        gui_name.setName("name");
        gui_description.setUIID("Label10Android");
        gui_description.setName("description");
    }// </editor-fold>

//-- DON'T EDIT ABOVE THIS LINE!!!
}