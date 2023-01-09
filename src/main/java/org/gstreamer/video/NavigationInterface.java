package org.gstreamer.video;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Navigation interface.
 */
public class NavigationInterface extends Struct {
    
    static {
        GstVideo.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstNavigationInterface";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gtk.gobject.TypeInterface.getMemoryLayout().withName("iface"),
            Interop.valueLayout.ADDRESS.withName("send_event")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link NavigationInterface}
     * @return A new, uninitialized @{link NavigationInterface}
     */
    public static NavigationInterface allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        NavigationInterface newInstance = new NavigationInterface(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code iface}
     * @return The value of the field {@code iface}
     */
    public org.gtk.gobject.TypeInterface getIface() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("iface"));
        return org.gtk.gobject.TypeInterface.fromAddress.marshal(((MemoryAddress) handle()).addOffset(OFFSET), null);
    }
    
    /**
     * Change the value of the field {@code iface}
     * @param iface The new value of the field {@code iface}
     */
    public void setIface(org.gtk.gobject.TypeInterface iface) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("iface"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (iface == null ? MemoryAddress.NULL : iface.handle()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code SendEventCallback} callback.
     */
    @FunctionalInterface
    public interface SendEventCallback {
    
        void run(org.gstreamer.video.Navigation navigation, org.gstreamer.gst.Structure structure);
        
        @ApiStatus.Internal default void upcall(MemoryAddress navigation, MemoryAddress structure) {
            run((org.gstreamer.video.Navigation) Interop.register(navigation, org.gstreamer.video.Navigation.fromAddress).marshal(navigation, null), org.gstreamer.gst.Structure.fromAddress.marshal(structure, null));
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), SendEventCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code send_event}
     * @param sendEvent The new value of the field {@code send_event}
     */
    public void setSendEvent(SendEventCallback sendEvent) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("send_event"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (sendEvent == null ? MemoryAddress.NULL : sendEvent.toCallback()));
        }
    }
    
    /**
     * Create a NavigationInterface proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected NavigationInterface(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, NavigationInterface> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new NavigationInterface(input);
    
    /**
     * A {@link NavigationInterface.Builder} object constructs a {@link NavigationInterface} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link NavigationInterface.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final NavigationInterface struct;
        
        private Builder() {
            struct = NavigationInterface.allocate();
        }
        
        /**
         * Finish building the {@link NavigationInterface} struct.
         * @return A new instance of {@code NavigationInterface} with the fields 
         *         that were set in the Builder object.
         */
        public NavigationInterface build() {
            return struct;
        }
        
        /**
         * the parent interface
         * @param iface The value for the {@code iface} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setIface(org.gtk.gobject.TypeInterface iface) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("iface"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (iface == null ? MemoryAddress.NULL : iface.handle()));
                return this;
            }
        }
        
        public Builder setSendEvent(SendEventCallback sendEvent) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("send_event"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (sendEvent == null ? MemoryAddress.NULL : sendEvent.toCallback()));
                return this;
            }
        }
    }
}
