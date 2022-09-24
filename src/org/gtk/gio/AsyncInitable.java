package org.gtk.gio;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

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
 * <p>
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
 */
public interface AsyncInitable extends io.github.jwharm.javagi.NativeAddress {

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
     */
    public default void initAsync(int ioPriority, Cancellable cancellable, AsyncReadyCallback callback) {
        try {
            gtk_h.g_async_initable_init_async(handle(), ioPriority, cancellable.handle(), 
                    Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Gio.class, "__cbAsyncReadyCallback",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    Interop.getAllocator().allocate(C_INT, Interop.registerCallback(callback.hashCode(), callback)));
        } catch (IllegalAccessException | NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Finishes asynchronous initialization and returns the result.
     * See g_async_initable_init_async().
     */
    public default boolean initFinish(AsyncResult res) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_async_initable_init_finish(handle(), res.handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return (RESULT != 0);
    }
    
    /**
     * Helper function for constructing {@link AsyncInitable} object. This is
     * similar to g_object_new_valist() but also initializes the object
     * asynchronously.
     * <p>
     * When the initialization is finished, {@code callback} will be called. You can
     * then call g_async_initable_new_finish() to get the new object and check
     * for any errors.
     */
    public static void newValistAsync(Type objectType, java.lang.String firstPropertyName, VaList varArgs, int ioPriority, Cancellable cancellable, AsyncReadyCallback callback) {
        try {
            gtk_h.g_async_initable_new_valist_async(objectType.getValue(), Interop.allocateNativeString(firstPropertyName).handle(), varArgs, ioPriority, cancellable.handle(), 
                    Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Gio.class, "__cbAsyncReadyCallback",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    Interop.getAllocator().allocate(C_INT, Interop.registerCallback(callback.hashCode(), callback)));
        } catch (IllegalAccessException | NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
    
    class AsyncInitableImpl extends org.gtk.gobject.Object implements AsyncInitable {
        public AsyncInitableImpl(io.github.jwharm.javagi.Reference reference) {
            super(reference);
        }
    }
}
