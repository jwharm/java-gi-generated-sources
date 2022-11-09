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
    
    static {
        GObject.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GParamSpecPool";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    private MemorySegment allocatedMemorySegment;
    
    public static ParamSpecPool allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        ParamSpecPool newInstance = new ParamSpecPool(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a ParamSpecPool proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public ParamSpecPool(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Inserts a {@link ParamSpec} in the pool.
     * @param pspec the {@link ParamSpec} to insert
     * @param ownerType a {@link Type} identifying the owner of {@code pspec}
     */
    public void insert(@NotNull org.gtk.gobject.ParamSpec pspec, @NotNull org.gtk.glib.Type ownerType) {
        java.util.Objects.requireNonNull(pspec, "Parameter 'pspec' must not be null");
        java.util.Objects.requireNonNull(ownerType, "Parameter 'ownerType' must not be null");
        try {
            DowncallHandles.g_param_spec_pool_insert.invokeExact(
                    handle(),
                    pspec.handle(),
                    ownerType.getValue().longValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Gets an array of all {@code GParamSpecs} owned by {@code owner_type} in
     * the pool.
     * @param ownerType the owner to look for
     * @param nPspecsP return location for the length of the returned array
     * @return a newly
     *          allocated array containing pointers to all {@code GParamSpecs}
     *          owned by {@code owner_type} in the pool
     */
    public @NotNull org.gtk.gobject.ParamSpec[] list(@NotNull org.gtk.glib.Type ownerType, Out<Integer> nPspecsP) {
        java.util.Objects.requireNonNull(ownerType, "Parameter 'ownerType' must not be null");
        java.util.Objects.requireNonNull(nPspecsP, "Parameter 'nPspecsP' must not be null");
        MemorySegment nPspecsPPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_INT);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_param_spec_pool_list.invokeExact(
                    handle(),
                    ownerType.getValue().longValue(),
                    (Addressable) nPspecsPPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        nPspecsP.set(nPspecsPPOINTER.get(ValueLayout.JAVA_INT, 0));
        org.gtk.gobject.ParamSpec[] resultARRAY = new org.gtk.gobject.ParamSpec[nPspecsP.get().intValue()];
        for (int I = 0; I < nPspecsP.get().intValue(); I++) {
            var OBJ = RESULT.get(ValueLayout.ADDRESS, I);
            resultARRAY[I] = new org.gtk.gobject.ParamSpec(OBJ, Ownership.CONTAINER);
        }
        return resultARRAY;
    }
    
    /**
     * Gets an {@link org.gtk.glib.List} of all {@code GParamSpecs} owned by {@code owner_type} in
     * the pool.
     * @param ownerType the owner to look for
     * @return a
     *          {@link org.gtk.glib.List} of all {@code GParamSpecs} owned by {@code owner_type} in
     *          the pool{@code GParamSpecs}.
     */
    public @NotNull org.gtk.glib.List listOwned(@NotNull org.gtk.glib.Type ownerType) {
        java.util.Objects.requireNonNull(ownerType, "Parameter 'ownerType' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_param_spec_pool_list_owned.invokeExact(
                    handle(),
                    ownerType.getValue().longValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.List(RESULT, Ownership.CONTAINER);
    }
    
    /**
     * Looks up a {@link ParamSpec} in the pool.
     * @param paramName the name to look for
     * @param ownerType the owner to look for
     * @param walkAncestors If {@code true}, also try to find a {@link ParamSpec} with {@code param_name}
     *  owned by an ancestor of {@code owner_type}.
     * @return The found {@link ParamSpec}, or {@code null} if no
     * matching {@link ParamSpec} was found.
     */
    public @Nullable org.gtk.gobject.ParamSpec lookup(@NotNull java.lang.String paramName, @NotNull org.gtk.glib.Type ownerType, boolean walkAncestors) {
        java.util.Objects.requireNonNull(paramName, "Parameter 'paramName' must not be null");
        java.util.Objects.requireNonNull(ownerType, "Parameter 'ownerType' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_param_spec_pool_lookup.invokeExact(
                    handle(),
                    Interop.allocateNativeString(paramName),
                    ownerType.getValue().longValue(),
                    walkAncestors ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gobject.ParamSpec(RESULT, Ownership.NONE);
    }
    
    /**
     * Removes a {@link ParamSpec} from the pool.
     * @param pspec the {@link ParamSpec} to remove
     */
    public void remove(@NotNull org.gtk.gobject.ParamSpec pspec) {
        java.util.Objects.requireNonNull(pspec, "Parameter 'pspec' must not be null");
        try {
            DowncallHandles.g_param_spec_pool_remove.invokeExact(
                    handle(),
                    pspec.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a new {@link ParamSpecPool}.
     * <p>
     * If {@code type_prefixing} is {@code true}, lookups in the newly created pool will
     * allow to specify the owner as a colon-separated prefix of the
     * property name, like "GtkContainer:border-width". This feature is
     * deprecated, so you should always set {@code type_prefixing} to {@code false}.
     * @param typePrefixing Whether the pool will support type-prefixed property names.
     * @return a newly allocated {@link ParamSpecPool}.
     */
    public static @NotNull org.gtk.gobject.ParamSpecPool new_(boolean typePrefixing) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_param_spec_pool_new.invokeExact(
                    typePrefixing ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gobject.ParamSpecPool(RESULT, Ownership.FULL);
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle g_param_spec_pool_insert = Interop.downcallHandle(
            "g_param_spec_pool_insert",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG),
            false
        );
        
        private static final MethodHandle g_param_spec_pool_list = Interop.downcallHandle(
            "g_param_spec_pool_list",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_param_spec_pool_list_owned = Interop.downcallHandle(
            "g_param_spec_pool_list_owned",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG),
            false
        );
        
        private static final MethodHandle g_param_spec_pool_lookup = Interop.downcallHandle(
            "g_param_spec_pool_lookup",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT),
            false
        );
        
        private static final MethodHandle g_param_spec_pool_remove = Interop.downcallHandle(
            "g_param_spec_pool_remove",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_param_spec_pool_new = Interop.downcallHandle(
            "g_param_spec_pool_new",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_INT),
            false
        );
    }
}
