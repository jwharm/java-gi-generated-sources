package org.gtk.gio;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * Represents a scope for loading IO modules. A scope can be used for blocking
 * duplicate modules, or blocking a module you don&#39;t want to load.
 * 
 * The scope can be used with g_io_modules_load_all_in_directory_with_scope()
 * or g_io_modules_scan_all_in_directory_with_scope().
 */
public class IOModuleScope extends io.github.jwharm.javagi.ResourceBase {

    public IOModuleScope(io.github.jwharm.javagi.Reference reference) {
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
    
    /**
     * Create a new scope for loading of IO modules. A scope can be used for
     * blocking duplicate modules, or blocking a module you don&#39;t want to load.
     * 
     * Specify the {@link org.gtk.gio.IOModuleScopeFlags#BLOCK_DUPLICATES} flag to block modules
     * which have the same base name as a module that has already been seen
     * in this scope.
     */
    public static IOModuleScope new_(IOModuleScopeFlags flags) {
        var RESULT = gtk_h.g_io_module_scope_new(flags.getValue());
        return new IOModuleScope(References.get(RESULT, true));
    }
    
}
