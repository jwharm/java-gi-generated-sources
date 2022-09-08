package org.gtk.gio;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * Provides a base class for implementing asynchronous function results.
 * 
 * Asynchronous operations are broken up into two separate operations
 * which are chained together by a #GAsyncReadyCallback. To begin
 * an asynchronous operation, provide a #GAsyncReadyCallback to the
 * asynchronous function. This callback will be triggered when the
 * operation has completed, and must be run in a later iteration of
 * the [thread-default main context][g-main-context-push-thread-default]
 * from where the operation was initiated. It will be passed a
 * #GAsyncResult instance filled with the details of the operation's
 * success or failure, the object the asynchronous function was
 * started for and any error codes returned. The asynchronous callback
 * function is then expected to call the corresponding "_finish()"
 * function, passing the object the function was called for, the
 * #GAsyncResult instance, and (optionally) an @error to grab any
 * error conditions that may have occurred.
 * 
 * The "_finish()" function for an operation takes the generic result
 * (of type #GAsyncResult) and returns the specific result that the
 * operation in question yields (e.g. a #GFileEnumerator for a
 * "enumerate children" operation). If the result or error status of the
 * operation is not needed, there is no need to call the "_finish()"
 * function; GIO will take care of cleaning up the result and error
 * information after the #GAsyncReadyCallback returns. You can pass
 * %NULL for the #GAsyncReadyCallback if you don't need to take any
 * action at all after the operation completes. Applications may also
 * take a reference to the #GAsyncResult and call "_finish()" later;
 * however, the "_finish()" function may be called at most once.
 * 
 * Example of a typical asynchronous operation flow:
 * |[<!-- language="C" -->
 * void _theoretical_frobnitz_async (Theoretical         *t,
 *                                   GCancellable        *c,
 *                                   GAsyncReadyCallback  cb,
 *                                   gpointer             u);
 * 
 * gboolean _theoretical_frobnitz_finish (Theoretical   *t,
 *                                        GAsyncResult  *res,
 *                                        GError       **e);
 * 
 * static void
 * frobnitz_result_func (GObject      *source_object,
 * 		 GAsyncResult *res,
 * 		 gpointer      user_data)
 * {
 *   gboolean success = FALSE;
 * 
 *   success = _theoretical_frobnitz_finish (source_object, res, NULL);
 * 
 *   if (success)
 *     g_printf ("Hurray!\\n");
 *   else
 *     g_printf ("Uh oh!\\n");
 * 
 *   ...
 * 
 * }
 * 
 * int main (int argc, void *argv[])
 * {
 *    ...
 * 
 *    _theoretical_frobnitz_async (theoretical_data,
 *                                 NULL,
 *                                 frobnitz_result_func,
 *                                 NULL);
 * 
 *    ...
 * }
 * ]|
 * 
 * The callback for an asynchronous operation is called only once, and is
 * always called, even in the case of a cancelled operation. On cancellation
 * the result is a %G_IO_ERROR_CANCELLED error.
 * 
 * ## I/O Priority # {#io-priority}
 * 
 * Many I/O-related asynchronous operations have a priority parameter,
 * which is used in certain cases to determine the order in which
 * operations are executed. They are not used to determine system-wide
 * I/O scheduling. Priorities are integers, with lower numbers indicating
 * higher priority. It is recommended to choose priorities between
 * %G_PRIORITY_LOW and %G_PRIORITY_HIGH, with %G_PRIORITY_DEFAULT
 * as a default.
 */
public interface AsyncResult extends io.github.jwharm.javagi.interop.NativeAddress {

    /**
     * Gets the source object from a #GAsyncResult.
     */
    public default org.gtk.gobject.Object getSourceObject() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_async_result_get_source_object(HANDLE());
        return new org.gtk.gobject.Object(References.get(RESULT, true));
    }
    
    /**
     * Gets the user data from a #GAsyncResult.
     */
    public default jdk.incubator.foreign.MemoryAddress getUserData() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_async_result_get_user_data(HANDLE());
        return RESULT;
    }
    
    /**
     * Checks if @res has the given @source_tag (generally a function
     * pointer indicating the function @res was created by).
     */
    public default boolean isTagged(jdk.incubator.foreign.MemoryAddress sourceTag) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_async_result_is_tagged(HANDLE(), sourceTag);
        return (RESULT != 0);
    }
    
    /**
     * If @res is a #GSimpleAsyncResult, this is equivalent to
     * g_simple_async_result_propagate_error(). Otherwise it returns
     * %FALSE.
     * 
     * This can be used for legacy error handling in async *_finish()
     * wrapper functions that traditionally handled #GSimpleAsyncResult
     * error returns themselves rather than calling into the virtual method.
     * This should not be used in new code; #GAsyncResult errors that are
     * set by virtual methods should also be extracted by virtual methods,
     * to enable subclasses to chain up correctly.
     */
    public default boolean legacyPropagateError() throws io.github.jwharm.javagi.interop.GErrorException {
        MemorySegment GERROR = io.github.jwharm.javagi.interop.jextract.GError.allocate(Interop.getScope());
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_async_result_legacy_propagate_error(HANDLE(), GERROR);
        if (! java.util.Objects.equals(MemoryAddress.NULL, GERROR)) {
            throw new io.github.jwharm.javagi.interop.GErrorException(GERROR);
        }
        return (RESULT != 0);
    }
    
    class AsyncResultImpl extends org.gtk.gobject.Object implements AsyncResult {
        public AsyncResultImpl(io.github.jwharm.javagi.interop.Reference reference) {
            super(reference);
        }
    }
}
