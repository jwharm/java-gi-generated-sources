package org.gtk.gobject;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * The #GBindingGroup can be used to bind multiple properties
 * from an object collectively.
 * 
 * Use the various methods to bind properties from a single source
 * object to multiple destination objects. Properties can be bound
 * bidirectionally and are connected when the source object is set
 * with g_binding_group_set_source().
 */
public class BindingGroup extends Object {

    public BindingGroup(io.github.jwharm.javagi.interop.Reference reference) {
        super(reference);
    }
    
    /** Cast object to BindingGroup */
    public static BindingGroup castFrom(org.gtk.gobject.Object gobject) {
        return new BindingGroup(gobject.getReference());
    }
    
    /**
     * Creates a new #GBindingGroup.
     */
    public BindingGroup() {
        super(References.get(gtk_h.g_binding_group_new(), true));
    }
    
    /**
     * Creates a binding between @source_property on the source object
     * and @target_property on @target. Whenever the @source_property
     * is changed the @target_property is updated using the same value.
     * The binding flag %G_BINDING_SYNC_CREATE is automatically specified.
     * 
     * See g_object_bind_property() for more information.
     */
    public void bind(java.lang.String sourceProperty, Object target, java.lang.String targetProperty, int flags) {
        gtk_h.g_binding_group_bind(handle(), Interop.allocateNativeString(sourceProperty).handle(), target.handle(), Interop.allocateNativeString(targetProperty).handle(), flags);
    }
    
    /**
     * Creates a binding between @source_property on the source object and
     * @target_property on @target, allowing you to set the transformation
     * functions to be used by the binding. The binding flag
     * %G_BINDING_SYNC_CREATE is automatically specified.
     * 
     * See g_object_bind_property_full() for more information.
     */
    public void bindFull(BindingGroup self, java.lang.String sourceProperty, Object target, java.lang.String targetProperty, int flags, BindingTransformFunc transformTo, BindingTransformFunc transformFrom) {
        try {
            int hash = transformTo.hashCode();
            Interop.signalRegistry.put(hash, transformTo);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(boolean.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "cbBindingTransformFunc", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            gtk_h.g_binding_group_bind_full(handle(), Interop.allocateNativeString(sourceProperty).handle(), target.handle(), Interop.allocateNativeString(targetProperty).handle(), flags, nativeSymbol, nativeSymbol, intSegment, Interop.cbDestroyNotifySymbol());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Creates a binding between @source_property on the source object and
     * @target_property on @target, allowing you to set the transformation
     * functions to be used by the binding. The binding flag
     * %G_BINDING_SYNC_CREATE is automatically specified.
     * 
     * This function is the language bindings friendly version of
     * g_binding_group_bind_property_full(), using #GClosures
     * instead of function pointers.
     * 
     * See g_object_bind_property_with_closures() for more information.
     */
    public void bindWithClosures(java.lang.String sourceProperty, Object target, java.lang.String targetProperty, int flags, Closure transformTo, Closure transformFrom) {
        gtk_h.g_binding_group_bind_with_closures(handle(), Interop.allocateNativeString(sourceProperty).handle(), target.handle(), Interop.allocateNativeString(targetProperty).handle(), flags, transformTo.handle(), transformFrom.handle());
    }
    
    /**
     * Gets the source object used for binding properties.
     */
    public Object dupSource() {
        var RESULT = gtk_h.g_binding_group_dup_source(handle());
        return new Object(References.get(RESULT, false));
    }
    
    /**
     * Sets @source as the source object used for creating property
     * bindings. If there is already a source object all bindings from it
     * will be removed.
     * 
     * Note that all properties that have been bound must exist on @source.
     */
    public void setSource(Object source) {
        gtk_h.g_binding_group_set_source(handle(), source.handle());
    }
    
}
