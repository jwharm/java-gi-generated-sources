package org.gtk.gtk;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * {@code GtkFixedLayout} is a layout manager which can place child widgets
 * at fixed positions.
 * <p>
 * Most applications should never use this layout manager; fixed positioning
 * and sizing requires constant recalculations on where children need to be
 * positioned and sized. Other layout managers perform this kind of work
 * internally so that application developers don't need to do it. Specifically,
 * widgets positioned in a fixed layout manager will need to take into account:
 * <p>
 * <ul>
 * <li>Themes, which may change widget sizes.
 * </ul>
 * <p>
 * <ul>
 * <li>Fonts other than the one you used to write the app will of course
 *   change the size of widgets containing text; keep in mind that
 *   users may use a larger font because of difficulty reading the
 *   default, or they may be using a different OS that provides different
 *   fonts.
 * </ul>
 * <p>
 * <ul>
 * <li>Translation of text into other languages changes its size. Also,
 *   display of non-English text will use a different font in many
 *   cases.
 * </ul>
 * <p>
 * In addition, {@code GtkFixedLayout} does not pay attention to text direction and
 * thus may produce unwanted results if your app is run under right-to-left
 * languages such as Hebrew or Arabic. That is: normally GTK will order
 * containers appropriately depending on the text direction, e.g. to put labels
 * to the right of the thing they label when using an RTL language;
 * {@code GtkFixedLayout} won't be able to do that for you.
 * <p>
 * Finally, fixed positioning makes it kind of annoying to add/remove UI
 * elements, since you have to reposition all the other  elements. This is a
 * long-term maintenance problem for your application.
 */
public class FixedLayout extends LayoutManager {

    public FixedLayout(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to FixedLayout */
    public static FixedLayout castFrom(org.gtk.gobject.Object gobject) {
        return new FixedLayout(gobject.getReference());
    }
    
    private static Reference constructNew() {
        Reference RESULT = References.get(gtk_h.gtk_fixed_layout_new(), true);
        return RESULT;
    }
    
    /**
     * Creates a new {@code GtkFixedLayout}.
     */
    public FixedLayout() {
        super(constructNew());
    }
    
}
