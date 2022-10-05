package org.gtk.gobject;

import io.github.jwharm.javagi.*;

/**
 * A callback function used by the type system to do base initialization
 * of the class structures of derived types.
 * <p>
 * This function is called as part of the initialization process of all derived
 * classes and should reallocate or reset all dynamic class members copied over
 * from the parent class.
 * <p>
 * For example, class members (such as strings) that are not sufficiently
 * handled by a plain memory copy of the parent class into the derived class
 * have to be altered. See GClassInitFunc() for a discussion of the class
 * initialization process.
 */
@FunctionalInterface
public interface BaseInitFunc {
        void onBaseInitFunc(TypeClass gClass);
}