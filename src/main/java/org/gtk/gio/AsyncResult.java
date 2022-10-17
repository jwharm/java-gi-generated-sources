package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Provides a base class for implementing asynchronous function results.
 * <p>
 * Asynchronous operations are broken up into two separate operations
 * which are chained together by a {@link AsyncReadyCallback}. To begin
 * an asynchronous operation, provide a {@link AsyncReadyCallback} to the
 * asynchronous function. This callback will be triggered when the
 * operation has completed, and must be run in a later iteration of
 * the [thread-default main context][g-main-context-push-thread-default]
 * from where the operation was initiated. It will be passed a
 * {@link AsyncResult} instance filled with the details of the operation's
 * success or failure, the object the asynchronous function was
 * started for and any error codes returned. The asynchronous callback
 * function is then expected to call the corresponding "_finish()"
 * function, passing the object the function was called for, the
 * {@link AsyncResult} instance, and (optionally) an {@code error} to grab any
 * error conditions that may have occurred.
 * <p>
 * The "_finish()" function for an operation takes the generic result
 * (of type {@link AsyncResult}) and returns the specific result that the
 * operation in question yields (e.g. a {@link FileEnumerator} for a
 * "enumerate children" operation). If the result or error status of the
 * operation is not needed, there is no need to call the "_finish()"
 * function; GIO will take care of cleaning up the result and error
 * information after the {@link AsyncReadyCallback} returns. You can pass
 * {@code null} for the {@link AsyncReadyCallback} if you don't need to take any
 * action at all after the operation completes. Applications may also
 * take a reference to the {@link AsyncResult} and call "_finish()" later;
 * however, the "_finish()" function may be called at most once.
 * <p>
 * Example of a typical asynchronous operation flow:
 * <pre>{@code <!-- language="C" -->
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
 * }</pre>
 * <p>
 * The callback for an asynchronous operation is called only once, and is
 * always called, even in the case of a cancelled operation. On cancellation
 * the result is a {@link IOErrorEnum#CANCELLED} error.
 * 
 * <h2>I/O Priority # {#io-priority}</h2>
 * Many I/O-related asynchronous operations have a priority parameter,
 * which is used in certain cases to determine the order in which
 * operations are executed. They are not used to determine system-wide
 * I/O scheduling. Priorities are integers, with lower numbers indicating
 * higher priority. It is recommended to choose priorities between
 * {@code G_PRIORITY_LOW} and {@code G_PRIORITY_HIGH}, with {@code G_PRIORITY_DEFAULT}
 * as a default.
 */
public interface AsyncResult extends io.github.jwharm.javagi.Proxy {

    @ApiStatus.Internal static final MethodHandle g_async_result_get_source_object = Interop.downcallHandle(
        "g_async_result_get_source_object",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the source object from a {@link AsyncResult}.
     */
    default @Nullable org.gtk.gobject.Object getSourceObject() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_async_result_get_source_object.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gobject.Object(Refcounted.get(RESULT, true));
    }
    
    @ApiStatus.Internal static final MethodHandle g_async_result_get_user_data = Interop.downcallHandle(
        "g_async_result_get_user_data",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the user data from a {@link AsyncResult}.
     */
    default @Nullable java.lang.foreign.MemoryAddress getUserData() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_async_result_get_user_data.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    @ApiStatus.Internal static final MethodHandle g_async_result_is_tagged = Interop.downcallHandle(
        "g_async_result_is_tagged",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Checks if {@code res} has the given {@code source_tag} (generally a function
     * pointer indicating the function {@code res} was created by).
     */
    default boolean isTagged(@Nullable java.lang.foreign.MemoryAddress sourceTag) {
        int RESULT;
        try {
            RESULT = (int) g_async_result_is_tagged.invokeExact(handle(), sourceTag);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    @ApiStatus.Internal static final MethodHandle g_async_result_legacy_propagate_error = Interop.downcallHandle(
        "g_async_result_legacy_propagate_error",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * If {@code res} is a {@link SimpleAsyncResult}, this is equivalent to
     * g_simple_async_result_propagate_error(). Otherwise it returns
     * {@code false}.
     * <p>
     * This can be used for legacy error handling in async *_finish()
     * wrapper functions that traditionally handled {@link SimpleAsyncResult}
     * error returns themselves rather than calling into the virtual method.
     * This should not be used in new code; {@link AsyncResult} errors that are
     * set by virtual methods should also be extracted by virtual methods,
     * to enable subclasses to chain up correctly.
     */
    default boolean legacyPropagateError() throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) g_async_result_legacy_propagate_error.invokeExact(handle(), (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT != 0;
    }
    
    class AsyncResultImpl extends org.gtk.gobject.Object implements AsyncResult {
        public AsyncResultImpl(io.github.jwharm.javagi.Refcounted ref) {
            super(ref);
        }
    }
}
