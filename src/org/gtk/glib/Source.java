package org.gtk.glib;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * The `GSource` struct is an opaque data type
 * representing an event source.
 */
public class Source extends io.github.jwharm.javagi.interop.ResourceBase {

    public Source(io.github.jwharm.javagi.interop.Proxy proxy) {
        super(proxy);
    }
    
    /**
     * Creates a new #GSource structure. The size is specified to
     * allow creating structures derived from #GSource that contain
     * additional data. The size passed in must be at least
     * `sizeof (GSource)`.
     * 
     * The source will not initially be associated with any #GMainContext
     * and must be added to one with g_source_attach() before it will be
     * executed.
     */
    public Source(SourceFuncs sourceFuncs, int structSize) {
        super(ProxyFactory.getProxy(io.github.jwharm.javagi.interop.jextract.gtk_h.g_source_new(sourceFuncs.HANDLE(), structSize), true));
    }
    
    /**
     * Adds @child_source to @source as a "polled" source; when @source is
     * added to a #GMainContext, @child_source will be automatically added
     * with the same priority, when @child_source is triggered, it will
     * cause @source to dispatch (in addition to calling its own
     * callback), and when @source is destroyed, it will destroy
     * @child_source as well. (@source will also still be dispatched if
     * its own prepare/check functions indicate that it is ready.)
     * 
     * If you don't need @child_source to do anything on its own when it
     * triggers, you can call g_source_set_dummy_callback() on it to set a
     * callback that does nothing (except return %TRUE if appropriate).
     * 
     * @source will hold a reference on @child_source while @child_source
     * is attached to it.
     * 
     * This API is only intended to be used by implementations of #GSource.
     * Do not call this API on a #GSource that you did not create.
     */
    public void addChildSource(Source childSource) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_source_add_child_source(HANDLE(), childSource.HANDLE());
    }
    
    /**
     * Adds a file descriptor to the set of file descriptors polled for
     * this source. This is usually combined with g_source_new() to add an
     * event source. The event source's check function will typically test
     * the @revents field in the #GPollFD struct and return %TRUE if events need
     * to be processed.
     * 
     * This API is only intended to be used by implementations of #GSource.
     * Do not call this API on a #GSource that you did not create.
     * 
     * Using this API forces the linear scanning of event sources on each
     * main loop iteration.  Newly-written event sources should try to use
     * g_source_add_unix_fd() instead of this API.
     */
    public void addPoll(PollFD fd) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_source_add_poll(HANDLE(), fd.HANDLE());
    }
    
    /**
     * Monitors @fd for the IO events in @events.
     * 
     * The tag returned by this function can be used to remove or modify the
     * monitoring of the fd using g_source_remove_unix_fd() or
     * g_source_modify_unix_fd().
     * 
     * It is not necessary to remove the fd before destroying the source; it
     * will be cleaned up automatically.
     * 
     * This API is only intended to be used by implementations of #GSource.
     * Do not call this API on a #GSource that you did not create.
     * 
     * As the name suggests, this function is not available on Windows.
     */
    public jdk.incubator.foreign.MemoryAddress addUnixFd(int fd, int events) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_source_add_unix_fd(HANDLE(), fd, events);
        return RESULT;
    }
    
    /**
     * Adds a #GSource to a @context so that it will be executed within
     * that context. Remove it by calling g_source_destroy().
     * 
     * This function is safe to call from any thread, regardless of which thread
     * the @context is running in.
     */
    public int attach(MainContext context) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_source_attach(HANDLE(), context.HANDLE());
        return RESULT;
    }
    
    /**
     * Removes a source from its #GMainContext, if any, and mark it as
     * destroyed.  The source cannot be subsequently added to another
     * context. It is safe to call this on sources which have already been
     * removed from their context.
     * 
     * This does not unref the #GSource: if you still hold a reference, use
     * g_source_unref() to drop it.
     * 
     * This function is safe to call from any thread, regardless of which thread
     * the #GMainContext is running in.
     * 
     * If the source is currently attached to a #GMainContext, destroying it
     * will effectively unset the callback similar to calling g_source_set_callback().
     * This can mean, that the data's #GDestroyNotify gets called right away.
     */
    public void destroy() {
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_source_destroy(HANDLE());
    }
    
    /**
     * Checks whether a source is allowed to be called recursively.
     * see g_source_set_can_recurse().
     */
    public boolean getCanRecurse() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_source_get_can_recurse(HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Gets the #GMainContext with which the source is associated.
     * 
     * You can call this on a source that has been destroyed, provided
     * that the #GMainContext it was attached to still exists (in which
     * case it will return that #GMainContext). In particular, you can
     * always call this function on the source returned from
     * g_main_current_source(). But calling this function on a source
     * whose #GMainContext has been destroyed is an error.
     */
    public MainContext getContext() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_source_get_context(HANDLE());
        return new MainContext(ProxyFactory.getProxy(RESULT, false));
    }
    
    /**
     * Returns the numeric ID for a particular source. The ID of a source
     * is a positive integer which is unique within a particular main loop
     * context. The reverse
     * mapping from ID to source is done by g_main_context_find_source_by_id().
     * 
     * You can only call this function while the source is associated to a
     * #GMainContext instance; calling this function before g_source_attach()
     * or after g_source_destroy() yields undefined behavior. The ID returned
     * is unique within the #GMainContext instance passed to g_source_attach().
     */
    public int getId() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_source_get_id(HANDLE());
        return RESULT;
    }
    
    /**
     * Gets a name for the source, used in debugging and profiling.  The
     * name may be #NULL if it has never been set with g_source_set_name().
     */
    public java.lang.String getName() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_source_get_name(HANDLE());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Gets the priority of a source.
     */
    public int getPriority() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_source_get_priority(HANDLE());
        return RESULT;
    }
    
    /**
     * Gets the "ready time" of @source, as set by
     * g_source_set_ready_time().
     * 
     * Any time before the current monotonic time (including 0) is an
     * indication that the source will fire immediately.
     */
    public long getReadyTime() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_source_get_ready_time(HANDLE());
        return RESULT;
    }
    
    /**
     * Gets the time to be used when checking this source. The advantage of
     * calling this function over calling g_get_monotonic_time() directly is
     * that when checking multiple sources, GLib can cache a single value
     * instead of having to repeatedly get the system monotonic time.
     * 
     * The time here is the system monotonic time, if available, or some
     * other reasonable alternative otherwise.  See g_get_monotonic_time().
     */
    public long getTime() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_source_get_time(HANDLE());
        return RESULT;
    }
    
    /**
     * Returns whether @source has been destroyed.
     * 
     * This is important when you operate upon your objects
     * from within idle handlers, but may have freed the object
     * before the dispatch of your idle handler.
     * 
     * |[<!-- language="C" -->
     * static gboolean
     * idle_callback (gpointer data)
     * {
     *   SomeWidget *self = data;
     *    
     *   g_mutex_lock (&self->idle_id_mutex);
     *   // do stuff with self
     *   self->idle_id = 0;
     *   g_mutex_unlock (&self->idle_id_mutex);
     *    
     *   return G_SOURCE_REMOVE;
     * }
     *  
     * static void
     * some_widget_do_stuff_later (SomeWidget *self)
     * {
     *   g_mutex_lock (&self->idle_id_mutex);
     *   self->idle_id = g_idle_add (idle_callback, self);
     *   g_mutex_unlock (&self->idle_id_mutex);
     * }
     *  
     * static void
     * some_widget_init (SomeWidget *self)
     * {
     *   g_mutex_init (&self->idle_id_mutex);
     * 
     *   // ...
     * }
     * 
     * static void
     * some_widget_finalize (GObject *object)
     * {
     *   SomeWidget *self = SOME_WIDGET (object);
     *    
     *   if (self->idle_id)
     *     g_source_remove (self->idle_id);
     *    
     *   g_mutex_clear (&self->idle_id_mutex);
     * 
     *   G_OBJECT_CLASS (parent_class)->finalize (object);
     * }
     * ]|
     * 
     * This will fail in a multi-threaded application if the
     * widget is destroyed before the idle handler fires due
     * to the use after free in the callback. A solution, to
     * this particular problem, is to check to if the source
     * has already been destroy within the callback.
     * 
     * |[<!-- language="C" -->
     * static gboolean
     * idle_callback (gpointer data)
     * {
     *   SomeWidget *self = data;
     *   
     *   g_mutex_lock (&self->idle_id_mutex);
     *   if (!g_source_is_destroyed (g_main_current_source ()))
     *     {
     *       // do stuff with self
     *     }
     *   g_mutex_unlock (&self->idle_id_mutex);
     *   
     *   return FALSE;
     * }
     * ]|
     * 
     * Calls to this function from a thread other than the one acquired by the
     * #GMainContext the #GSource is attached to are typically redundant, as the
     * source could be destroyed immediately after this function returns. However,
     * once a source is destroyed it cannot be un-destroyed, so this function can be
     * used for opportunistic checks from any thread.
     */
    public boolean isDestroyed() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_source_is_destroyed(HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Updates the event mask to watch for the fd identified by @tag.
     * 
     * @tag is the tag returned from g_source_add_unix_fd().
     * 
     * If you want to remove a fd, don't set its event mask to zero.
     * Instead, call g_source_remove_unix_fd().
     * 
     * This API is only intended to be used by implementations of #GSource.
     * Do not call this API on a #GSource that you did not create.
     * 
     * As the name suggests, this function is not available on Windows.
     */
    public void modifyUnixFd(jdk.incubator.foreign.MemoryAddress tag, int newEvents) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_source_modify_unix_fd(HANDLE(), tag, newEvents);
    }
    
    /**
     * Queries the events reported for the fd corresponding to @tag on
     * @source during the last poll.
     * 
     * The return value of this function is only defined when the function
     * is called from the check or dispatch functions for @source.
     * 
     * This API is only intended to be used by implementations of #GSource.
     * Do not call this API on a #GSource that you did not create.
     * 
     * As the name suggests, this function is not available on Windows.
     */
    public int queryUnixFd(jdk.incubator.foreign.MemoryAddress tag) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_source_query_unix_fd(HANDLE(), tag);
        return RESULT;
    }
    
    /**
     * Increases the reference count on a source by one.
     */
    public Source ref() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_source_ref(HANDLE());
        return new Source(ProxyFactory.getProxy(RESULT, true));
    }
    
    /**
     * Detaches @child_source from @source and destroys it.
     * 
     * This API is only intended to be used by implementations of #GSource.
     * Do not call this API on a #GSource that you did not create.
     */
    public void removeChildSource(Source childSource) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_source_remove_child_source(HANDLE(), childSource.HANDLE());
    }
    
    /**
     * Removes a file descriptor from the set of file descriptors polled for
     * this source.
     * 
     * This API is only intended to be used by implementations of #GSource.
     * Do not call this API on a #GSource that you did not create.
     */
    public void removePoll(PollFD fd) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_source_remove_poll(HANDLE(), fd.HANDLE());
    }
    
    /**
     * Reverses the effect of a previous call to g_source_add_unix_fd().
     * 
     * You only need to call this if you want to remove an fd from being
     * watched while keeping the same source around.  In the normal case you
     * will just want to destroy the source.
     * 
     * This API is only intended to be used by implementations of #GSource.
     * Do not call this API on a #GSource that you did not create.
     * 
     * As the name suggests, this function is not available on Windows.
     */
    public void removeUnixFd(jdk.incubator.foreign.MemoryAddress tag) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_source_remove_unix_fd(HANDLE(), tag);
    }
    
    /**
     * Sets the callback function storing the data as a refcounted callback
     * "object". This is used internally. Note that calling
     * g_source_set_callback_indirect() assumes
     * an initial reference count on @callback_data, and thus
     * @callback_funcs->unref will eventually be called once more
     * than @callback_funcs->ref.
     * 
     * It is safe to call this function multiple times on a source which has already
     * been attached to a context. The changes will take effect for the next time
     * the source is dispatched after this call returns.
     */
    public void setCallbackIndirect(jdk.incubator.foreign.MemoryAddress callbackData, SourceCallbackFuncs callbackFuncs) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_source_set_callback_indirect(HANDLE(), callbackData, callbackFuncs.HANDLE());
    }
    
    /**
     * Sets whether a source can be called recursively. If @can_recurse is
     * %TRUE, then while the source is being dispatched then this source
     * will be processed normally. Otherwise, all processing of this
     * source is blocked until the dispatch function returns.
     */
    public void setCanRecurse(boolean canRecurse) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_source_set_can_recurse(HANDLE(), canRecurse ? 1 : 0);
    }
    
    /**
     * Sets the source functions (can be used to override
     * default implementations) of an unattached source.
     */
    public void setFuncs(SourceFuncs funcs) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_source_set_funcs(HANDLE(), funcs.HANDLE());
    }
    
    /**
     * Sets a name for the source, used in debugging and profiling.
     * The name defaults to #NULL.
     * 
     * The source name should describe in a human-readable way
     * what the source does. For example, "X11 event queue"
     * or "GTK+ repaint idle handler" or whatever it is.
     * 
     * It is permitted to call this function multiple times, but is not
     * recommended due to the potential performance impact.  For example,
     * one could change the name in the "check" function of a #GSourceFuncs
     * to include details like the event type in the source name.
     * 
     * Use caution if changing the name while another thread may be
     * accessing it with g_source_get_name(); that function does not copy
     * the value, and changing the value will free it while the other thread
     * may be attempting to use it.
     * 
     * Also see g_source_set_static_name().
     */
    public void setName(java.lang.String name) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_source_set_name(HANDLE(), Interop.getAllocator().allocateUtf8String(name));
    }
    
    /**
     * Sets the priority of a source. While the main loop is being run, a
     * source will be dispatched if it is ready to be dispatched and no
     * sources at a higher (numerically smaller) priority are ready to be
     * dispatched.
     * 
     * A child source always has the same priority as its parent.  It is not
     * permitted to change the priority of a source once it has been added
     * as a child of another source.
     */
    public void setPriority(int priority) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_source_set_priority(HANDLE(), priority);
    }
    
    /**
     * Sets a #GSource to be dispatched when the given monotonic time is
     * reached (or passed).  If the monotonic time is in the past (as it
     * always will be if @ready_time is 0) then the source will be
     * dispatched immediately.
     * 
     * If @ready_time is -1 then the source is never woken up on the basis
     * of the passage of time.
     * 
     * Dispatching the source does not reset the ready time.  You should do
     * so yourself, from the source dispatch function.
     * 
     * Note that if you have a pair of sources where the ready time of one
     * suggests that it will be delivered first but the priority for the
     * other suggests that it would be delivered first, and the ready time
     * for both sources is reached during the same main context iteration,
     * then the order of dispatch is undefined.
     * 
     * It is a no-op to call this function on a #GSource which has already been
     * destroyed with g_source_destroy().
     * 
     * This API is only intended to be used by implementations of #GSource.
     * Do not call this API on a #GSource that you did not create.
     */
    public void setReadyTime(long readyTime) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_source_set_ready_time(HANDLE(), readyTime);
    }
    
    /**
     * A variant of g_source_set_name() that does not
     * duplicate the @name, and can only be used with
     * string literals.
     */
    public void setStaticName(java.lang.String name) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_source_set_static_name(HANDLE(), Interop.getAllocator().allocateUtf8String(name));
    }
    
    /**
     * Decreases the reference count of a source by one. If the
     * resulting reference count is zero the source and associated
     * memory will be destroyed.
     */
    public void unref() {
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_source_unref(HANDLE());
    }
    
}