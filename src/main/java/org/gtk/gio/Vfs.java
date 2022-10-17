package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Entry point for using GIO functionality.
 */
public class Vfs extends org.gtk.gobject.Object {

    public Vfs(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to Vfs */
    public static Vfs castFrom(org.gtk.gobject.Object gobject) {
        return new Vfs(gobject.refcounted());
    }
    
    private static final MethodHandle g_vfs_get_file_for_path = Interop.downcallHandle(
        "g_vfs_get_file_for_path",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets a {@link File} for {@code path}.
     */
    public @NotNull File getFileForPath(@NotNull java.lang.String path) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_vfs_get_file_for_path.invokeExact(handle(), Interop.allocateNativeString(path));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new File.FileImpl(Refcounted.get(RESULT, true));
    }
    
    private static final MethodHandle g_vfs_get_file_for_uri = Interop.downcallHandle(
        "g_vfs_get_file_for_uri",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets a {@link File} for {@code uri}.
     * <p>
     * This operation never fails, but the returned object
     * might not support any I/O operation if the URI
     * is malformed or if the URI scheme is not supported.
     */
    public @NotNull File getFileForUri(@NotNull java.lang.String uri) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_vfs_get_file_for_uri.invokeExact(handle(), Interop.allocateNativeString(uri));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new File.FileImpl(Refcounted.get(RESULT, true));
    }
    
    private static final MethodHandle g_vfs_get_supported_uri_schemes = Interop.downcallHandle(
        "g_vfs_get_supported_uri_schemes",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Gets a list of URI schemes supported by {@code vfs}.
     */
    public PointerString getSupportedUriSchemes() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_vfs_get_supported_uri_schemes.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new PointerString(RESULT);
    }
    
    private static final MethodHandle g_vfs_is_active = Interop.downcallHandle(
        "g_vfs_is_active",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Checks if the VFS is active.
     */
    public boolean isActive() {
        int RESULT;
        try {
            RESULT = (int) g_vfs_is_active.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    private static final MethodHandle g_vfs_parse_name = Interop.downcallHandle(
        "g_vfs_parse_name",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * This operation never fails, but the returned object might
     * not support any I/O operations if the {@code parse_name} cannot
     * be parsed by the {@link Vfs} module.
     */
    public @NotNull File parseName(@NotNull java.lang.String parseName) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_vfs_parse_name.invokeExact(handle(), Interop.allocateNativeString(parseName));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new File.FileImpl(Refcounted.get(RESULT, true));
    }
    
    private static final MethodHandle g_vfs_register_uri_scheme = Interop.downcallHandle(
        "g_vfs_register_uri_scheme",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
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
     */
    public boolean registerUriScheme(@NotNull java.lang.String scheme, @Nullable VfsFileLookupFunc uriFunc, @Nullable VfsFileLookupFunc parseNameFunc) {
        int RESULT;
        try {
            RESULT = (int) g_vfs_register_uri_scheme.invokeExact(handle(), Interop.allocateNativeString(scheme), 
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Gio.class, "__cbVfsFileLookupFunc",
                            MethodType.methodType(MemoryAddress.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(uriFunc)), 
                    Interop.cbDestroyNotifySymbol(), 
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Gio.class, "__cbVfsFileLookupFunc",
                            MethodType.methodType(MemoryAddress.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(uriFunc)), 
                    Interop.cbDestroyNotifySymbol());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    private static final MethodHandle g_vfs_unregister_uri_scheme = Interop.downcallHandle(
        "g_vfs_unregister_uri_scheme",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Unregisters the URI handler for {@code scheme} previously registered with
     * g_vfs_register_uri_scheme().
     */
    public boolean unregisterUriScheme(@NotNull java.lang.String scheme) {
        int RESULT;
        try {
            RESULT = (int) g_vfs_unregister_uri_scheme.invokeExact(handle(), Interop.allocateNativeString(scheme));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    private static final MethodHandle g_vfs_get_default = Interop.downcallHandle(
        "g_vfs_get_default",
        FunctionDescriptor.of(ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the default {@link Vfs} for the system.
     */
    public static @NotNull Vfs getDefault() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_vfs_get_default.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new Vfs(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle g_vfs_get_local = Interop.downcallHandle(
        "g_vfs_get_local",
        FunctionDescriptor.of(ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the local {@link Vfs} for the system.
     */
    public static @NotNull Vfs getLocal() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_vfs_get_local.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new Vfs(Refcounted.get(RESULT, false));
    }
    
}
