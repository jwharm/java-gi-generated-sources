package org.gtk.gobject;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * An opaque structure used as the base of all classes.
 */
public class TypeClass extends io.github.jwharm.javagi.ResourceBase {

    public TypeClass(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    public TypeClass() {
        super(References.get(io.github.jwharm.javagi.interop.jextract.GTypeClass.allocate(Interop.getAllocator()).address()));
    }
    
    /**
     * Gets the offset of the private data for instances of {@code g_class}.
     * <p>
     * This is how many bytes you should add to the instance pointer of a
     * class in order to get the private data for the type represented by
     * {@code g_class}.
     * <p>
     * You can only call this function after you have registered a private
     * data area for {@code g_class} using g_type_class_add_private().
     */
    public int getInstancePrivateOffset() {
        var RESULT = gtk_h.g_type_class_get_instance_private_offset(handle());
        return RESULT;
    }
    
    public java.lang.foreign.MemoryAddress getPrivate(org.gtk.gobject.Type privateType) {
        var RESULT = gtk_h.g_type_class_get_private(handle(), privateType.getValue());
        return RESULT;
    }
    
    /**
     * This is a convenience function often needed in class initializers.
     * It returns the class structure of the immediate parent type of the
     * class passed in.  Since derived classes hold a reference count on
     * their parent classes as long as they are instantiated, the returned
     * class will always exist.
     * <p>
     * This function is essentially equivalent to:
     * g_type_class_peek (g_type_parent (G_TYPE_FROM_CLASS (g_class)))
     */
    public TypeClass peekParent() {
        var RESULT = gtk_h.g_type_class_peek_parent(handle());
        return new TypeClass(References.get(RESULT, false));
    }
    
    /**
     * Decrements the reference count of the class structure being passed in.
     * Once the last reference count of a class has been released, classes
     * may be finalized by the type system, so further dereferencing of a
     * class pointer after g_type_class_unref() are invalid.
     */
    public void unref() {
        gtk_h.g_type_class_unref(handle());
    }
    
    /**
     * A variant of g_type_class_unref() for use in {@link TypeClassCacheFunc}
     * implementations. It unreferences a class without consulting the chain
     * of {@code GTypeClassCacheFuncs}, avoiding the recursion which would occur
     * otherwise.
     */
    public void unrefUncached() {
        gtk_h.g_type_class_unref_uncached(handle());
    }
    
    public static void adjustPrivateOffset(java.lang.foreign.MemoryAddress gClass, PointerInteger privateSizeOrOffset) {
        gtk_h.g_type_class_adjust_private_offset(gClass, privateSizeOrOffset.handle());
    }
    
    /**
     * This function is essentially the same as g_type_class_ref(),
     * except that the classes reference count isn't incremented.
     * As a consequence, this function may return {@code null} if the class
     * of the type passed in does not currently exist (hasn't been
     * referenced before).
     */
    public static TypeClass peek(org.gtk.gobject.Type type) {
        var RESULT = gtk_h.g_type_class_peek(type.getValue());
        return new TypeClass(References.get(RESULT, false));
    }
    
    /**
     * A more efficient version of g_type_class_peek() which works only for
     * static types.
     */
    public static TypeClass peekStatic(org.gtk.gobject.Type type) {
        var RESULT = gtk_h.g_type_class_peek_static(type.getValue());
        return new TypeClass(References.get(RESULT, false));
    }
    
    /**
     * Increments the reference count of the class structure belonging to
     * {@code type}. This function will demand-create the class if it doesn't
     * exist already.
     */
    public static TypeClass ref(org.gtk.gobject.Type type) {
        var RESULT = gtk_h.g_type_class_ref(type.getValue());
        return new TypeClass(References.get(RESULT, false));
    }
    
}
