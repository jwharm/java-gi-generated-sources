package org.gtk.gio;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * Provides a base class for implementing asynchronous function results.
 * 
 * Asynchronous operations are broken up into two separate operations
 * which are chained together by a {@link org.gtk.gio.AsyncReadyCallback}  To begin
 * an asynchronous operation, provide a {@link org.gtk.gio.AsyncReadyCallback} to the
 * asynchronous function. This callback will be triggered when the
 * operation has completed, and must be run in a later iteration of
 * the {@link [thread-default main context]}{@link [g-main-context-push-thread-default]}
 * from where the operation was initiated. It will be passed a
 * {@link org.gtk.gio.AsyncResult} instance filled with the details of the operation&<code>#39</code> s
 * success or failure, the object the asynchronous function was
 * started for and any error codes returned. The asynchronous callback
 * function is then expected to call the corresponding &<code>#34</code> _finish()&<code>#34</code> 
 * function, passing the object the function was called for, the
 * {@link org.gtk.gio.AsyncResult} instance, and (optionally) an @error to grab any
 * error conditions that may have occurred.
 * 
 * The &<code>#34</code> _finish()&<code>#34</code>  function for an operation takes the generic result
 * (of type {@link org.gtk.gio.AsyncResult}  and returns the specific result that the
 * operation in question yields (e.g. a {@link org.gtk.gio.FileEnumerator} for a
 * &<code>#34</code> enumerate children&<code>#34</code>  operation). If the result or error status of the
 * operation is not needed, there is no need to call the &<code>#34</code> _finish()&<code>#34</code> 
 * function; GIO will take care of cleaning up the result and error
 * information after the {@link org.gtk.gio.AsyncReadyCallback} returns. You can pass
 * <code>null</code> for the {@link org.gtk.gio.AsyncReadyCallback} if you don&<code>#39</code> t need to take any
 * action at all after the operation completes. Applications may also
 * take a reference to the {@link org.gtk.gio.AsyncResult} and call &<code>#34</code> _finish()&<code>#34</code>  later;
 * however, the &<code>#34</code> _finish()&<code>#34</code>  function may be called at most once.
 * 
 * Example of a typical asynchronous operation flow:
 * |{@link [&<code>#60</code> !-- language=&<code>#34</code> C&<code>#34</code>  --&<code>#62</code> 
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
 *     g_printf (&<code>#34</code> Hurray!\\n&<code>#34</code> );
 *   else
 *     g_printf (&<code>#34</code> Uh oh!\\n&<code>#34</code> );
 * 
 *   ...
 * 
 * }
 * 
 * int main (int argc, void *argv[]})
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
 * the result is a {@link org.gtk.gio.IOErrorEnum<code>#CANCELLED</code>  error.
 * 
 * <code>#</code>  I/O Priority <code>#</code> {<code>#io</code> priority}
 * 
 * Many I/O-related asynchronous operations have a priority parameter,
 * which is used in certain cases to determine the order in which
 * operations are executed. They are not used to determine system-wide
 * I/O scheduling. Priorities are integers, with lower numbers indicating
 * higher priority. It is recommended to choose priorities between
 * <code>G_PRIORITY_LOW</code> and <code>G_PRIORITY_HIGH</code>  with <code>G_PRIORITY_DEFAULT</code> as a default.
 */
public interface AsyncResult extends io.github.jwharm.javagi.NativeAddress {

    /**
     * Gets the source object from a {@link org.gtk.gio.AsyncResult}
     */
    public default org.gtk.gobject.Object getSourceObject() {
        var RESULT = gtk_h.g_async_result_get_source_object(handle());
        return new org.gtk.gobject.Object(References.get(RESULT, true));
    }
    
    /**
     * Gets the user data from a {@link org.gtk.gio.AsyncResult}
     */
    public default jdk.incubator.foreign.MemoryAddress getUserData() {
        var RESULT = gtk_h.g_async_result_get_user_data(handle());
        return RESULT;
    }
    
    /**
     * Checks if @res has the given @source_tag (generally a function
     * pointer indicating the function @res was created by).
     */
    public default boolean isTagged(jdk.incubator.foreign.MemoryAddress sourceTag) {
        var RESULT = gtk_h.g_async_result_is_tagged(handle(), sourceTag);
        return (RESULT != 0);
    }
    
    /**
     * If @res is a {@link org.gtk.gio.SimpleAsyncResult}  this is equivalent to
     * g_simple_async_result_propagate_error(). Otherwise it returns
     * <code>false</code> 
     * 
     * This can be used for legacy error handling in async *_finish()
     * wrapper functions that traditionally handled {@link org.gtk.gio.SimpleAsyncResult} error returns themselves rather than calling into the virtual method.
     * This should not be used in new code; {@link org.gtk.gio.AsyncResult} errors that are
     * set by virtual methods should also be extracted by virtual methods,
     * to enable subclasses to chain up correctly.
     */
    public default boolean legacyPropagateError() throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_async_result_legacy_propagate_error(handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return (RESULT != 0);
    }
    
    class AsyncResultImpl extends org.gtk.gobject.Object implements AsyncResult {
        public AsyncResultImpl(io.github.jwharm.javagi.Reference reference) {
            super(reference);
        }
    }
}
