package org.gtk.gobject;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * A #GParamSpecPool maintains a collection of #GParamSpecs which can be
 * quickly accessed by owner and name.
 * 
 * The implementation of the #GObject property system uses such a pool to
 * store the #GParamSpecs of the properties all object types.
 */
public class ParamSpecPool extends io.github.jwharm.javagi.ResourceBase {

    public ParamSpecPool(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /**
     * Inserts a #GParamSpec in the pool.
     */
    public void insert(ParamSpec pspec, Type ownerType) {
        gtk_h.g_param_spec_pool_insert(handle(), pspec.handle(), ownerType.getValue());
    }
    
    /**
     * Gets an #GList of all #GParamSpecs owned by @owner_type in
     * the pool.
     */
    public org.gtk.glib.List listOwned(Type ownerType) {
        var RESULT = gtk_h.g_param_spec_pool_list_owned(handle(), ownerType.getValue());
        return new org.gtk.glib.List(References.get(RESULT, false));
    }
    
    /**
     * Looks up a #GParamSpec in the pool.
     */
    public ParamSpec lookup(java.lang.String paramName, Type ownerType, boolean walkAncestors) {
        var RESULT = gtk_h.g_param_spec_pool_lookup(handle(), Interop.allocateNativeString(paramName).handle(), ownerType.getValue(), walkAncestors ? 1 : 0);
        return new ParamSpec(References.get(RESULT, false));
    }
    
    /**
     * Removes a #GParamSpec from the pool.
     */
    public void remove(ParamSpec pspec) {
        gtk_h.g_param_spec_pool_remove(handle(), pspec.handle());
    }
    
    /**
     * Creates a new #GParamSpecPool.
     * 
     * If @type_prefixing is <code>TRUE,</code> lookups in the newly created pool will
     * allow to specify the owner as a colon-separated prefix of the
     * property name, like &#34;GtkContainer:border-width&#34;. This feature is
     * deprecated, so you should always set @type_prefixing to lookups in the newly created pool will
     * allow to specify the owner as a colon-separated prefix of the
     * property name, like &#34;GtkContainer:border-width&#34;. This feature is
     * deprecated, so you should always set @type_prefixing to %FALSE.
     */
    public static ParamSpecPool new_(boolean typePrefixing) {
        var RESULT = gtk_h.g_param_spec_pool_new(typePrefixing ? 1 : 0);
        return new ParamSpecPool(References.get(RESULT, true));
    }
    
}
