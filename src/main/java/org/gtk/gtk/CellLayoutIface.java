package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class CellLayoutIface extends Struct {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkCellLayoutIface";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gtk.gobject.TypeInterface.getMemoryLayout().withName("g_iface"),
            Interop.valueLayout.ADDRESS.withName("pack_start"),
            Interop.valueLayout.ADDRESS.withName("pack_end"),
            Interop.valueLayout.ADDRESS.withName("clear"),
            Interop.valueLayout.ADDRESS.withName("add_attribute"),
            Interop.valueLayout.ADDRESS.withName("set_cell_data_func"),
            Interop.valueLayout.ADDRESS.withName("clear_attributes"),
            Interop.valueLayout.ADDRESS.withName("reorder"),
            Interop.valueLayout.ADDRESS.withName("get_cells"),
            Interop.valueLayout.ADDRESS.withName("get_area")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link CellLayoutIface}
     * @return A new, uninitialized @{link CellLayoutIface}
     */
    public static CellLayoutIface allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        CellLayoutIface newInstance = new CellLayoutIface(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    @FunctionalInterface
    public interface PackStartCallback {
        void run(org.gtk.gtk.CellLayout cellLayout, org.gtk.gtk.CellRenderer cell, boolean expand);

        @ApiStatus.Internal default void upcall(MemoryAddress cellLayout, MemoryAddress cell, int expand) {
            run((org.gtk.gtk.CellLayout) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(cellLayout)), org.gtk.gtk.CellLayout.fromAddress).marshal(cellLayout, Ownership.NONE), (org.gtk.gtk.CellRenderer) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(cell)), org.gtk.gtk.CellRenderer.fromAddress).marshal(cell, Ownership.NONE), Marshal.integerToBoolean.marshal(expand, null).booleanValue());
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(PackStartCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code pack_start}
     * @param packStart The new value of the field {@code pack_start}
     */
    public void setPackStart(PackStartCallback packStart) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("pack_start"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (packStart == null ? MemoryAddress.NULL : packStart.toCallback()));
    }
    
    @FunctionalInterface
    public interface PackEndCallback {
        void run(org.gtk.gtk.CellLayout cellLayout, org.gtk.gtk.CellRenderer cell, boolean expand);

        @ApiStatus.Internal default void upcall(MemoryAddress cellLayout, MemoryAddress cell, int expand) {
            run((org.gtk.gtk.CellLayout) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(cellLayout)), org.gtk.gtk.CellLayout.fromAddress).marshal(cellLayout, Ownership.NONE), (org.gtk.gtk.CellRenderer) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(cell)), org.gtk.gtk.CellRenderer.fromAddress).marshal(cell, Ownership.NONE), Marshal.integerToBoolean.marshal(expand, null).booleanValue());
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(PackEndCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code pack_end}
     * @param packEnd The new value of the field {@code pack_end}
     */
    public void setPackEnd(PackEndCallback packEnd) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("pack_end"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (packEnd == null ? MemoryAddress.NULL : packEnd.toCallback()));
    }
    
    @FunctionalInterface
    public interface ClearCallback {
        void run(org.gtk.gtk.CellLayout cellLayout);

        @ApiStatus.Internal default void upcall(MemoryAddress cellLayout) {
            run((org.gtk.gtk.CellLayout) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(cellLayout)), org.gtk.gtk.CellLayout.fromAddress).marshal(cellLayout, Ownership.NONE));
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(ClearCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code clear}
     * @param clear The new value of the field {@code clear}
     */
    public void setClear(ClearCallback clear) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("clear"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (clear == null ? MemoryAddress.NULL : clear.toCallback()));
    }
    
    @FunctionalInterface
    public interface AddAttributeCallback {
        void run(org.gtk.gtk.CellLayout cellLayout, org.gtk.gtk.CellRenderer cell, java.lang.String attribute, int column);

        @ApiStatus.Internal default void upcall(MemoryAddress cellLayout, MemoryAddress cell, MemoryAddress attribute, int column) {
            run((org.gtk.gtk.CellLayout) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(cellLayout)), org.gtk.gtk.CellLayout.fromAddress).marshal(cellLayout, Ownership.NONE), (org.gtk.gtk.CellRenderer) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(cell)), org.gtk.gtk.CellRenderer.fromAddress).marshal(cell, Ownership.NONE), Marshal.addressToString.marshal(attribute, null), column);
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(AddAttributeCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code add_attribute}
     * @param addAttribute The new value of the field {@code add_attribute}
     */
    public void setAddAttribute(AddAttributeCallback addAttribute) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("add_attribute"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (addAttribute == null ? MemoryAddress.NULL : addAttribute.toCallback()));
    }
    
    @FunctionalInterface
    public interface SetCellDataFuncCallback {
        void run(org.gtk.gtk.CellLayout cellLayout, org.gtk.gtk.CellRenderer cell, @Nullable org.gtk.gtk.CellLayoutDataFunc func, org.gtk.glib.DestroyNotify destroy);

        @ApiStatus.Internal default void upcall(MemoryAddress cellLayout, MemoryAddress cell, MemoryAddress func, MemoryAddress funcData, MemoryAddress destroy) {
            run((org.gtk.gtk.CellLayout) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(cellLayout)), org.gtk.gtk.CellLayout.fromAddress).marshal(cellLayout, Ownership.NONE), (org.gtk.gtk.CellRenderer) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(cell)), org.gtk.gtk.CellRenderer.fromAddress).marshal(cell, Ownership.NONE), null /* Unsupported parameter type */, null /* Unsupported parameter type */);
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(SetCellDataFuncCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code set_cell_data_func}
     * @param setCellDataFunc The new value of the field {@code set_cell_data_func}
     */
    public void setSetCellDataFunc(SetCellDataFuncCallback setCellDataFunc) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("set_cell_data_func"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (setCellDataFunc == null ? MemoryAddress.NULL : setCellDataFunc.toCallback()));
    }
    
    @FunctionalInterface
    public interface ClearAttributesCallback {
        void run(org.gtk.gtk.CellLayout cellLayout, org.gtk.gtk.CellRenderer cell);

        @ApiStatus.Internal default void upcall(MemoryAddress cellLayout, MemoryAddress cell) {
            run((org.gtk.gtk.CellLayout) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(cellLayout)), org.gtk.gtk.CellLayout.fromAddress).marshal(cellLayout, Ownership.NONE), (org.gtk.gtk.CellRenderer) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(cell)), org.gtk.gtk.CellRenderer.fromAddress).marshal(cell, Ownership.NONE));
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(ClearAttributesCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code clear_attributes}
     * @param clearAttributes The new value of the field {@code clear_attributes}
     */
    public void setClearAttributes(ClearAttributesCallback clearAttributes) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("clear_attributes"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (clearAttributes == null ? MemoryAddress.NULL : clearAttributes.toCallback()));
    }
    
    @FunctionalInterface
    public interface ReorderCallback {
        void run(org.gtk.gtk.CellLayout cellLayout, org.gtk.gtk.CellRenderer cell, int position);

        @ApiStatus.Internal default void upcall(MemoryAddress cellLayout, MemoryAddress cell, int position) {
            run((org.gtk.gtk.CellLayout) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(cellLayout)), org.gtk.gtk.CellLayout.fromAddress).marshal(cellLayout, Ownership.NONE), (org.gtk.gtk.CellRenderer) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(cell)), org.gtk.gtk.CellRenderer.fromAddress).marshal(cell, Ownership.NONE), position);
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(ReorderCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code reorder}
     * @param reorder The new value of the field {@code reorder}
     */
    public void setReorder(ReorderCallback reorder) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("reorder"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (reorder == null ? MemoryAddress.NULL : reorder.toCallback()));
    }
    
    @FunctionalInterface
    public interface GetCellsCallback {
        org.gtk.glib.List run(org.gtk.gtk.CellLayout cellLayout);

        @ApiStatus.Internal default Addressable upcall(MemoryAddress cellLayout) {
            var RESULT = run((org.gtk.gtk.CellLayout) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(cellLayout)), org.gtk.gtk.CellLayout.fromAddress).marshal(cellLayout, Ownership.NONE));
            return RESULT == null ? MemoryAddress.NULL.address() : (RESULT.handle()).address();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(GetCellsCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code get_cells}
     * @param getCells The new value of the field {@code get_cells}
     */
    public void setGetCells(GetCellsCallback getCells) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("get_cells"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getCells == null ? MemoryAddress.NULL : getCells.toCallback()));
    }
    
    @FunctionalInterface
    public interface GetAreaCallback {
        @Nullable org.gtk.gtk.CellArea run(org.gtk.gtk.CellLayout cellLayout);

        @ApiStatus.Internal default Addressable upcall(MemoryAddress cellLayout) {
            var RESULT = run((org.gtk.gtk.CellLayout) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(cellLayout)), org.gtk.gtk.CellLayout.fromAddress).marshal(cellLayout, Ownership.NONE));
            return RESULT == null ? MemoryAddress.NULL.address() : (RESULT.handle()).address();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(GetAreaCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code get_area}
     * @param getArea The new value of the field {@code get_area}
     */
    public void setGetArea(GetAreaCallback getArea) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("get_area"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getArea == null ? MemoryAddress.NULL : getArea.toCallback()));
    }
    
    /**
     * Create a CellLayoutIface proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected CellLayoutIface(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, CellLayoutIface> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new CellLayoutIface(input, ownership);
    
    /**
     * A {@link CellLayoutIface.Builder} object constructs a {@link CellLayoutIface} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link CellLayoutIface.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final CellLayoutIface struct;
        
        private Builder() {
            struct = CellLayoutIface.allocate();
        }
        
         /**
         * Finish building the {@link CellLayoutIface} struct.
         * @return A new instance of {@code CellLayoutIface} with the fields 
         *         that were set in the Builder object.
         */
        public CellLayoutIface build() {
            return struct;
        }
        
        public Builder setGIface(org.gtk.gobject.TypeInterface gIface) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("g_iface"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (gIface == null ? MemoryAddress.NULL : gIface.handle()));
            return this;
        }
        
        public Builder setPackStart(PackStartCallback packStart) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("pack_start"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (packStart == null ? MemoryAddress.NULL : packStart.toCallback()));
            return this;
        }
        
        public Builder setPackEnd(PackEndCallback packEnd) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("pack_end"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (packEnd == null ? MemoryAddress.NULL : packEnd.toCallback()));
            return this;
        }
        
        public Builder setClear(ClearCallback clear) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("clear"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (clear == null ? MemoryAddress.NULL : clear.toCallback()));
            return this;
        }
        
        public Builder setAddAttribute(AddAttributeCallback addAttribute) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("add_attribute"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (addAttribute == null ? MemoryAddress.NULL : addAttribute.toCallback()));
            return this;
        }
        
        public Builder setSetCellDataFunc(SetCellDataFuncCallback setCellDataFunc) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("set_cell_data_func"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (setCellDataFunc == null ? MemoryAddress.NULL : setCellDataFunc.toCallback()));
            return this;
        }
        
        public Builder setClearAttributes(ClearAttributesCallback clearAttributes) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("clear_attributes"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (clearAttributes == null ? MemoryAddress.NULL : clearAttributes.toCallback()));
            return this;
        }
        
        public Builder setReorder(ReorderCallback reorder) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("reorder"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (reorder == null ? MemoryAddress.NULL : reorder.toCallback()));
            return this;
        }
        
        public Builder setGetCells(GetCellsCallback getCells) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_cells"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getCells == null ? MemoryAddress.NULL : getCells.toCallback()));
            return this;
        }
        
        public Builder setGetArea(GetAreaCallback getArea) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_area"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getArea == null ? MemoryAddress.NULL : getArea.toCallback()));
            return this;
        }
    }
}
