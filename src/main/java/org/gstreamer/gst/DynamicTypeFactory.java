package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@link DynamicTypeFactory} is used to represent a type that can be
 * automatically loaded the first time it is used. For example,
 * a non-standard type for use in caps fields.
 * <p>
 * In general, applications and plugins don't need to use the factory
 * beyond registering the type in a plugin init function. Once that is
 * done, the type is stored in the registry, and ready as soon as the
 * registry is loaded.
 * <p>
 * <strong>Registering a type for dynamic loading</strong><br/>
 * <pre>{@code <!-- language="C" -->
 * 
 * static gboolean
 * plugin_init (GstPlugin * plugin)
 * {
 *   return gst_dynamic_type_register (plugin, GST_TYPE_CUSTOM_CAPS_FIELD);
 * }
 * }</pre>
 * @version 1.12
 */
public class DynamicTypeFactory extends org.gstreamer.gst.PluginFeature {
    
    static {
        Gst.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstDynamicTypeFactory";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a DynamicTypeFactory proxy instance for the provided memory address.
     * <p>
     * Because DynamicTypeFactory is an {@code InitiallyUnowned} instance, when 
     * {@code ownership == Ownership.NONE}, the ownership is set to {@code FULL} 
     * and a call to {@code refSink()} is executed to sink the floating reference.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public DynamicTypeFactory(Addressable address, Ownership ownership) {
        super(address, Ownership.FULL);
        if (ownership == Ownership.NONE) {
            refSink();
        }
    }
    
    /**
     * Cast object to DynamicTypeFactory if its GType is a (or inherits from) "GstDynamicTypeFactory".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code DynamicTypeFactory} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GstDynamicTypeFactory", a ClassCastException will be thrown.
     */
    public static DynamicTypeFactory castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(new org.gtk.gobject.TypeInstance(gobject.handle(), Ownership.NONE), DynamicTypeFactory.getType())) {
            return new DynamicTypeFactory(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GstDynamicTypeFactory");
        }
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static @NotNull org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gst_dynamic_type_factory_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    public static @NotNull org.gtk.glib.Type load(@NotNull java.lang.String factoryname) {
        java.util.Objects.requireNonNull(factoryname, "Parameter 'factoryname' must not be null");
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gst_dynamic_type_factory_load.invokeExact(
                    Interop.allocateNativeString(factoryname));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * GObjects with properties.
     */
    public static class Build extends org.gstreamer.gst.PluginFeature.Build {
        
         /**
         * A {@link DynamicTypeFactory.Build} object constructs a {@link DynamicTypeFactory} 
         * using the <em>builder pattern</em> to set property values. 
         * Use the various {@code set...()} methods to set properties, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
        }
        
         /**
         * Finish building the {@link DynamicTypeFactory} object.
         * Internally, a call to {@link org.gtk.gobject.GObject#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link DynamicTypeFactory} using {@link DynamicTypeFactory#castFrom}.
         * @return A new instance of {@code DynamicTypeFactory} with the properties 
         *         that were set in the Build object.
         */
        public DynamicTypeFactory construct() {
            return DynamicTypeFactory.castFrom(
                org.gtk.gobject.Object.newWithProperties(
                    DynamicTypeFactory.getType(),
                    names.size(),
                    names.toArray(new String[0]),
                    values.toArray(new org.gtk.gobject.Value[0])
                )
            );
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_dynamic_type_factory_get_type = Interop.downcallHandle(
            "gst_dynamic_type_factory_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
        
        private static final MethodHandle gst_dynamic_type_factory_load = Interop.downcallHandle(
            "gst_dynamic_type_factory_load",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS),
            false
        );
    }
}
