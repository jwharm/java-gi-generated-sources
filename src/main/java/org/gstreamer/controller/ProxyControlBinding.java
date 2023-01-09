package org.gstreamer.controller;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A {@link org.gstreamer.gst.ControlBinding} that forwards requests to another {@link org.gstreamer.gst.ControlBinding}
 */
public class ProxyControlBinding extends org.gstreamer.gst.ControlBinding {
    
    static {
        GstController.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstProxyControlBinding";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gstreamer.gst.ControlBinding.getMemoryLayout().withName("parent"),
            org.gtk.gobject.WeakRef.getMemoryLayout().withName("ref_object"),
            Interop.valueLayout.ADDRESS.withName("property_name"),
            MemoryLayout.sequenceLayout(4, Interop.valueLayout.ADDRESS).withName("_padding")
        ).withName(C_TYPE_NAME);
    }
    
    /**
     * Create a ProxyControlBinding proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected ProxyControlBinding(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, ProxyControlBinding> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new ProxyControlBinding(input);
    
    private static MemoryAddress constructNew(org.gstreamer.gst.GstObject object, java.lang.String propertyName, org.gstreamer.gst.GstObject refObject, java.lang.String refPropertyName) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.gst_proxy_control_binding_new.invokeExact(
                        object.handle(),
                        Marshal.stringToAddress.marshal(propertyName, SCOPE),
                        refObject.handle(),
                        Marshal.stringToAddress.marshal(refPropertyName, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return RESULT;
        }
    }
    
    /**
     * {@link ProxyControlBinding} forwards all access to data or {@code sync_values()}
     * requests from {@code property_name} on {@code object} to the control binding at
     * {@code ref_property_name} on {@code ref_object}.
     * @param object a {@link org.gstreamer.gst.GstObject}
     * @param propertyName the property name in {@code object} to control
     * @param refObject a {@link org.gstreamer.gst.GstObject} to forward all
     *              {@link org.gstreamer.gst.ControlBinding} requests to
     * @param refPropertyName the property_name in {@code ref_object} to control
     */
    public ProxyControlBinding(org.gstreamer.gst.GstObject object, java.lang.String propertyName, org.gstreamer.gst.GstObject refObject, java.lang.String refPropertyName) {
        super(constructNew(object, propertyName, refObject, refPropertyName));
        this.refSink();
        this.takeOwnership();
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gst_proxy_control_binding_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * A {@link ProxyControlBinding.Builder} object constructs a {@link ProxyControlBinding} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link ProxyControlBinding.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a GObject with properties.
     */
    public static class Builder extends org.gstreamer.gst.ControlBinding.Builder {
        
        /**
         * Default constructor for a {@code Builder} object.
         */
        protected Builder() {
        }
        
        /**
         * Finish building the {@link ProxyControlBinding} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link ProxyControlBinding}.
         * @return A new instance of {@code ProxyControlBinding} with the properties 
         *         that were set in the Builder object.
         */
        public ProxyControlBinding build() {
            return (ProxyControlBinding) org.gtk.gobject.GObject.newWithProperties(
                ProxyControlBinding.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_proxy_control_binding_new = Interop.downcallHandle(
                "gst_proxy_control_binding_new",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_proxy_control_binding_get_type = Interop.downcallHandle(
                "gst_proxy_control_binding_get_type",
                FunctionDescriptor.of(Interop.valueLayout.C_LONG),
                false
        );
    }
    
    /**
     * Check whether the type is available on the runtime platform.
     * @return {@code true} when the type is available on the runtime platform
     */
    public static boolean isAvailable() {
        return DowncallHandles.gst_proxy_control_binding_get_type != null;
    }
}
