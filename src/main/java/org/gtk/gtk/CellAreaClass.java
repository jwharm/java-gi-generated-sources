package org.gtk.gtk;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

public class CellAreaClass extends io.github.jwharm.javagi.ResourceBase {

    public CellAreaClass(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    public CellAreaClass() {
        super(References.get(io.github.jwharm.javagi.interop.jextract.GtkCellAreaClass.allocate(Interop.getAllocator()).address()));
    }
    
    /**
     * Finds a cell property of a cell area class by name.
     */
    public org.gtk.gobject.ParamSpec findCellProperty(java.lang.String propertyName) {
        var RESULT = gtk_h.gtk_cell_area_class_find_cell_property(handle(), Interop.allocateNativeString(propertyName).handle());
        return new org.gtk.gobject.ParamSpec(References.get(RESULT, false));
    }
    
    /**
     * Installs a cell property on a cell area class.
     */
    public void installCellProperty(int propertyId, org.gtk.gobject.ParamSpec pspec) {
        gtk_h.gtk_cell_area_class_install_cell_property(handle(), propertyId, pspec.handle());
    }
    
    /**
     * Returns all cell properties of a cell area class.
     */
    public PointerIterator<org.gtk.gobject.ParamSpec> listCellProperties(PointerInteger nProperties) {
        var RESULT = gtk_h.gtk_cell_area_class_list_cell_properties(handle(), nProperties.handle());
        return new PointerProxy<org.gtk.gobject.ParamSpec>(RESULT, org.gtk.gobject.ParamSpec.class).iterator();
    }
    
}
