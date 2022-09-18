package org.gtk.gio;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * This is the asynchronous version of {@link org.gtk.gio.Initable}  it behaves the same
 * in all ways except that initialization is asynchronous. For more details
 * see the descriptions on {@link org.gtk.gio.Initable} 
 * 
 * A class may implement both the {@link org.gtk.gio.Initable} and {@link org.gtk.gio.AsyncInitable} interfaces.
 * 
 * Users of objects implementing this are not intended to use the interface
 * method directly; instead it will be used automatically in various ways.
 * For C applications you generally just call g_async_initable_new_async()
 * directly, or indirectly via a foo_thing_new_async() wrapper. This will call
 * g_async_initable_init_async() under the cover, calling back with <code>null</code> and
 * a set <code>GError</code> on failure.
 * 
 * A typical implementation might look something like this:
 * 
 * |{@link [&<code>#60</code> !-- language=&<code>#34</code> C&<code>#34</code>  --&<code>#62</code> 
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
 *   self-&<code>#62</code> priv-&<code>#62</code> state = INITIALIZED;
 * 
 *   for (l = self-&<code>#62</code> priv-&<code>#62</code> init_results; l != NULL; l = l-&<code>#62</code> next)
 *     {
 *       GTask *task = l-&<code>#62</code> data;
 * 
 *       if (self-&<code>#62</code> priv-&<code>#62</code> success)
 *         g_task_return_boolean (task, TRUE);
 *       else
 *         g_task_return_new_error (task, ...);
 *       g_object_unref (task);
 *     }
 * 
 *   g_list_free (self-&<code>#62</code> priv-&<code>#62</code> init_results);
 *   self-&<code>#62</code> priv-&<code>#62</code> init_results = NULL;
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
 *   switch (self-&<code>#62</code> priv-&<code>#62</code> state)
 *     {
 *       case NOT_INITIALIZED:
 *         _foo_get_ready (self);
 *         self-&<code>#62</code> priv-&<code>#62</code> init_results = g_list_append (self-&<code>#62</code> priv-&<code>#62</code> init_results,
 *                                                   task);
 *         self-&<code>#62</code> priv-&<code>#62</code> state = INITIALIZING;
 *         break;
 *       case INITIALIZING:
 *         self-&<code>#62</code> priv-&<code>#62</code> init_results = g_list_append (self-&<code>#62</code> priv-&<code>#62</code> init_results,
 *                                                   task);
 *         break;
 *       case INITIALIZED:
 *         if (!self-&<code>#62</code> priv-&<code>#62</code> success)
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
 *   iface-&<code>#62</code> init_async = foo_init_async;
 *   iface-&<code>#62</code> init_finish = foo_init_finish;
 * }
 * ]}|
 */
public interface AsyncInitable extends io.github.jwharm.javagi.NativeAddress {

    /**
     * Starts asynchronous initialization of the object implementing the
     * interface. This must be done before any real use of the object after
     * initial construction. If the object also implements {@link org.gtk.gio.Initable} you can
     * optionally call g_initable_init() instead.
     * 
     * This method is intended for language bindings. If writing in C,
     * g_async_initable_new_async() should typically be used instead.
     * 
     * When the initialization is finished, @callback will be called. You can
     * then call g_async_initable_init_finish() to get the result of the
     * initialization.
     * 
     * Implementations may also support cancellation. If @cancellable is not
     * <code>null</code>  then initialization can be cancelled by triggering the cancellable
     * object from another thread. If the operation was cancelled, the error
     * {@link org.gtk.gio.IOErrorEnum<code>#CANCELLED</code>  will be returned. If @cancellable is not <code>null</code>  and
     * the object doesn&<code>#39</code> t support cancellable initialization, the error
     * {@link org.gtk.gio.IOErrorEnum<code>#NOT_SUPPORTED</code>  will be returned.
     * 
     * As with {@link org.gtk.gio.Initable}  if the object is not initialized, or initialization
     * returns with an error, then all operations on the object except
     * g_object_ref() and g_object_unref() are considered to be invalid, and
     * have undefined behaviour. They will often fail with g_critical() or
     * g_warning(), but this must not be relied on.
     * 
     * Callers should not assume that a class which implements {@link org.gtk.gio.AsyncInitable} can
     * be initialized multiple times; for more information, see g_initable_init().
     * If a class explicitly supports being initialized multiple times,
     * implementation requires yielding all subsequent calls to init_async() on the
     * results of the first call.
     * 
     * For classes that also support the {@link org.gtk.gio.Initable} interface, the default
     * implementation of this method will run the g_initable_init() function
     * in a thread, so if you want to support asynchronous initialization via
     * threads, just implement the {@link org.gtk.gio.AsyncInitable} interface without overriding
     * any interface methods.
     */
    public default void initAsync(int ioPriority, Cancellable cancellable, AsyncReadyCallback callback) {
        try {
            gtk_h.g_async_initable_init_async(handle(), ioPriority, cancellable.handle(), 
                    CLinker.systemCLinker().upcallStub(
                        MethodHandles.lookup().findStatic(JVMCallbacks.class, "cbAsyncReadyCallback",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    Interop.getAllocator().allocate(C_INT, Interop.registerCallback(callback.hashCode(), callback)));
        } catch (Exception e) {
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
     * Helper function for constructing {@link org.gtk.gio.AsyncInitable} object. This is
     * similar to g_object_new_valist() but also initializes the object
     * asynchronously.
     * 
     * When the initialization is finished, @callback will be called. You can
     * then call g_async_initable_new_finish() to get the new object and check
     * for any errors.
     */
    public static void newValistAsync(Type objectType, java.lang.String firstPropertyName, VaList varArgs, int ioPriority, Cancellable cancellable, AsyncReadyCallback callback) {
        try {
            gtk_h.g_async_initable_new_valist_async(objectType.getValue(), Interop.allocateNativeString(firstPropertyName).handle(), varArgs, ioPriority, cancellable.handle(), 
                    CLinker.systemCLinker().upcallStub(
                        MethodHandles.lookup().findStatic(JVMCallbacks.class, "cbAsyncReadyCallback",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    Interop.getAllocator().allocate(C_INT, Interop.registerCallback(callback.hashCode(), callback)));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    class AsyncInitableImpl extends org.gtk.gobject.Object implements AsyncInitable {
        public AsyncInitableImpl(io.github.jwharm.javagi.Reference reference) {
            super(reference);
        }
    }
}
