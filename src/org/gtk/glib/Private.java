package org.gtk.glib;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * The #GPrivate struct is an opaque data structure to represent a
 * thread-local data key. It is approximately equivalent to the
 * pthread_setspecific()/pthread_getspecific() APIs on POSIX and to
 * TlsSetValue()/TlsGetValue() on Windows.
 * 
 * If you don't already know why you might want this functionality,
 * then you probably don't need it.
 * 
 * #GPrivate is a very limited resource (as far as 128 per program,
 * shared between all libraries). It is also not possible to destroy a
 * #GPrivate after it has been used. As such, it is only ever acceptable
 * to use #GPrivate in static scope, and even then sparingly so.
 * 
 * See G_PRIVATE_INIT() for a couple of examples.
 * 
 * The #GPrivate structure should be considered opaque.  It should only
 * be accessed via the g_private_ functions.
 */
public class Private extends io.github.jwharm.javagi.ResourceBase {

    public Private(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /**
     * Returns the current value of the thread local variable @key.
     * 
     * If the value has not yet been set in this thread, %NULL is returned.
     * Values are never copied between threads (when a new thread is
     * created, for example).
     */
    public jdk.incubator.foreign.MemoryAddress get() {
        var RESULT = gtk_h.g_private_get(handle());
        return RESULT;
    }
    
    /**
     * Sets the thread local variable @key to have the value @value in the
     * current thread.
     * 
     * This function differs from g_private_set() in the following way: if
     * the previous value was non-%NULL then the #GDestroyNotify handler for
     * @key is run on it.
     */
    public void replace(jdk.incubator.foreign.MemoryAddress value) {
        gtk_h.g_private_replace(handle(), value);
    }
    
    /**
     * Sets the thread local variable @key to have the value @value in the
     * current thread.
     * 
     * This function differs from g_private_replace() in the following way:
     * the #GDestroyNotify for @key is not called on the old value.
     */
    public void set(jdk.incubator.foreign.MemoryAddress value) {
        gtk_h.g_private_set(handle(), value);
    }
    
}
