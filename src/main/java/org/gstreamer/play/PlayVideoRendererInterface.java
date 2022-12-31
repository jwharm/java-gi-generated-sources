package org.gstreamer.play;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class PlayVideoRendererInterface extends Struct {
    
    static {
        GstPlay.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstPlayVideoRendererInterface";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gtk.gobject.TypeInterface.getMemoryLayout().withName("parent_iface"),
            Interop.valueLayout.ADDRESS.withName("create_video_sink")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link PlayVideoRendererInterface}
     * @return A new, uninitialized @{link PlayVideoRendererInterface}
     */
    public static PlayVideoRendererInterface allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        PlayVideoRendererInterface newInstance = new PlayVideoRendererInterface(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code parent_iface}
     * @return The value of the field {@code parent_iface}
     */
    public org.gtk.gobject.TypeInterface getParentIface() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("parent_iface"));
        return org.gtk.gobject.TypeInterface.fromAddress.marshal(((MemoryAddress) handle()).addOffset(OFFSET), Ownership.UNKNOWN);
    }
    
    /**
     * Change the value of the field {@code parent_iface}
     * @param parentIface The new value of the field {@code parent_iface}
     */
    public void setParentIface(org.gtk.gobject.TypeInterface parentIface) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("parent_iface"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (parentIface == null ? MemoryAddress.NULL : parentIface.handle()));
    }
    
    @FunctionalInterface
    public interface CreateVideoSinkCallback {
        org.gstreamer.gst.Element run(org.gstreamer.play.PlayVideoRenderer self, org.gstreamer.play.Play play);

        @ApiStatus.Internal default Addressable upcall(MemoryAddress self, MemoryAddress play) {
            var RESULT = run((org.gstreamer.play.PlayVideoRenderer) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(self)), org.gstreamer.play.PlayVideoRenderer.fromAddress).marshal(self, Ownership.NONE), (org.gstreamer.play.Play) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(play)), org.gstreamer.play.Play.fromAddress).marshal(play, Ownership.NONE));
            return RESULT == null ? MemoryAddress.NULL.address() : (RESULT.handle()).address();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(CreateVideoSinkCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code create_video_sink}
     * @param createVideoSink The new value of the field {@code create_video_sink}
     */
    public void setCreateVideoSink(CreateVideoSinkCallback createVideoSink) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("create_video_sink"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (createVideoSink == null ? MemoryAddress.NULL : createVideoSink.toCallback()));
    }
    
    /**
     * Create a PlayVideoRendererInterface proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected PlayVideoRendererInterface(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, PlayVideoRendererInterface> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new PlayVideoRendererInterface(input, ownership);
    
    /**
     * A {@link PlayVideoRendererInterface.Builder} object constructs a {@link PlayVideoRendererInterface} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link PlayVideoRendererInterface.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final PlayVideoRendererInterface struct;
        
        private Builder() {
            struct = PlayVideoRendererInterface.allocate();
        }
        
         /**
         * Finish building the {@link PlayVideoRendererInterface} struct.
         * @return A new instance of {@code PlayVideoRendererInterface} with the fields 
         *         that were set in the Builder object.
         */
        public PlayVideoRendererInterface build() {
            return struct;
        }
        
        public Builder setParentIface(org.gtk.gobject.TypeInterface parentIface) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("parent_iface"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (parentIface == null ? MemoryAddress.NULL : parentIface.handle()));
            return this;
        }
        
        public Builder setCreateVideoSink(CreateVideoSinkCallback createVideoSink) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("create_video_sink"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (createVideoSink == null ? MemoryAddress.NULL : createVideoSink.toCallback()));
            return this;
        }
    }
}
