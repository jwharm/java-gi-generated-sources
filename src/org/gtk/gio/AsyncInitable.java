package org.gtk.gio;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * This is the asynchronous version of #GInitable; it behaves the same
 * in all ways except that initialization is asynchronous. For more details
 * see the descriptions on #GInitable.
 * 
 * A class may implement both the #GInitable and #GAsyncInitable interfaces.
 * 
 * Users of objects implementing this are not intended to use the interface
 * method directly; instead it will be used automatically in various ways.
 * For C applications you generally just call g_async_initable_new_async()
 * directly, or indirectly via a foo_thing_new_async() wrapper. This will call
 * g_async_initable_init_async() under the cover, calling back with %NULL and
 * a set %GError on failure.
 * 
 * A typical implementation might look something like this:
 * 
 * |[<!-- language="C" -->
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
 * ]|
 */
public interface AsyncInitable extends io.github.jwharm.javagi.interop.NativeAddress {

    /**
     * Finishes asynchronous initialization and returns the result.
     * See g_async_initable_init_async().
     */
    public default boolean initFinish(AsyncResult res) throws io.github.jwharm.javagi.interop.GErrorException {
        MemorySegment GERROR = io.github.jwharm.javagi.interop.jextract.GError.allocate(Interop.getScope());
        var RESULT = gtk_h.g_async_initable_init_finish(handle(), res.handle(), GERROR);
        if (! java.util.Objects.equals(MemoryAddress.NULL, GERROR)) {
            throw new io.github.jwharm.javagi.interop.GErrorException(GERROR);
        }
        return (RESULT != 0);
    }
    
    /**
     * Finishes the async construction for the various g_async_initable_new
     * calls, returning the created object or %NULL on error.
     */
    public default org.gtk.gobject.Object newFinish(AsyncResult res) throws io.github.jwharm.javagi.interop.GErrorException {
        MemorySegment GERROR = io.github.jwharm.javagi.interop.jextract.GError.allocate(Interop.getScope());
        var RESULT = gtk_h.g_async_initable_new_finish(handle(), res.handle(), GERROR);
        if (! java.util.Objects.equals(MemoryAddress.NULL, GERROR)) {
            throw new io.github.jwharm.javagi.interop.GErrorException(GERROR);
        }
        return new org.gtk.gobject.Object(References.get(RESULT, true));
    }
    
    class AsyncInitableImpl extends org.gtk.gobject.Object implements AsyncInitable {
        public AsyncInitableImpl(io.github.jwharm.javagi.interop.Reference reference) {
            super(reference);
        }
    }
}
