package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * As of GLib 2.46, {@link SimpleAsyncResult} is deprecated in favor of
 * {@link Task}, which provides a simpler API.
 * <p>
 * {@link SimpleAsyncResult} implements {@link AsyncResult}.
 * <p>
 * GSimpleAsyncResult handles {@code GAsyncReadyCallbacks}, error
 * reporting, operation cancellation and the final state of an operation,
 * completely transparent to the application. Results can be returned
 * as a pointer e.g. for functions that return data that is collected
 * asynchronously, a boolean value for checking the success or failure
 * of an operation, or a {@code gssize} for operations which return the number
 * of bytes modified by the operation; all of the simple return cases
 * are covered.
 * <p>
 * Most of the time, an application will not need to know of the details
 * of this API; it is handled transparently, and any necessary operations
 * are handled by {@link AsyncResult}'s interface. However, if implementing a
 * new GIO module, for writing language bindings, or for complex
 * applications that need better control of how asynchronous operations
 * are completed, it is important to understand this functionality.
 * <p>
 * GSimpleAsyncResults are tagged with the calling function to ensure
 * that asynchronous functions and their finishing functions are used
 * together correctly.
 * <p>
 * To create a new {@link SimpleAsyncResult}, call g_simple_async_result_new().
 * If the result needs to be created for a {@link org.gtk.glib.Error}, use
 * g_simple_async_result_new_from_error() or
 * g_simple_async_result_new_take_error(). If a {@link org.gtk.glib.Error} is not available
 * (e.g. the asynchronous operation's doesn't take a {@link org.gtk.glib.Error} argument),
 * but the result still needs to be created for an error condition, use
 * g_simple_async_result_new_error() (or g_simple_async_result_set_error_va()
 * if your application or binding requires passing a variable argument list
 * directly), and the error can then be propagated through the use of
 * g_simple_async_result_propagate_error().
 * <p>
 * An asynchronous operation can be made to ignore a cancellation event by
 * calling g_simple_async_result_set_handle_cancellation() with a
 * {@link SimpleAsyncResult} for the operation and {@code false}. This is useful for
 * operations that are dangerous to cancel, such as close (which would
 * cause a leak if cancelled before being run).
 * <p>
 * GSimpleAsyncResult can integrate into GLib's event loop, {@link org.gtk.glib.MainLoop},
 * or it can use {@code GThreads}.
 * g_simple_async_result_complete() will finish an I/O task directly
 * from the point where it is called. g_simple_async_result_complete_in_idle()
 * will finish it from an idle handler in the
 * [thread-default main context][g-main-context-push-thread-default]
 * where the {@link SimpleAsyncResult} was created.
 * g_simple_async_result_run_in_thread() will run the job in a
 * separate thread and then use
 * g_simple_async_result_complete_in_idle() to deliver the result.
 * <p>
 * To set the results of an asynchronous function,
 * g_simple_async_result_set_op_res_gpointer(),
 * g_simple_async_result_set_op_res_gboolean(), and
 * g_simple_async_result_set_op_res_gssize()
 * are provided, setting the operation's result to a gpointer, gboolean, or
 * gssize, respectively.
 * <p>
 * Likewise, to get the result of an asynchronous function,
 * g_simple_async_result_get_op_res_gpointer(),
 * g_simple_async_result_get_op_res_gboolean(), and
 * g_simple_async_result_get_op_res_gssize() are
 * provided, getting the operation's result as a gpointer, gboolean, and
 * gssize, respectively.
 * <p>
 * For the details of the requirements implementations must respect, see
 * {@link AsyncResult}.  A typical implementation of an asynchronous operation
 * using GSimpleAsyncResult looks something like this:
 * <pre>{@code <!-- language="C" -->
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
 *                                      "Go to the supermarket");
 *   else
 *     g_simple_async_result_set_op_res_gpointer (result,
 *                                                g_object_ref (cake),
 *                                                g_object_unref);
 * 
 * 
 *   // In this example, we assume that baked_cb is called as a callback from
 *   // the mainloop, so it's safe to complete the operation synchronously here.
 *   // If, however, _baker_prepare_cake () might call its callback without
 *   // first returning to the mainloop — inadvisable, but some APIs do so —
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
 *   if (radius < 3)
 *     {
 *       g_simple_async_report_error_in_idle (G_OBJECT (self),
 *                                            callback,
 *                                            user_data,
 *                                            BAKER_ERRORS,
 *                                            BAKER_ERROR_TOO_SMALL,
 *                                            "%ucm radius cakes are silly",
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
 * }</pre>
 */
public class SimpleAsyncResult extends org.gtk.gobject.Object implements org.gtk.gio.AsyncResult {
    
    static {
        Gio.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GSimpleAsyncResult";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a SimpleAsyncResult proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public SimpleAsyncResult(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Cast object to SimpleAsyncResult if its GType is a (or inherits from) "GSimpleAsyncResult".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code SimpleAsyncResult} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GSimpleAsyncResult", a ClassCastException will be thrown.
     */
    public static SimpleAsyncResult castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), SimpleAsyncResult.getType())) {
            return new SimpleAsyncResult(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GSimpleAsyncResult");
        }
    }
    
    private static Addressable constructNewError(@Nullable org.gtk.gobject.Object sourceObject, @Nullable org.gtk.gio.AsyncReadyCallback callback, @NotNull org.gtk.glib.Quark domain, int code, @NotNull java.lang.String format, java.lang.Object... varargs) {
        java.util.Objects.requireNonNull(domain, "Parameter 'domain' must not be null");
        java.util.Objects.requireNonNull(format, "Parameter 'format' must not be null");
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_simple_async_result_new_error.invokeExact(
                    (Addressable) (sourceObject == null ? MemoryAddress.NULL : sourceObject.handle()),
                    (Addressable) (callback == null ? MemoryAddress.NULL : (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Gio.Callbacks.class, "cbAsyncReadyCallback",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                        Interop.getScope())),
                    (Addressable) (callback == null ? MemoryAddress.NULL : Interop.registerCallback(callback)),
                    domain.getValue().intValue(),
                    code,
                    Interop.allocateNativeString(format),
                    varargs);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new {@link SimpleAsyncResult} with a set error.
     * @param sourceObject a {@link org.gtk.gobject.Object}, or {@code null}.
     * @param callback a {@link AsyncReadyCallback}.
     * @param domain a {@link org.gtk.glib.Quark}.
     * @param code an error code.
     * @param format a string with format characters.
     * @param varargs a list of values to insert into {@code format}.
     * @return a {@link SimpleAsyncResult}.
     * @deprecated Use g_task_new() and g_task_return_new_error() instead.
     */
    @Deprecated
    public static SimpleAsyncResult newError(@Nullable org.gtk.gobject.Object sourceObject, @Nullable org.gtk.gio.AsyncReadyCallback callback, @NotNull org.gtk.glib.Quark domain, int code, @NotNull java.lang.String format, java.lang.Object... varargs) {
        return new SimpleAsyncResult(constructNewError(sourceObject, callback, domain, code, format, varargs), Ownership.FULL);
    }
    
    private static Addressable constructNewFromError(@Nullable org.gtk.gobject.Object sourceObject, @Nullable org.gtk.gio.AsyncReadyCallback callback, @NotNull org.gtk.glib.Error error) {
        java.util.Objects.requireNonNull(error, "Parameter 'error' must not be null");
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_simple_async_result_new_from_error.invokeExact(
                    (Addressable) (sourceObject == null ? MemoryAddress.NULL : sourceObject.handle()),
                    (Addressable) (callback == null ? MemoryAddress.NULL : (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Gio.Callbacks.class, "cbAsyncReadyCallback",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                        Interop.getScope())),
                    (Addressable) (callback == null ? MemoryAddress.NULL : Interop.registerCallback(callback)),
                    error.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a {@link SimpleAsyncResult} from an error condition.
     * @param sourceObject a {@link org.gtk.gobject.Object}, or {@code null}.
     * @param callback a {@link AsyncReadyCallback}.
     * @param error a {@link org.gtk.glib.Error}
     * @return a {@link SimpleAsyncResult}.
     * @deprecated Use g_task_new() and g_task_return_error() instead.
     */
    @Deprecated
    public static SimpleAsyncResult newFromError(@Nullable org.gtk.gobject.Object sourceObject, @Nullable org.gtk.gio.AsyncReadyCallback callback, @NotNull org.gtk.glib.Error error) {
        return new SimpleAsyncResult(constructNewFromError(sourceObject, callback, error), Ownership.FULL);
    }
    
    private static Addressable constructNewTakeError(@Nullable org.gtk.gobject.Object sourceObject, @Nullable org.gtk.gio.AsyncReadyCallback callback, @NotNull org.gtk.glib.Error error) {
        java.util.Objects.requireNonNull(error, "Parameter 'error' must not be null");
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_simple_async_result_new_take_error.invokeExact(
                    (Addressable) (sourceObject == null ? MemoryAddress.NULL : sourceObject.handle()),
                    (Addressable) (callback == null ? MemoryAddress.NULL : (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Gio.Callbacks.class, "cbAsyncReadyCallback",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                        Interop.getScope())),
                    (Addressable) (callback == null ? MemoryAddress.NULL : Interop.registerCallback(callback)),
                    error.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a {@link SimpleAsyncResult} from an error condition, and takes over the
     * caller's ownership of {@code error}, so the caller does not need to free it anymore.
     * @param sourceObject a {@link org.gtk.gobject.Object}, or {@code null}
     * @param callback a {@link AsyncReadyCallback}
     * @param error a {@link org.gtk.glib.Error}
     * @return a {@link SimpleAsyncResult}
     * @deprecated Use g_task_new() and g_task_return_error() instead.
     */
    @Deprecated
    public static SimpleAsyncResult newTakeError(@Nullable org.gtk.gobject.Object sourceObject, @Nullable org.gtk.gio.AsyncReadyCallback callback, @NotNull org.gtk.glib.Error error) {
        return new SimpleAsyncResult(constructNewTakeError(sourceObject, callback, error), Ownership.FULL);
    }
    
    /**
     * Completes an asynchronous I/O job immediately. Must be called in
     * the thread where the asynchronous result was to be delivered, as it
     * invokes the callback directly. If you are in a different thread use
     * g_simple_async_result_complete_in_idle().
     * <p>
     * Calling this function takes a reference to {@code simple} for as long as
     * is needed to complete the call.
     * @deprecated Use {@link Task} instead.
     */
    @Deprecated
    public void complete() {
        try {
            DowncallHandles.g_simple_async_result_complete.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Completes an asynchronous function in an idle handler in the
     * [thread-default main context][g-main-context-push-thread-default]
     * of the thread that {@code simple} was initially created in
     * (and re-pushes that context around the invocation of the callback).
     * <p>
     * Calling this function takes a reference to {@code simple} for as long as
     * is needed to complete the call.
     * @deprecated Use {@link Task} instead.
     */
    @Deprecated
    public void completeInIdle() {
        try {
            DowncallHandles.g_simple_async_result_complete_in_idle.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Gets the operation result boolean from within the asynchronous result.
     * @return {@code true} if the operation's result was {@code true}, {@code false}
     *     if the operation's result was {@code false}.
     * @deprecated Use {@link Task} and g_task_propagate_boolean() instead.
     */
    @Deprecated
    public boolean getOpResGboolean() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_simple_async_result_get_op_res_gboolean.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Gets a pointer result as returned by the asynchronous function.
     * @return a pointer from the result.
     * @deprecated Use {@link Task} and g_task_propagate_pointer() instead.
     */
    @Deprecated
    public @Nullable java.lang.foreign.MemoryAddress getOpResGpointer() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_simple_async_result_get_op_res_gpointer.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Gets a gssize from the asynchronous result.
     * @return a gssize returned from the asynchronous function.
     * @deprecated Use {@link Task} and g_task_propagate_int() instead.
     */
    @Deprecated
    public long getOpResGssize() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.g_simple_async_result_get_op_res_gssize.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Gets the source tag for the {@link SimpleAsyncResult}.
     * @return a {@code gpointer} to the source object for the {@link SimpleAsyncResult}.
     * @deprecated Use {@link Task} and g_task_get_source_tag() instead.
     */
    @Deprecated
    public @Nullable java.lang.foreign.MemoryAddress getSourceTag() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_simple_async_result_get_source_tag.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Propagates an error from within the simple asynchronous result to
     * a given destination.
     * <p>
     * If the {@link Cancellable} given to a prior call to
     * g_simple_async_result_set_check_cancellable() is cancelled then this
     * function will return {@code true} with {@code dest} set appropriately.
     * @return {@code true} if the error was propagated to {@code dest}. {@code false} otherwise.
     * @throws GErrorException See {@link org.gtk.glib.Error}
     * @deprecated Use {@link Task} instead.
     */
    @Deprecated
    public boolean propagateError() throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_simple_async_result_propagate_error.invokeExact(
                    handle(),
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
     * Runs the asynchronous job in a separate thread and then calls
     * g_simple_async_result_complete_in_idle() on {@code simple} to return
     * the result to the appropriate main loop.
     * <p>
     * Calling this function takes a reference to {@code simple} for as long as
     * is needed to run the job and report its completion.
     * @param func a {@link SimpleAsyncThreadFunc}.
     * @param ioPriority the io priority of the request.
     * @param cancellable optional {@link Cancellable} object, {@code null} to ignore.
     * @deprecated Use {@link Task} and g_task_run_in_thread() instead.
     */
    @Deprecated
    public void runInThread(@NotNull org.gtk.gio.SimpleAsyncThreadFunc func, int ioPriority, @Nullable org.gtk.gio.Cancellable cancellable) {
        throw new UnsupportedOperationException("Operation not supported yet");
    }
    
    /**
     * Sets a {@link Cancellable} to check before dispatching results.
     * <p>
     * This function has one very specific purpose: the provided cancellable
     * is checked at the time of g_simple_async_result_propagate_error() If
     * it is cancelled, these functions will return an "Operation was
     * cancelled" error ({@link IOErrorEnum#CANCELLED}).
     * <p>
     * Implementors of cancellable asynchronous functions should use this in
     * order to provide a guarantee to their callers that cancelling an
     * async operation will reliably result in an error being returned for
     * that operation (even if a positive result for the operation has
     * already been sent as an idle to the main context to be dispatched).
     * <p>
     * The checking described above is done regardless of any call to the
     * unrelated g_simple_async_result_set_handle_cancellation() function.
     * @param checkCancellable a {@link Cancellable} to check, or {@code null} to unset
     * @deprecated Use {@link Task} instead.
     */
    @Deprecated
    public void setCheckCancellable(@Nullable org.gtk.gio.Cancellable checkCancellable) {
        try {
            DowncallHandles.g_simple_async_result_set_check_cancellable.invokeExact(
                    handle(),
                    (Addressable) (checkCancellable == null ? MemoryAddress.NULL : checkCancellable.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets an error within the asynchronous result without a {@link org.gtk.glib.Error}.
     * @param domain a {@link org.gtk.glib.Quark} (usually {@code G_IO_ERROR}).
     * @param code an error code.
     * @param format a formatted error reporting string.
     * @param varargs a list of variables to fill in {@code format}.
     * @deprecated Use {@link Task} and g_task_return_new_error() instead.
     */
    @Deprecated
    public void setError(@NotNull org.gtk.glib.Quark domain, int code, @NotNull java.lang.String format, java.lang.Object... varargs) {
        java.util.Objects.requireNonNull(domain, "Parameter 'domain' must not be null");
        java.util.Objects.requireNonNull(format, "Parameter 'format' must not be null");
        try {
            DowncallHandles.g_simple_async_result_set_error.invokeExact(
                    handle(),
                    domain.getValue().intValue(),
                    code,
                    Interop.allocateNativeString(format),
                    varargs);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets an error within the asynchronous result without a {@link org.gtk.glib.Error}.
     * Unless writing a binding, see g_simple_async_result_set_error().
     * @param domain a {@link org.gtk.glib.Quark} (usually {@code G_IO_ERROR}).
     * @param code an error code.
     * @param format a formatted error reporting string.
     * @param args va_list of arguments.
     * @deprecated Use {@link Task} and g_task_return_error() instead.
     */
    @Deprecated
    public void setErrorVa(@NotNull org.gtk.glib.Quark domain, int code, @NotNull java.lang.String format, @NotNull VaList args) {
        java.util.Objects.requireNonNull(domain, "Parameter 'domain' must not be null");
        java.util.Objects.requireNonNull(format, "Parameter 'format' must not be null");
        java.util.Objects.requireNonNull(args, "Parameter 'args' must not be null");
        try {
            DowncallHandles.g_simple_async_result_set_error_va.invokeExact(
                    handle(),
                    domain.getValue().intValue(),
                    code,
                    Interop.allocateNativeString(format),
                    args);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the result from a {@link org.gtk.glib.Error}.
     * @param error {@link org.gtk.glib.Error}.
     * @deprecated Use {@link Task} and g_task_return_error() instead.
     */
    @Deprecated
    public void setFromError(@NotNull org.gtk.glib.Error error) {
        java.util.Objects.requireNonNull(error, "Parameter 'error' must not be null");
        try {
            DowncallHandles.g_simple_async_result_set_from_error.invokeExact(
                    handle(),
                    error.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets whether to handle cancellation within the asynchronous operation.
     * <p>
     * This function has nothing to do with
     * g_simple_async_result_set_check_cancellable().  It only refers to the
     * {@link Cancellable} passed to g_simple_async_result_run_in_thread().
     * @param handleCancellation a {@code gboolean}.
     */
    @Deprecated
    public void setHandleCancellation(boolean handleCancellation) {
        try {
            DowncallHandles.g_simple_async_result_set_handle_cancellation.invokeExact(
                    handle(),
                    handleCancellation ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the operation result to a boolean within the asynchronous result.
     * @param opRes a {@code gboolean}.
     * @deprecated Use {@link Task} and g_task_return_boolean() instead.
     */
    @Deprecated
    public void setOpResGboolean(boolean opRes) {
        try {
            DowncallHandles.g_simple_async_result_set_op_res_gboolean.invokeExact(
                    handle(),
                    opRes ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the operation result within the asynchronous result to a pointer.
     * @param opRes a pointer result from an asynchronous function.
     * @param destroyOpRes a {@link org.gtk.glib.DestroyNotify} function.
     * @deprecated Use {@link Task} and g_task_return_pointer() instead.
     */
    @Deprecated
    public void setOpResGpointer(@Nullable java.lang.foreign.MemoryAddress opRes, @NotNull org.gtk.glib.DestroyNotify destroyOpRes) {
        throw new UnsupportedOperationException("Operation not supported yet");
    }
    
    /**
     * Sets the operation result within the asynchronous result to
     * the given {@code op_res}.
     * @param opRes a {@code gssize}.
     * @deprecated Use {@link Task} and g_task_return_int() instead.
     */
    @Deprecated
    public void setOpResGssize(long opRes) {
        try {
            DowncallHandles.g_simple_async_result_set_op_res_gssize.invokeExact(
                    handle(),
                    opRes);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the result from {@code error}, and takes over the caller's ownership
     * of {@code error}, so the caller does not need to free it any more.
     * @param error a {@link org.gtk.glib.Error}
     * @deprecated Use {@link Task} and g_task_return_error() instead.
     */
    @Deprecated
    public void takeError(@NotNull org.gtk.glib.Error error) {
        java.util.Objects.requireNonNull(error, "Parameter 'error' must not be null");
        try {
            DowncallHandles.g_simple_async_result_take_error.invokeExact(
                    handle(),
                    error.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static @NotNull org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.g_simple_async_result_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * Ensures that the data passed to the _finish function of an async
     * operation is consistent.  Three checks are performed.
     * <p>
     * First, {@code result} is checked to ensure that it is really a
     * {@link SimpleAsyncResult}.  Second, {@code source} is checked to ensure that it
     * matches the source object of {@code result}.  Third, {@code source_tag} is
     * checked to ensure that it is equal to the {@code source_tag} argument given
     * to g_simple_async_result_new() (which, by convention, is a pointer
     * to the _async function corresponding to the _finish function from
     * which this function is called).  (Alternatively, if either
     * {@code source_tag} or {@code result}'s source tag is {@code null}, then the source tag
     * check is skipped.)
     * @param result the {@link AsyncResult} passed to the _finish function.
     * @param source the {@link org.gtk.gobject.Object} passed to the _finish function.
     * @param sourceTag the asynchronous function.
     * @return {@code TRUE} if all checks passed or {@code FALSE} if any failed.
     * @deprecated Use {@link Task} and g_task_is_valid() instead.
     */
    @Deprecated
    public static boolean isValid(@NotNull org.gtk.gio.AsyncResult result, @Nullable org.gtk.gobject.Object source, @Nullable java.lang.foreign.MemoryAddress sourceTag) {
        java.util.Objects.requireNonNull(result, "Parameter 'result' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_simple_async_result_is_valid.invokeExact(
                    result.handle(),
                    (Addressable) (source == null ? MemoryAddress.NULL : source.handle()),
                    (Addressable) (sourceTag == null ? MemoryAddress.NULL : (Addressable) sourceTag));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * GObjects with properties.
     */
    public static class Build extends org.gtk.gobject.Object.Build {
        
         /**
         * A {@link SimpleAsyncResult.Build} object constructs a {@link SimpleAsyncResult} 
         * using the <em>builder pattern</em> to set property values. 
         * Use the various {@code set...()} methods to set properties, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
        }
        
         /**
         * Finish building the {@link SimpleAsyncResult} object.
         * Internally, a call to {@link org.gtk.gobject.GObject#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link SimpleAsyncResult} using {@link SimpleAsyncResult#castFrom}.
         * @return A new instance of {@code SimpleAsyncResult} with the properties 
         *         that were set in the Build object.
         */
        public SimpleAsyncResult construct() {
            return SimpleAsyncResult.castFrom(
                org.gtk.gobject.Object.newWithProperties(
                    SimpleAsyncResult.getType(),
                    names.size(),
                    names.toArray(new String[0]),
                    values.toArray(new org.gtk.gobject.Value[0])
                )
            );
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle g_simple_async_result_new = Interop.downcallHandle(
            "g_simple_async_result_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_simple_async_result_new_error = Interop.downcallHandle(
            "g_simple_async_result_new_error",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            true
        );
        
        private static final MethodHandle g_simple_async_result_new_from_error = Interop.downcallHandle(
            "g_simple_async_result_new_from_error",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_simple_async_result_new_take_error = Interop.downcallHandle(
            "g_simple_async_result_new_take_error",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_simple_async_result_complete = Interop.downcallHandle(
            "g_simple_async_result_complete",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_simple_async_result_complete_in_idle = Interop.downcallHandle(
            "g_simple_async_result_complete_in_idle",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_simple_async_result_get_op_res_gboolean = Interop.downcallHandle(
            "g_simple_async_result_get_op_res_gboolean",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_simple_async_result_get_op_res_gpointer = Interop.downcallHandle(
            "g_simple_async_result_get_op_res_gpointer",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_simple_async_result_get_op_res_gssize = Interop.downcallHandle(
            "g_simple_async_result_get_op_res_gssize",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_simple_async_result_get_source_tag = Interop.downcallHandle(
            "g_simple_async_result_get_source_tag",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_simple_async_result_propagate_error = Interop.downcallHandle(
            "g_simple_async_result_propagate_error",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_simple_async_result_run_in_thread = Interop.downcallHandle(
            "g_simple_async_result_run_in_thread",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_simple_async_result_set_check_cancellable = Interop.downcallHandle(
            "g_simple_async_result_set_check_cancellable",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_simple_async_result_set_error = Interop.downcallHandle(
            "g_simple_async_result_set_error",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            true
        );
        
        private static final MethodHandle g_simple_async_result_set_error_va = Interop.downcallHandle(
            "g_simple_async_result_set_error_va",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_simple_async_result_set_from_error = Interop.downcallHandle(
            "g_simple_async_result_set_from_error",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_simple_async_result_set_handle_cancellation = Interop.downcallHandle(
            "g_simple_async_result_set_handle_cancellation",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle g_simple_async_result_set_op_res_gboolean = Interop.downcallHandle(
            "g_simple_async_result_set_op_res_gboolean",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle g_simple_async_result_set_op_res_gpointer = Interop.downcallHandle(
            "g_simple_async_result_set_op_res_gpointer",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_simple_async_result_set_op_res_gssize = Interop.downcallHandle(
            "g_simple_async_result_set_op_res_gssize",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG),
            false
        );
        
        private static final MethodHandle g_simple_async_result_take_error = Interop.downcallHandle(
            "g_simple_async_result_take_error",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_simple_async_result_get_type = Interop.downcallHandle(
            "g_simple_async_result_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
        
        private static final MethodHandle g_simple_async_result_is_valid = Interop.downcallHandle(
            "g_simple_async_result_is_valid",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
    }
}
