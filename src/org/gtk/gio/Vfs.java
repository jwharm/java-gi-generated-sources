package org.gtk.gio;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * Entry point for using GIO functionality.
 */
public class Vfs extends org.gtk.gobject.Object {

    public Vfs(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to Vfs */
    public static Vfs castFrom(org.gtk.gobject.Object gobject) {
        return new Vfs(gobject.getReference());
    }
    
    /**
     * Gets a #GFile for @path.
     */
    public File getFileForPath(java.lang.String path) {
        var RESULT = gtk_h.g_vfs_get_file_for_path(handle(), Interop.allocateNativeString(path).handle());
        return new File.FileImpl(References.get(RESULT, true));
    }
    
    /**
     * Gets a #GFile for @uri.
     * 
     * This operation never fails, but the returned object
     * might not support any I/O operation if the URI
     * is malformed or if the URI scheme is not supported.
     */
    public File getFileForUri(java.lang.String uri) {
        var RESULT = gtk_h.g_vfs_get_file_for_uri(handle(), Interop.allocateNativeString(uri).handle());
        return new File.FileImpl(References.get(RESULT, true));
    }
    
    /**
     * Checks if the VFS is active.
     */
    public boolean isActive() {
        var RESULT = gtk_h.g_vfs_is_active(handle());
        return (RESULT != 0);
    }
    
    /**
     * This operation never fails, but the returned object might
     * not support any I/O operations if the @parse_name cannot
     * be parsed by the #GVfs module.
     */
    public File parseName(java.lang.String parseName) {
        var RESULT = gtk_h.g_vfs_parse_name(handle(), Interop.allocateNativeString(parseName).handle());
        return new File.FileImpl(References.get(RESULT, true));
    }
    
    /**
     * Registers @uri_func and @parse_name_func as the #GFile URI and parse name
     * lookup functions for URIs with a scheme matching @scheme.
     * Note that @scheme is registered only within the running application, as
     * opposed to desktop-wide as it happens with GVfs backends.
     * 
     * When a #GFile is requested with an URI containing @scheme (e.g. through
     * g_file_new_for_uri()), @uri_func will be called to allow a custom
     * constructor. The implementation of @uri_func should not be blocking, and
     * must not call g_vfs_register_uri_scheme() or g_vfs_unregister_uri_scheme().
     * 
     * When g_file_parse_name() is called with a parse name obtained from such file,
     * @parse_name_func will be called to allow the #GFile to be created again. In
     * that case, it&#39;s responsibility of @parse_name_func to make sure the parse
     * name matches what the custom #GFile implementation returned when
     * g_file_get_parse_name() was previously called. The implementation of
     * @parse_name_func should not be blocking, and must not call
     * g_vfs_register_uri_scheme() or g_vfs_unregister_uri_scheme().
     * 
     * It&#39;s an error to call this function twice with the same scheme. To unregister
     * a custom URI scheme, use g_vfs_unregister_uri_scheme().
     */
    public boolean registerUriScheme(java.lang.String scheme, VfsFileLookupFunc uriFunc, VfsFileLookupFunc parseNameFunc) {
        try {
            var RESULT = gtk_h.g_vfs_register_uri_scheme(handle(), Interop.allocateNativeString(scheme).handle(), 
                    CLinker.systemCLinker().upcallStub(
                        MethodHandles.lookup().findStatic(JVMCallbacks.class, "cbVfsFileLookupFunc",
                            MethodType.methodType(MemoryAddress.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    Interop.getAllocator().allocate(C_INT, Interop.registerCallback(uriFunc.hashCode(), uriFunc)), 
                    Interop.cbDestroyNotifySymbol(), 
                    CLinker.systemCLinker().upcallStub(
                        MethodHandles.lookup().findStatic(JVMCallbacks.class, "cbVfsFileLookupFunc",
                            MethodType.methodType(MemoryAddress.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    Interop.getAllocator().allocate(C_INT, Interop.registerCallback(uriFunc.hashCode(), uriFunc)), 
                    Interop.cbDestroyNotifySymbol());
            return (RESULT != 0);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Unregisters the URI handler for @scheme previously registered with
     * g_vfs_register_uri_scheme().
     */
    public boolean unregisterUriScheme(java.lang.String scheme) {
        var RESULT = gtk_h.g_vfs_unregister_uri_scheme(handle(), Interop.allocateNativeString(scheme).handle());
        return (RESULT != 0);
    }
    
    /**
     * Gets the default #GVfs for the system.
     */
    public static Vfs getDefault() {
        var RESULT = gtk_h.g_vfs_get_default();
        return new Vfs(References.get(RESULT, false));
    }
    
    /**
     * Gets the local #GVfs for the system.
     */
    public static Vfs getLocal() {
        var RESULT = gtk_h.g_vfs_get_local();
        return new Vfs(References.get(RESULT, false));
    }
    
}
