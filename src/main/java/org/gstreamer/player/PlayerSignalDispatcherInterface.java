package org.gstreamer.player;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class PlayerSignalDispatcherInterface extends Struct {
    
    static {
        GstPlayer.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstPlayerSignalDispatcherInterface";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gtk.gobject.TypeInterface.getMemoryLayout().withName("parent_iface"),
            Interop.valueLayout.ADDRESS.withName("dispatch")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link PlayerSignalDispatcherInterface}
     * @return A new, uninitialized @{link PlayerSignalDispatcherInterface}
     */
    public static PlayerSignalDispatcherInterface allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        PlayerSignalDispatcherInterface newInstance = new PlayerSignalDispatcherInterface(segment.address(), Ownership.NONE);
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
    public interface DispatchCallback {
        void run(org.gstreamer.player.PlayerSignalDispatcher self, org.gstreamer.player.Player player, org.gstreamer.player.PlayerSignalDispatcherFunc emitter, org.gtk.glib.DestroyNotify destroy);

        @ApiStatus.Internal default void upcall(MemoryAddress self, MemoryAddress player, MemoryAddress emitter, MemoryAddress data, MemoryAddress destroy) {
            run((org.gstreamer.player.PlayerSignalDispatcher) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(self)), org.gstreamer.player.PlayerSignalDispatcher.fromAddress).marshal(self, Ownership.NONE), (org.gstreamer.player.Player) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(player)), org.gstreamer.player.Player.fromAddress).marshal(player, Ownership.NONE), null /* Unsupported parameter type */, null /* Unsupported parameter type */);
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(DispatchCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code dispatch}
     * @param dispatch The new value of the field {@code dispatch}
     */
    public void setDispatch(DispatchCallback dispatch) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("dispatch"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (dispatch == null ? MemoryAddress.NULL : dispatch.toCallback()));
    }
    
    /**
     * Create a PlayerSignalDispatcherInterface proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected PlayerSignalDispatcherInterface(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, PlayerSignalDispatcherInterface> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new PlayerSignalDispatcherInterface(input, ownership);
    
    /**
     * A {@link PlayerSignalDispatcherInterface.Builder} object constructs a {@link PlayerSignalDispatcherInterface} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link PlayerSignalDispatcherInterface.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final PlayerSignalDispatcherInterface struct;
        
        private Builder() {
            struct = PlayerSignalDispatcherInterface.allocate();
        }
        
         /**
         * Finish building the {@link PlayerSignalDispatcherInterface} struct.
         * @return A new instance of {@code PlayerSignalDispatcherInterface} with the fields 
         *         that were set in the Builder object.
         */
        public PlayerSignalDispatcherInterface build() {
            return struct;
        }
        
        public Builder setParentIface(org.gtk.gobject.TypeInterface parentIface) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("parent_iface"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (parentIface == null ? MemoryAddress.NULL : parentIface.handle()));
            return this;
        }
        
        public Builder setDispatch(DispatchCallback dispatch) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("dispatch"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (dispatch == null ? MemoryAddress.NULL : dispatch.toCallback()));
            return this;
        }
    }
}
