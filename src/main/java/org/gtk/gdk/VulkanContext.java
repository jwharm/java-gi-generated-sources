package org.gtk.gdk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@code GdkVulkanContext} is an object representing the platform-specific
 * Vulkan draw context.
 * <p>
 * {@code GdkVulkanContext}s are created for a surface using
 * {@link Surface#createVulkanContext}, and the context will match
 * the characteristics of the surface.
 * <p>
 * Support for {@code GdkVulkanContext} is platform-specific and context creation
 * can fail, returning {@code null} context.
 */
public class VulkanContext extends org.gtk.gdk.DrawContext implements org.gtk.gio.Initable {
    
    static {
        Gdk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GdkVulkanContext";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a VulkanContext proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public VulkanContext(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Cast object to VulkanContext if its GType is a (or inherits from) "GdkVulkanContext".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code VulkanContext} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GdkVulkanContext", a ClassCastException will be thrown.
     */
    public static VulkanContext castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), VulkanContext.getType())) {
            return new VulkanContext(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GdkVulkanContext");
        }
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static @NotNull org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gdk_vulkan_context_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    @FunctionalInterface
    public interface ImagesUpdated {
        void signalReceived(VulkanContext source);
    }
    
    /**
     * Emitted when the images managed by this context have changed.
     * <p>
     * Usually this means that the swapchain had to be recreated,
     * for example in response to a change of the surface size.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<VulkanContext.ImagesUpdated> onImagesUpdated(VulkanContext.ImagesUpdated handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("images-updated"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(VulkanContext.Callbacks.class, "signalVulkanContextImagesUpdated",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<VulkanContext.ImagesUpdated>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * GObjects with properties.
     */
    public static class Build extends org.gtk.gdk.DrawContext.Build {
        
         /**
         * A {@link VulkanContext.Build} object constructs a {@link VulkanContext} 
         * using the <em>builder pattern</em> to set property values. 
         * Use the various {@code set...()} methods to set properties, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
        }
        
         /**
         * Finish building the {@link VulkanContext} object.
         * Internally, a call to {@link org.gtk.gobject.GObject#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link VulkanContext} using {@link VulkanContext#castFrom}.
         * @return A new instance of {@code VulkanContext} with the properties 
         *         that were set in the Build object.
         */
        public VulkanContext construct() {
            return VulkanContext.castFrom(
                org.gtk.gobject.Object.newWithProperties(
                    VulkanContext.getType(),
                    names.size(),
                    names.toArray(new String[0]),
                    values.toArray(new org.gtk.gobject.Value[0])
                )
            );
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gdk_vulkan_context_get_type = Interop.downcallHandle(
            "gdk_vulkan_context_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
    }
    
    private static class Callbacks {
        
        public static void signalVulkanContextImagesUpdated(MemoryAddress source, MemoryAddress data) {
            int HASH = data.get(Interop.valueLayout.C_INT, 0);
            var HANDLER = (VulkanContext.ImagesUpdated) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new VulkanContext(source, Ownership.NONE));
        }
    }
}
