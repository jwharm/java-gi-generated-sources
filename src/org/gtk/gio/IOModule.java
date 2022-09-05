package org.gtk.gio;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * Provides an interface and default functions for loading and unloading
 * modules. This is used internally to make GIO extensible, but can also
 * be used by others to implement module loading.
 */
public class IOModule extends org.gtk.gobject.TypeModule implements org.gtk.gobject.TypePlugin {

    public IOModule(io.github.jwharm.javagi.interop.Proxy proxy) {
        super(proxy);
    }
    
    /** Cast object to IOModule */
    public static IOModule castFrom(org.gtk.gobject.Object gobject) {
        return new IOModule(gobject.getProxy());
    }
    
    /**
     * Creates a new GIOModule that will load the specific
     * shared library when in use.
     */
    public IOModule(java.lang.String filename) {
        super(ProxyFactory.get(io.github.jwharm.javagi.interop.jextract.gtk_h.g_io_module_new(Interop.getAllocator().allocateUtf8String(filename)), true));
    }
    
    /**
     * Required API for GIO modules to implement.
     * 
     * This function is run after the module has been loaded into GIO,
     * to initialize the module. Typically, this function will call
     * g_io_extension_point_implement().
     * 
     * Since 2.56, this function should be named `g_io_<modulename>_load`, where
     * `modulename` is the plugin’s filename with the `lib` or `libgio` prefix and
     * everything after the first dot removed, and with `-` replaced with `_`
     * throughout. For example, `libgiognutls-helper.so` becomes `gnutls_helper`.
     * Using the new symbol names avoids name clashes when building modules
     * statically. The old symbol names continue to be supported, but cannot be used
     * for static builds.
     */
    public void load() {
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_io_module_load(HANDLE());
    }
    
    /**
     * Required API for GIO modules to implement.
     * 
     * This function is run when the module is being unloaded from GIO,
     * to finalize the module.
     * 
     * Since 2.56, this function should be named `g_io_<modulename>_unload`, where
     * `modulename` is the plugin’s filename with the `lib` or `libgio` prefix and
     * everything after the first dot removed, and with `-` replaced with `_`
     * throughout. For example, `libgiognutls-helper.so` becomes `gnutls_helper`.
     * Using the new symbol names avoids name clashes when building modules
     * statically. The old symbol names continue to be supported, but cannot be used
     * for static builds.
     */
    public void unload() {
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_io_module_unload(HANDLE());
    }
    
}
