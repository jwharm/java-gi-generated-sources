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
public class PaintableInterface extends Struct {
    
    static {
        Gdk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GdkPaintableInterface";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
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
    
    /**
     * Allocate a new {@link PaintableInterface}
     * @return A new, uninitialized @{link PaintableInterface}
     */
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

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private PaintableInterface struct;
        
         /**
         * A {@link PaintableInterface.Build} object constructs a {@link PaintableInterface} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = PaintableInterface.allocate();
        }
        
         /**
         * Finish building the {@link PaintableInterface} struct.
         * @return A new instance of {@code PaintableInterface} with the fields 
         *         that were set in the Build object.
         */
        public PaintableInterface construct() {
            return struct;
        }
        
        public Build setGIface(org.gtk.gobject.TypeInterface gIface) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("g_iface"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (gIface == null ? MemoryAddress.NULL : gIface.handle()));
            return this;
        }
        
        public Build setSnapshot(java.lang.foreign.MemoryAddress snapshot) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("snapshot"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (snapshot == null ? MemoryAddress.NULL : snapshot));
            return this;
        }
        
        public Build setGetCurrentImage(java.lang.foreign.MemoryAddress getCurrentImage) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_current_image"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getCurrentImage == null ? MemoryAddress.NULL : getCurrentImage));
            return this;
        }
        
        public Build setGetFlags(java.lang.foreign.MemoryAddress getFlags) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_flags"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getFlags == null ? MemoryAddress.NULL : getFlags));
            return this;
        }
        
        public Build setGetIntrinsicWidth(java.lang.foreign.MemoryAddress getIntrinsicWidth) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_intrinsic_width"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getIntrinsicWidth == null ? MemoryAddress.NULL : getIntrinsicWidth));
            return this;
        }
        
        public Build setGetIntrinsicHeight(java.lang.foreign.MemoryAddress getIntrinsicHeight) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_intrinsic_height"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getIntrinsicHeight == null ? MemoryAddress.NULL : getIntrinsicHeight));
            return this;
        }
        
        public Build setGetIntrinsicAspectRatio(java.lang.foreign.MemoryAddress getIntrinsicAspectRatio) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_intrinsic_aspect_ratio"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getIntrinsicAspectRatio == null ? MemoryAddress.NULL : getIntrinsicAspectRatio));
            return this;
        }
    }
}
