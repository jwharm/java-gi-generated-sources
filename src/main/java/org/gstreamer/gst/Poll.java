package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A {@link Poll} keeps track of file descriptors much like fd_set (used with
 * select ()) or a struct pollfd array (used with poll ()). Once created with
 * gst_poll_new(), the set can be used to wait for file descriptors to be
 * readable and/or writable. It is possible to make this wait be controlled
 * by specifying {@code true} for the {@code controllable} flag when creating the set (or
 * later calling gst_poll_set_controllable()).
 * <p>
 * New file descriptors are added to the set using gst_poll_add_fd(), and
 * removed using gst_poll_remove_fd(). Controlling which file descriptors
 * should be waited for to become readable and/or writable are done using
 * gst_poll_fd_ctl_read(), gst_poll_fd_ctl_write() and gst_poll_fd_ctl_pri().
 * <p>
 * Use gst_poll_wait() to wait for the file descriptors to actually become
 * readable and/or writable, or to timeout if no file descriptor is available
 * in time. The wait can be controlled by calling gst_poll_restart() and
 * gst_poll_set_flushing().
 * <p>
 * Once the file descriptor set has been waited for, one can use
 * gst_poll_fd_has_closed() to see if the file descriptor has been closed,
 * gst_poll_fd_has_error() to see if it has generated an error,
 * gst_poll_fd_can_read() to see if it is possible to read from the file
 * descriptor, and gst_poll_fd_can_write() to see if it is possible to
 * write to it.
 */
public class Poll extends Struct {
    
    static {
        Gst.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstPoll";
    
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
     * Allocate a new {@link Poll}
     * @return A new, uninitialized @{link Poll}
     */
    public static Poll allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        Poll newInstance = new Poll(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a Poll proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected Poll(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, Poll> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new Poll(input, ownership);
    
    /**
     * Add a file descriptor to the file descriptor set.
     * @param fd a file descriptor.
     * @return {@code true} if the file descriptor was successfully added to the set.
     */
    public boolean addFd(org.gstreamer.gst.PollFD fd) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_poll_add_fd.invokeExact(
                    handle(),
                    fd.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Check if {@code fd} in {@code set} has data to be read.
     * @param fd a file descriptor.
     * @return {@code true} if the descriptor has data to be read.
     */
    public boolean fdCanRead(org.gstreamer.gst.PollFD fd) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_poll_fd_can_read.invokeExact(
                    handle(),
                    fd.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Check if {@code fd} in {@code set} can be used for writing.
     * @param fd a file descriptor.
     * @return {@code true} if the descriptor can be used for writing.
     */
    public boolean fdCanWrite(org.gstreamer.gst.PollFD fd) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_poll_fd_can_write.invokeExact(
                    handle(),
                    fd.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Control whether the descriptor {@code fd} in {@code set} will be monitored for
     * exceptional conditions (POLLPRI).
     * <p>
     * Not implemented on Windows (will just return {@code false} there).
     * @param fd a file descriptor.
     * @param active a new status.
     * @return {@code true} if the descriptor was successfully updated.
     */
    public boolean fdCtlPri(org.gstreamer.gst.PollFD fd, boolean active) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_poll_fd_ctl_pri.invokeExact(
                    handle(),
                    fd.handle(),
                    Marshal.booleanToInteger.marshal(active, null).intValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Control whether the descriptor {@code fd} in {@code set} will be monitored for
     * readability.
     * @param fd a file descriptor.
     * @param active a new status.
     * @return {@code true} if the descriptor was successfully updated.
     */
    public boolean fdCtlRead(org.gstreamer.gst.PollFD fd, boolean active) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_poll_fd_ctl_read.invokeExact(
                    handle(),
                    fd.handle(),
                    Marshal.booleanToInteger.marshal(active, null).intValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Control whether the descriptor {@code fd} in {@code set} will be monitored for
     * writability.
     * @param fd a file descriptor.
     * @param active a new status.
     * @return {@code true} if the descriptor was successfully updated.
     */
    public boolean fdCtlWrite(org.gstreamer.gst.PollFD fd, boolean active) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_poll_fd_ctl_write.invokeExact(
                    handle(),
                    fd.handle(),
                    Marshal.booleanToInteger.marshal(active, null).intValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Check if {@code fd} in {@code set} has closed the connection.
     * @param fd a file descriptor.
     * @return {@code true} if the connection was closed.
     */
    public boolean fdHasClosed(org.gstreamer.gst.PollFD fd) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_poll_fd_has_closed.invokeExact(
                    handle(),
                    fd.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Check if {@code fd} in {@code set} has an error.
     * @param fd a file descriptor.
     * @return {@code true} if the descriptor has an error.
     */
    public boolean fdHasError(org.gstreamer.gst.PollFD fd) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_poll_fd_has_error.invokeExact(
                    handle(),
                    fd.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Check if {@code fd} in {@code set} has an exceptional condition (POLLPRI).
     * <p>
     * Not implemented on Windows (will just return {@code false} there).
     * @param fd a file descriptor.
     * @return {@code true} if the descriptor has an exceptional condition.
     */
    public boolean fdHasPri(org.gstreamer.gst.PollFD fd) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_poll_fd_has_pri.invokeExact(
                    handle(),
                    fd.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Mark {@code fd} as ignored so that the next call to gst_poll_wait() will yield
     * the same result for {@code fd} as last time. This function must be called if no
     * operation (read/write/recv/send/etc.) will be performed on {@code fd} before
     * the next call to gst_poll_wait().
     * <p>
     * The reason why this is needed is because the underlying implementation
     * might not allow querying the fd more than once between calls to one of
     * the re-enabling operations.
     * @param fd a file descriptor.
     */
    public void fdIgnored(org.gstreamer.gst.PollFD fd) {
        try {
            DowncallHandles.gst_poll_fd_ignored.invokeExact(
                    handle(),
                    fd.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Free a file descriptor set.
     */
    public void free() {
        try {
            DowncallHandles.gst_poll_free.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        this.yieldOwnership();
    }
    
    /**
     * Get a GPollFD for the reading part of the control socket. This is useful when
     * integrating with a GSource and GMainLoop.
     * @param fd a {@link org.gtk.glib.PollFD}
     */
    public void getReadGpollfd(org.gtk.glib.PollFD fd) {
        try {
            DowncallHandles.gst_poll_get_read_gpollfd.invokeExact(
                    handle(),
                    fd.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Read a byte from the control socket of the controllable {@code set}.
     * <p>
     * This function only works for timer {@link Poll} objects created with
     * gst_poll_new_timer().
     * @return {@code true} on success. {@code false} when when there was no byte to read or
     * reading the byte failed. If there was no byte to read, and only then, errno
     * will contain EWOULDBLOCK or EAGAIN. For all other values of errno this always signals a
     * critical error.
     */
    public boolean readControl() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_poll_read_control.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Remove a file descriptor from the file descriptor set.
     * @param fd a file descriptor.
     * @return {@code true} if the file descriptor was successfully removed from the set.
     */
    public boolean removeFd(org.gstreamer.gst.PollFD fd) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_poll_remove_fd.invokeExact(
                    handle(),
                    fd.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Restart any gst_poll_wait() that is in progress. This function is typically
     * used after adding or removing descriptors to {@code set}.
     * <p>
     * If {@code set} is not controllable, then this call will have no effect.
     * <p>
     * This function only works for non-timer {@link Poll} objects created with
     * gst_poll_new().
     */
    public void restart() {
        try {
            DowncallHandles.gst_poll_restart.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * When {@code controllable} is {@code true}, this function ensures that future calls to
     * gst_poll_wait() will be affected by gst_poll_restart() and
     * gst_poll_set_flushing().
     * <p>
     * This function only works for non-timer {@link Poll} objects created with
     * gst_poll_new().
     * @param controllable new controllable state.
     * @return {@code true} if the controllability of {@code set} could be updated.
     */
    public boolean setControllable(boolean controllable) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_poll_set_controllable.invokeExact(
                    handle(),
                    Marshal.booleanToInteger.marshal(controllable, null).intValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * When {@code flushing} is {@code true}, this function ensures that current and future calls
     * to gst_poll_wait() will return -1, with errno set to EBUSY.
     * <p>
     * Unsetting the flushing state will restore normal operation of {@code set}.
     * <p>
     * This function only works for non-timer {@link Poll} objects created with
     * gst_poll_new().
     * @param flushing new flushing state.
     */
    public void setFlushing(boolean flushing) {
        try {
            DowncallHandles.gst_poll_set_flushing.invokeExact(
                    handle(),
                    Marshal.booleanToInteger.marshal(flushing, null).intValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Wait for activity on the file descriptors in {@code set}. This function waits up to
     * the specified {@code timeout}.  A timeout of {@code GST_CLOCK_TIME_NONE} waits forever.
     * <p>
     * For {@link Poll} objects created with gst_poll_new(), this function can only be
     * called from a single thread at a time.  If called from multiple threads,
     * -1 will be returned with errno set to EPERM.
     * <p>
     * This is not true for timer {@link Poll} objects created with
     * gst_poll_new_timer(), where it is allowed to have multiple threads waiting
     * simultaneously.
     * @param timeout a timeout in nanoseconds.
     * @return The number of {@link PollFD} in {@code set} that have activity or 0 when no
     * activity was detected after {@code timeout}. If an error occurs, -1 is returned
     * and errno is set.
     */
    public int wait_(org.gstreamer.gst.ClockTime timeout) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_poll_wait.invokeExact(
                    handle(),
                    timeout.getValue().longValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Write a byte to the control socket of the controllable {@code set}.
     * This function is mostly useful for timer {@link Poll} objects created with
     * gst_poll_new_timer().
     * <p>
     * It will make any current and future gst_poll_wait() function return with
     * 1, meaning the control socket is set. After an equal amount of calls to
     * gst_poll_read_control() have been performed, calls to gst_poll_wait() will
     * block again until their timeout expired.
     * <p>
     * This function only works for timer {@link Poll} objects created with
     * gst_poll_new_timer().
     * @return {@code true} on success. {@code false} when when the byte could not be written.
     * errno contains the detailed error code but will never be EAGAIN, EINTR or
     * EWOULDBLOCK. {@code false} always signals a critical error.
     */
    public boolean writeControl() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_poll_write_control.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Create a new file descriptor set. If {@code controllable}, it
     * is possible to restart or flush a call to gst_poll_wait() with
     * gst_poll_restart() and gst_poll_set_flushing() respectively.
     * <p>
     * Free-function: gst_poll_free
     * @param controllable whether it should be possible to control a wait.
     * @return a new {@link Poll}, or {@code null} in
     *     case of an error.  Free with gst_poll_free().
     */
    public static @Nullable org.gstreamer.gst.Poll new_(boolean controllable) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_poll_new.invokeExact(
                    Marshal.booleanToInteger.marshal(controllable, null).intValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.gst.Poll.fromAddress.marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * Create a new poll object that can be used for scheduling cancellable
     * timeouts.
     * <p>
     * A timeout is performed with gst_poll_wait(). Multiple timeouts can be
     * performed from different threads.
     * <p>
     * Free-function: gst_poll_free
     * @return a new {@link Poll}, or {@code null} in
     *     case of an error.  Free with gst_poll_free().
     */
    public static @Nullable org.gstreamer.gst.Poll newTimer() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_poll_new_timer.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.gst.Poll.fromAddress.marshal(RESULT, Ownership.FULL);
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_poll_add_fd = Interop.downcallHandle(
            "gst_poll_add_fd",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_poll_fd_can_read = Interop.downcallHandle(
            "gst_poll_fd_can_read",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_poll_fd_can_write = Interop.downcallHandle(
            "gst_poll_fd_can_write",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_poll_fd_ctl_pri = Interop.downcallHandle(
            "gst_poll_fd_ctl_pri",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_poll_fd_ctl_read = Interop.downcallHandle(
            "gst_poll_fd_ctl_read",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_poll_fd_ctl_write = Interop.downcallHandle(
            "gst_poll_fd_ctl_write",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_poll_fd_has_closed = Interop.downcallHandle(
            "gst_poll_fd_has_closed",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_poll_fd_has_error = Interop.downcallHandle(
            "gst_poll_fd_has_error",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_poll_fd_has_pri = Interop.downcallHandle(
            "gst_poll_fd_has_pri",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_poll_fd_ignored = Interop.downcallHandle(
            "gst_poll_fd_ignored",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_poll_free = Interop.downcallHandle(
            "gst_poll_free",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_poll_get_read_gpollfd = Interop.downcallHandle(
            "gst_poll_get_read_gpollfd",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_poll_read_control = Interop.downcallHandle(
            "gst_poll_read_control",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_poll_remove_fd = Interop.downcallHandle(
            "gst_poll_remove_fd",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_poll_restart = Interop.downcallHandle(
            "gst_poll_restart",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_poll_set_controllable = Interop.downcallHandle(
            "gst_poll_set_controllable",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_poll_set_flushing = Interop.downcallHandle(
            "gst_poll_set_flushing",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_poll_wait = Interop.downcallHandle(
            "gst_poll_wait",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG),
            false
        );
        
        private static final MethodHandle gst_poll_write_control = Interop.downcallHandle(
            "gst_poll_write_control",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_poll_new = Interop.downcallHandle(
            "gst_poll_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_poll_new_timer = Interop.downcallHandle(
            "gst_poll_new_timer",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
            false
        );
    }
}
