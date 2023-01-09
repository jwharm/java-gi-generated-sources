package org.gstreamer.controller;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@link TriggerControlSource} is a {@link org.gstreamer.gst.ControlSource}, that returns values from user-given
 * control points. It allows for a tolerance on the time-stamps.
 * <p>
 * To use {@link TriggerControlSource} get a new instance by calling
 * gst_trigger_control_source_new(), bind it to a {@link org.gtk.gobject.ParamSpec} and set some
 * control points by calling gst_timed_value_control_source_set().
 * <p>
 * All functions are MT-safe.
 */
public class TriggerControlSource extends org.gstreamer.controller.TimedValueControlSource {
    
    static {
        GstController.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstTriggerControlSource";
    
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
     * Create a TriggerControlSource proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected TriggerControlSource(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, TriggerControlSource> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new TriggerControlSource(input);
    
    private static MemoryAddress constructNew() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_trigger_control_source_new.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * This returns a new, unbound {@link TriggerControlSource}.
     */
    public TriggerControlSource() {
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
            RESULT = (long) DowncallHandles.gst_trigger_control_source_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * A {@link TriggerControlSource.Builder} object constructs a {@link TriggerControlSource} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link TriggerControlSource.Builder#build()}. 
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
         * Finish building the {@link TriggerControlSource} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link TriggerControlSource}.
         * @return A new instance of {@code TriggerControlSource} with the properties 
         *         that were set in the Builder object.
         */
        public TriggerControlSource build() {
            return (TriggerControlSource) org.gtk.gobject.GObject.newWithProperties(
                TriggerControlSource.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
        
        public Builder setTolerance(long tolerance) {
            names.add("tolerance");
            values.add(org.gtk.gobject.Value.create(tolerance));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_trigger_control_source_new = Interop.downcallHandle(
                "gst_trigger_control_source_new",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_trigger_control_source_get_type = Interop.downcallHandle(
                "gst_trigger_control_source_get_type",
                FunctionDescriptor.of(Interop.valueLayout.C_LONG),
                false
        );
    }
    
    /**
     * Check whether the type is available on the runtime platform.
     * @return {@code true} when the type is available on the runtime platform
     */
    public static boolean isAvailable() {
        return DowncallHandles.gst_trigger_control_source_get_type != null;
    }
}
