package org.gstreamer.net;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Various functions for receiving, sending an serializing {@link NetTimePacket}
 * structures.
 */
public class NetTimePacket extends Struct {
    
    static {
        GstNet.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstNetTimePacket";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            Interop.valueLayout.C_LONG.withName("local_time"),
            Interop.valueLayout.C_LONG.withName("remote_time")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link NetTimePacket}
     * @return A new, uninitialized @{link NetTimePacket}
     */
    public static NetTimePacket allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        NetTimePacket newInstance = new NetTimePacket(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code local_time}
     * @return The value of the field {@code local_time}
     */
    public org.gstreamer.gst.ClockTime getLocalTime() {
        var RESULT = (long) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("local_time"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return new org.gstreamer.gst.ClockTime(RESULT);
    }
    
    /**
     * Change the value of the field {@code local_time}
     * @param localTime The new value of the field {@code local_time}
     */
    public void setLocalTime(org.gstreamer.gst.ClockTime localTime) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("local_time"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (localTime == null ? MemoryAddress.NULL : localTime.getValue().longValue()));
    }
    
    /**
     * Get the value of the field {@code remote_time}
     * @return The value of the field {@code remote_time}
     */
    public org.gstreamer.gst.ClockTime getRemoteTime() {
        var RESULT = (long) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("remote_time"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return new org.gstreamer.gst.ClockTime(RESULT);
    }
    
    /**
     * Change the value of the field {@code remote_time}
     * @param remoteTime The new value of the field {@code remote_time}
     */
    public void setRemoteTime(org.gstreamer.gst.ClockTime remoteTime) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("remote_time"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (remoteTime == null ? MemoryAddress.NULL : remoteTime.getValue().longValue()));
    }
    
    /**
     * Create a NetTimePacket proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected NetTimePacket(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, NetTimePacket> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new NetTimePacket(input, ownership);
    
    private static MemoryAddress constructNew(byte[] buffer) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_net_time_packet_new.invokeExact(
                    Interop.allocateNativeArray(buffer, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new {@link NetTimePacket} from a buffer received over the network. The
     * caller is responsible for ensuring that {@code buffer} is at least
     * {@code GST_NET_TIME_PACKET_SIZE} bytes long.
     * <p>
     * If {@code buffer} is {@code null}, the local and remote times will be set to
     * {@code GST_CLOCK_TIME_NONE}.
     * <p>
     * MT safe. Caller owns return value (gst_net_time_packet_free to free).
     * @param buffer a buffer from which to construct the packet, or NULL
     */
    public NetTimePacket(byte[] buffer) {
        super(constructNew(buffer), Ownership.FULL);
    }
    
    /**
     * Make a copy of {@code packet}.
     * @return a copy of {@code packet}, free with gst_net_time_packet_free().
     */
    public org.gstreamer.net.NetTimePacket copy() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_net_time_packet_copy.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.net.NetTimePacket.fromAddress.marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * Free {@code packet}.
     */
    public void free() {
        try {
            DowncallHandles.gst_net_time_packet_free.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sends a {@link NetTimePacket} over a socket.
     * <p>
     * MT safe.
     * @param socket socket to send the time packet on
     * @param destAddress address to send the time packet to
     * @return TRUE if successful, FALSE in case an error occurred.
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public boolean send(org.gtk.gio.Socket socket, org.gtk.gio.SocketAddress destAddress) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_net_time_packet_send.invokeExact(
                    handle(),
                    socket.handle(),
                    destAddress.handle(),
                    (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Serialized a {@link NetTimePacket} into a newly-allocated sequence of
     * {@code GST_NET_TIME_PACKET_SIZE} bytes, in network byte order. The value returned is
     * suitable for passing to write(2) or sendto(2) for communication over the
     * network.
     * <p>
     * MT safe. Caller owns return value (g_free to free).
     * @return A newly allocated sequence of {@code GST_NET_TIME_PACKET_SIZE} bytes.
     */
    public PointerByte serialize() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_net_time_packet_serialize.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new PointerByte(RESULT);
    }
    
    /**
     * Receives a {@link NetTimePacket} over a socket. Handles interrupted system
     * calls, but otherwise returns NULL on error.
     * @param socket socket to receive the time packet on
     * @param srcAddress address of variable to return sender address
     * @return a new {@link NetTimePacket}, or NULL on error. Free
     *    with gst_net_time_packet_free() when done.
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public static org.gstreamer.net.NetTimePacket receive(org.gtk.gio.Socket socket, Out<org.gtk.gio.SocketAddress> srcAddress) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment srcAddressPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        MemorySegment GERROR = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_net_time_packet_receive.invokeExact(
                    socket.handle(),
                    (Addressable) srcAddressPOINTER.address(),
                    (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        srcAddress.set((org.gtk.gio.SocketAddress) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(srcAddressPOINTER.get(Interop.valueLayout.ADDRESS, 0))), org.gtk.gio.SocketAddress.fromAddress).marshal(srcAddressPOINTER.get(Interop.valueLayout.ADDRESS, 0), Ownership.FULL));
        return org.gstreamer.net.NetTimePacket.fromAddress.marshal(RESULT, Ownership.FULL);
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_net_time_packet_new = Interop.downcallHandle(
            "gst_net_time_packet_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_net_time_packet_copy = Interop.downcallHandle(
            "gst_net_time_packet_copy",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_net_time_packet_free = Interop.downcallHandle(
            "gst_net_time_packet_free",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_net_time_packet_send = Interop.downcallHandle(
            "gst_net_time_packet_send",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_net_time_packet_serialize = Interop.downcallHandle(
            "gst_net_time_packet_serialize",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_net_time_packet_receive = Interop.downcallHandle(
            "gst_net_time_packet_receive",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
    }
    
    /**
     * A {@link NetTimePacket.Builder} object constructs a {@link NetTimePacket} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link NetTimePacket.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final NetTimePacket struct;
        
        private Builder() {
            struct = NetTimePacket.allocate();
        }
        
         /**
         * Finish building the {@link NetTimePacket} struct.
         * @return A new instance of {@code NetTimePacket} with the fields 
         *         that were set in the Builder object.
         */
        public NetTimePacket build() {
            return struct;
        }
        
        /**
         * the local time when this packet was sent
         * @param localTime The value for the {@code localTime} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setLocalTime(org.gstreamer.gst.ClockTime localTime) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("local_time"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (localTime == null ? MemoryAddress.NULL : localTime.getValue().longValue()));
            return this;
        }
        
        /**
         * the remote time observation
         * @param remoteTime The value for the {@code remoteTime} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setRemoteTime(org.gstreamer.gst.ClockTime remoteTime) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("remote_time"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (remoteTime == null ? MemoryAddress.NULL : remoteTime.getValue().longValue()));
            return this;
        }
    }
}
