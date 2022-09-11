package org.gtk.gobject;

/**
 * A #GWeakNotify function can be added to an object as a callback that gets
 * triggered when the object is finalized.
 * 
 * Since the object is already being disposed when the #GWeakNotify is called,
 * there's not much you could do with the object, apart from e.g. using its
 * address as hash-index or the like.
 * 
 * In particular, this means it’s invalid to call g_object_ref(),
 * g_weak_ref_init(), g_weak_ref_set(), g_object_add_toggle_ref(),
 * g_object_weak_ref(), g_object_add_weak_pointer() or any function which calls
 * them on the object from this callback.
 */
@FunctionalInterface
public interface WeakNotify {
        void onWeakNotify(Object whereTheObjectWas);
}
