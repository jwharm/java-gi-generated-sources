package org.gstreamer.controller;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A value mapping object that attaches control sources to gobject properties. It
 * will map the control values directly to the target property range. If a
 * non-absolute direct control binding is used, the value range [0.0 ... 1.0]
 * is mapped to full target property range, and all values outside the range
 * will be clipped. An absolute control binding will not do any value
 * transformations.
 */
public class DirectControlBinding extends org.gstreamer.gst.ControlBinding {
    
    static {
        GstController.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstDirectControlBinding";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gstreamer.gst.ControlBinding.getMemoryLayout().withName("parent"),
            Interop.valueLayout.ADDRESS.withName("cs"),
            org.gtk.gobject.Value.getMemoryLayout().withName("cur_value"),
            Interop.valueLayout.C_DOUBLE.withName("last_value"),
            Interop.valueLayout.C_INT.withName("byte_size"),
            MemoryLayout.paddingLayout(32),
            Interop.valueLayout.ADDRESS.withName("convert_value"),
            Interop.valueLayout.ADDRESS.withName("convert_g_value")
        ).withName(C_TYPE_NAME);
    }
    
    /**
     * Create a DirectControlBinding proxy instance for the provided memory address.
     * <p>
     * Because DirectControlBinding is an {@code InitiallyUnowned} instance, when 
     * {@code ownership == Ownership.NONE}, the ownership is set to {@code FULL} 
     * and a call to {@code g_object_ref_sink()} is executed to sink the floating reference.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected DirectControlBinding(Addressable address, Ownership ownership) {
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
    public static final Marshal<Addressable, DirectControlBinding> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new DirectControlBinding(input, ownership);
    
    private static MemoryAddress constructNew(org.gstreamer.gst.GstObject object, java.lang.String propertyName, org.gstreamer.gst.ControlSource cs) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_direct_control_binding_new.invokeExact(
                    object.handle(),
                    Marshal.stringToAddress.marshal(propertyName, null),
                    cs.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Create a new control-binding that attaches the {@link org.gstreamer.gst.ControlSource} to the
     * {@link org.gtk.gobject.GObject} property. It will map the control source range [0.0 ... 1.0] to
     * the full target property range, and clip all values outside this range.
     * @param object the object of the property
     * @param propertyName the property-name to attach the control source
     * @param cs the control source
     */
    public DirectControlBinding(org.gstreamer.gst.GstObject object, java.lang.String propertyName, org.gstreamer.gst.ControlSource cs) {
        super(constructNew(object, propertyName, cs), Ownership.NONE);
    }
    
    private static MemoryAddress constructNewAbsolute(org.gstreamer.gst.GstObject object, java.lang.String propertyName, org.gstreamer.gst.ControlSource cs) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_direct_control_binding_new_absolute.invokeExact(
                    object.handle(),
                    Marshal.stringToAddress.marshal(propertyName, null),
                    cs.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Create a new control-binding that attaches the {@link org.gstreamer.gst.ControlSource} to the
     * {@link org.gtk.gobject.GObject} property. It will directly map the control source values to the
     * target property range without any transformations.
     * @param object the object of the property
     * @param propertyName the property-name to attach the control source
     * @param cs the control source
     * @return the new {@link DirectControlBinding}
     */
    public static DirectControlBinding newAbsolute(org.gstreamer.gst.GstObject object, java.lang.String propertyName, org.gstreamer.gst.ControlSource cs) {
        var RESULT = constructNewAbsolute(object, propertyName, cs);
        return (org.gstreamer.controller.DirectControlBinding) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gstreamer.controller.DirectControlBinding.fromAddress).marshal(RESULT, Ownership.NONE);
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gst_direct_control_binding_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * A {@link DirectControlBinding.Builder} object constructs a {@link DirectControlBinding} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link DirectControlBinding.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a GObject with properties.
     */
    public static class Builder extends org.gstreamer.gst.ControlBinding.Builder {
        
        protected Builder() {
        }
        
        /**
         * Finish building the {@link DirectControlBinding} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link DirectControlBinding}.
         * @return A new instance of {@code DirectControlBinding} with the properties 
         *         that were set in the Builder object.
         */
        public DirectControlBinding build() {
            return (DirectControlBinding) org.gtk.gobject.GObject.newWithProperties(
                DirectControlBinding.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
        
        public Builder setAbsolute(boolean absolute) {
            names.add("absolute");
            values.add(org.gtk.gobject.Value.create(absolute));
            return this;
        }
        
        public Builder setControlSource(org.gstreamer.gst.ControlSource controlSource) {
            names.add("control-source");
            values.add(org.gtk.gobject.Value.create(controlSource));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_direct_control_binding_new = Interop.downcallHandle(
            "gst_direct_control_binding_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_direct_control_binding_new_absolute = Interop.downcallHandle(
            "gst_direct_control_binding_new_absolute",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_direct_control_binding_get_type = Interop.downcallHandle(
            "gst_direct_control_binding_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
    }
}
