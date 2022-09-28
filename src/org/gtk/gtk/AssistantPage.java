package org.gtk.gtk;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * {@code GtkAssistantPage} is an auxiliary object used by `GtkAssistant.
 */
public class AssistantPage extends org.gtk.gobject.Object {

    public AssistantPage(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to AssistantPage */
    public static AssistantPage castFrom(org.gtk.gobject.Object gobject) {
        return new AssistantPage(gobject.getReference());
    }
    
    /**
     * Returns the child to which {@code page} belongs.
     */
    public Widget getChild() {
        var RESULT = gtk_h.gtk_assistant_page_get_child(handle());
        return new Widget(References.get(RESULT, false));
    }
    
}
