package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Entry point for using GIO functionality.
 */
public class Vfs extends org.gtk.gobject.GObject {
    
    static {
        Gio.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GVfs";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gtk.gobject.GObject.getMemoryLayout().withName("parent_instance")
        ).withName(C_TYPE_NAME);
    }
    
    /**
     * Create a Vfs proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected Vfs(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, Vfs> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new Vfs(input, ownership);
    
    /**
     * Gets a {@link File} for {@code path}.
     * @param path a string containing a VFS path.
     * @return a {@link File}.
     *     Free the returned object with g_object_unref().
     */
    public org.gtk.gio.File getFileForPath(java.lang.String path) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_vfs_get_file_for_path.invokeExact(
                    handle(),
                    Marshal.stringToAddress.marshal(path, null));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gtk.gio.File) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gtk.gio.File.fromAddress).marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * Gets a {@link File} for {@code uri}.
     * <p>
     * This operation never fails, but the returned object
     * might not support any I/O operation if the URI
     * is malformed or if the URI scheme is not supported.
     * @param uri a string containing a URI
     * @return a {@link File}.
     *     Free the returned object with g_object_unref().
     */
    public org.gtk.gio.File getFileForUri(java.lang.String uri) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_vfs_get_file_for_uri.invokeExact(
                    handle(),
                    Marshal.stringToAddress.marshal(uri, null));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gtk.gio.File) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gtk.gio.File.fromAddress).marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * Gets a list of URI schemes supported by {@code vfs}.
     * @return a {@code null}-terminated array of strings.
     *     The returned array belongs to GIO and must
     *     not be freed or modified.
     */
    public PointerString getSupportedUriSchemes() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_vfs_get_supported_uri_schemes.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new PointerString(RESULT);
    }
    
    /**
     * Checks if the VFS is active.
     * @return {@code true} if construction of the {@code vfs} was successful
     *     and it is now active.
     */
    public boolean isActive() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_vfs_is_active.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * This operation never fails, but the returned object might
     * not support any I/O operations if the {@code parse_name} cannot
     * be parsed by the {@link Vfs} module.
     * @param parseName a string to be parsed by the VFS module.
     * @return a {@link File} for the given {@code parse_name}.
     *     Free the returned object with g_object_unref().
     */
    public org.gtk.gio.File parseName(java.lang.String parseName) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_vfs_parse_name.invokeExact(
                    handle(),
                    Marshal.stringToAddress.marshal(parseName, null));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gtk.gio.File) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gtk.gio.File.fromAddress).marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * Registers {@code uri_func} and {@code parse_name_func} as the {@link File} URI and parse name
     * lookup functions for URIs with a scheme matching {@code scheme}.
     * Note that {@code scheme} is registered only within the running application, as
     * opposed to desktop-wide as it happens with GVfs backends.
     * <p>
     * When a {@link File} is requested with an URI containing {@code scheme} (e.g. through
     * g_file_new_for_uri()), {@code uri_func} will be called to allow a custom
     * constructor. The implementation of {@code uri_func} should not be blocking, and
     * must not call g_vfs_register_uri_scheme() or g_vfs_unregister_uri_scheme().
     * <p>
     * When g_file_parse_name() is called with a parse name obtained from such file,
     * {@code parse_name_func} will be called to allow the {@link File} to be created again. In
     * that case, it's responsibility of {@code parse_name_func} to make sure the parse
     * name matches what the custom {@link File} implementation returned when
     * g_file_get_parse_name() was previously called. The implementation of
     * {@code parse_name_func} should not be blocking, and must not call
     * g_vfs_register_uri_scheme() or g_vfs_unregister_uri_scheme().
     * <p>
     * It's an error to call this function twice with the same scheme. To unregister
     * a custom URI scheme, use g_vfs_unregister_uri_scheme().
     * @param scheme an URI scheme, e.g. "http"
     * @param uriFunc a {@link VfsFileLookupFunc}
     * @param uriDestroy function to be called when unregistering the
     *     URI scheme, or when {@code vfs} is disposed, to free the resources used
     *     by the URI lookup function
     * @param parseNameFunc a {@link VfsFileLookupFunc}
     * @param parseNameDestroy function to be called when unregistering the
     *     URI scheme, or when {@code vfs} is disposed, to free the resources used
     *     by the parse name lookup function
     * @return {@code true} if {@code scheme} was successfully registered, or {@code false} if a handler
     *     for {@code scheme} already exists.
     */
    public boolean registerUriScheme(java.lang.String scheme, @Nullable org.gtk.gio.VfsFileLookupFunc uriFunc, @Nullable org.gtk.glib.DestroyNotify uriDestroy, @Nullable org.gtk.gio.VfsFileLookupFunc parseNameFunc, @Nullable org.gtk.glib.DestroyNotify parseNameDestroy) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_vfs_register_uri_scheme.invokeExact(
                    handle(),
                    Marshal.stringToAddress.marshal(scheme, null),
                    (Addressable) (uriFunc == null ? MemoryAddress.NULL : (Addressable) uriFunc.toCallback()),
                    (Addressable) MemoryAddress.NULL,
                    (Addressable) (uriDestroy == null ? MemoryAddress.NULL : (Addressable) uriDestroy.toCallback()),
                    (Addressable) (parseNameFunc == null ? MemoryAddress.NULL : (Addressable) parseNameFunc.toCallback()),
                    (Addressable) MemoryAddress.NULL,
                    (Addressable) (parseNameDestroy == null ? MemoryAddress.NULL : (Addressable) parseNameDestroy.toCallback()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Unregisters the URI handler for {@code scheme} previously registered with
     * g_vfs_register_uri_scheme().
     * @param scheme an URI scheme, e.g. "http"
     * @return {@code true} if {@code scheme} was successfully unregistered, or {@code false} if a
     *     handler for {@code scheme} does not exist.
     */
    public boolean unregisterUriScheme(java.lang.String scheme) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_vfs_unregister_uri_scheme.invokeExact(
                    handle(),
                    Marshal.stringToAddress.marshal(scheme, null));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.g_vfs_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * Gets the default {@link Vfs} for the system.
     * @return a {@link Vfs}, which will be the local
     *     file system {@link Vfs} if no other implementation is available.
     */
    public static org.gtk.gio.Vfs getDefault() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_vfs_get_default.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gtk.gio.Vfs) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gtk.gio.Vfs.fromAddress).marshal(RESULT, Ownership.NONE);
    }
    
    /**
     * Gets the local {@link Vfs} for the system.
     * @return a {@link Vfs}.
     */
    public static org.gtk.gio.Vfs getLocal() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_vfs_get_local.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gtk.gio.Vfs) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gtk.gio.Vfs.fromAddress).marshal(RESULT, Ownership.NONE);
    }
    
    /**
     * A {@link Vfs.Builder} object constructs a {@link Vfs} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link Vfs.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a GObject with properties.
     */
    public static class Builder extends org.gtk.gobject.GObject.Builder {
        
        protected Builder() {
        }
        
        /**
         * Finish building the {@link Vfs} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link Vfs}.
         * @return A new instance of {@code Vfs} with the properties 
         *         that were set in the Builder object.
         */
        public Vfs build() {
            return (Vfs) org.gtk.gobject.GObject.newWithProperties(
                Vfs.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle g_vfs_get_file_for_path = Interop.downcallHandle(
            "g_vfs_get_file_for_path",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_vfs_get_file_for_uri = Interop.downcallHandle(
            "g_vfs_get_file_for_uri",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_vfs_get_supported_uri_schemes = Interop.downcallHandle(
            "g_vfs_get_supported_uri_schemes",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_vfs_is_active = Interop.downcallHandle(
            "g_vfs_is_active",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_vfs_parse_name = Interop.downcallHandle(
            "g_vfs_parse_name",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_vfs_register_uri_scheme = Interop.downcallHandle(
            "g_vfs_register_uri_scheme",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_vfs_unregister_uri_scheme = Interop.downcallHandle(
            "g_vfs_unregister_uri_scheme",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_vfs_get_type = Interop.downcallHandle(
            "g_vfs_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
        
        private static final MethodHandle g_vfs_get_default = Interop.downcallHandle(
            "g_vfs_get_default",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_vfs_get_local = Interop.downcallHandle(
            "g_vfs_get_local",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
            false
        );
    }
}
