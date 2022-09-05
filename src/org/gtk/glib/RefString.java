package org.gtk.glib;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * A typedef for a reference-counted string. A pointer to a #GRefString can be
 * treated like a standard `char*` array by all code, but can additionally have
 * `g_ref_string_*()` methods called on it. `g_ref_string_*()` methods cannot be
 * called on `char*` arrays not allocated using g_ref_string_new().
 * 
 * If using #GRefString with autocleanups, g_autoptr() must be used rather than
 * g_autofree(), so that the reference counting metadata is also freed.
 */
public class RefString {

    private final byte value;
    
    public RefString(byte value) {
        this.value = value;
    }
    
    public byte getValue() {
        return this.value;
    }
    
}
