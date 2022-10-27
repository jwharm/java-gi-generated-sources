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
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    public PasswordEntryBuffer(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to PasswordEntryBuffer */
    public static PasswordEntryBuffer castFrom(org.gtk.gobject.Object gobject) {
        return new PasswordEntryBuffer(gobject.refcounted());
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
