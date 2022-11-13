package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The {@code GtkConstraintTarget} interface is implemented by objects that
 * can be used as source or target in {@code GtkConstraint}s.
 * <p>
 * Besides {@code GtkWidget}, it is also implemented by {@code GtkConstraintGuide}.
 */
public interface ConstraintTarget extends io.github.jwharm.javagi.Proxy {
    
    /**
     * Cast object to ConstraintTarget if its GType is a (or inherits from) "GtkConstraintTarget".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code ConstraintTarget} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GtkConstraintTarget", a ClassCastException will be thrown.
     */
    public static ConstraintTarget castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), org.gtk.gobject.GObject.typeFromName("GtkConstraintTarget"))) {
            return new ConstraintTargetImpl(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GtkConstraintTarget");
        }
    }
    
    class ConstraintTargetImpl extends org.gtk.gobject.Object implements ConstraintTarget {
        
        static {
            Gtk.javagi$ensureInitialized();
        }
        
        public ConstraintTargetImpl(Addressable address, Ownership ownership) {
            super(address, ownership);
        }
    }
}
