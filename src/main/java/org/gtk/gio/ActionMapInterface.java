package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The virtual function table for {@link ActionMap}.
 * @version 2.32
 */
public class ActionMapInterface extends Struct {
    
    static {
        Gio.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GActionMapInterface";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gtk.gobject.TypeInterface.getMemoryLayout().withName("g_iface"),
            Interop.valueLayout.ADDRESS.withName("lookup_action"),
            Interop.valueLayout.ADDRESS.withName("add_action"),
            Interop.valueLayout.ADDRESS.withName("remove_action")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link ActionMapInterface}
     * @return A new, uninitialized @{link ActionMapInterface}
     */
    public static ActionMapInterface allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        ActionMapInterface newInstance = new ActionMapInterface(segment.address(), Ownership.NONE);
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
    public interface LookupActionCallback {
        @Nullable org.gtk.gio.Action run(org.gtk.gio.ActionMap actionMap, java.lang.String actionName);

        @ApiStatus.Internal default Addressable upcall(MemoryAddress actionMap, MemoryAddress actionName) {
            var RESULT = run((org.gtk.gio.ActionMap) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(actionMap)), org.gtk.gio.ActionMap.fromAddress).marshal(actionMap, Ownership.NONE), Marshal.addressToString.marshal(actionName, null));
            return RESULT == null ? MemoryAddress.NULL.address() : (RESULT.handle()).address();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(LookupActionCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code lookup_action}
     * @param lookupAction The new value of the field {@code lookup_action}
     */
    public void setLookupAction(LookupActionCallback lookupAction) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("lookup_action"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (lookupAction == null ? MemoryAddress.NULL : lookupAction.toCallback()));
    }
    
    @FunctionalInterface
    public interface AddActionCallback {
        void run(org.gtk.gio.ActionMap actionMap, org.gtk.gio.Action action);

        @ApiStatus.Internal default void upcall(MemoryAddress actionMap, MemoryAddress action) {
            run((org.gtk.gio.ActionMap) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(actionMap)), org.gtk.gio.ActionMap.fromAddress).marshal(actionMap, Ownership.NONE), (org.gtk.gio.Action) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(action)), org.gtk.gio.Action.fromAddress).marshal(action, Ownership.NONE));
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(AddActionCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code add_action}
     * @param addAction The new value of the field {@code add_action}
     */
    public void setAddAction(AddActionCallback addAction) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("add_action"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (addAction == null ? MemoryAddress.NULL : addAction.toCallback()));
    }
    
    @FunctionalInterface
    public interface RemoveActionCallback {
        void run(org.gtk.gio.ActionMap actionMap, java.lang.String actionName);

        @ApiStatus.Internal default void upcall(MemoryAddress actionMap, MemoryAddress actionName) {
            run((org.gtk.gio.ActionMap) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(actionMap)), org.gtk.gio.ActionMap.fromAddress).marshal(actionMap, Ownership.NONE), Marshal.addressToString.marshal(actionName, null));
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(RemoveActionCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code remove_action}
     * @param removeAction The new value of the field {@code remove_action}
     */
    public void setRemoveAction(RemoveActionCallback removeAction) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("remove_action"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (removeAction == null ? MemoryAddress.NULL : removeAction.toCallback()));
    }
    
    /**
     * Create a ActionMapInterface proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected ActionMapInterface(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, ActionMapInterface> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new ActionMapInterface(input, ownership);
    
    /**
     * A {@link ActionMapInterface.Builder} object constructs a {@link ActionMapInterface} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link ActionMapInterface.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final ActionMapInterface struct;
        
        private Builder() {
            struct = ActionMapInterface.allocate();
        }
        
         /**
         * Finish building the {@link ActionMapInterface} struct.
         * @return A new instance of {@code ActionMapInterface} with the fields 
         *         that were set in the Builder object.
         */
        public ActionMapInterface build() {
            return struct;
        }
        
        public Builder setGIface(org.gtk.gobject.TypeInterface gIface) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("g_iface"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (gIface == null ? MemoryAddress.NULL : gIface.handle()));
            return this;
        }
        
        public Builder setLookupAction(LookupActionCallback lookupAction) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("lookup_action"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (lookupAction == null ? MemoryAddress.NULL : lookupAction.toCallback()));
            return this;
        }
        
        public Builder setAddAction(AddActionCallback addAction) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("add_action"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (addAction == null ? MemoryAddress.NULL : addAction.toCallback()));
            return this;
        }
        
        public Builder setRemoveAction(RemoveActionCallback removeAction) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("remove_action"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (removeAction == null ? MemoryAddress.NULL : removeAction.toCallback()));
            return this;
        }
    }
}
