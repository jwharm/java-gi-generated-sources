package org.gtk.gio;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * #GIOExtension is an opaque data structure and can only be accessed
 * using the following functions.
 */
public class IOExtension extends io.github.jwharm.javagi.interop.ResourceBase {

    public IOExtension(io.github.jwharm.javagi.interop.Reference reference) {
        super(reference);
    }
    
    /**
     * Gets the name under which @extension was registered.
     * 
     * Note that the same type may be registered as extension
     * for multiple extension points, under different names.
     */
    public java.lang.String getName() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_io_extension_get_name(HANDLE());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Gets the priority with which @extension was registered.
     */
    public int getPriority() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_io_extension_get_priority(HANDLE());
        return RESULT;
    }
    
    /**
     * Gets the type associated with @extension.
     */
    public org.gtk.gobject.Type getType() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_io_extension_get_type(HANDLE());
        return new org.gtk.gobject.Type(RESULT);
    }
    
    /**
     * Gets a reference to the class for the type that is
     * associated with @extension.
     */
    public org.gtk.gobject.TypeClass refClass() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_io_extension_ref_class(HANDLE());
        return new org.gtk.gobject.TypeClass(References.get(RESULT, true));
    }
    
}
