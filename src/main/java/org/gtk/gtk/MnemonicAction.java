package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A {@code GtkShortcutAction} that calls gtk_widget_mnemonic_activate().
 */
public class MnemonicAction extends org.gtk.gtk.ShortcutAction {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkMnemonicAction";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    @ApiStatus.Internal
    public MnemonicAction(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /**
     * Cast object to MnemonicAction if its GType is a (or inherits from) "GtkMnemonicAction".
     * @param  gobject            An object that inherits from GObject
     * @return                    An instance of "MnemonicAction" that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GtkMnemonicAction", a ClassCastException will be thrown.
     */
    public static MnemonicAction castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), org.gtk.gobject.GObject.typeFromName("GtkMnemonicAction"))) {
            return new MnemonicAction(gobject.refcounted());
        } else {
            throw new ClassCastException("Object type is not an instance of GtkMnemonicAction");
        }
    }
    
    /**
     * Gets the mnemonic action.
     * <p>
     * This is an action that calls gtk_widget_mnemonic_activate()
     * on the given widget upon activation.
     * @return The mnemonic action
     */
    public static @NotNull org.gtk.gtk.MnemonicAction get() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_mnemonic_action_get.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gtk.MnemonicAction(Refcounted.get(RESULT, false));
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_mnemonic_action_get = Interop.downcallHandle(
            "gtk_mnemonic_action_get",
            FunctionDescriptor.of(ValueLayout.ADDRESS)
        );
    }
}
