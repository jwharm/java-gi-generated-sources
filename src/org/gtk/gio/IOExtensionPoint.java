package org.gtk.gio;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * {@link IOExtensionPoint} is an opaque data structure and can only be accessed
 * using the following functions.
 */
public class IOExtensionPoint extends io.github.jwharm.javagi.ResourceBase {

    public IOExtensionPoint(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /**
     * Finds a {@link IOExtension} for an extension point by name.
     */
    public IOExtension getExtensionByName(java.lang.String name) {
        var RESULT = gtk_h.g_io_extension_point_get_extension_by_name(handle(), Interop.allocateNativeString(name).handle());
        return new IOExtension(References.get(RESULT, false));
    }
    
    /**
     * Gets a list of all extensions that implement this extension point.
     * The list is sorted by priority, beginning with the highest priority.
     */
    public org.gtk.glib.List getExtensions() {
        var RESULT = gtk_h.g_io_extension_point_get_extensions(handle());
        return new org.gtk.glib.List(References.get(RESULT, false));
    }
    
    /**
     * Gets the required type for {@code extension_point}.
     */
    public org.gtk.gobject.Type getRequiredType() {
        var RESULT = gtk_h.g_io_extension_point_get_required_type(handle());
        return new org.gtk.gobject.Type(RESULT);
    }
    
    /**
     * Sets the required type for {@code extension_point} to {@code type}.
     * All implementations must henceforth have this type.
     */
    public void setRequiredType(Type type) {
        gtk_h.g_io_extension_point_set_required_type(handle(), type.getValue());
    }
    
    /**
     * Registers {@code type} as extension for the extension point with name
     * {@code extension_point_name}.
     * <p>
     * If {@code type} has already been registered as an extension for this
     * extension point, the existing {@link IOExtension} object is returned.
     */
    public static IOExtension implement(java.lang.String extensionPointName, Type type, java.lang.String extensionName, int priority) {
        var RESULT = gtk_h.g_io_extension_point_implement(Interop.allocateNativeString(extensionPointName).handle(), type.getValue(), Interop.allocateNativeString(extensionName).handle(), priority);
        return new IOExtension(References.get(RESULT, false));
    }
    
    /**
     * Looks up an existing extension point.
     */
    public static IOExtensionPoint lookup(java.lang.String name) {
        var RESULT = gtk_h.g_io_extension_point_lookup(Interop.allocateNativeString(name).handle());
        return new IOExtensionPoint(References.get(RESULT, false));
    }
    
    /**
     * Registers an extension point.
     */
    public static IOExtensionPoint register(java.lang.String name) {
        var RESULT = gtk_h.g_io_extension_point_register(Interop.allocateNativeString(name).handle());
        return new IOExtensionPoint(References.get(RESULT, false));
    }
    
}
