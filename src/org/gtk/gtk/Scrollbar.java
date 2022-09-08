package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * The `GtkScrollbar` widget is a horizontal or vertical scrollbar.
 * 
 * ![An example GtkScrollbar](scrollbar.png)
 * 
 * Its position and movement are controlled by the adjustment that is passed to
 * or created by [ctor@Gtk.Scrollbar.new]. See [class@Gtk.Adjustment] for more
 * details. The [property@Gtk.Adjustment:value] field sets the position of the
 * thumb and must be between [property@Gtk.Adjustment:lower] and
 * [property@Gtk.Adjustment:upper] - [property@Gtk.Adjustment:page-size].
 * The [property@Gtk.Adjustment:page-size] represents the size of the visible
 * scrollable area.
 * 
 * The fields [property@Gtk.Adjustment:step-increment] and
 * [property@Gtk.Adjustment:page-increment] fields are added to or subtracted
 * from the [property@Gtk.Adjustment:value] when the user asks to move by a step
 * (using e.g. the cursor arrow keys) or by a page (using e.g. the Page Down/Up
 * keys).
 * 
 * # CSS nodes
 * 
 * ```
 * scrollbar
 * ╰── range[.fine-tune]
 *     ╰── trough
 *         ╰── slider
 * ```
 * 
 * `GtkScrollbar` has a main CSS node with name scrollbar and a subnode for its
 * contents. The main node gets the .horizontal or .vertical style classes applied,
 * depending on the scrollbar's orientation.
 * 
 * The range node gets the style class .fine-tune added when the scrollbar is
 * in 'fine-tuning' mode.
 * 
 * Other style classes that may be added to scrollbars inside
 * [class@Gtk.ScrolledWindow] include the positional classes (.left, .right,
 * .top, .bottom) and style classes related to overlay scrolling (.overlay-indicator,
 * .dragging, .hovering).
 * 
 * # Accessibility
 * 
 * `GtkScrollbar` uses the %GTK_ACCESSIBLE_ROLE_SCROLLBAR role.
 */
public class Scrollbar extends Widget implements Accessible, Buildable, ConstraintTarget, Orientable {

    public Scrollbar(io.github.jwharm.javagi.interop.Reference reference) {
        super(reference);
    }
    
    /** Cast object to Scrollbar */
    public static Scrollbar castFrom(org.gtk.gobject.Object gobject) {
        return new Scrollbar(gobject.getReference());
    }
    
    /**
     * Creates a new scrollbar with the given orientation.
     */
    public Scrollbar(Orientation orientation, Adjustment adjustment) {
        super(References.get(gtk_h.gtk_scrollbar_new(orientation.getValue(), adjustment.handle()), false));
    }
    
    /**
     * Returns the scrollbar's adjustment.
     */
    public Adjustment getAdjustment() {
        var RESULT = gtk_h.gtk_scrollbar_get_adjustment(handle());
        return new Adjustment(References.get(RESULT, false));
    }
    
    /**
     * Makes the scrollbar use the given adjustment.
     */
    public void setAdjustment(Adjustment adjustment) {
        gtk_h.gtk_scrollbar_set_adjustment(handle(), adjustment.handle());
    }
    
}
