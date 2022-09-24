package org.gtk.gdk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

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
public class VulkanContext extends DrawContext implements org.gtk.gio.Initable {

    public VulkanContext(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to VulkanContext */
    public static VulkanContext castFrom(org.gtk.gobject.Object gobject) {
        return new VulkanContext(gobject.getReference());
    }
    
    @FunctionalInterface
    public interface ImagesUpdatedHandler {
        void signalReceived(VulkanContext source);
    }
    
    /**
     * Emitted when the images managed by this context have changed.
     * <p>
     * Usually this means that the swapchain had to be recreated,
     * for example in response to a change of the surface size.
     */
    public SignalHandle onImagesUpdated(ImagesUpdatedHandler handler) {
        try {
            var RESULT = gtk_h.g_signal_connect_data(
                handle(),
                Interop.allocateNativeString("images-updated").handle(),
                Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(VulkanContext.class, "__signalVulkanContextImagesUpdated",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.getAllocator().allocate(C_INT, Interop.registerCallback(handler.hashCode(), handler)),
                MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (IllegalAccessException | NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
    
    public static void __signalVulkanContextImagesUpdated(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (VulkanContext.ImagesUpdatedHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new VulkanContext(References.get(source)));
    }
    
}
