package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A {@code GtkEntryBuffer} that locks the underlying memory to prevent it
 * from being swapped to disk.
 * <p>
 * {@code GtkPasswordEntry} uses a {@code GtkPasswordEntryBuffer}.
 * @version 4.4
 */
public class PasswordEntryBuffer extends org.gtk.gtk.EntryBuffer {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkPasswordEntryBuffer";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    @ApiStatus.Internal
    public PasswordEntryBuffer(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /**
     * Cast object to PasswordEntryBuffer if its GType is a (or inherits from) "GtkPasswordEntryBuffer".
     * @param  gobject            An object that inherits from GObject
     * @return                    An instance of "PasswordEntryBuffer" that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GtkPasswordEntryBuffer", a ClassCastException will be thrown.
     */
    public static PasswordEntryBuffer castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), org.gtk.gobject.GObject.typeFromName("GtkPasswordEntryBuffer"))) {
            return new PasswordEntryBuffer(gobject.refcounted());
        } else {
            throw new ClassCastException("Object type is not an instance of GtkPasswordEntryBuffer");
        }
    }
    
    private static Refcounted constructNew() {
        Refcounted RESULT;
        try {
            RESULT = Refcounted.get((MemoryAddress) DowncallHandles.gtk_password_entry_buffer_new.invokeExact(), true);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new {@code GtkEntryBuffer} using secure memory allocations.
     */
    public PasswordEntryBuffer() {
        super(constructNew());
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_password_entry_buffer_new = Interop.downcallHandle(
            "gtk_password_entry_buffer_new",
            FunctionDescriptor.of(ValueLayout.ADDRESS)
        );
    }
}
