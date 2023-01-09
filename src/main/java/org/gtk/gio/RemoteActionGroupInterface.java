package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The virtual function table for {@link RemoteActionGroup}.
 * @version 2.32
 */
public class RemoteActionGroupInterface extends Struct {
    
    static {
        Gio.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GRemoteActionGroupInterface";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gtk.gobject.TypeInterface.getMemoryLayout().withName("g_iface"),
            Interop.valueLayout.ADDRESS.withName("activate_action_full"),
            Interop.valueLayout.ADDRESS.withName("change_action_state_full")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link RemoteActionGroupInterface}
     * @return A new, uninitialized @{link RemoteActionGroupInterface}
     */
    public static RemoteActionGroupInterface allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        RemoteActionGroupInterface newInstance = new RemoteActionGroupInterface(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code g_iface}
     * @return The value of the field {@code g_iface}
     */
    public org.gtk.gobject.TypeInterface getGIface() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("g_iface"));
        return org.gtk.gobject.TypeInterface.fromAddress.marshal(((MemoryAddress) handle()).addOffset(OFFSET), null);
    }
    
    /**
     * Change the value of the field {@code g_iface}
     * @param gIface The new value of the field {@code g_iface}
     */
    public void setGIface(org.gtk.gobject.TypeInterface gIface) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("g_iface"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (gIface == null ? MemoryAddress.NULL : gIface.handle()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code ActivateActionFullCallback} callback.
     */
    @FunctionalInterface
    public interface ActivateActionFullCallback {
    
        void run(org.gtk.gio.RemoteActionGroup remote, java.lang.String actionName, @Nullable org.gtk.glib.Variant parameter, org.gtk.glib.Variant platformData);
        
        @ApiStatus.Internal default void upcall(MemoryAddress remote, MemoryAddress actionName, MemoryAddress parameter, MemoryAddress platformData) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                run((org.gtk.gio.RemoteActionGroup) Interop.register(remote, org.gtk.gio.RemoteActionGroup.fromAddress).marshal(remote, null), Marshal.addressToString.marshal(actionName, null), org.gtk.glib.Variant.fromAddress.marshal(parameter, null), org.gtk.glib.Variant.fromAddress.marshal(platformData, null));
            }
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), ActivateActionFullCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code activate_action_full}
     * @param activateActionFull The new value of the field {@code activate_action_full}
     */
    public void setActivateActionFull(ActivateActionFullCallback activateActionFull) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("activate_action_full"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (activateActionFull == null ? MemoryAddress.NULL : activateActionFull.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code ChangeActionStateFullCallback} callback.
     */
    @FunctionalInterface
    public interface ChangeActionStateFullCallback {
    
        void run(org.gtk.gio.RemoteActionGroup remote, java.lang.String actionName, org.gtk.glib.Variant value, org.gtk.glib.Variant platformData);
        
        @ApiStatus.Internal default void upcall(MemoryAddress remote, MemoryAddress actionName, MemoryAddress value, MemoryAddress platformData) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                run((org.gtk.gio.RemoteActionGroup) Interop.register(remote, org.gtk.gio.RemoteActionGroup.fromAddress).marshal(remote, null), Marshal.addressToString.marshal(actionName, null), org.gtk.glib.Variant.fromAddress.marshal(value, null), org.gtk.glib.Variant.fromAddress.marshal(platformData, null));
            }
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), ChangeActionStateFullCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code change_action_state_full}
     * @param changeActionStateFull The new value of the field {@code change_action_state_full}
     */
    public void setChangeActionStateFull(ChangeActionStateFullCallback changeActionStateFull) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("change_action_state_full"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (changeActionStateFull == null ? MemoryAddress.NULL : changeActionStateFull.toCallback()));
        }
    }
    
    /**
     * Create a RemoteActionGroupInterface proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected RemoteActionGroupInterface(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, RemoteActionGroupInterface> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new RemoteActionGroupInterface(input);
    
    /**
     * A {@link RemoteActionGroupInterface.Builder} object constructs a {@link RemoteActionGroupInterface} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link RemoteActionGroupInterface.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final RemoteActionGroupInterface struct;
        
        private Builder() {
            struct = RemoteActionGroupInterface.allocate();
        }
        
        /**
         * Finish building the {@link RemoteActionGroupInterface} struct.
         * @return A new instance of {@code RemoteActionGroupInterface} with the fields 
         *         that were set in the Builder object.
         */
        public RemoteActionGroupInterface build() {
            return struct;
        }
        
        public Builder setGIface(org.gtk.gobject.TypeInterface gIface) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("g_iface"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (gIface == null ? MemoryAddress.NULL : gIface.handle()));
                return this;
            }
        }
        
        public Builder setActivateActionFull(ActivateActionFullCallback activateActionFull) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("activate_action_full"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (activateActionFull == null ? MemoryAddress.NULL : activateActionFull.toCallback()));
                return this;
            }
        }
        
        public Builder setChangeActionStateFull(ChangeActionStateFullCallback changeActionStateFull) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("change_action_state_full"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (changeActionStateFull == null ? MemoryAddress.NULL : changeActionStateFull.toCallback()));
                return this;
            }
        }
    }
}
