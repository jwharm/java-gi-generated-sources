package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * {@link IOExtensionPoint} is an opaque data structure and can only be accessed
 * using the following functions.
 */
public class IOExtensionPoint extends io.github.jwharm.javagi.ResourceBase {

    public IOExtensionPoint(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    static final MethodHandle g_io_extension_point_get_extension_by_name = Interop.downcallHandle(
        "g_io_extension_point_get_extension_by_name",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Finds a {@link IOExtension} for an extension point by name.
     */
    public IOExtension getExtensionByName(java.lang.String name) {
        try {
            var RESULT = (MemoryAddress) g_io_extension_point_get_extension_by_name.invokeExact(handle(), Interop.allocateNativeString(name).handle());
            return new IOExtension(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_io_extension_point_get_extensions = Interop.downcallHandle(
        "g_io_extension_point_get_extensions",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets a list of all extensions that implement this extension point.
     * The list is sorted by priority, beginning with the highest priority.
     */
    public org.gtk.glib.List getExtensions() {
        try {
            var RESULT = (MemoryAddress) g_io_extension_point_get_extensions.invokeExact(handle());
            return new org.gtk.glib.List(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_io_extension_point_get_required_type = Interop.downcallHandle(
        "g_io_extension_point_get_required_type",
        FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the required type for {@code extension_point}.
     */
    public org.gtk.gobject.Type getRequiredType() {
        try {
            var RESULT = (long) g_io_extension_point_get_required_type.invokeExact(handle());
            return new org.gtk.gobject.Type(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_io_extension_point_set_required_type = Interop.downcallHandle(
        "g_io_extension_point_set_required_type",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG)
    );
    
    /**
     * Sets the required type for {@code extension_point} to {@code type}.
     * All implementations must henceforth have this type.
     */
    public void setRequiredType(org.gtk.gobject.Type type) {
        try {
            g_io_extension_point_set_required_type.invokeExact(handle(), type.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_io_extension_point_implement = Interop.downcallHandle(
        "g_io_extension_point_implement",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Registers {@code type} as extension for the extension point with name
     * {@code extension_point_name}.
     * <p>
     * If {@code type} has already been registered as an extension for this
     * extension point, the existing {@link IOExtension} object is returned.
     */
    public static IOExtension implement(java.lang.String extensionPointName, org.gtk.gobject.Type type, java.lang.String extensionName, int priority) {
        try {
            var RESULT = (MemoryAddress) g_io_extension_point_implement.invokeExact(Interop.allocateNativeString(extensionPointName).handle(), type.getValue(), Interop.allocateNativeString(extensionName).handle(), priority);
            return new IOExtension(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_io_extension_point_lookup = Interop.downcallHandle(
        "g_io_extension_point_lookup",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Looks up an existing extension point.
     */
    public static IOExtensionPoint lookup(java.lang.String name) {
        try {
            var RESULT = (MemoryAddress) g_io_extension_point_lookup.invokeExact(Interop.allocateNativeString(name).handle());
            return new IOExtensionPoint(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_io_extension_point_register = Interop.downcallHandle(
        "g_io_extension_point_register",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Registers an extension point.
     */
    public static IOExtensionPoint register(java.lang.String name) {
        try {
            var RESULT = (MemoryAddress) g_io_extension_point_register.invokeExact(Interop.allocateNativeString(name).handle());
            return new IOExtensionPoint(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
}
