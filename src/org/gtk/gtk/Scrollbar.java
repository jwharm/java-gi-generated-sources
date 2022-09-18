package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * The <code>GtkScrollbar</code> widget is a horizontal or vertical scrollbar.
 * <p>
 * !{@link [An example GtkScrollbar]}(scrollbar.png)
 * <p>
 * Its position and movement are controlled by the adjustment that is passed to
 * or created by {@link [ctor@Gtk.Scrollbar.new] (ref=ctor)}. See {@link org.gtk.gtk.Adjustment} for more
 * details. The {@link [property@Gtk.Adjustment:value] (ref=property)} field sets the position of the
 * thumb and must be between {@link [property@Gtk.Adjustment:lower] (ref=property)} and
 * {@link [property@Gtk.Adjustment:upper] (ref=property)} - {@link [property@Gtk.Adjustment:page-size] (ref=property)}.
 * The {@link [property@Gtk.Adjustment:page-size] (ref=property)} represents the size of the visible
 * scrollable area.
 * <p>
 * The fields {@link [property@Gtk.Adjustment:step-increment] (ref=property)} and
 * {@link [property@Gtk.Adjustment:page-increment] (ref=property)} fields are added to or subtracted
 * from the {@link [property@Gtk.Adjustment:value] (ref=property)} when the user asks to move by a step
 * (using e.g. the cursor arrow keys) or by a page (using e.g. the Page Down/Up
 * keys).
 * <p>
 * <h1>CSS nodes</h1>
 * <p><pre>
 * scrollbar
 * &<code>#9584</code> &<code>#9472</code> &<code>#9472</code>  range{@link [.fine-tune]}
 *     &<code>#9584</code> &<code>#9472</code> &<code>#9472</code>  trough
 *         &<code>#9584</code> &<code>#9472</code> &<code>#9472</code>  slider
 * </pre>
 * <p><code>GtkScrollbar</code> has a main CSS node with name scrollbar and a subnode for its
 * contents. The main node gets the .horizontal or .vertical style classes applied,
 * depending on the scrollbar&<code>#39</code> s orientation.
 * <p>
 * The range node gets the style class .fine-tune added when the scrollbar is
 * in &<code>#39</code> fine-tuning&<code>#39</code>  mode.
 * <p>
 * Other style classes that may be added to scrollbars inside
 * {@link org.gtk.gtk.ScrolledWindow} include the positional classes (.left, .right,
 * .top, .bottom) and style classes related to overlay scrolling (.overlay-indicator,
 * .dragging, .hovering).
 * <p>
 * <h1>Accessibility</h1>
 * <p><code>GtkScrollbar</code> uses the {@link org.gtk.gtk.AccessibleRole<code>#SCROLLBAR</code>  role.
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
     * Returns the scrollbar&<code>#39</code> s adjustment.
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
