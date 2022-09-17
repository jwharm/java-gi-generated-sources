package org.gtk.gio;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * As of GLib 2.46, #GSimpleAsyncResult is deprecated in favor of
 * #GTask, which provides a simpler API.
 * 
 * #GSimpleAsyncResult implements #GAsyncResult.
 * 
 * GSimpleAsyncResult handles #GAsyncReadyCallbacks, error
 * reporting, operation cancellation and the final state of an operation,
 * completely transparent to the application. Results can be returned
 * as a pointer e.g. for functions that return data that is collected
 * asynchronously, a boolean value for checking the success or failure
 * of an operation, or a #gssize for operations which return the number
 * of bytes modified by the operation; all of the simple return cases
 * are covered.
 * 
 * Most of the time, an application will not need to know of the details
 * of this API; it is handled transparently, and any necessary operations
 * are handled by #GAsyncResult&#39;s interface. However, if implementing a
 * new GIO module, for writing language bindings, or for complex
 * applications that need better control of how asynchronous operations
 * are completed, it is important to understand this functionality.
 * 
 * GSimpleAsyncResults are tagged with the calling function to ensure
 * that asynchronous functions and their finishing functions are used
 * together correctly.
 * 
 * To create a new #GSimpleAsyncResult, call g_simple_async_result_new().
 * If the result needs to be created for a #GError, use
 * g_simple_async_result_new_from_error() or
 * g_simple_async_result_new_take_error(). If a #GError is not available
 * (e.g. the asynchronous operation&#39;s doesn&#39;t take a #GError argument),
 * but the result still needs to be created for an error condition, use
 * g_simple_async_result_new_error() (or g_simple_async_result_set_error_va()
 * if your application or binding requires passing a variable argument list
 * directly), and the error can then be propagated through the use of
 * g_simple_async_result_propagate_error().
 * 
 * An asynchronous operation can be made to ignore a cancellation event by
 * calling g_simple_async_result_set_handle_cancellation() with a
 * #GSimpleAsyncResult for the operation and <code>FALSE.</code> This is useful for
 * operations that are dangerous to cancel, such as close (which would
 * cause a leak if cancelled before being run).
 * 
 * GSimpleAsyncResult can integrate into GLib&#39;s event loop, #GMainLoop,
 * or it can use #GThreads.
 * g_simple_async_result_complete() will finish an I/O task directly
 * from the point where it is called. g_simple_async_result_complete_in_idle()
 * will finish it from an idle handler in the
 * {@link [thread-default main context]}{@link [g-main-context-push-thread-default]}
 * where the #GSimpleAsyncResult was created.
 * g_simple_async_result_run_in_thread() will run the job in a
 * separate thread and then use
 * g_simple_async_result_complete_in_idle() to deliver the result.
 * 
 * To set the results of an asynchronous function,
 * g_simple_async_result_set_op_res_gpointer(),
 * g_simple_async_result_set_op_res_gboolean(), and
 * g_simple_async_result_set_op_res_gssize()
 * are provided, setting the operation&#39;s result to a gpointer, gboolean, or
 * gssize, respectively.
 * 
 * Likewise, to get the result of an asynchronous function,
 * g_simple_async_result_get_op_res_gpointer(),
 * g_simple_async_result_get_op_res_gboolean(), and
 * g_simple_async_result_get_op_res_gssize() are
 * provided, getting the operation&#39;s result as a gpointer, gboolean, and
 * gssize, respectively.
 * 
 * For the details of the requirements implementations must respect, see
 * #GAsyncResult.  A typical implementation of an asynchronous operation
 * using GSimpleAsyncResult looks something like this:
 * 
 * |{@link [&#60;!-- language=&#34;C&#34; --&#62;
 * static void
 * baked_cb (Cake    *cake,
 *           gpointer user_data)
 * {
 *   // In this example, this callback is not given a reference to the cake,
 *   // so the GSimpleAsyncResult has to take a reference to it.
 *   GSimpleAsyncResult *result = user_data;
 * 
 *   if (cake == NULL)
 *     g_simple_async_result_set_error (result,
 *                                      BAKER_ERRORS,
 *                                      BAKER_ERROR_NO_FLOUR,
 *                                      &#34;Go to the supermarket&#34;);
 *   else
 *     g_simple_async_result_set_op_res_gpointer (result,
 *                                                g_object_ref (cake),
 *                                                g_object_unref);
 * 
 * 
 *   // In this example, we assume that baked_cb is called as a callback from
 *   // the mainloop, so it&#39;s safe to complete the operation synchronously here.
 *   // If, however, _baker_prepare_cake () might call its callback without
 *   // first returning to the mainloop &#8212; inadvisable, but some APIs do so &#8212;
 *   // we would need to use g_simple_async_result_complete_in_idle().
 *   g_simple_async_result_complete (result);
 *   g_object_unref (result);
 * }
 * 
 * void
 * baker_bake_cake_async (Baker              *self,
 *                        guint               radius,
 *                        GAsyncReadyCallback callback,
 *                        gpointer            user_data)
 * {
 *   GSimpleAsyncResult *simple;
 *   Cake               *cake;
 * 
 *   if (radius &#60; 3)
 *     {
 *       g_simple_async_report_error_in_idle (G_OBJECT (self),
 *                                            callback,
 *                                            user_data,
 *                                            BAKER_ERRORS,
 *                                            BAKER_ERROR_TOO_SMALL,
 *                                            &#34;<code>ucm</code> radius cakes are silly&#34;,
 *                                            radius);
 *       return;
 *     }
 * 
 *   simple = g_simple_async_result_new (G_OBJECT (self),
 *                                       callback,
 *                                       user_data,
 *                                       baker_bake_cake_async);
 *   cake = _baker_get_cached_cake (self, radius);
 * 
 *   if (cake != NULL)
 *     {
 *       g_simple_async_result_set_op_res_gpointer (simple,
 *                                                  g_object_ref (cake),
 *                                                  g_object_unref);
 *       g_simple_async_result_complete_in_idle (simple);
 *       g_object_unref (simple);
 *       // Drop the reference returned by _baker_get_cached_cake();
 *       // the GSimpleAsyncResult has taken its own reference.
 *       g_object_unref (cake);
 *       return;
 *     }
 * 
 *   _baker_prepare_cake (self, radius, baked_cb, simple);
 * }
 * 
 * Cake *
 * baker_bake_cake_finish (Baker        *self,
 *                         GAsyncResult *result,
 *                         GError      **error)
 * {
 *   GSimpleAsyncResult *simple;
 *   Cake               *cake;
 * 
 *   g_return_val_if_fail (g_simple_async_result_is_valid (result,
 *                                                         G_OBJECT (self),
 *                                                         baker_bake_cake_async),
 *                         NULL);
 * 
 *   simple = (GSimpleAsyncResult *) result;
 * 
 *   if (g_simple_async_result_propagate_error (simple, error))
 *     return NULL;
 * 
 *   cake = CAKE (g_simple_async_result_get_op_res_gpointer (simple));
 *   return g_object_ref (cake);
 * }
 * ]}|
 */
public class SimpleAsyncResult extends org.gtk.gobject.Object implements AsyncResult {

    public SimpleAsyncResult(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to SimpleAsyncResult */
    public static SimpleAsyncResult castFrom(org.gtk.gobject.Object gobject) {
        return new SimpleAsyncResult(gobject.getReference());
    }
    
    private static Reference constructNewFromError(org.gtk.gobject.Object sourceObject, AsyncReadyCallback callback, org.gtk.glib.Error error) {
        try {
            Reference RESULT = References.get(gtk_h.g_simple_async_result_new_from_error(sourceObject.handle(), 
                    CLinker.systemCLinker().upcallStub(
                        MethodHandles.lookup().findStatic(JVMCallbacks.class, "cbAsyncReadyCallback",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    Interop.getAllocator().allocate(C_INT, Interop.registerCallback(callback.hashCode(), callback)), error.handle()), true);
            return RESULT;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Creates a #GSimpleAsyncResult from an error condition.
     */
    public static SimpleAsyncResult newFromError(org.gtk.gobject.Object sourceObject, AsyncReadyCallback callback, org.gtk.glib.Error error) {
        return new SimpleAsyncResult(constructNewFromError(sourceObject, callback, error));
    }
    
    private static Reference constructNewTakeError(org.gtk.gobject.Object sourceObject, AsyncReadyCallback callback, org.gtk.glib.Error error) {
        try {
            Reference RESULT = References.get(gtk_h.g_simple_async_result_new_take_error(sourceObject.handle(), 
                    CLinker.systemCLinker().upcallStub(
                        MethodHandles.lookup().findStatic(JVMCallbacks.class, "cbAsyncReadyCallback",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    Interop.getAllocator().allocate(C_INT, Interop.registerCallback(callback.hashCode(), callback)), error.handle()), true);
            return RESULT;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Creates a #GSimpleAsyncResult from an error condition, and takes over the
     * caller&#39;s ownership of @error, so the caller does not need to free it anymore.
     */
    public static SimpleAsyncResult newTakeError(org.gtk.gobject.Object sourceObject, AsyncReadyCallback callback, org.gtk.glib.Error error) {
        return new SimpleAsyncResult(constructNewTakeError(sourceObject, callback, error));
    }
    
}
