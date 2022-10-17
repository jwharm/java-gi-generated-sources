package org.gtk.gobject;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

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
    
    private static final MethodHandle g_param_spec_pool_insert = Interop.downcallHandle(
        "g_param_spec_pool_insert",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG)
    );
    
    /**
     * Inserts a {@link ParamSpec} in the pool.
     */
    public @NotNull void insert(@NotNull ParamSpec pspec, @NotNull org.gtk.gobject.Type ownerType) {
        try {
            g_param_spec_pool_insert.invokeExact(handle(), pspec.handle(), ownerType.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle g_param_spec_pool_list = Interop.downcallHandle(
        "g_param_spec_pool_list",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets an array of all {@code GParamSpecs} owned by {@code owner_type} in
     * the pool.
     */
    public ParamSpec[] list(@NotNull org.gtk.gobject.Type ownerType, @NotNull Out<Integer> nPspecsP) {
        MemorySegment nPspecsPPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_INT);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_param_spec_pool_list.invokeExact(handle(), ownerType.getValue(), (Addressable) nPspecsPPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        nPspecsP.set(nPspecsPPOINTER.get(ValueLayout.JAVA_INT, 0));
        ParamSpec[] resultARRAY = new ParamSpec[nPspecsP.get().intValue()];
        for (int I = 0; I < nPspecsP.get().intValue(); I++) {
            var OBJ = RESULT.get(ValueLayout.ADDRESS, I);
            resultARRAY[I] = new ParamSpec(Refcounted.get(OBJ, false));
        }
        return resultARRAY;
    }
    
    private static final MethodHandle g_param_spec_pool_list_owned = Interop.downcallHandle(
        "g_param_spec_pool_list_owned",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG)
    );
    
    /**
     * Gets an {@link org.gtk.glib.List} of all {@code GParamSpecs} owned by {@code owner_type} in
     * the pool.
     */
    public @NotNull org.gtk.glib.List listOwned(@NotNull org.gtk.gobject.Type ownerType) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_param_spec_pool_list_owned.invokeExact(handle(), ownerType.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.List(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle g_param_spec_pool_lookup = Interop.downcallHandle(
        "g_param_spec_pool_lookup",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT)
    );
    
    /**
     * Looks up a {@link ParamSpec} in the pool.
     */
    public @Nullable ParamSpec lookup(@NotNull java.lang.String paramName, @NotNull org.gtk.gobject.Type ownerType, @NotNull boolean walkAncestors) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_param_spec_pool_lookup.invokeExact(handle(), Interop.allocateNativeString(paramName), ownerType.getValue(), walkAncestors ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new ParamSpec(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle g_param_spec_pool_remove = Interop.downcallHandle(
        "g_param_spec_pool_remove",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Removes a {@link ParamSpec} from the pool.
     */
    public @NotNull void remove(@NotNull ParamSpec pspec) {
        try {
            g_param_spec_pool_remove.invokeExact(handle(), pspec.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle g_param_spec_pool_new = Interop.downcallHandle(
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
    public static @NotNull ParamSpecPool new_(@NotNull boolean typePrefixing) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_param_spec_pool_new.invokeExact(typePrefixing ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new ParamSpecPool(Refcounted.get(RESULT, true));
    }
    
}
