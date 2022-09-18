package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * A <code>GtkShortcut</code>Action that emits a signal.
 * 
 * Signals that are used in this way are referred to as keybinding signals,
 * and they are expected to be defined with the {@link org.gtk.gobject.SignalFlags<code>#ACTION</code>  flag.
 */
public class SignalAction extends ShortcutAction {

    public SignalAction(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to SignalAction */
    public static SignalAction castFrom(org.gtk.gobject.Object gobject) {
        return new SignalAction(gobject.getReference());
    }
    
    private static Reference constructNew(java.lang.String signalName) {
        Reference RESULT = References.get(gtk_h.gtk_signal_action_new(Interop.allocateNativeString(signalName).handle()), true);
        return RESULT;
    }
    
    /**
     * Creates an action that when activated, emits the given action signal
     * on the provided widget.
     * 
     * It will also unpack the args into arguments passed to the signal.
     */
    public SignalAction(java.lang.String signalName) {
        super(constructNew(signalName));
    }
    
    /**
     * Returns the name of the signal that will be emitted.
     */
    public java.lang.String getSignalName() {
        var RESULT = gtk_h.gtk_signal_action_get_signal_name(handle());
        return RESULT.getUtf8String(0);
    }
    
}
