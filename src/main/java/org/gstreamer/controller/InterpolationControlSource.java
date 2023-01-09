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
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gstreamer.controller.TimedValueControlSource.getMemoryLayout().withName("parent"),
            Interop.valueLayout.ADDRESS.withName("priv"),
            MemoryLayout.sequenceLayout(4, Interop.valueLayout.ADDRESS).withName("_gst_reserved")
        ).withName(C_TYPE_NAME);
    }
    
    /**
     * Create a InterpolationControlSource proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected InterpolationControlSource(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, InterpolationControlSource> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new InterpolationControlSource(input);
    
    private static MemoryAddress constructNew() {
        MemoryAddress RESULT;
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
        super(constructNew());
        this.takeOwnership();
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gst_interpolation_control_source_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * A {@link InterpolationControlSource.Builder} object constructs a {@link InterpolationControlSource} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link InterpolationControlSource.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a GObject with properties.
     */
    public static class Builder extends org.gstreamer.controller.TimedValueControlSource.Builder {
        
        /**
         * Default constructor for a {@code Builder} object.
         */
        protected Builder() {
        }
        
        /**
         * Finish building the {@link InterpolationControlSource} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link InterpolationControlSource}.
         * @return A new instance of {@code InterpolationControlSource} with the properties 
         *         that were set in the Builder object.
         */
        public InterpolationControlSource build() {
            return (InterpolationControlSource) org.gtk.gobject.GObject.newWithProperties(
                InterpolationControlSource.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
        
        public Builder setMode(org.gstreamer.controller.InterpolationMode mode) {
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
    
    /**
     * Check whether the type is available on the runtime platform.
     * @return {@code true} when the type is available on the runtime platform
     */
    public static boolean isAvailable() {
        return DowncallHandles.gst_interpolation_control_source_get_type != null;
    }
}
