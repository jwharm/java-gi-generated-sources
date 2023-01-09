package org.gstreamer.net;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class NtpClock extends org.gstreamer.net.NetClientClock {
    
    static {
        GstNet.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstNtpClock";
    
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
     * Create a NtpClock proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected NtpClock(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, NtpClock> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new NtpClock(input);
    
    private static MemoryAddress constructNew(java.lang.String name, java.lang.String remoteAddress, int remotePort, org.gstreamer.gst.ClockTime baseTime) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.gst_ntp_clock_new.invokeExact(
                        Marshal.stringToAddress.marshal(name, SCOPE),
                        Marshal.stringToAddress.marshal(remoteAddress, SCOPE),
                        remotePort,
                        baseTime.getValue().longValue());
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return RESULT;
        }
    }
    
    /**
     * Create a new {@link NtpClock} that will report the time provided by
     * the NTPv4 server on {@code remote_address} and {@code remote_port}.
     * @param name a name for the clock
     * @param remoteAddress the address or hostname of the remote clock provider
     * @param remotePort the port of the remote clock provider
     * @param baseTime initial time of the clock
     */
    public NtpClock(java.lang.String name, java.lang.String remoteAddress, int remotePort, org.gstreamer.gst.ClockTime baseTime) {
        super(constructNew(name, remoteAddress, remotePort, baseTime));
        this.takeOwnership();
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gst_ntp_clock_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * A {@link NtpClock.Builder} object constructs a {@link NtpClock} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link NtpClock.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a GObject with properties.
     */
    public static class Builder extends org.gstreamer.net.NetClientClock.Builder {
        
        /**
         * Default constructor for a {@code Builder} object.
         */
        protected Builder() {
        }
        
        /**
         * Finish building the {@link NtpClock} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link NtpClock}.
         * @return A new instance of {@code NtpClock} with the properties 
         *         that were set in the Builder object.
         */
        public NtpClock build() {
            return (NtpClock) org.gtk.gobject.GObject.newWithProperties(
                NtpClock.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_ntp_clock_new = Interop.downcallHandle(
                "gst_ntp_clock_new",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_LONG),
                false
        );
        
        private static final MethodHandle gst_ntp_clock_get_type = Interop.downcallHandle(
                "gst_ntp_clock_get_type",
                FunctionDescriptor.of(Interop.valueLayout.C_LONG),
                false
        );
    }
    
    /**
     * Check whether the type is available on the runtime platform.
     * @return {@code true} when the type is available on the runtime platform
     */
    public static boolean isAvailable() {
        return DowncallHandles.gst_ntp_clock_get_type != null;
    }
}
