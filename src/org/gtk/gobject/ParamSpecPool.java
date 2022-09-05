package org.gtk.gobject;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * A #GParamSpecPool maintains a collection of #GParamSpecs which can be
 * quickly accessed by owner and name.
 * 
 * The implementation of the #GObject property system uses such a pool to
 * store the #GParamSpecs of the properties all object types.
 */
public class ParamSpecPool extends io.github.jwharm.javagi.interop.ResourceBase {

    public ParamSpecPool(io.github.jwharm.javagi.interop.Proxy proxy) {
        super(proxy);
    }
    
    /**
     * Inserts a #GParamSpec in the pool.
     */
    public void insert(ParamSpec pspec, Type ownerType) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_param_spec_pool_insert(HANDLE(), pspec.HANDLE(), ownerType.getValue());
    }
    
    /**
     * Gets an #GList of all #GParamSpecs owned by @owner_type in
     * the pool.
     */
    public org.gtk.glib.List listOwned(Type ownerType) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_param_spec_pool_list_owned(HANDLE(), ownerType.getValue());
        return new org.gtk.glib.List(ProxyFactory.get(RESULT, false));
    }
    
    /**
     * Looks up a #GParamSpec in the pool.
     */
    public ParamSpec lookup(java.lang.String paramName, Type ownerType, boolean walkAncestors) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_param_spec_pool_lookup(HANDLE(), Interop.getAllocator().allocateUtf8String(paramName), ownerType.getValue(), walkAncestors ? 1 : 0);
        return new ParamSpec(ProxyFactory.get(RESULT, false));
    }
    
    /**
     * Removes a #GParamSpec from the pool.
     */
    public void remove(ParamSpec pspec) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_param_spec_pool_remove(HANDLE(), pspec.HANDLE());
    }
    
}
