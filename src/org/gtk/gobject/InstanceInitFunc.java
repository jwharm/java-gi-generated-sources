package org.gtk.gobject;

/**
 * A callback function used by the type system to initialize a new
 * instance of a type.
 * <p>
 * This function initializes all instance members and allocates any resources
 * required by it.
 * <p>
 * Initialization of a derived instance involves calling all its parent
 * types instance initializers, so the class member of the instance
 * is altered during its initialization to always point to the class that
 * belongs to the type the current initializer was introduced for.
 * <p>
 * The extended members of {@code instance} are guaranteed to have been filled with
 * zeros before this function is called.
 */
@FunctionalInterface
public interface InstanceInitFunc {
        void onInstanceInitFunc(TypeInstance instance, TypeClass gClass);
}
