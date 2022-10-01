package org.gtk.gobject;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * An opaque structure used as the base of all interface types.
 */
public class TypeInterface extends io.github.jwharm.javagi.ResourceBase {

    public TypeInterface(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    public TypeInterface() {
        super(Refcounted.get(io.github.jwharm.javagi.interop.jextract.GTypeInterface.allocate(Interop.getAllocator()).address()));
    }
    
    /**
     * Returns the corresponding {@link TypeInterface} structure of the parent type
     * of the instance type to which {@code g_iface} belongs. This is useful when
     * deriving the implementation of an interface from the parent type and
     * then possibly overriding some methods.
     */
    public TypeInterface peekParent() {
        var RESULT = gtk_h.g_type_interface_peek_parent(handle());
        return new TypeInterface(Refcounted.get(RESULT, false));
    }
    
    /**
     * Adds {@code prerequisite_type} to the list of prerequisites of {@code interface_type}.
     * This means that any type implementing {@code interface_type} must also implement
     * {@code prerequisite_type}. Prerequisites can be thought of as an alternative to
     * interface derivation (which GType doesn't support). An interface can have
     * at most one instantiatable prerequisite type.
     */
    public static void addPrerequisite(org.gtk.gobject.Type interfaceType, org.gtk.gobject.Type prerequisiteType) {
        gtk_h.g_type_interface_add_prerequisite(interfaceType.getValue(), prerequisiteType.getValue());
    }
    
    /**
     * Returns the {@link TypePlugin} structure for the dynamic interface
     * {@code interface_type} which has been added to {@code instance_type}, or {@code null}
     * if {@code interface_type} has not been added to {@code instance_type} or does
     * not have a {@link TypePlugin} structure. See g_type_add_interface_dynamic().
     */
    public static TypePlugin getPlugin(org.gtk.gobject.Type instanceType, org.gtk.gobject.Type interfaceType) {
        var RESULT = gtk_h.g_type_interface_get_plugin(instanceType.getValue(), interfaceType.getValue());
        return new TypePlugin.TypePluginImpl(Refcounted.get(RESULT, false));
    }
    
    /**
     * Returns the most specific instantiatable prerequisite of an
     * interface type. If the interface type has no instantiatable
     * prerequisite, {@code G_TYPE_INVALID} is returned.
     * <p>
     * See g_type_interface_add_prerequisite() for more information
     * about prerequisites.
     */
    public static org.gtk.gobject.Type instantiatablePrerequisite(org.gtk.gobject.Type interfaceType) {
        var RESULT = gtk_h.g_type_interface_instantiatable_prerequisite(interfaceType.getValue());
        return new org.gtk.gobject.Type(RESULT);
    }
    
    /**
     * Returns the {@link TypeInterface} structure of an interface to which the
     * passed in class conforms.
     */
    public static TypeInterface peek(TypeClass instanceClass, org.gtk.gobject.Type ifaceType) {
        var RESULT = gtk_h.g_type_interface_peek(instanceClass.handle(), ifaceType.getValue());
        return new TypeInterface(Refcounted.get(RESULT, false));
    }
    
    /**
     * Returns the prerequisites of an interfaces type.
     */
    public static PointerIterator<Long> prerequisites(org.gtk.gobject.Type interfaceType, PointerInteger nPrerequisites) {
        var RESULT = gtk_h.g_type_interface_prerequisites(interfaceType.getValue(), nPrerequisites.handle());
        return new PointerLong(RESULT).iterator();
    }
    
}
