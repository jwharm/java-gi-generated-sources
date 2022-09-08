package org.gtk.gio;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * #GStaticResource is an opaque data structure and can only be accessed
 * using the following functions.
 */
public class StaticResource extends io.github.jwharm.javagi.interop.ResourceBase {

    public StaticResource(io.github.jwharm.javagi.interop.Reference reference) {
        super(reference);
    }
    
    /**
     * Finalized a GResource initialized by g_static_resource_init().
     * 
     * This is normally used by code generated by
     * [glib-compile-resources][glib-compile-resources]
     * and is not typically used by other code.
     */
    public void fini() {
        gtk_h.g_static_resource_fini(handle());
    }
    
    /**
     * Gets the GResource that was registered by a call to g_static_resource_init().
     * 
     * This is normally used by code generated by
     * [glib-compile-resources][glib-compile-resources]
     * and is not typically used by other code.
     */
    public Resource getResource() {
        var RESULT = gtk_h.g_static_resource_get_resource(handle());
        return new Resource(References.get(RESULT, false));
    }
    
    /**
     * Initializes a GResource from static data using a
     * GStaticResource.
     * 
     * This is normally used by code generated by
     * [glib-compile-resources][glib-compile-resources]
     * and is not typically used by other code.
     */
    public void init() {
        gtk_h.g_static_resource_init(handle());
    }
    
}
