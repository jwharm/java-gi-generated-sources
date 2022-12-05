package org.gstreamer.video;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@link VideoOverlay} interface
 */
public class VideoOverlayInterface extends Struct {
    
    static {
        GstVideo.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstVideoOverlayInterface";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.gobject.TypeInterface.getMemoryLayout().withName("iface"),
        Interop.valueLayout.ADDRESS.withName("expose"),
        Interop.valueLayout.ADDRESS.withName("handle_events"),
        Interop.valueLayout.ADDRESS.withName("set_render_rectangle"),
        Interop.valueLayout.ADDRESS.withName("set_window_handle")
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
     * Allocate a new {@link VideoOverlayInterface}
     * @return A new, uninitialized @{link VideoOverlayInterface}
     */
    public static VideoOverlayInterface allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        VideoOverlayInterface newInstance = new VideoOverlayInterface(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code iface}
     * @return The value of the field {@code iface}
     */
    public org.gtk.gobject.TypeInterface iface$get() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("iface"));
        return new org.gtk.gobject.TypeInterface(((MemoryAddress) handle()).addOffset(OFFSET), Ownership.UNKNOWN);
    }
    
    /**
     * Create a VideoOverlayInterface proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public VideoOverlayInterface(Addressable address, Ownership ownership) {
        super(address, ownership);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private VideoOverlayInterface struct;
        
         /**
         * A {@link VideoOverlayInterface.Build} object constructs a {@link VideoOverlayInterface} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = VideoOverlayInterface.allocate();
        }
        
         /**
         * Finish building the {@link VideoOverlayInterface} struct.
         * @return A new instance of {@code VideoOverlayInterface} with the fields 
         *         that were set in the Build object.
         */
        public VideoOverlayInterface construct() {
            return struct;
        }
        
        /**
         * parent interface type.
         * @param iface The value for the {@code iface} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setIface(org.gtk.gobject.TypeInterface iface) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("iface"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (iface == null ? MemoryAddress.NULL : iface.handle()));
            return this;
        }
        
        public Build setExpose(java.lang.foreign.MemoryAddress expose) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("expose"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (expose == null ? MemoryAddress.NULL : expose));
            return this;
        }
        
        public Build setHandleEvents(java.lang.foreign.MemoryAddress handleEvents) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("handle_events"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (handleEvents == null ? MemoryAddress.NULL : handleEvents));
            return this;
        }
        
        public Build setSetRenderRectangle(java.lang.foreign.MemoryAddress setRenderRectangle) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("set_render_rectangle"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (setRenderRectangle == null ? MemoryAddress.NULL : setRenderRectangle));
            return this;
        }
        
        public Build setSetWindowHandle(java.lang.foreign.MemoryAddress setWindowHandle) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("set_window_handle"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (setWindowHandle == null ? MemoryAddress.NULL : setWindowHandle));
            return this;
        }
    }
}
