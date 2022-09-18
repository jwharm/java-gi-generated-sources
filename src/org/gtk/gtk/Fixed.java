package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * <code>GtkFixed</code> places its child widgets at fixed positions and with fixed sizes.
 * <p><code>GtkFixed</code> performs no automatic layout management.
 * <p>
 * For most applications, you should not use this container! It keeps
 * you from having to learn about the other GTK containers, but it
 * results in broken applications.  With <code>GtkFixed</code>, the following
 * things will result in truncated text, overlapping widgets, and
 * other display bugs:
 * <p>
 * <li>Themes, which may change widget sizes.
 * <p>
 * <li>Fonts other than the one you used to write the app will of course
 *   change the size of widgets containing text; keep in mind that
 *   users may use a larger font because of difficulty reading the
 *   default, or they may be using a different OS that provides different fonts.
 * <p>
 * <li>Translation of text into other languages changes its size. Also,
 *   display of non-English text will use a different font in many
 *   cases.
 * <p>
 * In addition, <code>GtkFixed</code> does not pay attention to text direction and
 * thus may produce unwanted results if your app is run under right-to-left
 * languages such as Hebrew or Arabic. That is: normally GTK will order
 * containers appropriately for the text direction, e.g. to put labels to
 * the right of the thing they label when using an RTL language, but it can&<code>#8217</code> t
 * do that with <code>GtkFixed</code>. So if you need to reorder widgets depending on
 * the text direction, you would need to manually detect it and adjust child
 * positions accordingly.
 * <p>
 * Finally, fixed positioning makes it kind of annoying to add/remove
 * UI elements, since you have to reposition all the other elements. This
 * is a long-term maintenance problem for your application.
 * <p>
 * If you know none of these things are an issue for your application,
 * and prefer the simplicity of <code>GtkFixed</code>, by all means use the
 * widget. But you should be aware of the tradeoffs.
 */
public class Fixed extends Widget implements Accessible, Buildable, ConstraintTarget {

    public Fixed(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to Fixed */
    public static Fixed castFrom(org.gtk.gobject.Object gobject) {
        return new Fixed(gobject.getReference());
    }
    
    private static Reference constructNew() {
        Reference RESULT = References.get(gtk_h.gtk_fixed_new(), false);
        return RESULT;
    }
    
    /**
     * Creates a new <code>GtkFixed</code>.
     */
    public Fixed() {
        super(constructNew());
    }
    
    /**
     * Retrieves the transformation for @widget set using
     * gtk_fixed_set_child_transform().
     */
    public org.gtk.gsk.Transform getChildTransform(Widget widget) {
        var RESULT = gtk_h.gtk_fixed_get_child_transform(handle(), widget.handle());
        return new org.gtk.gsk.Transform(References.get(RESULT, false));
    }
    
    /**
     * Sets a translation transformation to the given @x and @y
     * coordinates to the child @widget of the <code>GtkFixed</code>.
     */
    public void move(Widget widget, double x, double y) {
        gtk_h.gtk_fixed_move(handle(), widget.handle(), x, y);
    }
    
    /**
     * Adds a widget to a <code>GtkFixed</code> at the given position.
     */
    public void put(Widget widget, double x, double y) {
        gtk_h.gtk_fixed_put(handle(), widget.handle(), x, y);
    }
    
    /**
     * Removes a child from @fixed.
     */
    public void remove(Widget widget) {
        gtk_h.gtk_fixed_remove(handle(), widget.handle());
    }
    
    /**
     * Sets the transformation for @widget.
     * 
     * This is a convenience function that retrieves the
     * {@link org.gtk.gtk.FixedLayoutChild} instance associated to
     * @widget and calls {@link org.gtk.gtk.FixedLayoutChild<code>#setTransform</code> .
     */
    public void setChildTransform(Widget widget, org.gtk.gsk.Transform transform) {
        gtk_h.gtk_fixed_set_child_transform(handle(), widget.handle(), transform.handle());
    }
    
}
