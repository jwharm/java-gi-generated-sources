package org.gtk.gio;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

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
    
    /**
     * Gets a {@link File} for {@code path}.
     */
    public File getFileForPath(java.lang.String path) {
        var RESULT = gtk_h.g_vfs_get_file_for_path(handle(), Interop.allocateNativeString(path).handle());
        return new File.FileImpl(Refcounted.get(RESULT, true));
    }
    
    /**
     * Gets a {@link File} for {@code uri}.
     * <p>
     * This operation never fails, but the returned object
     * might not support any I/O operation if the URI
     * is malformed or if the URI scheme is not supported.
     */
    public File getFileForUri(java.lang.String uri) {
        var RESULT = gtk_h.g_vfs_get_file_for_uri(handle(), Interop.allocateNativeString(uri).handle());
        return new File.FileImpl(Refcounted.get(RESULT, true));
    }
    
    /**
     * Gets a list of URI schemes supported by {@code vfs}.
     */
    public PointerIterator<java.lang.String> getSupportedUriSchemes() {
        var RESULT = gtk_h.g_vfs_get_supported_uri_schemes(handle());
        return new PointerString(RESULT).iterator();
    }
    
    /**
     * Checks if the VFS is active.
     */
    public boolean isActive() {
        var RESULT = gtk_h.g_vfs_is_active(handle());
        return RESULT != 0;
    }
    
    /**
     * This operation never fails, but the returned object might
     * not support any I/O operations if the {@code parse_name} cannot
     * be parsed by the {@link Vfs} module.
     */
    public File parseName(java.lang.String parseName) {
        var RESULT = gtk_h.g_vfs_parse_name(handle(), Interop.allocateNativeString(parseName).handle());
        return new File.FileImpl(Refcounted.get(RESULT, true));
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
     */
    public boolean registerUriScheme(java.lang.String scheme, VfsFileLookupFunc uriFunc, VfsFileLookupFunc parseNameFunc) {
        try {
            var RESULT = gtk_h.g_vfs_register_uri_scheme(handle(), Interop.allocateNativeString(scheme).handle(), 
                    Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Gio.class, "__cbVfsFileLookupFunc",
                            MethodType.methodType(MemoryAddress.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(uriFunc.hashCode(), uriFunc)), 
                    Interop.cbDestroyNotifySymbol(), 
                    Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Gio.class, "__cbVfsFileLookupFunc",
                            MethodType.methodType(MemoryAddress.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(uriFunc.hashCode(), uriFunc)), 
                    Interop.cbDestroyNotifySymbol());
            return RESULT != 0;
        } catch (IllegalAccessException | NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Unregisters the URI handler for {@code scheme} previously registered with
     * g_vfs_register_uri_scheme().
     */
    public boolean unregisterUriScheme(java.lang.String scheme) {
        var RESULT = gtk_h.g_vfs_unregister_uri_scheme(handle(), Interop.allocateNativeString(scheme).handle());
        return RESULT != 0;
    }
    
    /**
     * Gets the default {@link Vfs} for the system.
     */
    public static Vfs getDefault() {
        var RESULT = gtk_h.g_vfs_get_default();
        return new Vfs(Refcounted.get(RESULT, false));
    }
    
    /**
     * Gets the local {@link Vfs} for the system.
     */
    public static Vfs getLocal() {
        var RESULT = gtk_h.g_vfs_get_local();
        return new Vfs(Refcounted.get(RESULT, false));
    }
    
}
