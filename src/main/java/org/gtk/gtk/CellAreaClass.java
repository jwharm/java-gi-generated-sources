package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

public class CellAreaClass extends io.github.jwharm.javagi.ResourceBase {

    public CellAreaClass(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    static final MethodHandle gtk_cell_area_class_find_cell_property = Interop.downcallHandle(
        "gtk_cell_area_class_find_cell_property",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Finds a cell property of a cell area class by name.
     */
    public org.gtk.gobject.ParamSpec findCellProperty(java.lang.String propertyName) {
        try {
            var RESULT = (MemoryAddress) gtk_cell_area_class_find_cell_property.invokeExact(handle(), Interop.allocateNativeString(propertyName).handle());
            return new org.gtk.gobject.ParamSpec(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_cell_area_class_install_cell_property = Interop.downcallHandle(
        "gtk_cell_area_class_install_cell_property",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Installs a cell property on a cell area class.
     */
    public void installCellProperty(int propertyId, org.gtk.gobject.ParamSpec pspec) {
        try {
            gtk_cell_area_class_install_cell_property.invokeExact(handle(), propertyId, pspec.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_cell_area_class_list_cell_properties = Interop.downcallHandle(
        "gtk_cell_area_class_list_cell_properties",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns all cell properties of a cell area class.
     */
    public PointerIterator<org.gtk.gobject.ParamSpec> listCellProperties(PointerInteger nProperties) {
        try {
            var RESULT = (MemoryAddress) gtk_cell_area_class_list_cell_properties.invokeExact(handle(), nProperties.handle());
            return new PointerProxy<org.gtk.gobject.ParamSpec>(RESULT, org.gtk.gobject.ParamSpec.class).iterator();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
}
