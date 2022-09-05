package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * `GtkAssistantPage` is an auxiliary object used by `GtkAssistant.
 */
public class AssistantPage extends org.gtk.gobject.Object {

    public AssistantPage(io.github.jwharm.javagi.interop.Proxy proxy) {
        super(proxy);
    }
    
    /** Cast object to AssistantPage */
    public static AssistantPage castFrom(org.gtk.gobject.Object gobject) {
        return new AssistantPage(gobject.getProxy());
    }
    
    /**
     * Returns the child to which @page belongs.
     */
    public Widget getChild() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_assistant_page_get_child(HANDLE());
        return new Widget(ProxyFactory.getProxy(RESULT, false));
    }
    
}
