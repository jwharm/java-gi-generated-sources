package org.gtk.gobject;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * The {@link BindingGroup} can be used to bind multiple properties
 * from an object collectively.
 * <p>
 * Use the various methods to bind properties from a single source
 * object to multiple destination objects. Properties can be bound
 * bidirectionally and are connected when the source object is set
 * with g_binding_group_set_source().
 */
public class BindingGroup extends Object {

    public BindingGroup(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to BindingGroup */
    public static BindingGroup castFrom(org.gtk.gobject.Object gobject) {
        return new BindingGroup(gobject.refcounted());
    }
    
    private static Refcounted constructNew() {
        Refcounted RESULT = Refcounted.get(gtk_h.g_binding_group_new(), true);
        return RESULT;
    }
    
    /**
     * Creates a new {@link BindingGroup}.
     */
    public BindingGroup() {
        super(constructNew());
    }
    
    /**
     * Creates a binding between {@code source_property} on the source object
     * and {@code target_property} on {@code target}. Whenever the {@code source_property}
     * is changed the {@code target_property} is updated using the same value.
     * The binding flag {@link BindingFlags#SYNC_CREATE} is automatically specified.
     * <p>
     * See g_object_bind_property() for more information.
     */
    public void bind(java.lang.String sourceProperty, Object target, java.lang.String targetProperty, BindingFlags flags) {
        gtk_h.g_binding_group_bind(handle(), Interop.allocateNativeString(sourceProperty).handle(), target.handle(), Interop.allocateNativeString(targetProperty).handle(), flags.getValue());
    }
    
    /**
     * Creates a binding between {@code source_property} on the source object and
     * {@code target_property} on {@code target}, allowing you to set the transformation
     * functions to be used by the binding. The binding flag
     * {@link BindingFlags#SYNC_CREATE} is automatically specified.
     * <p>
     * See g_object_bind_property_full() for more information.
     */
    public void bindFull(java.lang.String sourceProperty, Object target, java.lang.String targetProperty, BindingFlags flags, BindingTransformFunc transformTo, BindingTransformFunc transformFrom) {
        try {
            gtk_h.g_binding_group_bind_full(handle(), Interop.allocateNativeString(sourceProperty).handle(), target.handle(), Interop.allocateNativeString(targetProperty).handle(), flags.getValue(), 
                    Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(GObject.class, "__cbBindingTransformFunc",
                            MethodType.methodType(int.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(GObject.class, "__cbBindingTransformFunc",
                            MethodType.methodType(int.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(transformTo.hashCode(), transformTo)), 
                    Interop.cbDestroyNotifySymbol());
        } catch (IllegalAccessException | NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Creates a binding between {@code source_property} on the source object and
     * {@code target_property} on {@code target}, allowing you to set the transformation
     * functions to be used by the binding. The binding flag
     * {@link BindingFlags#SYNC_CREATE} is automatically specified.
     * <p>
     * This function is the language bindings friendly version of
     * g_binding_group_bind_property_full(), using {@code GClosures}
     * instead of function pointers.
     * <p>
     * See g_object_bind_property_with_closures() for more information.
     */
    public void bindWithClosures(java.lang.String sourceProperty, Object target, java.lang.String targetProperty, BindingFlags flags, Closure transformTo, Closure transformFrom) {
        gtk_h.g_binding_group_bind_with_closures(handle(), Interop.allocateNativeString(sourceProperty).handle(), target.handle(), Interop.allocateNativeString(targetProperty).handle(), flags.getValue(), transformTo.handle(), transformFrom.handle());
    }
    
    /**
     * Gets the source object used for binding properties.
     */
    public Object dupSource() {
        var RESULT = gtk_h.g_binding_group_dup_source(handle());
        return new Object(Refcounted.get(RESULT, false));
    }
    
    /**
     * Sets {@code source} as the source object used for creating property
     * bindings. If there is already a source object all bindings from it
     * will be removed.
     * <p>
     * Note that all properties that have been bound must exist on {@code source}.
     */
    public void setSource(Object source) {
        gtk_h.g_binding_group_set_source(handle(), source.handle());
    }
    
}
