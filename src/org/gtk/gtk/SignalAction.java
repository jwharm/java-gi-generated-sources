package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * A `GtkShortcut`Action that emits a signal.
 * 
 * Signals that are used in this way are referred to as keybinding signals,
 * and they are expected to be defined with the %G_SIGNAL_ACTION flag.
 */
public class SignalAction extends ShortcutAction {

    public SignalAction(io.github.jwharm.javagi.interop.Proxy proxy) {
        super(proxy);
    }
    
    /** Cast object to SignalAction */
    public static SignalAction castFrom(org.gtk.gobject.Object gobject) {
        return new SignalAction(gobject.getProxy());
    }
    
    /**
     * Creates an action that when activated, emits the given action signal
     * on the provided widget.
     * 
     * It will also unpack the args into arguments passed to the signal.
     */
    public SignalAction(java.lang.String signalName) {
        super(ProxyFactory.get(io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_signal_action_new(Interop.allocateNativeString(signalName).HANDLE()), true));
    }
    
    /**
     * Returns the name of the signal that will be emitted.
     */
    public java.lang.String getSignalName() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_signal_action_get_signal_name(HANDLE());
        return RESULT.getUtf8String(0);
    }
    
}
