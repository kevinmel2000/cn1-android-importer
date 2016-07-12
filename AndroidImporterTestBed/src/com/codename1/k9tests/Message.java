package com.codename1.k9tests;

import com.codename1.ui.Container;
import com.codename1.ui.Form;
import com.codename1.ui.Dialog;
import com.codename1.ui.util.Resources;


public class Message extends Container  {
    public Message(com.codename1.ui.util.Resources resourceObjectInstance) {
        initGuiBuilderComponents(resourceObjectInstance);
    }

//-- DON'T EDIT BELOW THIS LINE!!!
    private com.codename1.ui.Container gui_ = new com.codename1.ui.Container(new com.codename1.ui.layouts.FlowLayout());
    private com.codename1.ui.Container gui__1 = new com.codename1.ui.Container(new com.codename1.ui.layouts.BoxLayout(com.codename1.ui.layouts.BoxLayout.Y_AXIS));
    private com.codename1.ui.Container gui_headercontainer = new com.codename1.ui.Container(new com.codename1.ui.layouts.FlowLayout());
    private com.codename1.ui.Container gui__2 = new com.codename1.ui.Container(new com.codename1.ui.layouts.BoxLayout(com.codename1.ui.layouts.BoxLayout.X_AXIS));
    private com.codename1.ui.Container gui_chip = new com.codename1.ui.Container(new com.codename1.ui.layouts.FlowLayout());
    private com.codename1.ui.Container gui__3 = new com.codename1.ui.Container(new com.codename1.ui.layouts.BoxLayout(com.codename1.ui.layouts.BoxLayout.Y_AXIS));
    private com.codename1.components.SpanLabel gui_subject = new com.codename1.components.SpanLabel();
    private com.codename1.ui.Container gui__4 = new com.codename1.ui.Container(new com.codename1.ui.layouts.BoxLayout(com.codename1.ui.layouts.BoxLayout.X_AXIS));
    private com.codename1.ui.Container gui__5 = new com.codename1.ui.Container(new com.codename1.ui.layouts.BoxLayout(com.codename1.ui.layouts.BoxLayout.Y_AXIS));
    private com.codename1.ui.Label gui_contactbadge = new com.codename1.ui.Label();
    private com.codename1.ui.Container gui_iconcontainer = new com.codename1.ui.Container(new com.codename1.ui.layouts.BoxLayout(com.codename1.ui.layouts.BoxLayout.Y_AXIS));
    private com.codename1.ui.Container gui_answered = new com.codename1.ui.Container(new com.codename1.ui.layouts.FlowLayout());
    private com.codename1.ui.Container gui_forwarded = new com.codename1.ui.Container(new com.codename1.ui.layouts.FlowLayout());
    private com.codename1.ui.Container gui__6 = new com.codename1.ui.Container(new com.codename1.ui.layouts.BoxLayout(com.codename1.ui.layouts.BoxLayout.Y_AXIS));
    private com.codename1.ui.Label gui_from = new com.codename1.ui.Label();
    private com.codename1.components.SpanLabel gui_tolabel = new com.codename1.components.SpanLabel();
    private com.codename1.components.SpanLabel gui_to = new com.codename1.components.SpanLabel();
    private com.codename1.components.SpanLabel gui_cclabel = new com.codename1.components.SpanLabel();
    private com.codename1.components.SpanLabel gui_cc = new com.codename1.components.SpanLabel();
    private com.codename1.ui.Label gui_date = new com.codename1.ui.Label();
    private com.codename1.ui.Container gui_statusiconstrip = new com.codename1.ui.Container(new com.codename1.ui.layouts.BoxLayout(com.codename1.ui.layouts.BoxLayout.X_AXIS));
    private com.codename1.ui.CheckBox gui_flagged = new com.codename1.ui.CheckBox();
    private com.codename1.ui.Container gui_cryptostatusicon = new com.codename1.ui.Container(new com.codename1.ui.layouts.FlowLayout());
    private com.codename1.ui.Label gui_cryptostatusdotsbg = new com.codename1.ui.Label();
    private com.codename1.ui.Label gui_cryptostatuscombined2 = new com.codename1.ui.Label();
    private com.codename1.ui.Label gui_cryptostatuscombined1 = new com.codename1.ui.Label();
    private com.codename1.ui.Label gui_cryptostatussingle = new com.codename1.ui.Label();
    private com.codename1.components.SpanLabel gui_additionalheadersview = new com.codename1.components.SpanLabel();
    private com.codename1.ui.Container gui__7 = new com.codename1.ui.Container(new com.codename1.ui.layouts.FlowLayout());
    private com.codename1.ui.Button gui_showpictures = new com.codename1.ui.Button();
    private com.codename1.ui.Container gui_messagelayoutanimator = new com.codename1.ui.Container(new com.codename1.ui.layouts.FlowLayout());
    private com.codename1.ui.Container gui__8 = new com.codename1.ui.Container(new com.codename1.ui.layouts.FlowLayout());
    private com.codename1.ui.Container gui__9 = new com.codename1.ui.Container(new com.codename1.ui.layouts.BoxLayout(com.codename1.ui.layouts.BoxLayout.Y_AXIS));
    private com.codename1.ui.Slider gui_messageprogress = new com.codename1.ui.Slider();
    private com.codename1.components.SpanLabel gui_messageprogresstext = new com.codename1.components.SpanLabel();
    private com.codename1.ui.Container gui_messagecontainer = new com.codename1.ui.Container(new com.codename1.ui.layouts.BorderLayout());
    private com.codename1.ui.Button gui_downloadremainder = new com.codename1.ui.Button();


// <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initGuiBuilderComponents(com.codename1.ui.util.Resources resourceObjectInstance) {
        setLayout(new com.codename1.ui.layouts.FlowLayout());
        setName("Message");
        addComponent(gui_);
        gui_.setName("");
        gui_.addComponent(gui__1);
        gui__1.setName("_1");
        gui__1.addComponent(gui_headercontainer);
        gui_headercontainer.setName("headercontainer");
        gui_headercontainer.addComponent(gui__2);
        gui__2.setName("_2");
        gui__2.addComponent(gui_chip);
        gui__2.addComponent(gui__3);
        gui__3.setName("_3");
        gui__3.addComponent(gui_subject);
        gui__3.addComponent(gui__4);
        gui__4.setName("_4");
        gui__4.addComponent(gui__5);
        gui__5.setName("_5");
        gui__5.addComponent(gui_contactbadge);
        gui__5.addComponent(gui_iconcontainer);
        gui_iconcontainer.setName("iconcontainer");
        gui_iconcontainer.addComponent(gui_answered);
        gui_iconcontainer.addComponent(gui_forwarded);
        gui_answered.setName("answered");
        gui_forwarded.setName("forwarded");
        gui_contactbadge.setName("contactbadge");
        gui_iconcontainer.setName("iconcontainer");
        gui__4.addComponent(gui__6);
        gui__6.setName("_6");
        gui__6.addComponent(gui_from);
        gui__6.addComponent(gui_tolabel);
        gui__6.addComponent(gui_to);
        gui__6.addComponent(gui_cclabel);
        gui__6.addComponent(gui_cc);
        gui__6.addComponent(gui_date);
        gui__6.addComponent(gui_statusiconstrip);
        gui_statusiconstrip.setName("statusiconstrip");
        gui_statusiconstrip.addComponent(gui_flagged);
        gui_statusiconstrip.addComponent(gui_cryptostatusicon);
        gui_cryptostatusicon.setName("cryptostatusicon");
        gui_cryptostatusicon.addComponent(gui_cryptostatusdotsbg);
        gui_cryptostatusicon.addComponent(gui_cryptostatuscombined2);
        gui_cryptostatusicon.addComponent(gui_cryptostatuscombined1);
        gui_cryptostatusicon.addComponent(gui_cryptostatussingle);
        gui_cryptostatusdotsbg.setName("cryptostatusdotsbg");
        gui_cryptostatuscombined2.setName("cryptostatuscombined2");
        gui_cryptostatuscombined1.setName("cryptostatuscombined1");
        gui_cryptostatussingle.setName("cryptostatussingle");
        gui_flagged.setName("flagged");
        gui_cryptostatusicon.setName("cryptostatusicon");
        gui_from.setText("general_no_sender");
        gui_from.setName("from");
        gui_tolabel.setText("message_to_label");
        gui_tolabel.setName("tolabel");
        gui_to.setText("");
        gui_to.setName("to");
        gui_cclabel.setText("message_view_cc_label");
        gui_cclabel.setName("cclabel");
        gui_cc.setText("");
        gui_cc.setName("cc");
        gui_date.setText("");
        gui_date.setName("date");
        gui_statusiconstrip.setName("statusiconstrip");
        gui__5.setName("_5");
        gui__6.setName("_6");
        gui__3.addComponent(gui_additionalheadersview);
        gui_subject.setText("");
        gui_subject.setName("subject");
        gui__4.setName("_4");
        gui_additionalheadersview.setText("");
        gui_additionalheadersview.setName("additionalheadersview");
        gui_chip.setName("chip");
        gui__3.setName("_3");
        gui_headercontainer.addComponent(gui__7);
        gui__2.setName("_2");
        gui__7.setName("_7");
        gui__1.addComponent(gui_showpictures);
        gui__1.addComponent(gui_messagelayoutanimator);
        gui_messagelayoutanimator.setName("messagelayoutanimator");
        gui_messagelayoutanimator.addComponent(gui__8);
        gui_messagelayoutanimator.addComponent(gui__9);
        gui__9.setName("_9");
        gui__9.addComponent(gui_messageprogress);
        gui__9.addComponent(gui_messageprogresstext);
        gui_messageprogress.setName("messageprogress");
        gui_messageprogresstext.setText("message_progress_text");
        gui_messageprogresstext.setName("messageprogresstext");
        gui_messagelayoutanimator.addComponent(gui_messagecontainer);
        gui__8.setName("_8");
        gui__9.setName("_9");
        gui_messagecontainer.setName("messagecontainer");
        gui_headercontainer.setName("headercontainer");
        gui_showpictures.setText("message_view_show_pictures_action");
        gui_showpictures.setName("showpictures");
        gui_messagelayoutanimator.setName("messagelayoutanimator");
        gui__1.setName("_1");
        addComponent(gui_downloadremainder);
        gui_.setName("");
        gui_downloadremainder.setText("message_view_download_remainder");
        gui_downloadremainder.setName("downloadremainder");
    }// </editor-fold>

//-- DON'T EDIT ABOVE THIS LINE!!!
}
