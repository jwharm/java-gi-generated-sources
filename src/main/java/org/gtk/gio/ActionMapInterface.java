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
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        ActionMapInterface newInstance = new ActionMapInterface(segment.address());
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
     * Functional interface declaration of the {@code LookupActionCallback} callback.
     */
    @FunctionalInterface
    public interface LookupActionCallback {
    
        @Nullable org.gtk.gio.Action run(org.gtk.gio.ActionMap actionMap, java.lang.String actionName);
        
        @ApiStatus.Internal default Addressable upcall(MemoryAddress actionMap, MemoryAddress actionName) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                var RESULT = run((org.gtk.gio.ActionMap) Interop.register(actionMap, org.gtk.gio.ActionMap.fromAddress).marshal(actionMap, null), Marshal.addressToString.marshal(actionName, null));
                return RESULT == null ? MemoryAddress.NULL.address() : (RESULT.handle()).address();
            }
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), LookupActionCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code lookup_action}
     * @param lookupAction The new value of the field {@code lookup_action}
     */
    public void setLookupAction(LookupActionCallback lookupAction) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("lookup_action"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (lookupAction == null ? MemoryAddress.NULL : lookupAction.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code AddActionCallback} callback.
     */
    @FunctionalInterface
    public interface AddActionCallback {
    
        void run(org.gtk.gio.ActionMap actionMap, org.gtk.gio.Action action);
        
        @ApiStatus.Internal default void upcall(MemoryAddress actionMap, MemoryAddress action) {
            run((org.gtk.gio.ActionMap) Interop.register(actionMap, org.gtk.gio.ActionMap.fromAddress).marshal(actionMap, null), (org.gtk.gio.Action) Interop.register(action, org.gtk.gio.Action.fromAddress).marshal(action, null));
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), AddActionCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code add_action}
     * @param addAction The new value of the field {@code add_action}
     */
    public void setAddAction(AddActionCallback addAction) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("add_action"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (addAction == null ? MemoryAddress.NULL : addAction.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code RemoveActionCallback} callback.
     */
    @FunctionalInterface
    public interface RemoveActionCallback {
    
        void run(org.gtk.gio.ActionMap actionMap, java.lang.String actionName);
        
        @ApiStatus.Internal default void upcall(MemoryAddress actionMap, MemoryAddress actionName) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                run((org.gtk.gio.ActionMap) Interop.register(actionMap, org.gtk.gio.ActionMap.fromAddress).marshal(actionMap, null), Marshal.addressToString.marshal(actionName, null));
            }
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), RemoveActionCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code remove_action}
     * @param removeAction The new value of the field {@code remove_action}
     */
    public void setRemoveAction(RemoveActionCallback removeAction) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("remove_action"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (removeAction == null ? MemoryAddress.NULL : removeAction.toCallback()));
        }
    }
    
    /**
     * Create a ActionMapInterface proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected ActionMapInterface(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, ActionMapInterface> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new ActionMapInterface(input);
    
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
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("g_iface"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (gIface == null ? MemoryAddress.NULL : gIface.handle()));
                return this;
            }
        }
        
        public Builder setLookupAction(LookupActionCallback lookupAction) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("lookup_action"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (lookupAction == null ? MemoryAddress.NULL : lookupAction.toCallback()));
                return this;
            }
        }
        
        public Builder setAddAction(AddActionCallback addAction) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("add_action"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (addAction == null ? MemoryAddress.NULL : addAction.toCallback()));
                return this;
            }
        }
        
        public Builder setRemoveAction(RemoveActionCallback removeAction) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("remove_action"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (removeAction == null ? MemoryAddress.NULL : removeAction.toCallback()));
                return this;
            }
        }
    }
}
