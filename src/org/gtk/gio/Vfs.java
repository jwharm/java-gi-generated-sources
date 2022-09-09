package org.gtk.gio;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * Entry point for using GIO functionality.
 */
public class Vfs extends org.gtk.gobject.Object {

    public Vfs(io.github.jwharm.javagi.interop.Reference reference) {
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
