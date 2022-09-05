package org.gtk.gobject;

import org.gtk.gobject.*;
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

    public BindingGroup(io.github.jwharm.javagi.interop.Proxy proxy) {
        super(proxy);
    }
    
    /** Cast object to BindingGroup */
    public static BindingGroup castFrom(org.gtk.gobject.Object gobject) {
        return new BindingGroup(gobject.getProxy());
    }
    
    /**
     * Creates a new #GBindingGroup.
     */
    public BindingGroup() {
        super(ProxyFactory.getProxy(io.github.jwharm.javagi.interop.jextract.gtk_h.g_binding_group_new(), true));
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
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_binding_group_bind(HANDLE(), Interop.getAllocator().allocateUtf8String(sourceProperty), target.HANDLE(), Interop.getAllocator().allocateUtf8String(targetProperty), flags);
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
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_binding_group_bind_with_closures(HANDLE(), Interop.getAllocator().allocateUtf8String(sourceProperty), target.HANDLE(), Interop.getAllocator().allocateUtf8String(targetProperty), flags, transformTo.HANDLE(), transformFrom.HANDLE());
    }
    
    /**
     * Gets the source object used for binding properties.
     */
    public Object dupSource() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_binding_group_dup_source(HANDLE());
        return new Object(ProxyFactory.getProxy(RESULT, false));
    }
    
    /**
     * Sets @source as the source object used for creating property
     * bindings. If there is already a source object all bindings from it
     * will be removed.
     * 
     * Note that all properties that have been bound must exist on @source.
     */
    public void setSource(Object source) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_binding_group_set_source(HANDLE(), source.HANDLE());
    }
    
}
