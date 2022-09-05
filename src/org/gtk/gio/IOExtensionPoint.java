package org.gtk.gio;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * #GIOExtensionPoint is an opaque data structure and can only be accessed
 * using the following functions.
 */
public class IOExtensionPoint extends io.github.jwharm.javagi.interop.ResourceBase {

    public IOExtensionPoint(io.github.jwharm.javagi.interop.Proxy proxy) {
        super(proxy);
    }
    
    /**
     * Finds a #GIOExtension for an extension point by name.
     */
    public IOExtension getExtensionByName(java.lang.String name) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_io_extension_point_get_extension_by_name(HANDLE(), Interop.allocateNativeString(name).HANDLE());
        return new IOExtension(ProxyFactory.get(RESULT, false));
    }
    
    /**
     * Gets a list of all extensions that implement this extension point.
     * The list is sorted by priority, beginning with the highest priority.
     */
    public org.gtk.glib.List getExtensions() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_io_extension_point_get_extensions(HANDLE());
        return new org.gtk.glib.List(ProxyFactory.get(RESULT, false));
    }
    
    /**
     * Gets the required type for @extension_point.
     */
    public org.gtk.gobject.Type getRequiredType() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_io_extension_point_get_required_type(HANDLE());
        return new org.gtk.gobject.Type(RESULT);
    }
    
    /**
     * Sets the required type for @extension_point to @type.
     * All implementations must henceforth have this type.
     */
    public void setRequiredType(Type type) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_io_extension_point_set_required_type(HANDLE(), type.getValue());
    }
    
}
