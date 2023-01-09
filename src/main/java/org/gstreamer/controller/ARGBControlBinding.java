package org.gstreamer.controller;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A value mapping object that attaches multiple control sources to a guint
 * gobject properties representing a color. A control value of 0.0 will turn the
 * color component off and a value of 1.0 will be the color level.
 */
public class ARGBControlBinding extends org.gstreamer.gst.ControlBinding {
    
    static {
        GstController.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstARGBControlBinding";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gstreamer.gst.ControlBinding.getMemoryLayout().withName("parent"),
            Interop.valueLayout.ADDRESS.withName("cs_a"),
            Interop.valueLayout.ADDRESS.withName("cs_r"),
            Interop.valueLayout.ADDRESS.withName("cs_g"),
            Interop.valueLayout.ADDRESS.withName("cs_b"),
            org.gtk.gobject.Value.getMemoryLayout().withName("cur_value"),
            Interop.valueLayout.C_INT.withName("last_value"),
            MemoryLayout.paddingLayout(96),
            MemoryLayout.sequenceLayout(4, Interop.valueLayout.ADDRESS).withName("_gst_reserved")
        ).withName(C_TYPE_NAME);
    }
    
    /**
     * Create a ARGBControlBinding proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected ARGBControlBinding(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, ARGBControlBinding> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new ARGBControlBinding(input);
    
    private static MemoryAddress constructNew(org.gstreamer.gst.GstObject object, java.lang.String propertyName, org.gstreamer.gst.ControlSource csA, org.gstreamer.gst.ControlSource csR, org.gstreamer.gst.ControlSource csG, org.gstreamer.gst.ControlSource csB) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.gst_argb_control_binding_new.invokeExact(
                        object.handle(),
                        Marshal.stringToAddress.marshal(propertyName, SCOPE),
                        csA.handle(),
                        csR.handle(),
                        csG.handle(),
                        csB.handle());
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return RESULT;
        }
    }
    
    /**
     * Create a new control-binding that attaches the given {@link org.gstreamer.gst.ControlSource} to the
     * {@link org.gtk.gobject.GObject} property.
     * @param object the object of the property
     * @param propertyName the property-name to attach the control source
     * @param csA the control source for the alpha channel
     * @param csR the control source for the red channel
     * @param csG the control source for the green channel
     * @param csB the control source for the blue channel
     */
    public ARGBControlBinding(org.gstreamer.gst.GstObject object, java.lang.String propertyName, org.gstreamer.gst.ControlSource csA, org.gstreamer.gst.ControlSource csR, org.gstreamer.gst.ControlSource csG, org.gstreamer.gst.ControlSource csB) {
        super(constructNew(object, propertyName, csA, csR, csG, csB));
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
            RESULT = (long) DowncallHandles.gst_argb_control_binding_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * A {@link ARGBControlBinding.Builder} object constructs a {@link ARGBControlBinding} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link ARGBControlBinding.Builder#build()}. 
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
         * Finish building the {@link ARGBControlBinding} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link ARGBControlBinding}.
         * @return A new instance of {@code ARGBControlBinding} with the properties 
         *         that were set in the Builder object.
         */
        public ARGBControlBinding build() {
            return (ARGBControlBinding) org.gtk.gobject.GObject.newWithProperties(
                ARGBControlBinding.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
        
        public Builder setControlSourceA(org.gstreamer.gst.ControlSource controlSourceA) {
            names.add("control-source-a");
            values.add(org.gtk.gobject.Value.create(controlSourceA));
            return this;
        }
        
        public Builder setControlSourceB(org.gstreamer.gst.ControlSource controlSourceB) {
            names.add("control-source-b");
            values.add(org.gtk.gobject.Value.create(controlSourceB));
            return this;
        }
        
        public Builder setControlSourceG(org.gstreamer.gst.ControlSource controlSourceG) {
            names.add("control-source-g");
            values.add(org.gtk.gobject.Value.create(controlSourceG));
            return this;
        }
        
        public Builder setControlSourceR(org.gstreamer.gst.ControlSource controlSourceR) {
            names.add("control-source-r");
            values.add(org.gtk.gobject.Value.create(controlSourceR));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_argb_control_binding_new = Interop.downcallHandle(
                "gst_argb_control_binding_new",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_argb_control_binding_get_type = Interop.downcallHandle(
                "gst_argb_control_binding_get_type",
                FunctionDescriptor.of(Interop.valueLayout.C_LONG),
                false
        );
    }
    
    /**
     * Check whether the type is available on the runtime platform.
     * @return {@code true} when the type is available on the runtime platform
     */
    public static boolean isAvailable() {
        return DowncallHandles.gst_argb_control_binding_get_type != null;
    }
}
