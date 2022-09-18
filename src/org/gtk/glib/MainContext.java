package org.gtk.glib;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * The <code>GMainContext</code> struct is an opaque data
 * type representing a set of sources to be handled in a main loop.
 */
public class MainContext extends io.github.jwharm.javagi.ResourceBase {

    public MainContext(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    private static Reference constructNew() {
        Reference RESULT = References.get(gtk_h.g_main_context_new(), true);
        return RESULT;
    }
    
    /**
     * Creates a new {@link org.gtk.glib.MainContext} structure.
     */
    public MainContext() {
        super(constructNew());
    }
    
    private static Reference constructNewWithFlags(int flags) {
        Reference RESULT = References.get(gtk_h.g_main_context_new_with_flags(flags), true);
        return RESULT;
    }
    
    /**
     * Creates a new {@link org.gtk.glib.MainContext} structure.
     */
    public static MainContext newWithFlags(int flags) {
        return new MainContext(constructNewWithFlags(flags));
    }
    
    /**
     * Tries to become the owner of the specified context.
     * If some other thread is the owner of the context,
     * returns <code>false</code> immediately. Ownership is properly
     * recursive: the owner can require ownership again
     * and will release ownership when g_main_context_release()
     * is called as many times as g_main_context_acquire().
     * 
     * You must be the owner of a context before you
     * can call g_main_context_prepare(), g_main_context_query(),
     * g_main_context_check(), g_main_context_dispatch().
     */
    public boolean acquire() {
        var RESULT = gtk_h.g_main_context_acquire(handle());
        return (RESULT != 0);
    }
    
    /**
     * Adds a file descriptor to the set of file descriptors polled for
     * this context. This will very seldom be used directly. Instead
     * a typical event source will use g_source_add_unix_fd() instead.
     */
    public void addPoll(PollFD fd, int priority) {
        gtk_h.g_main_context_add_poll(handle(), fd.handle(), priority);
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
        var RESULT = gtk_h.g_main_context_check(handle(), maxPriority, Interop.allocateNativeArray(fds).handle(), nFds);
        return (RESULT != 0);
    }
    
    /**
     * Dispatches all pending sources.
     * 
     * You must have successfully acquired the context with
     * g_main_context_acquire() before you may call this function.
     */
    public void dispatch() {
        gtk_h.g_main_context_dispatch(handle());
    }
    
    /**
     * Finds a source with the given source functions and user data.  If
     * multiple sources exist with the same source function and user data,
     * the first one found will be returned.
     */
    public Source findSourceByFuncsUserData(SourceFuncs funcs, jdk.incubator.foreign.MemoryAddress userData) {
        var RESULT = gtk_h.g_main_context_find_source_by_funcs_user_data(handle(), funcs.handle(), userData);
        return new Source(References.get(RESULT, false));
    }
    
    /**
     * Finds a {@link org.gtk.glib.Source} given a pair of context and ID.
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
        var RESULT = gtk_h.g_main_context_find_source_by_id(handle(), sourceId);
        return new Source(References.get(RESULT, false));
    }
    
    /**
     * Finds a source with the given user data for the callback.  If
     * multiple sources exist with the same user data, the first
     * one found will be returned.
     */
    public Source findSourceByUserData(jdk.incubator.foreign.MemoryAddress userData) {
        var RESULT = gtk_h.g_main_context_find_source_by_user_data(handle(), userData);
        return new Source(References.get(RESULT, false));
    }
    
    /**
     * Invokes a function in such a way that @context is owned during the
     * invocation of @function.
     * 
     * If @context is <code>null</code> then the global default main context &<code>#8212</code>  as
     * returned by g_main_context_default() &<code>#8212</code>  is used.
     * 
     * If @context is owned by the current thread, @function is called
     * directly.  Otherwise, if @context is the thread-default main context
     * of the current thread and g_main_context_acquire() succeeds, then
     * @function is called and g_main_context_release() is called
     * afterwards.
     * 
     * In any other case, an idle source is created to call @function and
     * that source is attached to @context (presumably to be run in another
     * thread).  The idle source is attached with <code>G_PRIORITY_DEFAULT</code> priority.  If you want a different priority, use
     * g_main_context_invoke_full().
     * 
     * Note that, as with normal idle functions, @function should probably
     * return <code>false</code>   If it returns <code>true</code>  it will be continuously run in a
     * loop (and may prevent this call from returning).
     */
    public void invoke(SourceFunc function) {
        try {
            gtk_h.g_main_context_invoke(handle(), 
                    CLinker.systemCLinker().upcallStub(
                        MethodHandles.lookup().findStatic(JVMCallbacks.class, "cbSourceFunc",
                            MethodType.methodType(boolean.class, MemoryAddress.class)),
                        FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    Interop.getAllocator().allocate(C_INT, Interop.registerCallback(function.hashCode(), function)));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Invokes a function in such a way that @context is owned during the
     * invocation of @function.
     * 
     * This function is the same as g_main_context_invoke() except that it
     * lets you specify the priority in case @function ends up being
     * scheduled as an idle and also lets you give a {@link org.gtk.glib.DestroyNotify} for @data.
     * 
     * @notify should not assume that it is called from any particular
     * thread or with any particular context acquired.
     */
    public void invokeFull(int priority, SourceFunc function) {
        try {
            gtk_h.g_main_context_invoke_full(handle(), priority, 
                    CLinker.systemCLinker().upcallStub(
                        MethodHandles.lookup().findStatic(JVMCallbacks.class, "cbSourceFunc",
                            MethodType.methodType(boolean.class, MemoryAddress.class)),
                        FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    Interop.getAllocator().allocate(C_INT, Interop.registerCallback(function.hashCode(), function)), 
                    Interop.cbDestroyNotifySymbol());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Determines whether this thread holds the (recursive)
     * ownership of this {@link org.gtk.glib.MainContext}  This is useful to
     * know before waiting on another thread that may be
     * blocking to get ownership of @context.
     */
    public boolean isOwner() {
        var RESULT = gtk_h.g_main_context_is_owner(handle());
        return (RESULT != 0);
    }
    
    /**
     * Runs a single iteration for the given main loop. This involves
     * checking to see if any event sources are ready to be processed,
     * then if no events sources are ready and @may_block is <code>true</code>  waiting
     * for a source to become ready, then dispatching the highest priority
     * events sources that are ready. Otherwise, if @may_block is <code>false</code> sources are not waited to become ready, only those highest priority
     * events sources will be dispatched (if any), that are ready at this
     * given moment without further waiting.
     * 
     * Note that even when @may_block is <code>true</code>  it is still possible for
     * g_main_context_iteration() to return <code>false</code>  since the wait may
     * be interrupted for other reasons than an event source becoming ready.
     */
    public boolean iteration(boolean mayBlock) {
        var RESULT = gtk_h.g_main_context_iteration(handle(), mayBlock ? 1 : 0);
        return (RESULT != 0);
    }
    
    /**
     * Checks if any sources have pending events for the given context.
     */
    public boolean pending() {
        var RESULT = gtk_h.g_main_context_pending(handle());
        return (RESULT != 0);
    }
    
    /**
     * Pops @context off the thread-default context stack (verifying that
     * it was on the top of the stack).
     */
    public void popThreadDefault() {
        gtk_h.g_main_context_pop_thread_default(handle());
    }
    
    /**
     * Acquires @context and sets it as the thread-default context for the
     * current thread. This will cause certain asynchronous operations
     * (such as most {@link [gio]}{@link [gio]}-based I/O) which are
     * started in this thread to run under @context and deliver their
     * results to its main loop, rather than running under the global
     * default context in the main thread. Note that calling this function
     * changes the context returned by g_main_context_get_thread_default(),
     * not the one returned by g_main_context_default(), so it does not affect
     * the context used by functions like g_idle_add().
     * 
     * Normally you would call this function shortly after creating a new
     * thread, passing it a {@link org.gtk.glib.MainContext} which will be run by a
     * {@link org.gtk.glib.MainLoop} in that thread, to set a new default context for all
     * async operations in that thread. In this case you may not need to
     * ever call g_main_context_pop_thread_default(), assuming you want the
     * new {@link org.gtk.glib.MainContext} to be the default for the whole lifecycle of the
     * thread.
     * 
     * If you don&<code>#39</code> t have control over how the new thread was created (e.g.
     * in the new thread isn&<code>#39</code> t newly created, or if the thread life
     * cycle is managed by a {@link org.gtk.glib.ThreadPool} , it is always suggested to wrap
     * the logic that needs to use the new {@link org.gtk.glib.MainContext} inside a
     * g_main_context_push_thread_default() / g_main_context_pop_thread_default()
     * pair, otherwise threads that are re-used will end up never explicitly
     * releasing the {@link org.gtk.glib.MainContext} reference they hold.
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
        gtk_h.g_main_context_push_thread_default(handle());
    }
    
    /**
     * Increases the reference count on a {@link org.gtk.glib.MainContext} object by one.
     */
    public MainContext ref() {
        var RESULT = gtk_h.g_main_context_ref(handle());
        return new MainContext(References.get(RESULT, true));
    }
    
    /**
     * Releases ownership of a context previously acquired by this thread
     * with g_main_context_acquire(). If the context was acquired multiple
     * times, the ownership will be released only when g_main_context_release()
     * is called as many times as it was acquired.
     */
    public void release() {
        gtk_h.g_main_context_release(handle());
    }
    
    /**
     * Removes file descriptor from the set of file descriptors to be
     * polled for a particular context.
     */
    public void removePoll(PollFD fd) {
        gtk_h.g_main_context_remove_poll(handle(), fd.handle());
    }
    
    /**
     * Decreases the reference count on a {@link org.gtk.glib.MainContext} object by one. If
     * the result is zero, free the context and free all associated memory.
     */
    public void unref() {
        gtk_h.g_main_context_unref(handle());
    }
    
    /**
     * If @context is currently blocking in g_main_context_iteration()
     * waiting for a source to become ready, cause it to stop blocking
     * and return.  Otherwise, cause the next invocation of
     * g_main_context_iteration() to return without blocking.
     * 
     * This API is useful for low-level control over {@link org.gtk.glib.MainContext}  for
     * example, integrating it with main loop implementations such as
     * {@link org.gtk.glib.MainLoop} 
     * 
     * Another related use for this function is when implementing a main
     * loop with a termination condition, computed from multiple threads:
     * 
     * |{@link [&<code>#60</code> !-- language=&<code>#34</code> C&<code>#34</code>  --&<code>#62</code> 
     *   <code>#define</code> NUM_TASKS 10
     *   static gint tasks_remaining = NUM_TASKS;  // (atomic)
     *   ...
     *  
     *   while (g_atomic_int_get (&<code>#38</code> tasks_remaining) != 0)
     *     g_main_context_iteration (NULL, TRUE);
     * ]}|
     *  
     * Then in a thread:
     * |{@link [&<code>#60</code> !-- language=&<code>#34</code> C&<code>#34</code>  --&<code>#62</code> 
     *   perform_work();
     * 
     *   if (g_atomic_int_dec_and_test (&<code>#38</code> tasks_remaining))
     *     g_main_context_wakeup (NULL);
     * ]}|
     */
    public void wakeup() {
        gtk_h.g_main_context_wakeup(handle());
    }
    
    /**
     * Returns the global default main context. This is the main context
     * used for main loop functions when a main loop is not explicitly
     * specified, and corresponds to the &<code>#34</code> main&<code>#34</code>  main loop. See also
     * g_main_context_get_thread_default().
     */
    public static MainContext default_() {
        var RESULT = gtk_h.g_main_context_default();
        return new MainContext(References.get(RESULT, false));
    }
    
    /**
     * Gets the thread-default {@link org.gtk.glib.MainContext} for this thread. Asynchronous
     * operations that want to be able to be run in contexts other than
     * the default one should call this method or
     * g_main_context_ref_thread_default() to get a {@link org.gtk.glib.MainContext} to add
     * their <code>#GSources</code> to. (Note that even in single-threaded
     * programs applications may sometimes want to temporarily push a
     * non-default context, so it is not safe to assume that this will
     * always return <code>null</code> if you are running in the default thread.)
     * 
     * If you need to hold a reference on the context, use
     * g_main_context_ref_thread_default() instead.
     */
    public static MainContext getThreadDefault() {
        var RESULT = gtk_h.g_main_context_get_thread_default();
        return new MainContext(References.get(RESULT, false));
    }
    
    /**
     * Gets the thread-default {@link org.gtk.glib.MainContext} for this thread, as with
     * g_main_context_get_thread_default(), but also adds a reference to
     * it with g_main_context_ref(). In addition, unlike
     * g_main_context_get_thread_default(), if the thread-default context
     * is the global default context, this will return that {@link org.gtk.glib.MainContext} (with a ref added to it) rather than returning <code>null</code>
     */
    public static MainContext refThreadDefault() {
        var RESULT = gtk_h.g_main_context_ref_thread_default();
        return new MainContext(References.get(RESULT, true));
    }
    
}
