package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Use gst_tracer_factory_get_list() to get a list of tracer factories known to
 * GStreamer.
 * @version 1.8
 */
public class TracerFactory extends org.gstreamer.gst.PluginFeature {
    
    static {
        Gst.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstTracerFactory";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a TracerFactory proxy instance for the provided memory address.
     * <p>
     * Because TracerFactory is an {@code InitiallyUnowned} instance, when 
     * {@code ownership == Ownership.NONE}, the ownership is set to {@code FULL} 
     * and a call to {@code refSink()} is executed to sink the floating reference.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public TracerFactory(Addressable address, Ownership ownership) {
        super(address, Ownership.FULL);
        if (ownership == Ownership.NONE) {
            refSink();
        }
    }
    
    /**
     * Cast object to TracerFactory if its GType is a (or inherits from) "GstTracerFactory".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code TracerFactory} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GstTracerFactory", a ClassCastException will be thrown.
     */
    public static TracerFactory castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(new org.gtk.gobject.TypeInstance(gobject.handle(), Ownership.NONE), TracerFactory.getType())) {
            return new TracerFactory(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GstTracerFactory");
        }
    }
    
    /**
     * Get the {@link org.gtk.gobject.Type} for elements managed by this factory. The type can
     * only be retrieved if the element factory is loaded, which can be
     * assured with gst_plugin_feature_load().
     * @return the {@link org.gtk.gobject.Type} for tracers managed by this factory or 0 if
     * the factory is not loaded.
     */
    public @NotNull org.gtk.glib.Type getTracerType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gst_tracer_factory_get_tracer_type.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static @NotNull org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gst_tracer_factory_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * Gets the list of all registered tracer factories. You must free the
     * list using gst_plugin_feature_list_free().
     * <p>
     * The returned factories are sorted by factory name.
     * <p>
     * Free-function: gst_plugin_feature_list_free
     * @return the list of all
     *     registered {@link TracerFactory}.
     */
    public static @NotNull org.gtk.glib.List getList() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_tracer_factory_get_list.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.List(RESULT, Ownership.FULL);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * GObjects with properties.
     */
    public static class Build extends org.gstreamer.gst.PluginFeature.Build {
        
         /**
         * A {@link TracerFactory.Build} object constructs a {@link TracerFactory} 
         * using the <em>builder pattern</em> to set property values. 
         * Use the various {@code set...()} methods to set properties, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
        }
        
         /**
         * Finish building the {@link TracerFactory} object.
         * Internally, a call to {@link org.gtk.gobject.GObject#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link TracerFactory} using {@link TracerFactory#castFrom}.
         * @return A new instance of {@code TracerFactory} with the properties 
         *         that were set in the Build object.
         */
        public TracerFactory construct() {
            return TracerFactory.castFrom(
                org.gtk.gobject.Object.newWithProperties(
                    TracerFactory.getType(),
                    names.size(),
                    names.toArray(new String[0]),
                    values.toArray(new org.gtk.gobject.Value[0])
                )
            );
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_tracer_factory_get_tracer_type = Interop.downcallHandle(
            "gst_tracer_factory_get_tracer_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_tracer_factory_get_type = Interop.downcallHandle(
            "gst_tracer_factory_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
        
        private static final MethodHandle gst_tracer_factory_get_list = Interop.downcallHandle(
            "gst_tracer_factory_get_list",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
            false
        );
    }
}
