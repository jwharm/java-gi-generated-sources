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
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        RemoteActionGroupInterface newInstance = new RemoteActionGroupInterface(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code g_iface}
     * @return The value of the field {@code g_iface}
     */
    public org.gtk.gobject.TypeInterface getGIface() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("g_iface"));
        return org.gtk.gobject.TypeInterface.fromAddress.marshal(((MemoryAddress) handle()).addOffset(OFFSET), Ownership.UNKNOWN);
    }
    
    /**
     * Change the value of the field {@code g_iface}
     * @param gIface The new value of the field {@code g_iface}
     */
    public void setGIface(org.gtk.gobject.TypeInterface gIface) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("g_iface"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (gIface == null ? MemoryAddress.NULL : gIface.handle()));
    }
    
    @FunctionalInterface
    public interface ActivateActionFullCallback {
        void run(org.gtk.gio.RemoteActionGroup remote, java.lang.String actionName, @Nullable org.gtk.glib.Variant parameter, org.gtk.glib.Variant platformData);

        @ApiStatus.Internal default void upcall(MemoryAddress remote, MemoryAddress actionName, MemoryAddress parameter, MemoryAddress platformData) {
            run((org.gtk.gio.RemoteActionGroup) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(remote)), org.gtk.gio.RemoteActionGroup.fromAddress).marshal(remote, Ownership.NONE), Marshal.addressToString.marshal(actionName, null), org.gtk.glib.Variant.fromAddress.marshal(parameter, Ownership.NONE), org.gtk.glib.Variant.fromAddress.marshal(platformData, Ownership.NONE));
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(ActivateActionFullCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code activate_action_full}
     * @param activateActionFull The new value of the field {@code activate_action_full}
     */
    public void setActivateActionFull(ActivateActionFullCallback activateActionFull) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("activate_action_full"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (activateActionFull == null ? MemoryAddress.NULL : activateActionFull.toCallback()));
    }
    
    @FunctionalInterface
    public interface ChangeActionStateFullCallback {
        void run(org.gtk.gio.RemoteActionGroup remote, java.lang.String actionName, org.gtk.glib.Variant value, org.gtk.glib.Variant platformData);

        @ApiStatus.Internal default void upcall(MemoryAddress remote, MemoryAddress actionName, MemoryAddress value, MemoryAddress platformData) {
            run((org.gtk.gio.RemoteActionGroup) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(remote)), org.gtk.gio.RemoteActionGroup.fromAddress).marshal(remote, Ownership.NONE), Marshal.addressToString.marshal(actionName, null), org.gtk.glib.Variant.fromAddress.marshal(value, Ownership.NONE), org.gtk.glib.Variant.fromAddress.marshal(platformData, Ownership.NONE));
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(ChangeActionStateFullCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code change_action_state_full}
     * @param changeActionStateFull The new value of the field {@code change_action_state_full}
     */
    public void setChangeActionStateFull(ChangeActionStateFullCallback changeActionStateFull) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("change_action_state_full"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (changeActionStateFull == null ? MemoryAddress.NULL : changeActionStateFull.toCallback()));
    }
    
    /**
     * Create a RemoteActionGroupInterface proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected RemoteActionGroupInterface(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, RemoteActionGroupInterface> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new RemoteActionGroupInterface(input, ownership);
    
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
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("g_iface"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (gIface == null ? MemoryAddress.NULL : gIface.handle()));
            return this;
        }
        
        public Builder setActivateActionFull(ActivateActionFullCallback activateActionFull) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("activate_action_full"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (activateActionFull == null ? MemoryAddress.NULL : activateActionFull.toCallback()));
            return this;
        }
        
        public Builder setChangeActionStateFull(ChangeActionStateFullCallback changeActionStateFull) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("change_action_state_full"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (changeActionStateFull == null ? MemoryAddress.NULL : changeActionStateFull.toCallback()));
            return this;
        }
    }
}
