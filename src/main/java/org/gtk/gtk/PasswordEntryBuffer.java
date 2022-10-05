package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * A {@code GtkEntryBuffer} that locks the underlying memory to prevent it
 * from being swapped to disk.
 * <p>
 * {@code GtkPasswordEntry} uses a {@code GtkPasswordEntryBuffer}.
 */
public class PasswordEntryBuffer extends EntryBuffer {

    public PasswordEntryBuffer(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to PasswordEntryBuffer */
    public static PasswordEntryBuffer castFrom(org.gtk.gobject.Object gobject) {
        return new PasswordEntryBuffer(gobject.refcounted());
    }
    
    static final MethodHandle gtk_password_entry_buffer_new = Interop.downcallHandle(
        "gtk_password_entry_buffer_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNew() {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) gtk_password_entry_buffer_new.invokeExact(), true);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a new {@code GtkEntryBuffer} using secure memory allocations.
     */
    public PasswordEntryBuffer() {
        super(constructNew());
    }
    
}
