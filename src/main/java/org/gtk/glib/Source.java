package org.gtk.glib;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The {@code GSource} struct is an opaque data type
 * representing an event source.
 */
public class Source extends Struct {
    
    static {
        GLib.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GSource";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            Interop.valueLayout.ADDRESS.withName("callback_data"),
            Interop.valueLayout.ADDRESS.withName("callback_funcs"),
            Interop.valueLayout.ADDRESS.withName("source_funcs"),
            Interop.valueLayout.C_INT.withName("ref_count"),
            MemoryLayout.paddingLayout(32),
            Interop.valueLayout.ADDRESS.withName("context"),
            Interop.valueLayout.C_INT.withName("priority"),
            Interop.valueLayout.C_INT.withName("flags"),
            Interop.valueLayout.C_INT.withName("source_id"),
            MemoryLayout.paddingLayout(32),
            Interop.valueLayout.ADDRESS.withName("poll_fds"),
            Interop.valueLayout.ADDRESS.withName("prev"),
            Interop.valueLayout.ADDRESS.withName("next"),
            Interop.valueLayout.ADDRESS.withName("name"),
            Interop.valueLayout.ADDRESS.withName("priv")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link Source}
     * @return A new, uninitialized @{link Source}
     */
    public static Source allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        Source newInstance = new Source(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a Source proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected Source(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, Source> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new Source(input);
    
    private static MemoryAddress constructNew(org.gtk.glib.SourceFuncs sourceFuncs, int structSize) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_source_new.invokeExact(
                    sourceFuncs.handle(),
                    structSize);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
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
     * @param sourceFuncs structure containing functions that implement
     *                the sources behavior.
     * @param structSize size of the {@link Source} structure to create.
     */
    public Source(org.gtk.glib.SourceFuncs sourceFuncs, int structSize) {
        super(constructNew(sourceFuncs, structSize));
        this.takeOwnership();
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
     * @param childSource a second {@link Source} that {@code source} should "poll"
     */
    public void addChildSource(org.gtk.glib.Source childSource) {
        try {
            DowncallHandles.g_source_add_child_source.invokeExact(
                    handle(),
                    childSource.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
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
     * @param fd a {@link PollFD} structure holding information about a file
     *      descriptor to watch.
     */
    public void addPoll(org.gtk.glib.PollFD fd) {
        try {
            DowncallHandles.g_source_add_poll.invokeExact(
                    handle(),
                    fd.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
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
     * @param fd the fd to monitor
     * @param events an event mask
     * @return an opaque tag
     */
    public java.lang.foreign.MemoryAddress addUnixFd(int fd, org.gtk.glib.IOCondition events) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_source_add_unix_fd.invokeExact(
                    handle(),
                    fd,
                    events.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Adds a {@link Source} to a {@code context} so that it will be executed within
     * that context. Remove it by calling g_source_destroy().
     * <p>
     * This function is safe to call from any thread, regardless of which thread
     * the {@code context} is running in.
     * @param context a {@link MainContext} (if {@code null}, the default context will be used)
     * @return the ID (greater than 0) for the source within the
     *   {@link MainContext}.
     */
    public int attach(@Nullable org.gtk.glib.MainContext context) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_source_attach.invokeExact(
                    handle(),
                    (Addressable) (context == null ? MemoryAddress.NULL : context.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
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
        try {
            DowncallHandles.g_source_destroy.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Checks whether a source is allowed to be called recursively.
     * see g_source_set_can_recurse().
     * @return whether recursion is allowed.
     */
    public boolean getCanRecurse() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_source_get_can_recurse.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
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
     * @return the {@link MainContext} with which the
     *               source is associated, or {@code null} if the context has not
     *               yet been added to a source.
     */
    public @Nullable org.gtk.glib.MainContext getContext() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_source_get_context.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.glib.MainContext.fromAddress.marshal(RESULT, null);
    }
    
    /**
     * This function ignores {@code source} and is otherwise the same as
     * g_get_current_time().
     * @param timeval {@link TimeVal} structure in which to store current time.
     * @deprecated use g_source_get_time() instead
     */
    @Deprecated
    public void getCurrentTime(org.gtk.glib.TimeVal timeval) {
        try {
            DowncallHandles.g_source_get_current_time.invokeExact(
                    handle(),
                    timeval.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
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
     * @return the ID (greater than 0) for the source
     */
    public int getId() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_source_get_id.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Gets a name for the source, used in debugging and profiling.  The
     * name may be {@code NULL} if it has never been set with g_source_set_name().
     * @return the name of the source
     */
    public @Nullable java.lang.String getName() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_source_get_name.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Gets the priority of a source.
     * @return the priority of the source
     */
    public int getPriority() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_source_get_priority.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Gets the "ready time" of {@code source}, as set by
     * g_source_set_ready_time().
     * <p>
     * Any time before the current monotonic time (including 0) is an
     * indication that the source will fire immediately.
     * @return the monotonic ready time, -1 for "never"
     */
    public long getReadyTime() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.g_source_get_ready_time.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
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
     * @return the monotonic time in microseconds
     */
    public long getTime() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.g_source_get_time.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Returns whether {@code source} has been destroyed.
     * <p>
     * This is important when you operate upon your objects
     * from within idle handlers, but may have freed the object
     * before the dispatch of your idle handler.
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
     * @return {@code true} if the source has been destroyed
     */
    public boolean isDestroyed() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_source_is_destroyed.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
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
     * @param tag the tag from g_source_add_unix_fd()
     * @param newEvents the new event mask to watch
     */
    public void modifyUnixFd(java.lang.foreign.MemoryAddress tag, org.gtk.glib.IOCondition newEvents) {
        try {
            DowncallHandles.g_source_modify_unix_fd.invokeExact(
                    handle(),
                    (Addressable) tag,
                    newEvents.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
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
     * @param tag the tag from g_source_add_unix_fd()
     * @return the conditions reported on the fd
     */
    public org.gtk.glib.IOCondition queryUnixFd(java.lang.foreign.MemoryAddress tag) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_source_query_unix_fd.invokeExact(
                    handle(),
                    (Addressable) tag);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.IOCondition(RESULT);
    }
    
    /**
     * Increases the reference count on a source by one.
     * @return {@code source}
     */
    public org.gtk.glib.Source ref() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_source_ref.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        var OBJECT = org.gtk.glib.Source.fromAddress.marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    /**
     * Detaches {@code child_source} from {@code source} and destroys it.
     * <p>
     * This API is only intended to be used by implementations of {@link Source}.
     * Do not call this API on a {@link Source} that you did not create.
     * @param childSource a {@link Source} previously passed to
     *     g_source_add_child_source().
     */
    public void removeChildSource(org.gtk.glib.Source childSource) {
        try {
            DowncallHandles.g_source_remove_child_source.invokeExact(
                    handle(),
                    childSource.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Removes a file descriptor from the set of file descriptors polled for
     * this source.
     * <p>
     * This API is only intended to be used by implementations of {@link Source}.
     * Do not call this API on a {@link Source} that you did not create.
     * @param fd a {@link PollFD} structure previously passed to g_source_add_poll().
     */
    public void removePoll(org.gtk.glib.PollFD fd) {
        try {
            DowncallHandles.g_source_remove_poll.invokeExact(
                    handle(),
                    fd.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
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
     * @param tag the tag from g_source_add_unix_fd()
     */
    public void removeUnixFd(java.lang.foreign.MemoryAddress tag) {
        try {
            DowncallHandles.g_source_remove_unix_fd.invokeExact(
                    handle(),
                    (Addressable) tag);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
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
     * @param func a callback function
     * @param notify a function to call when {@code data} is no longer in use, or {@code null}.
     */
    public void setCallback(org.gtk.glib.SourceFunc func, @Nullable org.gtk.glib.DestroyNotify notify) {
        try {
            DowncallHandles.g_source_set_callback.invokeExact(
                    handle(),
                    (Addressable) func.toCallback(),
                    (Addressable) MemoryAddress.NULL,
                    (Addressable) (notify == null ? MemoryAddress.NULL : (Addressable) notify.toCallback()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the callback function storing the data as a refcounted callback
     * "object". This is used internally. Note that calling
     * g_source_set_callback_indirect() assumes
     * an initial reference count on {@code callback_data}, and thus
     * {@code callback_funcs}-&gt;unref will eventually be called once more
     * than {@code callback_funcs}-&gt;ref.
     * <p>
     * It is safe to call this function multiple times on a source which has already
     * been attached to a context. The changes will take effect for the next time
     * the source is dispatched after this call returns.
     * @param callbackFuncs functions for reference counting {@code callback_data}
     *                  and getting the callback and data
     */
    public void setCallbackIndirect(org.gtk.glib.SourceCallbackFuncs callbackFuncs) {
        try {
            DowncallHandles.g_source_set_callback_indirect.invokeExact(
                    handle(),
                    (Addressable) MemoryAddress.NULL,
                    callbackFuncs.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets whether a source can be called recursively. If {@code can_recurse} is
     * {@code true}, then while the source is being dispatched then this source
     * will be processed normally. Otherwise, all processing of this
     * source is blocked until the dispatch function returns.
     * @param canRecurse whether recursion is allowed for this source
     */
    public void setCanRecurse(boolean canRecurse) {
        try {
            DowncallHandles.g_source_set_can_recurse.invokeExact(
                    handle(),
                    Marshal.booleanToInteger.marshal(canRecurse, null).intValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Set {@code dispose} as dispose function on {@code source}. {@code dispose} will be called once
     * the reference count of {@code source} reaches 0 but before any of the state of the
     * source is freed, especially before the finalize function is called.
     * <p>
     * This means that at this point {@code source} is still a valid {@link Source} and it is
     * allow for the reference count to increase again until {@code dispose} returns.
     * <p>
     * The dispose function can be used to clear any "weak" references to the
     * {@code source} in other data structures in a thread-safe way where it is possible
     * for another thread to increase the reference count of {@code source} again while
     * it is being freed.
     * <p>
     * The finalize function can not be used for this purpose as at that point
     * {@code source} is already partially freed and not valid anymore.
     * <p>
     * This should only ever be called from {@link Source} implementations.
     * @param dispose {@link SourceDisposeFunc} to set on the source
     */
    public void setDisposeFunction(org.gtk.glib.SourceDisposeFunc dispose) {
        try {
            DowncallHandles.g_source_set_dispose_function.invokeExact(
                    handle(),
                    (Addressable) dispose.toCallback());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the source functions (can be used to override
     * default implementations) of an unattached source.
     * @param funcs the new {@link SourceFuncs}
     */
    public void setFuncs(org.gtk.glib.SourceFuncs funcs) {
        try {
            DowncallHandles.g_source_set_funcs.invokeExact(
                    handle(),
                    funcs.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
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
     * @param name debug name for the source
     */
    public void setName(java.lang.String name) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            try {
                DowncallHandles.g_source_set_name.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(name, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
        }
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
     * @param priority the new priority.
     */
    public void setPriority(int priority) {
        try {
            DowncallHandles.g_source_set_priority.invokeExact(
                    handle(),
                    priority);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
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
     * @param readyTime the monotonic time at which the source will be ready,
     *              0 for "immediately", -1 for "never"
     */
    public void setReadyTime(long readyTime) {
        try {
            DowncallHandles.g_source_set_ready_time.invokeExact(
                    handle(),
                    readyTime);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * A variant of g_source_set_name() that does not
     * duplicate the {@code name}, and can only be used with
     * string literals.
     * @param name debug name for the source
     */
    public void setStaticName(java.lang.String name) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            try {
                DowncallHandles.g_source_set_static_name.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(name, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
        }
    }
    
    /**
     * Decreases the reference count of a source by one. If the
     * resulting reference count is zero the source and associated
     * memory will be destroyed.
     */
    public void unref() {
        try {
            DowncallHandles.g_source_unref.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
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
     * @param tag the ID of the source to remove.
     * @return {@code true} if the source was found and removed.
     */
    public static boolean remove(int tag) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_source_remove.invokeExact(tag);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Removes a source from the default main loop context given the
     * source functions and user data. If multiple sources exist with the
     * same source functions and user data, only one will be destroyed.
     * @param funcs The {@code source_funcs} passed to g_source_new()
     * @return {@code true} if a source was found and removed.
     */
    public static boolean removeByFuncsUserData(org.gtk.glib.SourceFuncs funcs) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_source_remove_by_funcs_user_data.invokeExact(
                    funcs.handle(),
                    (Addressable) MemoryAddress.NULL);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Removes a source from the default main loop context given the user
     * data for the callback. If multiple sources exist with the same user
     * data, only one will be destroyed.
     * @return {@code true} if a source was found and removed.
     */
    public static boolean removeByUserData() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_source_remove_by_user_data.invokeExact((Addressable) MemoryAddress.NULL);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
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
     * @param tag a {@link Source} ID
     * @param name debug name for the source
     */
    public static void setNameById(int tag, java.lang.String name) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            try {
                DowncallHandles.g_source_set_name_by_id.invokeExact(
                        tag,
                        Marshal.stringToAddress.marshal(name, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle g_source_new = Interop.downcallHandle(
                "g_source_new",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle g_source_add_child_source = Interop.downcallHandle(
                "g_source_add_child_source",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_source_add_poll = Interop.downcallHandle(
                "g_source_add_poll",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_source_add_unix_fd = Interop.downcallHandle(
                "g_source_add_unix_fd",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle g_source_attach = Interop.downcallHandle(
                "g_source_attach",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_source_destroy = Interop.downcallHandle(
                "g_source_destroy",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_source_get_can_recurse = Interop.downcallHandle(
                "g_source_get_can_recurse",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_source_get_context = Interop.downcallHandle(
                "g_source_get_context",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_source_get_current_time = Interop.downcallHandle(
                "g_source_get_current_time",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_source_get_id = Interop.downcallHandle(
                "g_source_get_id",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_source_get_name = Interop.downcallHandle(
                "g_source_get_name",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_source_get_priority = Interop.downcallHandle(
                "g_source_get_priority",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_source_get_ready_time = Interop.downcallHandle(
                "g_source_get_ready_time",
                FunctionDescriptor.of(Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_source_get_time = Interop.downcallHandle(
                "g_source_get_time",
                FunctionDescriptor.of(Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_source_is_destroyed = Interop.downcallHandle(
                "g_source_is_destroyed",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_source_modify_unix_fd = Interop.downcallHandle(
                "g_source_modify_unix_fd",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle g_source_query_unix_fd = Interop.downcallHandle(
                "g_source_query_unix_fd",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_source_ref = Interop.downcallHandle(
                "g_source_ref",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_source_remove_child_source = Interop.downcallHandle(
                "g_source_remove_child_source",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_source_remove_poll = Interop.downcallHandle(
                "g_source_remove_poll",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_source_remove_unix_fd = Interop.downcallHandle(
                "g_source_remove_unix_fd",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_source_set_callback = Interop.downcallHandle(
                "g_source_set_callback",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_source_set_callback_indirect = Interop.downcallHandle(
                "g_source_set_callback_indirect",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_source_set_can_recurse = Interop.downcallHandle(
                "g_source_set_can_recurse",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle g_source_set_dispose_function = Interop.downcallHandle(
                "g_source_set_dispose_function",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_source_set_funcs = Interop.downcallHandle(
                "g_source_set_funcs",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_source_set_name = Interop.downcallHandle(
                "g_source_set_name",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_source_set_priority = Interop.downcallHandle(
                "g_source_set_priority",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle g_source_set_ready_time = Interop.downcallHandle(
                "g_source_set_ready_time",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG),
                false
        );
        
        private static final MethodHandle g_source_set_static_name = Interop.downcallHandle(
                "g_source_set_static_name",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_source_unref = Interop.downcallHandle(
                "g_source_unref",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_source_remove = Interop.downcallHandle(
                "g_source_remove",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle g_source_remove_by_funcs_user_data = Interop.downcallHandle(
                "g_source_remove_by_funcs_user_data",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_source_remove_by_user_data = Interop.downcallHandle(
                "g_source_remove_by_user_data",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_source_set_name_by_id = Interop.downcallHandle(
                "g_source_set_name_by_id",
                FunctionDescriptor.ofVoid(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
    }
    
    /**
     * A {@link Source.Builder} object constructs a {@link Source} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link Source.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final Source struct;
        
        private Builder() {
            struct = Source.allocate();
        }
        
        /**
         * Finish building the {@link Source} struct.
         * @return A new instance of {@code Source} with the fields 
         *         that were set in the Builder object.
         */
        public Source build() {
            return struct;
        }
        
        public Builder setCallbackData(java.lang.foreign.MemoryAddress callbackData) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("callback_data"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (callbackData == null ? MemoryAddress.NULL : (Addressable) callbackData));
                return this;
            }
        }
        
        public Builder setCallbackFuncs(org.gtk.glib.SourceCallbackFuncs callbackFuncs) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("callback_funcs"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (callbackFuncs == null ? MemoryAddress.NULL : callbackFuncs.handle()));
                return this;
            }
        }
        
        public Builder setSourceFuncs(org.gtk.glib.SourceFuncs sourceFuncs) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("source_funcs"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (sourceFuncs == null ? MemoryAddress.NULL : sourceFuncs.handle()));
                return this;
            }
        }
        
        public Builder setRefCount(int refCount) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("ref_count"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), refCount);
                return this;
            }
        }
        
        public Builder setContext(org.gtk.glib.MainContext context) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("context"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (context == null ? MemoryAddress.NULL : context.handle()));
                return this;
            }
        }
        
        public Builder setPriority(int priority) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("priority"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), priority);
                return this;
            }
        }
        
        public Builder setFlags(int flags) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("flags"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), flags);
                return this;
            }
        }
        
        public Builder setSourceId(int sourceId) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("source_id"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), sourceId);
                return this;
            }
        }
        
        public Builder setPollFds(org.gtk.glib.SList pollFds) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("poll_fds"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (pollFds == null ? MemoryAddress.NULL : pollFds.handle()));
                return this;
            }
        }
        
        public Builder setPrev(org.gtk.glib.Source prev) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("prev"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (prev == null ? MemoryAddress.NULL : prev.handle()));
                return this;
            }
        }
        
        public Builder setNext(org.gtk.glib.Source next) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("next"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (next == null ? MemoryAddress.NULL : next.handle()));
                return this;
            }
        }
        
        public Builder setName(java.lang.String name) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("name"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (name == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(name, SCOPE)));
                return this;
            }
        }
        
        public Builder setPriv(org.gtk.glib.SourcePrivate priv) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("priv"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (priv == null ? MemoryAddress.NULL : priv.handle()));
                return this;
            }
        }
    }
}
