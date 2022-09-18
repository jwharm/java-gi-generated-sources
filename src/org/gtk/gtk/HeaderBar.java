package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * <code>GtkHeaderBar</code> is a widget for creating custom title bars for windows.
 * <p>
 * !{@link [An example GtkHeaderBar]}(headerbar.png)
 * <p><code>GtkHeaderBar</code> is similar to a horizontal <code>GtkCenterBox</code>. It allows
 * children to be placed at the start or the end. In addition, it allows
 * the window title to be displayed. The title will be centered with respect
 * to the width of the box, even if the children at either side take up
 * different amounts of space.
 * <p><code>GtkHeaderBar</code> can add typical window frame controls, such as minimize,
 * maximize and close buttons, or the window icon.
 * <p>
 * For these reasons, <code>GtkHeaderBar</code> is the natural choice for use as the
 * custom titlebar widget of a <code>GtkWindow</code> (see {@link org.gtk.gtk.Window<code>#setTitlebar</code> ),
 * as it gives features typical of titlebars while allowing the addition of
 * child widgets.
 * <p>
 * <h2>GtkHeaderBar as GtkBuildable</h2>
 * <p>
 * The <code>GtkHeaderBar</code> implementation of the <code>GtkBuildable</code> interface supports
 * adding children at the start or end sides by specifying &<code>#8220</code> start&<code>#8221</code>  or &<code>#8220</code> end&<code>#8221</code>  as
 * the &<code>#8220</code> type&<code>#8221</code>  attribute of a &<code>#60</code> child&<code>#62</code>  element, or setting the title widget by
 * specifying &<code>#8220</code> title&<code>#8221</code>  value.
 * <p>
 * By default the <code>GtkHeaderBar</code> uses a <code>GtkLabel</code> displaying the title of the
 * window it is contained in as the title widget, equivalent to the following
 * UI definition:
 * <p><pre>xml
 * &<code>#60</code> object class=&<code>#34</code> GtkHeaderBar&<code>#34</code> &<code>#62</code> 
 *   &<code>#60</code> property name=&<code>#34</code> title-widget&<code>#34</code> &<code>#62</code> 
 *     &<code>#60</code> object class=&<code>#34</code> GtkLabel&<code>#34</code> &<code>#62</code> 
 *       &<code>#60</code> property name=&<code>#34</code> label&<code>#34</code>  translatable=&<code>#34</code> yes&<code>#34</code> &<code>#62</code> Label&<code>#60</code> /property&<code>#62</code> 
 *       &<code>#60</code> property name=&<code>#34</code> single-line-mode&<code>#34</code> &<code>#62</code> True&<code>#60</code> /property&<code>#62</code> 
 *       &<code>#60</code> property name=&<code>#34</code> ellipsize&<code>#34</code> &<code>#62</code> end&<code>#60</code> /property&<code>#62</code> 
 *       &<code>#60</code> property name=&<code>#34</code> width-chars&<code>#34</code> &<code>#62</code> 5&<code>#60</code> /property&<code>#62</code> 
 *       &<code>#60</code> style&<code>#62</code> 
 *         &<code>#60</code> class name=&<code>#34</code> title&<code>#34</code> /&<code>#62</code> 
 *       &<code>#60</code> /style&<code>#62</code> 
 *     &<code>#60</code> /object&<code>#62</code> 
 *   &<code>#60</code> /property&<code>#62</code> 
 * &<code>#60</code> /object&<code>#62</code> 
 * </pre>
 * <p>
 * <h1>CSS nodes</h1>
 * <p><pre>
 * headerbar
 * &<code>#9584</code> &<code>#9472</code> &<code>#9472</code>  windowhandle
 *     &<code>#9584</code> &<code>#9472</code> &<code>#9472</code>  box
 *         &<code>#9500</code> &<code>#9472</code> &<code>#9472</code>  box.start
 *         &<code>#9474</code>    &<code>#9500</code> &<code>#9472</code> &<code>#9472</code>  windowcontrols.start
 *         &<code>#9474</code>    &<code>#9584</code> &<code>#9472</code> &<code>#9472</code>  {@link [other children]}
 *         &<code>#9500</code> &<code>#9472</code> &<code>#9472</code>  {@link [Title Widget]}
 *         &<code>#9584</code> &<code>#9472</code> &<code>#9472</code>  box.end
 *             &<code>#9500</code> &<code>#9472</code> &<code>#9472</code>  {@link [other children]}
 *             &<code>#9584</code> &<code>#9472</code> &<code>#9472</code>  windowcontrols.end
 * </pre>
 * <p>
 * A <code>GtkHeaderBar</code>&<code>#39</code> s CSS node is called <code>headerbar</code>. It contains a <code>windowhandle</code>
 * subnode, which contains a <code>box</code> subnode, which contains two <code>box</code> subnodes at
 * the start and end of the header bar, as well as a center node that represents
 * the title.
 * <p>
 * Each of the boxes contains a <code>windowcontrols</code> subnode, see
 * {@link org.gtk.gtk.WindowControls} for details, as well as other children.
 * <p>
 * <h1>Accessibility</h1>
 * <p><code>GtkHeaderBar</code> uses the {@link org.gtk.gtk.AccessibleRole<code>#GROUP</code>  role.
 */
public class HeaderBar extends Widget implements Accessible, Buildable, ConstraintTarget {

    public HeaderBar(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to HeaderBar */
    public static HeaderBar castFrom(org.gtk.gobject.Object gobject) {
        return new HeaderBar(gobject.getReference());
    }
    
    private static Reference constructNew() {
        Reference RESULT = References.get(gtk_h.gtk_header_bar_new(), false);
        return RESULT;
    }
    
    /**
     * Creates a new <code>GtkHeaderBar</code> widget.
     */
    public HeaderBar() {
        super(constructNew());
    }
    
    /**
     * Gets the decoration layout of the <code>GtkHeaderBar</code>.
     */
    public java.lang.String getDecorationLayout() {
        var RESULT = gtk_h.gtk_header_bar_get_decoration_layout(handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Returns whether this header bar shows the standard window
     * title buttons.
     */
    public boolean getShowTitleButtons() {
        var RESULT = gtk_h.gtk_header_bar_get_show_title_buttons(handle());
        return (RESULT != 0);
    }
    
    /**
     * Retrieves the title widget of the header.
     * 
     * See {@link org.gtk.gtk.HeaderBar<code>#setTitleWidget</code> .
     */
    public Widget getTitleWidget() {
        var RESULT = gtk_h.gtk_header_bar_get_title_widget(handle());
        return new Widget(References.get(RESULT, false));
    }
    
    /**
     * Adds @child to @bar, packed with reference to the
     * end of the @bar.
     */
    public void packEnd(Widget child) {
        gtk_h.gtk_header_bar_pack_end(handle(), child.handle());
    }
    
    /**
     * Adds @child to @bar, packed with reference to the
     * start of the @bar.
     */
    public void packStart(Widget child) {
        gtk_h.gtk_header_bar_pack_start(handle(), child.handle());
    }
    
    /**
     * Removes a child from the <code>GtkHeaderBar</code>.
     * 
     * The child must have been added with
     * {@link org.gtk.gtk.HeaderBar<code>#packStart</code> ,
     * {@link org.gtk.gtk.HeaderBar<code>#packEnd</code>  or
     * {@link org.gtk.gtk.HeaderBar<code>#setTitleWidget</code> .
     */
    public void remove(Widget child) {
        gtk_h.gtk_header_bar_remove(handle(), child.handle());
    }
    
    /**
     * Sets the decoration layout for this header bar.
     * 
     * This property overrides the
     * {@link [property@Gtk.Settings:gtk-decoration-layout] (ref=property)} setting.
     * 
     * There can be valid reasons for overriding the setting, such
     * as a header bar design that does not allow for buttons to take
     * room on the right, or only offers room for a single close button.
     * Split header bars are another example for overriding the setting.
     * 
     * The format of the string is button names, separated by commas.
     * A colon separates the buttons that should appear on the left
     * from those on the right. Recognized button names are minimize,
     * maximize, close and icon (the window icon).
     * 
     * For example, &<code>#8220</code> icon:minimize,maximize,close&<code>#8221</code>  specifies a icon
     * on the left, and minimize, maximize and close buttons on the right.
     */
    public void setDecorationLayout(java.lang.String layout) {
        gtk_h.gtk_header_bar_set_decoration_layout(handle(), Interop.allocateNativeString(layout).handle());
    }
    
    /**
     * Sets whether this header bar shows the standard window
     * title buttons.
     */
    public void setShowTitleButtons(boolean setting) {
        gtk_h.gtk_header_bar_set_show_title_buttons(handle(), setting ? 1 : 0);
    }
    
    /**
     * Sets the title for the <code>GtkHeaderBar</code>.
     * 
     * When set to <code>null</code>  the headerbar will display the title of
     * the window it is contained in.
     * 
     * The title should help a user identify the current view.
     * To achieve the same style as the builtin title, use the
     * &<code>#8220</code> title&<code>#8221</code>  style class.
     * 
     * You should set the title widget to <code>null</code>  for the window
     * title label to be visible again.
     */
    public void setTitleWidget(Widget titleWidget) {
        gtk_h.gtk_header_bar_set_title_widget(handle(), titleWidget.handle());
    }
    
}
