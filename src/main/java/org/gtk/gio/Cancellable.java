package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * GCancellable is a thread-safe operation cancellation stack used
 * throughout GIO to allow for cancellation of synchronous and
 * asynchronous operations.
 */
public class Cancellable extends org.gtk.gobject.GObject {
    
    static {
        Gio.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GCancellable";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gtk.gobject.GObject.getMemoryLayout().withName("parent_instance"),
            Interop.valueLayout.ADDRESS.withName("priv")
        ).withName(C_TYPE_NAME);
    }
    
    /**
     * Create a Cancellable proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected Cancellable(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, Cancellable> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new Cancellable(input);
    
    private static MemoryAddress constructNew() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_cancellable_new.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new {@link Cancellable} object.
     * <p>
     * Applications that want to start one or more operations
     * that should be cancellable should create a {@link Cancellable}
     * and pass it to the operations.
     * <p>
     * One {@link Cancellable} can be used in multiple consecutive
     * operations or in multiple concurrent operations.
     */
    public Cancellable() {
        super(constructNew());
        this.takeOwnership();
    }
    
    /**
     * Will set {@code cancellable} to cancelled, and will emit the
     * {@link Cancellable}::cancelled signal. (However, see the warning about
     * race conditions in the documentation for that signal if you are
     * planning to connect to it.)
     * <p>
     * This function is thread-safe. In other words, you can safely call
     * it from a thread other than the one running the operation that was
     * passed the {@code cancellable}.
     * <p>
     * If {@code cancellable} is {@code null}, this function returns immediately for convenience.
     * <p>
     * The convention within GIO is that cancelling an asynchronous
     * operation causes it to complete asynchronously. That is, if you
     * cancel the operation from the same thread in which it is running,
     * then the operation's {@link AsyncReadyCallback} will not be invoked until
     * the application returns to the main loop.
     */
    public void cancel() {
        try {
            DowncallHandles.g_cancellable_cancel.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Convenience function to connect to the {@link Cancellable}::cancelled
     * signal. Also handles the race condition that may happen
     * if the cancellable is cancelled right before connecting.
     * <p>
     * {@code callback} is called at most once, either directly at the
     * time of the connect if {@code cancellable} is already cancelled,
     * or when {@code cancellable} is cancelled in some thread.
     * <p>
     * {@code data_destroy_func} will be called when the handler is
     * disconnected, or immediately if the cancellable is already
     * cancelled.
     * <p>
     * See {@link Cancellable}::cancelled for details on how to use this.
     * <p>
     * Since GLib 2.40, the lock protecting {@code cancellable} is not held when
     * {@code callback} is invoked.  This lifts a restriction in place for
     * earlier GLib versions which now makes it easier to write cleanup
     * code that unconditionally invokes e.g. g_cancellable_cancel().
     * @param callback The {@link org.gtk.gobject.Callback} to connect.
     * @param dataDestroyFunc Free function for {@code data} or {@code null}.
     * @return The id of the signal handler or 0 if {@code cancellable} has already
     *          been cancelled.
     */
    public long connect(org.gtk.gobject.Callback callback, @Nullable org.gtk.glib.DestroyNotify dataDestroyFunc) {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.g_cancellable_connect.invokeExact(
                    handle(),
                    (Addressable) callback.toCallback(),
                    (Addressable) MemoryAddress.NULL,
                    (Addressable) (dataDestroyFunc == null ? MemoryAddress.NULL : (Addressable) dataDestroyFunc.toCallback()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Disconnects a handler from a cancellable instance similar to
     * g_signal_handler_disconnect().  Additionally, in the event that a
     * signal handler is currently running, this call will block until the
     * handler has finished.  Calling this function from a
     * {@link Cancellable}::cancelled signal handler will therefore result in a
     * deadlock.
     * <p>
     * This avoids a race condition where a thread cancels at the
     * same time as the cancellable operation is finished and the
     * signal handler is removed. See {@link Cancellable}::cancelled for
     * details on how to use this.
     * <p>
     * If {@code cancellable} is {@code null} or {@code handler_id} is {@code 0} this function does
     * nothing.
     * @param handlerId Handler id of the handler to be disconnected, or {@code 0}.
     */
    public void disconnect(long handlerId) {
        try {
            DowncallHandles.g_cancellable_disconnect.invokeExact(
                    handle(),
                    handlerId);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Gets the file descriptor for a cancellable job. This can be used to
     * implement cancellable operations on Unix systems. The returned fd will
     * turn readable when {@code cancellable} is cancelled.
     * <p>
     * You are not supposed to read from the fd yourself, just check for
     * readable status. Reading to unset the readable status is done
     * with g_cancellable_reset().
     * <p>
     * After a successful return from this function, you should use
     * g_cancellable_release_fd() to free up resources allocated for
     * the returned file descriptor.
     * <p>
     * See also g_cancellable_make_pollfd().
     * @return A valid file descriptor. {@code -1} if the file descriptor
     * is not supported, or on errors.
     */
    public int getFd() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_cancellable_get_fd.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Checks if a cancellable job has been cancelled.
     * @return {@code true} if {@code cancellable} is cancelled,
     * FALSE if called with {@code null} or if item is not cancelled.
     */
    public boolean isCancelled() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_cancellable_is_cancelled.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Creates a {@link org.gtk.glib.PollFD} corresponding to {@code cancellable}; this can be passed
     * to g_poll() and used to poll for cancellation. This is useful both
     * for unix systems without a native poll and for portability to
     * windows.
     * <p>
     * When this function returns {@code true}, you should use
     * g_cancellable_release_fd() to free up resources allocated for the
     * {@code pollfd}. After a {@code false} return, do not call g_cancellable_release_fd().
     * <p>
     * If this function returns {@code false}, either no {@code cancellable} was given or
     * resource limits prevent this function from allocating the necessary
     * structures for polling. (On Linux, you will likely have reached
     * the maximum number of file descriptors.) The suggested way to handle
     * these cases is to ignore the {@code cancellable}.
     * <p>
     * You are not supposed to read from the fd yourself, just check for
     * readable status. Reading to unset the readable status is done
     * with g_cancellable_reset().
     * @param pollfd a pointer to a {@link org.gtk.glib.PollFD}
     * @return {@code true} if {@code pollfd} was successfully initialized, {@code false} on
     *          failure to prepare the cancellable.
     */
    public boolean makePollfd(org.gtk.glib.PollFD pollfd) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_cancellable_make_pollfd.invokeExact(
                    handle(),
                    pollfd.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Pops {@code cancellable} off the cancellable stack (verifying that {@code cancellable}
     * is on the top of the stack).
     */
    public void popCurrent() {
        try {
            DowncallHandles.g_cancellable_pop_current.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Pushes {@code cancellable} onto the cancellable stack. The current
     * cancellable can then be received using g_cancellable_get_current().
     * <p>
     * This is useful when implementing cancellable operations in
     * code that does not allow you to pass down the cancellable object.
     * <p>
     * This is typically called automatically by e.g. {@link File} operations,
     * so you rarely have to call this yourself.
     */
    public void pushCurrent() {
        try {
            DowncallHandles.g_cancellable_push_current.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Releases a resources previously allocated by g_cancellable_get_fd()
     * or g_cancellable_make_pollfd().
     * <p>
     * For compatibility reasons with older releases, calling this function
     * is not strictly required, the resources will be automatically freed
     * when the {@code cancellable} is finalized. However, the {@code cancellable} will
     * block scarce file descriptors until it is finalized if this function
     * is not called. This can cause the application to run out of file
     * descriptors when many {@code GCancellables} are used at the same time.
     */
    public void releaseFd() {
        try {
            DowncallHandles.g_cancellable_release_fd.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Resets {@code cancellable} to its uncancelled state.
     * <p>
     * If cancellable is currently in use by any cancellable operation
     * then the behavior of this function is undefined.
     * <p>
     * Note that it is generally not a good idea to reuse an existing
     * cancellable for more operations after it has been cancelled once,
     * as this function might tempt you to do. The recommended practice
     * is to drop the reference to a cancellable after cancelling it,
     * and let it die with the outstanding async operations. You should
     * create a fresh cancellable for further async operations.
     */
    public void reset() {
        try {
            DowncallHandles.g_cancellable_reset.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * If the {@code cancellable} is cancelled, sets the error to notify
     * that the operation was cancelled.
     * @return {@code true} if {@code cancellable} was cancelled, {@code false} if it was not
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public boolean setErrorIfCancelled() throws io.github.jwharm.javagi.GErrorException {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment GERROR = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            int RESULT;
            try {
                RESULT = (int) DowncallHandles.g_cancellable_set_error_if_cancelled.invokeExact(handle(),(Addressable) GERROR);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
        }
    }
    
    /**
     * Creates a source that triggers if {@code cancellable} is cancelled and
     * calls its callback of type {@link CancellableSourceFunc}. This is
     * primarily useful for attaching to another (non-cancellable) source
     * with g_source_add_child_source() to add cancellability to it.
     * <p>
     * For convenience, you can call this with a {@code null} {@link Cancellable},
     * in which case the source will never trigger.
     * <p>
     * The new {@link org.gtk.glib.Source} will hold a reference to the {@link Cancellable}.
     * @return the new {@link org.gtk.glib.Source}.
     */
    public org.gtk.glib.Source sourceNew() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_cancellable_source_new.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        var OBJECT = org.gtk.glib.Source.fromAddress.marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.g_cancellable_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * Gets the top cancellable from the stack.
     * @return a {@link Cancellable} from the top
     * of the stack, or {@code null} if the stack is empty.
     */
    public static @Nullable org.gtk.gio.Cancellable getCurrent() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_cancellable_get_current.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gtk.gio.Cancellable) Interop.register(RESULT, org.gtk.gio.Cancellable.fromAddress).marshal(RESULT, null);
    }
    
    /**
     * Functional interface declaration of the {@code Cancelled} callback.
     */
    @FunctionalInterface
    public interface Cancelled {
    
        /**
         * Emitted when the operation has been cancelled.
         * <p>
         * Can be used by implementations of cancellable operations. If the
         * operation is cancelled from another thread, the signal will be
         * emitted in the thread that cancelled the operation, not the
         * thread that is running the operation.
         * <p>
         * Note that disconnecting from this signal (or any signal) in a
         * multi-threaded program is prone to race conditions. For instance
         * it is possible that a signal handler may be invoked even after
         * a call to g_signal_handler_disconnect() for that handler has
         * already returned.
         * <p>
         * There is also a problem when cancellation happens right before
         * connecting to the signal. If this happens the signal will
         * unexpectedly not be emitted, and checking before connecting to
         * the signal leaves a race condition where this is still happening.
         * <p>
         * In order to make it safe and easy to connect handlers there
         * are two helper functions: g_cancellable_connect() and
         * g_cancellable_disconnect() which protect against problems
         * like this.
         * <p>
         * An example of how to us this:
         * <pre>{@code <!-- language="C" -->
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
         * }</pre>
         * <p>
         * Note that the cancelled signal is emitted in the thread that
         * the user cancelled from, which may be the main thread. So, the
         * cancellable signal should not do something that can block.
         */
        void run();
        
        @ApiStatus.Internal default void upcall(MemoryAddress sourceCancellable) {
            run();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), Cancelled.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Emitted when the operation has been cancelled.
     * <p>
     * Can be used by implementations of cancellable operations. If the
     * operation is cancelled from another thread, the signal will be
     * emitted in the thread that cancelled the operation, not the
     * thread that is running the operation.
     * <p>
     * Note that disconnecting from this signal (or any signal) in a
     * multi-threaded program is prone to race conditions. For instance
     * it is possible that a signal handler may be invoked even after
     * a call to g_signal_handler_disconnect() for that handler has
     * already returned.
     * <p>
     * There is also a problem when cancellation happens right before
     * connecting to the signal. If this happens the signal will
     * unexpectedly not be emitted, and checking before connecting to
     * the signal leaves a race condition where this is still happening.
     * <p>
     * In order to make it safe and easy to connect handlers there
     * are two helper functions: g_cancellable_connect() and
     * g_cancellable_disconnect() which protect against problems
     * like this.
     * <p>
     * An example of how to us this:
     * <pre>{@code <!-- language="C" -->
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
     * }</pre>
     * <p>
     * Note that the cancelled signal is emitted in the thread that
     * the user cancelled from, which may be the main thread. So, the
     * cancellable signal should not do something that can block.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<Cancellable.Cancelled> onCancelled(Cancellable.Cancelled handler) {
        MemorySession SCOPE = MemorySession.openImplicit();
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("cancelled", SCOPE), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * A {@link Cancellable.Builder} object constructs a {@link Cancellable} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link Cancellable.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a GObject with properties.
     */
    public static class Builder extends org.gtk.gobject.GObject.Builder {
        
        /**
         * Default constructor for a {@code Builder} object.
         */
        protected Builder() {
        }
        
        /**
         * Finish building the {@link Cancellable} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link Cancellable}.
         * @return A new instance of {@code Cancellable} with the properties 
         *         that were set in the Builder object.
         */
        public Cancellable build() {
            return (Cancellable) org.gtk.gobject.GObject.newWithProperties(
                Cancellable.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle g_cancellable_new = Interop.downcallHandle(
                "g_cancellable_new",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_cancellable_cancel = Interop.downcallHandle(
                "g_cancellable_cancel",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_cancellable_connect = Interop.downcallHandle(
                "g_cancellable_connect",
                FunctionDescriptor.of(Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_cancellable_disconnect = Interop.downcallHandle(
                "g_cancellable_disconnect",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG),
                false
        );
        
        private static final MethodHandle g_cancellable_get_fd = Interop.downcallHandle(
                "g_cancellable_get_fd",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_cancellable_is_cancelled = Interop.downcallHandle(
                "g_cancellable_is_cancelled",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_cancellable_make_pollfd = Interop.downcallHandle(
                "g_cancellable_make_pollfd",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_cancellable_pop_current = Interop.downcallHandle(
                "g_cancellable_pop_current",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_cancellable_push_current = Interop.downcallHandle(
                "g_cancellable_push_current",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_cancellable_release_fd = Interop.downcallHandle(
                "g_cancellable_release_fd",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_cancellable_reset = Interop.downcallHandle(
                "g_cancellable_reset",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_cancellable_set_error_if_cancelled = Interop.downcallHandle(
                "g_cancellable_set_error_if_cancelled",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_cancellable_source_new = Interop.downcallHandle(
                "g_cancellable_source_new",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_cancellable_get_type = Interop.downcallHandle(
                "g_cancellable_get_type",
                FunctionDescriptor.of(Interop.valueLayout.C_LONG),
                false
        );
        
        private static final MethodHandle g_cancellable_get_current = Interop.downcallHandle(
                "g_cancellable_get_current",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
                false
        );
    }
    
    /**
     * Check whether the type is available on the runtime platform.
     * @return {@code true} when the type is available on the runtime platform
     */
    public static boolean isAvailable() {
        return DowncallHandles.g_cancellable_get_type != null;
    }
}
