package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@link Initable} is implemented by objects that can fail during
 * initialization. If an object implements this interface then
 * it must be initialized as the first thing after construction,
 * either via g_initable_init() or g_async_initable_init_async()
 * (the latter is only available if it also implements {@link AsyncInitable}).
 * <p>
 * If the object is not initialized, or initialization returns with an
 * error, then all operations on the object except g_object_ref() and
 * g_object_unref() are considered to be invalid, and have undefined
 * behaviour. They will often fail with g_critical() or g_warning(), but
 * this must not be relied on.
 * <p>
 * Users of objects implementing this are not intended to use
 * the interface method directly, instead it will be used automatically
 * in various ways. For C applications you generally just call
 * g_initable_new() directly, or indirectly via a foo_thing_new() wrapper.
 * This will call g_initable_init() under the cover, returning {@code null} and
 * setting a {@link org.gtk.glib.Error} on failure (at which point the instance is
 * unreferenced).
 * <p>
 * For bindings in languages where the native constructor supports
 * exceptions the binding could check for objects implementing {@code GInitable}
 * during normal construction and automatically initialize them, throwing
 * an exception on failure.
 * @version 2.22
 */
public interface Initable extends io.github.jwharm.javagi.Proxy {
    
    /**
     * Initializes the object implementing the interface.
     * <p>
     * This method is intended for language bindings. If writing in C,
     * g_initable_new() should typically be used instead.
     * <p>
     * The object must be initialized before any real use after initial
     * construction, either with this function or g_async_initable_init_async().
     * <p>
     * Implementations may also support cancellation. If {@code cancellable} is not {@code null},
     * then initialization can be cancelled by triggering the cancellable object
     * from another thread. If the operation was cancelled, the error
     * {@link IOErrorEnum#CANCELLED} will be returned. If {@code cancellable} is not {@code null} and
     * the object doesn't support cancellable initialization the error
     * {@link IOErrorEnum#NOT_SUPPORTED} will be returned.
     * <p>
     * If the object is not initialized, or initialization returns with an
     * error, then all operations on the object except g_object_ref() and
     * g_object_unref() are considered to be invalid, and have undefined
     * behaviour. See the [introduction][ginitable] for more details.
     * <p>
     * Callers should not assume that a class which implements {@link Initable} can be
     * initialized multiple times, unless the class explicitly documents itself as
     * supporting this. Generally, a class’ implementation of init() can assume
     * (and assert) that it will only be called once. Previously, this documentation
     * recommended all {@link Initable} implementations should be idempotent; that
     * recommendation was relaxed in GLib 2.54.
     * <p>
     * If a class explicitly supports being initialized multiple times, it is
     * recommended that the method is idempotent: multiple calls with the same
     * arguments should return the same results. Only the first call initializes
     * the object; further calls return the result of the first call.
     * <p>
     * One reason why a class might need to support idempotent initialization is if
     * it is designed to be used via the singleton pattern, with a
     * {@link org.gtk.gobject.ObjectClass}.constructor that sometimes returns an existing instance.
     * In this pattern, a caller would expect to be able to call g_initable_init()
     * on the result of g_object_new(), regardless of whether it is in fact a new
     * instance.
     * @param cancellable optional {@link Cancellable} object, {@code null} to ignore.
     * @return {@code true} if successful. If an error has occurred, this function will
     *     return {@code false} and set {@code error} appropriately if present.
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    default boolean init(@Nullable org.gtk.gio.Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        java.util.Objects.requireNonNullElse(cancellable, MemoryAddress.NULL);
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_initable_init.invokeExact(handle(), cancellable.handle(), (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT != 0;
    }
    
    /**
     * Helper function for constructing {@link Initable} object. This is
     * similar to g_object_new() but also initializes the object
     * and returns {@code null}, setting an error on failure.
     * @param objectType a {@link org.gtk.gobject.Type} supporting {@link Initable}.
     * @param cancellable optional {@link Cancellable} object, {@code null} to ignore.
     * @param error a {@link org.gtk.glib.Error} location to store the error occurring, or {@code null} to
     *    ignore.
     * @param firstPropertyName the name of the first property, or {@code null} if no
     *     properties
     * @return a newly allocated
     *      {@link org.gtk.gobject.Object}, or {@code null} on error
     */
    public static @NotNull org.gtk.gobject.Object new_(@NotNull org.gtk.glib.Type objectType, @Nullable org.gtk.gio.Cancellable cancellable, @NotNull PointerProxy<org.gtk.glib.Error> error, @Nullable java.lang.String firstPropertyName) {
        throw new UnsupportedOperationException("Operation not supported yet");
    }
    
    /**
     * Helper function for constructing {@link Initable} object. This is
     * similar to g_object_new_valist() but also initializes the object
     * and returns {@code null}, setting an error on failure.
     * @param objectType a {@link org.gtk.gobject.Type} supporting {@link Initable}.
     * @param firstPropertyName the name of the first property, followed by
     * the value, and other property value pairs, and ended by {@code null}.
     * @param varArgs The var args list generated from {@code first_property_name}.
     * @param cancellable optional {@link Cancellable} object, {@code null} to ignore.
     * @return a newly allocated
     *      {@link org.gtk.gobject.Object}, or {@code null} on error
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public static @NotNull org.gtk.gobject.Object newValist(@NotNull org.gtk.glib.Type objectType, @NotNull java.lang.String firstPropertyName, @NotNull VaList varArgs, @Nullable org.gtk.gio.Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        java.util.Objects.requireNonNull(objectType, "Parameter 'objectType' must not be null");
        java.util.Objects.requireNonNull(firstPropertyName, "Parameter 'firstPropertyName' must not be null");
        java.util.Objects.requireNonNull(varArgs, "Parameter 'varArgs' must not be null");
        java.util.Objects.requireNonNullElse(cancellable, MemoryAddress.NULL);
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_initable_new_valist.invokeExact(objectType.getValue(), Interop.allocateNativeString(firstPropertyName), varArgs, cancellable.handle(), (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return new org.gtk.gobject.Object(Refcounted.get(RESULT, true));
    }
    
    /**
     * Helper function for constructing {@link Initable} object. This is
     * similar to g_object_newv() but also initializes the object
     * and returns {@code null}, setting an error on failure.
     * @param objectType a {@link org.gtk.gobject.Type} supporting {@link Initable}.
     * @param nParameters the number of parameters in {@code parameters}
     * @param parameters the parameters to use to construct the object
     * @param cancellable optional {@link Cancellable} object, {@code null} to ignore.
     * @return a newly allocated
     *      {@link org.gtk.gobject.Object}, or {@code null} on error
     * @throws GErrorException See {@link org.gtk.glib.Error}
     * @deprecated Use g_object_new_with_properties() and
     * g_initable_init() instead. See {@link org.gtk.gobject.Parameter} for more information.
     */
    @Deprecated
    public static @NotNull org.gtk.gobject.Object newv(@NotNull org.gtk.glib.Type objectType, int nParameters, org.gtk.gobject.Parameter[] parameters, @Nullable org.gtk.gio.Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        java.util.Objects.requireNonNull(objectType, "Parameter 'objectType' must not be null");
        java.util.Objects.requireNonNull(parameters, "Parameter 'parameters' must not be null");
        java.util.Objects.requireNonNullElse(cancellable, MemoryAddress.NULL);
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_initable_newv.invokeExact(objectType.getValue(), nParameters, Interop.allocateNativeArray(parameters, false), cancellable.handle(), (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return new org.gtk.gobject.Object(Refcounted.get(RESULT, true));
    }
    
    @ApiStatus.Internal
    static class DowncallHandles {
        
        @ApiStatus.Internal
        static final MethodHandle g_initable_init = Interop.downcallHandle(
            "g_initable_init",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_initable_new = Interop.downcallHandle(
            "g_initable_new",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_initable_new_valist = Interop.downcallHandle(
            "g_initable_new_valist",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_initable_newv = Interop.downcallHandle(
            "g_initable_newv",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
    }
    
    class InitableImpl extends org.gtk.gobject.Object implements Initable {
        
        static {
            Gio.javagi$ensureInitialized();
        }
        
        public InitableImpl(io.github.jwharm.javagi.Refcounted ref) {
            super(ref);
        }
    }
}
