package org.gtk.glib;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * The `GMainContext` struct is an opaque data
 * type representing a set of sources to be handled in a main loop.
 */
public class MainContext extends io.github.jwharm.javagi.interop.ResourceBase {

    public MainContext(io.github.jwharm.javagi.interop.Reference reference) {
        super(reference);
    }
    
    /**
     * Creates a new #GMainContext structure.
     */
    public MainContext() {
        super(References.get(io.github.jwharm.javagi.interop.jextract.gtk_h.g_main_context_new(), true));
    }
    
    /**
     * Creates a new #GMainContext structure.
     */
    public MainContext(int flags) {
        super(References.get(io.github.jwharm.javagi.interop.jextract.gtk_h.g_main_context_new_with_flags(flags), true));
    }
    
    /**
     * Tries to become the owner of the specified context.
     * If some other thread is the owner of the context,
     * returns %FALSE immediately. Ownership is properly
     * recursive: the owner can require ownership again
     * and will release ownership when g_main_context_release()
     * is called as many times as g_main_context_acquire().
     * 
     * You must be the owner of a context before you
     * can call g_main_context_prepare(), g_main_context_query(),
     * g_main_context_check(), g_main_context_dispatch().
     */
    public boolean acquire() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_main_context_acquire(HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Adds a file descriptor to the set of file descriptors polled for
     * this context. This will very seldom be used directly. Instead
     * a typical event source will use g_source_add_unix_fd() instead.
     */
    public void addPoll(PollFD fd, int priority) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_main_context_add_poll(HANDLE(), fd.HANDLE(), priority);
    }
    
    /**
     * Passes the results of polling back to the main loop. You should be
     * careful to pass @fds and its length @n_fds as received from
     * g_main_context_query(), as this functions relies on assumptions
     * on how @fds is filled.
     * 
     * You must have successfully acquired the context with
     * g_main_context_acquire() before you may call this function.
     */
    public boolean check(int maxPriority, PollFD[] fds, int nFds) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_main_context_check(HANDLE(), maxPriority, Interop.allocateNativeArray(fds), nFds);
        return (RESULT != 0);
    }
    
    /**
     * Dispatches all pending sources.
     * 
     * You must have successfully acquired the context with
     * g_main_context_acquire() before you may call this function.
     */
    public void dispatch() {
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_main_context_dispatch(HANDLE());
    }
    
    /**
     * Finds a source with the given source functions and user data.  If
     * multiple sources exist with the same source function and user data,
     * the first one found will be returned.
     */
    public Source findSourceByFuncsUserData(SourceFuncs funcs, jdk.incubator.foreign.MemoryAddress userData) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_main_context_find_source_by_funcs_user_data(HANDLE(), funcs.HANDLE(), userData);
        return new Source(References.get(RESULT, false));
    }
    
    /**
     * Finds a #GSource given a pair of context and ID.
     * 
     * It is a programmer error to attempt to look up a non-existent source.
     * 
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
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_main_context_find_source_by_id(HANDLE(), sourceId);
        return new Source(References.get(RESULT, false));
    }
    
    /**
     * Finds a source with the given user data for the callback.  If
     * multiple sources exist with the same user data, the first
     * one found will be returned.
     */
    public Source findSourceByUserData(jdk.incubator.foreign.MemoryAddress userData) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_main_context_find_source_by_user_data(HANDLE(), userData);
        return new Source(References.get(RESULT, false));
    }
    
    /**
     * Determines whether this thread holds the (recursive)
     * ownership of this #GMainContext. This is useful to
     * know before waiting on another thread that may be
     * blocking to get ownership of @context.
     */
    public boolean isOwner() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_main_context_is_owner(HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Runs a single iteration for the given main loop. This involves
     * checking to see if any event sources are ready to be processed,
     * then if no events sources are ready and @may_block is %TRUE, waiting
     * for a source to become ready, then dispatching the highest priority
     * events sources that are ready. Otherwise, if @may_block is %FALSE
     * sources are not waited to become ready, only those highest priority
     * events sources will be dispatched (if any), that are ready at this
     * given moment without further waiting.
     * 
     * Note that even when @may_block is %TRUE, it is still possible for
     * g_main_context_iteration() to return %FALSE, since the wait may
     * be interrupted for other reasons than an event source becoming ready.
     */
    public boolean iteration(boolean mayBlock) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_main_context_iteration(HANDLE(), mayBlock ? 1 : 0);
        return (RESULT != 0);
    }
    
    /**
     * Checks if any sources have pending events for the given context.
     */
    public boolean pending() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_main_context_pending(HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Pops @context off the thread-default context stack (verifying that
     * it was on the top of the stack).
     */
    public void popThreadDefault() {
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_main_context_pop_thread_default(HANDLE());
    }
    
    /**
     * Acquires @context and sets it as the thread-default context for the
     * current thread. This will cause certain asynchronous operations
     * (such as most [gio][gio]-based I/O) which are
     * started in this thread to run under @context and deliver their
     * results to its main loop, rather than running under the global
     * default context in the main thread. Note that calling this function
     * changes the context returned by g_main_context_get_thread_default(),
     * not the one returned by g_main_context_default(), so it does not affect
     * the context used by functions like g_idle_add().
     * 
     * Normally you would call this function shortly after creating a new
     * thread, passing it a #GMainContext which will be run by a
     * #GMainLoop in that thread, to set a new default context for all
     * async operations in that thread. In this case you may not need to
     * ever call g_main_context_pop_thread_default(), assuming you want the
     * new #GMainContext to be the default for the whole lifecycle of the
     * thread.
     * 
     * If you don't have control over how the new thread was created (e.g.
     * in the new thread isn't newly created, or if the thread life
     * cycle is managed by a #GThreadPool), it is always suggested to wrap
     * the logic that needs to use the new #GMainContext inside a
     * g_main_context_push_thread_default() / g_main_context_pop_thread_default()
     * pair, otherwise threads that are re-used will end up never explicitly
     * releasing the #GMainContext reference they hold.
     * 
     * In some cases you may want to schedule a single operation in a
     * non-default context, or temporarily use a non-default context in
     * the main thread. In that case, you can wrap the call to the
     * asynchronous operation inside a
     * g_main_context_push_thread_default() /
     * g_main_context_pop_thread_default() pair, but it is up to you to
     * ensure that no other asynchronous operations accidentally get
     * started while the non-default context is active.
     * 
     * Beware that libraries that predate this function may not correctly
     * handle being used from a thread with a thread-default context. Eg,
     * see g_file_supports_thread_contexts().
     */
    public void pushThreadDefault() {
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_main_context_push_thread_default(HANDLE());
    }
    
    /**
     * Increases the reference count on a #GMainContext object by one.
     */
    public MainContext ref() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_main_context_ref(HANDLE());
        return new MainContext(References.get(RESULT, true));
    }
    
    /**
     * Releases ownership of a context previously acquired by this thread
     * with g_main_context_acquire(). If the context was acquired multiple
     * times, the ownership will be released only when g_main_context_release()
     * is called as many times as it was acquired.
     */
    public void release() {
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_main_context_release(HANDLE());
    }
    
    /**
     * Removes file descriptor from the set of file descriptors to be
     * polled for a particular context.
     */
    public void removePoll(PollFD fd) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_main_context_remove_poll(HANDLE(), fd.HANDLE());
    }
    
    /**
     * Decreases the reference count on a #GMainContext object by one. If
     * the result is zero, free the context and free all associated memory.
     */
    public void unref() {
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_main_context_unref(HANDLE());
    }
    
    /**
     * If @context is currently blocking in g_main_context_iteration()
     * waiting for a source to become ready, cause it to stop blocking
     * and return.  Otherwise, cause the next invocation of
     * g_main_context_iteration() to return without blocking.
     * 
     * This API is useful for low-level control over #GMainContext; for
     * example, integrating it with main loop implementations such as
     * #GMainLoop.
     * 
     * Another related use for this function is when implementing a main
     * loop with a termination condition, computed from multiple threads:
     * 
     * |[<!-- language="C" -->
     *   #define NUM_TASKS 10
     *   static gint tasks_remaining = NUM_TASKS;  // (atomic)
     *   ...
     *  
     *   while (g_atomic_int_get (&tasks_remaining) != 0)
     *     g_main_context_iteration (NULL, TRUE);
     * ]|
     *  
     * Then in a thread:
     * |[<!-- language="C" -->
     *   perform_work();
     * 
     *   if (g_atomic_int_dec_and_test (&tasks_remaining))
     *     g_main_context_wakeup (NULL);
     * ]|
     */
    public void wakeup() {
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_main_context_wakeup(HANDLE());
    }
    
}
