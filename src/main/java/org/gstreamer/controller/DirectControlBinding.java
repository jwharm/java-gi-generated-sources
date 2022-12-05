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
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gstreamer.gst.ControlBinding.getMemoryLayout().withName("parent"),
        Interop.valueLayout.ADDRESS.withName("cs"),
        org.gtk.gobject.Value.getMemoryLayout().withName("cur_value"),
        Interop.valueLayout.C_DOUBLE.withName("last_value"),
        Interop.valueLayout.C_INT.withName("byte_size"),
        MemoryLayout.paddingLayout(32),
        Interop.valueLayout.ADDRESS.withName("convert_value"),
        Interop.valueLayout.ADDRESS.withName("convert_g_value")
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
     * Create a DirectControlBinding proxy instance for the provided memory address.
     * <p>
     * Because DirectControlBinding is an {@code InitiallyUnowned} instance, when 
     * {@code ownership == Ownership.NONE}, the ownership is set to {@code FULL} 
     * and a call to {@code refSink()} is executed to sink the floating reference.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public DirectControlBinding(Addressable address, Ownership ownership) {
        super(address, Ownership.FULL);
        if (ownership == Ownership.NONE) {
            refSink();
        }
    }
    
    /**
     * Cast object to DirectControlBinding if its GType is a (or inherits from) "GstDirectControlBinding".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code DirectControlBinding} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GstDirectControlBinding", a ClassCastException will be thrown.
     */
    public static DirectControlBinding castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(new org.gtk.gobject.TypeInstance(gobject.handle(), Ownership.NONE), DirectControlBinding.getType())) {
            return new DirectControlBinding(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GstDirectControlBinding");
        }
    }
    
    private static Addressable constructNew(@NotNull org.gstreamer.gst.Object object, @NotNull java.lang.String propertyName, @NotNull org.gstreamer.gst.ControlSource cs) {
        java.util.Objects.requireNonNull(object, "Parameter 'object' must not be null");
        java.util.Objects.requireNonNull(propertyName, "Parameter 'propertyName' must not be null");
        java.util.Objects.requireNonNull(cs, "Parameter 'cs' must not be null");
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_direct_control_binding_new.invokeExact(
                    object.handle(),
                    Interop.allocateNativeString(propertyName),
                    cs.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Create a new control-binding that attaches the {@link org.gstreamer.gst.ControlSource} to the
     * {@link org.gtk.gobject.Object} property. It will map the control source range [0.0 ... 1.0] to
     * the full target property range, and clip all values outside this range.
     * @param object the object of the property
     * @param propertyName the property-name to attach the control source
     * @param cs the control source
     */
    public DirectControlBinding(@NotNull org.gstreamer.gst.Object object, @NotNull java.lang.String propertyName, @NotNull org.gstreamer.gst.ControlSource cs) {
        super(constructNew(object, propertyName, cs), Ownership.NONE);
    }
    
    private static Addressable constructNewAbsolute(@NotNull org.gstreamer.gst.Object object, @NotNull java.lang.String propertyName, @NotNull org.gstreamer.gst.ControlSource cs) {
        java.util.Objects.requireNonNull(object, "Parameter 'object' must not be null");
        java.util.Objects.requireNonNull(propertyName, "Parameter 'propertyName' must not be null");
        java.util.Objects.requireNonNull(cs, "Parameter 'cs' must not be null");
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_direct_control_binding_new_absolute.invokeExact(
                    object.handle(),
                    Interop.allocateNativeString(propertyName),
                    cs.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Create a new control-binding that attaches the {@link org.gstreamer.gst.ControlSource} to the
     * {@link org.gtk.gobject.Object} property. It will directly map the control source values to the
     * target property range without any transformations.
     * @param object the object of the property
     * @param propertyName the property-name to attach the control source
     * @param cs the control source
     * @return the new {@link DirectControlBinding}
     */
    public static DirectControlBinding newAbsolute(@NotNull org.gstreamer.gst.Object object, @NotNull java.lang.String propertyName, @NotNull org.gstreamer.gst.ControlSource cs) {
        return new DirectControlBinding(constructNewAbsolute(object, propertyName, cs), Ownership.NONE);
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static @NotNull org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gst_direct_control_binding_get_type.invokeExact();
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
         * A {@link DirectControlBinding.Build} object constructs a {@link DirectControlBinding} 
         * using the <em>builder pattern</em> to set property values. 
         * Use the various {@code set...()} methods to set properties, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
        }
        
         /**
         * Finish building the {@link DirectControlBinding} object.
         * Internally, a call to {@link org.gtk.gobject.GObject#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link DirectControlBinding} using {@link DirectControlBinding#castFrom}.
         * @return A new instance of {@code DirectControlBinding} with the properties 
         *         that were set in the Build object.
         */
        public DirectControlBinding construct() {
            return DirectControlBinding.castFrom(
                org.gtk.gobject.Object.newWithProperties(
                    DirectControlBinding.getType(),
                    names.size(),
                    names.toArray(new String[0]),
                    values.toArray(new org.gtk.gobject.Value[0])
                )
            );
        }
        
        public Build setAbsolute(boolean absolute) {
            names.add("absolute");
            values.add(org.gtk.gobject.Value.create(absolute));
            return this;
        }
        
        public Build setControlSource(org.gstreamer.gst.ControlSource controlSource) {
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
