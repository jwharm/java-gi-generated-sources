package org.gtk.glib;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * The {@code GMainContext} struct is an opaque data
 * type representing a set of sources to be handled in a main loop.
 */
public class MainContext extends io.github.jwharm.javagi.ResourceBase {

    public MainContext(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    static final MethodHandle g_main_context_new = Interop.downcallHandle(
        "g_main_context_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNew() {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) g_main_context_new.invokeExact(), true);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a new {@link MainContext} structure.
     */
    public MainContext() {
        super(constructNew());
    }
    
    static final MethodHandle g_main_context_new_with_flags = Interop.downcallHandle(
        "g_main_context_new_with_flags",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    private static Refcounted constructNewWithFlags(MainContextFlags flags) {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) g_main_context_new_with_flags.invokeExact(flags.getValue()), true);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a new {@link MainContext} structure.
     */
    public static MainContext newWithFlags(MainContextFlags flags) {
        return new MainContext(constructNewWithFlags(flags));
    }
    
    static final MethodHandle g_main_context_acquire = Interop.downcallHandle(
        "g_main_context_acquire",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
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
     */
    public boolean acquire() {
        try {
            var RESULT = (int) g_main_context_acquire.invokeExact(handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_main_context_add_poll = Interop.downcallHandle(
        "g_main_context_add_poll",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Adds a file descriptor to the set of file descriptors polled for
     * this context. This will very seldom be used directly. Instead
     * a typical event source will use g_source_add_unix_fd() instead.
     */
    public void addPoll(PollFD fd, int priority) {
        try {
            g_main_context_add_poll.invokeExact(handle(), fd.handle(), priority);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_main_context_check = Interop.downcallHandle(
        "g_main_context_check",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Passes the results of polling back to the main loop. You should be
     * careful to pass {@code fds} and its length {@code n_fds} as received from
     * g_main_context_query(), as this functions relies on assumptions
     * on how {@code fds} is filled.
     * <p>
     * You must have successfully acquired the context with
     * g_main_context_acquire() before you may call this function.
     */
    public boolean check(int maxPriority, PollFD[] fds, int nFds) {
        try {
            var RESULT = (int) g_main_context_check.invokeExact(handle(), maxPriority, Interop.allocateNativeArray(fds).handle(), nFds);
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_main_context_dispatch = Interop.downcallHandle(
        "g_main_context_dispatch",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Dispatches all pending sources.
     * <p>
     * You must have successfully acquired the context with
     * g_main_context_acquire() before you may call this function.
     */
    public void dispatch() {
        try {
            g_main_context_dispatch.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_main_context_find_source_by_funcs_user_data = Interop.downcallHandle(
        "g_main_context_find_source_by_funcs_user_data",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Finds a source with the given source functions and user data.  If
     * multiple sources exist with the same source function and user data,
     * the first one found will be returned.
     */
    public Source findSourceByFuncsUserData(SourceFuncs funcs, java.lang.foreign.MemoryAddress userData) {
        try {
            var RESULT = (MemoryAddress) g_main_context_find_source_by_funcs_user_data.invokeExact(handle(), funcs.handle(), userData);
            return new Source(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_main_context_find_source_by_id = Interop.downcallHandle(
        "g_main_context_find_source_by_id",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
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
     */
    public Source findSourceById(int sourceId) {
        try {
            var RESULT = (MemoryAddress) g_main_context_find_source_by_id.invokeExact(handle(), sourceId);
            return new Source(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_main_context_find_source_by_user_data = Interop.downcallHandle(
        "g_main_context_find_source_by_user_data",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Finds a source with the given user data for the callback.  If
     * multiple sources exist with the same user data, the first
     * one found will be returned.
     */
    public Source findSourceByUserData(java.lang.foreign.MemoryAddress userData) {
        try {
            var RESULT = (MemoryAddress) g_main_context_find_source_by_user_data.invokeExact(handle(), userData);
            return new Source(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_main_context_invoke = Interop.downcallHandle(
        "g_main_context_invoke",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
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
     */
    public void invoke(SourceFunc function) {
        try {
            g_main_context_invoke.invokeExact(handle(), 
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(GLib.class, "__cbSourceFunc",
                            MethodType.methodType(int.class, MemoryAddress.class)),
                        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(function.hashCode(), function)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_main_context_invoke_full = Interop.downcallHandle(
        "g_main_context_invoke_full",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
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
     */
    public void invokeFull(int priority, SourceFunc function) {
        try {
            g_main_context_invoke_full.invokeExact(handle(), priority, 
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(GLib.class, "__cbSourceFunc",
                            MethodType.methodType(int.class, MemoryAddress.class)),
                        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(function.hashCode(), function)), 
                    Interop.cbDestroyNotifySymbol());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_main_context_is_owner = Interop.downcallHandle(
        "g_main_context_is_owner",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Determines whether this thread holds the (recursive)
     * ownership of this {@link MainContext}. This is useful to
     * know before waiting on another thread that may be
     * blocking to get ownership of {@code context}.
     */
    public boolean isOwner() {
        try {
            var RESULT = (int) g_main_context_is_owner.invokeExact(handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_main_context_iteration = Interop.downcallHandle(
        "g_main_context_iteration",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
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
     */
    public boolean iteration(boolean mayBlock) {
        try {
            var RESULT = (int) g_main_context_iteration.invokeExact(handle(), mayBlock ? 1 : 0);
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_main_context_pending = Interop.downcallHandle(
        "g_main_context_pending",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Checks if any sources have pending events for the given context.
     */
    public boolean pending() {
        try {
            var RESULT = (int) g_main_context_pending.invokeExact(handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_main_context_pop_thread_default = Interop.downcallHandle(
        "g_main_context_pop_thread_default",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Pops {@code context} off the thread-default context stack (verifying that
     * it was on the top of the stack).
     */
    public void popThreadDefault() {
        try {
            g_main_context_pop_thread_default.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_main_context_prepare = Interop.downcallHandle(
        "g_main_context_prepare",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Prepares to poll sources within a main loop. The resulting information
     * for polling is determined by calling g_main_context_query ().
     * <p>
     * You must have successfully acquired the context with
     * g_main_context_acquire() before you may call this function.
     */
    public boolean prepare(PointerInteger priority) {
        try {
            var RESULT = (int) g_main_context_prepare.invokeExact(handle(), priority.handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_main_context_push_thread_default = Interop.downcallHandle(
        "g_main_context_push_thread_default",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
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
            g_main_context_push_thread_default.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_main_context_query = Interop.downcallHandle(
        "g_main_context_query",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Determines information necessary to poll this main loop. You should
     * be careful to pass the resulting {@code fds} array and its length {@code n_fds}
     * as is when calling g_main_context_check(), as this function relies
     * on assumptions made when the array is filled.
     * <p>
     * You must have successfully acquired the context with
     * g_main_context_acquire() before you may call this function.
     */
    public int query(int maxPriority, PointerInteger timeout, PollFD[] fds, int nFds) {
        try {
            var RESULT = (int) g_main_context_query.invokeExact(handle(), maxPriority, timeout.handle(), Interop.allocateNativeArray(fds).handle(), nFds);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_main_context_ref = Interop.downcallHandle(
        "g_main_context_ref",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Increases the reference count on a {@link MainContext} object by one.
     */
    public MainContext ref() {
        try {
            var RESULT = (MemoryAddress) g_main_context_ref.invokeExact(handle());
            return new MainContext(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_main_context_release = Interop.downcallHandle(
        "g_main_context_release",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Releases ownership of a context previously acquired by this thread
     * with g_main_context_acquire(). If the context was acquired multiple
     * times, the ownership will be released only when g_main_context_release()
     * is called as many times as it was acquired.
     */
    public void release() {
        try {
            g_main_context_release.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_main_context_remove_poll = Interop.downcallHandle(
        "g_main_context_remove_poll",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Removes file descriptor from the set of file descriptors to be
     * polled for a particular context.
     */
    public void removePoll(PollFD fd) {
        try {
            g_main_context_remove_poll.invokeExact(handle(), fd.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_main_context_unref = Interop.downcallHandle(
        "g_main_context_unref",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Decreases the reference count on a {@link MainContext} object by one. If
     * the result is zero, free the context and free all associated memory.
     */
    public void unref() {
        try {
            g_main_context_unref.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_main_context_wakeup = Interop.downcallHandle(
        "g_main_context_wakeup",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
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
     * <p>
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
            g_main_context_wakeup.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_main_context_default = Interop.downcallHandle(
        "g_main_context_default",
        FunctionDescriptor.of(ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the global default main context. This is the main context
     * used for main loop functions when a main loop is not explicitly
     * specified, and corresponds to the "main" main loop. See also
     * g_main_context_get_thread_default().
     */
    public static MainContext default_() {
        try {
            var RESULT = (MemoryAddress) g_main_context_default.invokeExact();
            return new MainContext(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_main_context_get_thread_default = Interop.downcallHandle(
        "g_main_context_get_thread_default",
        FunctionDescriptor.of(ValueLayout.ADDRESS)
    );
    
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
     */
    public static MainContext getThreadDefault() {
        try {
            var RESULT = (MemoryAddress) g_main_context_get_thread_default.invokeExact();
            return new MainContext(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_main_context_ref_thread_default = Interop.downcallHandle(
        "g_main_context_ref_thread_default",
        FunctionDescriptor.of(ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the thread-default {@link MainContext} for this thread, as with
     * g_main_context_get_thread_default(), but also adds a reference to
     * it with g_main_context_ref(). In addition, unlike
     * g_main_context_get_thread_default(), if the thread-default context
     * is the global default context, this will return that {@link MainContext}
     * (with a ref added to it) rather than returning {@code null}.
     */
    public static MainContext refThreadDefault() {
        try {
            var RESULT = (MemoryAddress) g_main_context_ref_thread_default.invokeExact();
            return new MainContext(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
}
