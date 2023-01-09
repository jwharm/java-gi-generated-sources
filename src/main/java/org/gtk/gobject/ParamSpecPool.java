package org.gtk.gobject;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A {@link ParamSpecPool} maintains a collection of {@code GParamSpecs} which can be
 * quickly accessed by owner and name.
 * <p>
 * The implementation of the {@link GObject} property system uses such a pool to
 * store the {@code GParamSpecs} of the properties all object types.
 */
public class ParamSpecPool extends Struct {
    
    static {
        GObjects.javagi$ensureInitialized();
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
    
    /**
     * Allocate a new {@link ParamSpecPool}
     * @return A new, uninitialized @{link ParamSpecPool}
     */
    public static ParamSpecPool allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        ParamSpecPool newInstance = new ParamSpecPool(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a ParamSpecPool proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected ParamSpecPool(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, ParamSpecPool> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new ParamSpecPool(input);
    
    /**
     * Inserts a {@link ParamSpec} in the pool.
     * @param pspec the {@link ParamSpec} to insert
     * @param ownerType a {@link org.gtk.glib.Type} identifying the owner of {@code pspec}
     */
    public void insert(org.gtk.gobject.ParamSpec pspec, org.gtk.glib.Type ownerType) {
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
    public org.gtk.gobject.ParamSpec[] list(org.gtk.glib.Type ownerType, Out<Integer> nPspecsP) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment nPspecsPPOINTER = SCOPE.allocate(Interop.valueLayout.C_INT);
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.g_param_spec_pool_list.invokeExact(
                        handle(),
                        ownerType.getValue().longValue(),
                        (Addressable) nPspecsPPOINTER.address());
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
                    nPspecsP.set(nPspecsPPOINTER.get(Interop.valueLayout.C_INT, 0));
            org.gtk.gobject.ParamSpec[] resultARRAY = new org.gtk.gobject.ParamSpec[nPspecsP.get().intValue()];
            for (int I = 0; I < nPspecsP.get().intValue(); I++) {
                var OBJ = RESULT.get(Interop.valueLayout.ADDRESS, I);
                resultARRAY[I] = (org.gtk.gobject.ParamSpec) Interop.register(OBJ, org.gtk.gobject.ParamSpec.fromAddress).marshal(OBJ, null);
            }
            return resultARRAY;
        }
    }
    
    /**
     * Gets an {@link org.gtk.glib.List} of all {@code GParamSpecs} owned by {@code owner_type} in
     * the pool.
     * @param ownerType the owner to look for
     * @return a
     *          {@link org.gtk.glib.List} of all {@code GParamSpecs} owned by {@code owner_type} in
     *          the pool{@code GParamSpecs}.
     */
    public org.gtk.glib.List listOwned(org.gtk.glib.Type ownerType) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_param_spec_pool_list_owned.invokeExact(
                    handle(),
                    ownerType.getValue().longValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.glib.List.fromAddress.marshal(RESULT, null);
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
    public @Nullable org.gtk.gobject.ParamSpec lookup(java.lang.String paramName, org.gtk.glib.Type ownerType, boolean walkAncestors) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.g_param_spec_pool_lookup.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(paramName, SCOPE),
                        ownerType.getValue().longValue(),
                        Marshal.booleanToInteger.marshal(walkAncestors, null).intValue());
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return (org.gtk.gobject.ParamSpec) Interop.register(RESULT, org.gtk.gobject.ParamSpec.fromAddress).marshal(RESULT, null);
        }
    }
    
    /**
     * Removes a {@link ParamSpec} from the pool.
     * @param pspec the {@link ParamSpec} to remove
     */
    public void remove(org.gtk.gobject.ParamSpec pspec) {
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
    public static org.gtk.gobject.ParamSpecPool new_(boolean typePrefixing) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_param_spec_pool_new.invokeExact(Marshal.booleanToInteger.marshal(typePrefixing, null).intValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        var OBJECT = org.gtk.gobject.ParamSpecPool.fromAddress.marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle g_param_spec_pool_insert = Interop.downcallHandle(
                "g_param_spec_pool_insert",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG),
                false
        );
        
        private static final MethodHandle g_param_spec_pool_list = Interop.downcallHandle(
                "g_param_spec_pool_list",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_param_spec_pool_list_owned = Interop.downcallHandle(
                "g_param_spec_pool_list_owned",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG),
                false
        );
        
        private static final MethodHandle g_param_spec_pool_lookup = Interop.downcallHandle(
                "g_param_spec_pool_lookup",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle g_param_spec_pool_remove = Interop.downcallHandle(
                "g_param_spec_pool_remove",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_param_spec_pool_new = Interop.downcallHandle(
                "g_param_spec_pool_new",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
    }
}
