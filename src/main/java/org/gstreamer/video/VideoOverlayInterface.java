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
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gtk.gobject.TypeInterface.getMemoryLayout().withName("iface"),
            Interop.valueLayout.ADDRESS.withName("expose"),
            Interop.valueLayout.ADDRESS.withName("handle_events"),
            Interop.valueLayout.ADDRESS.withName("set_render_rectangle"),
            Interop.valueLayout.ADDRESS.withName("set_window_handle")
        ).withName(C_TYPE_NAME);
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
    public org.gtk.gobject.TypeInterface getIface() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("iface"));
        return org.gtk.gobject.TypeInterface.fromAddress.marshal(((MemoryAddress) handle()).addOffset(OFFSET), Ownership.UNKNOWN);
    }
    
    /**
     * Change the value of the field {@code iface}
     * @param iface The new value of the field {@code iface}
     */
    public void setIface(org.gtk.gobject.TypeInterface iface) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("iface"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (iface == null ? MemoryAddress.NULL : iface.handle()));
    }
    
    @FunctionalInterface
    public interface ExposeCallback {
        void run(org.gstreamer.video.VideoOverlay overlay);

        @ApiStatus.Internal default void upcall(MemoryAddress overlay) {
            run((org.gstreamer.video.VideoOverlay) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(overlay)), org.gstreamer.video.VideoOverlay.fromAddress).marshal(overlay, Ownership.NONE));
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(ExposeCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code expose}
     * @param expose The new value of the field {@code expose}
     */
    public void setExpose(ExposeCallback expose) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("expose"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (expose == null ? MemoryAddress.NULL : expose.toCallback()));
    }
    
    @FunctionalInterface
    public interface HandleEventsCallback {
        void run(org.gstreamer.video.VideoOverlay overlay, boolean handleEvents);

        @ApiStatus.Internal default void upcall(MemoryAddress overlay, int handleEvents) {
            run((org.gstreamer.video.VideoOverlay) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(overlay)), org.gstreamer.video.VideoOverlay.fromAddress).marshal(overlay, Ownership.NONE), Marshal.integerToBoolean.marshal(handleEvents, null).booleanValue());
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(HandleEventsCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code handle_events}
     * @param handleEvents The new value of the field {@code handle_events}
     */
    public void setHandleEvents(HandleEventsCallback handleEvents) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("handle_events"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (handleEvents == null ? MemoryAddress.NULL : handleEvents.toCallback()));
    }
    
    @FunctionalInterface
    public interface SetRenderRectangleCallback {
        void run(org.gstreamer.video.VideoOverlay overlay, int x, int y, int width, int height);

        @ApiStatus.Internal default void upcall(MemoryAddress overlay, int x, int y, int width, int height) {
            run((org.gstreamer.video.VideoOverlay) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(overlay)), org.gstreamer.video.VideoOverlay.fromAddress).marshal(overlay, Ownership.NONE), x, y, width, height);
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(SetRenderRectangleCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code set_render_rectangle}
     * @param setRenderRectangle The new value of the field {@code set_render_rectangle}
     */
    public void setSetRenderRectangle(SetRenderRectangleCallback setRenderRectangle) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("set_render_rectangle"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (setRenderRectangle == null ? MemoryAddress.NULL : setRenderRectangle.toCallback()));
    }
    
    @FunctionalInterface
    public interface SetWindowHandleCallback {
        void run(org.gstreamer.video.VideoOverlay overlay, long handle);

        @ApiStatus.Internal default void upcall(MemoryAddress overlay, long handle) {
            run((org.gstreamer.video.VideoOverlay) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(overlay)), org.gstreamer.video.VideoOverlay.fromAddress).marshal(overlay, Ownership.NONE), handle);
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(SetWindowHandleCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code set_window_handle}
     * @param setWindowHandle The new value of the field {@code set_window_handle}
     */
    public void setSetWindowHandle(SetWindowHandleCallback setWindowHandle) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("set_window_handle"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (setWindowHandle == null ? MemoryAddress.NULL : setWindowHandle.toCallback()));
    }
    
    /**
     * Create a VideoOverlayInterface proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected VideoOverlayInterface(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, VideoOverlayInterface> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new VideoOverlayInterface(input, ownership);
    
    /**
     * A {@link VideoOverlayInterface.Builder} object constructs a {@link VideoOverlayInterface} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link VideoOverlayInterface.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final VideoOverlayInterface struct;
        
        private Builder() {
            struct = VideoOverlayInterface.allocate();
        }
        
         /**
         * Finish building the {@link VideoOverlayInterface} struct.
         * @return A new instance of {@code VideoOverlayInterface} with the fields 
         *         that were set in the Builder object.
         */
        public VideoOverlayInterface build() {
            return struct;
        }
        
        /**
         * parent interface type.
         * @param iface The value for the {@code iface} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setIface(org.gtk.gobject.TypeInterface iface) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("iface"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (iface == null ? MemoryAddress.NULL : iface.handle()));
            return this;
        }
        
        public Builder setExpose(ExposeCallback expose) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("expose"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (expose == null ? MemoryAddress.NULL : expose.toCallback()));
            return this;
        }
        
        public Builder setHandleEvents(HandleEventsCallback handleEvents) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("handle_events"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (handleEvents == null ? MemoryAddress.NULL : handleEvents.toCallback()));
            return this;
        }
        
        public Builder setSetRenderRectangle(SetRenderRectangleCallback setRenderRectangle) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("set_render_rectangle"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (setRenderRectangle == null ? MemoryAddress.NULL : setRenderRectangle.toCallback()));
            return this;
        }
        
        public Builder setSetWindowHandle(SetWindowHandleCallback setWindowHandle) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("set_window_handle"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (setWindowHandle == null ? MemoryAddress.NULL : setWindowHandle.toCallback()));
            return this;
        }
    }
}
