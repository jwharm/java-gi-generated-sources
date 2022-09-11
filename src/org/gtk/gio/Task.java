package org.gtk.gio;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * A #GTask represents and manages a cancellable "task".
 * 
 * ## Asynchronous operations
 * 
 * The most common usage of #GTask is as a #GAsyncResult, to
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
 * loop first, if necessary). The caller will pass the #GTask back to
 * the operation's finish function (as a #GAsyncResult), and you can
 * use g_task_propagate_pointer() or the like to extract the
 * return value.
 * 
 * Using #GTask requires the thread-default #GMainContext from when the
 * #GTask was constructed to be running at least until the task has completed
 * and its data has been freed.
 * 
 * Here is an example for using GTask as a GAsyncResult:
 * |[<!-- language="C" -->
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
 * ]|
 * 
 * ## Chained asynchronous operations
 * 
 * #GTask also tries to simplify asynchronous operations that
 * internally chain together several smaller asynchronous
 * operations. g_task_get_cancellable(), g_task_get_context(),
 * and g_task_get_priority() allow you to get back the task's
 * #GCancellable, #GMainContext, and [I/O priority][io-priority]
 * when starting a new subtask, so you don't have to keep track
 * of them yourself. g_task_attach_source() simplifies the case
 * of waiting for a source to fire (automatically using the correct
 * #GMainContext and priority).
 * 
 * Here is an example for chained asynchronous operations:
 *   |[<!-- language="C" -->
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
 * ]|
 * 
 * ## Asynchronous operations from synchronous ones
 * 
 * You can use g_task_run_in_thread() to turn a synchronous
 * operation into an asynchronous one, by running it in a thread.
 * When it completes, the result will be dispatched to the
 * [thread-default main context][g-main-context-push-thread-default]
 * where the #GTask was created.
 * 
 * Running a task in a thread:
 *   |[<!-- language="C" -->
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
 * ]|
 * 
 * ## Adding cancellability to uncancellable tasks
 * 
 * Finally, g_task_run_in_thread() and g_task_run_in_thread_sync()
 * can be used to turn an uncancellable operation into a
 * cancellable one. If you call g_task_set_return_on_cancel(),
 * passing %TRUE, then if the task's #GCancellable is cancelled,
 * it will return control back to the caller immediately, while
 * allowing the task thread to continue running in the background
 * (and simply discarding its result when it finally does finish).
 * Provided that the task thread is careful about how it uses
 * locks and other externally-visible resources, this allows you
 * to make "GLib-friendly" asynchronous and cancellable
 * synchronous variants of blocking APIs.
 * 
 * Cancelling a task:
 *   |[<!-- language="C" -->
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
 * ]|
 * 
 * ## Porting from GSimpleAsyncResult
 * 
 * #GTask's API attempts to be simpler than #GSimpleAsyncResult's
 * in several ways:
 * - You can save task-specific data with g_task_set_task_data(), and
 *   retrieve it later with g_task_get_task_data(). This replaces the
 *   abuse of g_simple_async_result_set_op_res_gpointer() for the same
 *   purpose with #GSimpleAsyncResult.
 * - In addition to the task data, #GTask also keeps track of the
 *   [priority][io-priority], #GCancellable, and
 *   #GMainContext associated with the task, so tasks that consist of
 *   a chain of simpler asynchronous operations will have easy access
 *   to those values when starting each sub-task.
 * - g_task_return_error_if_cancelled() provides simplified
 *   handling for cancellation. In addition, cancellation
 *   overrides any other #GTask return value by default, like
 *   #GSimpleAsyncResult does when
 *   g_simple_async_result_set_check_cancellable() is called.
 *   (You can use g_task_set_check_cancellable() to turn off that
 *   behavior.) On the other hand, g_task_run_in_thread()
 *   guarantees that it will always run your
 *   `task_func`, even if the task's #GCancellable
 *   is already cancelled before the task gets a chance to run;
 *   you can start your `task_func` with a
 *   g_task_return_error_if_cancelled() check if you need the
 *   old behavior.
 * - The "return" methods (eg, g_task_return_pointer())
 *   automatically cause the task to be "completed" as well, and
 *   there is no need to worry about the "complete" vs "complete
 *   in idle" distinction. (#GTask automatically figures out
 *   whether the task's callback can be invoked directly, or
 *   if it needs to be sent to another #GMainContext, or delayed
 *   until the next iteration of the current #GMainContext.)
 * - The "finish" functions for #GTask based operations are generally
 *   much simpler than #GSimpleAsyncResult ones, normally consisting
 *   of only a single call to g_task_propagate_pointer() or the like.
 *   Since g_task_propagate_pointer() "steals" the return value from
 *   the #GTask, it is not necessary to juggle pointers around to
 *   prevent it from being freed twice.
 * - With #GSimpleAsyncResult, it was common to call
 *   g_simple_async_result_propagate_error() from the
 *   `_finish()` wrapper function, and have
 *   virtual method implementations only deal with successful
 *   returns. This behavior is deprecated, because it makes it
 *   difficult for a subclass to chain to a parent class's async
 *   methods. Instead, the wrapper function should just be a
 *   simple wrapper, and the virtual method should call an
 *   appropriate `g_task_propagate_` function.
 *   Note that wrapper methods can now use
 *   g_async_result_legacy_propagate_error() to do old-style
 *   #GSimpleAsyncResult error-returning behavior, and
 *   g_async_result_is_tagged() to check if a result is tagged as
 *   having come from the `_async()` wrapper
 *   function (for "short-circuit" results, such as when passing
 *   0 to g_input_stream_read_async()).
 */
public class Task extends org.gtk.gobject.Object implements AsyncResult {

    public Task(io.github.jwharm.javagi.interop.Reference reference) {
        super(reference);
    }
    
    /** Cast object to Task */
    public static Task castFrom(org.gtk.gobject.Object gobject) {
        return new Task(gobject.getReference());
    }
    
    /**
     * Creates a #GTask acting on @source_object, which will eventually be
     * used to invoke @callback in the current
     * [thread-default main context][g-main-context-push-thread-default].
     * 
     * Call this in the "start" method of your asynchronous method, and
     * pass the #GTask around throughout the asynchronous operation. You
     * can use g_task_set_task_data() to attach task-specific data to the
     * object, which you can retrieve later via g_task_get_task_data().
     * 
     * By default, if @cancellable is cancelled, then the return value of
     * the task will always be %G_IO_ERROR_CANCELLED, even if the task had
     * already completed before the cancellation. This allows for
     * simplified handling in cases where cancellation may imply that
     * other objects that the task depends on have been destroyed. If you
     * do not want this behavior, you can use
     * g_task_set_check_cancellable() to change it.
     */
    public Task(org.gtk.gobject.Object sourceObject, Cancellable cancellable, AsyncReadyCallback callback, jdk.incubator.foreign.MemoryAddress callbackData) {
        super(References.get(gtk_h.g_task_new(sourceObject.handle(), cancellable.handle(), callback, callbackData), true));
    }
    
    /**
     * Gets @task's #GCancellable
     */
    public Cancellable getCancellable() {
        var RESULT = gtk_h.g_task_get_cancellable(handle());
        return new Cancellable(References.get(RESULT, false));
    }
    
    /**
     * Gets @task's check-cancellable flag. See
     * g_task_set_check_cancellable() for more details.
     */
    public boolean getCheckCancellable() {
        var RESULT = gtk_h.g_task_get_check_cancellable(handle());
        return (RESULT != 0);
    }
    
    /**
     * Gets the value of #GTask:completed. This changes from %FALSE to %TRUE after
     * the task’s callback is invoked, and will return %FALSE if called from inside
     * the callback.
     */
    public boolean getCompleted() {
        var RESULT = gtk_h.g_task_get_completed(handle());
        return (RESULT != 0);
    }
    
    /**
     * Gets the #GMainContext that @task will return its result in (that
     * is, the context that was the
     * [thread-default main context][g-main-context-push-thread-default]
     * at the point when @task was created).
     * 
     * This will always return a non-%NULL value, even if the task's
     * context is the default #GMainContext.
     */
    public org.gtk.glib.MainContext getContext() {
        var RESULT = gtk_h.g_task_get_context(handle());
        return new org.gtk.glib.MainContext(References.get(RESULT, false));
    }
    
    /**
     * Gets @task’s name. See g_task_set_name().
     */
    public java.lang.String getName() {
        var RESULT = gtk_h.g_task_get_name(handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Gets @task's priority
     */
    public int getPriority() {
        var RESULT = gtk_h.g_task_get_priority(handle());
        return RESULT;
    }
    
    /**
     * Gets @task's return-on-cancel flag. See
     * g_task_set_return_on_cancel() for more details.
     */
    public boolean getReturnOnCancel() {
        var RESULT = gtk_h.g_task_get_return_on_cancel(handle());
        return (RESULT != 0);
    }
    
    /**
     * Gets the source object from @task. Like
     * g_async_result_get_source_object(), but does not ref the object.
     */
    public org.gtk.gobject.Object getSourceObject() {
        var RESULT = gtk_h.g_task_get_source_object(handle());
        return new org.gtk.gobject.Object(References.get(RESULT, false));
    }
    
    /**
     * Gets @task's source tag. See g_task_set_source_tag().
     */
    public jdk.incubator.foreign.MemoryAddress getSourceTag() {
        var RESULT = gtk_h.g_task_get_source_tag(handle());
        return RESULT;
    }
    
    /**
     * Gets @task's `task_data`.
     */
    public jdk.incubator.foreign.MemoryAddress getTaskData() {
        var RESULT = gtk_h.g_task_get_task_data(handle());
        return RESULT;
    }
    
    /**
     * Tests if @task resulted in an error.
     */
    public boolean hadError() {
        var RESULT = gtk_h.g_task_had_error(handle());
        return (RESULT != 0);
    }
    
    /**
     * Gets the result of @task as a #gboolean.
     * 
     * If the task resulted in an error, or was cancelled, then this will
     * instead return %FALSE and set @error.
     * 
     * Since this method transfers ownership of the return value (or
     * error) to the caller, you may only call it once.
     */
    public boolean propagateBoolean() throws io.github.jwharm.javagi.interop.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_task_propagate_boolean(handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return (RESULT != 0);
    }
    
    /**
     * Gets the result of @task as an integer (#gssize).
     * 
     * If the task resulted in an error, or was cancelled, then this will
     * instead return -1 and set @error.
     * 
     * Since this method transfers ownership of the return value (or
     * error) to the caller, you may only call it once.
     */
    public long propagateInt() throws io.github.jwharm.javagi.interop.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_task_propagate_int(handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT;
    }
    
    /**
     * Gets the result of @task as a pointer, and transfers ownership
     * of that value to the caller.
     * 
     * If the task resulted in an error, or was cancelled, then this will
     * instead return %NULL and set @error.
     * 
     * Since this method transfers ownership of the return value (or
     * error) to the caller, you may only call it once.
     */
    public jdk.incubator.foreign.MemoryAddress propagatePointer() throws io.github.jwharm.javagi.interop.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_task_propagate_pointer(handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT;
    }
    
    /**
     * Gets the result of @task as a #GValue, and transfers ownership of
     * that value to the caller. As with g_task_return_value(), this is
     * a generic low-level method; g_task_propagate_pointer() and the like
     * will usually be more useful for C code.
     * 
     * If the task resulted in an error, or was cancelled, then this will
     * instead set @error and return %FALSE.
     * 
     * Since this method transfers ownership of the return value (or
     * error) to the caller, you may only call it once.
     */
    public boolean propagateValue(org.gtk.gobject.Value value) throws io.github.jwharm.javagi.interop.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_task_propagate_value(handle(), value.handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return (RESULT != 0);
    }
    
    /**
     * Sets @task's result to @result and completes the task (see
     * g_task_return_pointer() for more discussion of exactly what this
     * means).
     */
    public void returnBoolean(boolean result) {
        gtk_h.g_task_return_boolean(handle(), result ? 1 : 0);
    }
    
    /**
     * Sets @task's result to @error (which @task assumes ownership of)
     * and completes the task (see g_task_return_pointer() for more
     * discussion of exactly what this means).
     * 
     * Note that since the task takes ownership of @error, and since the
     * task may be completed before returning from g_task_return_error(),
     * you cannot assume that @error is still valid after calling this.
     * Call g_error_copy() on the error if you need to keep a local copy
     * as well.
     * 
     * See also g_task_return_new_error().
     */
    public void returnError(org.gtk.glib.Error error) {
        gtk_h.g_task_return_error(handle(), error.handle());
    }
    
    /**
     * Checks if @task's #GCancellable has been cancelled, and if so, sets
     * @task's error accordingly and completes the task (see
     * g_task_return_pointer() for more discussion of exactly what this
     * means).
     */
    public boolean returnErrorIfCancelled() {
        var RESULT = gtk_h.g_task_return_error_if_cancelled(handle());
        return (RESULT != 0);
    }
    
    /**
     * Sets @task's result to @result and completes the task (see
     * g_task_return_pointer() for more discussion of exactly what this
     * means).
     */
    public void returnInt(long result) {
        gtk_h.g_task_return_int(handle(), result);
    }
    
    /**
     * Sets @task's result to @result (by copying it) and completes the task.
     * 
     * If @result is %NULL then a #GValue of type %G_TYPE_POINTER
     * with a value of %NULL will be used for the result.
     * 
     * This is a very generic low-level method intended primarily for use
     * by language bindings; for C code, g_task_return_pointer() and the
     * like will normally be much easier to use.
     */
    public void returnValue(org.gtk.gobject.Value result) {
        gtk_h.g_task_return_value(handle(), result.handle());
    }
    
    /**
     * Sets or clears @task's check-cancellable flag. If this is %TRUE
     * (the default), then g_task_propagate_pointer(), etc, and
     * g_task_had_error() will check the task's #GCancellable first, and
     * if it has been cancelled, then they will consider the task to have
     * returned an "Operation was cancelled" error
     * (%G_IO_ERROR_CANCELLED), regardless of any other error or return
     * value the task may have had.
     * 
     * If @check_cancellable is %FALSE, then the #GTask will not check the
     * cancellable itself, and it is up to @task's owner to do this (eg,
     * via g_task_return_error_if_cancelled()).
     * 
     * If you are using g_task_set_return_on_cancel() as well, then
     * you must leave check-cancellable set %TRUE.
     */
    public void setCheckCancellable(boolean checkCancellable) {
        gtk_h.g_task_set_check_cancellable(handle(), checkCancellable ? 1 : 0);
    }
    
    /**
     * Sets @task’s name, used in debugging and profiling. The name defaults to
     * %NULL.
     * 
     * The task name should describe in a human readable way what the task does.
     * For example, ‘Open file’ or ‘Connect to network host’. It is used to set the
     * name of the #GSource used for idle completion of the task.
     * 
     * This function may only be called before the @task is first used in a thread
     * other than the one it was constructed in. It is called automatically by
     * g_task_set_source_tag() if not called already.
     */
    public void setName(java.lang.String name) {
        gtk_h.g_task_set_name(handle(), Interop.allocateNativeString(name).handle());
    }
    
    /**
     * Sets @task's priority. If you do not call this, it will default to
     * %G_PRIORITY_DEFAULT.
     * 
     * This will affect the priority of #GSources created with
     * g_task_attach_source() and the scheduling of tasks run in threads,
     * and can also be explicitly retrieved later via
     * g_task_get_priority().
     */
    public void setPriority(int priority) {
        gtk_h.g_task_set_priority(handle(), priority);
    }
    
    /**
     * Sets or clears @task's return-on-cancel flag. This is only
     * meaningful for tasks run via g_task_run_in_thread() or
     * g_task_run_in_thread_sync().
     * 
     * If @return_on_cancel is %TRUE, then cancelling @task's
     * #GCancellable will immediately cause it to return, as though the
     * task's #GTaskThreadFunc had called
     * g_task_return_error_if_cancelled() and then returned.
     * 
     * This allows you to create a cancellable wrapper around an
     * uninterruptible function. The #GTaskThreadFunc just needs to be
     * careful that it does not modify any externally-visible state after
     * it has been cancelled. To do that, the thread should call
     * g_task_set_return_on_cancel() again to (atomically) set
     * return-on-cancel %FALSE before making externally-visible changes;
     * if the task gets cancelled before the return-on-cancel flag could
     * be changed, g_task_set_return_on_cancel() will indicate this by
     * returning %FALSE.
     * 
     * You can disable and re-enable this flag multiple times if you wish.
     * If the task's #GCancellable is cancelled while return-on-cancel is
     * %FALSE, then calling g_task_set_return_on_cancel() to set it %TRUE
     * again will cause the task to be cancelled at that point.
     * 
     * If the task's #GCancellable is already cancelled before you call
     * g_task_run_in_thread()/g_task_run_in_thread_sync(), then the
     * #GTaskThreadFunc will still be run (for consistency), but the task
     * will also be completed right away.
     */
    public boolean setReturnOnCancel(boolean returnOnCancel) {
        var RESULT = gtk_h.g_task_set_return_on_cancel(handle(), returnOnCancel ? 1 : 0);
        return (RESULT != 0);
    }
    
    /**
     * Sets @task's source tag.
     * 
     * You can use this to tag a task return
     * value with a particular pointer (usually a pointer to the function
     * doing the tagging) and then later check it using
     * g_task_get_source_tag() (or g_async_result_is_tagged()) in the
     * task's "finish" function, to figure out if the response came from a
     * particular place.
     * 
     * A macro wrapper around this function will automatically set the
     * task’s name to the string form of @source_tag if it’s not already
     * set, for convenience.
     */
    public void setSourceTag(jdk.incubator.foreign.MemoryAddress sourceTag) {
        gtk_h.g_task_set_source_tag(handle(), sourceTag);
    }
    
    /**
     * Sets @task's task data (freeing the existing task data, if any).
     */
    public void setTaskData(Task task) {
        try {
            int hash = taskDataDestroy.hashCode();
            Interop.signalRegistry.put(hash, taskDataDestroy);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "cbDestroyNotify", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            gtk_h.g_task_set_task_data(handle(), intSegment, Interop.cbDestroyNotifySymbol());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Checks that @result is a #GTask, and that @source_object is its
     * source object (or that @source_object is %NULL and @result has no
     * source object). This can be used in g_return_if_fail() checks.
     */
    public static boolean isValid(AsyncResult result, org.gtk.gobject.Object sourceObject) {
        var RESULT = gtk_h.g_task_is_valid(result.handle(), sourceObject.handle());
        return (RESULT != 0);
    }
    
    /**
     * Creates a #GTask and then immediately calls g_task_return_error()
     * on it. Use this in the wrapper function of an asynchronous method
     * when you want to avoid even calling the virtual method. You can
     * then use g_async_result_is_tagged() in the finish method wrapper to
     * check if the result there is tagged as having been created by the
     * wrapper method, and deal with it appropriately if so.
     * 
     * See also g_task_report_new_error().
     */
    public void reportError(org.gtk.gobject.Object sourceObject, AsyncReadyCallback callback, jdk.incubator.foreign.MemoryAddress sourceTag, org.gtk.glib.Error error) {
        try {
            int hash = callback.hashCode();
            Interop.signalRegistry.put(hash, callback);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(MemoryAddress.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "cbAsyncReadyCallback", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            gtk_h.g_task_report_error(sourceObject.handle(), nativeSymbol, intSegment, sourceTag, error.handle());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
}
