package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * This is the asynchronous version of {@link Initable}; it behaves the same
 * in all ways except that initialization is asynchronous. For more details
 * see the descriptions on {@link Initable}.
 * <p>
 * A class may implement both the {@link Initable} and {@link AsyncInitable} interfaces.
 * <p>
 * Users of objects implementing this are not intended to use the interface
 * method directly; instead it will be used automatically in various ways.
 * For C applications you generally just call g_async_initable_new_async()
 * directly, or indirectly via a foo_thing_new_async() wrapper. This will call
 * g_async_initable_init_async() under the cover, calling back with {@code null} and
 * a set {@code GError} on failure.
 * <p>
 * A typical implementation might look something like this:
 * <pre>{@code <!-- language="C" -->
 * enum {
 *    NOT_INITIALIZED,
 *    INITIALIZING,
 *    INITIALIZED
 * };
 * 
 * static void
 * _foo_ready_cb (Foo *self)
 * {
 *   GList *l;
 * 
 *   self->priv->state = INITIALIZED;
 * 
 *   for (l = self->priv->init_results; l != NULL; l = l->next)
 *     {
 *       GTask *task = l->data;
 * 
 *       if (self->priv->success)
 *         g_task_return_boolean (task, TRUE);
 *       else
 *         g_task_return_new_error (task, ...);
 *       g_object_unref (task);
 *     }
 * 
 *   g_list_free (self->priv->init_results);
 *   self->priv->init_results = NULL;
 * }
 * 
 * static void
 * foo_init_async (GAsyncInitable       *initable,
 *                 int                   io_priority,
 *                 GCancellable         *cancellable,
 *                 GAsyncReadyCallback   callback,
 *                 gpointer              user_data)
 * {
 *   Foo *self = FOO (initable);
 *   GTask *task;
 * 
 *   task = g_task_new (initable, cancellable, callback, user_data);
 *   g_task_set_name (task, G_STRFUNC);
 * 
 *   switch (self->priv->state)
 *     {
 *       case NOT_INITIALIZED:
 *         _foo_get_ready (self);
 *         self->priv->init_results = g_list_append (self->priv->init_results,
 *                                                   task);
 *         self->priv->state = INITIALIZING;
 *         break;
 *       case INITIALIZING:
 *         self->priv->init_results = g_list_append (self->priv->init_results,
 *                                                   task);
 *         break;
 *       case INITIALIZED:
 *         if (!self->priv->success)
 *           g_task_return_new_error (task, ...);
 *         else
 *           g_task_return_boolean (task, TRUE);
 *         g_object_unref (task);
 *         break;
 *     }
 * }
 * 
 * static gboolean
 * foo_init_finish (GAsyncInitable       *initable,
 *                  GAsyncResult         *result,
 *                  GError              **error)
 * {
 *   g_return_val_if_fail (g_task_is_valid (result, initable), FALSE);
 * 
 *   return g_task_propagate_boolean (G_TASK (result), error);
 * }
 * 
 * static void
 * foo_async_initable_iface_init (gpointer g_iface,
 *                                gpointer data)
 * {
 *   GAsyncInitableIface *iface = g_iface;
 * 
 *   iface->init_async = foo_init_async;
 *   iface->init_finish = foo_init_finish;
 * }
 * }</pre>
 * @version 2.22
 */
public interface AsyncInitable extends io.github.jwharm.javagi.Proxy {
    
    /**
     * Cast object to AsyncInitable if its GType is a (or inherits from) "GAsyncInitable".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code AsyncInitable} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GAsyncInitable", a ClassCastException will be thrown.
     */
    public static AsyncInitable castFrom(org.gtk.gobject.Object gobject) {
            return new AsyncInitableImpl(gobject.handle(), gobject.yieldOwnership());
    }
    
    /**
     * Starts asynchronous initialization of the object implementing the
     * interface. This must be done before any real use of the object after
     * initial construction. If the object also implements {@link Initable} you can
     * optionally call g_initable_init() instead.
     * <p>
     * This method is intended for language bindings. If writing in C,
     * g_async_initable_new_async() should typically be used instead.
     * <p>
     * When the initialization is finished, {@code callback} will be called. You can
     * then call g_async_initable_init_finish() to get the result of the
     * initialization.
     * <p>
     * Implementations may also support cancellation. If {@code cancellable} is not
     * {@code null}, then initialization can be cancelled by triggering the cancellable
     * object from another thread. If the operation was cancelled, the error
     * {@link IOErrorEnum#CANCELLED} will be returned. If {@code cancellable} is not {@code null}, and
     * the object doesn't support cancellable initialization, the error
     * {@link IOErrorEnum#NOT_SUPPORTED} will be returned.
     * <p>
     * As with {@link Initable}, if the object is not initialized, or initialization
     * returns with an error, then all operations on the object except
     * g_object_ref() and g_object_unref() are considered to be invalid, and
     * have undefined behaviour. They will often fail with g_critical() or
     * g_warning(), but this must not be relied on.
     * <p>
     * Callers should not assume that a class which implements {@link AsyncInitable} can
     * be initialized multiple times; for more information, see g_initable_init().
     * If a class explicitly supports being initialized multiple times,
     * implementation requires yielding all subsequent calls to init_async() on the
     * results of the first call.
     * <p>
     * For classes that also support the {@link Initable} interface, the default
     * implementation of this method will run the g_initable_init() function
     * in a thread, so if you want to support asynchronous initialization via
     * threads, just implement the {@link AsyncInitable} interface without overriding
     * any interface methods.
     * @param ioPriority the [I/O priority][io-priority] of the operation
     * @param cancellable optional {@link Cancellable} object, {@code null} to ignore.
     * @param callback a {@link AsyncReadyCallback} to call when the request is satisfied
     */
    default void initAsync(int ioPriority, @Nullable org.gtk.gio.Cancellable cancellable, @Nullable org.gtk.gio.AsyncReadyCallback callback) {
        try {
            DowncallHandles.g_async_initable_init_async.invokeExact(
                    handle(),
                    ioPriority,
                    (Addressable) (cancellable == null ? MemoryAddress.NULL : cancellable.handle()),
                    (Addressable) (callback == null ? MemoryAddress.NULL : (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Gio.Callbacks.class, "cbAsyncReadyCallback",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                        Interop.getScope())),
                    (Addressable) (callback == null ? MemoryAddress.NULL : Interop.registerCallback(callback)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Finishes asynchronous initialization and returns the result.
     * See g_async_initable_init_async().
     * @param res a {@link AsyncResult}.
     * @return {@code true} if successful. If an error has occurred, this function
     * will return {@code false} and set {@code error} appropriately if present.
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    default boolean initFinish(@NotNull org.gtk.gio.AsyncResult res) throws io.github.jwharm.javagi.GErrorException {
        java.util.Objects.requireNonNull(res, "Parameter 'res' must not be null");
        MemorySegment GERROR = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_async_initable_init_finish.invokeExact(
                    handle(),
                    res.handle(),
                    (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT != 0;
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static @NotNull org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.g_async_initable_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * Helper function for constructing {@link AsyncInitable} object. This is
     * similar to g_object_new() but also initializes the object asynchronously.
     * <p>
     * When the initialization is finished, {@code callback} will be called. You can
     * then call g_async_initable_new_finish() to get the new object and check
     * for any errors.
     * @param objectType a {@link org.gtk.gobject.Type} supporting {@link AsyncInitable}.
     * @param ioPriority the [I/O priority][io-priority] of the operation
     * @param cancellable optional {@link Cancellable} object, {@code null} to ignore.
     * @param callback a {@link AsyncReadyCallback} to call when the initialization is
     *     finished
     * @param firstPropertyName the name of the first property, or {@code null} if no
     *     properties
     * @param varargs the value of the first property, followed by other property
     *    value pairs, and ended by {@code null}.
     */
    public static void newAsync(@NotNull org.gtk.glib.Type objectType, int ioPriority, @Nullable org.gtk.gio.Cancellable cancellable, @Nullable org.gtk.gio.AsyncReadyCallback callback, @Nullable java.lang.String firstPropertyName, java.lang.Object... varargs) {
        java.util.Objects.requireNonNull(objectType, "Parameter 'objectType' must not be null");
        try {
            DowncallHandles.g_async_initable_new_async.invokeExact(
                    objectType.getValue().longValue(),
                    ioPriority,
                    (Addressable) (cancellable == null ? MemoryAddress.NULL : cancellable.handle()),
                    (Addressable) (callback == null ? MemoryAddress.NULL : (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Gio.Callbacks.class, "cbAsyncReadyCallback",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                        Interop.getScope())),
                    (Addressable) (callback == null ? MemoryAddress.NULL : Interop.registerCallback(callback)),
                    (Addressable) (firstPropertyName == null ? MemoryAddress.NULL : Interop.allocateNativeString(firstPropertyName)),
                    varargs);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Helper function for constructing {@link AsyncInitable} object. This is
     * similar to g_object_new_valist() but also initializes the object
     * asynchronously.
     * <p>
     * When the initialization is finished, {@code callback} will be called. You can
     * then call g_async_initable_new_finish() to get the new object and check
     * for any errors.
     * @param objectType a {@link org.gtk.gobject.Type} supporting {@link AsyncInitable}.
     * @param firstPropertyName the name of the first property, followed by
     * the value, and other property value pairs, and ended by {@code null}.
     * @param varArgs The var args list generated from {@code first_property_name}.
     * @param ioPriority the [I/O priority][io-priority] of the operation
     * @param cancellable optional {@link Cancellable} object, {@code null} to ignore.
     * @param callback a {@link AsyncReadyCallback} to call when the initialization is
     *     finished
     */
    public static void newValistAsync(@NotNull org.gtk.glib.Type objectType, @NotNull java.lang.String firstPropertyName, @NotNull VaList varArgs, int ioPriority, @Nullable org.gtk.gio.Cancellable cancellable, @Nullable org.gtk.gio.AsyncReadyCallback callback) {
        java.util.Objects.requireNonNull(objectType, "Parameter 'objectType' must not be null");
        java.util.Objects.requireNonNull(firstPropertyName, "Parameter 'firstPropertyName' must not be null");
        java.util.Objects.requireNonNull(varArgs, "Parameter 'varArgs' must not be null");
        try {
            DowncallHandles.g_async_initable_new_valist_async.invokeExact(
                    objectType.getValue().longValue(),
                    Interop.allocateNativeString(firstPropertyName),
                    varArgs,
                    ioPriority,
                    (Addressable) (cancellable == null ? MemoryAddress.NULL : cancellable.handle()),
                    (Addressable) (callback == null ? MemoryAddress.NULL : (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Gio.Callbacks.class, "cbAsyncReadyCallback",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                        Interop.getScope())),
                    (Addressable) (callback == null ? MemoryAddress.NULL : Interop.registerCallback(callback)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Helper function for constructing {@link AsyncInitable} object. This is
     * similar to g_object_newv() but also initializes the object asynchronously.
     * <p>
     * When the initialization is finished, {@code callback} will be called. You can
     * then call g_async_initable_new_finish() to get the new object and check
     * for any errors.
     * @param objectType a {@link org.gtk.gobject.Type} supporting {@link AsyncInitable}.
     * @param nParameters the number of parameters in {@code parameters}
     * @param parameters the parameters to use to construct the object
     * @param ioPriority the [I/O priority][io-priority] of the operation
     * @param cancellable optional {@link Cancellable} object, {@code null} to ignore.
     * @param callback a {@link AsyncReadyCallback} to call when the initialization is
     *     finished
     * @deprecated Use g_object_new_with_properties() and
     * g_async_initable_init_async() instead. See {@link org.gtk.gobject.Parameter} for more information.
     */
    @Deprecated
    public static void newvAsync(@NotNull org.gtk.glib.Type objectType, int nParameters, @NotNull org.gtk.gobject.Parameter parameters, int ioPriority, @Nullable org.gtk.gio.Cancellable cancellable, @Nullable org.gtk.gio.AsyncReadyCallback callback) {
        java.util.Objects.requireNonNull(objectType, "Parameter 'objectType' must not be null");
        java.util.Objects.requireNonNull(parameters, "Parameter 'parameters' must not be null");
        try {
            DowncallHandles.g_async_initable_newv_async.invokeExact(
                    objectType.getValue().longValue(),
                    nParameters,
                    parameters.handle(),
                    ioPriority,
                    (Addressable) (cancellable == null ? MemoryAddress.NULL : cancellable.handle()),
                    (Addressable) (callback == null ? MemoryAddress.NULL : (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Gio.Callbacks.class, "cbAsyncReadyCallback",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                        Interop.getScope())),
                    (Addressable) (callback == null ? MemoryAddress.NULL : Interop.registerCallback(callback)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @ApiStatus.Internal
    static class DowncallHandles {
        
        @ApiStatus.Internal
        static final MethodHandle g_async_initable_init_async = Interop.downcallHandle(
            "g_async_initable_init_async",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_async_initable_init_finish = Interop.downcallHandle(
            "g_async_initable_init_finish",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_async_initable_get_type = Interop.downcallHandle(
            "g_async_initable_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_async_initable_new_async = Interop.downcallHandle(
            "g_async_initable_new_async",
            FunctionDescriptor.ofVoid(Interop.valueLayout.C_LONG, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            true
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_async_initable_new_valist_async = Interop.downcallHandle(
            "g_async_initable_new_valist_async",
            FunctionDescriptor.ofVoid(Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_async_initable_newv_async = Interop.downcallHandle(
            "g_async_initable_newv_async",
            FunctionDescriptor.ofVoid(Interop.valueLayout.C_LONG, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
    }
    
    class AsyncInitableImpl extends org.gtk.gobject.Object implements AsyncInitable {
        
        static {
            Gio.javagi$ensureInitialized();
        }
        
        public AsyncInitableImpl(Addressable address, Ownership ownership) {
            super(address, ownership);
        }
    }
}
