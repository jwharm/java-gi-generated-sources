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
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        IOExtensionPoint newInstance = new IOExtensionPoint(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a IOExtensionPoint proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected IOExtensionPoint(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, IOExtensionPoint> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new IOExtensionPoint(input);
    
    /**
     * Finds a {@link IOExtension} for an extension point by name.
     * @param name the name of the extension to get
     * @return the {@link IOExtension} for {@code extension_point} that has the
     *    given name, or {@code null} if there is no extension with that name
     */
    public org.gtk.gio.IOExtension getExtensionByName(java.lang.String name) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.g_io_extension_point_get_extension_by_name.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(name, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return org.gtk.gio.IOExtension.fromAddress.marshal(RESULT, null);
        }
    }
    
    /**
     * Gets a list of all extensions that implement this extension point.
     * The list is sorted by priority, beginning with the highest priority.
     * @return a {@link org.gtk.glib.List} of
     *     {@code GIOExtensions}. The list is owned by GIO and should not be
     *     modified.
     */
    public org.gtk.glib.List getExtensions() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_io_extension_point_get_extensions.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.glib.List.fromAddress.marshal(RESULT, null);
    }
    
    /**
     * Gets the required type for {@code extension_point}.
     * @return the {@link org.gtk.glib.Type} that all implementations must have,
     *   or {@code G_TYPE_INVALID} if the extension point has no required type
     */
    public org.gtk.glib.Type getRequiredType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.g_io_extension_point_get_required_type.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * Sets the required type for {@code extension_point} to {@code type}.
     * All implementations must henceforth have this type.
     * @param type the {@link org.gtk.glib.Type} to require
     */
    public void setRequiredType(org.gtk.glib.Type type) {
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
     * @param type the {@link org.gtk.glib.Type} to register as extension
     * @param extensionName the name for the extension
     * @param priority the priority for the extension
     * @return a {@link IOExtension} object for {@link org.gtk.glib.Type}
     */
    public static org.gtk.gio.IOExtension implement(java.lang.String extensionPointName, org.gtk.glib.Type type, java.lang.String extensionName, int priority) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.g_io_extension_point_implement.invokeExact(
                        Marshal.stringToAddress.marshal(extensionPointName, SCOPE),
                        type.getValue().longValue(),
                        Marshal.stringToAddress.marshal(extensionName, SCOPE),
                        priority);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return org.gtk.gio.IOExtension.fromAddress.marshal(RESULT, null);
        }
    }
    
    /**
     * Looks up an existing extension point.
     * @param name the name of the extension point
     * @return the {@link IOExtensionPoint}, or {@code null} if there
     *    is no registered extension point with the given name.
     */
    public static org.gtk.gio.IOExtensionPoint lookup(java.lang.String name) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.g_io_extension_point_lookup.invokeExact(Marshal.stringToAddress.marshal(name, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return org.gtk.gio.IOExtensionPoint.fromAddress.marshal(RESULT, null);
        }
    }
    
    /**
     * Registers an extension point.
     * @param name The name of the extension point
     * @return the new {@link IOExtensionPoint}. This object is
     *    owned by GIO and should not be freed.
     */
    public static org.gtk.gio.IOExtensionPoint register(java.lang.String name) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.g_io_extension_point_register.invokeExact(Marshal.stringToAddress.marshal(name, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return org.gtk.gio.IOExtensionPoint.fromAddress.marshal(RESULT, null);
        }
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
}
