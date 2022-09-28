package org.gtk.gobject;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * A structure containing a weak reference to a {@link Object}.
 * <p>
 * A {@code GWeakRef} can either be empty (i.e. point to {@code null}), or point to an
 * object for as long as at least one "strong" reference to that object
 * exists. Before the object's {@link ObjectClass}.dispose method is called,
 * every {@link WeakRef} associated with becomes empty (i.e. points to {@code null}).
 * <p>
 * Like {@link Value}, {@link WeakRef} can be statically allocated, stack- or
 * heap-allocated, or embedded in larger structures.
 * <p>
 * Unlike g_object_weak_ref() and g_object_add_weak_pointer(), this weak
 * reference is thread-safe: converting a weak pointer to a reference is
 * atomic with respect to invalidation of weak pointers to destroyed
 * objects.
 * <p>
 * If the object's {@link ObjectClass}.dispose method results in additional
 * references to the object being held (‘re-referencing’), any {@code GWeakRefs} taken
 * before it was disposed will continue to point to {@code null}.  Any {@code GWeakRefs} taken
 * during disposal and after re-referencing, or after disposal has returned due
 * to the re-referencing, will continue to point to the object until its refcount
 * goes back to zero, at which point they too will be invalidated.
 * <p>
 * It is invalid to take a {@link WeakRef} on an object during {@link ObjectClass}.dispose
 * without first having or creating a strong reference to the object.
 */
public class WeakRef extends io.github.jwharm.javagi.ResourceBase {

    public WeakRef(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    public WeakRef() {
        super(References.get(io.github.jwharm.javagi.interop.jextract.GWeakRef.allocate(Interop.getAllocator()).address()));
    }
    
    /**
     * Frees resources associated with a non-statically-allocated {@link WeakRef}.
     * After this call, the {@link WeakRef} is left in an undefined state.
     * <p>
     * You should only call this on a {@link WeakRef} that previously had
     * g_weak_ref_init() called on it.
     */
    public void clear() {
        gtk_h.g_weak_ref_clear(handle());
    }
    
    /**
     * If {@code weak_ref} is not empty, atomically acquire a strong
     * reference to the object it points to, and return that reference.
     * <p>
     * This function is needed because of the potential race between taking
     * the pointer value and g_object_ref() on it, if the object was losing
     * its last reference at the same time in a different thread.
     * <p>
     * The caller should release the resulting reference in the usual way,
     * by using g_object_unref().
     */
    public Object get() {
        var RESULT = gtk_h.g_weak_ref_get(handle());
        return new Object(References.get(RESULT, true));
    }
    
    /**
     * Initialise a non-statically-allocated {@link WeakRef}.
     * <p>
     * This function also calls g_weak_ref_set() with {@code object} on the
     * freshly-initialised weak reference.
     * <p>
     * This function should always be matched with a call to
     * g_weak_ref_clear().  It is not necessary to use this function for a
     * {@link WeakRef} in static storage because it will already be
     * properly initialised.  Just use g_weak_ref_set() directly.
     */
    public void init(Object object) {
        gtk_h.g_weak_ref_init(handle(), object.handle());
    }
    
    /**
     * Change the object to which {@code weak_ref} points, or set it to
     * {@code null}.
     * <p>
     * You must own a strong reference on {@code object} while calling this
     * function.
     */
    public void set(Object object) {
        gtk_h.g_weak_ref_set(handle(), object.handle());
    }
    
}
