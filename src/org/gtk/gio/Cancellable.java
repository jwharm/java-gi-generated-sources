package org.gtk.gio;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * GCancellable is a thread-safe operation cancellation stack used
 * throughout GIO to allow for cancellation of synchronous and
 * asynchronous operations.
 */
public class Cancellable extends org.gtk.gobject.Object {

    public Cancellable(io.github.jwharm.javagi.interop.Proxy proxy) {
        super(proxy);
    }
    
    /** Cast object to Cancellable */
    public static Cancellable castFrom(org.gtk.gobject.Object gobject) {
        return new Cancellable(gobject.getProxy());
    }
    
    /**
     * Creates a new #GCancellable object.
     * 
     * Applications that want to start one or more operations
     * that should be cancellable should create a #GCancellable
     * and pass it to the operations.
     * 
     * One #GCancellable can be used in multiple consecutive
     * operations or in multiple concurrent operations.
     */
    public Cancellable() {
        super(ProxyFactory.get(io.github.jwharm.javagi.interop.jextract.gtk_h.g_cancellable_new(), true));
    }
    
    /**
     * Will set @cancellable to cancelled, and will emit the
     * #GCancellable::cancelled signal. (However, see the warning about
     * race conditions in the documentation for that signal if you are
     * planning to connect to it.)
     * 
     * This function is thread-safe. In other words, you can safely call
     * it from a thread other than the one running the operation that was
     * passed the @cancellable.
     * 
     * If @cancellable is %NULL, this function returns immediately for convenience.
     * 
     * The convention within GIO is that cancelling an asynchronous
     * operation causes it to complete asynchronously. That is, if you
     * cancel the operation from the same thread in which it is running,
     * then the operation's #GAsyncReadyCallback will not be invoked until
     * the application returns to the main loop.
     */
    public void cancel() {
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_cancellable_cancel(HANDLE());
    }
    
    /**
     * Disconnects a handler from a cancellable instance similar to
     * g_signal_handler_disconnect().  Additionally, in the event that a
     * signal handler is currently running, this call will block until the
     * handler has finished.  Calling this function from a
     * #GCancellable::cancelled signal handler will therefore result in a
     * deadlock.
     * 
     * This avoids a race condition where a thread cancels at the
     * same time as the cancellable operation is finished and the
     * signal handler is removed. See #GCancellable::cancelled for
     * details on how to use this.
     * 
     * If @cancellable is %NULL or @handler_id is `0` this function does
     * nothing.
     */
    public void disconnect(long handlerId) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_cancellable_disconnect(HANDLE(), handlerId);
    }
    
    /**
     * Gets the file descriptor for a cancellable job. This can be used to
     * implement cancellable operations on Unix systems. The returned fd will
     * turn readable when @cancellable is cancelled.
     * 
     * You are not supposed to read from the fd yourself, just check for
     * readable status. Reading to unset the readable status is done
     * with g_cancellable_reset().
     * 
     * After a successful return from this function, you should use
     * g_cancellable_release_fd() to free up resources allocated for
     * the returned file descriptor.
     * 
     * See also g_cancellable_make_pollfd().
     */
    public int getFd() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_cancellable_get_fd(HANDLE());
        return RESULT;
    }
    
    /**
     * Checks if a cancellable job has been cancelled.
     */
    public boolean isCancelled() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_cancellable_is_cancelled(HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Creates a #GPollFD corresponding to @cancellable; this can be passed
     * to g_poll() and used to poll for cancellation. This is useful both
     * for unix systems without a native poll and for portability to
     * windows.
     * 
     * When this function returns %TRUE, you should use
     * g_cancellable_release_fd() to free up resources allocated for the
     * @pollfd. After a %FALSE return, do not call g_cancellable_release_fd().
     * 
     * If this function returns %FALSE, either no @cancellable was given or
     * resource limits prevent this function from allocating the necessary
     * structures for polling. (On Linux, you will likely have reached
     * the maximum number of file descriptors.) The suggested way to handle
     * these cases is to ignore the @cancellable.
     * 
     * You are not supposed to read from the fd yourself, just check for
     * readable status. Reading to unset the readable status is done
     * with g_cancellable_reset().
     */
    public boolean makePollfd(org.gtk.glib.PollFD pollfd) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_cancellable_make_pollfd(HANDLE(), pollfd.HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Pops @cancellable off the cancellable stack (verifying that @cancellable
     * is on the top of the stack).
     */
    public void popCurrent() {
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_cancellable_pop_current(HANDLE());
    }
    
    /**
     * Pushes @cancellable onto the cancellable stack. The current
     * cancellable can then be received using g_cancellable_get_current().
     * 
     * This is useful when implementing cancellable operations in
     * code that does not allow you to pass down the cancellable object.
     * 
     * This is typically called automatically by e.g. #GFile operations,
     * so you rarely have to call this yourself.
     */
    public void pushCurrent() {
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_cancellable_push_current(HANDLE());
    }
    
    /**
     * Releases a resources previously allocated by g_cancellable_get_fd()
     * or g_cancellable_make_pollfd().
     * 
     * For compatibility reasons with older releases, calling this function
     * is not strictly required, the resources will be automatically freed
     * when the @cancellable is finalized. However, the @cancellable will
     * block scarce file descriptors until it is finalized if this function
     * is not called. This can cause the application to run out of file
     * descriptors when many #GCancellables are used at the same time.
     */
    public void releaseFd() {
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_cancellable_release_fd(HANDLE());
    }
    
    /**
     * Resets @cancellable to its uncancelled state.
     * 
     * If cancellable is currently in use by any cancellable operation
     * then the behavior of this function is undefined.
     * 
     * Note that it is generally not a good idea to reuse an existing
     * cancellable for more operations after it has been cancelled once,
     * as this function might tempt you to do. The recommended practice
     * is to drop the reference to a cancellable after cancelling it,
     * and let it die with the outstanding async operations. You should
     * create a fresh cancellable for further async operations.
     */
    public void reset() {
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_cancellable_reset(HANDLE());
    }
    
    /**
     * If the @cancellable is cancelled, sets the error to notify
     * that the operation was cancelled.
     */
    public boolean setErrorIfCancelled() throws io.github.jwharm.javagi.interop.GErrorException {
        MemorySegment GERROR = io.github.jwharm.javagi.interop.jextract.GError.allocate(Interop.getScope());
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_cancellable_set_error_if_cancelled(HANDLE(), GERROR);
        if (! java.util.Objects.equals(MemoryAddress.NULL, GERROR)) {
            throw new io.github.jwharm.javagi.interop.GErrorException(GERROR);
        }
        return (RESULT != 0);
    }
    
    /**
     * Creates a source that triggers if @cancellable is cancelled and
     * calls its callback of type #GCancellableSourceFunc. This is
     * primarily useful for attaching to another (non-cancellable) source
     * with g_source_add_child_source() to add cancellability to it.
     * 
     * For convenience, you can call this with a %NULL #GCancellable,
     * in which case the source will never trigger.
     * 
     * The new #GSource will hold a reference to the #GCancellable.
     */
    public org.gtk.glib.Source sourceNew() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_cancellable_source_new(HANDLE());
        return new org.gtk.glib.Source(ProxyFactory.get(RESULT, true));
    }
    
    @FunctionalInterface
    public interface CancelledHandler {
        void signalReceived(Cancellable source);
    }
    
    /**
     * Emitted when the operation has been cancelled.
     * 
     * Can be used by implementations of cancellable operations. If the
     * operation is cancelled from another thread, the signal will be
     * emitted in the thread that cancelled the operation, not the
     * thread that is running the operation.
     * 
     * Note that disconnecting from this signal (or any signal) in a
     * multi-threaded program is prone to race conditions. For instance
     * it is possible that a signal handler may be invoked even after
     * a call to g_signal_handler_disconnect() for that handler has
     * already returned.
     * 
     * There is also a problem when cancellation happens right before
     * connecting to the signal. If this happens the signal will
     * unexpectedly not be emitted, and checking before connecting to
     * the signal leaves a race condition where this is still happening.
     * 
     * In order to make it safe and easy to connect handlers there
     * are two helper functions: g_cancellable_connect() and
     * g_cancellable_disconnect() which protect against problems
     * like this.
     * 
     * An example of how to us this:
     * |[<!-- language="C" -->
     *     // Make sure we don't do unnecessary work if already cancelled
     *     if (g_cancellable_set_error_if_cancelled (cancellable, error))
     *       return;
     * 
     *     // Set up all the data needed to be able to handle cancellation
     *     // of the operation
     *     my_data = my_data_new (...);
     * 
     *     id = 0;
     *     if (cancellable)
     *       id = g_cancellable_connect (cancellable,
     *     			      G_CALLBACK (cancelled_handler)
     *     			      data, NULL);
     * 
     *     // cancellable operation here...
     * 
     *     g_cancellable_disconnect (cancellable, id);
     * 
     *     // cancelled_handler is never called after this, it is now safe
     *     // to free the data
     *     my_data_free (my_data);
     * ]|
     * 
     * Note that the cancelled signal is emitted in the thread that
     * the user cancelled from, which may be the main thread. So, the
     * cancellable signal should not do something that can block.
     */
    public void onCancelled(CancelledHandler handler) {
        try {
            int hash = handler.hashCode();
            JVMCallbacks.signalRegistry.put(hash, handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalCancellableCancelled", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            io.github.jwharm.javagi.interop.jextract.gtk_h.g_signal_connect_data(this.HANDLE(), Interop.allocateNativeString("cancelled").HANDLE(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
}
