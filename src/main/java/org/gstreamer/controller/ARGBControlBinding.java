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
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
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
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    /**
     * Create a ARGBControlBinding proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public ARGBControlBinding(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Cast object to ARGBControlBinding if its GType is a (or inherits from) "GstARGBControlBinding".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code ARGBControlBinding} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GstARGBControlBinding", a ClassCastException will be thrown.
     */
    public static ARGBControlBinding castFrom(org.gtk.gobject.Object gobject) {
            return new ARGBControlBinding(gobject.handle(), gobject.yieldOwnership());
    }
    
    private static Addressable constructNew(@NotNull org.gstreamer.gst.Object object, @NotNull java.lang.String propertyName, @NotNull org.gstreamer.gst.ControlSource csA, @NotNull org.gstreamer.gst.ControlSource csR, @NotNull org.gstreamer.gst.ControlSource csG, @NotNull org.gstreamer.gst.ControlSource csB) {
        java.util.Objects.requireNonNull(object, "Parameter 'object' must not be null");
        java.util.Objects.requireNonNull(propertyName, "Parameter 'propertyName' must not be null");
        java.util.Objects.requireNonNull(csA, "Parameter 'csA' must not be null");
        java.util.Objects.requireNonNull(csR, "Parameter 'csR' must not be null");
        java.util.Objects.requireNonNull(csG, "Parameter 'csG' must not be null");
        java.util.Objects.requireNonNull(csB, "Parameter 'csB' must not be null");
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_argb_control_binding_new.invokeExact(
                    object.handle(),
                    Interop.allocateNativeString(propertyName),
                    csA.handle(),
                    csR.handle(),
                    csG.handle(),
                    csB.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Create a new control-binding that attaches the given {@link org.gstreamer.gst.ControlSource} to the
     * {@link org.gtk.gobject.Object} property.
     * @param object the object of the property
     * @param propertyName the property-name to attach the control source
     * @param csA the control source for the alpha channel
     * @param csR the control source for the red channel
     * @param csG the control source for the green channel
     * @param csB the control source for the blue channel
     */
    public ARGBControlBinding(@NotNull org.gstreamer.gst.Object object, @NotNull java.lang.String propertyName, @NotNull org.gstreamer.gst.ControlSource csA, @NotNull org.gstreamer.gst.ControlSource csR, @NotNull org.gstreamer.gst.ControlSource csG, @NotNull org.gstreamer.gst.ControlSource csB) {
        super(constructNew(object, propertyName, csA, csR, csG, csB), Ownership.NONE);
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static @NotNull org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gst_argb_control_binding_get_type.invokeExact();
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
         * A {@link ARGBControlBinding.Build} object constructs a {@link ARGBControlBinding} 
         * using the <em>builder pattern</em> to set property values. 
         * Use the various {@code set...()} methods to set properties, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
        }
        
         /**
         * Finish building the {@link ARGBControlBinding} object.
         * Internally, a call to {@link org.gtk.gobject.GObject#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link ARGBControlBinding} using {@link ARGBControlBinding#castFrom}.
         * @return A new instance of {@code ARGBControlBinding} with the properties 
         *         that were set in the Build object.
         */
        public ARGBControlBinding construct() {
            return ARGBControlBinding.castFrom(
                org.gtk.gobject.Object.newWithProperties(
                    ARGBControlBinding.getType(),
                    names.size(),
                    names.toArray(new String[0]),
                    values.toArray(new org.gtk.gobject.Value[0])
                )
            );
        }
        
        public Build setControlSourceA(org.gstreamer.gst.ControlSource controlSourceA) {
            names.add("control-source-a");
            values.add(org.gtk.gobject.Value.create(controlSourceA));
            return this;
        }
        
        public Build setControlSourceB(org.gstreamer.gst.ControlSource controlSourceB) {
            names.add("control-source-b");
            values.add(org.gtk.gobject.Value.create(controlSourceB));
            return this;
        }
        
        public Build setControlSourceG(org.gstreamer.gst.ControlSource controlSourceG) {
            names.add("control-source-g");
            values.add(org.gtk.gobject.Value.create(controlSourceG));
            return this;
        }
        
        public Build setControlSourceR(org.gstreamer.gst.ControlSource controlSourceR) {
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
}
