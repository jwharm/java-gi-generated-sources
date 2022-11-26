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
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.gtk.WidgetClass.getMemoryLayout().withName("parent_class"),
        Interop.valueLayout.ADDRESS.withName("activate_focus"),
        Interop.valueLayout.ADDRESS.withName("activate_default"),
        Interop.valueLayout.ADDRESS.withName("keys_changed"),
        Interop.valueLayout.ADDRESS.withName("enable_debugging"),
        Interop.valueLayout.ADDRESS.withName("close_request"),
        MemoryLayout.sequenceLayout(8, Interop.valueLayout.ADDRESS).withName("padding")
    ).withName(C_TYPE_NAME);
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
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
    public org.gtk.gtk.WidgetClass parent_class$get() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("parent_class"));
        return new org.gtk.gtk.WidgetClass(((MemoryAddress) handle()).addOffset(OFFSET), Ownership.UNKNOWN);
    }
    
    /**
     * Create a WindowClass proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public WindowClass(Addressable address, Ownership ownership) {
        super(address, ownership);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private WindowClass struct;
        
         /**
         * A {@link WindowClass.Build} object constructs a {@link WindowClass} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = WindowClass.allocate();
        }
        
         /**
         * Finish building the {@link WindowClass} struct.
         * @return A new instance of {@code WindowClass} with the fields 
         *         that were set in the Build object.
         */
        public WindowClass construct() {
            return struct;
        }
        
        /**
         * The parent class.
         * @param parent_class The value for the {@code parent_class} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setParentClass(org.gtk.gtk.WidgetClass parent_class) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("parent_class"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (parent_class == null ? MemoryAddress.NULL : parent_class.handle()));
            return this;
        }
        
        public Build setActivateFocus(java.lang.foreign.MemoryAddress activate_focus) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("activate_focus"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (activate_focus == null ? MemoryAddress.NULL : activate_focus));
            return this;
        }
        
        public Build setActivateDefault(java.lang.foreign.MemoryAddress activate_default) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("activate_default"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (activate_default == null ? MemoryAddress.NULL : activate_default));
            return this;
        }
        
        public Build setKeysChanged(java.lang.foreign.MemoryAddress keys_changed) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("keys_changed"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (keys_changed == null ? MemoryAddress.NULL : keys_changed));
            return this;
        }
        
        public Build setEnableDebugging(java.lang.foreign.MemoryAddress enable_debugging) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("enable_debugging"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (enable_debugging == null ? MemoryAddress.NULL : enable_debugging));
            return this;
        }
        
        public Build setCloseRequest(java.lang.foreign.MemoryAddress close_request) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("close_request"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (close_request == null ? MemoryAddress.NULL : close_request));
            return this;
        }
        
        public Build setPadding(java.lang.foreign.MemoryAddress[] padding) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("padding"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (padding == null ? MemoryAddress.NULL : Interop.allocateNativeArray(padding, false)));
            return this;
        }
    }
}
