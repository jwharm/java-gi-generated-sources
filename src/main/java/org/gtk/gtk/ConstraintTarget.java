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
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, ConstraintTargetImpl> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new ConstraintTargetImpl(input);
    
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
    
    /**
     * The ConstraintTargetImpl type represents a native instance of the ConstraintTarget interface.
     */
    class ConstraintTargetImpl extends org.gtk.gobject.GObject implements ConstraintTarget {
        
        static {
            Gtk.javagi$ensureInitialized();
        }
        
        /**
         * Creates a new instance of ConstraintTarget for the provided memory address.
         * @param address the memory address of the instance
         */
        public ConstraintTargetImpl(Addressable address) {
            super(address);
        }
    }
    
    /**
     * Check whether the type is available on the runtime platform.
     * @return {@code true} when the type is available on the runtime platform
     */
    public static boolean isAvailable() {
        return DowncallHandles.gtk_constraint_target_get_type != null;
    }
}
