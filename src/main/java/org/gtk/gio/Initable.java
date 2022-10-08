package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

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
 */
public interface Initable extends io.github.jwharm.javagi.Proxy {

    static final MethodHandle g_initable_init = Interop.downcallHandle(
        "g_initable_init",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
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
     */
    public default boolean init(Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            var RESULT = (int) g_initable_init.invokeExact(handle(), cancellable.handle(), (Addressable) GERROR);
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_initable_new_valist = Interop.downcallHandle(
        "g_initable_new_valist",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Helper function for constructing {@link Initable} object. This is
     * similar to g_object_new_valist() but also initializes the object
     * and returns {@code null}, setting an error on failure.
     */
    public static org.gtk.gobject.Object newValist(org.gtk.gobject.Type objectType, java.lang.String firstPropertyName, VaList varArgs, Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            var RESULT = (MemoryAddress) g_initable_new_valist.invokeExact(objectType.getValue(), Interop.allocateNativeString(firstPropertyName).handle(), varArgs, cancellable.handle(), (Addressable) GERROR);
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return new org.gtk.gobject.Object(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    class InitableImpl extends org.gtk.gobject.Object implements Initable {
        public InitableImpl(io.github.jwharm.javagi.Refcounted ref) {
            super(ref);
        }
    }
}
