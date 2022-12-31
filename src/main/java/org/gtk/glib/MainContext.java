package org.gtk.glib;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The {@code GMainContext} struct is an opaque data
 * type representing a set of sources to be handled in a main loop.
 */
public class MainContext extends Struct {
    
    static {
        GLib.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GMainContext";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link MainContext}
     * @return A new, uninitialized @{link MainContext}
     */
    public static MainContext allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        MainContext newInstance = new MainContext(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a MainContext proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected MainContext(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, MainContext> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new MainContext(input, ownership);
    
    private static MemoryAddress constructNew() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_main_context_new.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new {@link MainContext} structure.
     */
    public MainContext() {
        super(constructNew(), Ownership.FULL);
    }
    
    private static MemoryAddress constructNewWithFlags(org.gtk.glib.MainContextFlags flags) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_main_context_new_with_flags.invokeExact(
                    flags.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new {@link MainContext} structure.
     * @param flags a bitwise-OR combination of {@link MainContextFlags} flags that can only be
     *         set at creation time.
     * @return the new {@link MainContext}
     */
    public static MainContext newWithFlags(org.gtk.glib.MainContextFlags flags) {
        var RESULT = constructNewWithFlags(flags);
        return org.gtk.glib.MainContext.fromAddress.marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * Tries to become the owner of the specified context.
     * If some other thread is the owner of the context,
     * returns {@code false} immediately. Ownership is properly
     * recursive: the owner can require ownership again
     * and will release ownership when g_main_context_release()
     * is called as many times as g_main_context_acquire().
     * <p>
     * You must be the owner of a context before you
     * can call g_main_context_prepare(), g_main_context_query(),
     * g_main_context_check(), g_main_context_dispatch().
     * @return {@code true} if the operation succeeded, and
     *   this thread is now the owner of {@code context}.
     */
    public boolean acquire() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_main_context_acquire.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Adds a file descriptor to the set of file descriptors polled for
     * this context. This will very seldom be used directly. Instead
     * a typical event source will use g_source_add_unix_fd() instead.
     * @param fd a {@link PollFD} structure holding information about a file
     *      descriptor to watch.
     * @param priority the priority for this file descriptor which should be
     *      the same as the priority used for g_source_attach() to ensure that the
     *      file descriptor is polled whenever the results may be needed.
     */
    public void addPoll(org.gtk.glib.PollFD fd, int priority) {
        try {
            DowncallHandles.g_main_context_add_poll.invokeExact(
                    handle(),
                    fd.handle(),
                    priority);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Passes the results of polling back to the main loop. You should be
     * careful to pass {@code fds} and its length {@code n_fds} as received from
     * g_main_context_query(), as this functions relies on assumptions
     * on how {@code fds} is filled.
     * <p>
     * You must have successfully acquired the context with
     * g_main_context_acquire() before you may call this function.
     * @param maxPriority the maximum numerical priority of sources to check
     * @param fds array of {@link PollFD}'s that was passed to
     *       the last call to g_main_context_query()
     * @param nFds return value of g_main_context_query()
     * @return {@code true} if some sources are ready to be dispatched.
     */
    public boolean check(int maxPriority, org.gtk.glib.PollFD[] fds, int nFds) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_main_context_check.invokeExact(
                    handle(),
                    maxPriority,
                    Interop.allocateNativeArray(fds, org.gtk.glib.PollFD.getMemoryLayout(), false),
                    nFds);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Dispatches all pending sources.
     * <p>
     * You must have successfully acquired the context with
     * g_main_context_acquire() before you may call this function.
     */
    public void dispatch() {
        try {
            DowncallHandles.g_main_context_dispatch.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Finds a source with the given source functions and user data.  If
     * multiple sources exist with the same source function and user data,
     * the first one found will be returned.
     * @param funcs the {@code source_funcs} passed to g_source_new().
     * @return the source, if one was found, otherwise {@code null}
     */
    public org.gtk.glib.Source findSourceByFuncsUserData(org.gtk.glib.SourceFuncs funcs) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_main_context_find_source_by_funcs_user_data.invokeExact(
                    handle(),
                    funcs.handle(),
                    (Addressable) MemoryAddress.NULL);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.glib.Source.fromAddress.marshal(RESULT, Ownership.NONE);
    }
    
    /**
     * Finds a {@link Source} given a pair of context and ID.
     * <p>
     * It is a programmer error to attempt to look up a non-existent source.
     * <p>
     * More specifically: source IDs can be reissued after a source has been
     * destroyed and therefore it is never valid to use this function with a
     * source ID which may have already been removed.  An example is when
     * scheduling an idle to run in another thread with g_idle_add(): the
     * idle may already have run and been removed by the time this function
     * is called on its (now invalid) source ID.  This source ID may have
     * been reissued, leading to the operation being performed against the
     * wrong source.
     * @param sourceId the source ID, as returned by g_source_get_id().
     * @return the {@link Source}
     */
    public org.gtk.glib.Source findSourceById(int sourceId) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_main_context_find_source_by_id.invokeExact(
                    handle(),
                    sourceId);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.glib.Source.fromAddress.marshal(RESULT, Ownership.NONE);
    }
    
    /**
     * Finds a source with the given user data for the callback.  If
     * multiple sources exist with the same user data, the first
     * one found will be returned.
     * @return the source, if one was found, otherwise {@code null}
     */
    public org.gtk.glib.Source findSourceByUserData() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_main_context_find_source_by_user_data.invokeExact(
                    handle(),
                    (Addressable) MemoryAddress.NULL);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.glib.Source.fromAddress.marshal(RESULT, Ownership.NONE);
    }
    
    /**
     * Gets the poll function set by g_main_context_set_poll_func().
     * @return the poll function
     */
    public org.gtk.glib.PollFunc getPollFunc() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_main_context_get_poll_func.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return null /* Unsupported parameter type */;
    }
    
    /**
     * Invokes a function in such a way that {@code context} is owned during the
     * invocation of {@code function}.
     * <p>
     * If {@code context} is {@code null} then the global default main context — as
     * returned by g_main_context_default() — is used.
     * <p>
     * If {@code context} is owned by the current thread, {@code function} is called
     * directly.  Otherwise, if {@code context} is the thread-default main context
     * of the current thread and g_main_context_acquire() succeeds, then
     * {@code function} is called and g_main_context_release() is called
     * afterwards.
     * <p>
     * In any other case, an idle source is created to call {@code function} and
     * that source is attached to {@code context} (presumably to be run in another
     * thread).  The idle source is attached with {@code G_PRIORITY_DEFAULT}
     * priority.  If you want a different priority, use
     * g_main_context_invoke_full().
     * <p>
     * Note that, as with normal idle functions, {@code function} should probably
     * return {@code false}.  If it returns {@code true}, it will be continuously run in a
     * loop (and may prevent this call from returning).
     * @param function function to call
     */
    public void invoke(org.gtk.glib.SourceFunc function) {
        try {
            DowncallHandles.g_main_context_invoke.invokeExact(
                    handle(),
                    (Addressable) function.toCallback(),
                    (Addressable) MemoryAddress.NULL);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Invokes a function in such a way that {@code context} is owned during the
     * invocation of {@code function}.
     * <p>
     * This function is the same as g_main_context_invoke() except that it
     * lets you specify the priority in case {@code function} ends up being
     * scheduled as an idle and also lets you give a {@link DestroyNotify} for {@code data}.
     * <p>
     * {@code notify} should not assume that it is called from any particular
     * thread or with any particular context acquired.
     * @param priority the priority at which to run {@code function}
     * @param function function to call
     * @param notify a function to call when {@code data} is no longer in use, or {@code null}.
     */
    public void invokeFull(int priority, org.gtk.glib.SourceFunc function, @Nullable org.gtk.glib.DestroyNotify notify) {
        try {
            DowncallHandles.g_main_context_invoke_full.invokeExact(
                    handle(),
                    priority,
                    (Addressable) function.toCallback(),
                    (Addressable) MemoryAddress.NULL,
                    (Addressable) (notify == null ? MemoryAddress.NULL : (Addressable) notify.toCallback()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Determines whether this thread holds the (recursive)
     * ownership of this {@link MainContext}. This is useful to
     * know before waiting on another thread that may be
     * blocking to get ownership of {@code context}.
     * @return {@code true} if current thread is owner of {@code context}.
     */
    public boolean isOwner() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_main_context_is_owner.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Runs a single iteration for the given main loop. This involves
     * checking to see if any event sources are ready to be processed,
     * then if no events sources are ready and {@code may_block} is {@code true}, waiting
     * for a source to become ready, then dispatching the highest priority
     * events sources that are ready. Otherwise, if {@code may_block} is {@code false}
     * sources are not waited to become ready, only those highest priority
     * events sources will be dispatched (if any), that are ready at this
     * given moment without further waiting.
     * <p>
     * Note that even when {@code may_block} is {@code true}, it is still possible for
     * g_main_context_iteration() to return {@code false}, since the wait may
     * be interrupted for other reasons than an event source becoming ready.
     * @param mayBlock whether the call may block.
     * @return {@code true} if events were dispatched.
     */
    public boolean iteration(boolean mayBlock) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_main_context_iteration.invokeExact(
                    handle(),
                    Marshal.booleanToInteger.marshal(mayBlock, null).intValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Checks if any sources have pending events for the given context.
     * @return {@code true} if events are pending.
     */
    public boolean pending() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_main_context_pending.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Pops {@code context} off the thread-default context stack (verifying that
     * it was on the top of the stack).
     */
    public void popThreadDefault() {
        try {
            DowncallHandles.g_main_context_pop_thread_default.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Prepares to poll sources within a main loop. The resulting information
     * for polling is determined by calling g_main_context_query ().
     * <p>
     * You must have successfully acquired the context with
     * g_main_context_acquire() before you may call this function.
     * @param priority location to store priority of highest priority
     *            source already ready.
     * @return {@code true} if some source is ready to be dispatched
     *               prior to polling.
     */
    public boolean prepare(Out<Integer> priority) {
        MemorySegment priorityPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_main_context_prepare.invokeExact(
                    handle(),
                    (Addressable) (priority == null ? MemoryAddress.NULL : (Addressable) priorityPOINTER.address()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (priority != null) priority.set(priorityPOINTER.get(Interop.valueLayout.C_INT, 0));
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Acquires {@code context} and sets it as the thread-default context for the
     * current thread. This will cause certain asynchronous operations
     * (such as most [gio][gio]-based I/O) which are
     * started in this thread to run under {@code context} and deliver their
     * results to its main loop, rather than running under the global
     * default context in the main thread. Note that calling this function
     * changes the context returned by g_main_context_get_thread_default(),
     * not the one returned by g_main_context_default(), so it does not affect
     * the context used by functions like g_idle_add().
     * <p>
     * Normally you would call this function shortly after creating a new
     * thread, passing it a {@link MainContext} which will be run by a
     * {@link MainLoop} in that thread, to set a new default context for all
     * async operations in that thread. In this case you may not need to
     * ever call g_main_context_pop_thread_default(), assuming you want the
     * new {@link MainContext} to be the default for the whole lifecycle of the
     * thread.
     * <p>
     * If you don't have control over how the new thread was created (e.g.
     * in the new thread isn't newly created, or if the thread life
     * cycle is managed by a {@link ThreadPool}), it is always suggested to wrap
     * the logic that needs to use the new {@link MainContext} inside a
     * g_main_context_push_thread_default() / g_main_context_pop_thread_default()
     * pair, otherwise threads that are re-used will end up never explicitly
     * releasing the {@link MainContext} reference they hold.
     * <p>
     * In some cases you may want to schedule a single operation in a
     * non-default context, or temporarily use a non-default context in
     * the main thread. In that case, you can wrap the call to the
     * asynchronous operation inside a
     * g_main_context_push_thread_default() /
     * g_main_context_pop_thread_default() pair, but it is up to you to
     * ensure that no other asynchronous operations accidentally get
     * started while the non-default context is active.
     * <p>
     * Beware that libraries that predate this function may not correctly
     * handle being used from a thread with a thread-default context. Eg,
     * see g_file_supports_thread_contexts().
     */
    public void pushThreadDefault() {
        try {
            DowncallHandles.g_main_context_push_thread_default.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Determines information necessary to poll this main loop. You should
     * be careful to pass the resulting {@code fds} array and its length {@code n_fds}
     * as is when calling g_main_context_check(), as this function relies
     * on assumptions made when the array is filled.
     * <p>
     * You must have successfully acquired the context with
     * g_main_context_acquire() before you may call this function.
     * @param maxPriority maximum priority source to check
     * @param timeout location to store timeout to be used in polling
     * @param fds location to
     *       store {@link PollFD} records that need to be polled.
     * @param nFds length of {@code fds}.
     * @return the number of records actually stored in {@code fds},
     *   or, if more than {@code n_fds} records need to be stored, the number
     *   of records that need to be stored.
     */
    public int query(int maxPriority, Out<Integer> timeout, Out<org.gtk.glib.PollFD[]> fds, int nFds) {
        MemorySegment timeoutPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        MemorySegment fdsPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_main_context_query.invokeExact(
                    handle(),
                    maxPriority,
                    (Addressable) timeoutPOINTER.address(),
                    (Addressable) fdsPOINTER.address(),
                    nFds);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        timeout.set(timeoutPOINTER.get(Interop.valueLayout.C_INT, 0));
        org.gtk.glib.PollFD[] fdsARRAY = new org.gtk.glib.PollFD[nFds];
        for (int I = 0; I < nFds; I++) {
            var OBJ = fdsPOINTER.get(Interop.valueLayout.ADDRESS, I);
            fdsARRAY[I] = org.gtk.glib.PollFD.fromAddress.marshal(OBJ, Ownership.NONE);
        }
        fds.set(fdsARRAY);
        return RESULT;
    }
    
    /**
     * Increases the reference count on a {@link MainContext} object by one.
     * @return the {@code context} that was passed in (since 2.6)
     */
    public org.gtk.glib.MainContext ref() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_main_context_ref.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.glib.MainContext.fromAddress.marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * Releases ownership of a context previously acquired by this thread
     * with g_main_context_acquire(). If the context was acquired multiple
     * times, the ownership will be released only when g_main_context_release()
     * is called as many times as it was acquired.
     */
    public void release() {
        try {
            DowncallHandles.g_main_context_release.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Removes file descriptor from the set of file descriptors to be
     * polled for a particular context.
     * @param fd a {@link PollFD} descriptor previously added with g_main_context_add_poll()
     */
    public void removePoll(org.gtk.glib.PollFD fd) {
        try {
            DowncallHandles.g_main_context_remove_poll.invokeExact(
                    handle(),
                    fd.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the function to use to handle polling of file descriptors. It
     * will be used instead of the poll() system call
     * (or GLib's replacement function, which is used where
     * poll() isn't available).
     * <p>
     * This function could possibly be used to integrate the GLib event
     * loop with an external event loop.
     * @param func the function to call to poll all file descriptors
     */
    public void setPollFunc(org.gtk.glib.PollFunc func) {
        try {
            DowncallHandles.g_main_context_set_poll_func.invokeExact(
                    handle(),
                    (Addressable) func.toCallback());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Decreases the reference count on a {@link MainContext} object by one. If
     * the result is zero, free the context and free all associated memory.
     */
    public void unref() {
        try {
            DowncallHandles.g_main_context_unref.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Tries to become the owner of the specified context,
     * as with g_main_context_acquire(). But if another thread
     * is the owner, atomically drop {@code mutex} and wait on {@code cond} until
     * that owner releases ownership or until {@code cond} is signaled, then
     * try again (once) to become the owner.
     * @param cond a condition variable
     * @param mutex a mutex, currently held
     * @return {@code true} if the operation succeeded, and
     *   this thread is now the owner of {@code context}.
     * @deprecated Use g_main_context_is_owner() and separate locking instead.
     */
    @Deprecated
    public boolean wait_(org.gtk.glib.Cond cond, org.gtk.glib.Mutex mutex) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_main_context_wait.invokeExact(
                    handle(),
                    cond.handle(),
                    mutex.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * If {@code context} is currently blocking in g_main_context_iteration()
     * waiting for a source to become ready, cause it to stop blocking
     * and return.  Otherwise, cause the next invocation of
     * g_main_context_iteration() to return without blocking.
     * <p>
     * This API is useful for low-level control over {@link MainContext}; for
     * example, integrating it with main loop implementations such as
     * {@link MainLoop}.
     * <p>
     * Another related use for this function is when implementing a main
     * loop with a termination condition, computed from multiple threads:
     * <pre>{@code <!-- language="C" -->
     *   #define NUM_TASKS 10
     *   static gint tasks_remaining = NUM_TASKS;  // (atomic)
     *   ...
     *  
     *   while (g_atomic_int_get (&tasks_remaining) != 0)
     *     g_main_context_iteration (NULL, TRUE);
     * }</pre>
     *  
     * Then in a thread:
     * <pre>{@code <!-- language="C" -->
     *   perform_work();
     * 
     *   if (g_atomic_int_dec_and_test (&tasks_remaining))
     *     g_main_context_wakeup (NULL);
     * }</pre>
     */
    public void wakeup() {
        try {
            DowncallHandles.g_main_context_wakeup.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Returns the global default main context. This is the main context
     * used for main loop functions when a main loop is not explicitly
     * specified, and corresponds to the "main" main loop. See also
     * g_main_context_get_thread_default().
     * @return the global default main context.
     */
    public static org.gtk.glib.MainContext default_() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_main_context_default.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.glib.MainContext.fromAddress.marshal(RESULT, Ownership.NONE);
    }
    
    /**
     * Gets the thread-default {@link MainContext} for this thread. Asynchronous
     * operations that want to be able to be run in contexts other than
     * the default one should call this method or
     * g_main_context_ref_thread_default() to get a {@link MainContext} to add
     * their {@code GSources} to. (Note that even in single-threaded
     * programs applications may sometimes want to temporarily push a
     * non-default context, so it is not safe to assume that this will
     * always return {@code null} if you are running in the default thread.)
     * <p>
     * If you need to hold a reference on the context, use
     * g_main_context_ref_thread_default() instead.
     * @return the thread-default {@link MainContext}, or
     * {@code null} if the thread-default context is the global default context.
     */
    public static @Nullable org.gtk.glib.MainContext getThreadDefault() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_main_context_get_thread_default.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.glib.MainContext.fromAddress.marshal(RESULT, Ownership.NONE);
    }
    
    /**
     * Gets the thread-default {@link MainContext} for this thread, as with
     * g_main_context_get_thread_default(), but also adds a reference to
     * it with g_main_context_ref(). In addition, unlike
     * g_main_context_get_thread_default(), if the thread-default context
     * is the global default context, this will return that {@link MainContext}
     * (with a ref added to it) rather than returning {@code null}.
     * @return the thread-default {@link MainContext}. Unref
     *     with g_main_context_unref() when you are done with it.
     */
    public static org.gtk.glib.MainContext refThreadDefault() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_main_context_ref_thread_default.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.glib.MainContext.fromAddress.marshal(RESULT, Ownership.FULL);
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle g_main_context_new = Interop.downcallHandle(
            "g_main_context_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_main_context_new_with_flags = Interop.downcallHandle(
            "g_main_context_new_with_flags",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle g_main_context_acquire = Interop.downcallHandle(
            "g_main_context_acquire",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_main_context_add_poll = Interop.downcallHandle(
            "g_main_context_add_poll",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle g_main_context_check = Interop.downcallHandle(
            "g_main_context_check",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle g_main_context_dispatch = Interop.downcallHandle(
            "g_main_context_dispatch",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_main_context_find_source_by_funcs_user_data = Interop.downcallHandle(
            "g_main_context_find_source_by_funcs_user_data",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_main_context_find_source_by_id = Interop.downcallHandle(
            "g_main_context_find_source_by_id",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle g_main_context_find_source_by_user_data = Interop.downcallHandle(
            "g_main_context_find_source_by_user_data",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_main_context_get_poll_func = Interop.downcallHandle(
            "g_main_context_get_poll_func",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_main_context_invoke = Interop.downcallHandle(
            "g_main_context_invoke",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_main_context_invoke_full = Interop.downcallHandle(
            "g_main_context_invoke_full",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_main_context_is_owner = Interop.downcallHandle(
            "g_main_context_is_owner",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_main_context_iteration = Interop.downcallHandle(
            "g_main_context_iteration",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle g_main_context_pending = Interop.downcallHandle(
            "g_main_context_pending",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_main_context_pop_thread_default = Interop.downcallHandle(
            "g_main_context_pop_thread_default",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_main_context_prepare = Interop.downcallHandle(
            "g_main_context_prepare",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_main_context_push_thread_default = Interop.downcallHandle(
            "g_main_context_push_thread_default",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_main_context_query = Interop.downcallHandle(
            "g_main_context_query",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle g_main_context_ref = Interop.downcallHandle(
            "g_main_context_ref",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_main_context_release = Interop.downcallHandle(
            "g_main_context_release",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_main_context_remove_poll = Interop.downcallHandle(
            "g_main_context_remove_poll",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_main_context_set_poll_func = Interop.downcallHandle(
            "g_main_context_set_poll_func",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_main_context_unref = Interop.downcallHandle(
            "g_main_context_unref",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_main_context_wait = Interop.downcallHandle(
            "g_main_context_wait",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_main_context_wakeup = Interop.downcallHandle(
            "g_main_context_wakeup",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_main_context_default = Interop.downcallHandle(
            "g_main_context_default",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_main_context_get_thread_default = Interop.downcallHandle(
            "g_main_context_get_thread_default",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_main_context_ref_thread_default = Interop.downcallHandle(
            "g_main_context_ref_thread_default",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
            false
        );
    }
}
