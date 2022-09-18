package org.gtk.gobject;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * A {@link org.gtk.gobject.ParamSpecPool} maintains a collection of <code>#GParamSpecs</code> which can be
 * quickly accessed by owner and name.
 * 
 * The implementation of the {@link org.gtk.gobject.Object} property system uses such a pool to
 * store the <code>#GParamSpecs</code> of the properties all object types.
 */
public class ParamSpecPool extends io.github.jwharm.javagi.ResourceBase {

    public ParamSpecPool(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /**
     * Inserts a {@link org.gtk.gobject.ParamSpec} in the pool.
     */
    public void insert(ParamSpec pspec, Type ownerType) {
        gtk_h.g_param_spec_pool_insert(handle(), pspec.handle(), ownerType.getValue());
    }
    
    /**
     * Gets an {@link org.gtk.glib.List} of all <code>#GParamSpecs</code> owned by @owner_type in
     * the pool.
     */
    public org.gtk.glib.List listOwned(Type ownerType) {
        var RESULT = gtk_h.g_param_spec_pool_list_owned(handle(), ownerType.getValue());
        return new org.gtk.glib.List(References.get(RESULT, false));
    }
    
    /**
     * Looks up a {@link org.gtk.gobject.ParamSpec} in the pool.
     */
    public ParamSpec lookup(java.lang.String paramName, Type ownerType, boolean walkAncestors) {
        var RESULT = gtk_h.g_param_spec_pool_lookup(handle(), Interop.allocateNativeString(paramName).handle(), ownerType.getValue(), walkAncestors ? 1 : 0);
        return new ParamSpec(References.get(RESULT, false));
    }
    
    /**
     * Removes a {@link org.gtk.gobject.ParamSpec} from the pool.
     */
    public void remove(ParamSpec pspec) {
        gtk_h.g_param_spec_pool_remove(handle(), pspec.handle());
    }
    
    /**
     * Creates a new {@link org.gtk.gobject.ParamSpecPool} 
     * 
     * If @type_prefixing is <code>true</code>  lookups in the newly created pool will
     * allow to specify the owner as a colon-separated prefix of the
     * property name, like &<code>#34</code> GtkContainer:border-width&<code>#34</code> . This feature is
     * deprecated, so you should always set @type_prefixing to <code>false</code>
     */
    public static ParamSpecPool new_(boolean typePrefixing) {
        var RESULT = gtk_h.g_param_spec_pool_new(typePrefixing ? 1 : 0);
        return new ParamSpecPool(References.get(RESULT, true));
    }
    
}
