package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A {@code GtkShortcutTrigger} that never triggers.
 */
public class NeverTrigger extends org.gtk.gtk.ShortcutTrigger {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkNeverTrigger";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    @ApiStatus.Internal
    public NeverTrigger(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /**
     * Cast object to NeverTrigger if its GType is a (or inherits from) "GtkNeverTrigger".
     * @param  gobject            An object that inherits from GObject
     * @return                    An instance of "NeverTrigger" that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GtkNeverTrigger", a ClassCastException will be thrown.
     */
    public static NeverTrigger castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), org.gtk.gobject.GObject.typeFromName("GtkNeverTrigger"))) {
            return new NeverTrigger(gobject.refcounted());
        } else {
            throw new ClassCastException("Object type is not an instance of GtkNeverTrigger");
        }
    }
    
    /**
     * Gets the never trigger.
     * <p>
     * This is a singleton for a trigger that never triggers.
     * Use this trigger instead of {@code null} because it implements
     * all virtual functions.
     * @return The never trigger
     */
    public static @NotNull org.gtk.gtk.NeverTrigger get() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_never_trigger_get.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gtk.NeverTrigger(Refcounted.get(RESULT, false));
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_never_trigger_get = Interop.downcallHandle(
            "gtk_never_trigger_get",
            FunctionDescriptor.of(ValueLayout.ADDRESS)
        );
    }
}
