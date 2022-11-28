package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class PrintOperationClass extends Struct {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkPrintOperationClass";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.gobject.ObjectClass.getMemoryLayout().withName("parent_class"),
        Interop.valueLayout.ADDRESS.withName("done"),
        Interop.valueLayout.ADDRESS.withName("begin_print"),
        Interop.valueLayout.ADDRESS.withName("paginate"),
        Interop.valueLayout.ADDRESS.withName("request_page_setup"),
        Interop.valueLayout.ADDRESS.withName("draw_page"),
        Interop.valueLayout.ADDRESS.withName("end_print"),
        Interop.valueLayout.ADDRESS.withName("status_changed"),
        Interop.valueLayout.ADDRESS.withName("create_custom_widget"),
        Interop.valueLayout.ADDRESS.withName("custom_widget_apply"),
        Interop.valueLayout.ADDRESS.withName("preview"),
        Interop.valueLayout.ADDRESS.withName("update_custom_widget"),
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
     * Allocate a new {@link PrintOperationClass}
     * @return A new, uninitialized @{link PrintOperationClass}
     */
    public static PrintOperationClass allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        PrintOperationClass newInstance = new PrintOperationClass(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code parent_class}
     * @return The value of the field {@code parent_class}
     */
    public org.gtk.gobject.ObjectClass parentClass$get() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("parent_class"));
        return new org.gtk.gobject.ObjectClass(((MemoryAddress) handle()).addOffset(OFFSET), Ownership.UNKNOWN);
    }
    
    /**
     * Create a PrintOperationClass proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public PrintOperationClass(Addressable address, Ownership ownership) {
        super(address, ownership);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private PrintOperationClass struct;
        
         /**
         * A {@link PrintOperationClass.Build} object constructs a {@link PrintOperationClass} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = PrintOperationClass.allocate();
        }
        
         /**
         * Finish building the {@link PrintOperationClass} struct.
         * @return A new instance of {@code PrintOperationClass} with the fields 
         *         that were set in the Build object.
         */
        public PrintOperationClass construct() {
            return struct;
        }
        
        /**
         * The parent class.
         * @param parentClass The value for the {@code parentClass} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setParentClass(org.gtk.gobject.ObjectClass parentClass) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("parent_class"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (parentClass == null ? MemoryAddress.NULL : parentClass.handle()));
            return this;
        }
        
        public Build setDone(java.lang.foreign.MemoryAddress done) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("done"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (done == null ? MemoryAddress.NULL : done));
            return this;
        }
        
        public Build setBeginPrint(java.lang.foreign.MemoryAddress beginPrint) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("begin_print"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (beginPrint == null ? MemoryAddress.NULL : beginPrint));
            return this;
        }
        
        public Build setPaginate(java.lang.foreign.MemoryAddress paginate) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("paginate"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (paginate == null ? MemoryAddress.NULL : paginate));
            return this;
        }
        
        public Build setRequestPageSetup(java.lang.foreign.MemoryAddress requestPageSetup) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("request_page_setup"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (requestPageSetup == null ? MemoryAddress.NULL : requestPageSetup));
            return this;
        }
        
        public Build setDrawPage(java.lang.foreign.MemoryAddress drawPage) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("draw_page"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (drawPage == null ? MemoryAddress.NULL : drawPage));
            return this;
        }
        
        public Build setEndPrint(java.lang.foreign.MemoryAddress endPrint) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("end_print"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (endPrint == null ? MemoryAddress.NULL : endPrint));
            return this;
        }
        
        public Build setStatusChanged(java.lang.foreign.MemoryAddress statusChanged) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("status_changed"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (statusChanged == null ? MemoryAddress.NULL : statusChanged));
            return this;
        }
        
        public Build setCreateCustomWidget(java.lang.foreign.MemoryAddress createCustomWidget) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("create_custom_widget"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (createCustomWidget == null ? MemoryAddress.NULL : createCustomWidget));
            return this;
        }
        
        public Build setCustomWidgetApply(java.lang.foreign.MemoryAddress customWidgetApply) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("custom_widget_apply"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (customWidgetApply == null ? MemoryAddress.NULL : customWidgetApply));
            return this;
        }
        
        public Build setPreview(java.lang.foreign.MemoryAddress preview) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("preview"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (preview == null ? MemoryAddress.NULL : preview));
            return this;
        }
        
        public Build setUpdateCustomWidget(java.lang.foreign.MemoryAddress updateCustomWidget) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("update_custom_widget"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (updateCustomWidget == null ? MemoryAddress.NULL : updateCustomWidget));
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
