package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

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
    
    private static final MethodHandle gtk_mnemonic_action_get = Interop.downcallHandle(
        "gtk_mnemonic_action_get",
        FunctionDescriptor.of(ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the mnemonic action.
     * <p>
     * This is an action that calls gtk_widget_mnemonic_activate()
     * on the given widget upon activation.
     */
    public static @NotNull MnemonicAction get() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) gtk_mnemonic_action_get.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new MnemonicAction(Refcounted.get(RESULT, false));
    }
    
}
