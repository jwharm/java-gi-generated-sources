package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * `GtkAssistantPage` is an auxiliary object used by `GtkAssistant.
 */
public class AssistantPage extends org.gtk.gobject.Object {

    public AssistantPage(io.github.jwharm.javagi.interop.Reference reference) {
        super(reference);
    }
    
    /** Cast object to AssistantPage */
    public static AssistantPage castFrom(org.gtk.gobject.Object gobject) {
        return new AssistantPage(gobject.getReference());
    }
    
    /**
     * Returns the child to which @page belongs.
     */
    public Widget getChild() {
        var RESULT = gtk_h.gtk_assistant_page_get_child(handle());
        return new Widget(References.get(RESULT, false));
    }
    
}
