package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * A `GtkShortcutAction` that calls gtk_widget_activate().
 */
public class ActivateAction extends ShortcutAction {

    public ActivateAction(io.github.jwharm.javagi.interop.Reference reference) {
        super(reference);
    }
    
    /** Cast object to ActivateAction */
    public static ActivateAction castFrom(org.gtk.gobject.Object gobject) {
        return new ActivateAction(gobject.getReference());
    }
    
}
