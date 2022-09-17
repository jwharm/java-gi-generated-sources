package org.gtk.gobject;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * A structure containing a weak reference to a #GObject.
 * <p>
 * A <code>GWeakRef</code> can either be empty (i.e. point to <code>NULL),</code> or point to an
 * object for as long as at least one &#34;strong&#34; reference to that object
 * exists. Before the object&#39;s #GObjectClass.dispose method is called,
 * every #GWeakRef associated with becomes empty (i.e. points to <code>NULL).
 * 
 * Like</code> #GValue, #GWeakRef can be statically allocated, stack- or
 * heap-allocated, or embedded in larger structures.
 * 
 * Unlike g_object_weak_ref() and g_object_add_weak_pointer(), this weak
 * reference is thread-safe: converting a weak pointer to a reference is
 * atomic with respect to invalidation of weak pointers to destroyed
 * objects.
 * 
 * If the object&#39;s #GObjectClass.dispose method results in additional
 * references to the object being held (&#8216;re-referencing&#8217;), any #GWeakRefs taken
 * before it was disposed will continue to point to <code>NULL.</code>  Any #GWeakRefs taken
 * during disposal and after re-referencing, or after disposal has returned due
 * to the re-referencing, will continue to point to the object until its refcount
 * goes back to zero, at which point they too will be invalidated.
 * 
 * It is invalid to take a #GWeakRef on an object during #GObjectClass.dispose
 * without first having or creating a strong reference to the object.
 */
public class WeakRef extends io.github.jwharm.javagi.ResourceBase {

    public WeakRef(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /**
     * Frees resources associated with a non-statically-allocated #GWeakRef.
     * After this call, the #GWeakRef is left in an undefined state.
     * 
     * You should only call this on a #GWeakRef that previously had
     * g_weak_ref_init() called on it.
     */
    public void clear() {
        gtk_h.g_weak_ref_clear(handle());
    }
    
    /**
     * If @weak_ref is not empty, atomically acquire a strong
     * reference to the object it points to, and return that reference.
     * 
     * This function is needed because of the potential race between taking
     * the pointer value and g_object_ref() on it, if the object was losing
     * its last reference at the same time in a different thread.
     * 
     * The caller should release the resulting reference in the usual way,
     * by using g_object_unref().
     */
    public Object get() {
        var RESULT = gtk_h.g_weak_ref_get(handle());
        return new Object(References.get(RESULT, true));
    }
    
    /**
     * Initialise a non-statically-allocated #GWeakRef.
     * 
     * This function also calls g_weak_ref_set() with @object on the
     * freshly-initialised weak reference.
     * 
     * This function should always be matched with a call to
     * g_weak_ref_clear().  It is not necessary to use this function for a
     * #GWeakRef in static storage because it will already be
     * properly initialised.  Just use g_weak_ref_set() directly.
     */
    public void init(Object object) {
        gtk_h.g_weak_ref_init(handle(), object.handle());
    }
    
    /**
     * Change the object to which @weak_ref points, or set it to
     * <code>NULL.
     * 
     * You</code> must own a strong reference on @object while calling this
     * function.
     */
    public void set(Object object) {
        gtk_h.g_weak_ref_set(handle(), object.handle());
    }
    
}
