package org.gtk.gio;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * Entry point for using GIO functionality.
 */
public class Vfs extends org.gtk.gobject.Object {

    public Vfs(io.github.jwharm.javagi.interop.Proxy proxy) {
        super(proxy);
    }
    
    /** Cast object to Vfs */
    public static Vfs castFrom(org.gtk.gobject.Object gobject) {
        return new Vfs(gobject.getProxy());
    }
    
    /**
     * Gets a #GFile for @path.
     */
    public File getFileForPath(java.lang.String path) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_vfs_get_file_for_path(HANDLE(), Interop.getAllocator().allocateUtf8String(path));
        return new File.FileImpl(ProxyFactory.getProxy(RESULT, true));
    }
    
    /**
     * Gets a #GFile for @uri.
     * 
     * This operation never fails, but the returned object
     * might not support any I/O operation if the URI
     * is malformed or if the URI scheme is not supported.
     */
    public File getFileForUri(java.lang.String uri) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_vfs_get_file_for_uri(HANDLE(), Interop.getAllocator().allocateUtf8String(uri));
        return new File.FileImpl(ProxyFactory.getProxy(RESULT, true));
    }
    
    /**
     * Checks if the VFS is active.
     */
    public boolean isActive() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_vfs_is_active(HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * This operation never fails, but the returned object might
     * not support any I/O operations if the @parse_name cannot
     * be parsed by the #GVfs module.
     */
    public File parseName(java.lang.String parseName) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_vfs_parse_name(HANDLE(), Interop.getAllocator().allocateUtf8String(parseName));
        return new File.FileImpl(ProxyFactory.getProxy(RESULT, true));
    }
    
    /**
     * Unregisters the URI handler for @scheme previously registered with
     * g_vfs_register_uri_scheme().
     */
    public boolean unregisterUriScheme(java.lang.String scheme) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_vfs_unregister_uri_scheme(HANDLE(), Interop.getAllocator().allocateUtf8String(scheme));
        return (RESULT != 0);
    }
    
}
