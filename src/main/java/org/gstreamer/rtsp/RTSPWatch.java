package org.gstreamer.rtsp;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Opaque RTSP watch object that can be used for asynchronous RTSP
 * operations.
 */
public class RTSPWatch extends Struct {
    
    static {
        GstRtsp.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstRTSPWatch";
    
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
     * Allocate a new {@link RTSPWatch}
     * @return A new, uninitialized @{link RTSPWatch}
     */
    public static RTSPWatch allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        RTSPWatch newInstance = new RTSPWatch(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a RTSPWatch proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected RTSPWatch(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, RTSPWatch> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new RTSPWatch(input, ownership);
    
    /**
     * Adds a {@link RTSPWatch} to a context so that it will be executed within that context.
     * @param context a GMainContext (if NULL, the default context will be used)
     * @return the ID (greater than 0) for the watch within the GMainContext.
     */
    public int attach(org.gtk.glib.MainContext context) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_rtsp_watch_attach.invokeExact(
                    handle(),
                    context.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Get the maximum amount of bytes and messages that will be queued in {@code watch}.
     * See gst_rtsp_watch_set_send_backlog().
     * @param bytes maximum bytes
     * @param messages maximum messages
     */
    public void getSendBacklog(Out<Long> bytes, Out<Integer> messages) {
        MemorySegment bytesPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_LONG);
        MemorySegment messagesPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        try {
            DowncallHandles.gst_rtsp_watch_get_send_backlog.invokeExact(
                    handle(),
                    (Addressable) (bytes == null ? MemoryAddress.NULL : (Addressable) bytesPOINTER.address()),
                    (Addressable) (messages == null ? MemoryAddress.NULL : (Addressable) messagesPOINTER.address()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (bytes != null) bytes.set(bytesPOINTER.get(Interop.valueLayout.C_LONG, 0));
        if (messages != null) messages.set(messagesPOINTER.get(Interop.valueLayout.C_INT, 0));
    }
    
    /**
     * Reset {@code watch}, this is usually called after gst_rtsp_connection_do_tunnel()
     * when the file descriptors of the connection might have changed.
     */
    public void reset() {
        try {
            DowncallHandles.gst_rtsp_watch_reset.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Send a {@code message} using the connection of the {@code watch}. If it cannot be sent
     * immediately, it will be queued for transmission in {@code watch}. The contents of
     * {@code message} will then be serialized and transmitted when the connection of the
     * {@code watch} becomes writable. In case the {@code message} is queued, the ID returned in
     * {@code id} will be non-zero and used as the ID argument in the message_sent
     * callback.
     * @param message a {@link RTSPMessage}
     * @param id location for a message ID or {@code null}
     * @return {@code GST_RTSP_OK} on success.
     */
    public org.gstreamer.rtsp.RTSPResult sendMessage(org.gstreamer.rtsp.RTSPMessage message, Out<Integer> id) {
        MemorySegment idPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_rtsp_watch_send_message.invokeExact(
                    handle(),
                    message.handle(),
                    (Addressable) (id == null ? MemoryAddress.NULL : (Addressable) idPOINTER.address()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (id != null) id.set(idPOINTER.get(Interop.valueLayout.C_INT, 0));
        return org.gstreamer.rtsp.RTSPResult.of(RESULT);
    }
    
    /**
     * Sends {@code messages} using the connection of the {@code watch}. If they cannot be sent
     * immediately, they will be queued for transmission in {@code watch}. The contents of
     * {@code messages} will then be serialized and transmitted when the connection of the
     * {@code watch} becomes writable. In case the {@code messages} are queued, the ID returned in
     * {@code id} will be non-zero and used as the ID argument in the message_sent
     * callback once the last message is sent. The callback will only be called
     * once for the last message.
     * @param messages the messages to send
     * @param nMessages the number of messages to send
     * @param id location for a message ID or {@code null}
     * @return {@code GST_RTSP_OK} on success.
     */
    public org.gstreamer.rtsp.RTSPResult sendMessages(org.gstreamer.rtsp.RTSPMessage[] messages, int nMessages, Out<Integer> id) {
        MemorySegment idPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_rtsp_watch_send_messages.invokeExact(
                    handle(),
                    Interop.allocateNativeArray(messages, org.gstreamer.rtsp.RTSPMessage.getMemoryLayout(), false),
                    nMessages,
                    (Addressable) (id == null ? MemoryAddress.NULL : (Addressable) idPOINTER.address()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (id != null) id.set(idPOINTER.get(Interop.valueLayout.C_INT, 0));
        return org.gstreamer.rtsp.RTSPResult.of(RESULT);
    }
    
    /**
     * When {@code flushing} is {@code true}, abort a call to gst_rtsp_watch_wait_backlog()
     * and make sure gst_rtsp_watch_write_data() returns immediately with
     * {@code GST_RTSP_EINTR}. And empty the queue.
     * @param flushing new flushing state
     */
    public void setFlushing(boolean flushing) {
        try {
            DowncallHandles.gst_rtsp_watch_set_flushing.invokeExact(
                    handle(),
                    Marshal.booleanToInteger.marshal(flushing, null).intValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Set the maximum amount of bytes and messages that will be queued in {@code watch}.
     * When the maximum amounts are exceeded, gst_rtsp_watch_write_data() and
     * gst_rtsp_watch_send_message() will return {@code GST_RTSP_ENOMEM}.
     * <p>
     * A value of 0 for {@code bytes} or {@code messages} means no limits.
     * @param bytes maximum bytes
     * @param messages maximum messages
     */
    public void setSendBacklog(long bytes, int messages) {
        try {
            DowncallHandles.gst_rtsp_watch_set_send_backlog.invokeExact(
                    handle(),
                    bytes,
                    messages);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Decreases the reference count of {@code watch} by one. If the resulting reference
     * count is zero the watch and associated memory will be destroyed.
     */
    public void unref() {
        try {
            DowncallHandles.gst_rtsp_watch_unref.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Wait until there is place in the backlog queue, {@code timeout} is reached
     * or {@code watch} is set to flushing.
     * <p>
     * If {@code timeout} is {@code null} this function can block forever. If {@code timeout}
     * contains a valid timeout, this function will return {@link RTSPResult#ETIMEOUT}
     * after the timeout expired.
     * <p>
     * The typically use of this function is when gst_rtsp_watch_write_data
     * returns {@link RTSPResult#ENOMEM}. The caller then calls this function to wait for
     * free space in the backlog queue and try again.
     * @param timeout a GTimeVal timeout
     * @return {@link RTSPResult#OK} when if there is room in queue.
     *          {@link RTSPResult#ETIMEOUT} when {@code timeout} was reached.
     *          {@link RTSPResult#EINTR} when {@code watch} is flushing
     *          {@link RTSPResult#EINVAL} when called with invalid parameters.
     */
    @Deprecated
    public org.gstreamer.rtsp.RTSPResult waitBacklog(org.gtk.glib.TimeVal timeout) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_rtsp_watch_wait_backlog.invokeExact(
                    handle(),
                    timeout.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.rtsp.RTSPResult.of(RESULT);
    }
    
    /**
     * Wait until there is place in the backlog queue, {@code timeout} is reached
     * or {@code watch} is set to flushing.
     * <p>
     * If {@code timeout} is 0 this function can block forever. If {@code timeout}
     * contains a valid timeout, this function will return {@link RTSPResult#ETIMEOUT}
     * after the timeout expired.
     * <p>
     * The typically use of this function is when gst_rtsp_watch_write_data
     * returns {@link RTSPResult#ENOMEM}. The caller then calls this function to wait for
     * free space in the backlog queue and try again.
     * @param timeout a timeout in microseconds
     * @return {@link RTSPResult#OK} when if there is room in queue.
     *          {@link RTSPResult#ETIMEOUT} when {@code timeout} was reached.
     *          {@link RTSPResult#EINTR} when {@code watch} is flushing
     *          {@link RTSPResult#EINVAL} when called with invalid parameters.
     */
    public org.gstreamer.rtsp.RTSPResult waitBacklogUsec(long timeout) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_rtsp_watch_wait_backlog_usec.invokeExact(
                    handle(),
                    timeout);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.rtsp.RTSPResult.of(RESULT);
    }
    
    /**
     * Write {@code data} using the connection of the {@code watch}. If it cannot be sent
     * immediately, it will be queued for transmission in {@code watch}. The contents of
     * {@code message} will then be serialized and transmitted when the connection of the
     * {@code watch} becomes writable. In case the {@code message} is queued, the ID returned in
     * {@code id} will be non-zero and used as the ID argument in the message_sent
     * callback.
     * <p>
     * This function will take ownership of {@code data} and g_free() it after use.
     * <p>
     * If the amount of queued data exceeds the limits set with
     * gst_rtsp_watch_set_send_backlog(), this function will return
     * {@code GST_RTSP_ENOMEM}.
     * @param data the data to queue
     * @param size the size of {@code data}
     * @param id location for a message ID or {@code null}
     * @return {@code GST_RTSP_OK} on success. {@code GST_RTSP_ENOMEM} when the backlog limits
     * are reached. {@code GST_RTSP_EINTR} when {@code watch} was flushing.
     */
    public org.gstreamer.rtsp.RTSPResult writeData(byte[] data, int size, Out<Integer> id) {
        MemorySegment idPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_rtsp_watch_write_data.invokeExact(
                    handle(),
                    Interop.allocateNativeArray(data, false),
                    size,
                    (Addressable) (id == null ? MemoryAddress.NULL : (Addressable) idPOINTER.address()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (id != null) id.set(idPOINTER.get(Interop.valueLayout.C_INT, 0));
        return org.gstreamer.rtsp.RTSPResult.of(RESULT);
    }
    
    /**
     * Create a watch object for {@code conn}. The functions provided in {@code funcs} will be
     * called with {@code user_data} when activity happened on the watch.
     * <p>
     * The new watch is usually created so that it can be attached to a
     * maincontext with gst_rtsp_watch_attach().
     * <p>
     * {@code conn} must exist for the entire lifetime of the watch.
     * @param conn a {@link RTSPConnection}
     * @param funcs watch functions
     * @param notify notify when {@code user_data} is not referenced anymore
     * @return a {@link RTSPWatch} that can be used for asynchronous RTSP
     * communication. Free with gst_rtsp_watch_unref () after usage.
     */
    public static org.gstreamer.rtsp.RTSPWatch new_(org.gstreamer.rtsp.RTSPConnection conn, org.gstreamer.rtsp.RTSPWatchFuncs funcs, org.gtk.glib.DestroyNotify notify) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_rtsp_watch_new.invokeExact(
                    conn.handle(),
                    funcs.handle(),
                    (Addressable) MemoryAddress.NULL,
                    (Addressable) notify.toCallback());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.rtsp.RTSPWatch.fromAddress.marshal(RESULT, Ownership.UNKNOWN);
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_rtsp_watch_attach = Interop.downcallHandle(
            "gst_rtsp_watch_attach",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_rtsp_watch_get_send_backlog = Interop.downcallHandle(
            "gst_rtsp_watch_get_send_backlog",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_rtsp_watch_reset = Interop.downcallHandle(
            "gst_rtsp_watch_reset",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_rtsp_watch_send_message = Interop.downcallHandle(
            "gst_rtsp_watch_send_message",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_rtsp_watch_send_messages = Interop.downcallHandle(
            "gst_rtsp_watch_send_messages",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_rtsp_watch_set_flushing = Interop.downcallHandle(
            "gst_rtsp_watch_set_flushing",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_rtsp_watch_set_send_backlog = Interop.downcallHandle(
            "gst_rtsp_watch_set_send_backlog",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_rtsp_watch_unref = Interop.downcallHandle(
            "gst_rtsp_watch_unref",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_rtsp_watch_wait_backlog = Interop.downcallHandle(
            "gst_rtsp_watch_wait_backlog",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_rtsp_watch_wait_backlog_usec = Interop.downcallHandle(
            "gst_rtsp_watch_wait_backlog_usec",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG),
            false
        );
        
        private static final MethodHandle gst_rtsp_watch_write_data = Interop.downcallHandle(
            "gst_rtsp_watch_write_data",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_rtsp_watch_new = Interop.downcallHandle(
            "gst_rtsp_watch_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
    }
}
