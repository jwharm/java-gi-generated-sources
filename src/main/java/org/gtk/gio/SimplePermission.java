package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@link SimplePermission} is a trivial implementation of {@link Permission} that
 * represents a permission that is either always or never allowed.  The
 * value is given at construction and doesn't change.
 * <p>
 * Calling request or release will result in errors.
 */
public class SimplePermission extends org.gtk.gio.Permission {
    
    static {
        Gio.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GSimplePermission";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a SimplePermission proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected SimplePermission(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, SimplePermission> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new SimplePermission(input);
    
    private static MemoryAddress constructNew(boolean allowed) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_simple_permission_new.invokeExact(Marshal.booleanToInteger.marshal(allowed, null).intValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new {@link Permission} instance that represents an action that is
     * either always or never allowed.
     * @param allowed {@code true} if the action is allowed
     */
    public SimplePermission(boolean allowed) {
        super(constructNew(allowed));
        this.takeOwnership();
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.g_simple_permission_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * A {@link SimplePermission.Builder} object constructs a {@link SimplePermission} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link SimplePermission.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a GObject with properties.
     */
    public static class Builder extends org.gtk.gio.Permission.Builder {
        
        /**
         * Default constructor for a {@code Builder} object.
         */
        protected Builder() {
        }
        
        /**
         * Finish building the {@link SimplePermission} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link SimplePermission}.
         * @return A new instance of {@code SimplePermission} with the properties 
         *         that were set in the Builder object.
         */
        public SimplePermission build() {
            return (SimplePermission) org.gtk.gobject.GObject.newWithProperties(
                SimplePermission.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle g_simple_permission_new = Interop.downcallHandle(
                "g_simple_permission_new",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle g_simple_permission_get_type = Interop.downcallHandle(
                "g_simple_permission_get_type",
                FunctionDescriptor.of(Interop.valueLayout.C_LONG),
                false
        );
    }
    
    /**
     * Check whether the type is available on the runtime platform.
     * @return {@code true} when the type is available on the runtime platform
     */
    public static boolean isAvailable() {
        return DowncallHandles.g_simple_permission_get_type != null;
    }
}
