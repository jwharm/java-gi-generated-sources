package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@link IOExtensionPoint} is an opaque data structure and can only be accessed
 * using the following functions.
 */
public class IOExtensionPoint extends io.github.jwharm.javagi.ResourceBase {

    public IOExtensionPoint(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    private static final MethodHandle g_io_extension_point_get_extension_by_name = Interop.downcallHandle(
        "g_io_extension_point_get_extension_by_name",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Finds a {@link IOExtension} for an extension point by name.
     */
    public @NotNull IOExtension getExtensionByName(@NotNull java.lang.String name) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_io_extension_point_get_extension_by_name.invokeExact(handle(), Interop.allocateNativeString(name));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new IOExtension(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle g_io_extension_point_get_extensions = Interop.downcallHandle(
        "g_io_extension_point_get_extensions",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets a list of all extensions that implement this extension point.
     * The list is sorted by priority, beginning with the highest priority.
     */
    public @NotNull org.gtk.glib.List getExtensions() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_io_extension_point_get_extensions.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.List(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle g_io_extension_point_get_required_type = Interop.downcallHandle(
        "g_io_extension_point_get_required_type",
        FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the required type for {@code extension_point}.
     */
    public @NotNull org.gtk.gobject.Type getRequiredType() {
        long RESULT;
        try {
            RESULT = (long) g_io_extension_point_get_required_type.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gobject.Type(RESULT);
    }
    
    private static final MethodHandle g_io_extension_point_set_required_type = Interop.downcallHandle(
        "g_io_extension_point_set_required_type",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG)
    );
    
    /**
     * Sets the required type for {@code extension_point} to {@code type}.
     * All implementations must henceforth have this type.
     */
    public @NotNull void setRequiredType(@NotNull org.gtk.gobject.Type type) {
        try {
            g_io_extension_point_set_required_type.invokeExact(handle(), type.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle g_io_extension_point_implement = Interop.downcallHandle(
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
    public static @NotNull IOExtension implement(@NotNull java.lang.String extensionPointName, @NotNull org.gtk.gobject.Type type, @NotNull java.lang.String extensionName, @NotNull int priority) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_io_extension_point_implement.invokeExact(Interop.allocateNativeString(extensionPointName), type.getValue(), Interop.allocateNativeString(extensionName), priority);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new IOExtension(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle g_io_extension_point_lookup = Interop.downcallHandle(
        "g_io_extension_point_lookup",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Looks up an existing extension point.
     */
    public static @NotNull IOExtensionPoint lookup(@NotNull java.lang.String name) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_io_extension_point_lookup.invokeExact(Interop.allocateNativeString(name));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new IOExtensionPoint(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle g_io_extension_point_register = Interop.downcallHandle(
        "g_io_extension_point_register",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Registers an extension point.
     */
    public static @NotNull IOExtensionPoint register(@NotNull java.lang.String name) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_io_extension_point_register.invokeExact(Interop.allocateNativeString(name));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new IOExtensionPoint(Refcounted.get(RESULT, false));
    }
    
}
