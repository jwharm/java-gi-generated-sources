package org.gtk.glib;

/**
 * A typedef for a reference-counted string. A pointer to a {@link RefString} can be
 * treated like a standard {@code char*} array by all code, but can additionally have
 * {@code g_ref_string_*()} methods called on it. {@code g_ref_string_*()} methods cannot be
 * called on {@code char*} arrays not allocated using g_ref_string_new().
 * <p>
 * If using {@link RefString} with autocleanups, g_autoptr() must be used rather than
 * g_autofree(), so that the reference counting metadata is also freed.
 */
public class RefString extends io.github.jwharm.javagi.Alias<Byte> {
    public RefString(byte value) {
        super(value);
    }
    
}
