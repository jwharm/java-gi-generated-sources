package org.gtk.gio;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * Provides an interface and default functions for loading and unloading
 * modules. This is used internally to make GIO extensible, but can also
 * be used by others to implement module loading.
 */
public class IOModule extends org.gtk.gobject.TypeModule implements org.gtk.gobject.TypePlugin {

    public IOModule(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to IOModule */
    public static IOModule castFrom(org.gtk.gobject.Object gobject) {
        return new IOModule(gobject.getReference());
    }
    
    private static Reference constructNew(java.lang.String filename) {
        Reference RESULT = References.get(gtk_h.g_io_module_new(Interop.allocateNativeString(filename).handle()), true);
        return RESULT;
    }
    
    /**
     * Creates a new GIOModule that will load the specific
     * shared library when in use.
     */
    public IOModule(java.lang.String filename) {
        super(constructNew(filename));
    }
    
    /**
     * Required API for GIO modules to implement.
     * <p>
     * This function is run after the module has been loaded into GIO,
     * to initialize the module. Typically, this function will call
     * g_io_extension_point_implement().
     * <p>
     * Since 2.56, this function should be named {@code g_io_<modulename>_load}, where
     * {@code modulename} is the plugin’s filename with the {@code lib} or {@code libgio} prefix and
     * everything after the first dot removed, and with {@code -} replaced with {@code _}
     * throughout. For example, {@code libgiognutls-helper.so} becomes {@code gnutls_helper}.
     * Using the new symbol names avoids name clashes when building modules
     * statically. The old symbol names continue to be supported, but cannot be used
     * for static builds.
     */
    public void load() {
        gtk_h.g_io_module_load(handle());
    }
    
    /**
     * Required API for GIO modules to implement.
     * <p>
     * This function is run when the module is being unloaded from GIO,
     * to finalize the module.
     * <p>
     * Since 2.56, this function should be named {@code g_io_<modulename>_unload}, where
     * {@code modulename} is the plugin’s filename with the {@code lib} or {@code libgio} prefix and
     * everything after the first dot removed, and with {@code -} replaced with {@code _}
     * throughout. For example, {@code libgiognutls-helper.so} becomes {@code gnutls_helper}.
     * Using the new symbol names avoids name clashes when building modules
     * statically. The old symbol names continue to be supported, but cannot be used
     * for static builds.
     */
    public void unload() {
        gtk_h.g_io_module_unload(handle());
    }
    
    /**
     * Optional API for GIO modules to implement.
     * <p>
     * Should return a list of all the extension points that may be
     * implemented in this module.
     * <p>
     * This method will not be called in normal use, however it may be
     * called when probing existing modules and recording which extension
     * points that this model is used for. This means we won't have to
     * load and initialize this module unless its needed.
     * <p>
     * If this function is not implemented by the module the module will
     * always be loaded, initialized and then unloaded on application
     * startup so that it can register its extension points during init.
     * <p>
     * Note that a module need not actually implement all the extension
     * points that g_io_module_query() returns, since the exact list of
     * extension may depend on runtime issues. However all extension
     * points actually implemented must be returned by g_io_module_query()
     * (if defined).
     * <p>
     * When installing a module that implements g_io_module_query() you must
     * run gio-querymodules in order to build the cache files required for
     * lazy loading.
     * <p>
     * Since 2.56, this function should be named {@code g_io_<modulename>_query}, where
     * {@code modulename} is the plugin’s filename with the {@code lib} or {@code libgio} prefix and
     * everything after the first dot removed, and with {@code -} replaced with {@code _}
     * throughout. For example, {@code libgiognutls-helper.so} becomes {@code gnutls_helper}.
     * Using the new symbol names avoids name clashes when building modules
     * statically. The old symbol names continue to be supported, but cannot be used
     * for static builds.
     */
    public static PointerIterator<java.lang.String> query() {
        var RESULT = gtk_h.g_io_module_query();
        return new PointerString(RESULT).iterator();
    }
    
}
