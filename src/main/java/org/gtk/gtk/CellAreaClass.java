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
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
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
     * Allocate a new {@link CellAreaClass}
     * @return A new, uninitialized @{link CellAreaClass}
     */
    public static CellAreaClass allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        CellAreaClass newInstance = new CellAreaClass(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a CellAreaClass proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public CellAreaClass(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Finds a cell property of a cell area class by name.
     * @param propertyName the name of the child property to find
     * @return the {@code GParamSpec} of the child property
     */
    public @NotNull org.gtk.gobject.ParamSpec findCellProperty(@NotNull java.lang.String propertyName) {
        java.util.Objects.requireNonNull(propertyName, "Parameter 'propertyName' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_cell_area_class_find_cell_property.invokeExact(
                    handle(),
                    Interop.allocateNativeString(propertyName));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gobject.ParamSpec(RESULT, Ownership.NONE);
    }
    
    /**
     * Installs a cell property on a cell area class.
     * @param propertyId the id for the property
     * @param pspec the {@code GParamSpec} for the property
     */
    public void installCellProperty(int propertyId, @NotNull org.gtk.gobject.ParamSpec pspec) {
        java.util.Objects.requireNonNull(pspec, "Parameter 'pspec' must not be null");
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
    public @NotNull org.gtk.gobject.ParamSpec[] listCellProperties(Out<Integer> nProperties) {
        java.util.Objects.requireNonNull(nProperties, "Parameter 'nProperties' must not be null");
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
            resultARRAY[I] = new org.gtk.gobject.ParamSpec(OBJ, Ownership.CONTAINER);
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
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private CellAreaClass struct;
        
         /**
         * A {@link CellAreaClass.Build} object constructs a {@link CellAreaClass} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = CellAreaClass.allocate();
        }
        
         /**
         * Finish building the {@link CellAreaClass} struct.
         * @return A new instance of {@code CellAreaClass} with the fields 
         *         that were set in the Build object.
         */
        public CellAreaClass construct() {
            return struct;
        }
        
        public Build setParentClass(org.gtk.gobject.InitiallyUnownedClass parent_class) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("parent_class"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (parent_class == null ? MemoryAddress.NULL : parent_class.handle()));
            return this;
        }
        
        public Build setAdd(java.lang.foreign.MemoryAddress add) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("add"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (add == null ? MemoryAddress.NULL : add));
            return this;
        }
        
        public Build setRemove(java.lang.foreign.MemoryAddress remove) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("remove"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (remove == null ? MemoryAddress.NULL : remove));
            return this;
        }
        
        public Build setForeach(java.lang.foreign.MemoryAddress foreach) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("foreach"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (foreach == null ? MemoryAddress.NULL : foreach));
            return this;
        }
        
        public Build setForeachAlloc(java.lang.foreign.MemoryAddress foreach_alloc) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("foreach_alloc"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (foreach_alloc == null ? MemoryAddress.NULL : foreach_alloc));
            return this;
        }
        
        public Build setEvent(java.lang.foreign.MemoryAddress event) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("event"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (event == null ? MemoryAddress.NULL : event));
            return this;
        }
        
        public Build setSnapshot(java.lang.foreign.MemoryAddress snapshot) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("snapshot"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (snapshot == null ? MemoryAddress.NULL : snapshot));
            return this;
        }
        
        public Build setApplyAttributes(java.lang.foreign.MemoryAddress apply_attributes) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("apply_attributes"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (apply_attributes == null ? MemoryAddress.NULL : apply_attributes));
            return this;
        }
        
        public Build setCreateContext(java.lang.foreign.MemoryAddress create_context) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("create_context"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (create_context == null ? MemoryAddress.NULL : create_context));
            return this;
        }
        
        public Build setCopyContext(java.lang.foreign.MemoryAddress copy_context) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("copy_context"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (copy_context == null ? MemoryAddress.NULL : copy_context));
            return this;
        }
        
        public Build setGetRequestMode(java.lang.foreign.MemoryAddress get_request_mode) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_request_mode"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (get_request_mode == null ? MemoryAddress.NULL : get_request_mode));
            return this;
        }
        
        public Build setGetPreferredWidth(java.lang.foreign.MemoryAddress get_preferred_width) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_preferred_width"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (get_preferred_width == null ? MemoryAddress.NULL : get_preferred_width));
            return this;
        }
        
        public Build setGetPreferredHeightForWidth(java.lang.foreign.MemoryAddress get_preferred_height_for_width) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_preferred_height_for_width"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (get_preferred_height_for_width == null ? MemoryAddress.NULL : get_preferred_height_for_width));
            return this;
        }
        
        public Build setGetPreferredHeight(java.lang.foreign.MemoryAddress get_preferred_height) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_preferred_height"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (get_preferred_height == null ? MemoryAddress.NULL : get_preferred_height));
            return this;
        }
        
        public Build setGetPreferredWidthForHeight(java.lang.foreign.MemoryAddress get_preferred_width_for_height) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_preferred_width_for_height"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (get_preferred_width_for_height == null ? MemoryAddress.NULL : get_preferred_width_for_height));
            return this;
        }
        
        public Build setSetCellProperty(java.lang.foreign.MemoryAddress set_cell_property) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("set_cell_property"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (set_cell_property == null ? MemoryAddress.NULL : set_cell_property));
            return this;
        }
        
        public Build setGetCellProperty(java.lang.foreign.MemoryAddress get_cell_property) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_cell_property"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (get_cell_property == null ? MemoryAddress.NULL : get_cell_property));
            return this;
        }
        
        public Build setFocus(java.lang.foreign.MemoryAddress focus) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("focus"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (focus == null ? MemoryAddress.NULL : focus));
            return this;
        }
        
        public Build setIsActivatable(java.lang.foreign.MemoryAddress is_activatable) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("is_activatable"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (is_activatable == null ? MemoryAddress.NULL : is_activatable));
            return this;
        }
        
        public Build setActivate(java.lang.foreign.MemoryAddress activate) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("activate"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (activate == null ? MemoryAddress.NULL : activate));
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
