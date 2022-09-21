package org.gtk.gobject;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
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
    public void insert(ParamSpec pspec, Type ownerType) {
        gtk_h.g_param_spec_pool_insert(handle(), pspec.handle(), ownerType.getValue());
    }
    
    /**
     * Gets an {@link org.gtk.glib.List} of all {@code GParamSpecs} owned by {@code owner_type} in
     * the pool.
     */
    public org.gtk.glib.List listOwned(Type ownerType) {
        var RESULT = gtk_h.g_param_spec_pool_list_owned(handle(), ownerType.getValue());
        return new org.gtk.glib.List(References.get(RESULT, false));
    }
    
    /**
     * Looks up a {@link ParamSpec} in the pool.
     */
    public ParamSpec lookup(java.lang.String paramName, Type ownerType, boolean walkAncestors) {
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
     * If {@code type_prefixing} is <code>true</code>, lookups in the newly created pool will
     * allow to specify the owner as a colon-separated prefix of the
     * property name, like "GtkContainer:border-width". This feature is
     * deprecated, so you should always set {@code type_prefixing} to <code>false</code>.
     */
    public static ParamSpecPool new_(boolean typePrefixing) {
        var RESULT = gtk_h.g_param_spec_pool_new(typePrefixing ? 1 : 0);
        return new ParamSpecPool(References.get(RESULT, true));
    }
    
}
