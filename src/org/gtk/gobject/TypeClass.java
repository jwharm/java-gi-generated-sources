package org.gtk.gobject;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * An opaque structure used as the base of all classes.
 */
public class TypeClass extends io.github.jwharm.javagi.interop.ResourceBase {

    public TypeClass(io.github.jwharm.javagi.interop.Proxy proxy) {
        super(proxy);
    }
    
    /**
     * Gets the offset of the private data for instances of @g_class.
     * 
     * This is how many bytes you should add to the instance pointer of a
     * class in order to get the private data for the type represented by
     * @g_class.
     * 
     * You can only call this function after you have registered a private
     * data area for @g_class using g_type_class_add_private().
     */
    public int getInstancePrivateOffset() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_type_class_get_instance_private_offset(HANDLE());
        return RESULT;
    }
    
    public jdk.incubator.foreign.MemoryAddress getPrivate(Type privateType) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_type_class_get_private(HANDLE(), privateType.getValue());
        return RESULT;
    }
    
    /**
     * This is a convenience function often needed in class initializers.
     * It returns the class structure of the immediate parent type of the
     * class passed in.  Since derived classes hold a reference count on
     * their parent classes as long as they are instantiated, the returned
     * class will always exist.
     * 
     * This function is essentially equivalent to:
     * g_type_class_peek (g_type_parent (G_TYPE_FROM_CLASS (g_class)))
     */
    public TypeClass peekParent() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_type_class_peek_parent(HANDLE());
        return new TypeClass(ProxyFactory.get(RESULT, false));
    }
    
    /**
     * Decrements the reference count of the class structure being passed in.
     * Once the last reference count of a class has been released, classes
     * may be finalized by the type system, so further dereferencing of a
     * class pointer after g_type_class_unref() are invalid.
     */
    public void unref() {
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_type_class_unref(HANDLE());
    }
    
    /**
     * A variant of g_type_class_unref() for use in #GTypeClassCacheFunc
     * implementations. It unreferences a class without consulting the chain
     * of #GTypeClassCacheFuncs, avoiding the recursion which would occur
     * otherwise.
     */
    public void unrefUncached() {
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_type_class_unref_uncached(HANDLE());
    }
    
}
