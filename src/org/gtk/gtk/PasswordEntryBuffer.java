package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * A `GtkEntryBuffer` that locks the underlying memory to prevent it
 * from being swapped to disk.
 * 
 * `GtkPasswordEntry` uses a `GtkPasswordEntryBuffer`.
 */
public class PasswordEntryBuffer extends EntryBuffer {

    public PasswordEntryBuffer(io.github.jwharm.javagi.interop.Proxy proxy) {
        super(proxy);
    }
    
    /** Cast object to PasswordEntryBuffer */
    public static PasswordEntryBuffer castFrom(org.gtk.gobject.Object gobject) {
        return new PasswordEntryBuffer(gobject.getProxy());
    }
    
    /**
     * Creates a new `GtkEntryBuffer` using secure memory allocations.
     */
    public PasswordEntryBuffer() {
        super(ProxyFactory.getProxy(io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_password_entry_buffer_new(), true));
    }
    
}
