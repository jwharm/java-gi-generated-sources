package org.gstreamer.player;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class PlayerVideoRendererInterface extends Struct {
    
    static {
        GstPlayer.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstPlayerVideoRendererInterface";
    
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
     * Allocate a new {@link PlayerVideoRendererInterface}
     * @return A new, uninitialized @{link PlayerVideoRendererInterface}
     */
    public static PlayerVideoRendererInterface allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        PlayerVideoRendererInterface newInstance = new PlayerVideoRendererInterface(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code parent_iface}
     * @return The value of the field {@code parent_iface}
     */
    public org.gtk.gobject.TypeInterface getParentIface() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("parent_iface"));
        return org.gtk.gobject.TypeInterface.fromAddress.marshal(((MemoryAddress) handle()).addOffset(OFFSET), null);
    }
    
    /**
     * Change the value of the field {@code parent_iface}
     * @param parentIface The new value of the field {@code parent_iface}
     */
    public void setParentIface(org.gtk.gobject.TypeInterface parentIface) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("parent_iface"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (parentIface == null ? MemoryAddress.NULL : parentIface.handle()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code CreateVideoSinkCallback} callback.
     */
    @FunctionalInterface
    public interface CreateVideoSinkCallback {
    
        org.gstreamer.gst.Element run(org.gstreamer.player.PlayerVideoRenderer self, org.gstreamer.player.Player player);
        
        @ApiStatus.Internal default Addressable upcall(MemoryAddress self, MemoryAddress player) {
            var RESULT = run((org.gstreamer.player.PlayerVideoRenderer) Interop.register(self, org.gstreamer.player.PlayerVideoRenderer.fromAddress).marshal(self, null), (org.gstreamer.player.Player) Interop.register(player, org.gstreamer.player.Player.fromAddress).marshal(player, null));
            return RESULT == null ? MemoryAddress.NULL.address() : (RESULT.handle()).address();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), CreateVideoSinkCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code create_video_sink}
     * @param createVideoSink The new value of the field {@code create_video_sink}
     */
    public void setCreateVideoSink(CreateVideoSinkCallback createVideoSink) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("create_video_sink"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (createVideoSink == null ? MemoryAddress.NULL : createVideoSink.toCallback()));
        }
    }
    
    /**
     * Create a PlayerVideoRendererInterface proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected PlayerVideoRendererInterface(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, PlayerVideoRendererInterface> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new PlayerVideoRendererInterface(input);
    
    /**
     * A {@link PlayerVideoRendererInterface.Builder} object constructs a {@link PlayerVideoRendererInterface} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link PlayerVideoRendererInterface.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final PlayerVideoRendererInterface struct;
        
        private Builder() {
            struct = PlayerVideoRendererInterface.allocate();
        }
        
        /**
         * Finish building the {@link PlayerVideoRendererInterface} struct.
         * @return A new instance of {@code PlayerVideoRendererInterface} with the fields 
         *         that were set in the Builder object.
         */
        public PlayerVideoRendererInterface build() {
            return struct;
        }
        
        public Builder setParentIface(org.gtk.gobject.TypeInterface parentIface) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("parent_iface"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (parentIface == null ? MemoryAddress.NULL : parentIface.handle()));
                return this;
            }
        }
        
        public Builder setCreateVideoSink(CreateVideoSinkCallback createVideoSink) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("create_video_sink"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (createVideoSink == null ? MemoryAddress.NULL : createVideoSink.toCallback()));
                return this;
            }
        }
    }
}
