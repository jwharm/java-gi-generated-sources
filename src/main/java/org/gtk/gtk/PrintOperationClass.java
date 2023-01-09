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
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        PrintOperationClass newInstance = new PrintOperationClass(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code parent_class}
     * @return The value of the field {@code parent_class}
     */
    public org.gtk.gobject.ObjectClass getParentClass() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("parent_class"));
        return org.gtk.gobject.ObjectClass.fromAddress.marshal(((MemoryAddress) handle()).addOffset(OFFSET), null);
    }
    
    /**
     * Change the value of the field {@code parent_class}
     * @param parentClass The new value of the field {@code parent_class}
     */
    public void setParentClass(org.gtk.gobject.ObjectClass parentClass) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("parent_class"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (parentClass == null ? MemoryAddress.NULL : parentClass.handle()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code DoneCallback} callback.
     */
    @FunctionalInterface
    public interface DoneCallback {
    
        void run(org.gtk.gtk.PrintOperation operation, org.gtk.gtk.PrintOperationResult result);
        
        @ApiStatus.Internal default void upcall(MemoryAddress operation, int result) {
            run((org.gtk.gtk.PrintOperation) Interop.register(operation, org.gtk.gtk.PrintOperation.fromAddress).marshal(operation, null), org.gtk.gtk.PrintOperationResult.of(result));
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), DoneCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code done}
     * @param done The new value of the field {@code done}
     */
    public void setDone(DoneCallback done) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("done"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (done == null ? MemoryAddress.NULL : done.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code BeginPrintCallback} callback.
     */
    @FunctionalInterface
    public interface BeginPrintCallback {
    
        void run(org.gtk.gtk.PrintOperation operation, org.gtk.gtk.PrintContext context);
        
        @ApiStatus.Internal default void upcall(MemoryAddress operation, MemoryAddress context) {
            run((org.gtk.gtk.PrintOperation) Interop.register(operation, org.gtk.gtk.PrintOperation.fromAddress).marshal(operation, null), (org.gtk.gtk.PrintContext) Interop.register(context, org.gtk.gtk.PrintContext.fromAddress).marshal(context, null));
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), BeginPrintCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code begin_print}
     * @param beginPrint The new value of the field {@code begin_print}
     */
    public void setBeginPrint(BeginPrintCallback beginPrint) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("begin_print"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (beginPrint == null ? MemoryAddress.NULL : beginPrint.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code PaginateCallback} callback.
     */
    @FunctionalInterface
    public interface PaginateCallback {
    
        boolean run(org.gtk.gtk.PrintOperation operation, org.gtk.gtk.PrintContext context);
        
        @ApiStatus.Internal default int upcall(MemoryAddress operation, MemoryAddress context) {
            var RESULT = run((org.gtk.gtk.PrintOperation) Interop.register(operation, org.gtk.gtk.PrintOperation.fromAddress).marshal(operation, null), (org.gtk.gtk.PrintContext) Interop.register(context, org.gtk.gtk.PrintContext.fromAddress).marshal(context, null));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), PaginateCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code paginate}
     * @param paginate The new value of the field {@code paginate}
     */
    public void setPaginate(PaginateCallback paginate) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("paginate"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (paginate == null ? MemoryAddress.NULL : paginate.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code RequestPageSetupCallback} callback.
     */
    @FunctionalInterface
    public interface RequestPageSetupCallback {
    
        void run(org.gtk.gtk.PrintOperation operation, org.gtk.gtk.PrintContext context, int pageNr, org.gtk.gtk.PageSetup setup);
        
        @ApiStatus.Internal default void upcall(MemoryAddress operation, MemoryAddress context, int pageNr, MemoryAddress setup) {
            run((org.gtk.gtk.PrintOperation) Interop.register(operation, org.gtk.gtk.PrintOperation.fromAddress).marshal(operation, null), (org.gtk.gtk.PrintContext) Interop.register(context, org.gtk.gtk.PrintContext.fromAddress).marshal(context, null), pageNr, (org.gtk.gtk.PageSetup) Interop.register(setup, org.gtk.gtk.PageSetup.fromAddress).marshal(setup, null));
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), RequestPageSetupCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code request_page_setup}
     * @param requestPageSetup The new value of the field {@code request_page_setup}
     */
    public void setRequestPageSetup(RequestPageSetupCallback requestPageSetup) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("request_page_setup"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (requestPageSetup == null ? MemoryAddress.NULL : requestPageSetup.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code DrawPageCallback} callback.
     */
    @FunctionalInterface
    public interface DrawPageCallback {
    
        void run(org.gtk.gtk.PrintOperation operation, org.gtk.gtk.PrintContext context, int pageNr);
        
        @ApiStatus.Internal default void upcall(MemoryAddress operation, MemoryAddress context, int pageNr) {
            run((org.gtk.gtk.PrintOperation) Interop.register(operation, org.gtk.gtk.PrintOperation.fromAddress).marshal(operation, null), (org.gtk.gtk.PrintContext) Interop.register(context, org.gtk.gtk.PrintContext.fromAddress).marshal(context, null), pageNr);
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), DrawPageCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code draw_page}
     * @param drawPage The new value of the field {@code draw_page}
     */
    public void setDrawPage(DrawPageCallback drawPage) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("draw_page"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (drawPage == null ? MemoryAddress.NULL : drawPage.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code EndPrintCallback} callback.
     */
    @FunctionalInterface
    public interface EndPrintCallback {
    
        void run(org.gtk.gtk.PrintOperation operation, org.gtk.gtk.PrintContext context);
        
        @ApiStatus.Internal default void upcall(MemoryAddress operation, MemoryAddress context) {
            run((org.gtk.gtk.PrintOperation) Interop.register(operation, org.gtk.gtk.PrintOperation.fromAddress).marshal(operation, null), (org.gtk.gtk.PrintContext) Interop.register(context, org.gtk.gtk.PrintContext.fromAddress).marshal(context, null));
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), EndPrintCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code end_print}
     * @param endPrint The new value of the field {@code end_print}
     */
    public void setEndPrint(EndPrintCallback endPrint) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("end_print"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (endPrint == null ? MemoryAddress.NULL : endPrint.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code StatusChangedCallback} callback.
     */
    @FunctionalInterface
    public interface StatusChangedCallback {
    
        void run(org.gtk.gtk.PrintOperation operation);
        
        @ApiStatus.Internal default void upcall(MemoryAddress operation) {
            run((org.gtk.gtk.PrintOperation) Interop.register(operation, org.gtk.gtk.PrintOperation.fromAddress).marshal(operation, null));
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), StatusChangedCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code status_changed}
     * @param statusChanged The new value of the field {@code status_changed}
     */
    public void setStatusChanged(StatusChangedCallback statusChanged) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("status_changed"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (statusChanged == null ? MemoryAddress.NULL : statusChanged.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code CreateCustomWidgetCallback} callback.
     */
    @FunctionalInterface
    public interface CreateCustomWidgetCallback {
    
        org.gtk.gtk.Widget run(org.gtk.gtk.PrintOperation operation);
        
        @ApiStatus.Internal default Addressable upcall(MemoryAddress operation) {
            var RESULT = run((org.gtk.gtk.PrintOperation) Interop.register(operation, org.gtk.gtk.PrintOperation.fromAddress).marshal(operation, null));
            return RESULT == null ? MemoryAddress.NULL.address() : (RESULT.handle()).address();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), CreateCustomWidgetCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code create_custom_widget}
     * @param createCustomWidget The new value of the field {@code create_custom_widget}
     */
    public void setCreateCustomWidget(CreateCustomWidgetCallback createCustomWidget) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("create_custom_widget"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (createCustomWidget == null ? MemoryAddress.NULL : createCustomWidget.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code CustomWidgetApplyCallback} callback.
     */
    @FunctionalInterface
    public interface CustomWidgetApplyCallback {
    
        void run(org.gtk.gtk.PrintOperation operation, org.gtk.gtk.Widget widget);
        
        @ApiStatus.Internal default void upcall(MemoryAddress operation, MemoryAddress widget) {
            run((org.gtk.gtk.PrintOperation) Interop.register(operation, org.gtk.gtk.PrintOperation.fromAddress).marshal(operation, null), (org.gtk.gtk.Widget) Interop.register(widget, org.gtk.gtk.Widget.fromAddress).marshal(widget, null));
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), CustomWidgetApplyCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code custom_widget_apply}
     * @param customWidgetApply The new value of the field {@code custom_widget_apply}
     */
    public void setCustomWidgetApply(CustomWidgetApplyCallback customWidgetApply) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("custom_widget_apply"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (customWidgetApply == null ? MemoryAddress.NULL : customWidgetApply.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code PreviewCallback} callback.
     */
    @FunctionalInterface
    public interface PreviewCallback {
    
        boolean run(org.gtk.gtk.PrintOperation operation, org.gtk.gtk.PrintOperationPreview preview, org.gtk.gtk.PrintContext context, org.gtk.gtk.Window parent);
        
        @ApiStatus.Internal default int upcall(MemoryAddress operation, MemoryAddress preview, MemoryAddress context, MemoryAddress parent) {
            var RESULT = run((org.gtk.gtk.PrintOperation) Interop.register(operation, org.gtk.gtk.PrintOperation.fromAddress).marshal(operation, null), (org.gtk.gtk.PrintOperationPreview) Interop.register(preview, org.gtk.gtk.PrintOperationPreview.fromAddress).marshal(preview, null), (org.gtk.gtk.PrintContext) Interop.register(context, org.gtk.gtk.PrintContext.fromAddress).marshal(context, null), (org.gtk.gtk.Window) Interop.register(parent, org.gtk.gtk.Window.fromAddress).marshal(parent, null));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), PreviewCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code preview}
     * @param preview The new value of the field {@code preview}
     */
    public void setPreview(PreviewCallback preview) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("preview"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (preview == null ? MemoryAddress.NULL : preview.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code UpdateCustomWidgetCallback} callback.
     */
    @FunctionalInterface
    public interface UpdateCustomWidgetCallback {
    
        void run(org.gtk.gtk.PrintOperation operation, org.gtk.gtk.Widget widget, org.gtk.gtk.PageSetup setup, org.gtk.gtk.PrintSettings settings);
        
        @ApiStatus.Internal default void upcall(MemoryAddress operation, MemoryAddress widget, MemoryAddress setup, MemoryAddress settings) {
            run((org.gtk.gtk.PrintOperation) Interop.register(operation, org.gtk.gtk.PrintOperation.fromAddress).marshal(operation, null), (org.gtk.gtk.Widget) Interop.register(widget, org.gtk.gtk.Widget.fromAddress).marshal(widget, null), (org.gtk.gtk.PageSetup) Interop.register(setup, org.gtk.gtk.PageSetup.fromAddress).marshal(setup, null), (org.gtk.gtk.PrintSettings) Interop.register(settings, org.gtk.gtk.PrintSettings.fromAddress).marshal(settings, null));
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), UpdateCustomWidgetCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code update_custom_widget}
     * @param updateCustomWidget The new value of the field {@code update_custom_widget}
     */
    public void setUpdateCustomWidget(UpdateCustomWidgetCallback updateCustomWidget) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("update_custom_widget"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (updateCustomWidget == null ? MemoryAddress.NULL : updateCustomWidget.toCallback()));
        }
    }
    
    /**
     * Create a PrintOperationClass proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected PrintOperationClass(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, PrintOperationClass> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new PrintOperationClass(input);
    
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
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("parent_class"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (parentClass == null ? MemoryAddress.NULL : parentClass.handle()));
                return this;
            }
        }
        
        public Builder setDone(DoneCallback done) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("done"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (done == null ? MemoryAddress.NULL : done.toCallback()));
                return this;
            }
        }
        
        public Builder setBeginPrint(BeginPrintCallback beginPrint) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("begin_print"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (beginPrint == null ? MemoryAddress.NULL : beginPrint.toCallback()));
                return this;
            }
        }
        
        public Builder setPaginate(PaginateCallback paginate) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("paginate"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (paginate == null ? MemoryAddress.NULL : paginate.toCallback()));
                return this;
            }
        }
        
        public Builder setRequestPageSetup(RequestPageSetupCallback requestPageSetup) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("request_page_setup"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (requestPageSetup == null ? MemoryAddress.NULL : requestPageSetup.toCallback()));
                return this;
            }
        }
        
        public Builder setDrawPage(DrawPageCallback drawPage) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("draw_page"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (drawPage == null ? MemoryAddress.NULL : drawPage.toCallback()));
                return this;
            }
        }
        
        public Builder setEndPrint(EndPrintCallback endPrint) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("end_print"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (endPrint == null ? MemoryAddress.NULL : endPrint.toCallback()));
                return this;
            }
        }
        
        public Builder setStatusChanged(StatusChangedCallback statusChanged) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("status_changed"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (statusChanged == null ? MemoryAddress.NULL : statusChanged.toCallback()));
                return this;
            }
        }
        
        public Builder setCreateCustomWidget(CreateCustomWidgetCallback createCustomWidget) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("create_custom_widget"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (createCustomWidget == null ? MemoryAddress.NULL : createCustomWidget.toCallback()));
                return this;
            }
        }
        
        public Builder setCustomWidgetApply(CustomWidgetApplyCallback customWidgetApply) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("custom_widget_apply"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (customWidgetApply == null ? MemoryAddress.NULL : customWidgetApply.toCallback()));
                return this;
            }
        }
        
        public Builder setPreview(PreviewCallback preview) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("preview"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (preview == null ? MemoryAddress.NULL : preview.toCallback()));
                return this;
            }
        }
        
        public Builder setUpdateCustomWidget(UpdateCustomWidgetCallback updateCustomWidget) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("update_custom_widget"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (updateCustomWidget == null ? MemoryAddress.NULL : updateCustomWidget.toCallback()));
                return this;
            }
        }
        
        public Builder setPadding(java.lang.foreign.MemoryAddress[] padding) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("padding"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (padding == null ? MemoryAddress.NULL : Interop.allocateNativeArray(padding, false, SCOPE)));
                return this;
            }
        }
    }
}
