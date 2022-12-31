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
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, ConstraintTargetImpl> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new ConstraintTargetImpl(input, ownership);
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
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
    
    class ConstraintTargetImpl extends org.gtk.gobject.GObject implements ConstraintTarget {
        
        static {
            Gtk.javagi$ensureInitialized();
        }
        
        public ConstraintTargetImpl(Addressable address, Ownership ownership) {
            super(address, ownership);
        }
    }
}
