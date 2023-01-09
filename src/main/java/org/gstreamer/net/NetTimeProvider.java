package org.gstreamer.net;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * This object exposes the time of a {@link org.gstreamer.gst.Clock} on the network.
 * <p>
 * A {@link NetTimeProvider} is created with gst_net_time_provider_new() which
 * takes a {@link org.gstreamer.gst.Clock}, an address and a port number as arguments.
 * <p>
 * After creating the object, a client clock such as {@link NetClientClock} can
 * query the exposed clock over the network for its values.
 * <p>
 * The {@link NetTimeProvider} typically wraps the clock used by a {@link org.gstreamer.gst.Pipeline}.
 */
public class NetTimeProvider extends org.gstreamer.gst.GstObject implements org.gtk.gio.Initable {
    
    static {
        GstNet.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstNetTimeProvider";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gstreamer.gst.GstObject.getMemoryLayout().withName("parent"),
            Interop.valueLayout.ADDRESS.withName("priv"),
            MemoryLayout.sequenceLayout(4, Interop.valueLayout.ADDRESS).withName("_gst_reserved")
        ).withName(C_TYPE_NAME);
    }
    
    /**
     * Create a NetTimeProvider proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected NetTimeProvider(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, NetTimeProvider> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new NetTimeProvider(input);
    
    private static MemoryAddress constructNew(org.gstreamer.gst.Clock clock, @Nullable java.lang.String address, int port) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.gst_net_time_provider_new.invokeExact(
                        clock.handle(),
                        (Addressable) (address == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(address, SCOPE)),
                        port);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return RESULT;
        }
    }
    
    /**
     * Allows network clients to get the current time of {@code clock}.
     * @param clock a {@link org.gstreamer.gst.Clock} to export over the network
     * @param address an address to bind on as a dotted quad
     *           (xxx.xxx.xxx.xxx), IPv6 address, or NULL to bind to all addresses
     * @param port a port to bind on, or 0 to let the kernel choose
     */
    public NetTimeProvider(org.gstreamer.gst.Clock clock, @Nullable java.lang.String address, int port) {
        super(constructNew(clock, address, port));
        this.takeOwnership();
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gst_net_time_provider_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * A {@link NetTimeProvider.Builder} object constructs a {@link NetTimeProvider} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link NetTimeProvider.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a GObject with properties.
     */
    public static class Builder extends org.gstreamer.gst.GstObject.Builder {
        
        /**
         * Default constructor for a {@code Builder} object.
         */
        protected Builder() {
        }
        
        /**
         * Finish building the {@link NetTimeProvider} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link NetTimeProvider}.
         * @return A new instance of {@code NetTimeProvider} with the properties 
         *         that were set in the Builder object.
         */
        public NetTimeProvider build() {
            return (NetTimeProvider) org.gtk.gobject.GObject.newWithProperties(
                NetTimeProvider.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
        
        public Builder setActive(boolean active) {
            names.add("active");
            values.add(org.gtk.gobject.Value.create(active));
            return this;
        }
        
        public Builder setAddress(java.lang.String address) {
            names.add("address");
            values.add(org.gtk.gobject.Value.create(address));
            return this;
        }
        
        public Builder setClock(org.gstreamer.gst.Clock clock) {
            names.add("clock");
            values.add(org.gtk.gobject.Value.create(clock));
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
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_net_time_provider_new = Interop.downcallHandle(
                "gst_net_time_provider_new",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gst_net_time_provider_get_type = Interop.downcallHandle(
                "gst_net_time_provider_get_type",
                FunctionDescriptor.of(Interop.valueLayout.C_LONG),
                false
        );
    }
    
    /**
     * Check whether the type is available on the runtime platform.
     * @return {@code true} when the type is available on the runtime platform
     */
    public static boolean isAvailable() {
        return DowncallHandles.gst_net_time_provider_get_type != null;
    }
}
