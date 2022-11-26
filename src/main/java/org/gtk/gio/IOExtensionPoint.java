package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@link IOExtensionPoint} is an opaque data structure and can only be accessed
 * using the following functions.
 */
public class IOExtensionPoint extends Struct {
    
    static {
        Gio.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GIOExtensionPoint";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link IOExtensionPoint}
     * @return A new, uninitialized @{link IOExtensionPoint}
     */
    public static IOExtensionPoint allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        IOExtensionPoint newInstance = new IOExtensionPoint(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a IOExtensionPoint proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public IOExtensionPoint(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Finds a {@link IOExtension} for an extension point by name.
     * @param name the name of the extension to get
     * @return the {@link IOExtension} for {@code extension_point} that has the
     *    given name, or {@code null} if there is no extension with that name
     */
    public @NotNull org.gtk.gio.IOExtension getExtensionByName(@NotNull java.lang.String name) {
        java.util.Objects.requireNonNull(name, "Parameter 'name' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_io_extension_point_get_extension_by_name.invokeExact(
                    handle(),
                    Interop.allocateNativeString(name));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gio.IOExtension(RESULT, Ownership.NONE);
    }
    
    /**
     * Gets a list of all extensions that implement this extension point.
     * The list is sorted by priority, beginning with the highest priority.
     * @return a {@link org.gtk.glib.List} of
     *     {@code GIOExtensions}. The list is owned by GIO and should not be
     *     modified.
     */
    public @NotNull org.gtk.glib.List getExtensions() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_io_extension_point_get_extensions.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.List(RESULT, Ownership.NONE);
    }
    
    /**
     * Gets the required type for {@code extension_point}.
     * @return the {@link org.gtk.gobject.Type} that all implementations must have,
     *   or {@code G_TYPE_INVALID} if the extension point has no required type
     */
    public @NotNull org.gtk.glib.Type getRequiredType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.g_io_extension_point_get_required_type.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * Sets the required type for {@code extension_point} to {@code type}.
     * All implementations must henceforth have this type.
     * @param type the {@link org.gtk.gobject.Type} to require
     */
    public void setRequiredType(@NotNull org.gtk.glib.Type type) {
        java.util.Objects.requireNonNull(type, "Parameter 'type' must not be null");
        try {
            DowncallHandles.g_io_extension_point_set_required_type.invokeExact(
                    handle(),
                    type.getValue().longValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Registers {@code type} as extension for the extension point with name
     * {@code extension_point_name}.
     * <p>
     * If {@code type} has already been registered as an extension for this
     * extension point, the existing {@link IOExtension} object is returned.
     * @param extensionPointName the name of the extension point
     * @param type the {@link org.gtk.gobject.Type} to register as extension
     * @param extensionName the name for the extension
     * @param priority the priority for the extension
     * @return a {@link IOExtension} object for {@link org.gtk.gobject.Type}
     */
    public static @NotNull org.gtk.gio.IOExtension implement(@NotNull java.lang.String extensionPointName, @NotNull org.gtk.glib.Type type, @NotNull java.lang.String extensionName, int priority) {
        java.util.Objects.requireNonNull(extensionPointName, "Parameter 'extensionPointName' must not be null");
        java.util.Objects.requireNonNull(type, "Parameter 'type' must not be null");
        java.util.Objects.requireNonNull(extensionName, "Parameter 'extensionName' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_io_extension_point_implement.invokeExact(
                    Interop.allocateNativeString(extensionPointName),
                    type.getValue().longValue(),
                    Interop.allocateNativeString(extensionName),
                    priority);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gio.IOExtension(RESULT, Ownership.NONE);
    }
    
    /**
     * Looks up an existing extension point.
     * @param name the name of the extension point
     * @return the {@link IOExtensionPoint}, or {@code null} if there
     *    is no registered extension point with the given name.
     */
    public static @NotNull org.gtk.gio.IOExtensionPoint lookup(@NotNull java.lang.String name) {
        java.util.Objects.requireNonNull(name, "Parameter 'name' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_io_extension_point_lookup.invokeExact(
                    Interop.allocateNativeString(name));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gio.IOExtensionPoint(RESULT, Ownership.NONE);
    }
    
    /**
     * Registers an extension point.
     * @param name The name of the extension point
     * @return the new {@link IOExtensionPoint}. This object is
     *    owned by GIO and should not be freed.
     */
    public static @NotNull org.gtk.gio.IOExtensionPoint register(@NotNull java.lang.String name) {
        java.util.Objects.requireNonNull(name, "Parameter 'name' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_io_extension_point_register.invokeExact(
                    Interop.allocateNativeString(name));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gio.IOExtensionPoint(RESULT, Ownership.NONE);
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle g_io_extension_point_get_extension_by_name = Interop.downcallHandle(
            "g_io_extension_point_get_extension_by_name",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_io_extension_point_get_extensions = Interop.downcallHandle(
            "g_io_extension_point_get_extensions",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_io_extension_point_get_required_type = Interop.downcallHandle(
            "g_io_extension_point_get_required_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_io_extension_point_set_required_type = Interop.downcallHandle(
            "g_io_extension_point_set_required_type",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG),
            false
        );
        
        private static final MethodHandle g_io_extension_point_implement = Interop.downcallHandle(
            "g_io_extension_point_implement",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle g_io_extension_point_lookup = Interop.downcallHandle(
            "g_io_extension_point_lookup",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_io_extension_point_register = Interop.downcallHandle(
            "g_io_extension_point_register",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private IOExtensionPoint struct;
        
         /**
         * A {@link IOExtensionPoint.Build} object constructs a {@link IOExtensionPoint} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = IOExtensionPoint.allocate();
        }
        
         /**
         * Finish building the {@link IOExtensionPoint} struct.
         * @return A new instance of {@code IOExtensionPoint} with the fields 
         *         that were set in the Build object.
         */
        public IOExtensionPoint construct() {
            return struct;
        }
    }
}
