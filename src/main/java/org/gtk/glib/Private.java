package org.gtk.glib;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * The {@link Private} struct is an opaque data structure to represent a
 * thread-local data key. It is approximately equivalent to the
 * pthread_setspecific()/pthread_getspecific() APIs on POSIX and to
 * TlsSetValue()/TlsGetValue() on Windows.
 * <p>
 * If you don't already know why you might want this functionality,
 * then you probably don't need it.
 * <p>
 * {@link Private} is a very limited resource (as far as 128 per program,
 * shared between all libraries). It is also not possible to destroy a
 * {@link Private} after it has been used. As such, it is only ever acceptable
 * to use {@link Private} in static scope, and even then sparingly so.
 * <p>
 * See G_PRIVATE_INIT() for a couple of examples.
 * <p>
 * The {@link Private} structure should be considered opaque.  It should only
 * be accessed via the g_private_ functions.
 */
public class Private extends io.github.jwharm.javagi.ResourceBase {

    public Private(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    public Private() {
        super(Refcounted.get(io.github.jwharm.javagi.interop.jextract.GPrivate.allocate(Interop.getAllocator()).address()));
    }
    
    /**
     * Returns the current value of the thread local variable {@code key}.
     * <p>
     * If the value has not yet been set in this thread, {@code null} is returned.
     * Values are never copied between threads (when a new thread is
     * created, for example).
     */
    public java.lang.foreign.MemoryAddress get() {
        var RESULT = gtk_h.g_private_get(handle());
        return RESULT;
    }
    
    /**
     * Sets the thread local variable {@code key} to have the value {@code value} in the
     * current thread.
     * <p>
     * This function differs from g_private_set() in the following way: if
     * the previous value was non-{@code null} then the {@link DestroyNotify} handler for
     * {@code key} is run on it.
     */
    public void replace(java.lang.foreign.MemoryAddress value) {
        gtk_h.g_private_replace(handle(), value);
    }
    
    /**
     * Sets the thread local variable {@code key} to have the value {@code value} in the
     * current thread.
     * <p>
     * This function differs from g_private_replace() in the following way:
     * the {@link DestroyNotify} for {@code key} is not called on the old value.
     */
    public void set(java.lang.foreign.MemoryAddress value) {
        gtk_h.g_private_set(handle(), value);
    }
    
}
