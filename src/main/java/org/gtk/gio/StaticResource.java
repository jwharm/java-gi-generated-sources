package org.gtk.gio;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * {@link StaticResource} is an opaque data structure and can only be accessed
 * using the following functions.
 */
public class StaticResource extends io.github.jwharm.javagi.ResourceBase {

    public StaticResource(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    public StaticResource() {
        super(Refcounted.get(io.github.jwharm.javagi.interop.jextract.GStaticResource.allocate(Interop.getAllocator()).address()));
    }
    
    /**
     * Finalized a GResource initialized by g_static_resource_init().
     * <p>
     * This is normally used by code generated by
     * [glib-compile-resources][glib-compile-resources]
     * and is not typically used by other code.
     */
    public void fini() {
        gtk_h.g_static_resource_fini(handle());
    }
    
    /**
     * Gets the GResource that was registered by a call to g_static_resource_init().
     * <p>
     * This is normally used by code generated by
     * [glib-compile-resources][glib-compile-resources]
     * and is not typically used by other code.
     */
    public Resource getResource() {
        var RESULT = gtk_h.g_static_resource_get_resource(handle());
        return new Resource(Refcounted.get(RESULT, false));
    }
    
    /**
     * Initializes a GResource from static data using a
     * GStaticResource.
     * <p>
     * This is normally used by code generated by
     * [glib-compile-resources][glib-compile-resources]
     * and is not typically used by other code.
     */
    public void init() {
        gtk_h.g_static_resource_init(handle());
    }
    
}
