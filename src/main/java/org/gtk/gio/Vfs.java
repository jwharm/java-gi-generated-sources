package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Entry point for using GIO functionality.
 */
public class Vfs extends org.gtk.gobject.Object {
    
    static {
        Gio.javagi$ensureInitialized();
    }
    
    private static GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.gobject.Object.getMemoryLayout().withName("parent_instance")
    ).withName("GVfs");
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    public Vfs(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to Vfs */
    public static Vfs castFrom(org.gtk.gobject.Object gobject) {
        return new Vfs(gobject.refcounted());
    }
    
    /**
     * Gets a {@link File} for {@code path}.
     * @param path a string containing a VFS path.
     * @return a {@link File}.
     *     Free the returned object with g_object_unref().
     */
    public @NotNull org.gtk.gio.File getFileForPath(@NotNull java.lang.String path) {
        java.util.Objects.requireNonNull(path, "Parameter 'path' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_vfs_get_file_for_path.invokeExact(handle(), Interop.allocateNativeString(path));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gio.File.FileImpl(Refcounted.get(RESULT, true));
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
    public @NotNull org.gtk.gio.File getFileForUri(@NotNull java.lang.String uri) {
        java.util.Objects.requireNonNull(uri, "Parameter 'uri' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_vfs_get_file_for_uri.invokeExact(handle(), Interop.allocateNativeString(uri));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gio.File.FileImpl(Refcounted.get(RESULT, true));
    }
    
    /**
     * Gets a list of URI schemes supported by {@code vfs}.
     * @return a {@code null}-terminated array of strings.
     *     The returned array belongs to GIO and must
     *     not be freed or modified.
     */
    public @NotNull PointerString getSupportedUriSchemes() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_vfs_get_supported_uri_schemes.invokeExact(handle());
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
            RESULT = (int) DowncallHandles.g_vfs_is_active.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * This operation never fails, but the returned object might
     * not support any I/O operations if the {@code parse_name} cannot
     * be parsed by the {@link Vfs} module.
     * @param parseName a string to be parsed by the VFS module.
     * @return a {@link File} for the given {@code parse_name}.
     *     Free the returned object with g_object_unref().
     */
    public @NotNull org.gtk.gio.File parseName(@NotNull java.lang.String parseName) {
        java.util.Objects.requireNonNull(parseName, "Parameter 'parseName' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_vfs_parse_name.invokeExact(handle(), Interop.allocateNativeString(parseName));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gio.File.FileImpl(Refcounted.get(RESULT, true));
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
     * @param parseNameFunc a {@link VfsFileLookupFunc}
     * @return {@code true} if {@code scheme} was successfully registered, or {@code false} if a handler
     *     for {@code scheme} already exists.
     */
    public boolean registerUriScheme(@NotNull java.lang.String scheme, @Nullable org.gtk.gio.VfsFileLookupFunc uriFunc, @Nullable org.gtk.gio.VfsFileLookupFunc parseNameFunc) {
        java.util.Objects.requireNonNull(scheme, "Parameter 'scheme' must not be null");
        java.util.Objects.requireNonNullElse(uriFunc, MemoryAddress.NULL);
        java.util.Objects.requireNonNullElse(parseNameFunc, MemoryAddress.NULL);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_vfs_register_uri_scheme.invokeExact(handle(), Interop.allocateNativeString(scheme), 
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Gio.Callbacks.class, "cbVfsFileLookupFunc",
                            MethodType.methodType(MemoryAddress.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                   (Addressable) (uriFunc == null ? MemoryAddress.NULL : Interop.registerCallback(uriFunc)), 
                    Interop.cbDestroyNotifySymbol(), 
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Gio.Callbacks.class, "cbVfsFileLookupFunc",
                            MethodType.methodType(MemoryAddress.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                   (Addressable) (uriFunc == null ? MemoryAddress.NULL : Interop.registerCallback(uriFunc)), 
                    Interop.cbDestroyNotifySymbol());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Unregisters the URI handler for {@code scheme} previously registered with
     * g_vfs_register_uri_scheme().
     * @param scheme an URI scheme, e.g. "http"
     * @return {@code true} if {@code scheme} was successfully unregistered, or {@code false} if a
     *     handler for {@code scheme} does not exist.
     */
    public boolean unregisterUriScheme(@NotNull java.lang.String scheme) {
        java.util.Objects.requireNonNull(scheme, "Parameter 'scheme' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_vfs_unregister_uri_scheme.invokeExact(handle(), Interop.allocateNativeString(scheme));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Gets the default {@link Vfs} for the system.
     * @return a {@link Vfs}, which will be the local
     *     file system {@link Vfs} if no other implementation is available.
     */
    public static @NotNull org.gtk.gio.Vfs getDefault() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_vfs_get_default.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gio.Vfs(Refcounted.get(RESULT, false));
    }
    
    /**
     * Gets the local {@link Vfs} for the system.
     * @return a {@link Vfs}.
     */
    public static @NotNull org.gtk.gio.Vfs getLocal() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_vfs_get_local.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gio.Vfs(Refcounted.get(RESULT, false));
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle g_vfs_get_file_for_path = Interop.downcallHandle(
            "g_vfs_get_file_for_path",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_vfs_get_file_for_uri = Interop.downcallHandle(
            "g_vfs_get_file_for_uri",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_vfs_get_supported_uri_schemes = Interop.downcallHandle(
            "g_vfs_get_supported_uri_schemes",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_vfs_is_active = Interop.downcallHandle(
            "g_vfs_is_active",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_vfs_parse_name = Interop.downcallHandle(
            "g_vfs_parse_name",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_vfs_register_uri_scheme = Interop.downcallHandle(
            "g_vfs_register_uri_scheme",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_vfs_unregister_uri_scheme = Interop.downcallHandle(
            "g_vfs_unregister_uri_scheme",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_vfs_get_default = Interop.downcallHandle(
            "g_vfs_get_default",
            FunctionDescriptor.of(ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_vfs_get_local = Interop.downcallHandle(
            "g_vfs_get_local",
            FunctionDescriptor.of(ValueLayout.ADDRESS)
        );
    }
}
