package org.gtk.gtk;

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
    
    static final MethodHandle gtk_mnemonic_action_get = Interop.downcallHandle(
        "gtk_mnemonic_action_get",
        FunctionDescriptor.of(ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the mnemonic action.
     * <p>
     * This is an action that calls gtk_widget_mnemonic_activate()
     * on the given widget upon activation.
     */
    public static MnemonicAction get() {
        try {
            var RESULT = (MemoryAddress) gtk_mnemonic_action_get.invokeExact();
            return new MnemonicAction(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
}
