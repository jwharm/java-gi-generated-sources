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
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(new org.gtk.gobject.TypeInstance(gobject.handle(), Ownership.NONE), ConstraintTarget.getType())) {
            return new ConstraintTargetImpl(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GtkConstraintTarget");
        }
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static @NotNull org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gtk_constraint_target_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    @ApiStatus.Internal
    static class DowncallHandles {
        
        @ApiStatus.Internal
        static final MethodHandle gtk_constraint_target_get_type = Interop.downcallHandle(
            "gtk_constraint_target_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
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
