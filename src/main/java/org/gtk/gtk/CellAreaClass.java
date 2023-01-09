package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class CellAreaClass extends Struct {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkCellAreaClass";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gtk.gobject.InitiallyUnownedClass.getMemoryLayout().withName("parent_class"),
            Interop.valueLayout.ADDRESS.withName("add"),
            Interop.valueLayout.ADDRESS.withName("remove"),
            Interop.valueLayout.ADDRESS.withName("foreach"),
            Interop.valueLayout.ADDRESS.withName("foreach_alloc"),
            Interop.valueLayout.ADDRESS.withName("event"),
            Interop.valueLayout.ADDRESS.withName("snapshot"),
            Interop.valueLayout.ADDRESS.withName("apply_attributes"),
            Interop.valueLayout.ADDRESS.withName("create_context"),
            Interop.valueLayout.ADDRESS.withName("copy_context"),
            Interop.valueLayout.ADDRESS.withName("get_request_mode"),
            Interop.valueLayout.ADDRESS.withName("get_preferred_width"),
            Interop.valueLayout.ADDRESS.withName("get_preferred_height_for_width"),
            Interop.valueLayout.ADDRESS.withName("get_preferred_height"),
            Interop.valueLayout.ADDRESS.withName("get_preferred_width_for_height"),
            Interop.valueLayout.ADDRESS.withName("set_cell_property"),
            Interop.valueLayout.ADDRESS.withName("get_cell_property"),
            Interop.valueLayout.ADDRESS.withName("focus"),
            Interop.valueLayout.ADDRESS.withName("is_activatable"),
            Interop.valueLayout.ADDRESS.withName("activate"),
            MemoryLayout.sequenceLayout(8, Interop.valueLayout.ADDRESS).withName("padding")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link CellAreaClass}
     * @return A new, uninitialized @{link CellAreaClass}
     */
    public static CellAreaClass allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        CellAreaClass newInstance = new CellAreaClass(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Functional interface declaration of the {@code AddCallback} callback.
     */
    @FunctionalInterface
    public interface AddCallback {
    
        void run(org.gtk.gtk.CellArea area, org.gtk.gtk.CellRenderer renderer);
        
        @ApiStatus.Internal default void upcall(MemoryAddress area, MemoryAddress renderer) {
            run((org.gtk.gtk.CellArea) Interop.register(area, org.gtk.gtk.CellArea.fromAddress).marshal(area, null), (org.gtk.gtk.CellRenderer) Interop.register(renderer, org.gtk.gtk.CellRenderer.fromAddress).marshal(renderer, null));
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), AddCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code add}
     * @param add The new value of the field {@code add}
     */
    public void setAdd(AddCallback add) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("add"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (add == null ? MemoryAddress.NULL : add.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code RemoveCallback} callback.
     */
    @FunctionalInterface
    public interface RemoveCallback {
    
        void run(org.gtk.gtk.CellArea area, org.gtk.gtk.CellRenderer renderer);
        
        @ApiStatus.Internal default void upcall(MemoryAddress area, MemoryAddress renderer) {
            run((org.gtk.gtk.CellArea) Interop.register(area, org.gtk.gtk.CellArea.fromAddress).marshal(area, null), (org.gtk.gtk.CellRenderer) Interop.register(renderer, org.gtk.gtk.CellRenderer.fromAddress).marshal(renderer, null));
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), RemoveCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code remove}
     * @param remove The new value of the field {@code remove}
     */
    public void setRemove(RemoveCallback remove) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("remove"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (remove == null ? MemoryAddress.NULL : remove.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code ForeachCallback} callback.
     */
    @FunctionalInterface
    public interface ForeachCallback {
    
        void run(org.gtk.gtk.CellArea area, org.gtk.gtk.CellCallback callback);
        
        @ApiStatus.Internal default void upcall(MemoryAddress area, MemoryAddress callback, MemoryAddress callbackData) {
            run((org.gtk.gtk.CellArea) Interop.register(area, org.gtk.gtk.CellArea.fromAddress).marshal(area, null), null /* Unsupported parameter type */);
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), ForeachCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code foreach}
     * @param foreach The new value of the field {@code foreach}
     */
    public void setForeach(ForeachCallback foreach) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("foreach"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (foreach == null ? MemoryAddress.NULL : foreach.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code ForeachAllocCallback} callback.
     */
    @FunctionalInterface
    public interface ForeachAllocCallback {
    
        void run(org.gtk.gtk.CellArea area, org.gtk.gtk.CellAreaContext context, org.gtk.gtk.Widget widget, org.gtk.gdk.Rectangle cellArea, org.gtk.gdk.Rectangle backgroundArea, org.gtk.gtk.CellAllocCallback callback);
        
        @ApiStatus.Internal default void upcall(MemoryAddress area, MemoryAddress context, MemoryAddress widget, MemoryAddress cellArea, MemoryAddress backgroundArea, MemoryAddress callback, MemoryAddress callbackData) {
            run((org.gtk.gtk.CellArea) Interop.register(area, org.gtk.gtk.CellArea.fromAddress).marshal(area, null), (org.gtk.gtk.CellAreaContext) Interop.register(context, org.gtk.gtk.CellAreaContext.fromAddress).marshal(context, null), (org.gtk.gtk.Widget) Interop.register(widget, org.gtk.gtk.Widget.fromAddress).marshal(widget, null), org.gtk.gdk.Rectangle.fromAddress.marshal(cellArea, null), org.gtk.gdk.Rectangle.fromAddress.marshal(backgroundArea, null), null /* Unsupported parameter type */);
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), ForeachAllocCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code foreach_alloc}
     * @param foreachAlloc The new value of the field {@code foreach_alloc}
     */
    public void setForeachAlloc(ForeachAllocCallback foreachAlloc) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("foreach_alloc"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (foreachAlloc == null ? MemoryAddress.NULL : foreachAlloc.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code EventCallback} callback.
     */
    @FunctionalInterface
    public interface EventCallback {
    
        int run(org.gtk.gtk.CellArea area, org.gtk.gtk.CellAreaContext context, org.gtk.gtk.Widget widget, org.gtk.gdk.Event event, org.gtk.gdk.Rectangle cellArea, org.gtk.gtk.CellRendererState flags);
        
        @ApiStatus.Internal default int upcall(MemoryAddress area, MemoryAddress context, MemoryAddress widget, MemoryAddress event, MemoryAddress cellArea, int flags) {
            var RESULT = run((org.gtk.gtk.CellArea) Interop.register(area, org.gtk.gtk.CellArea.fromAddress).marshal(area, null), (org.gtk.gtk.CellAreaContext) Interop.register(context, org.gtk.gtk.CellAreaContext.fromAddress).marshal(context, null), (org.gtk.gtk.Widget) Interop.register(widget, org.gtk.gtk.Widget.fromAddress).marshal(widget, null), (org.gtk.gdk.Event) Interop.register(event, org.gtk.gdk.Event.fromAddress).marshal(event, null), org.gtk.gdk.Rectangle.fromAddress.marshal(cellArea, null), new org.gtk.gtk.CellRendererState(flags));
            return RESULT;
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), EventCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code event}
     * @param event The new value of the field {@code event}
     */
    public void setEvent(EventCallback event) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("event"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (event == null ? MemoryAddress.NULL : event.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code SnapshotCallback} callback.
     */
    @FunctionalInterface
    public interface SnapshotCallback {
    
        void run(org.gtk.gtk.CellArea area, org.gtk.gtk.CellAreaContext context, org.gtk.gtk.Widget widget, org.gtk.gtk.Snapshot snapshot, org.gtk.gdk.Rectangle backgroundArea, org.gtk.gdk.Rectangle cellArea, org.gtk.gtk.CellRendererState flags, boolean paintFocus);
        
        @ApiStatus.Internal default void upcall(MemoryAddress area, MemoryAddress context, MemoryAddress widget, MemoryAddress snapshot, MemoryAddress backgroundArea, MemoryAddress cellArea, int flags, int paintFocus) {
            run((org.gtk.gtk.CellArea) Interop.register(area, org.gtk.gtk.CellArea.fromAddress).marshal(area, null), (org.gtk.gtk.CellAreaContext) Interop.register(context, org.gtk.gtk.CellAreaContext.fromAddress).marshal(context, null), (org.gtk.gtk.Widget) Interop.register(widget, org.gtk.gtk.Widget.fromAddress).marshal(widget, null), (org.gtk.gtk.Snapshot) Interop.register(snapshot, org.gtk.gtk.Snapshot.fromAddress).marshal(snapshot, null), org.gtk.gdk.Rectangle.fromAddress.marshal(backgroundArea, null), org.gtk.gdk.Rectangle.fromAddress.marshal(cellArea, null), new org.gtk.gtk.CellRendererState(flags), Marshal.integerToBoolean.marshal(paintFocus, null).booleanValue());
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), SnapshotCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code snapshot}
     * @param snapshot The new value of the field {@code snapshot}
     */
    public void setSnapshot(SnapshotCallback snapshot) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("snapshot"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (snapshot == null ? MemoryAddress.NULL : snapshot.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code ApplyAttributesCallback} callback.
     */
    @FunctionalInterface
    public interface ApplyAttributesCallback {
    
        void run(org.gtk.gtk.CellArea area, org.gtk.gtk.TreeModel treeModel, org.gtk.gtk.TreeIter iter, boolean isExpander, boolean isExpanded);
        
        @ApiStatus.Internal default void upcall(MemoryAddress area, MemoryAddress treeModel, MemoryAddress iter, int isExpander, int isExpanded) {
            run((org.gtk.gtk.CellArea) Interop.register(area, org.gtk.gtk.CellArea.fromAddress).marshal(area, null), (org.gtk.gtk.TreeModel) Interop.register(treeModel, org.gtk.gtk.TreeModel.fromAddress).marshal(treeModel, null), org.gtk.gtk.TreeIter.fromAddress.marshal(iter, null), Marshal.integerToBoolean.marshal(isExpander, null).booleanValue(), Marshal.integerToBoolean.marshal(isExpanded, null).booleanValue());
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), ApplyAttributesCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code apply_attributes}
     * @param applyAttributes The new value of the field {@code apply_attributes}
     */
    public void setApplyAttributes(ApplyAttributesCallback applyAttributes) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("apply_attributes"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (applyAttributes == null ? MemoryAddress.NULL : applyAttributes.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code CreateContextCallback} callback.
     */
    @FunctionalInterface
    public interface CreateContextCallback {
    
        org.gtk.gtk.CellAreaContext run(org.gtk.gtk.CellArea area);
        
        @ApiStatus.Internal default Addressable upcall(MemoryAddress area) {
            var RESULT = run((org.gtk.gtk.CellArea) Interop.register(area, org.gtk.gtk.CellArea.fromAddress).marshal(area, null));
            RESULT.yieldOwnership();
            return RESULT == null ? MemoryAddress.NULL.address() : (RESULT.handle()).address();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), CreateContextCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code create_context}
     * @param createContext The new value of the field {@code create_context}
     */
    public void setCreateContext(CreateContextCallback createContext) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("create_context"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (createContext == null ? MemoryAddress.NULL : createContext.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code CopyContextCallback} callback.
     */
    @FunctionalInterface
    public interface CopyContextCallback {
    
        org.gtk.gtk.CellAreaContext run(org.gtk.gtk.CellArea area, org.gtk.gtk.CellAreaContext context);
        
        @ApiStatus.Internal default Addressable upcall(MemoryAddress area, MemoryAddress context) {
            var RESULT = run((org.gtk.gtk.CellArea) Interop.register(area, org.gtk.gtk.CellArea.fromAddress).marshal(area, null), (org.gtk.gtk.CellAreaContext) Interop.register(context, org.gtk.gtk.CellAreaContext.fromAddress).marshal(context, null));
            RESULT.yieldOwnership();
            return RESULT == null ? MemoryAddress.NULL.address() : (RESULT.handle()).address();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), CopyContextCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code copy_context}
     * @param copyContext The new value of the field {@code copy_context}
     */
    public void setCopyContext(CopyContextCallback copyContext) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("copy_context"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (copyContext == null ? MemoryAddress.NULL : copyContext.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code GetRequestModeCallback} callback.
     */
    @FunctionalInterface
    public interface GetRequestModeCallback {
    
        org.gtk.gtk.SizeRequestMode run(org.gtk.gtk.CellArea area);
        
        @ApiStatus.Internal default int upcall(MemoryAddress area) {
            var RESULT = run((org.gtk.gtk.CellArea) Interop.register(area, org.gtk.gtk.CellArea.fromAddress).marshal(area, null));
            return RESULT.getValue();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), GetRequestModeCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code get_request_mode}
     * @param getRequestMode The new value of the field {@code get_request_mode}
     */
    public void setGetRequestMode(GetRequestModeCallback getRequestMode) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_request_mode"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (getRequestMode == null ? MemoryAddress.NULL : getRequestMode.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code GetPreferredWidthCallback} callback.
     */
    @FunctionalInterface
    public interface GetPreferredWidthCallback {
    
        void run(org.gtk.gtk.CellArea area, org.gtk.gtk.CellAreaContext context, org.gtk.gtk.Widget widget, Out<Integer> minimumWidth, Out<Integer> naturalWidth);
        
        @ApiStatus.Internal default void upcall(MemoryAddress area, MemoryAddress context, MemoryAddress widget, MemoryAddress minimumWidth, MemoryAddress naturalWidth) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                Out<Integer> minimumWidthOUT = new Out<>(minimumWidth.get(Interop.valueLayout.C_INT, 0));
                Out<Integer> naturalWidthOUT = new Out<>(naturalWidth.get(Interop.valueLayout.C_INT, 0));
                run((org.gtk.gtk.CellArea) Interop.register(area, org.gtk.gtk.CellArea.fromAddress).marshal(area, null), (org.gtk.gtk.CellAreaContext) Interop.register(context, org.gtk.gtk.CellAreaContext.fromAddress).marshal(context, null), (org.gtk.gtk.Widget) Interop.register(widget, org.gtk.gtk.Widget.fromAddress).marshal(widget, null), minimumWidthOUT, naturalWidthOUT);
                minimumWidth.set(Interop.valueLayout.C_INT, 0, minimumWidthOUT.get());
                naturalWidth.set(Interop.valueLayout.C_INT, 0, naturalWidthOUT.get());
            }
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), GetPreferredWidthCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code get_preferred_width}
     * @param getPreferredWidth The new value of the field {@code get_preferred_width}
     */
    public void setGetPreferredWidth(GetPreferredWidthCallback getPreferredWidth) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_preferred_width"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (getPreferredWidth == null ? MemoryAddress.NULL : getPreferredWidth.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code GetPreferredHeightForWidthCallback} callback.
     */
    @FunctionalInterface
    public interface GetPreferredHeightForWidthCallback {
    
        void run(org.gtk.gtk.CellArea area, org.gtk.gtk.CellAreaContext context, org.gtk.gtk.Widget widget, int width, Out<Integer> minimumHeight, Out<Integer> naturalHeight);
        
        @ApiStatus.Internal default void upcall(MemoryAddress area, MemoryAddress context, MemoryAddress widget, int width, MemoryAddress minimumHeight, MemoryAddress naturalHeight) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                Out<Integer> minimumHeightOUT = new Out<>(minimumHeight.get(Interop.valueLayout.C_INT, 0));
                Out<Integer> naturalHeightOUT = new Out<>(naturalHeight.get(Interop.valueLayout.C_INT, 0));
                run((org.gtk.gtk.CellArea) Interop.register(area, org.gtk.gtk.CellArea.fromAddress).marshal(area, null), (org.gtk.gtk.CellAreaContext) Interop.register(context, org.gtk.gtk.CellAreaContext.fromAddress).marshal(context, null), (org.gtk.gtk.Widget) Interop.register(widget, org.gtk.gtk.Widget.fromAddress).marshal(widget, null), width, minimumHeightOUT, naturalHeightOUT);
                minimumHeight.set(Interop.valueLayout.C_INT, 0, minimumHeightOUT.get());
                naturalHeight.set(Interop.valueLayout.C_INT, 0, naturalHeightOUT.get());
            }
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), GetPreferredHeightForWidthCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code get_preferred_height_for_width}
     * @param getPreferredHeightForWidth The new value of the field {@code get_preferred_height_for_width}
     */
    public void setGetPreferredHeightForWidth(GetPreferredHeightForWidthCallback getPreferredHeightForWidth) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_preferred_height_for_width"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (getPreferredHeightForWidth == null ? MemoryAddress.NULL : getPreferredHeightForWidth.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code GetPreferredHeightCallback} callback.
     */
    @FunctionalInterface
    public interface GetPreferredHeightCallback {
    
        void run(org.gtk.gtk.CellArea area, org.gtk.gtk.CellAreaContext context, org.gtk.gtk.Widget widget, Out<Integer> minimumHeight, Out<Integer> naturalHeight);
        
        @ApiStatus.Internal default void upcall(MemoryAddress area, MemoryAddress context, MemoryAddress widget, MemoryAddress minimumHeight, MemoryAddress naturalHeight) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                Out<Integer> minimumHeightOUT = new Out<>(minimumHeight.get(Interop.valueLayout.C_INT, 0));
                Out<Integer> naturalHeightOUT = new Out<>(naturalHeight.get(Interop.valueLayout.C_INT, 0));
                run((org.gtk.gtk.CellArea) Interop.register(area, org.gtk.gtk.CellArea.fromAddress).marshal(area, null), (org.gtk.gtk.CellAreaContext) Interop.register(context, org.gtk.gtk.CellAreaContext.fromAddress).marshal(context, null), (org.gtk.gtk.Widget) Interop.register(widget, org.gtk.gtk.Widget.fromAddress).marshal(widget, null), minimumHeightOUT, naturalHeightOUT);
                minimumHeight.set(Interop.valueLayout.C_INT, 0, minimumHeightOUT.get());
                naturalHeight.set(Interop.valueLayout.C_INT, 0, naturalHeightOUT.get());
            }
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), GetPreferredHeightCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code get_preferred_height}
     * @param getPreferredHeight The new value of the field {@code get_preferred_height}
     */
    public void setGetPreferredHeight(GetPreferredHeightCallback getPreferredHeight) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_preferred_height"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (getPreferredHeight == null ? MemoryAddress.NULL : getPreferredHeight.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code GetPreferredWidthForHeightCallback} callback.
     */
    @FunctionalInterface
    public interface GetPreferredWidthForHeightCallback {
    
        void run(org.gtk.gtk.CellArea area, org.gtk.gtk.CellAreaContext context, org.gtk.gtk.Widget widget, int height, Out<Integer> minimumWidth, Out<Integer> naturalWidth);
        
        @ApiStatus.Internal default void upcall(MemoryAddress area, MemoryAddress context, MemoryAddress widget, int height, MemoryAddress minimumWidth, MemoryAddress naturalWidth) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                Out<Integer> minimumWidthOUT = new Out<>(minimumWidth.get(Interop.valueLayout.C_INT, 0));
                Out<Integer> naturalWidthOUT = new Out<>(naturalWidth.get(Interop.valueLayout.C_INT, 0));
                run((org.gtk.gtk.CellArea) Interop.register(area, org.gtk.gtk.CellArea.fromAddress).marshal(area, null), (org.gtk.gtk.CellAreaContext) Interop.register(context, org.gtk.gtk.CellAreaContext.fromAddress).marshal(context, null), (org.gtk.gtk.Widget) Interop.register(widget, org.gtk.gtk.Widget.fromAddress).marshal(widget, null), height, minimumWidthOUT, naturalWidthOUT);
                minimumWidth.set(Interop.valueLayout.C_INT, 0, minimumWidthOUT.get());
                naturalWidth.set(Interop.valueLayout.C_INT, 0, naturalWidthOUT.get());
            }
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), GetPreferredWidthForHeightCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code get_preferred_width_for_height}
     * @param getPreferredWidthForHeight The new value of the field {@code get_preferred_width_for_height}
     */
    public void setGetPreferredWidthForHeight(GetPreferredWidthForHeightCallback getPreferredWidthForHeight) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_preferred_width_for_height"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (getPreferredWidthForHeight == null ? MemoryAddress.NULL : getPreferredWidthForHeight.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code SetCellPropertyCallback} callback.
     */
    @FunctionalInterface
    public interface SetCellPropertyCallback {
    
        void run(org.gtk.gtk.CellArea area, org.gtk.gtk.CellRenderer renderer, int propertyId, org.gtk.gobject.Value value, org.gtk.gobject.ParamSpec pspec);
        
        @ApiStatus.Internal default void upcall(MemoryAddress area, MemoryAddress renderer, int propertyId, MemoryAddress value, MemoryAddress pspec) {
            run((org.gtk.gtk.CellArea) Interop.register(area, org.gtk.gtk.CellArea.fromAddress).marshal(area, null), (org.gtk.gtk.CellRenderer) Interop.register(renderer, org.gtk.gtk.CellRenderer.fromAddress).marshal(renderer, null), propertyId, org.gtk.gobject.Value.fromAddress.marshal(value, null), (org.gtk.gobject.ParamSpec) Interop.register(pspec, org.gtk.gobject.ParamSpec.fromAddress).marshal(pspec, null));
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), SetCellPropertyCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code set_cell_property}
     * @param setCellProperty The new value of the field {@code set_cell_property}
     */
    public void setSetCellProperty(SetCellPropertyCallback setCellProperty) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("set_cell_property"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (setCellProperty == null ? MemoryAddress.NULL : setCellProperty.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code GetCellPropertyCallback} callback.
     */
    @FunctionalInterface
    public interface GetCellPropertyCallback {
    
        void run(org.gtk.gtk.CellArea area, org.gtk.gtk.CellRenderer renderer, int propertyId, org.gtk.gobject.Value value, org.gtk.gobject.ParamSpec pspec);
        
        @ApiStatus.Internal default void upcall(MemoryAddress area, MemoryAddress renderer, int propertyId, MemoryAddress value, MemoryAddress pspec) {
            run((org.gtk.gtk.CellArea) Interop.register(area, org.gtk.gtk.CellArea.fromAddress).marshal(area, null), (org.gtk.gtk.CellRenderer) Interop.register(renderer, org.gtk.gtk.CellRenderer.fromAddress).marshal(renderer, null), propertyId, org.gtk.gobject.Value.fromAddress.marshal(value, null), (org.gtk.gobject.ParamSpec) Interop.register(pspec, org.gtk.gobject.ParamSpec.fromAddress).marshal(pspec, null));
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), GetCellPropertyCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code get_cell_property}
     * @param getCellProperty The new value of the field {@code get_cell_property}
     */
    public void setGetCellProperty(GetCellPropertyCallback getCellProperty) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_cell_property"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (getCellProperty == null ? MemoryAddress.NULL : getCellProperty.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code FocusCallback} callback.
     */
    @FunctionalInterface
    public interface FocusCallback {
    
        boolean run(org.gtk.gtk.CellArea area, org.gtk.gtk.DirectionType direction);
        
        @ApiStatus.Internal default int upcall(MemoryAddress area, int direction) {
            var RESULT = run((org.gtk.gtk.CellArea) Interop.register(area, org.gtk.gtk.CellArea.fromAddress).marshal(area, null), org.gtk.gtk.DirectionType.of(direction));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), FocusCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code focus}
     * @param focus The new value of the field {@code focus}
     */
    public void setFocus(FocusCallback focus) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("focus"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (focus == null ? MemoryAddress.NULL : focus.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code IsActivatableCallback} callback.
     */
    @FunctionalInterface
    public interface IsActivatableCallback {
    
        boolean run(org.gtk.gtk.CellArea area);
        
        @ApiStatus.Internal default int upcall(MemoryAddress area) {
            var RESULT = run((org.gtk.gtk.CellArea) Interop.register(area, org.gtk.gtk.CellArea.fromAddress).marshal(area, null));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), IsActivatableCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code is_activatable}
     * @param isActivatable The new value of the field {@code is_activatable}
     */
    public void setIsActivatable(IsActivatableCallback isActivatable) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("is_activatable"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (isActivatable == null ? MemoryAddress.NULL : isActivatable.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code ActivateCallback} callback.
     */
    @FunctionalInterface
    public interface ActivateCallback {
    
        boolean run(org.gtk.gtk.CellArea area, org.gtk.gtk.CellAreaContext context, org.gtk.gtk.Widget widget, org.gtk.gdk.Rectangle cellArea, org.gtk.gtk.CellRendererState flags, boolean editOnly);
        
        @ApiStatus.Internal default int upcall(MemoryAddress area, MemoryAddress context, MemoryAddress widget, MemoryAddress cellArea, int flags, int editOnly) {
            var RESULT = run((org.gtk.gtk.CellArea) Interop.register(area, org.gtk.gtk.CellArea.fromAddress).marshal(area, null), (org.gtk.gtk.CellAreaContext) Interop.register(context, org.gtk.gtk.CellAreaContext.fromAddress).marshal(context, null), (org.gtk.gtk.Widget) Interop.register(widget, org.gtk.gtk.Widget.fromAddress).marshal(widget, null), org.gtk.gdk.Rectangle.fromAddress.marshal(cellArea, null), new org.gtk.gtk.CellRendererState(flags), Marshal.integerToBoolean.marshal(editOnly, null).booleanValue());
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), ActivateCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code activate}
     * @param activate The new value of the field {@code activate}
     */
    public void setActivate(ActivateCallback activate) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("activate"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (activate == null ? MemoryAddress.NULL : activate.toCallback()));
        }
    }
    
    /**
     * Create a CellAreaClass proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected CellAreaClass(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, CellAreaClass> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new CellAreaClass(input);
    
    /**
     * Finds a cell property of a cell area class by name.
     * @param propertyName the name of the child property to find
     * @return the {@code GParamSpec} of the child property
     */
    public org.gtk.gobject.ParamSpec findCellProperty(java.lang.String propertyName) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.gtk_cell_area_class_find_cell_property.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(propertyName, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return (org.gtk.gobject.ParamSpec) Interop.register(RESULT, org.gtk.gobject.ParamSpec.fromAddress).marshal(RESULT, null);
        }
    }
    
    /**
     * Installs a cell property on a cell area class.
     * @param propertyId the id for the property
     * @param pspec the {@code GParamSpec} for the property
     */
    public void installCellProperty(int propertyId, org.gtk.gobject.ParamSpec pspec) {
        try {
            DowncallHandles.gtk_cell_area_class_install_cell_property.invokeExact(
                    handle(),
                    propertyId,
                    pspec.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Returns all cell properties of a cell area class.
     * @param nProperties location to return the number of cell properties found
     * @return a newly
     *     allocated {@code null}-terminated array of {@code GParamSpec}*.  The array
     *     must be freed with g_free().
     */
    public org.gtk.gobject.ParamSpec[] listCellProperties(Out<Integer> nProperties) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment nPropertiesPOINTER = SCOPE.allocate(Interop.valueLayout.C_INT);
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.gtk_cell_area_class_list_cell_properties.invokeExact(
                        handle(),
                        (Addressable) nPropertiesPOINTER.address());
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
                    nProperties.set(nPropertiesPOINTER.get(Interop.valueLayout.C_INT, 0));
            org.gtk.gobject.ParamSpec[] resultARRAY = new org.gtk.gobject.ParamSpec[nProperties.get().intValue()];
            for (int I = 0; I < nProperties.get().intValue(); I++) {
                var OBJ = RESULT.get(Interop.valueLayout.ADDRESS, I);
                resultARRAY[I] = (org.gtk.gobject.ParamSpec) Interop.register(OBJ, org.gtk.gobject.ParamSpec.fromAddress).marshal(OBJ, null);
            }
            return resultARRAY;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_cell_area_class_find_cell_property = Interop.downcallHandle(
                "gtk_cell_area_class_find_cell_property",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_cell_area_class_install_cell_property = Interop.downcallHandle(
                "gtk_cell_area_class_install_cell_property",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_cell_area_class_list_cell_properties = Interop.downcallHandle(
                "gtk_cell_area_class_list_cell_properties",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
    }
    
    /**
     * A {@link CellAreaClass.Builder} object constructs a {@link CellAreaClass} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link CellAreaClass.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final CellAreaClass struct;
        
        private Builder() {
            struct = CellAreaClass.allocate();
        }
        
        /**
         * Finish building the {@link CellAreaClass} struct.
         * @return A new instance of {@code CellAreaClass} with the fields 
         *         that were set in the Builder object.
         */
        public CellAreaClass build() {
            return struct;
        }
        
        public Builder setParentClass(org.gtk.gobject.InitiallyUnownedClass parentClass) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("parent_class"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (parentClass == null ? MemoryAddress.NULL : parentClass.handle()));
                return this;
            }
        }
        
        public Builder setAdd(AddCallback add) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("add"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (add == null ? MemoryAddress.NULL : add.toCallback()));
                return this;
            }
        }
        
        public Builder setRemove(RemoveCallback remove) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("remove"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (remove == null ? MemoryAddress.NULL : remove.toCallback()));
                return this;
            }
        }
        
        public Builder setForeach(ForeachCallback foreach) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("foreach"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (foreach == null ? MemoryAddress.NULL : foreach.toCallback()));
                return this;
            }
        }
        
        public Builder setForeachAlloc(ForeachAllocCallback foreachAlloc) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("foreach_alloc"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (foreachAlloc == null ? MemoryAddress.NULL : foreachAlloc.toCallback()));
                return this;
            }
        }
        
        public Builder setEvent(EventCallback event) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("event"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (event == null ? MemoryAddress.NULL : event.toCallback()));
                return this;
            }
        }
        
        public Builder setSnapshot(SnapshotCallback snapshot) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("snapshot"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (snapshot == null ? MemoryAddress.NULL : snapshot.toCallback()));
                return this;
            }
        }
        
        public Builder setApplyAttributes(ApplyAttributesCallback applyAttributes) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("apply_attributes"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (applyAttributes == null ? MemoryAddress.NULL : applyAttributes.toCallback()));
                return this;
            }
        }
        
        public Builder setCreateContext(CreateContextCallback createContext) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("create_context"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (createContext == null ? MemoryAddress.NULL : createContext.toCallback()));
                return this;
            }
        }
        
        public Builder setCopyContext(CopyContextCallback copyContext) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("copy_context"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (copyContext == null ? MemoryAddress.NULL : copyContext.toCallback()));
                return this;
            }
        }
        
        public Builder setGetRequestMode(GetRequestModeCallback getRequestMode) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("get_request_mode"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (getRequestMode == null ? MemoryAddress.NULL : getRequestMode.toCallback()));
                return this;
            }
        }
        
        public Builder setGetPreferredWidth(GetPreferredWidthCallback getPreferredWidth) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("get_preferred_width"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (getPreferredWidth == null ? MemoryAddress.NULL : getPreferredWidth.toCallback()));
                return this;
            }
        }
        
        public Builder setGetPreferredHeightForWidth(GetPreferredHeightForWidthCallback getPreferredHeightForWidth) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("get_preferred_height_for_width"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (getPreferredHeightForWidth == null ? MemoryAddress.NULL : getPreferredHeightForWidth.toCallback()));
                return this;
            }
        }
        
        public Builder setGetPreferredHeight(GetPreferredHeightCallback getPreferredHeight) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("get_preferred_height"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (getPreferredHeight == null ? MemoryAddress.NULL : getPreferredHeight.toCallback()));
                return this;
            }
        }
        
        public Builder setGetPreferredWidthForHeight(GetPreferredWidthForHeightCallback getPreferredWidthForHeight) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("get_preferred_width_for_height"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (getPreferredWidthForHeight == null ? MemoryAddress.NULL : getPreferredWidthForHeight.toCallback()));
                return this;
            }
        }
        
        public Builder setSetCellProperty(SetCellPropertyCallback setCellProperty) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("set_cell_property"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (setCellProperty == null ? MemoryAddress.NULL : setCellProperty.toCallback()));
                return this;
            }
        }
        
        public Builder setGetCellProperty(GetCellPropertyCallback getCellProperty) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("get_cell_property"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (getCellProperty == null ? MemoryAddress.NULL : getCellProperty.toCallback()));
                return this;
            }
        }
        
        public Builder setFocus(FocusCallback focus) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("focus"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (focus == null ? MemoryAddress.NULL : focus.toCallback()));
                return this;
            }
        }
        
        public Builder setIsActivatable(IsActivatableCallback isActivatable) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("is_activatable"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (isActivatable == null ? MemoryAddress.NULL : isActivatable.toCallback()));
                return this;
            }
        }
        
        public Builder setActivate(ActivateCallback activate) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("activate"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (activate == null ? MemoryAddress.NULL : activate.toCallback()));
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
