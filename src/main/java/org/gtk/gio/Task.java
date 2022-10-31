package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A {@link Task} represents and manages a cancellable "task".
 * <p>
 * <strong>Asynchronous operations</strong><br/>
 * The most common usage of {@link Task} is as a {@link AsyncResult}, to
 * manage data during an asynchronous operation. You call
 * g_task_new() in the "start" method, followed by
 * g_task_set_task_data() and the like if you need to keep some
 * additional data associated with the task, and then pass the
 * task object around through your asynchronous operation.
 * Eventually, you will call a method such as
 * g_task_return_pointer() or g_task_return_error(), which will
 * save the value you give it and then invoke the task's callback
 * function in the
 * [thread-default main context][g-main-context-push-thread-default]
 * where it was created (waiting until the next iteration of the main
 * loop first, if necessary). The caller will pass the {@link Task} back to
 * the operation's finish function (as a {@link AsyncResult}), and you can
 * use g_task_propagate_pointer() or the like to extract the
 * return value.
 * <p>
 * Using {@link Task} requires the thread-default {@link org.gtk.glib.MainContext} from when the
 * {@link Task} was constructed to be running at least until the task has completed
 * and its data has been freed.
 * <p>
 * Here is an example for using GTask as a GAsyncResult:
 * <pre>{@code <!-- language="C" -->
 *     typedef struct {
 *       CakeFrostingType frosting;
 *       char *message;
 *     } DecorationData;
 * 
 *     static void
 *     decoration_data_free (DecorationData *decoration)
 *     {
 *       g_free (decoration->message);
 *       g_slice_free (DecorationData, decoration);
 *     }
 * 
 *     static void
 *     baked_cb (Cake     *cake,
 *               gpointer  user_data)
 *     {
 *       GTask *task = user_data;
 *       DecorationData *decoration = g_task_get_task_data (task);
 *       GError *error = NULL;
 * 
 *       if (cake == NULL)
 *         {
 *           g_task_return_new_error (task, BAKER_ERROR, BAKER_ERROR_NO_FLOUR,
 *                                    "Go to the supermarket");
 *           g_object_unref (task);
 *           return;
 *         }
 * 
 *       if (!cake_decorate (cake, decoration->frosting, decoration->message, &error))
 *         {
 *           g_object_unref (cake);
 *           // g_task_return_error() takes ownership of error
 *           g_task_return_error (task, error);
 *           g_object_unref (task);
 *           return;
 *         }
 * 
 *       g_task_return_pointer (task, cake, g_object_unref);
 *       g_object_unref (task);
 *     }
 * 
 *     void
 *     baker_bake_cake_async (Baker               *self,
 *                            guint                radius,
 *                            CakeFlavor           flavor,
 *                            CakeFrostingType     frosting,
 *                            const char          *message,
 *                            GCancellable        *cancellable,
 *                            GAsyncReadyCallback  callback,
 *                            gpointer             user_data)
 *     {
 *       GTask *task;
 *       DecorationData *decoration;
 *       Cake  *cake;
 * 
 *       task = g_task_new (self, cancellable, callback, user_data);
 *       if (radius < 3)
 *         {
 *           g_task_return_new_error (task, BAKER_ERROR, BAKER_ERROR_TOO_SMALL,
 *                                    "%ucm radius cakes are silly",
 *                                    radius);
 *           g_object_unref (task);
 *           return;
 *         }
 * 
 *       cake = _baker_get_cached_cake (self, radius, flavor, frosting, message);
 *       if (cake != NULL)
 *         {
 *           // _baker_get_cached_cake() returns a reffed cake
 *           g_task_return_pointer (task, cake, g_object_unref);
 *           g_object_unref (task);
 *           return;
 *         }
 * 
 *       decoration = g_slice_new (DecorationData);
 *       decoration->frosting = frosting;
 *       decoration->message = g_strdup (message);
 *       g_task_set_task_data (task, decoration, (GDestroyNotify) decoration_data_free);
 * 
 *       _baker_begin_cake (self, radius, flavor, cancellable, baked_cb, task);
 *     }
 * 
 *     Cake *
 *     baker_bake_cake_finish (Baker         *self,
 *                             GAsyncResult  *result,
 *                             GError       **error)
 *     {
 *       g_return_val_if_fail (g_task_is_valid (result, self), NULL);
 * 
 *       return g_task_propagate_pointer (G_TASK (result), error);
 *     }
 * }</pre>
 * <p>
 * <strong>Chained asynchronous operations</strong><br/>
 * {@link Task} also tries to simplify asynchronous operations that
 * internally chain together several smaller asynchronous
 * operations. g_task_get_cancellable(), g_task_get_context(),
 * and g_task_get_priority() allow you to get back the task's
 * {@link Cancellable}, {@link org.gtk.glib.MainContext}, and [I/O priority][io-priority]
 * when starting a new subtask, so you don't have to keep track
 * of them yourself. g_task_attach_source() simplifies the case
 * of waiting for a source to fire (automatically using the correct
 * {@link org.gtk.glib.MainContext} and priority).
 * <p>
 * Here is an example for chained asynchronous operations:
 *   <pre>{@code <!-- language="C" -->
 *     typedef struct {
 *       Cake *cake;
 *       CakeFrostingType frosting;
 *       char *message;
 *     } BakingData;
 * 
 *     static void
 *     decoration_data_free (BakingData *bd)
 *     {
 *       if (bd->cake)
 *         g_object_unref (bd->cake);
 *       g_free (bd->message);
 *       g_slice_free (BakingData, bd);
 *     }
 * 
 *     static void
 *     decorated_cb (Cake         *cake,
 *                   GAsyncResult *result,
 *                   gpointer      user_data)
 *     {
 *       GTask *task = user_data;
 *       GError *error = NULL;
 * 
 *       if (!cake_decorate_finish (cake, result, &error))
 *         {
 *           g_object_unref (cake);
 *           g_task_return_error (task, error);
 *           g_object_unref (task);
 *           return;
 *         }
 * 
 *       // baking_data_free() will drop its ref on the cake, so we have to
 *       // take another here to give to the caller.
 *       g_task_return_pointer (task, g_object_ref (cake), g_object_unref);
 *       g_object_unref (task);
 *     }
 * 
 *     static gboolean
 *     decorator_ready (gpointer user_data)
 *     {
 *       GTask *task = user_data;
 *       BakingData *bd = g_task_get_task_data (task);
 * 
 *       cake_decorate_async (bd->cake, bd->frosting, bd->message,
 *                            g_task_get_cancellable (task),
 *                            decorated_cb, task);
 * 
 *       return G_SOURCE_REMOVE;
 *     }
 * 
 *     static void
 *     baked_cb (Cake     *cake,
 *               gpointer  user_data)
 *     {
 *       GTask *task = user_data;
 *       BakingData *bd = g_task_get_task_data (task);
 *       GError *error = NULL;
 * 
 *       if (cake == NULL)
 *         {
 *           g_task_return_new_error (task, BAKER_ERROR, BAKER_ERROR_NO_FLOUR,
 *                                    "Go to the supermarket");
 *           g_object_unref (task);
 *           return;
 *         }
 * 
 *       bd->cake = cake;
 * 
 *       // Bail out now if the user has already cancelled
 *       if (g_task_return_error_if_cancelled (task))
 *         {
 *           g_object_unref (task);
 *           return;
 *         }
 * 
 *       if (cake_decorator_available (cake))
 *         decorator_ready (task);
 *       else
 *         {
 *           GSource *source;
 * 
 *           source = cake_decorator_wait_source_new (cake);
 *           // Attach @source to @task's GMainContext and have it call
 *           // decorator_ready() when it is ready.
 *           g_task_attach_source (task, source, decorator_ready);
 *           g_source_unref (source);
 *         }
 *     }
 * 
 *     void
 *     baker_bake_cake_async (Baker               *self,
 *                            guint                radius,
 *                            CakeFlavor           flavor,
 *                            CakeFrostingType     frosting,
 *                            const char          *message,
 *                            gint                 priority,
 *                            GCancellable        *cancellable,
 *                            GAsyncReadyCallback  callback,
 *                            gpointer             user_data)
 *     {
 *       GTask *task;
 *       BakingData *bd;
 * 
 *       task = g_task_new (self, cancellable, callback, user_data);
 *       g_task_set_priority (task, priority);
 * 
 *       bd = g_slice_new0 (BakingData);
 *       bd->frosting = frosting;
 *       bd->message = g_strdup (message);
 *       g_task_set_task_data (task, bd, (GDestroyNotify) baking_data_free);
 * 
 *       _baker_begin_cake (self, radius, flavor, cancellable, baked_cb, task);
 *     }
 * 
 *     Cake *
 *     baker_bake_cake_finish (Baker         *self,
 *                             GAsyncResult  *result,
 *                             GError       **error)
 *     {
 *       g_return_val_if_fail (g_task_is_valid (result, self), NULL);
 * 
 *       return g_task_propagate_pointer (G_TASK (result), error);
 *     }
 * }</pre>
 * <p>
 * <strong>Asynchronous operations from synchronous ones</strong><br/>
 * You can use g_task_run_in_thread() to turn a synchronous
 * operation into an asynchronous one, by running it in a thread.
 * When it completes, the result will be dispatched to the
 * [thread-default main context][g-main-context-push-thread-default]
 * where the {@link Task} was created.
 * <p>
 * Running a task in a thread:
 *   <pre>{@code <!-- language="C" -->
 *     typedef struct {
 *       guint radius;
 *       CakeFlavor flavor;
 *       CakeFrostingType frosting;
 *       char *message;
 *     } CakeData;
 * 
 *     static void
 *     cake_data_free (CakeData *cake_data)
 *     {
 *       g_free (cake_data->message);
 *       g_slice_free (CakeData, cake_data);
 *     }
 * 
 *     static void
 *     bake_cake_thread (GTask         *task,
 *                       gpointer       source_object,
 *                       gpointer       task_data,
 *                       GCancellable  *cancellable)
 *     {
 *       Baker *self = source_object;
 *       CakeData *cake_data = task_data;
 *       Cake *cake;
 *       GError *error = NULL;
 * 
 *       cake = bake_cake (baker, cake_data->radius, cake_data->flavor,
 *                         cake_data->frosting, cake_data->message,
 *                         cancellable, &error);
 *       if (cake)
 *         g_task_return_pointer (task, cake, g_object_unref);
 *       else
 *         g_task_return_error (task, error);
 *     }
 * 
 *     void
 *     baker_bake_cake_async (Baker               *self,
 *                            guint                radius,
 *                            CakeFlavor           flavor,
 *                            CakeFrostingType     frosting,
 *                            const char          *message,
 *                            GCancellable        *cancellable,
 *                            GAsyncReadyCallback  callback,
 *                            gpointer             user_data)
 *     {
 *       CakeData *cake_data;
 *       GTask *task;
 * 
 *       cake_data = g_slice_new (CakeData);
 *       cake_data->radius = radius;
 *       cake_data->flavor = flavor;
 *       cake_data->frosting = frosting;
 *       cake_data->message = g_strdup (message);
 *       task = g_task_new (self, cancellable, callback, user_data);
 *       g_task_set_task_data (task, cake_data, (GDestroyNotify) cake_data_free);
 *       g_task_run_in_thread (task, bake_cake_thread);
 *       g_object_unref (task);
 *     }
 * 
 *     Cake *
 *     baker_bake_cake_finish (Baker         *self,
 *                             GAsyncResult  *result,
 *                             GError       **error)
 *     {
 *       g_return_val_if_fail (g_task_is_valid (result, self), NULL);
 * 
 *       return g_task_propagate_pointer (G_TASK (result), error);
 *     }
 * }</pre>
 * <p>
 * <strong>Adding cancellability to uncancellable tasks</strong><br/>
 * Finally, g_task_run_in_thread() and g_task_run_in_thread_sync()
 * can be used to turn an uncancellable operation into a
 * cancellable one. If you call g_task_set_return_on_cancel(),
 * passing {@code true}, then if the task's {@link Cancellable} is cancelled,
 * it will return control back to the caller immediately, while
 * allowing the task thread to continue running in the background
 * (and simply discarding its result when it finally does finish).
 * Provided that the task thread is careful about how it uses
 * locks and other externally-visible resources, this allows you
 * to make "GLib-friendly" asynchronous and cancellable
 * synchronous variants of blocking APIs.
 * <p>
 * Cancelling a task:
 *   <pre>{@code <!-- language="C" -->
 *     static void
 *     bake_cake_thread (GTask         *task,
 *                       gpointer       source_object,
 *                       gpointer       task_data,
 *                       GCancellable  *cancellable)
 *     {
 *       Baker *self = source_object;
 *       CakeData *cake_data = task_data;
 *       Cake *cake;
 *       GError *error = NULL;
 * 
 *       cake = bake_cake (baker, cake_data->radius, cake_data->flavor,
 *                         cake_data->frosting, cake_data->message,
 *                         &error);
 *       if (error)
 *         {
 *           g_task_return_error (task, error);
 *           return;
 *         }
 * 
 *       // If the task has already been cancelled, then we don't want to add
 *       // the cake to the cake cache. Likewise, we don't  want to have the
 *       // task get cancelled in the middle of updating the cache.
 *       // g_task_set_return_on_cancel() will return %TRUE here if it managed
 *       // to disable return-on-cancel, or %FALSE if the task was cancelled
 *       // before it could.
 *       if (g_task_set_return_on_cancel (task, FALSE))
 *         {
 *           // If the caller cancels at this point, their
 *           // GAsyncReadyCallback won't be invoked until we return,
 *           // so we don't have to worry that this code will run at
 *           // the same time as that code does. But if there were
 *           // other functions that might look at the cake cache,
 *           // then we'd probably need a GMutex here as well.
 *           baker_add_cake_to_cache (baker, cake);
 *           g_task_return_pointer (task, cake, g_object_unref);
 *         }
 *     }
 * 
 *     void
 *     baker_bake_cake_async (Baker               *self,
 *                            guint                radius,
 *                            CakeFlavor           flavor,
 *                            CakeFrostingType     frosting,
 *                            const char          *message,
 *                            GCancellable        *cancellable,
 *                            GAsyncReadyCallback  callback,
 *                            gpointer             user_data)
 *     {
 *       CakeData *cake_data;
 *       GTask *task;
 * 
 *       cake_data = g_slice_new (CakeData);
 * 
 *       ...
 * 
 *       task = g_task_new (self, cancellable, callback, user_data);
 *       g_task_set_task_data (task, cake_data, (GDestroyNotify) cake_data_free);
 *       g_task_set_return_on_cancel (task, TRUE);
 *       g_task_run_in_thread (task, bake_cake_thread);
 *     }
 * 
 *     Cake *
 *     baker_bake_cake_sync (Baker               *self,
 *                           guint                radius,
 *                           CakeFlavor           flavor,
 *                           CakeFrostingType     frosting,
 *                           const char          *message,
 *                           GCancellable        *cancellable,
 *                           GError             **error)
 *     {
 *       CakeData *cake_data;
 *       GTask *task;
 *       Cake *cake;
 * 
 *       cake_data = g_slice_new (CakeData);
 * 
 *       ...
 * 
 *       task = g_task_new (self, cancellable, NULL, NULL);
 *       g_task_set_task_data (task, cake_data, (GDestroyNotify) cake_data_free);
 *       g_task_set_return_on_cancel (task, TRUE);
 *       g_task_run_in_thread_sync (task, bake_cake_thread);
 * 
 *       cake = g_task_propagate_pointer (task, error);
 *       g_object_unref (task);
 *       return cake;
 *     }
 * }</pre>
 * <p>
 * <strong>Porting from GSimpleAsyncResult</strong><br/>
 * {@link Task}'s API attempts to be simpler than {@link SimpleAsyncResult}'s
 * in several ways:
 * <ul>
 * <li>You can save task-specific data with g_task_set_task_data(), and
 *   retrieve it later with g_task_get_task_data(). This replaces the
 *   abuse of g_simple_async_result_set_op_res_gpointer() for the same
 *   purpose with {@link SimpleAsyncResult}.
 * <li>In addition to the task data, {@link Task} also keeps track of the
 *   [priority][io-priority], {@link Cancellable}, and
 *   {@link org.gtk.glib.MainContext} associated with the task, so tasks that consist of
 *   a chain of simpler asynchronous operations will have easy access
 *   to those values when starting each sub-task.
 * <li>g_task_return_error_if_cancelled() provides simplified
 *   handling for cancellation. In addition, cancellation
 *   overrides any other {@link Task} return value by default, like
 *   {@link SimpleAsyncResult} does when
 *   g_simple_async_result_set_check_cancellable() is called.
 *   (You can use g_task_set_check_cancellable() to turn off that
 *   behavior.) On the other hand, g_task_run_in_thread()
 *   guarantees that it will always run your
 *   {@code task_func}, even if the task's {@link Cancellable}
 *   is already cancelled before the task gets a chance to run;
 *   you can start your {@code task_func} with a
 *   g_task_return_error_if_cancelled() check if you need the
 *   old behavior.
 * <li>The "return" methods (eg, g_task_return_pointer())
 *   automatically cause the task to be "completed" as well, and
 *   there is no need to worry about the "complete" vs "complete
 *   in idle" distinction. ({@link Task} automatically figures out
 *   whether the task's callback can be invoked directly, or
 *   if it needs to be sent to another {@link org.gtk.glib.MainContext}, or delayed
 *   until the next iteration of the current {@link org.gtk.glib.MainContext}.)
 * <li>The "finish" functions for {@link Task} based operations are generally
 *   much simpler than {@link SimpleAsyncResult} ones, normally consisting
 *   of only a single call to g_task_propagate_pointer() or the like.
 *   Since g_task_propagate_pointer() "steals" the return value from
 *   the {@link Task}, it is not necessary to juggle pointers around to
 *   prevent it from being freed twice.
 * <li>With {@link SimpleAsyncResult}, it was common to call
 *   g_simple_async_result_propagate_error() from the
 *   {@code _finish()} wrapper function, and have
 *   virtual method implementations only deal with successful
 *   returns. This behavior is deprecated, because it makes it
 *   difficult for a subclass to chain to a parent class's async
 *   methods. Instead, the wrapper function should just be a
 *   simple wrapper, and the virtual method should call an
 *   appropriate {@code g_task_propagate_} function.
 *   Note that wrapper methods can now use
 *   g_async_result_legacy_propagate_error() to do old-style
 *   {@link SimpleAsyncResult} error-returning behavior, and
 *   g_async_result_is_tagged() to check if a result is tagged as
 *   having come from the {@code _async()} wrapper
 *   function (for "short-circuit" results, such as when passing
 *   0 to g_input_stream_read_async()).
 * </ul>
 */
public class Task extends org.gtk.gobject.Object implements org.gtk.gio.AsyncResult {
    
    static {
        Gio.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GTask";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    @ApiStatus.Internal
    public Task(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /**
     * Cast object to Task if its GType is a (or inherits from) "GTask".
     * @param  gobject            An object that inherits from GObject
     * @return                    An instance of "Task" that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GTask", a ClassCastException will be thrown.
     */
    public static Task castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), org.gtk.gobject.GObject.typeFromName("GTask"))) {
            return new Task(gobject.refcounted());
        } else {
            throw new ClassCastException("Object type is not an instance of GTask");
        }
    }
    
    private static Refcounted constructNew(@Nullable org.gtk.gobject.Object sourceObject, @Nullable org.gtk.gio.Cancellable cancellable, @Nullable org.gtk.gio.AsyncReadyCallback callback) {
        Refcounted RESULT;
        try {
            RESULT = Refcounted.get((MemoryAddress) DowncallHandles.g_task_new.invokeExact(
                    (Addressable) (sourceObject == null ? MemoryAddress.NULL : sourceObject.handle()),
                    (Addressable) (cancellable == null ? MemoryAddress.NULL : cancellable.handle()),
                    (Addressable) (callback == null ? MemoryAddress.NULL : (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Gio.Callbacks.class, "cbAsyncReadyCallback",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope())),
                    (Addressable) (callback == null ? MemoryAddress.NULL : Interop.registerCallback(callback))), true);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a {@link Task} acting on {@code source_object}, which will eventually be
     * used to invoke {@code callback} in the current
     * [thread-default main context][g-main-context-push-thread-default].
     * <p>
     * Call this in the "start" method of your asynchronous method, and
     * pass the {@link Task} around throughout the asynchronous operation. You
     * can use g_task_set_task_data() to attach task-specific data to the
     * object, which you can retrieve later via g_task_get_task_data().
     * <p>
     * By default, if {@code cancellable} is cancelled, then the return value of
     * the task will always be {@link IOErrorEnum#CANCELLED}, even if the task had
     * already completed before the cancellation. This allows for
     * simplified handling in cases where cancellation may imply that
     * other objects that the task depends on have been destroyed. If you
     * do not want this behavior, you can use
     * g_task_set_check_cancellable() to change it.
     * @param sourceObject the {@link org.gtk.gobject.Object} that owns
     *   this task, or {@code null}.
     * @param cancellable optional {@link Cancellable} object, {@code null} to ignore.
     * @param callback a {@link AsyncReadyCallback}.
     */
    public Task(@Nullable org.gtk.gobject.Object sourceObject, @Nullable org.gtk.gio.Cancellable cancellable, @Nullable org.gtk.gio.AsyncReadyCallback callback) {
        super(constructNew(sourceObject, cancellable, callback));
    }
    
    /**
     * A utility function for dealing with async operations where you need
     * to wait for a {@link org.gtk.glib.Source} to trigger. Attaches {@code source} to {@code task}'s
     * {@link org.gtk.glib.MainContext} with {@code task}'s [priority][io-priority], and sets {@code source}'s
     * callback to {@code callback}, with {@code task} as the callback's {@code user_data}.
     * <p>
     * It will set the {@code source}’s name to the task’s name (as set with
     * g_task_set_name()), if one has been set.
     * <p>
     * This takes a reference on {@code task} until {@code source} is destroyed.
     * @param source the source to attach
     * @param callback the callback to invoke when {@code source} triggers
     */
    public void attachSource(@NotNull org.gtk.glib.Source source, @NotNull org.gtk.glib.SourceFunc callback) {
        throw new UnsupportedOperationException("Operation not supported yet");
    }
    
    /**
     * Gets {@code task}'s {@link Cancellable}
     * @return {@code task}'s {@link Cancellable}
     */
    public @NotNull org.gtk.gio.Cancellable getCancellable() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_task_get_cancellable.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gio.Cancellable(Refcounted.get(RESULT, false));
    }
    
    /**
     * Gets {@code task}'s check-cancellable flag. See
     * g_task_set_check_cancellable() for more details.
     */
    public boolean getCheckCancellable() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_task_get_check_cancellable.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Gets the value of {@link Task}:completed. This changes from {@code false} to {@code true} after
     * the task’s callback is invoked, and will return {@code false} if called from inside
     * the callback.
     * @return {@code true} if the task has completed, {@code false} otherwise.
     */
    public boolean getCompleted() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_task_get_completed.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Gets the {@link org.gtk.glib.MainContext} that {@code task} will return its result in (that
     * is, the context that was the
     * [thread-default main context][g-main-context-push-thread-default]
     * at the point when {@code task} was created).
     * <p>
     * This will always return a non-{@code null} value, even if the task's
     * context is the default {@link org.gtk.glib.MainContext}.
     * @return {@code task}'s {@link org.gtk.glib.MainContext}
     */
    public @NotNull org.gtk.glib.MainContext getContext() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_task_get_context.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.MainContext(Refcounted.get(RESULT, false));
    }
    
    /**
     * Gets {@code task}’s name. See g_task_set_name().
     * @return {@code task}’s name, or {@code null}
     */
    public @Nullable java.lang.String getName() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_task_get_name.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Gets {@code task}'s priority
     * @return {@code task}'s priority
     */
    public int getPriority() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_task_get_priority.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Gets {@code task}'s return-on-cancel flag. See
     * g_task_set_return_on_cancel() for more details.
     */
    public boolean getReturnOnCancel() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_task_get_return_on_cancel.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Gets the source object from {@code task}. Like
     * g_async_result_get_source_object(), but does not ref the object.
     * @return {@code task}'s source object, or {@code null}
     */
    public @Nullable org.gtk.gobject.Object getSourceObject() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_task_get_source_object.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gobject.Object(Refcounted.get(RESULT, false));
    }
    
    /**
     * Gets {@code task}'s source tag. See g_task_set_source_tag().
     * @return {@code task}'s source tag
     */
    public @Nullable java.lang.foreign.MemoryAddress getSourceTag() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_task_get_source_tag.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Gets {@code task}'s {@code task_data}.
     * @return {@code task}'s {@code task_data}.
     */
    public @Nullable java.lang.foreign.MemoryAddress getTaskData() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_task_get_task_data.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Tests if {@code task} resulted in an error.
     * @return {@code true} if the task resulted in an error, {@code false} otherwise.
     */
    public boolean hadError() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_task_had_error.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Gets the result of {@code task} as a {@code gboolean}.
     * <p>
     * If the task resulted in an error, or was cancelled, then this will
     * instead return {@code false} and set {@code error}.
     * <p>
     * Since this method transfers ownership of the return value (or
     * error) to the caller, you may only call it once.
     * @return the task result, or {@code false} on error
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public boolean propagateBoolean() throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_task_propagate_boolean.invokeExact(
                    handle(), (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT != 0;
    }
    
    /**
     * Gets the result of {@code task} as an integer ({@code gssize}).
     * <p>
     * If the task resulted in an error, or was cancelled, then this will
     * instead return -1 and set {@code error}.
     * <p>
     * Since this method transfers ownership of the return value (or
     * error) to the caller, you may only call it once.
     * @return the task result, or -1 on error
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public long propagateInt() throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.g_task_propagate_int.invokeExact(
                    handle(), (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT;
    }
    
    /**
     * Gets the result of {@code task} as a pointer, and transfers ownership
     * of that value to the caller.
     * <p>
     * If the task resulted in an error, or was cancelled, then this will
     * instead return {@code null} and set {@code error}.
     * <p>
     * Since this method transfers ownership of the return value (or
     * error) to the caller, you may only call it once.
     * @return the task result, or {@code null} on error
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public @Nullable java.lang.foreign.MemoryAddress propagatePointer() throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_task_propagate_pointer.invokeExact(
                    handle(), (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT;
    }
    
    /**
     * Gets the result of {@code task} as a {@link org.gtk.gobject.Value}, and transfers ownership of
     * that value to the caller. As with g_task_return_value(), this is
     * a generic low-level method; g_task_propagate_pointer() and the like
     * will usually be more useful for C code.
     * <p>
     * If the task resulted in an error, or was cancelled, then this will
     * instead set {@code error} and return {@code false}.
     * <p>
     * Since this method transfers ownership of the return value (or
     * error) to the caller, you may only call it once.
     * @param value return location for the {@link org.gtk.gobject.Value}
     * @return {@code true} if {@code task} succeeded, {@code false} on error.
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public boolean propagateValue(@NotNull org.gtk.gobject.Value value) throws io.github.jwharm.javagi.GErrorException {
        java.util.Objects.requireNonNull(value, "Parameter 'value' must not be null");
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_task_propagate_value.invokeExact(
                    handle(),
                    value.handle(), (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT != 0;
    }
    
    /**
     * Sets {@code task}'s result to {@code result} and completes the task (see
     * g_task_return_pointer() for more discussion of exactly what this
     * means).
     * @param result the {@code gboolean} result of a task function.
     */
    public void returnBoolean(boolean result) {
        try {
            DowncallHandles.g_task_return_boolean.invokeExact(
                    handle(),
                    result ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets {@code task}'s result to {@code error} (which {@code task} assumes ownership of)
     * and completes the task (see g_task_return_pointer() for more
     * discussion of exactly what this means).
     * <p>
     * Note that since the task takes ownership of {@code error}, and since the
     * task may be completed before returning from g_task_return_error(),
     * you cannot assume that {@code error} is still valid after calling this.
     * Call g_error_copy() on the error if you need to keep a local copy
     * as well.
     * <p>
     * See also g_task_return_new_error().
     * @param error the {@link org.gtk.glib.Error} result of a task function.
     */
    public void returnError(@NotNull org.gtk.glib.Error error) {
        java.util.Objects.requireNonNull(error, "Parameter 'error' must not be null");
        try {
            DowncallHandles.g_task_return_error.invokeExact(
                    handle(),
                    error.refcounted().unowned().handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Checks if {@code task}'s {@link Cancellable} has been cancelled, and if so, sets
     * {@code task}'s error accordingly and completes the task (see
     * g_task_return_pointer() for more discussion of exactly what this
     * means).
     * @return {@code true} if {@code task} has been cancelled, {@code false} if not
     */
    public boolean returnErrorIfCancelled() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_task_return_error_if_cancelled.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Sets {@code task}'s result to {@code result} and completes the task (see
     * g_task_return_pointer() for more discussion of exactly what this
     * means).
     * @param result the integer ({@code gssize}) result of a task function.
     */
    public void returnInt(long result) {
        try {
            DowncallHandles.g_task_return_int.invokeExact(
                    handle(),
                    result);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets {@code task}'s result to a new {@link org.gtk.glib.Error} created from {@code domain}, {@code code},
     * {@code format}, and the remaining arguments, and completes the task (see
     * g_task_return_pointer() for more discussion of exactly what this
     * means).
     * <p>
     * See also g_task_return_error().
     * @param domain a {@link org.gtk.glib.Quark}.
     * @param code an error code.
     * @param format a string with format characters.
     */
    public void returnNewError(@NotNull org.gtk.glib.Quark domain, int code, @NotNull java.lang.String format) {
        throw new UnsupportedOperationException("Operation not supported yet");
    }
    
    /**
     * Sets {@code task}'s result to {@code result} and completes the task. If {@code result}
     * is not {@code null}, then {@code result_destroy} will be used to free {@code result} if
     * the caller does not take ownership of it with
     * g_task_propagate_pointer().
     * <p>
     * "Completes the task" means that for an ordinary asynchronous task
     * it will either invoke the task's callback, or else queue that
     * callback to be invoked in the proper {@link org.gtk.glib.MainContext}, or in the next
     * iteration of the current {@link org.gtk.glib.MainContext}. For a task run via
     * g_task_run_in_thread() or g_task_run_in_thread_sync(), calling this
     * method will save {@code result} to be returned to the caller later, but
     * the task will not actually be completed until the {@link TaskThreadFunc}
     * exits.
     * <p>
     * Note that since the task may be completed before returning from
     * g_task_return_pointer(), you cannot assume that {@code result} is still
     * valid after calling this, unless you are still holding another
     * reference on it.
     * @param result the pointer result of a task
     *     function
     * @param resultDestroy a {@link org.gtk.glib.DestroyNotify} function.
     */
    public void returnPointer(@Nullable java.lang.foreign.MemoryAddress result, @Nullable org.gtk.glib.DestroyNotify resultDestroy) {
        throw new UnsupportedOperationException("Operation not supported yet");
    }
    
    /**
     * Sets {@code task}'s result to {@code result} (by copying it) and completes the task.
     * <p>
     * If {@code result} is {@code null} then a {@link org.gtk.gobject.Value} of type {@code G_TYPE_POINTER}
     * with a value of {@code null} will be used for the result.
     * <p>
     * This is a very generic low-level method intended primarily for use
     * by language bindings; for C code, g_task_return_pointer() and the
     * like will normally be much easier to use.
     * @param result the {@link org.gtk.gobject.Value} result of
     *                                      a task function
     */
    public void returnValue(@Nullable org.gtk.gobject.Value result) {
        try {
            DowncallHandles.g_task_return_value.invokeExact(
                    handle(),
                    (Addressable) (result == null ? MemoryAddress.NULL : result.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Runs {@code task_func} in another thread. When {@code task_func} returns, {@code task}'s
     * {@link AsyncReadyCallback} will be invoked in {@code task}'s {@link org.gtk.glib.MainContext}.
     * <p>
     * This takes a ref on {@code task} until the task completes.
     * <p>
     * See {@link TaskThreadFunc} for more details about how {@code task_func} is handled.
     * <p>
     * Although GLib currently rate-limits the tasks queued via
     * g_task_run_in_thread(), you should not assume that it will always
     * do this. If you have a very large number of tasks to run (several tens of
     * tasks), but don't want them to all run at once, you should only queue a
     * limited number of them (around ten) at a time.
     * @param taskFunc a {@link TaskThreadFunc}
     */
    public void runInThread(@NotNull org.gtk.gio.TaskThreadFunc taskFunc) {
        throw new UnsupportedOperationException("Operation not supported yet");
    }
    
    /**
     * Runs {@code task_func} in another thread, and waits for it to return or be
     * cancelled. You can use g_task_propagate_pointer(), etc, afterward
     * to get the result of {@code task_func}.
     * <p>
     * See {@link TaskThreadFunc} for more details about how {@code task_func} is handled.
     * <p>
     * Normally this is used with tasks created with a {@code null}
     * {@code callback}, but note that even if the task does
     * have a callback, it will not be invoked when {@code task_func} returns.
     * {@link Task}:completed will be set to {@code true} just before this function returns.
     * <p>
     * Although GLib currently rate-limits the tasks queued via
     * g_task_run_in_thread_sync(), you should not assume that it will
     * always do this. If you have a very large number of tasks to run,
     * but don't want them to all run at once, you should only queue a
     * limited number of them at a time.
     * @param taskFunc a {@link TaskThreadFunc}
     */
    public void runInThreadSync(@NotNull org.gtk.gio.TaskThreadFunc taskFunc) {
        throw new UnsupportedOperationException("Operation not supported yet");
    }
    
    /**
     * Sets or clears {@code task}'s check-cancellable flag. If this is {@code true}
     * (the default), then g_task_propagate_pointer(), etc, and
     * g_task_had_error() will check the task's {@link Cancellable} first, and
     * if it has been cancelled, then they will consider the task to have
     * returned an "Operation was cancelled" error
     * ({@link IOErrorEnum#CANCELLED}), regardless of any other error or return
     * value the task may have had.
     * <p>
     * If {@code check_cancellable} is {@code false}, then the {@link Task} will not check the
     * cancellable itself, and it is up to {@code task}'s owner to do this (eg,
     * via g_task_return_error_if_cancelled()).
     * <p>
     * If you are using g_task_set_return_on_cancel() as well, then
     * you must leave check-cancellable set {@code true}.
     * @param checkCancellable whether {@link Task} will check the state of
     *   its {@link Cancellable} for you.
     */
    public void setCheckCancellable(boolean checkCancellable) {
        try {
            DowncallHandles.g_task_set_check_cancellable.invokeExact(
                    handle(),
                    checkCancellable ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets {@code task}’s name, used in debugging and profiling. The name defaults to
     * {@code null}.
     * <p>
     * The task name should describe in a human readable way what the task does.
     * For example, ‘Open file’ or ‘Connect to network host’. It is used to set the
     * name of the {@link org.gtk.glib.Source} used for idle completion of the task.
     * <p>
     * This function may only be called before the {@code task} is first used in a thread
     * other than the one it was constructed in. It is called automatically by
     * g_task_set_source_tag() if not called already.
     * @param name a human readable name for the task, or {@code null} to unset it
     */
    public void setName(@Nullable java.lang.String name) {
        try {
            DowncallHandles.g_task_set_name.invokeExact(
                    handle(),
                    (Addressable) (name == null ? MemoryAddress.NULL : Interop.allocateNativeString(name)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets {@code task}'s priority. If you do not call this, it will default to
     * {@code G_PRIORITY_DEFAULT}.
     * <p>
     * This will affect the priority of {@code GSources} created with
     * g_task_attach_source() and the scheduling of tasks run in threads,
     * and can also be explicitly retrieved later via
     * g_task_get_priority().
     * @param priority the [priority][io-priority] of the request
     */
    public void setPriority(int priority) {
        try {
            DowncallHandles.g_task_set_priority.invokeExact(
                    handle(),
                    priority);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets or clears {@code task}'s return-on-cancel flag. This is only
     * meaningful for tasks run via g_task_run_in_thread() or
     * g_task_run_in_thread_sync().
     * <p>
     * If {@code return_on_cancel} is {@code true}, then cancelling {@code task}'s
     * {@link Cancellable} will immediately cause it to return, as though the
     * task's {@link TaskThreadFunc} had called
     * g_task_return_error_if_cancelled() and then returned.
     * <p>
     * This allows you to create a cancellable wrapper around an
     * uninterruptible function. The {@link TaskThreadFunc} just needs to be
     * careful that it does not modify any externally-visible state after
     * it has been cancelled. To do that, the thread should call
     * g_task_set_return_on_cancel() again to (atomically) set
     * return-on-cancel {@code false} before making externally-visible changes;
     * if the task gets cancelled before the return-on-cancel flag could
     * be changed, g_task_set_return_on_cancel() will indicate this by
     * returning {@code false}.
     * <p>
     * You can disable and re-enable this flag multiple times if you wish.
     * If the task's {@link Cancellable} is cancelled while return-on-cancel is
     * {@code false}, then calling g_task_set_return_on_cancel() to set it {@code true}
     * again will cause the task to be cancelled at that point.
     * <p>
     * If the task's {@link Cancellable} is already cancelled before you call
     * g_task_run_in_thread()/g_task_run_in_thread_sync(), then the
     * {@link TaskThreadFunc} will still be run (for consistency), but the task
     * will also be completed right away.
     * @param returnOnCancel whether the task returns automatically when
     *   it is cancelled.
     * @return {@code true} if {@code task}'s return-on-cancel flag was changed to
     *   match {@code return_on_cancel}. {@code false} if {@code task} has already been
     *   cancelled.
     */
    public boolean setReturnOnCancel(boolean returnOnCancel) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_task_set_return_on_cancel.invokeExact(
                    handle(),
                    returnOnCancel ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Sets {@code task}'s source tag.
     * <p>
     * You can use this to tag a task return
     * value with a particular pointer (usually a pointer to the function
     * doing the tagging) and then later check it using
     * g_task_get_source_tag() (or g_async_result_is_tagged()) in the
     * task's "finish" function, to figure out if the response came from a
     * particular place.
     * <p>
     * A macro wrapper around this function will automatically set the
     * task’s name to the string form of {@code source_tag} if it’s not already
     * set, for convenience.
     * @param sourceTag an opaque pointer indicating the source of this task
     */
    public void setSourceTag(@Nullable java.lang.foreign.MemoryAddress sourceTag) {
        try {
            DowncallHandles.g_task_set_source_tag.invokeExact(
                    handle(),
                    (Addressable) (sourceTag == null ? MemoryAddress.NULL : sourceTag));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets {@code task}'s task data (freeing the existing task data, if any).
     * @param taskData task-specific data
     * @param taskDataDestroy {@link org.gtk.glib.DestroyNotify} for {@code task_data}
     */
    public void setTaskData(@Nullable java.lang.foreign.MemoryAddress taskData, @Nullable org.gtk.glib.DestroyNotify taskDataDestroy) {
        try {
            DowncallHandles.g_task_set_task_data.invokeExact(
                    handle(),
                    taskData,
                    Interop.cbDestroyNotifySymbol());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Checks that {@code result} is a {@link Task}, and that {@code source_object} is its
     * source object (or that {@code source_object} is {@code null} and {@code result} has no
     * source object). This can be used in g_return_if_fail() checks.
     * @param result A {@link AsyncResult}
     * @param sourceObject the source object
     *   expected to be associated with the task
     * @return {@code true} if {@code result} and {@code source_object} are valid, {@code false}
     * if not
     */
    public static boolean isValid(@NotNull org.gtk.gio.AsyncResult result, @Nullable org.gtk.gobject.Object sourceObject) {
        java.util.Objects.requireNonNull(result, "Parameter 'result' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_task_is_valid.invokeExact(
                    result.handle(),
                    (Addressable) (sourceObject == null ? MemoryAddress.NULL : sourceObject.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Creates a {@link Task} and then immediately calls g_task_return_error()
     * on it. Use this in the wrapper function of an asynchronous method
     * when you want to avoid even calling the virtual method. You can
     * then use g_async_result_is_tagged() in the finish method wrapper to
     * check if the result there is tagged as having been created by the
     * wrapper method, and deal with it appropriately if so.
     * <p>
     * See also g_task_report_new_error().
     * @param sourceObject the {@link org.gtk.gobject.Object} that owns
     *   this task, or {@code null}.
     * @param callback a {@link AsyncReadyCallback}.
     * @param sourceTag an opaque pointer indicating the source of this task
     * @param error error to report
     */
    public static void reportError(@Nullable org.gtk.gobject.Object sourceObject, @Nullable org.gtk.gio.AsyncReadyCallback callback, @Nullable java.lang.foreign.MemoryAddress sourceTag, @NotNull org.gtk.glib.Error error) {
        java.util.Objects.requireNonNull(error, "Parameter 'error' must not be null");
        try {
            DowncallHandles.g_task_report_error.invokeExact(
                    (Addressable) (sourceObject == null ? MemoryAddress.NULL : sourceObject.handle()),
                    (Addressable) (callback == null ? MemoryAddress.NULL : (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Gio.Callbacks.class, "cbAsyncReadyCallback",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope())),
                    (Addressable) (callback == null ? MemoryAddress.NULL : Interop.registerCallback(callback)),
                    (Addressable) (sourceTag == null ? MemoryAddress.NULL : sourceTag),
                    error.refcounted().unowned().handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a {@link Task} and then immediately calls
     * g_task_return_new_error() on it. Use this in the wrapper function
     * of an asynchronous method when you want to avoid even calling the
     * virtual method. You can then use g_async_result_is_tagged() in the
     * finish method wrapper to check if the result there is tagged as
     * having been created by the wrapper method, and deal with it
     * appropriately if so.
     * <p>
     * See also g_task_report_error().
     * @param sourceObject the {@link org.gtk.gobject.Object} that owns
     *   this task, or {@code null}.
     * @param callback a {@link AsyncReadyCallback}.
     * @param sourceTag an opaque pointer indicating the source of this task
     * @param domain a {@link org.gtk.glib.Quark}.
     * @param code an error code.
     * @param format a string with format characters.
     */
    public static void reportNewError(@Nullable org.gtk.gobject.Object sourceObject, @Nullable org.gtk.gio.AsyncReadyCallback callback, @Nullable java.lang.foreign.MemoryAddress sourceTag, @NotNull org.gtk.glib.Quark domain, int code, @NotNull java.lang.String format) {
        throw new UnsupportedOperationException("Operation not supported yet");
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle g_task_new = Interop.downcallHandle(
            "g_task_new",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_task_attach_source = Interop.downcallHandle(
            "g_task_attach_source",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_task_get_cancellable = Interop.downcallHandle(
            "g_task_get_cancellable",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_task_get_check_cancellable = Interop.downcallHandle(
            "g_task_get_check_cancellable",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_task_get_completed = Interop.downcallHandle(
            "g_task_get_completed",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_task_get_context = Interop.downcallHandle(
            "g_task_get_context",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_task_get_name = Interop.downcallHandle(
            "g_task_get_name",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_task_get_priority = Interop.downcallHandle(
            "g_task_get_priority",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_task_get_return_on_cancel = Interop.downcallHandle(
            "g_task_get_return_on_cancel",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_task_get_source_object = Interop.downcallHandle(
            "g_task_get_source_object",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_task_get_source_tag = Interop.downcallHandle(
            "g_task_get_source_tag",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_task_get_task_data = Interop.downcallHandle(
            "g_task_get_task_data",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_task_had_error = Interop.downcallHandle(
            "g_task_had_error",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_task_propagate_boolean = Interop.downcallHandle(
            "g_task_propagate_boolean",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_task_propagate_int = Interop.downcallHandle(
            "g_task_propagate_int",
            FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_task_propagate_pointer = Interop.downcallHandle(
            "g_task_propagate_pointer",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_task_propagate_value = Interop.downcallHandle(
            "g_task_propagate_value",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_task_return_boolean = Interop.downcallHandle(
            "g_task_return_boolean",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
        );
        
        private static final MethodHandle g_task_return_error = Interop.downcallHandle(
            "g_task_return_error",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_task_return_error_if_cancelled = Interop.downcallHandle(
            "g_task_return_error_if_cancelled",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_task_return_int = Interop.downcallHandle(
            "g_task_return_int",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG)
        );
        
        private static final MethodHandle g_task_return_new_error = Interop.downcallHandle(
            "g_task_return_new_error",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_task_return_pointer = Interop.downcallHandle(
            "g_task_return_pointer",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_task_return_value = Interop.downcallHandle(
            "g_task_return_value",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_task_run_in_thread = Interop.downcallHandle(
            "g_task_run_in_thread",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_task_run_in_thread_sync = Interop.downcallHandle(
            "g_task_run_in_thread_sync",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_task_set_check_cancellable = Interop.downcallHandle(
            "g_task_set_check_cancellable",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
        );
        
        private static final MethodHandle g_task_set_name = Interop.downcallHandle(
            "g_task_set_name",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_task_set_priority = Interop.downcallHandle(
            "g_task_set_priority",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
        );
        
        private static final MethodHandle g_task_set_return_on_cancel = Interop.downcallHandle(
            "g_task_set_return_on_cancel",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
        );
        
        private static final MethodHandle g_task_set_source_tag = Interop.downcallHandle(
            "g_task_set_source_tag",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_task_set_task_data = Interop.downcallHandle(
            "g_task_set_task_data",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_task_is_valid = Interop.downcallHandle(
            "g_task_is_valid",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_task_report_error = Interop.downcallHandle(
            "g_task_report_error",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_task_report_new_error = Interop.downcallHandle(
            "g_task_report_new_error",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
    }
}
