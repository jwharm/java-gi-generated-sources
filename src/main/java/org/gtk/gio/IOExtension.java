package org.gtk.gio;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * {@link IOExtension} is an opaque data structure and can only be accessed
 * using the following functions.
 */
public class IOExtension extends io.github.jwharm.javagi.ResourceBase {

    public IOExtension(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /**
     * Gets the name under which {@code extension} was registered.
     * <p>
     * Note that the same type may be registered as extension
     * for multiple extension points, under different names.
     */
    public java.lang.String getName() {
        var RESULT = gtk_h.g_io_extension_get_name(handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Gets the priority with which {@code extension} was registered.
     */
    public int getPriority() {
        var RESULT = gtk_h.g_io_extension_get_priority(handle());
        return RESULT;
    }
    
    /**
     * Gets the type associated with {@code extension}.
     */
    public org.gtk.gobject.Type getType() {
        var RESULT = gtk_h.g_io_extension_get_type(handle());
        return new org.gtk.gobject.Type(RESULT);
    }
    
    /**
     * Gets a reference to the class for the type that is
     * associated with {@code extension}.
     */
    public org.gtk.gobject.TypeClass refClass() {
        var RESULT = gtk_h.g_io_extension_ref_class(handle());
        return new org.gtk.gobject.TypeClass(References.get(RESULT, true));
    }
    
}
