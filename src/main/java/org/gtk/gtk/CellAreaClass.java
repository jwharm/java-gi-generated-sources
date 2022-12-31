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
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        CellAreaClass newInstance = new CellAreaClass(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    @FunctionalInterface
    public interface AddCallback {
        void run(org.gtk.gtk.CellArea area, org.gtk.gtk.CellRenderer renderer);

        @ApiStatus.Internal default void upcall(MemoryAddress area, MemoryAddress renderer) {
            run((org.gtk.gtk.CellArea) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(area)), org.gtk.gtk.CellArea.fromAddress).marshal(area, Ownership.NONE), (org.gtk.gtk.CellRenderer) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(renderer)), org.gtk.gtk.CellRenderer.fromAddress).marshal(renderer, Ownership.NONE));
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(AddCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code add}
     * @param add The new value of the field {@code add}
     */
    public void setAdd(AddCallback add) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("add"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (add == null ? MemoryAddress.NULL : add.toCallback()));
    }
    
    @FunctionalInterface
    public interface RemoveCallback {
        void run(org.gtk.gtk.CellArea area, org.gtk.gtk.CellRenderer renderer);

        @ApiStatus.Internal default void upcall(MemoryAddress area, MemoryAddress renderer) {
            run((org.gtk.gtk.CellArea) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(area)), org.gtk.gtk.CellArea.fromAddress).marshal(area, Ownership.NONE), (org.gtk.gtk.CellRenderer) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(renderer)), org.gtk.gtk.CellRenderer.fromAddress).marshal(renderer, Ownership.NONE));
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(RemoveCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code remove}
     * @param remove The new value of the field {@code remove}
     */
    public void setRemove(RemoveCallback remove) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("remove"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (remove == null ? MemoryAddress.NULL : remove.toCallback()));
    }
    
    @FunctionalInterface
    public interface ForeachCallback {
        void run(org.gtk.gtk.CellArea area, org.gtk.gtk.CellCallback callback);

        @ApiStatus.Internal default void upcall(MemoryAddress area, MemoryAddress callback, MemoryAddress callbackData) {
            run((org.gtk.gtk.CellArea) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(area)), org.gtk.gtk.CellArea.fromAddress).marshal(area, Ownership.NONE), null /* Unsupported parameter type */);
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(ForeachCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code foreach}
     * @param foreach The new value of the field {@code foreach}
     */
    public void setForeach(ForeachCallback foreach) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("foreach"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (foreach == null ? MemoryAddress.NULL : foreach.toCallback()));
    }
    
    @FunctionalInterface
    public interface ForeachAllocCallback {
        void run(org.gtk.gtk.CellArea area, org.gtk.gtk.CellAreaContext context, org.gtk.gtk.Widget widget, org.gtk.gdk.Rectangle cellArea, org.gtk.gdk.Rectangle backgroundArea, org.gtk.gtk.CellAllocCallback callback);

        @ApiStatus.Internal default void upcall(MemoryAddress area, MemoryAddress context, MemoryAddress widget, MemoryAddress cellArea, MemoryAddress backgroundArea, MemoryAddress callback, MemoryAddress callbackData) {
            run((org.gtk.gtk.CellArea) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(area)), org.gtk.gtk.CellArea.fromAddress).marshal(area, Ownership.NONE), (org.gtk.gtk.CellAreaContext) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(context)), org.gtk.gtk.CellAreaContext.fromAddress).marshal(context, Ownership.NONE), (org.gtk.gtk.Widget) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(widget)), org.gtk.gtk.Widget.fromAddress).marshal(widget, Ownership.NONE), org.gtk.gdk.Rectangle.fromAddress.marshal(cellArea, Ownership.NONE), org.gtk.gdk.Rectangle.fromAddress.marshal(backgroundArea, Ownership.NONE), null /* Unsupported parameter type */);
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(ForeachAllocCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code foreach_alloc}
     * @param foreachAlloc The new value of the field {@code foreach_alloc}
     */
    public void setForeachAlloc(ForeachAllocCallback foreachAlloc) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("foreach_alloc"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (foreachAlloc == null ? MemoryAddress.NULL : foreachAlloc.toCallback()));
    }
    
    @FunctionalInterface
    public interface EventCallback {
        int run(org.gtk.gtk.CellArea area, org.gtk.gtk.CellAreaContext context, org.gtk.gtk.Widget widget, org.gtk.gdk.Event event, org.gtk.gdk.Rectangle cellArea, org.gtk.gtk.CellRendererState flags);

        @ApiStatus.Internal default int upcall(MemoryAddress area, MemoryAddress context, MemoryAddress widget, MemoryAddress event, MemoryAddress cellArea, int flags) {
            var RESULT = run((org.gtk.gtk.CellArea) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(area)), org.gtk.gtk.CellArea.fromAddress).marshal(area, Ownership.NONE), (org.gtk.gtk.CellAreaContext) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(context)), org.gtk.gtk.CellAreaContext.fromAddress).marshal(context, Ownership.NONE), (org.gtk.gtk.Widget) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(widget)), org.gtk.gtk.Widget.fromAddress).marshal(widget, Ownership.NONE), (org.gtk.gdk.Event) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(event)), org.gtk.gdk.Event.fromAddress).marshal(event, Ownership.NONE), org.gtk.gdk.Rectangle.fromAddress.marshal(cellArea, Ownership.NONE), new org.gtk.gtk.CellRendererState(flags));
            return RESULT;
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(EventCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code event}
     * @param event The new value of the field {@code event}
     */
    public void setEvent(EventCallback event) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("event"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (event == null ? MemoryAddress.NULL : event.toCallback()));
    }
    
    @FunctionalInterface
    public interface SnapshotCallback {
        void run(org.gtk.gtk.CellArea area, org.gtk.gtk.CellAreaContext context, org.gtk.gtk.Widget widget, org.gtk.gtk.Snapshot snapshot, org.gtk.gdk.Rectangle backgroundArea, org.gtk.gdk.Rectangle cellArea, org.gtk.gtk.CellRendererState flags, boolean paintFocus);

        @ApiStatus.Internal default void upcall(MemoryAddress area, MemoryAddress context, MemoryAddress widget, MemoryAddress snapshot, MemoryAddress backgroundArea, MemoryAddress cellArea, int flags, int paintFocus) {
            run((org.gtk.gtk.CellArea) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(area)), org.gtk.gtk.CellArea.fromAddress).marshal(area, Ownership.NONE), (org.gtk.gtk.CellAreaContext) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(context)), org.gtk.gtk.CellAreaContext.fromAddress).marshal(context, Ownership.NONE), (org.gtk.gtk.Widget) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(widget)), org.gtk.gtk.Widget.fromAddress).marshal(widget, Ownership.NONE), (org.gtk.gtk.Snapshot) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(snapshot)), org.gtk.gtk.Snapshot.fromAddress).marshal(snapshot, Ownership.NONE), org.gtk.gdk.Rectangle.fromAddress.marshal(backgroundArea, Ownership.NONE), org.gtk.gdk.Rectangle.fromAddress.marshal(cellArea, Ownership.NONE), new org.gtk.gtk.CellRendererState(flags), Marshal.integerToBoolean.marshal(paintFocus, null).booleanValue());
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(SnapshotCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code snapshot}
     * @param snapshot The new value of the field {@code snapshot}
     */
    public void setSnapshot(SnapshotCallback snapshot) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("snapshot"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (snapshot == null ? MemoryAddress.NULL : snapshot.toCallback()));
    }
    
    @FunctionalInterface
    public interface ApplyAttributesCallback {
        void run(org.gtk.gtk.CellArea area, org.gtk.gtk.TreeModel treeModel, org.gtk.gtk.TreeIter iter, boolean isExpander, boolean isExpanded);

        @ApiStatus.Internal default void upcall(MemoryAddress area, MemoryAddress treeModel, MemoryAddress iter, int isExpander, int isExpanded) {
            run((org.gtk.gtk.CellArea) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(area)), org.gtk.gtk.CellArea.fromAddress).marshal(area, Ownership.NONE), (org.gtk.gtk.TreeModel) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(treeModel)), org.gtk.gtk.TreeModel.fromAddress).marshal(treeModel, Ownership.NONE), org.gtk.gtk.TreeIter.fromAddress.marshal(iter, Ownership.NONE), Marshal.integerToBoolean.marshal(isExpander, null).booleanValue(), Marshal.integerToBoolean.marshal(isExpanded, null).booleanValue());
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(ApplyAttributesCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code apply_attributes}
     * @param applyAttributes The new value of the field {@code apply_attributes}
     */
    public void setApplyAttributes(ApplyAttributesCallback applyAttributes) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("apply_attributes"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (applyAttributes == null ? MemoryAddress.NULL : applyAttributes.toCallback()));
    }
    
    @FunctionalInterface
    public interface CreateContextCallback {
        org.gtk.gtk.CellAreaContext run(org.gtk.gtk.CellArea area);

        @ApiStatus.Internal default Addressable upcall(MemoryAddress area) {
            var RESULT = run((org.gtk.gtk.CellArea) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(area)), org.gtk.gtk.CellArea.fromAddress).marshal(area, Ownership.NONE));
            return RESULT == null ? MemoryAddress.NULL.address() : (RESULT.handle()).address();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(CreateContextCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code create_context}
     * @param createContext The new value of the field {@code create_context}
     */
    public void setCreateContext(CreateContextCallback createContext) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("create_context"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (createContext == null ? MemoryAddress.NULL : createContext.toCallback()));
    }
    
    @FunctionalInterface
    public interface CopyContextCallback {
        org.gtk.gtk.CellAreaContext run(org.gtk.gtk.CellArea area, org.gtk.gtk.CellAreaContext context);

        @ApiStatus.Internal default Addressable upcall(MemoryAddress area, MemoryAddress context) {
            var RESULT = run((org.gtk.gtk.CellArea) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(area)), org.gtk.gtk.CellArea.fromAddress).marshal(area, Ownership.NONE), (org.gtk.gtk.CellAreaContext) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(context)), org.gtk.gtk.CellAreaContext.fromAddress).marshal(context, Ownership.NONE));
            return RESULT == null ? MemoryAddress.NULL.address() : (RESULT.handle()).address();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(CopyContextCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code copy_context}
     * @param copyContext The new value of the field {@code copy_context}
     */
    public void setCopyContext(CopyContextCallback copyContext) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("copy_context"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (copyContext == null ? MemoryAddress.NULL : copyContext.toCallback()));
    }
    
    @FunctionalInterface
    public interface GetRequestModeCallback {
        org.gtk.gtk.SizeRequestMode run(org.gtk.gtk.CellArea area);

        @ApiStatus.Internal default int upcall(MemoryAddress area) {
            var RESULT = run((org.gtk.gtk.CellArea) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(area)), org.gtk.gtk.CellArea.fromAddress).marshal(area, Ownership.NONE));
            return RESULT.getValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(GetRequestModeCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code get_request_mode}
     * @param getRequestMode The new value of the field {@code get_request_mode}
     */
    public void setGetRequestMode(GetRequestModeCallback getRequestMode) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("get_request_mode"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getRequestMode == null ? MemoryAddress.NULL : getRequestMode.toCallback()));
    }
    
    @FunctionalInterface
    public interface GetPreferredWidthCallback {
        void run(org.gtk.gtk.CellArea area, org.gtk.gtk.CellAreaContext context, org.gtk.gtk.Widget widget, Out<Integer> minimumWidth, Out<Integer> naturalWidth);

        @ApiStatus.Internal default void upcall(MemoryAddress area, MemoryAddress context, MemoryAddress widget, MemoryAddress minimumWidth, MemoryAddress naturalWidth) {
            Out<Integer> minimumWidthOUT = new Out<>(minimumWidth.get(Interop.valueLayout.C_INT, 0));
            Out<Integer> naturalWidthOUT = new Out<>(naturalWidth.get(Interop.valueLayout.C_INT, 0));
            run((org.gtk.gtk.CellArea) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(area)), org.gtk.gtk.CellArea.fromAddress).marshal(area, Ownership.NONE), (org.gtk.gtk.CellAreaContext) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(context)), org.gtk.gtk.CellAreaContext.fromAddress).marshal(context, Ownership.NONE), (org.gtk.gtk.Widget) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(widget)), org.gtk.gtk.Widget.fromAddress).marshal(widget, Ownership.NONE), minimumWidthOUT, naturalWidthOUT);
            minimumWidth.set(Interop.valueLayout.C_INT, 0, minimumWidthOUT.get());
            naturalWidth.set(Interop.valueLayout.C_INT, 0, naturalWidthOUT.get());
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(GetPreferredWidthCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code get_preferred_width}
     * @param getPreferredWidth The new value of the field {@code get_preferred_width}
     */
    public void setGetPreferredWidth(GetPreferredWidthCallback getPreferredWidth) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("get_preferred_width"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getPreferredWidth == null ? MemoryAddress.NULL : getPreferredWidth.toCallback()));
    }
    
    @FunctionalInterface
    public interface GetPreferredHeightForWidthCallback {
        void run(org.gtk.gtk.CellArea area, org.gtk.gtk.CellAreaContext context, org.gtk.gtk.Widget widget, int width, Out<Integer> minimumHeight, Out<Integer> naturalHeight);

        @ApiStatus.Internal default void upcall(MemoryAddress area, MemoryAddress context, MemoryAddress widget, int width, MemoryAddress minimumHeight, MemoryAddress naturalHeight) {
            Out<Integer> minimumHeightOUT = new Out<>(minimumHeight.get(Interop.valueLayout.C_INT, 0));
            Out<Integer> naturalHeightOUT = new Out<>(naturalHeight.get(Interop.valueLayout.C_INT, 0));
            run((org.gtk.gtk.CellArea) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(area)), org.gtk.gtk.CellArea.fromAddress).marshal(area, Ownership.NONE), (org.gtk.gtk.CellAreaContext) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(context)), org.gtk.gtk.CellAreaContext.fromAddress).marshal(context, Ownership.NONE), (org.gtk.gtk.Widget) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(widget)), org.gtk.gtk.Widget.fromAddress).marshal(widget, Ownership.NONE), width, minimumHeightOUT, naturalHeightOUT);
            minimumHeight.set(Interop.valueLayout.C_INT, 0, minimumHeightOUT.get());
            naturalHeight.set(Interop.valueLayout.C_INT, 0, naturalHeightOUT.get());
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(GetPreferredHeightForWidthCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code get_preferred_height_for_width}
     * @param getPreferredHeightForWidth The new value of the field {@code get_preferred_height_for_width}
     */
    public void setGetPreferredHeightForWidth(GetPreferredHeightForWidthCallback getPreferredHeightForWidth) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("get_preferred_height_for_width"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getPreferredHeightForWidth == null ? MemoryAddress.NULL : getPreferredHeightForWidth.toCallback()));
    }
    
    @FunctionalInterface
    public interface GetPreferredHeightCallback {
        void run(org.gtk.gtk.CellArea area, org.gtk.gtk.CellAreaContext context, org.gtk.gtk.Widget widget, Out<Integer> minimumHeight, Out<Integer> naturalHeight);

        @ApiStatus.Internal default void upcall(MemoryAddress area, MemoryAddress context, MemoryAddress widget, MemoryAddress minimumHeight, MemoryAddress naturalHeight) {
            Out<Integer> minimumHeightOUT = new Out<>(minimumHeight.get(Interop.valueLayout.C_INT, 0));
            Out<Integer> naturalHeightOUT = new Out<>(naturalHeight.get(Interop.valueLayout.C_INT, 0));
            run((org.gtk.gtk.CellArea) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(area)), org.gtk.gtk.CellArea.fromAddress).marshal(area, Ownership.NONE), (org.gtk.gtk.CellAreaContext) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(context)), org.gtk.gtk.CellAreaContext.fromAddress).marshal(context, Ownership.NONE), (org.gtk.gtk.Widget) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(widget)), org.gtk.gtk.Widget.fromAddress).marshal(widget, Ownership.NONE), minimumHeightOUT, naturalHeightOUT);
            minimumHeight.set(Interop.valueLayout.C_INT, 0, minimumHeightOUT.get());
            naturalHeight.set(Interop.valueLayout.C_INT, 0, naturalHeightOUT.get());
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(GetPreferredHeightCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code get_preferred_height}
     * @param getPreferredHeight The new value of the field {@code get_preferred_height}
     */
    public void setGetPreferredHeight(GetPreferredHeightCallback getPreferredHeight) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("get_preferred_height"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getPreferredHeight == null ? MemoryAddress.NULL : getPreferredHeight.toCallback()));
    }
    
    @FunctionalInterface
    public interface GetPreferredWidthForHeightCallback {
        void run(org.gtk.gtk.CellArea area, org.gtk.gtk.CellAreaContext context, org.gtk.gtk.Widget widget, int height, Out<Integer> minimumWidth, Out<Integer> naturalWidth);

        @ApiStatus.Internal default void upcall(MemoryAddress area, MemoryAddress context, MemoryAddress widget, int height, MemoryAddress minimumWidth, MemoryAddress naturalWidth) {
            Out<Integer> minimumWidthOUT = new Out<>(minimumWidth.get(Interop.valueLayout.C_INT, 0));
            Out<Integer> naturalWidthOUT = new Out<>(naturalWidth.get(Interop.valueLayout.C_INT, 0));
            run((org.gtk.gtk.CellArea) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(area)), org.gtk.gtk.CellArea.fromAddress).marshal(area, Ownership.NONE), (org.gtk.gtk.CellAreaContext) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(context)), org.gtk.gtk.CellAreaContext.fromAddress).marshal(context, Ownership.NONE), (org.gtk.gtk.Widget) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(widget)), org.gtk.gtk.Widget.fromAddress).marshal(widget, Ownership.NONE), height, minimumWidthOUT, naturalWidthOUT);
            minimumWidth.set(Interop.valueLayout.C_INT, 0, minimumWidthOUT.get());
            naturalWidth.set(Interop.valueLayout.C_INT, 0, naturalWidthOUT.get());
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(GetPreferredWidthForHeightCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code get_preferred_width_for_height}
     * @param getPreferredWidthForHeight The new value of the field {@code get_preferred_width_for_height}
     */
    public void setGetPreferredWidthForHeight(GetPreferredWidthForHeightCallback getPreferredWidthForHeight) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("get_preferred_width_for_height"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getPreferredWidthForHeight == null ? MemoryAddress.NULL : getPreferredWidthForHeight.toCallback()));
    }
    
    @FunctionalInterface
    public interface SetCellPropertyCallback {
        void run(org.gtk.gtk.CellArea area, org.gtk.gtk.CellRenderer renderer, int propertyId, org.gtk.gobject.Value value, org.gtk.gobject.ParamSpec pspec);

        @ApiStatus.Internal default void upcall(MemoryAddress area, MemoryAddress renderer, int propertyId, MemoryAddress value, MemoryAddress pspec) {
            run((org.gtk.gtk.CellArea) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(area)), org.gtk.gtk.CellArea.fromAddress).marshal(area, Ownership.NONE), (org.gtk.gtk.CellRenderer) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(renderer)), org.gtk.gtk.CellRenderer.fromAddress).marshal(renderer, Ownership.NONE), propertyId, org.gtk.gobject.Value.fromAddress.marshal(value, Ownership.NONE), (org.gtk.gobject.ParamSpec) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(pspec)), org.gtk.gobject.ParamSpec.fromAddress).marshal(pspec, Ownership.NONE));
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(SetCellPropertyCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code set_cell_property}
     * @param setCellProperty The new value of the field {@code set_cell_property}
     */
    public void setSetCellProperty(SetCellPropertyCallback setCellProperty) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("set_cell_property"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (setCellProperty == null ? MemoryAddress.NULL : setCellProperty.toCallback()));
    }
    
    @FunctionalInterface
    public interface GetCellPropertyCallback {
        void run(org.gtk.gtk.CellArea area, org.gtk.gtk.CellRenderer renderer, int propertyId, org.gtk.gobject.Value value, org.gtk.gobject.ParamSpec pspec);

        @ApiStatus.Internal default void upcall(MemoryAddress area, MemoryAddress renderer, int propertyId, MemoryAddress value, MemoryAddress pspec) {
            run((org.gtk.gtk.CellArea) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(area)), org.gtk.gtk.CellArea.fromAddress).marshal(area, Ownership.NONE), (org.gtk.gtk.CellRenderer) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(renderer)), org.gtk.gtk.CellRenderer.fromAddress).marshal(renderer, Ownership.NONE), propertyId, org.gtk.gobject.Value.fromAddress.marshal(value, Ownership.NONE), (org.gtk.gobject.ParamSpec) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(pspec)), org.gtk.gobject.ParamSpec.fromAddress).marshal(pspec, Ownership.NONE));
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(GetCellPropertyCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code get_cell_property}
     * @param getCellProperty The new value of the field {@code get_cell_property}
     */
    public void setGetCellProperty(GetCellPropertyCallback getCellProperty) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("get_cell_property"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getCellProperty == null ? MemoryAddress.NULL : getCellProperty.toCallback()));
    }
    
    @FunctionalInterface
    public interface FocusCallback {
        boolean run(org.gtk.gtk.CellArea area, org.gtk.gtk.DirectionType direction);

        @ApiStatus.Internal default int upcall(MemoryAddress area, int direction) {
            var RESULT = run((org.gtk.gtk.CellArea) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(area)), org.gtk.gtk.CellArea.fromAddress).marshal(area, Ownership.NONE), org.gtk.gtk.DirectionType.of(direction));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(FocusCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code focus}
     * @param focus The new value of the field {@code focus}
     */
    public void setFocus(FocusCallback focus) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("focus"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (focus == null ? MemoryAddress.NULL : focus.toCallback()));
    }
    
    @FunctionalInterface
    public interface IsActivatableCallback {
        boolean run(org.gtk.gtk.CellArea area);

        @ApiStatus.Internal default int upcall(MemoryAddress area) {
            var RESULT = run((org.gtk.gtk.CellArea) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(area)), org.gtk.gtk.CellArea.fromAddress).marshal(area, Ownership.NONE));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(IsActivatableCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code is_activatable}
     * @param isActivatable The new value of the field {@code is_activatable}
     */
    public void setIsActivatable(IsActivatableCallback isActivatable) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("is_activatable"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (isActivatable == null ? MemoryAddress.NULL : isActivatable.toCallback()));
    }
    
    @FunctionalInterface
    public interface ActivateCallback {
        boolean run(org.gtk.gtk.CellArea area, org.gtk.gtk.CellAreaContext context, org.gtk.gtk.Widget widget, org.gtk.gdk.Rectangle cellArea, org.gtk.gtk.CellRendererState flags, boolean editOnly);

        @ApiStatus.Internal default int upcall(MemoryAddress area, MemoryAddress context, MemoryAddress widget, MemoryAddress cellArea, int flags, int editOnly) {
            var RESULT = run((org.gtk.gtk.CellArea) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(area)), org.gtk.gtk.CellArea.fromAddress).marshal(area, Ownership.NONE), (org.gtk.gtk.CellAreaContext) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(context)), org.gtk.gtk.CellAreaContext.fromAddress).marshal(context, Ownership.NONE), (org.gtk.gtk.Widget) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(widget)), org.gtk.gtk.Widget.fromAddress).marshal(widget, Ownership.NONE), org.gtk.gdk.Rectangle.fromAddress.marshal(cellArea, Ownership.NONE), new org.gtk.gtk.CellRendererState(flags), Marshal.integerToBoolean.marshal(editOnly, null).booleanValue());
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(ActivateCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code activate}
     * @param activate The new value of the field {@code activate}
     */
    public void setActivate(ActivateCallback activate) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("activate"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (activate == null ? MemoryAddress.NULL : activate.toCallback()));
    }
    
    /**
     * Create a CellAreaClass proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected CellAreaClass(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, CellAreaClass> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new CellAreaClass(input, ownership);
    
    /**
     * Finds a cell property of a cell area class by name.
     * @param propertyName the name of the child property to find
     * @return the {@code GParamSpec} of the child property
     */
    public org.gtk.gobject.ParamSpec findCellProperty(java.lang.String propertyName) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_cell_area_class_find_cell_property.invokeExact(
                    handle(),
                    Marshal.stringToAddress.marshal(propertyName, null));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gtk.gobject.ParamSpec) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gtk.gobject.ParamSpec.fromAddress).marshal(RESULT, Ownership.NONE);
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
        MemorySegment nPropertiesPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
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
            resultARRAY[I] = (org.gtk.gobject.ParamSpec) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(OBJ)), org.gtk.gobject.ParamSpec.fromAddress).marshal(OBJ, Ownership.CONTAINER);
        }
        return resultARRAY;
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
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("parent_class"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (parentClass == null ? MemoryAddress.NULL : parentClass.handle()));
            return this;
        }
        
        public Builder setAdd(AddCallback add) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("add"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (add == null ? MemoryAddress.NULL : add.toCallback()));
            return this;
        }
        
        public Builder setRemove(RemoveCallback remove) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("remove"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (remove == null ? MemoryAddress.NULL : remove.toCallback()));
            return this;
        }
        
        public Builder setForeach(ForeachCallback foreach) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("foreach"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (foreach == null ? MemoryAddress.NULL : foreach.toCallback()));
            return this;
        }
        
        public Builder setForeachAlloc(ForeachAllocCallback foreachAlloc) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("foreach_alloc"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (foreachAlloc == null ? MemoryAddress.NULL : foreachAlloc.toCallback()));
            return this;
        }
        
        public Builder setEvent(EventCallback event) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("event"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (event == null ? MemoryAddress.NULL : event.toCallback()));
            return this;
        }
        
        public Builder setSnapshot(SnapshotCallback snapshot) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("snapshot"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (snapshot == null ? MemoryAddress.NULL : snapshot.toCallback()));
            return this;
        }
        
        public Builder setApplyAttributes(ApplyAttributesCallback applyAttributes) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("apply_attributes"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (applyAttributes == null ? MemoryAddress.NULL : applyAttributes.toCallback()));
            return this;
        }
        
        public Builder setCreateContext(CreateContextCallback createContext) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("create_context"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (createContext == null ? MemoryAddress.NULL : createContext.toCallback()));
            return this;
        }
        
        public Builder setCopyContext(CopyContextCallback copyContext) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("copy_context"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (copyContext == null ? MemoryAddress.NULL : copyContext.toCallback()));
            return this;
        }
        
        public Builder setGetRequestMode(GetRequestModeCallback getRequestMode) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_request_mode"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getRequestMode == null ? MemoryAddress.NULL : getRequestMode.toCallback()));
            return this;
        }
        
        public Builder setGetPreferredWidth(GetPreferredWidthCallback getPreferredWidth) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_preferred_width"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getPreferredWidth == null ? MemoryAddress.NULL : getPreferredWidth.toCallback()));
            return this;
        }
        
        public Builder setGetPreferredHeightForWidth(GetPreferredHeightForWidthCallback getPreferredHeightForWidth) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_preferred_height_for_width"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getPreferredHeightForWidth == null ? MemoryAddress.NULL : getPreferredHeightForWidth.toCallback()));
            return this;
        }
        
        public Builder setGetPreferredHeight(GetPreferredHeightCallback getPreferredHeight) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_preferred_height"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getPreferredHeight == null ? MemoryAddress.NULL : getPreferredHeight.toCallback()));
            return this;
        }
        
        public Builder setGetPreferredWidthForHeight(GetPreferredWidthForHeightCallback getPreferredWidthForHeight) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_preferred_width_for_height"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getPreferredWidthForHeight == null ? MemoryAddress.NULL : getPreferredWidthForHeight.toCallback()));
            return this;
        }
        
        public Builder setSetCellProperty(SetCellPropertyCallback setCellProperty) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("set_cell_property"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (setCellProperty == null ? MemoryAddress.NULL : setCellProperty.toCallback()));
            return this;
        }
        
        public Builder setGetCellProperty(GetCellPropertyCallback getCellProperty) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_cell_property"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getCellProperty == null ? MemoryAddress.NULL : getCellProperty.toCallback()));
            return this;
        }
        
        public Builder setFocus(FocusCallback focus) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("focus"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (focus == null ? MemoryAddress.NULL : focus.toCallback()));
            return this;
        }
        
        public Builder setIsActivatable(IsActivatableCallback isActivatable) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("is_activatable"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (isActivatable == null ? MemoryAddress.NULL : isActivatable.toCallback()));
            return this;
        }
        
        public Builder setActivate(ActivateCallback activate) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("activate"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (activate == null ? MemoryAddress.NULL : activate.toCallback()));
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
