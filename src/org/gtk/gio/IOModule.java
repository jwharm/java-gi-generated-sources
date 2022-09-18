package org.gtk.gio;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
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
     * Since 2.56, this function should be named <code>g_io_&<code>#60</code> modulename&<code>#62</code> _load</code>, where<code>modulename</code> is the plugin&<code>#8217</code> s filename with the <code>lib</code> or <code>libgio</code> prefix and
     * everything after the first dot removed, and with <code>-</code> replaced with <code>_</code>
     * throughout. For example, <code>libgiognutls-helper.so</code> becomes <code>gnutls_helper</code>.
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
     * Since 2.56, this function should be named <code>g_io_&<code>#60</code> modulename&<code>#62</code> _unload</code>, where<code>modulename</code> is the plugin&<code>#8217</code> s filename with the <code>lib</code> or <code>libgio</code> prefix and
     * everything after the first dot removed, and with <code>-</code> replaced with <code>_</code>
     * throughout. For example, <code>libgiognutls-helper.so</code> becomes <code>gnutls_helper</code>.
     * Using the new symbol names avoids name clashes when building modules
     * statically. The old symbol names continue to be supported, but cannot be used
     * for static builds.
     */
    public void unload() {
        gtk_h.g_io_module_unload(handle());
    }
    
}
