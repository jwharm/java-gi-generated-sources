package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * The {@code GtkScrollbar} widget is a horizontal or vertical scrollbar.
 * <p>
 * <img src="./doc-files/scrollbar.png" alt="An example GtkScrollbar">
 * <p>
 * Its position and movement are controlled by the adjustment that is passed to
 * or created by {@code Gtk.Adjustment} for more
 * details. The {@code Gtk.Adjustment:value} field sets the position of the
 * thumb and must be between {@code Gtk.Adjustment:lower} and
 * {@code Gtk.Adjustment:page-size}.
 * The {@code Gtk.Adjustment:page-size} represents the size of the visible
 * scrollable area.
 * <p>
 * The fields {@code Gtk.Adjustment:step-increment} and
 * {@code Gtk.Adjustment:page-increment} fields are added to or subtracted
 * from the {@code Gtk.Adjustment:value} when the user asks to move by a step
 * (using e.g. the cursor arrow keys) or by a page (using e.g. the Page Down/Up
 * keys).
 * <p>
 * <h1>CSS nodes</h1>
 * <p>
 * <pre>{@code 
 * scrollbar
 * ╰── range[.fine-tune]
 *     ╰── trough
 *         ╰── slider
 * }</pre>
 * <p>
 * {@code GtkScrollbar} has a main CSS node with name scrollbar and a subnode for its
 * contents. The main node gets the .horizontal or .vertical style classes applied,
 * depending on the scrollbar's orientation.
 * <p>
 * The range node gets the style class .fine-tune added when the scrollbar is
 * in 'fine-tuning' mode.
 * <p>
 * Other style classes that may be added to scrollbars inside
 * {@link ScrolledWindow} include the positional classes (.left, .right,
 * .top, .bottom) and style classes related to overlay scrolling (.overlay-indicator,
 * .dragging, .hovering).
 * <p>
 * <h1>Accessibility</h1>
 * <p>
 * {@code GtkScrollbar} uses the {@link AccessibleRole#SCROLLBAR} role.
 */
public class Scrollbar extends Widget implements Accessible, Buildable, ConstraintTarget, Orientable {

    public Scrollbar(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to Scrollbar */
    public static Scrollbar castFrom(org.gtk.gobject.Object gobject) {
        return new Scrollbar(gobject.getReference());
    }
    
    private static Reference constructNew(Orientation orientation, Adjustment adjustment) {
        Reference RESULT = References.get(gtk_h.gtk_scrollbar_new(orientation.getValue(), adjustment.handle()), false);
        return RESULT;
    }
    
    /**
     * Creates a new scrollbar with the given orientation.
     */
    public Scrollbar(Orientation orientation, Adjustment adjustment) {
        super(constructNew(orientation, adjustment));
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
