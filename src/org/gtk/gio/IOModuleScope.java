package org.gtk.gio;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * Represents a scope for loading IO modules. A scope can be used for blocking
 * duplicate modules, or blocking a module you don't want to load.
 * 
 * The scope can be used with g_io_modules_load_all_in_directory_with_scope()
 * or g_io_modules_scan_all_in_directory_with_scope().
 */
public class IOModuleScope extends io.github.jwharm.javagi.interop.ResourceBase {

    public IOModuleScope(io.github.jwharm.javagi.interop.Reference reference) {
        super(reference);
    }
    
    /**
     * Block modules with the given @basename from being loaded when
     * this scope is used with g_io_modules_scan_all_in_directory_with_scope()
     * or g_io_modules_load_all_in_directory_with_scope().
     */
    public void block(java.lang.String basename) {
        gtk_h.g_io_module_scope_block(handle(), Interop.allocateNativeString(basename).handle());
    }
    
    /**
     * Free a module scope.
     */
    public void free() {
        gtk_h.g_io_module_scope_free(handle());
    }
    
}
