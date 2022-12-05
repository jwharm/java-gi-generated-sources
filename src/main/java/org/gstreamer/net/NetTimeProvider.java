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
public class NetTimeProvider extends org.gstreamer.gst.Object implements org.gtk.gio.Initable {
    
    static {
        GstNet.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstNetTimeProvider";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gstreamer.gst.Object.getMemoryLayout().withName("parent"),
        Interop.valueLayout.ADDRESS.withName("priv"),
        MemoryLayout.sequenceLayout(4, Interop.valueLayout.ADDRESS).withName("_gst_reserved")
    ).withName(C_TYPE_NAME);
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    /**
     * Create a NetTimeProvider proxy instance for the provided memory address.
     * <p>
     * Because NetTimeProvider is an {@code InitiallyUnowned} instance, when 
     * {@code ownership == Ownership.NONE}, the ownership is set to {@code FULL} 
     * and a call to {@code refSink()} is executed to sink the floating reference.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public NetTimeProvider(Addressable address, Ownership ownership) {
        super(address, Ownership.FULL);
        if (ownership == Ownership.NONE) {
            refSink();
        }
    }
    
    /**
     * Cast object to NetTimeProvider if its GType is a (or inherits from) "GstNetTimeProvider".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code NetTimeProvider} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GstNetTimeProvider", a ClassCastException will be thrown.
     */
    public static NetTimeProvider castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(new org.gtk.gobject.TypeInstance(gobject.handle(), Ownership.NONE), NetTimeProvider.getType())) {
            return new NetTimeProvider(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GstNetTimeProvider");
        }
    }
    
    private static Addressable constructNew(@NotNull org.gstreamer.gst.Clock clock, @Nullable java.lang.String address, int port) {
        java.util.Objects.requireNonNull(clock, "Parameter 'clock' must not be null");
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_net_time_provider_new.invokeExact(
                    clock.handle(),
                    (Addressable) (address == null ? MemoryAddress.NULL : Interop.allocateNativeString(address)),
                    port);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Allows network clients to get the current time of {@code clock}.
     * @param clock a {@link org.gstreamer.gst.Clock} to export over the network
     * @param address an address to bind on as a dotted quad
     *           (xxx.xxx.xxx.xxx), IPv6 address, or NULL to bind to all addresses
     * @param port a port to bind on, or 0 to let the kernel choose
     */
    public NetTimeProvider(@NotNull org.gstreamer.gst.Clock clock, @Nullable java.lang.String address, int port) {
        super(constructNew(clock, address, port), Ownership.FULL);
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static @NotNull org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gst_net_time_provider_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * GObjects with properties.
     */
    public static class Build extends org.gstreamer.gst.Object.Build {
        
         /**
         * A {@link NetTimeProvider.Build} object constructs a {@link NetTimeProvider} 
         * using the <em>builder pattern</em> to set property values. 
         * Use the various {@code set...()} methods to set properties, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
        }
        
         /**
         * Finish building the {@link NetTimeProvider} object.
         * Internally, a call to {@link org.gtk.gobject.GObject#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link NetTimeProvider} using {@link NetTimeProvider#castFrom}.
         * @return A new instance of {@code NetTimeProvider} with the properties 
         *         that were set in the Build object.
         */
        public NetTimeProvider construct() {
            return NetTimeProvider.castFrom(
                org.gtk.gobject.Object.newWithProperties(
                    NetTimeProvider.getType(),
                    names.size(),
                    names.toArray(new String[0]),
                    values.toArray(new org.gtk.gobject.Value[0])
                )
            );
        }
        
        public Build setActive(boolean active) {
            names.add("active");
            values.add(org.gtk.gobject.Value.create(active));
            return this;
        }
        
        public Build setAddress(java.lang.String address) {
            names.add("address");
            values.add(org.gtk.gobject.Value.create(address));
            return this;
        }
        
        public Build setClock(org.gstreamer.gst.Clock clock) {
            names.add("clock");
            values.add(org.gtk.gobject.Value.create(clock));
            return this;
        }
        
        public Build setPort(int port) {
            names.add("port");
            values.add(org.gtk.gobject.Value.create(port));
            return this;
        }
        
        public Build setQosDscp(int qosDscp) {
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
}
