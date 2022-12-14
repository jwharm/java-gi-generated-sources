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
     * @param address   The memory address of the native object
     */
    protected DynamicTypeFactory(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, DynamicTypeFactory> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new DynamicTypeFactory(input);
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gst_dynamic_type_factory_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    public static org.gtk.glib.Type load(java.lang.String factoryname) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            long RESULT;
            try {
                RESULT = (long) DowncallHandles.gst_dynamic_type_factory_load.invokeExact(Marshal.stringToAddress.marshal(factoryname, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return new org.gtk.glib.Type(RESULT);
        }
    }
    
    /**
     * A {@link DynamicTypeFactory.Builder} object constructs a {@link DynamicTypeFactory} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link DynamicTypeFactory.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a GObject with properties.
     */
    public static class Builder extends org.gstreamer.gst.PluginFeature.Builder {
        
        /**
         * Default constructor for a {@code Builder} object.
         */
        protected Builder() {
        }
        
        /**
         * Finish building the {@link DynamicTypeFactory} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link DynamicTypeFactory}.
         * @return A new instance of {@code DynamicTypeFactory} with the properties 
         *         that were set in the Builder object.
         */
        public DynamicTypeFactory build() {
            return (DynamicTypeFactory) org.gtk.gobject.GObject.newWithProperties(
                DynamicTypeFactory.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
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
    
    /**
     * Check whether the type is available on the runtime platform.
     * @return {@code true} when the type is available on the runtime platform
     */
    public static boolean isAvailable() {
        return DowncallHandles.gst_dynamic_type_factory_get_type != null;
    }
}
