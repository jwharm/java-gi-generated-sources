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
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gstreamer.gst.ControlBinding.getMemoryLayout().withName("parent"),
        org.gtk.gobject.WeakRef.getMemoryLayout().withName("ref_object"),
        Interop.valueLayout.ADDRESS.withName("property_name"),
        MemoryLayout.sequenceLayout(4, Interop.valueLayout.ADDRESS).withName("_padding")
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
     * Create a ProxyControlBinding proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public ProxyControlBinding(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Cast object to ProxyControlBinding if its GType is a (or inherits from) "GstProxyControlBinding".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code ProxyControlBinding} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GstProxyControlBinding", a ClassCastException will be thrown.
     */
    public static ProxyControlBinding castFrom(org.gtk.gobject.Object gobject) {
            return new ProxyControlBinding(gobject.handle(), gobject.yieldOwnership());
    }
    
    private static Addressable constructNew(@NotNull org.gstreamer.gst.Object object, @NotNull java.lang.String propertyName, @NotNull org.gstreamer.gst.Object refObject, @NotNull java.lang.String refPropertyName) {
        java.util.Objects.requireNonNull(object, "Parameter 'object' must not be null");
        java.util.Objects.requireNonNull(propertyName, "Parameter 'propertyName' must not be null");
        java.util.Objects.requireNonNull(refObject, "Parameter 'refObject' must not be null");
        java.util.Objects.requireNonNull(refPropertyName, "Parameter 'refPropertyName' must not be null");
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_proxy_control_binding_new.invokeExact(
                    object.handle(),
                    Interop.allocateNativeString(propertyName),
                    refObject.handle(),
                    Interop.allocateNativeString(refPropertyName));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * {@link ProxyControlBinding} forwards all access to data or {@code sync_values()}
     * requests from {@code property_name} on {@code object} to the control binding at
     * {@code ref_property_name} on {@code ref_object}.
     * @param object a {@link org.gstreamer.gst.Object}
     * @param propertyName the property name in {@code object} to control
     * @param refObject a {@link org.gstreamer.gst.Object} to forward all
     *              {@link org.gstreamer.gst.ControlBinding} requests to
     * @param refPropertyName the property_name in {@code ref_object} to control
     */
    public ProxyControlBinding(@NotNull org.gstreamer.gst.Object object, @NotNull java.lang.String propertyName, @NotNull org.gstreamer.gst.Object refObject, @NotNull java.lang.String refPropertyName) {
        super(constructNew(object, propertyName, refObject, refPropertyName), Ownership.NONE);
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static @NotNull org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gst_proxy_control_binding_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * GObjects with properties.
     */
    public static class Build extends org.gstreamer.gst.ControlBinding.Build {
        
         /**
         * A {@link ProxyControlBinding.Build} object constructs a {@link ProxyControlBinding} 
         * using the <em>builder pattern</em> to set property values. 
         * Use the various {@code set...()} methods to set properties, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
        }
        
         /**
         * Finish building the {@link ProxyControlBinding} object.
         * Internally, a call to {@link org.gtk.gobject.GObject#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link ProxyControlBinding} using {@link ProxyControlBinding#castFrom}.
         * @return A new instance of {@code ProxyControlBinding} with the properties 
         *         that were set in the Build object.
         */
        public ProxyControlBinding construct() {
            return ProxyControlBinding.castFrom(
                org.gtk.gobject.Object.newWithProperties(
                    ProxyControlBinding.getType(),
                    names.size(),
                    names.toArray(new String[0]),
                    values.toArray(new org.gtk.gobject.Value[0])
                )
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
}
