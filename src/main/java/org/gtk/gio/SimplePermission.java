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
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public SimplePermission(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Cast object to SimplePermission if its GType is a (or inherits from) "GSimplePermission".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code SimplePermission} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GSimplePermission", a ClassCastException will be thrown.
     */
    public static SimplePermission castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), SimplePermission.getType())) {
            return new SimplePermission(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GSimplePermission");
        }
    }
    
    private static Addressable constructNew(boolean allowed) {
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_simple_permission_new.invokeExact(
                    allowed ? 1 : 0);
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
        super(constructNew(allowed), Ownership.FULL);
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static @NotNull org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.g_simple_permission_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * GObjects with properties.
     */
    public static class Build extends org.gtk.gio.Permission.Build {
        
         /**
         * A {@link SimplePermission.Build} object constructs a {@link SimplePermission} 
         * using the <em>builder pattern</em> to set property values. 
         * Use the various {@code set...()} methods to set properties, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
        }
        
         /**
         * Finish building the {@link SimplePermission} object.
         * Internally, a call to {@link org.gtk.gobject.GObject#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link SimplePermission} using {@link SimplePermission#castFrom}.
         * @return A new instance of {@code SimplePermission} with the properties 
         *         that were set in the Build object.
         */
        public SimplePermission construct() {
            return SimplePermission.castFrom(
                org.gtk.gobject.Object.newWithProperties(
                    SimplePermission.getType(),
                    names.size(),
                    names.toArray(new String[0]),
                    values.toArray(new org.gtk.gobject.Value[0])
                )
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
}
