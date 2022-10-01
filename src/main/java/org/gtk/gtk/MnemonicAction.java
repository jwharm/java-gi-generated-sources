package org.gtk.gtk;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * A {@code GtkShortcutAction} that calls gtk_widget_mnemonic_activate().
 */
public class MnemonicAction extends ShortcutAction {

    public MnemonicAction(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to MnemonicAction */
    public static MnemonicAction castFrom(org.gtk.gobject.Object gobject) {
        return new MnemonicAction(gobject.refcounted());
    }
    
    /**
     * Gets the mnemonic action.
     * <p>
     * This is an action that calls gtk_widget_mnemonic_activate()
     * on the given widget upon activation.
     */
    public static MnemonicAction get() {
        var RESULT = gtk_h.gtk_mnemonic_action_get();
        return new MnemonicAction(Refcounted.get(RESULT, false));
    }
    
}
