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
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    public VulkanContext(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to VulkanContext */
    public static VulkanContext castFrom(org.gtk.gobject.Object gobject) {
        return new VulkanContext(gobject.refcounted());
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
     */
    public Signal<VulkanContext.ImagesUpdated> onImagesUpdated(VulkanContext.ImagesUpdated handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("images-updated"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(VulkanContext.Callbacks.class, "signalVulkanContextImagesUpdated",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<VulkanContext.ImagesUpdated>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static class Callbacks {
        
        public static void signalVulkanContextImagesUpdated(MemoryAddress source, MemoryAddress data) {
            int HASH = data.get(ValueLayout.JAVA_INT, 0);
            var HANDLER = (VulkanContext.ImagesUpdated) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new VulkanContext(Refcounted.get(source)));
        }
    }
}
