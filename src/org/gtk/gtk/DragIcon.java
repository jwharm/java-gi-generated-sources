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
    
    /**
     * Creates a widget that can be used as a drag icon for the given
     * @value.
     * 
     * Supported types include strings, `GdkRGBA` and `GtkTextBuffer`.
     * If GTK does not know how to create a widget for a given value,
     * it will return %NULL.
     * 
     * This method is used to set the default drag icon on drag-and-drop
     * operations started by `GtkDragSource`, so you don't need to set
     * a drag icon using this function there.
     */
    public static Widget createWidgetForValue(org.gtk.gobject.Value value) {
        var RESULT = gtk_h.gtk_drag_icon_create_widget_for_value(value.handle());
        return new Widget(References.get(RESULT, true));
    }
    
    /**
     * Gets the `GtkDragIcon` in use with @drag.
     * 
     * If no drag icon exists yet, a new one will be created
     * and shown.
     */
    public static Widget getForDrag(org.gtk.gdk.Drag drag) {
        var RESULT = gtk_h.gtk_drag_icon_get_for_drag(drag.handle());
        return new Widget(References.get(RESULT, false));
    }
    
    /**
     * Creates a `GtkDragIcon` that shows @paintable, and associates
     * it with the drag operation.
     * 
     * The hotspot position on the paintable is aligned with the
     * hotspot of the cursor.
     */
    public static void setFromPaintable(org.gtk.gdk.Drag drag, org.gtk.gdk.Paintable paintable, int hotX, int hotY) {
        gtk_h.gtk_drag_icon_set_from_paintable(drag.handle(), paintable.handle(), hotX, hotY);
    }
    
}
