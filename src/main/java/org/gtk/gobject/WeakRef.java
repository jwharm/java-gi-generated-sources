package org.gtk.gobject;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A structure containing a weak reference to a {@link GObject}.
 * <p>
 * A {@code GWeakRef} can either be empty (i.e. point to {@code null}), or point to an
 * object for as long as at least one "strong" reference to that object
 * exists. Before the object's {@link ObjectClass}.dispose method is called,
 * every {@link WeakRef} associated with becomes empty (i.e. points to {@code null}).
 * <p>
 * Like {@link Value}, {@link WeakRef} can be statically allocated, stack- or
 * heap-allocated, or embedded in larger structures.
 * <p>
 * Unlike g_object_weak_ref() and g_object_add_weak_pointer(), this weak
 * reference is thread-safe: converting a weak pointer to a reference is
 * atomic with respect to invalidation of weak pointers to destroyed
 * objects.
 * <p>
 * If the object's {@link ObjectClass}.dispose method results in additional
 * references to the object being held (‘re-referencing’), any {@code GWeakRefs} taken
 * before it was disposed will continue to point to {@code null}.  Any {@code GWeakRefs} taken
 * during disposal and after re-referencing, or after disposal has returned due
 * to the re-referencing, will continue to point to the object until its refcount
 * goes back to zero, at which point they too will be invalidated.
 * <p>
 * It is invalid to take a {@link WeakRef} on an object during {@link ObjectClass}.dispose
 * without first having or creating a strong reference to the object.
 */
public class WeakRef extends Struct {
    
    static {
        GObjects.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GWeakRef";
    
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
     * Allocate a new {@link WeakRef}
     * @return A new, uninitialized @{link WeakRef}
     */
    public static WeakRef allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        WeakRef newInstance = new WeakRef(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a WeakRef proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected WeakRef(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, WeakRef> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new WeakRef(input);
    
    /**
     * Frees resources associated with a non-statically-allocated {@link WeakRef}.
     * After this call, the {@link WeakRef} is left in an undefined state.
     * <p>
     * You should only call this on a {@link WeakRef} that previously had
     * g_weak_ref_init() called on it.
     */
    public void clear() {
        try {
            DowncallHandles.g_weak_ref_clear.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        this.yieldOwnership();
    }
    
    /**
     * If {@code weak_ref} is not empty, atomically acquire a strong
     * reference to the object it points to, and return that reference.
     * <p>
     * This function is needed because of the potential race between taking
     * the pointer value and g_object_ref() on it, if the object was losing
     * its last reference at the same time in a different thread.
     * <p>
     * The caller should release the resulting reference in the usual way,
     * by using g_object_unref().
     * @return the object pointed to
     *     by {@code weak_ref}, or {@code null} if it was empty
     */
    public org.gtk.gobject.GObject get() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_weak_ref_get.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        this.yieldOwnership();
        var OBJECT = (org.gtk.gobject.GObject) Interop.register(RESULT, org.gtk.gobject.GObject.fromAddress).marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    /**
     * Initialise a non-statically-allocated {@link WeakRef}.
     * <p>
     * This function also calls g_weak_ref_set() with {@code object} on the
     * freshly-initialised weak reference.
     * <p>
     * This function should always be matched with a call to
     * g_weak_ref_clear().  It is not necessary to use this function for a
     * {@link WeakRef} in static storage because it will already be
     * properly initialised.  Just use g_weak_ref_set() directly.
     * @param object a {@link GObject} or {@code null}
     */
    public void init(@Nullable org.gtk.gobject.GObject object) {
        try {
            DowncallHandles.g_weak_ref_init.invokeExact(
                    handle(),
                    (Addressable) (object == null ? MemoryAddress.NULL : object.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        this.yieldOwnership();
    }
    
    /**
     * Change the object to which {@code weak_ref} points, or set it to
     * {@code null}.
     * <p>
     * You must own a strong reference on {@code object} while calling this
     * function.
     * @param object a {@link GObject} or {@code null}
     */
    public void set(@Nullable org.gtk.gobject.GObject object) {
        try {
            DowncallHandles.g_weak_ref_set.invokeExact(
                    handle(),
                    (Addressable) (object == null ? MemoryAddress.NULL : object.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle g_weak_ref_clear = Interop.downcallHandle(
                "g_weak_ref_clear",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_weak_ref_get = Interop.downcallHandle(
                "g_weak_ref_get",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_weak_ref_init = Interop.downcallHandle(
                "g_weak_ref_init",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_weak_ref_set = Interop.downcallHandle(
                "g_weak_ref_set",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
    }
}
