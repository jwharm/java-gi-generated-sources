package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class WindowClass extends Struct {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkWindowClass";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gtk.gtk.WidgetClass.getMemoryLayout().withName("parent_class"),
            Interop.valueLayout.ADDRESS.withName("activate_focus"),
            Interop.valueLayout.ADDRESS.withName("activate_default"),
            Interop.valueLayout.ADDRESS.withName("keys_changed"),
            Interop.valueLayout.ADDRESS.withName("enable_debugging"),
            Interop.valueLayout.ADDRESS.withName("close_request"),
            MemoryLayout.sequenceLayout(8, Interop.valueLayout.ADDRESS).withName("padding")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link WindowClass}
     * @return A new, uninitialized @{link WindowClass}
     */
    public static WindowClass allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        WindowClass newInstance = new WindowClass(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code parent_class}
     * @return The value of the field {@code parent_class}
     */
    public org.gtk.gtk.WidgetClass getParentClass() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("parent_class"));
        return org.gtk.gtk.WidgetClass.fromAddress.marshal(((MemoryAddress) handle()).addOffset(OFFSET), Ownership.UNKNOWN);
    }
    
    /**
     * Change the value of the field {@code parent_class}
     * @param parentClass The new value of the field {@code parent_class}
     */
    public void setParentClass(org.gtk.gtk.WidgetClass parentClass) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("parent_class"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (parentClass == null ? MemoryAddress.NULL : parentClass.handle()));
    }
    
    @FunctionalInterface
    public interface ActivateFocusCallback {
        void run(org.gtk.gtk.Window window);

        @ApiStatus.Internal default void upcall(MemoryAddress window) {
            run((org.gtk.gtk.Window) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(window)), org.gtk.gtk.Window.fromAddress).marshal(window, Ownership.NONE));
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(ActivateFocusCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code activate_focus}
     * @param activateFocus The new value of the field {@code activate_focus}
     */
    public void setActivateFocus(ActivateFocusCallback activateFocus) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("activate_focus"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (activateFocus == null ? MemoryAddress.NULL : activateFocus.toCallback()));
    }
    
    @FunctionalInterface
    public interface ActivateDefaultCallback {
        void run(org.gtk.gtk.Window window);

        @ApiStatus.Internal default void upcall(MemoryAddress window) {
            run((org.gtk.gtk.Window) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(window)), org.gtk.gtk.Window.fromAddress).marshal(window, Ownership.NONE));
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(ActivateDefaultCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code activate_default}
     * @param activateDefault The new value of the field {@code activate_default}
     */
    public void setActivateDefault(ActivateDefaultCallback activateDefault) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("activate_default"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (activateDefault == null ? MemoryAddress.NULL : activateDefault.toCallback()));
    }
    
    @FunctionalInterface
    public interface KeysChangedCallback {
        void run(org.gtk.gtk.Window window);

        @ApiStatus.Internal default void upcall(MemoryAddress window) {
            run((org.gtk.gtk.Window) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(window)), org.gtk.gtk.Window.fromAddress).marshal(window, Ownership.NONE));
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(KeysChangedCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code keys_changed}
     * @param keysChanged The new value of the field {@code keys_changed}
     */
    public void setKeysChanged(KeysChangedCallback keysChanged) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("keys_changed"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (keysChanged == null ? MemoryAddress.NULL : keysChanged.toCallback()));
    }
    
    @FunctionalInterface
    public interface EnableDebuggingCallback {
        boolean run(org.gtk.gtk.Window window, boolean toggle);

        @ApiStatus.Internal default int upcall(MemoryAddress window, int toggle) {
            var RESULT = run((org.gtk.gtk.Window) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(window)), org.gtk.gtk.Window.fromAddress).marshal(window, Ownership.NONE), Marshal.integerToBoolean.marshal(toggle, null).booleanValue());
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(EnableDebuggingCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code enable_debugging}
     * @param enableDebugging The new value of the field {@code enable_debugging}
     */
    public void setEnableDebugging(EnableDebuggingCallback enableDebugging) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("enable_debugging"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (enableDebugging == null ? MemoryAddress.NULL : enableDebugging.toCallback()));
    }
    
    @FunctionalInterface
    public interface CloseRequestCallback {
        boolean run(org.gtk.gtk.Window window);

        @ApiStatus.Internal default int upcall(MemoryAddress window) {
            var RESULT = run((org.gtk.gtk.Window) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(window)), org.gtk.gtk.Window.fromAddress).marshal(window, Ownership.NONE));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(CloseRequestCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code close_request}
     * @param closeRequest The new value of the field {@code close_request}
     */
    public void setCloseRequest(CloseRequestCallback closeRequest) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("close_request"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (closeRequest == null ? MemoryAddress.NULL : closeRequest.toCallback()));
    }
    
    /**
     * Create a WindowClass proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected WindowClass(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, WindowClass> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new WindowClass(input, ownership);
    
    /**
     * A {@link WindowClass.Builder} object constructs a {@link WindowClass} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link WindowClass.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final WindowClass struct;
        
        private Builder() {
            struct = WindowClass.allocate();
        }
        
         /**
         * Finish building the {@link WindowClass} struct.
         * @return A new instance of {@code WindowClass} with the fields 
         *         that were set in the Builder object.
         */
        public WindowClass build() {
            return struct;
        }
        
        /**
         * The parent class.
         * @param parentClass The value for the {@code parentClass} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setParentClass(org.gtk.gtk.WidgetClass parentClass) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("parent_class"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (parentClass == null ? MemoryAddress.NULL : parentClass.handle()));
            return this;
        }
        
        public Builder setActivateFocus(ActivateFocusCallback activateFocus) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("activate_focus"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (activateFocus == null ? MemoryAddress.NULL : activateFocus.toCallback()));
            return this;
        }
        
        public Builder setActivateDefault(ActivateDefaultCallback activateDefault) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("activate_default"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (activateDefault == null ? MemoryAddress.NULL : activateDefault.toCallback()));
            return this;
        }
        
        public Builder setKeysChanged(KeysChangedCallback keysChanged) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("keys_changed"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (keysChanged == null ? MemoryAddress.NULL : keysChanged.toCallback()));
            return this;
        }
        
        public Builder setEnableDebugging(EnableDebuggingCallback enableDebugging) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("enable_debugging"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (enableDebugging == null ? MemoryAddress.NULL : enableDebugging.toCallback()));
            return this;
        }
        
        public Builder setCloseRequest(CloseRequestCallback closeRequest) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("close_request"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (closeRequest == null ? MemoryAddress.NULL : closeRequest.toCallback()));
            return this;
        }
        
        public Builder setPadding(java.lang.foreign.MemoryAddress[] padding) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("padding"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (padding == null ? MemoryAddress.NULL : Interop.allocateNativeArray(padding, false)));
            return this;
        }
    }
}
