package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class CellAreaClass extends io.github.jwharm.javagi.ResourceBase {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static GroupLayout memoryLayout = MemoryLayout.structLayout(
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
        MemoryLayout.sequenceLayout(8, ValueLayout.ADDRESS).withName("padding")
    ).withName("GtkCellAreaClass");
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    public CellAreaClass(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
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
            RESULT = (MemoryAddress) DowncallHandles.gtk_cell_area_class_find_cell_property.invokeExact(handle(), Interop.allocateNativeString(propertyName));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gobject.ParamSpec(Refcounted.get(RESULT, false));
    }
    
    /**
     * Installs a cell property on a cell area class.
     * @param propertyId the id for the property
     * @param pspec the {@code GParamSpec} for the property
     */
    public void installCellProperty(int propertyId, @NotNull org.gtk.gobject.ParamSpec pspec) {
        java.util.Objects.requireNonNull(pspec, "Parameter 'pspec' must not be null");
        try {
            DowncallHandles.gtk_cell_area_class_install_cell_property.invokeExact(handle(), propertyId, pspec.handle());
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
        MemorySegment nPropertiesPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_INT);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_cell_area_class_list_cell_properties.invokeExact(handle(), (Addressable) nPropertiesPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        nProperties.set(nPropertiesPOINTER.get(ValueLayout.JAVA_INT, 0));
        org.gtk.gobject.ParamSpec[] resultARRAY = new org.gtk.gobject.ParamSpec[nProperties.get().intValue()];
        for (int I = 0; I < nProperties.get().intValue(); I++) {
            var OBJ = RESULT.get(ValueLayout.ADDRESS, I);
            resultARRAY[I] = new org.gtk.gobject.ParamSpec(Refcounted.get(OBJ, false));
        }
        return resultARRAY;
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_cell_area_class_find_cell_property = Interop.downcallHandle(
            "gtk_cell_area_class_find_cell_property",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_cell_area_class_install_cell_property = Interop.downcallHandle(
            "gtk_cell_area_class_install_cell_property",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_cell_area_class_list_cell_properties = Interop.downcallHandle(
            "gtk_cell_area_class_list_cell_properties",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
    }
}
