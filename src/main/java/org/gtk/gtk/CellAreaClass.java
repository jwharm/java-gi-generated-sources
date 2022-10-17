package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class CellAreaClass extends io.github.jwharm.javagi.ResourceBase {

    public CellAreaClass(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    private static final MethodHandle gtk_cell_area_class_find_cell_property = Interop.downcallHandle(
        "gtk_cell_area_class_find_cell_property",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Finds a cell property of a cell area class by name.
     */
    public @NotNull org.gtk.gobject.ParamSpec findCellProperty(@NotNull java.lang.String propertyName) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) gtk_cell_area_class_find_cell_property.invokeExact(handle(), Interop.allocateNativeString(propertyName));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gobject.ParamSpec(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle gtk_cell_area_class_install_cell_property = Interop.downcallHandle(
        "gtk_cell_area_class_install_cell_property",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Installs a cell property on a cell area class.
     */
    public @NotNull void installCellProperty(@NotNull int propertyId, @NotNull org.gtk.gobject.ParamSpec pspec) {
        try {
            gtk_cell_area_class_install_cell_property.invokeExact(handle(), propertyId, pspec.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gtk_cell_area_class_list_cell_properties = Interop.downcallHandle(
        "gtk_cell_area_class_list_cell_properties",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns all cell properties of a cell area class.
     */
    public org.gtk.gobject.ParamSpec[] listCellProperties(@NotNull Out<Integer> nProperties) {
        MemorySegment nPropertiesPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_INT);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) gtk_cell_area_class_list_cell_properties.invokeExact(handle(), (Addressable) nPropertiesPOINTER.address());
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
    
}
