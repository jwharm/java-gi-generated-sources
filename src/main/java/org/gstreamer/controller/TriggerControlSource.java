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
     * Create a TriggerControlSource proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public TriggerControlSource(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Cast object to TriggerControlSource if its GType is a (or inherits from) "GstTriggerControlSource".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code TriggerControlSource} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GstTriggerControlSource", a ClassCastException will be thrown.
     */
    public static TriggerControlSource castFrom(org.gtk.gobject.Object gobject) {
            return new TriggerControlSource(gobject.handle(), gobject.yieldOwnership());
    }
    
    private static Addressable constructNew() {
        Addressable RESULT;
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
        super(constructNew(), Ownership.FULL);
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static @NotNull org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gst_trigger_control_source_get_type.invokeExact();
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
         * A {@link TriggerControlSource.Build} object constructs a {@link TriggerControlSource} 
         * using the <em>builder pattern</em> to set property values. 
         * Use the various {@code set...()} methods to set properties, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
        }
        
         /**
         * Finish building the {@link TriggerControlSource} object.
         * Internally, a call to {@link org.gtk.gobject.GObject#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link TriggerControlSource} using {@link TriggerControlSource#castFrom}.
         * @return A new instance of {@code TriggerControlSource} with the properties 
         *         that were set in the Build object.
         */
        public TriggerControlSource construct() {
            return TriggerControlSource.castFrom(
                org.gtk.gobject.Object.newWithProperties(
                    TriggerControlSource.getType(),
                    names.size(),
                    names.toArray(new String[0]),
                    values.toArray(new org.gtk.gobject.Value[0])
                )
            );
        }
        
        public Build setTolerance(long tolerance) {
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
}
