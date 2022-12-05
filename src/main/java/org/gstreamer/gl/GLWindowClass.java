package org.gstreamer.gl;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class GLWindowClass extends Struct {
    
    static {
        GstGL.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstGLWindowClass";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gstreamer.gst.ObjectClass.getMemoryLayout().withName("parent_class"),
        Interop.valueLayout.ADDRESS.withName("get_display"),
        Interop.valueLayout.ADDRESS.withName("set_window_handle"),
        Interop.valueLayout.ADDRESS.withName("get_window_handle"),
        Interop.valueLayout.ADDRESS.withName("draw"),
        Interop.valueLayout.ADDRESS.withName("run"),
        Interop.valueLayout.ADDRESS.withName("quit"),
        Interop.valueLayout.ADDRESS.withName("send_message"),
        Interop.valueLayout.ADDRESS.withName("send_message_async"),
        Interop.valueLayout.ADDRESS.withName("open"),
        Interop.valueLayout.ADDRESS.withName("close"),
        Interop.valueLayout.ADDRESS.withName("handle_events"),
        Interop.valueLayout.ADDRESS.withName("set_preferred_size"),
        Interop.valueLayout.ADDRESS.withName("show"),
        Interop.valueLayout.ADDRESS.withName("set_render_rectangle"),
        Interop.valueLayout.ADDRESS.withName("queue_resize"),
        Interop.valueLayout.ADDRESS.withName("controls_viewport"),
        Interop.valueLayout.ADDRESS.withName("has_output_surface"),
        MemoryLayout.sequenceLayout(2, Interop.valueLayout.ADDRESS).withName("_reserved")
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
     * Allocate a new {@link GLWindowClass}
     * @return A new, uninitialized @{link GLWindowClass}
     */
    public static GLWindowClass allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        GLWindowClass newInstance = new GLWindowClass(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code parent_class}
     * @return The value of the field {@code parent_class}
     */
    public org.gstreamer.gst.ObjectClass parentClass$get() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("parent_class"));
        return new org.gstreamer.gst.ObjectClass(((MemoryAddress) handle()).addOffset(OFFSET), Ownership.UNKNOWN);
    }
    
    /**
     * Create a GLWindowClass proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public GLWindowClass(Addressable address, Ownership ownership) {
        super(address, ownership);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private GLWindowClass struct;
        
         /**
         * A {@link GLWindowClass.Build} object constructs a {@link GLWindowClass} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = GLWindowClass.allocate();
        }
        
         /**
         * Finish building the {@link GLWindowClass} struct.
         * @return A new instance of {@code GLWindowClass} with the fields 
         *         that were set in the Build object.
         */
        public GLWindowClass construct() {
            return struct;
        }
        
        /**
         * Parent class
         * @param parentClass The value for the {@code parentClass} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setParentClass(org.gstreamer.gst.ObjectClass parentClass) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("parent_class"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (parentClass == null ? MemoryAddress.NULL : parentClass.handle()));
            return this;
        }
        
        public Build setGetDisplay(java.lang.foreign.MemoryAddress getDisplay) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_display"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getDisplay == null ? MemoryAddress.NULL : getDisplay));
            return this;
        }
        
        public Build setSetWindowHandle(java.lang.foreign.MemoryAddress setWindowHandle) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("set_window_handle"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (setWindowHandle == null ? MemoryAddress.NULL : setWindowHandle));
            return this;
        }
        
        public Build setGetWindowHandle(java.lang.foreign.MemoryAddress getWindowHandle) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_window_handle"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getWindowHandle == null ? MemoryAddress.NULL : getWindowHandle));
            return this;
        }
        
        public Build setDraw(java.lang.foreign.MemoryAddress draw) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("draw"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (draw == null ? MemoryAddress.NULL : draw));
            return this;
        }
        
        public Build setRun(java.lang.foreign.MemoryAddress run) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("run"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (run == null ? MemoryAddress.NULL : run));
            return this;
        }
        
        public Build setQuit(java.lang.foreign.MemoryAddress quit) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("quit"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (quit == null ? MemoryAddress.NULL : quit));
            return this;
        }
        
        public Build setSendMessage(java.lang.foreign.MemoryAddress sendMessage) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("send_message"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (sendMessage == null ? MemoryAddress.NULL : sendMessage));
            return this;
        }
        
        public Build setSendMessageAsync(java.lang.foreign.MemoryAddress sendMessageAsync) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("send_message_async"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (sendMessageAsync == null ? MemoryAddress.NULL : sendMessageAsync));
            return this;
        }
        
        public Build setOpen(java.lang.foreign.MemoryAddress open) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("open"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (open == null ? MemoryAddress.NULL : open));
            return this;
        }
        
        public Build setClose(java.lang.foreign.MemoryAddress close) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("close"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (close == null ? MemoryAddress.NULL : close));
            return this;
        }
        
        public Build setHandleEvents(java.lang.foreign.MemoryAddress handleEvents) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("handle_events"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (handleEvents == null ? MemoryAddress.NULL : handleEvents));
            return this;
        }
        
        public Build setSetPreferredSize(java.lang.foreign.MemoryAddress setPreferredSize) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("set_preferred_size"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (setPreferredSize == null ? MemoryAddress.NULL : setPreferredSize));
            return this;
        }
        
        public Build setShow(java.lang.foreign.MemoryAddress show) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("show"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (show == null ? MemoryAddress.NULL : show));
            return this;
        }
        
        public Build setSetRenderRectangle(java.lang.foreign.MemoryAddress setRenderRectangle) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("set_render_rectangle"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (setRenderRectangle == null ? MemoryAddress.NULL : setRenderRectangle));
            return this;
        }
        
        public Build setQueueResize(java.lang.foreign.MemoryAddress queueResize) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("queue_resize"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (queueResize == null ? MemoryAddress.NULL : queueResize));
            return this;
        }
        
        public Build setControlsViewport(java.lang.foreign.MemoryAddress controlsViewport) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("controls_viewport"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (controlsViewport == null ? MemoryAddress.NULL : controlsViewport));
            return this;
        }
        
        public Build setHasOutputSurface(java.lang.foreign.MemoryAddress hasOutputSurface) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("has_output_surface"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (hasOutputSurface == null ? MemoryAddress.NULL : hasOutputSurface));
            return this;
        }
        
        public Build setReserved(java.lang.foreign.MemoryAddress[] Reserved) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("_reserved"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (Reserved == null ? MemoryAddress.NULL : Interop.allocateNativeArray(Reserved, false)));
            return this;
        }
    }
}
