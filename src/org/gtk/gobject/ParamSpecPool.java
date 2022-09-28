package org.gtk.gobject;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * A {@link ParamSpecPool} maintains a collection of {@code GParamSpecs} which can be
 * quickly accessed by owner and name.
 * <p>
 * The implementation of the {@link Object} property system uses such a pool to
 * store the {@code GParamSpecs} of the properties all object types.
 */
public class ParamSpecPool extends io.github.jwharm.javagi.ResourceBase {

    public ParamSpecPool(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /**
     * Inserts a {@link ParamSpec} in the pool.
     */
    public void insert(ParamSpec pspec, org.gtk.gobject.Type ownerType) {
        gtk_h.g_param_spec_pool_insert(handle(), pspec.handle(), ownerType.getValue());
    }
    
    /**
     * Gets an array of all {@code GParamSpecs} owned by {@code owner_type} in
     * the pool.
     */
    public PointerIterator<ParamSpec> list(org.gtk.gobject.Type ownerType, PointerInteger nPspecsP) {
        var RESULT = gtk_h.g_param_spec_pool_list(handle(), ownerType.getValue(), nPspecsP.handle());
        return new PointerProxy<ParamSpec>(RESULT, ParamSpec.class).iterator();
    }
    
    /**
     * Gets an {@link org.gtk.glib.List} of all {@code GParamSpecs} owned by {@code owner_type} in
     * the pool.
     */
    public org.gtk.glib.List listOwned(org.gtk.gobject.Type ownerType) {
        var RESULT = gtk_h.g_param_spec_pool_list_owned(handle(), ownerType.getValue());
        return new org.gtk.glib.List(References.get(RESULT, false));
    }
    
    /**
     * Looks up a {@link ParamSpec} in the pool.
     */
    public ParamSpec lookup(java.lang.String paramName, org.gtk.gobject.Type ownerType, boolean walkAncestors) {
        var RESULT = gtk_h.g_param_spec_pool_lookup(handle(), Interop.allocateNativeString(paramName).handle(), ownerType.getValue(), walkAncestors ? 1 : 0);
        return new ParamSpec(References.get(RESULT, false));
    }
    
    /**
     * Removes a {@link ParamSpec} from the pool.
     */
    public void remove(ParamSpec pspec) {
        gtk_h.g_param_spec_pool_remove(handle(), pspec.handle());
    }
    
    /**
     * Creates a new {@link ParamSpecPool}.
     * <p>
     * If {@code type_prefixing} is {@code true}, lookups in the newly created pool will
     * allow to specify the owner as a colon-separated prefix of the
     * property name, like "GtkContainer:border-width". This feature is
     * deprecated, so you should always set {@code type_prefixing} to {@code false}.
     */
    public static ParamSpecPool new_(boolean typePrefixing) {
        var RESULT = gtk_h.g_param_spec_pool_new(typePrefixing ? 1 : 0);
        return new ParamSpecPool(References.get(RESULT, true));
    }
    
}
