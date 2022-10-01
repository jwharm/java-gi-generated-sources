package org.gtk.gtk;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
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
    
    private static Refcounted constructNew() {
        Refcounted RESULT = Refcounted.get(gtk_h.gtk_password_entry_buffer_new(), true);
        return RESULT;
    }
    
    /**
     * Creates a new {@code GtkEntryBuffer} using secure memory allocations.
     */
    public PasswordEntryBuffer() {
        super(constructNew());
    }
    
}
