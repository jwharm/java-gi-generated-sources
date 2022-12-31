package org.gstreamer.net;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@link NetClientClock} implements a custom {@link org.gstreamer.gst.Clock} that synchronizes its time
 * to a remote time provider such as {@link NetTimeProvider}. {@link NtpClock}
 * implements a {@link org.gstreamer.gst.Clock} that synchronizes its time to a remote NTPv4 server.
 * <p>
 * A new clock is created with gst_net_client_clock_new() or
 * gst_ntp_clock_new(), which takes the address and port of the remote time
 * provider along with a name and an initial time.
 * <p>
 * This clock will poll the time provider and will update its calibration
 * parameters based on the local and remote observations.
 * <p>
 * The "round-trip" property limits the maximum round trip packets can take.
 * <p>
 * Various parameters of the clock can be configured with the parent {@link org.gstreamer.gst.Clock}
 * "timeout", "window-size" and "window-threshold" object properties.
 * <p>
 * A {@link NetClientClock} and {@link NtpClock} is typically set on a {@link org.gstreamer.gst.Pipeline} with
 * gst_pipeline_use_clock().
 * <p>
 * If you set a {@link org.gstreamer.gst.Bus} on the clock via the "bus" object property, it will
 * send {@code GST_MESSAGE_ELEMENT} messages with an attached {@link org.gstreamer.gst.Structure} containing
 * statistics about clock accuracy and network traffic.
 */
public class NetClientClock extends org.gstreamer.gst.SystemClock {
    
    static {
        GstNet.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstNetClientClock";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gstreamer.gst.SystemClock.getMemoryLayout().withName("clock"),
            Interop.valueLayout.ADDRESS.withName("priv"),
            MemoryLayout.sequenceLayout(4, Interop.valueLayout.ADDRESS).withName("_gst_reserved")
        ).withName(C_TYPE_NAME);
    }
    
    /**
     * Create a NetClientClock proxy instance for the provided memory address.
     * <p>
     * Because NetClientClock is an {@code InitiallyUnowned} instance, when 
     * {@code ownership == Ownership.NONE}, the ownership is set to {@code FULL} 
     * and a call to {@code g_object_ref_sink()} is executed to sink the floating reference.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected NetClientClock(Addressable address, Ownership ownership) {
        super(address, Ownership.FULL);
        if (ownership == Ownership.NONE) {
            try {
                var RESULT = (MemoryAddress) Interop.g_object_ref_sink.invokeExact(address);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
        }
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, NetClientClock> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new NetClientClock(input, ownership);
    
    private static MemoryAddress constructNew(java.lang.String name, java.lang.String remoteAddress, int remotePort, org.gstreamer.gst.ClockTime baseTime) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_net_client_clock_new.invokeExact(
                    Marshal.stringToAddress.marshal(name, null),
                    Marshal.stringToAddress.marshal(remoteAddress, null),
                    remotePort,
                    baseTime.getValue().longValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Create a new {@link NetClientClock} that will report the time
     * provided by the {@link NetTimeProvider} on {@code remote_address} and
     * {@code remote_port}.
     * @param name a name for the clock
     * @param remoteAddress the address or hostname of the remote clock provider
     * @param remotePort the port of the remote clock provider
     * @param baseTime initial time of the clock
     */
    public NetClientClock(java.lang.String name, java.lang.String remoteAddress, int remotePort, org.gstreamer.gst.ClockTime baseTime) {
        super(constructNew(name, remoteAddress, remotePort, baseTime), Ownership.FULL);
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gst_net_client_clock_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * A {@link NetClientClock.Builder} object constructs a {@link NetClientClock} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link NetClientClock.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a GObject with properties.
     */
    public static class Builder extends org.gstreamer.gst.SystemClock.Builder {
        
        protected Builder() {
        }
        
        /**
         * Finish building the {@link NetClientClock} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link NetClientClock}.
         * @return A new instance of {@code NetClientClock} with the properties 
         *         that were set in the Builder object.
         */
        public NetClientClock build() {
            return (NetClientClock) org.gtk.gobject.GObject.newWithProperties(
                NetClientClock.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
        
        public Builder setAddress(java.lang.String address) {
            names.add("address");
            values.add(org.gtk.gobject.Value.create(address));
            return this;
        }
        
        public Builder setBaseTime(long baseTime) {
            names.add("base-time");
            values.add(org.gtk.gobject.Value.create(baseTime));
            return this;
        }
        
        public Builder setBus(org.gstreamer.gst.Bus bus) {
            names.add("bus");
            values.add(org.gtk.gobject.Value.create(bus));
            return this;
        }
        
        public Builder setInternalClock(org.gstreamer.gst.Clock internalClock) {
            names.add("internal-clock");
            values.add(org.gtk.gobject.Value.create(internalClock));
            return this;
        }
        
        public Builder setMinimumUpdateInterval(long minimumUpdateInterval) {
            names.add("minimum-update-interval");
            values.add(org.gtk.gobject.Value.create(minimumUpdateInterval));
            return this;
        }
        
        public Builder setPort(int port) {
            names.add("port");
            values.add(org.gtk.gobject.Value.create(port));
            return this;
        }
        
        public Builder setQosDscp(int qosDscp) {
            names.add("qos-dscp");
            values.add(org.gtk.gobject.Value.create(qosDscp));
            return this;
        }
        
        public Builder setRoundTripLimit(long roundTripLimit) {
            names.add("round-trip-limit");
            values.add(org.gtk.gobject.Value.create(roundTripLimit));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_net_client_clock_new = Interop.downcallHandle(
            "gst_net_client_clock_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_LONG),
            false
        );
        
        private static final MethodHandle gst_net_client_clock_get_type = Interop.downcallHandle(
            "gst_net_client_clock_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
    }
}
