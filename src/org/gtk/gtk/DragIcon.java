package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * `GtkDragIcon` is a `GtkRoot` implementation for drag icons.
 * 
 * A drag icon moves with the pointer during a Drag-and-Drop operation
 * and is destroyed when the drag ends.
 * 
 * To set up a drag icon and associate it with an ongoing drag operation,
 * use [func@Gtk.DragIcon.get_for_drag] to get the icon for a drag. You can
 * then use it like any other widget and use [method@Gtk.DragIcon.set_child]
 * to set whatever widget should be used for the drag icon.
 * 
 * Keep in mind that drag icons do not allow user input.
 */
public class DragIcon extends Widget implements Accessible, Buildable, ConstraintTarget, Native, Root {

    public DragIcon(io.github.jwharm.javagi.interop.Reference reference) {
        super(reference);
    }
    
    /** Cast object to DragIcon */
    public static DragIcon castFrom(org.gtk.gobject.Object gobject) {
        return new DragIcon(gobject.getReference());
    }
    
    /**
     * Gets the widget currently used as drag icon.
     */
    public Widget getChild() {
        var RESULT = gtk_h.gtk_drag_icon_get_child(handle());
        return new Widget(References.get(RESULT, false));
    }
    
    /**
     * Sets the widget to display as the drag icon.
     */
    public void setChild(Widget child) {
        gtk_h.gtk_drag_icon_set_child(handle(), child.handle());
    }
    
}
