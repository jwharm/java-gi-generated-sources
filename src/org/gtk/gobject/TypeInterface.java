package org.gtk.gobject;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * An opaque structure used as the base of all interface types.
 */
public class TypeInterface extends io.github.jwharm.javagi.ResourceBase {

    public TypeInterface(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /**
     * Returns the corresponding {@link org.gtk.gobject.TypeInterface} structure of the parent type
     * of the instance type to which @g_iface belongs. This is useful when
     * deriving the implementation of an interface from the parent type and
     * then possibly overriding some methods.
     */
    public TypeInterface peekParent() {
        var RESULT = gtk_h.g_type_interface_peek_parent(handle());
        return new TypeInterface(References.get(RESULT, false));
    }
    
    /**
     * Adds @prerequisite_type to the list of prerequisites of @interface_type.
     * This means that any type implementing @interface_type must also implement
     * @prerequisite_type. Prerequisites can be thought of as an alternative to
     * interface derivation (which GType doesn&<code>#39</code> t support). An interface can have
     * at most one instantiatable prerequisite type.
     */
    public static void addPrerequisite(Type interfaceType, Type prerequisiteType) {
        gtk_h.g_type_interface_add_prerequisite(interfaceType.getValue(), prerequisiteType.getValue());
    }
    
    /**
     * Returns the {@link org.gtk.gobject.TypePlugin} structure for the dynamic interface
     * @interface_type which has been added to @instance_type, or <code>null</code> if @interface_type has not been added to @instance_type or does
     * not have a {@link org.gtk.gobject.TypePlugin} structure. See g_type_add_interface_dynamic().
     */
    public static TypePlugin getPlugin(Type instanceType, Type interfaceType) {
        var RESULT = gtk_h.g_type_interface_get_plugin(instanceType.getValue(), interfaceType.getValue());
        return new TypePlugin.TypePluginImpl(References.get(RESULT, false));
    }
    
    /**
     * Returns the most specific instantiatable prerequisite of an
     * interface type. If the interface type has no instantiatable
     * prerequisite, <code>G_TYPE_INVALID</code> is returned.
     * 
     * See g_type_interface_add_prerequisite() for more information
     * about prerequisites.
     */
    public static org.gtk.gobject.Type instantiatablePrerequisite(Type interfaceType) {
        var RESULT = gtk_h.g_type_interface_instantiatable_prerequisite(interfaceType.getValue());
        return new org.gtk.gobject.Type(RESULT);
    }
    
    /**
     * Returns the {@link org.gtk.gobject.TypeInterface} structure of an interface to which the
     * passed in class conforms.
     */
    public static TypeInterface peek(TypeClass instanceClass, Type ifaceType) {
        var RESULT = gtk_h.g_type_interface_peek(instanceClass.handle(), ifaceType.getValue());
        return new TypeInterface(References.get(RESULT, false));
    }
    
}
