package org.gtk.glib;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * The {@code GSource} struct is an opaque data type
 * representing an event source.
 */
public class Source extends io.github.jwharm.javagi.ResourceBase {

    public Source(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    private static Reference constructNew(SourceFuncs sourceFuncs, int structSize) {
        Reference RESULT = References.get(gtk_h.g_source_new(sourceFuncs.handle(), structSize), true);
        return RESULT;
    }
    
    /**
     * Creates a new {@link Source} structure. The size is specified to
     * allow creating structures derived from {@link Source} that contain
     * additional data. The size passed in must be at least
     * {@code sizeof (GSource)}.
     * <p>
     * The source will not initially be associated with any {@link MainContext}
     * and must be added to one with g_source_attach() before it will be
     * executed.
     */
    public Source(SourceFuncs sourceFuncs, int structSize) {
        super(constructNew(sourceFuncs, structSize));
    }
    
    /**
     * Adds {@code child_source} to {@code source} as a "polled" source; when {@code source} is
     * added to a {@link MainContext}, {@code child_source} will be automatically added
     * with the same priority, when {@code child_source} is triggered, it will
     * cause {@code source} to dispatch (in addition to calling its own
     * callback), and when {@code source} is destroyed, it will destroy
     * {@code child_source} as well. ({@code source} will also still be dispatched if
     * its own prepare/check functions indicate that it is ready.)
     * <p>
     * If you don't need {@code child_source} to do anything on its own when it
     * triggers, you can call g_source_set_dummy_callback() on it to set a
     * callback that does nothing (except return {@code true} if appropriate).
     * <p>
     * {@code source} will hold a reference on {@code child_source} while {@code child_source}
     * is attached to it.
     * <p>
     * This API is only intended to be used by implementations of {@link Source}.
     * Do not call this API on a {@link Source} that you did not create.
     */
    public void addChildSource(Source childSource) {
        gtk_h.g_source_add_child_source(handle(), childSource.handle());
    }
    
    /**
     * Adds a file descriptor to the set of file descriptors polled for
     * this source. This is usually combined with g_source_new() to add an
     * event source. The event source's check function will typically test
     * the {@code revents} field in the {@link PollFD} struct and return {@code true} if events need
     * to be processed.
     * <p>
     * This API is only intended to be used by implementations of {@link Source}.
     * Do not call this API on a {@link Source} that you did not create.
     * <p>
     * Using this API forces the linear scanning of event sources on each
     * main loop iteration.  Newly-written event sources should try to use
     * g_source_add_unix_fd() instead of this API.
     */
    public void addPoll(PollFD fd) {
        gtk_h.g_source_add_poll(handle(), fd.handle());
    }
    
    /**
     * Monitors {@code fd} for the IO events in {@code events}.
     * <p>
     * The tag returned by this function can be used to remove or modify the
     * monitoring of the fd using g_source_remove_unix_fd() or
     * g_source_modify_unix_fd().
     * <p>
     * It is not necessary to remove the fd before destroying the source; it
     * will be cleaned up automatically.
     * <p>
     * This API is only intended to be used by implementations of {@link Source}.
     * Do not call this API on a {@link Source} that you did not create.
     * <p>
     * As the name suggests, this function is not available on Windows.
     */
    public java.lang.foreign.MemoryAddress addUnixFd(int fd, int events) {
        var RESULT = gtk_h.g_source_add_unix_fd(handle(), fd, events);
        return RESULT;
    }
    
    /**
     * Adds a {@link Source} to a {@code context} so that it will be executed within
     * that context. Remove it by calling g_source_destroy().
     * <p>
     * This function is safe to call from any thread, regardless of which thread
     * the {@code context} is running in.
     */
    public int attach(MainContext context) {
        var RESULT = gtk_h.g_source_attach(handle(), context.handle());
        return RESULT;
    }
    
    /**
     * Removes a source from its {@link MainContext}, if any, and mark it as
     * destroyed.  The source cannot be subsequently added to another
     * context. It is safe to call this on sources which have already been
     * removed from their context.
     * <p>
     * This does not unref the {@link Source}: if you still hold a reference, use
     * g_source_unref() to drop it.
     * <p>
     * This function is safe to call from any thread, regardless of which thread
     * the {@link MainContext} is running in.
     * <p>
     * If the source is currently attached to a {@link MainContext}, destroying it
     * will effectively unset the callback similar to calling g_source_set_callback().
     * This can mean, that the data's {@link DestroyNotify} gets called right away.
     */
    public void destroy() {
        gtk_h.g_source_destroy(handle());
    }
    
    /**
     * Checks whether a source is allowed to be called recursively.
     * see g_source_set_can_recurse().
     */
    public boolean getCanRecurse() {
        var RESULT = gtk_h.g_source_get_can_recurse(handle());
        return (RESULT != 0);
    }
    
    /**
     * Gets the {@link MainContext} with which the source is associated.
     * <p>
     * You can call this on a source that has been destroyed, provided
     * that the {@link MainContext} it was attached to still exists (in which
     * case it will return that {@link MainContext}). In particular, you can
     * always call this function on the source returned from
     * g_main_current_source(). But calling this function on a source
     * whose {@link MainContext} has been destroyed is an error.
     */
    public MainContext getContext() {
        var RESULT = gtk_h.g_source_get_context(handle());
        return new MainContext(References.get(RESULT, false));
    }
    
    /**
     * Returns the numeric ID for a particular source. The ID of a source
     * is a positive integer which is unique within a particular main loop
     * context. The reverse
     * mapping from ID to source is done by g_main_context_find_source_by_id().
     * <p>
     * You can only call this function while the source is associated to a
     * {@link MainContext} instance; calling this function before g_source_attach()
     * or after g_source_destroy() yields undefined behavior. The ID returned
     * is unique within the {@link MainContext} instance passed to g_source_attach().
     */
    public int getId() {
        var RESULT = gtk_h.g_source_get_id(handle());
        return RESULT;
    }
    
    /**
     * Gets a name for the source, used in debugging and profiling.  The
     * name may be {@code NULL} if it has never been set with g_source_set_name().
     */
    public java.lang.String getName() {
        var RESULT = gtk_h.g_source_get_name(handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Gets the priority of a source.
     */
    public int getPriority() {
        var RESULT = gtk_h.g_source_get_priority(handle());
        return RESULT;
    }
    
    /**
     * Gets the "ready time" of {@code source}, as set by
     * g_source_set_ready_time().
     * <p>
     * Any time before the current monotonic time (including 0) is an
     * indication that the source will fire immediately.
     */
    public long getReadyTime() {
        var RESULT = gtk_h.g_source_get_ready_time(handle());
        return RESULT;
    }
    
    /**
     * Gets the time to be used when checking this source. The advantage of
     * calling this function over calling g_get_monotonic_time() directly is
     * that when checking multiple sources, GLib can cache a single value
     * instead of having to repeatedly get the system monotonic time.
     * <p>
     * The time here is the system monotonic time, if available, or some
     * other reasonable alternative otherwise.  See g_get_monotonic_time().
     */
    public long getTime() {
        var RESULT = gtk_h.g_source_get_time(handle());
        return RESULT;
    }
    
    /**
     * Returns whether {@code source} has been destroyed.
     * <p>
     * This is important when you operate upon your objects
     * from within idle handlers, but may have freed the object
     * before the dispatch of your idle handler.
     * <p>
     * <pre>{@code <!-- language="C" -->
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
     * }</pre>
     * <p>
     * This will fail in a multi-threaded application if the
     * widget is destroyed before the idle handler fires due
     * to the use after free in the callback. A solution, to
     * this particular problem, is to check to if the source
     * has already been destroy within the callback.
     * <p>
     * <pre>{@code <!-- language="C" -->
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
     * }</pre>
     * <p>
     * Calls to this function from a thread other than the one acquired by the
     * {@link MainContext} the {@link Source} is attached to are typically redundant, as the
     * source could be destroyed immediately after this function returns. However,
     * once a source is destroyed it cannot be un-destroyed, so this function can be
     * used for opportunistic checks from any thread.
     */
    public boolean isDestroyed() {
        var RESULT = gtk_h.g_source_is_destroyed(handle());
        return (RESULT != 0);
    }
    
    /**
     * Updates the event mask to watch for the fd identified by {@code tag}.
     * <p>
     * {@code tag} is the tag returned from g_source_add_unix_fd().
     * <p>
     * If you want to remove a fd, don't set its event mask to zero.
     * Instead, call g_source_remove_unix_fd().
     * <p>
     * This API is only intended to be used by implementations of {@link Source}.
     * Do not call this API on a {@link Source} that you did not create.
     * <p>
     * As the name suggests, this function is not available on Windows.
     */
    public void modifyUnixFd(java.lang.foreign.MemoryAddress tag, int newEvents) {
        gtk_h.g_source_modify_unix_fd(handle(), tag, newEvents);
    }
    
    /**
     * Queries the events reported for the fd corresponding to {@code tag} on
     * {@code source} during the last poll.
     * <p>
     * The return value of this function is only defined when the function
     * is called from the check or dispatch functions for {@code source}.
     * <p>
     * This API is only intended to be used by implementations of {@link Source}.
     * Do not call this API on a {@link Source} that you did not create.
     * <p>
     * As the name suggests, this function is not available on Windows.
     */
    public int queryUnixFd(java.lang.foreign.MemoryAddress tag) {
        var RESULT = gtk_h.g_source_query_unix_fd(handle(), tag);
        return RESULT;
    }
    
    /**
     * Increases the reference count on a source by one.
     */
    public Source ref() {
        var RESULT = gtk_h.g_source_ref(handle());
        return new Source(References.get(RESULT, true));
    }
    
    /**
     * Detaches {@code child_source} from {@code source} and destroys it.
     * <p>
     * This API is only intended to be used by implementations of {@link Source}.
     * Do not call this API on a {@link Source} that you did not create.
     */
    public void removeChildSource(Source childSource) {
        gtk_h.g_source_remove_child_source(handle(), childSource.handle());
    }
    
    /**
     * Removes a file descriptor from the set of file descriptors polled for
     * this source.
     * <p>
     * This API is only intended to be used by implementations of {@link Source}.
     * Do not call this API on a {@link Source} that you did not create.
     */
    public void removePoll(PollFD fd) {
        gtk_h.g_source_remove_poll(handle(), fd.handle());
    }
    
    /**
     * Reverses the effect of a previous call to g_source_add_unix_fd().
     * <p>
     * You only need to call this if you want to remove an fd from being
     * watched while keeping the same source around.  In the normal case you
     * will just want to destroy the source.
     * <p>
     * This API is only intended to be used by implementations of {@link Source}.
     * Do not call this API on a {@link Source} that you did not create.
     * <p>
     * As the name suggests, this function is not available on Windows.
     */
    public void removeUnixFd(java.lang.foreign.MemoryAddress tag) {
        gtk_h.g_source_remove_unix_fd(handle(), tag);
    }
    
    /**
     * Sets the callback function for a source. The callback for a source is
     * called from the source's dispatch function.
     * <p>
     * The exact type of {@code func} depends on the type of source; ie. you
     * should not count on {@code func} being called with {@code data} as its first
     * parameter. Cast {@code func} with G_SOURCE_FUNC() to avoid warnings about
     * incompatible function types.
     * <p>
     * See [memory management of sources][mainloop-memory-management] for details
     * on how to handle memory management of {@code data}.
     * <p>
     * Typically, you won't use this function. Instead use functions specific
     * to the type of source you are using, such as g_idle_add() or g_timeout_add().
     * <p>
     * It is safe to call this function multiple times on a source which has already
     * been attached to a context. The changes will take effect for the next time
     * the source is dispatched after this call returns.
     * <p>
     * Note that g_source_destroy() for a currently attached source has the effect
     * of also unsetting the callback.
     */
    public void setCallback(SourceFunc func) {
        try {
            gtk_h.g_source_set_callback(handle(), 
                    Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(JVMCallbacks.class, "cbSourceFunc",
                            MethodType.methodType(boolean.class, MemoryAddress.class)),
                        FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    Interop.getAllocator().allocate(C_INT, Interop.registerCallback(func.hashCode(), func)), 
                    Interop.cbDestroyNotifySymbol());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Sets the callback function storing the data as a refcounted callback
     * "object". This is used internally. Note that calling
     * g_source_set_callback_indirect() assumes
     * an initial reference count on {@code callback_data}, and thus
     * {@code callback_funcs}->unref will eventually be called once more
     * than {@code callback_funcs}->ref.
     * <p>
     * It is safe to call this function multiple times on a source which has already
     * been attached to a context. The changes will take effect for the next time
     * the source is dispatched after this call returns.
     */
    public void setCallbackIndirect(java.lang.foreign.MemoryAddress callbackData, SourceCallbackFuncs callbackFuncs) {
        gtk_h.g_source_set_callback_indirect(handle(), callbackData, callbackFuncs.handle());
    }
    
    /**
     * Sets whether a source can be called recursively. If {@code can_recurse} is
     * {@code true}, then while the source is being dispatched then this source
     * will be processed normally. Otherwise, all processing of this
     * source is blocked until the dispatch function returns.
     */
    public void setCanRecurse(boolean canRecurse) {
        gtk_h.g_source_set_can_recurse(handle(), canRecurse ? 1 : 0);
    }
    
    /**
     * Sets the source functions (can be used to override
     * default implementations) of an unattached source.
     */
    public void setFuncs(SourceFuncs funcs) {
        gtk_h.g_source_set_funcs(handle(), funcs.handle());
    }
    
    /**
     * Sets a name for the source, used in debugging and profiling.
     * The name defaults to {@code NULL}.
     * <p>
     * The source name should describe in a human-readable way
     * what the source does. For example, "X11 event queue"
     * or "GTK+ repaint idle handler" or whatever it is.
     * <p>
     * It is permitted to call this function multiple times, but is not
     * recommended due to the potential performance impact.  For example,
     * one could change the name in the "check" function of a {@link SourceFuncs}
     * to include details like the event type in the source name.
     * <p>
     * Use caution if changing the name while another thread may be
     * accessing it with g_source_get_name(); that function does not copy
     * the value, and changing the value will free it while the other thread
     * may be attempting to use it.
     * <p>
     * Also see g_source_set_static_name().
     */
    public void setName(java.lang.String name) {
        gtk_h.g_source_set_name(handle(), Interop.allocateNativeString(name).handle());
    }
    
    /**
     * Sets the priority of a source. While the main loop is being run, a
     * source will be dispatched if it is ready to be dispatched and no
     * sources at a higher (numerically smaller) priority are ready to be
     * dispatched.
     * <p>
     * A child source always has the same priority as its parent.  It is not
     * permitted to change the priority of a source once it has been added
     * as a child of another source.
     */
    public void setPriority(int priority) {
        gtk_h.g_source_set_priority(handle(), priority);
    }
    
    /**
     * Sets a {@link Source} to be dispatched when the given monotonic time is
     * reached (or passed).  If the monotonic time is in the past (as it
     * always will be if {@code ready_time} is 0) then the source will be
     * dispatched immediately.
     * <p>
     * If {@code ready_time} is -1 then the source is never woken up on the basis
     * of the passage of time.
     * <p>
     * Dispatching the source does not reset the ready time.  You should do
     * so yourself, from the source dispatch function.
     * <p>
     * Note that if you have a pair of sources where the ready time of one
     * suggests that it will be delivered first but the priority for the
     * other suggests that it would be delivered first, and the ready time
     * for both sources is reached during the same main context iteration,
     * then the order of dispatch is undefined.
     * <p>
     * It is a no-op to call this function on a {@link Source} which has already been
     * destroyed with g_source_destroy().
     * <p>
     * This API is only intended to be used by implementations of {@link Source}.
     * Do not call this API on a {@link Source} that you did not create.
     */
    public void setReadyTime(long readyTime) {
        gtk_h.g_source_set_ready_time(handle(), readyTime);
    }
    
    /**
     * A variant of g_source_set_name() that does not
     * duplicate the {@code name}, and can only be used with
     * string literals.
     */
    public void setStaticName(java.lang.String name) {
        gtk_h.g_source_set_static_name(handle(), Interop.allocateNativeString(name).handle());
    }
    
    /**
     * Decreases the reference count of a source by one. If the
     * resulting reference count is zero the source and associated
     * memory will be destroyed.
     */
    public void unref() {
        gtk_h.g_source_unref(handle());
    }
    
    /**
     * Removes the source with the given ID from the default main context. You must
     * use g_source_destroy() for sources added to a non-default main context.
     * <p>
     * The ID of a {@link Source} is given by g_source_get_id(), or will be
     * returned by the functions g_source_attach(), g_idle_add(),
     * g_idle_add_full(), g_timeout_add(), g_timeout_add_full(),
     * g_child_watch_add(), g_child_watch_add_full(), g_io_add_watch(), and
     * g_io_add_watch_full().
     * <p>
     * It is a programmer error to attempt to remove a non-existent source.
     * <p>
     * More specifically: source IDs can be reissued after a source has been
     * destroyed and therefore it is never valid to use this function with a
     * source ID which may have already been removed.  An example is when
     * scheduling an idle to run in another thread with g_idle_add(): the
     * idle may already have run and been removed by the time this function
     * is called on its (now invalid) source ID.  This source ID may have
     * been reissued, leading to the operation being performed against the
     * wrong source.
     */
    public static boolean remove(int tag) {
        var RESULT = gtk_h.g_source_remove(tag);
        return (RESULT != 0);
    }
    
    /**
     * Removes a source from the default main loop context given the
     * source functions and user data. If multiple sources exist with the
     * same source functions and user data, only one will be destroyed.
     */
    public static boolean removeByFuncsUserData(SourceFuncs funcs, java.lang.foreign.MemoryAddress userData) {
        var RESULT = gtk_h.g_source_remove_by_funcs_user_data(funcs.handle(), userData);
        return (RESULT != 0);
    }
    
    /**
     * Removes a source from the default main loop context given the user
     * data for the callback. If multiple sources exist with the same user
     * data, only one will be destroyed.
     */
    public static boolean removeByUserData(java.lang.foreign.MemoryAddress userData) {
        var RESULT = gtk_h.g_source_remove_by_user_data(userData);
        return (RESULT != 0);
    }
    
    /**
     * Sets the name of a source using its ID.
     * <p>
     * This is a convenience utility to set source names from the return
     * value of g_idle_add(), g_timeout_add(), etc.
     * <p>
     * It is a programmer error to attempt to set the name of a non-existent
     * source.
     * <p>
     * More specifically: source IDs can be reissued after a source has been
     * destroyed and therefore it is never valid to use this function with a
     * source ID which may have already been removed.  An example is when
     * scheduling an idle to run in another thread with g_idle_add(): the
     * idle may already have run and been removed by the time this function
     * is called on its (now invalid) source ID.  This source ID may have
     * been reissued, leading to the operation being performed against the
     * wrong source.
     */
    public static void setNameById(int tag, java.lang.String name) {
        gtk_h.g_source_set_name_by_id(tag, Interop.allocateNativeString(name).handle());
    }
    
}
