package org.gtk.gdk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The list of functions that can be implemented for the {@code GdkPaintable}
 * interface.
 * <p>
 * Note that apart from the {@link Paintable#snapshot} function,
 * no virtual function of this interface is mandatory to implement, though it
 * is a good idea to implement {@link Paintable#getCurrentImage}
 * for non-static paintables and {@link Paintable#getFlags} if the
 * image is not dynamic as the default implementation returns no flags and
 * that will make the implementation likely quite slow.
 */
public class PaintableInterface extends io.github.jwharm.javagi.ProxyBase {
    
    static {
        Gdk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GdkPaintableInterface";
    
    private static GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.gobject.TypeInterface.getMemoryLayout().withName("g_iface"),
        Interop.valueLayout.ADDRESS.withName("snapshot"),
        Interop.valueLayout.ADDRESS.withName("get_current_image"),
        Interop.valueLayout.ADDRESS.withName("get_flags"),
        Interop.valueLayout.ADDRESS.withName("get_intrinsic_width"),
        Interop.valueLayout.ADDRESS.withName("get_intrinsic_height"),
        Interop.valueLayout.ADDRESS.withName("get_intrinsic_aspect_ratio")
    ).withName(C_TYPE_NAME);
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    private MemorySegment allocatedMemorySegment;
    
    public static PaintableInterface allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        PaintableInterface newInstance = new PaintableInterface(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a PaintableInterface proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public PaintableInterface(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
}
