package org.gstreamer.net;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * GstPtpClock implements a PTP (IEEE1588:2008) ordinary clock in slave-only
 * mode, that allows a GStreamer pipeline to synchronize to a PTP network
 * clock in some specific domain.
 * <p>
 * The PTP subsystem can be initialized with gst_ptp_init(), which then starts
 * a helper process to do the actual communication via the PTP ports. This is
 * required as PTP listens on ports &lt; 1024 and thus requires special
 * privileges. Once this helper process is started, the main process will
 * synchronize to all PTP domains that are detected on the selected
 * interfaces.
 * <p>
 * gst_ptp_clock_new() then allows to create a GstClock that provides the PTP
 * time from a master clock inside a specific PTP domain. This clock will only
 * return valid timestamps once the timestamps in the PTP domain are known. To
 * check this, you can use gst_clock_wait_for_sync(), the GstClock::synced
 * signal and gst_clock_is_synced().
 * <p>
 * To gather statistics about the PTP clock synchronization,
 * gst_ptp_statistics_callback_add() can be used. This gives the application
 * the possibility to collect all kinds of statistics from the clock
 * synchronization.
 * @version 1.6
 */
public class PtpClock extends org.gstreamer.gst.SystemClock {
    
    static {
        GstNet.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstPtpClock";
    
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
     * Create a PtpClock proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected PtpClock(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, PtpClock> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new PtpClock(input);
    
    private static MemoryAddress constructNew(java.lang.String name, int domain) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.gst_ptp_clock_new.invokeExact(
                        Marshal.stringToAddress.marshal(name, SCOPE),
                        domain);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return RESULT;
        }
    }
    
    /**
     * Creates a new PTP clock instance that exports the PTP time of the master
     * clock in {@code domain}. This clock can be slaved to other clocks as needed.
     * <p>
     * If gst_ptp_init() was not called before, this will call gst_ptp_init() with
     * default parameters.
     * <p>
     * This clock only returns valid timestamps after it received the first
     * times from the PTP master clock on the network. Once this happens the
     * GstPtpClock::internal-clock property will become non-NULL. You can
     * check this with gst_clock_wait_for_sync(), the GstClock::synced signal and
     * gst_clock_is_synced().
     * @param name Name of the clock
     * @param domain PTP domain
     */
    public PtpClock(java.lang.String name, int domain) {
        super(constructNew(name, domain));
        this.takeOwnership();
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gst_ptp_clock_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * A {@link PtpClock.Builder} object constructs a {@link PtpClock} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link PtpClock.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a GObject with properties.
     */
    public static class Builder extends org.gstreamer.gst.SystemClock.Builder {
        
        /**
         * Default constructor for a {@code Builder} object.
         */
        protected Builder() {
        }
        
        /**
         * Finish building the {@link PtpClock} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link PtpClock}.
         * @return A new instance of {@code PtpClock} with the properties 
         *         that were set in the Builder object.
         */
        public PtpClock build() {
            return (PtpClock) org.gtk.gobject.GObject.newWithProperties(
                PtpClock.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
        
        public Builder setDomain(int domain) {
            names.add("domain");
            values.add(org.gtk.gobject.Value.create(domain));
            return this;
        }
        
        public Builder setGrandmasterClockId(long grandmasterClockId) {
            names.add("grandmaster-clock-id");
            values.add(org.gtk.gobject.Value.create(grandmasterClockId));
            return this;
        }
        
        public Builder setInternalClock(org.gstreamer.gst.Clock internalClock) {
            names.add("internal-clock");
            values.add(org.gtk.gobject.Value.create(internalClock));
            return this;
        }
        
        public Builder setMasterClockId(long masterClockId) {
            names.add("master-clock-id");
            values.add(org.gtk.gobject.Value.create(masterClockId));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_ptp_clock_new = Interop.downcallHandle(
                "gst_ptp_clock_new",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gst_ptp_clock_get_type = Interop.downcallHandle(
                "gst_ptp_clock_get_type",
                FunctionDescriptor.of(Interop.valueLayout.C_LONG),
                false
        );
    }
    
    /**
     * Check whether the type is available on the runtime platform.
     * @return {@code true} when the type is available on the runtime platform
     */
    public static boolean isAvailable() {
        return DowncallHandles.gst_ptp_clock_get_type != null;
    }
}
