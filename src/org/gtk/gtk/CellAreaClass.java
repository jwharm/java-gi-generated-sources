package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

public class CellAreaClass extends io.github.jwharm.javagi.interop.ResourceBase {

    public CellAreaClass(io.github.jwharm.javagi.interop.Reference reference) {
        super(reference);
    }
    
    /**
     * Finds a cell property of a cell area class by name.
     */
    public org.gtk.gobject.ParamSpec findCellProperty(java.lang.String propertyName) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_cell_area_class_find_cell_property(HANDLE(), Interop.allocateNativeString(propertyName).HANDLE());
        return new org.gtk.gobject.ParamSpec(References.get(RESULT, false));
    }
    
    /**
     * Installs a cell property on a cell area class.
     */
    public void installCellProperty(int propertyId, org.gtk.gobject.ParamSpec pspec) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_cell_area_class_install_cell_property(HANDLE(), propertyId, pspec.HANDLE());
    }
    
}
