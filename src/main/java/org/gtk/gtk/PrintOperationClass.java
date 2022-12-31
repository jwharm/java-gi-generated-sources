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
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
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
    public org.gtk.gobject.ObjectClass getParentClass() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("parent_class"));
        return org.gtk.gobject.ObjectClass.fromAddress.marshal(((MemoryAddress) handle()).addOffset(OFFSET), Ownership.UNKNOWN);
    }
    
    /**
     * Change the value of the field {@code parent_class}
     * @param parentClass The new value of the field {@code parent_class}
     */
    public void setParentClass(org.gtk.gobject.ObjectClass parentClass) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("parent_class"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (parentClass == null ? MemoryAddress.NULL : parentClass.handle()));
    }
    
    @FunctionalInterface
    public interface DoneCallback {
        void run(org.gtk.gtk.PrintOperation operation, org.gtk.gtk.PrintOperationResult result);

        @ApiStatus.Internal default void upcall(MemoryAddress operation, int result) {
            run((org.gtk.gtk.PrintOperation) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(operation)), org.gtk.gtk.PrintOperation.fromAddress).marshal(operation, Ownership.NONE), org.gtk.gtk.PrintOperationResult.of(result));
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(DoneCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code done}
     * @param done The new value of the field {@code done}
     */
    public void setDone(DoneCallback done) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("done"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (done == null ? MemoryAddress.NULL : done.toCallback()));
    }
    
    @FunctionalInterface
    public interface BeginPrintCallback {
        void run(org.gtk.gtk.PrintOperation operation, org.gtk.gtk.PrintContext context);

        @ApiStatus.Internal default void upcall(MemoryAddress operation, MemoryAddress context) {
            run((org.gtk.gtk.PrintOperation) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(operation)), org.gtk.gtk.PrintOperation.fromAddress).marshal(operation, Ownership.NONE), (org.gtk.gtk.PrintContext) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(context)), org.gtk.gtk.PrintContext.fromAddress).marshal(context, Ownership.NONE));
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(BeginPrintCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code begin_print}
     * @param beginPrint The new value of the field {@code begin_print}
     */
    public void setBeginPrint(BeginPrintCallback beginPrint) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("begin_print"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (beginPrint == null ? MemoryAddress.NULL : beginPrint.toCallback()));
    }
    
    @FunctionalInterface
    public interface PaginateCallback {
        boolean run(org.gtk.gtk.PrintOperation operation, org.gtk.gtk.PrintContext context);

        @ApiStatus.Internal default int upcall(MemoryAddress operation, MemoryAddress context) {
            var RESULT = run((org.gtk.gtk.PrintOperation) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(operation)), org.gtk.gtk.PrintOperation.fromAddress).marshal(operation, Ownership.NONE), (org.gtk.gtk.PrintContext) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(context)), org.gtk.gtk.PrintContext.fromAddress).marshal(context, Ownership.NONE));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(PaginateCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code paginate}
     * @param paginate The new value of the field {@code paginate}
     */
    public void setPaginate(PaginateCallback paginate) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("paginate"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (paginate == null ? MemoryAddress.NULL : paginate.toCallback()));
    }
    
    @FunctionalInterface
    public interface RequestPageSetupCallback {
        void run(org.gtk.gtk.PrintOperation operation, org.gtk.gtk.PrintContext context, int pageNr, org.gtk.gtk.PageSetup setup);

        @ApiStatus.Internal default void upcall(MemoryAddress operation, MemoryAddress context, int pageNr, MemoryAddress setup) {
            run((org.gtk.gtk.PrintOperation) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(operation)), org.gtk.gtk.PrintOperation.fromAddress).marshal(operation, Ownership.NONE), (org.gtk.gtk.PrintContext) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(context)), org.gtk.gtk.PrintContext.fromAddress).marshal(context, Ownership.NONE), pageNr, (org.gtk.gtk.PageSetup) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(setup)), org.gtk.gtk.PageSetup.fromAddress).marshal(setup, Ownership.NONE));
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(RequestPageSetupCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code request_page_setup}
     * @param requestPageSetup The new value of the field {@code request_page_setup}
     */
    public void setRequestPageSetup(RequestPageSetupCallback requestPageSetup) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("request_page_setup"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (requestPageSetup == null ? MemoryAddress.NULL : requestPageSetup.toCallback()));
    }
    
    @FunctionalInterface
    public interface DrawPageCallback {
        void run(org.gtk.gtk.PrintOperation operation, org.gtk.gtk.PrintContext context, int pageNr);

        @ApiStatus.Internal default void upcall(MemoryAddress operation, MemoryAddress context, int pageNr) {
            run((org.gtk.gtk.PrintOperation) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(operation)), org.gtk.gtk.PrintOperation.fromAddress).marshal(operation, Ownership.NONE), (org.gtk.gtk.PrintContext) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(context)), org.gtk.gtk.PrintContext.fromAddress).marshal(context, Ownership.NONE), pageNr);
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(DrawPageCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code draw_page}
     * @param drawPage The new value of the field {@code draw_page}
     */
    public void setDrawPage(DrawPageCallback drawPage) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("draw_page"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (drawPage == null ? MemoryAddress.NULL : drawPage.toCallback()));
    }
    
    @FunctionalInterface
    public interface EndPrintCallback {
        void run(org.gtk.gtk.PrintOperation operation, org.gtk.gtk.PrintContext context);

        @ApiStatus.Internal default void upcall(MemoryAddress operation, MemoryAddress context) {
            run((org.gtk.gtk.PrintOperation) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(operation)), org.gtk.gtk.PrintOperation.fromAddress).marshal(operation, Ownership.NONE), (org.gtk.gtk.PrintContext) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(context)), org.gtk.gtk.PrintContext.fromAddress).marshal(context, Ownership.NONE));
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(EndPrintCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code end_print}
     * @param endPrint The new value of the field {@code end_print}
     */
    public void setEndPrint(EndPrintCallback endPrint) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("end_print"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (endPrint == null ? MemoryAddress.NULL : endPrint.toCallback()));
    }
    
    @FunctionalInterface
    public interface StatusChangedCallback {
        void run(org.gtk.gtk.PrintOperation operation);

        @ApiStatus.Internal default void upcall(MemoryAddress operation) {
            run((org.gtk.gtk.PrintOperation) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(operation)), org.gtk.gtk.PrintOperation.fromAddress).marshal(operation, Ownership.NONE));
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(StatusChangedCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code status_changed}
     * @param statusChanged The new value of the field {@code status_changed}
     */
    public void setStatusChanged(StatusChangedCallback statusChanged) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("status_changed"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (statusChanged == null ? MemoryAddress.NULL : statusChanged.toCallback()));
    }
    
    @FunctionalInterface
    public interface CreateCustomWidgetCallback {
        org.gtk.gtk.Widget run(org.gtk.gtk.PrintOperation operation);

        @ApiStatus.Internal default Addressable upcall(MemoryAddress operation) {
            var RESULT = run((org.gtk.gtk.PrintOperation) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(operation)), org.gtk.gtk.PrintOperation.fromAddress).marshal(operation, Ownership.NONE));
            return RESULT == null ? MemoryAddress.NULL.address() : (RESULT.handle()).address();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(CreateCustomWidgetCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code create_custom_widget}
     * @param createCustomWidget The new value of the field {@code create_custom_widget}
     */
    public void setCreateCustomWidget(CreateCustomWidgetCallback createCustomWidget) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("create_custom_widget"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (createCustomWidget == null ? MemoryAddress.NULL : createCustomWidget.toCallback()));
    }
    
    @FunctionalInterface
    public interface CustomWidgetApplyCallback {
        void run(org.gtk.gtk.PrintOperation operation, org.gtk.gtk.Widget widget);

        @ApiStatus.Internal default void upcall(MemoryAddress operation, MemoryAddress widget) {
            run((org.gtk.gtk.PrintOperation) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(operation)), org.gtk.gtk.PrintOperation.fromAddress).marshal(operation, Ownership.NONE), (org.gtk.gtk.Widget) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(widget)), org.gtk.gtk.Widget.fromAddress).marshal(widget, Ownership.NONE));
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(CustomWidgetApplyCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code custom_widget_apply}
     * @param customWidgetApply The new value of the field {@code custom_widget_apply}
     */
    public void setCustomWidgetApply(CustomWidgetApplyCallback customWidgetApply) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("custom_widget_apply"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (customWidgetApply == null ? MemoryAddress.NULL : customWidgetApply.toCallback()));
    }
    
    @FunctionalInterface
    public interface PreviewCallback {
        boolean run(org.gtk.gtk.PrintOperation operation, org.gtk.gtk.PrintOperationPreview preview, org.gtk.gtk.PrintContext context, org.gtk.gtk.Window parent);

        @ApiStatus.Internal default int upcall(MemoryAddress operation, MemoryAddress preview, MemoryAddress context, MemoryAddress parent) {
            var RESULT = run((org.gtk.gtk.PrintOperation) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(operation)), org.gtk.gtk.PrintOperation.fromAddress).marshal(operation, Ownership.NONE), (org.gtk.gtk.PrintOperationPreview) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(preview)), org.gtk.gtk.PrintOperationPreview.fromAddress).marshal(preview, Ownership.NONE), (org.gtk.gtk.PrintContext) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(context)), org.gtk.gtk.PrintContext.fromAddress).marshal(context, Ownership.NONE), (org.gtk.gtk.Window) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(parent)), org.gtk.gtk.Window.fromAddress).marshal(parent, Ownership.NONE));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(PreviewCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code preview}
     * @param preview The new value of the field {@code preview}
     */
    public void setPreview(PreviewCallback preview) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("preview"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (preview == null ? MemoryAddress.NULL : preview.toCallback()));
    }
    
    @FunctionalInterface
    public interface UpdateCustomWidgetCallback {
        void run(org.gtk.gtk.PrintOperation operation, org.gtk.gtk.Widget widget, org.gtk.gtk.PageSetup setup, org.gtk.gtk.PrintSettings settings);

        @ApiStatus.Internal default void upcall(MemoryAddress operation, MemoryAddress widget, MemoryAddress setup, MemoryAddress settings) {
            run((org.gtk.gtk.PrintOperation) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(operation)), org.gtk.gtk.PrintOperation.fromAddress).marshal(operation, Ownership.NONE), (org.gtk.gtk.Widget) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(widget)), org.gtk.gtk.Widget.fromAddress).marshal(widget, Ownership.NONE), (org.gtk.gtk.PageSetup) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(setup)), org.gtk.gtk.PageSetup.fromAddress).marshal(setup, Ownership.NONE), (org.gtk.gtk.PrintSettings) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(settings)), org.gtk.gtk.PrintSettings.fromAddress).marshal(settings, Ownership.NONE));
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(UpdateCustomWidgetCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code update_custom_widget}
     * @param updateCustomWidget The new value of the field {@code update_custom_widget}
     */
    public void setUpdateCustomWidget(UpdateCustomWidgetCallback updateCustomWidget) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("update_custom_widget"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (updateCustomWidget == null ? MemoryAddress.NULL : updateCustomWidget.toCallback()));
    }
    
    /**
     * Create a PrintOperationClass proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected PrintOperationClass(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, PrintOperationClass> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new PrintOperationClass(input, ownership);
    
    /**
     * A {@link PrintOperationClass.Builder} object constructs a {@link PrintOperationClass} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link PrintOperationClass.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final PrintOperationClass struct;
        
        private Builder() {
            struct = PrintOperationClass.allocate();
        }
        
         /**
         * Finish building the {@link PrintOperationClass} struct.
         * @return A new instance of {@code PrintOperationClass} with the fields 
         *         that were set in the Builder object.
         */
        public PrintOperationClass build() {
            return struct;
        }
        
        /**
         * The parent class.
         * @param parentClass The value for the {@code parentClass} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setParentClass(org.gtk.gobject.ObjectClass parentClass) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("parent_class"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (parentClass == null ? MemoryAddress.NULL : parentClass.handle()));
            return this;
        }
        
        public Builder setDone(DoneCallback done) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("done"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (done == null ? MemoryAddress.NULL : done.toCallback()));
            return this;
        }
        
        public Builder setBeginPrint(BeginPrintCallback beginPrint) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("begin_print"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (beginPrint == null ? MemoryAddress.NULL : beginPrint.toCallback()));
            return this;
        }
        
        public Builder setPaginate(PaginateCallback paginate) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("paginate"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (paginate == null ? MemoryAddress.NULL : paginate.toCallback()));
            return this;
        }
        
        public Builder setRequestPageSetup(RequestPageSetupCallback requestPageSetup) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("request_page_setup"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (requestPageSetup == null ? MemoryAddress.NULL : requestPageSetup.toCallback()));
            return this;
        }
        
        public Builder setDrawPage(DrawPageCallback drawPage) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("draw_page"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (drawPage == null ? MemoryAddress.NULL : drawPage.toCallback()));
            return this;
        }
        
        public Builder setEndPrint(EndPrintCallback endPrint) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("end_print"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (endPrint == null ? MemoryAddress.NULL : endPrint.toCallback()));
            return this;
        }
        
        public Builder setStatusChanged(StatusChangedCallback statusChanged) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("status_changed"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (statusChanged == null ? MemoryAddress.NULL : statusChanged.toCallback()));
            return this;
        }
        
        public Builder setCreateCustomWidget(CreateCustomWidgetCallback createCustomWidget) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("create_custom_widget"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (createCustomWidget == null ? MemoryAddress.NULL : createCustomWidget.toCallback()));
            return this;
        }
        
        public Builder setCustomWidgetApply(CustomWidgetApplyCallback customWidgetApply) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("custom_widget_apply"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (customWidgetApply == null ? MemoryAddress.NULL : customWidgetApply.toCallback()));
            return this;
        }
        
        public Builder setPreview(PreviewCallback preview) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("preview"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (preview == null ? MemoryAddress.NULL : preview.toCallback()));
            return this;
        }
        
        public Builder setUpdateCustomWidget(UpdateCustomWidgetCallback updateCustomWidget) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("update_custom_widget"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (updateCustomWidget == null ? MemoryAddress.NULL : updateCustomWidget.toCallback()));
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
