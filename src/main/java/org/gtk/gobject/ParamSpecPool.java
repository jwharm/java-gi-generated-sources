package org.gtk.gobject;

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

    public ParamSpecPool(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    static final MethodHandle g_param_spec_pool_insert = Interop.downcallHandle(
        "g_param_spec_pool_insert",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG)
    );
    
    /**
     * Inserts a {@link ParamSpec} in the pool.
     */
    public void insert(ParamSpec pspec, org.gtk.gobject.Type ownerType) {
        try {
            g_param_spec_pool_insert.invokeExact(handle(), pspec.handle(), ownerType.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_param_spec_pool_list = Interop.downcallHandle(
        "g_param_spec_pool_list",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets an array of all {@code GParamSpecs} owned by {@code owner_type} in
     * the pool.
     */
    public PointerProxy<ParamSpec> list(org.gtk.gobject.Type ownerType, PointerInteger nPspecsP) {
        try {
            var RESULT = (MemoryAddress) g_param_spec_pool_list.invokeExact(handle(), ownerType.getValue(), nPspecsP.handle());
            return new PointerProxy<ParamSpec>(RESULT, ParamSpec.class);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_param_spec_pool_list_owned = Interop.downcallHandle(
        "g_param_spec_pool_list_owned",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG)
    );
    
    /**
     * Gets an {@link org.gtk.glib.List} of all {@code GParamSpecs} owned by {@code owner_type} in
     * the pool.
     */
    public org.gtk.glib.List listOwned(org.gtk.gobject.Type ownerType) {
        try {
            var RESULT = (MemoryAddress) g_param_spec_pool_list_owned.invokeExact(handle(), ownerType.getValue());
            return new org.gtk.glib.List(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_param_spec_pool_lookup = Interop.downcallHandle(
        "g_param_spec_pool_lookup",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT)
    );
    
    /**
     * Looks up a {@link ParamSpec} in the pool.
     */
    public ParamSpec lookup(java.lang.String paramName, org.gtk.gobject.Type ownerType, boolean walkAncestors) {
        try {
            var RESULT = (MemoryAddress) g_param_spec_pool_lookup.invokeExact(handle(), Interop.allocateNativeString(paramName).handle(), ownerType.getValue(), walkAncestors ? 1 : 0);
            return new ParamSpec(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_param_spec_pool_remove = Interop.downcallHandle(
        "g_param_spec_pool_remove",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Removes a {@link ParamSpec} from the pool.
     */
    public void remove(ParamSpec pspec) {
        try {
            g_param_spec_pool_remove.invokeExact(handle(), pspec.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_param_spec_pool_new = Interop.downcallHandle(
        "g_param_spec_pool_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Creates a new {@link ParamSpecPool}.
     * <p>
     * If {@code type_prefixing} is {@code true}, lookups in the newly created pool will
     * allow to specify the owner as a colon-separated prefix of the
     * property name, like "GtkContainer:border-width". This feature is
     * deprecated, so you should always set {@code type_prefixing} to {@code false}.
     */
    public static ParamSpecPool new_(boolean typePrefixing) {
        try {
            var RESULT = (MemoryAddress) g_param_spec_pool_new.invokeExact(typePrefixing ? 1 : 0);
            return new ParamSpecPool(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
}
