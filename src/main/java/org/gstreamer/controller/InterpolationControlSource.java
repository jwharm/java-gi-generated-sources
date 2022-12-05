package org.gstreamer.controller;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@link InterpolationControlSource} is a {@link org.gstreamer.gst.ControlSource}, that interpolates values between user-given
 * control points. It supports several interpolation modes and property types.
 * <p>
 * To use {@link InterpolationControlSource} get a new instance by calling
 * gst_interpolation_control_source_new(), bind it to a {@link org.gtk.gobject.ParamSpec} and set some
 * control points by calling gst_timed_value_control_source_set().
 * <p>
 * All functions are MT-safe.
 */
public class InterpolationControlSource extends org.gstreamer.controller.TimedValueControlSource {
    
    static {
        GstController.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstInterpolationControlSource";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gstreamer.controller.TimedValueControlSource.getMemoryLayout().withName("parent"),
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
     * Create a InterpolationControlSource proxy instance for the provided memory address.
     * <p>
     * Because InterpolationControlSource is an {@code InitiallyUnowned} instance, when 
     * {@code ownership == Ownership.NONE}, the ownership is set to {@code FULL} 
     * and a call to {@code refSink()} is executed to sink the floating reference.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public InterpolationControlSource(Addressable address, Ownership ownership) {
        super(address, Ownership.FULL);
        if (ownership == Ownership.NONE) {
            refSink();
        }
    }
    
    /**
     * Cast object to InterpolationControlSource if its GType is a (or inherits from) "GstInterpolationControlSource".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code InterpolationControlSource} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GstInterpolationControlSource", a ClassCastException will be thrown.
     */
    public static InterpolationControlSource castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(new org.gtk.gobject.TypeInstance(gobject.handle(), Ownership.NONE), InterpolationControlSource.getType())) {
            return new InterpolationControlSource(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GstInterpolationControlSource");
        }
    }
    
    private static Addressable constructNew() {
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_interpolation_control_source_new.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * This returns a new, unbound {@link InterpolationControlSource}.
     */
    public InterpolationControlSource() {
        super(constructNew(), Ownership.FULL);
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static @NotNull org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gst_interpolation_control_source_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * GObjects with properties.
     */
    public static class Build extends org.gstreamer.controller.TimedValueControlSource.Build {
        
         /**
         * A {@link InterpolationControlSource.Build} object constructs a {@link InterpolationControlSource} 
         * using the <em>builder pattern</em> to set property values. 
         * Use the various {@code set...()} methods to set properties, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
        }
        
         /**
         * Finish building the {@link InterpolationControlSource} object.
         * Internally, a call to {@link org.gtk.gobject.GObject#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link InterpolationControlSource} using {@link InterpolationControlSource#castFrom}.
         * @return A new instance of {@code InterpolationControlSource} with the properties 
         *         that were set in the Build object.
         */
        public InterpolationControlSource construct() {
            return InterpolationControlSource.castFrom(
                org.gtk.gobject.Object.newWithProperties(
                    InterpolationControlSource.getType(),
                    names.size(),
                    names.toArray(new String[0]),
                    values.toArray(new org.gtk.gobject.Value[0])
                )
            );
        }
        
        public Build setMode(org.gstreamer.controller.InterpolationMode mode) {
            names.add("mode");
            values.add(org.gtk.gobject.Value.create(mode));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_interpolation_control_source_new = Interop.downcallHandle(
            "gst_interpolation_control_source_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_interpolation_control_source_get_type = Interop.downcallHandle(
            "gst_interpolation_control_source_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
    }
}
