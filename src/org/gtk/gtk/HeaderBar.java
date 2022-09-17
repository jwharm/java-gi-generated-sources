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
 * custom titlebar widget of a <code>GtkWindow</code> (see {@link org.gtk.gtk.Window#setTitlebar}),
 * as it gives features typical of titlebars while allowing the addition of
 * child widgets.
 * <p>
 * <h2>GtkHeaderBar as GtkBuildable</h2>
 * <p>
 * The <code>GtkHeaderBar</code> implementation of the <code>GtkBuildable</code> interface supports
 * adding children at the start or end sides by specifying &#8220;start&#8221; or &#8220;end&#8221; as
 * the &#8220;type&#8221; attribute of a &#60;child&#62; element, or setting the title widget by
 * specifying &#8220;title&#8221; value.
 * <p>
 * By default the <code>GtkHeaderBar</code> uses a <code>GtkLabel</code> displaying the title of the
 * window it is contained in as the title widget, equivalent to the following
 * UI definition:
 * <p><pre>xml
 * &#60;object class=&#34;GtkHeaderBar&#34;&#62;
 *   &#60;property name=&#34;title-widget&#34;&#62;
 *     &#60;object class=&#34;GtkLabel&#34;&#62;
 *       &#60;property name=&#34;label&#34; translatable=&#34;yes&#34;&#62;Label&#60;/property&#62;
 *       &#60;property name=&#34;single-line-mode&#34;&#62;True&#60;/property&#62;
 *       &#60;property name=&#34;ellipsize&#34;&#62;end&#60;/property&#62;
 *       &#60;property name=&#34;width-chars&#34;&#62;5&#60;/property&#62;
 *       &#60;style&#62;
 *         &#60;class name=&#34;title&#34;/&#62;
 *       &#60;/style&#62;
 *     &#60;/object&#62;
 *   &#60;/property&#62;
 * &#60;/object&#62;
 * </pre>
 * <p>
 * <h1>SS nodes</h1>
 * <p><pre>
 * headerbar
 * &#9584;&#9472;&#9472; windowhandle
 *     &#9584;&#9472;&#9472; box
 *         &#9500;&#9472;&#9472; box.start
 *         &#9474;   &#9500;&#9472;&#9472; windowcontrols.start
 *         &#9474;   &#9584;&#9472;&#9472; {@link [other children]}
 *         &#9500;&#9472;&#9472; {@link [Title Widget]}
 *         &#9584;&#9472;&#9472; box.end
 *             &#9500;&#9472;&#9472; {@link [other children]}
 *             &#9584;&#9472;&#9472; windowcontrols.end
 * </pre>
 * <p>
 * A <code>GtkHeaderBar</code>&#39;s CSS node is called <code>headerbar</code>. It contains a <code>windowhandle</code>
 * subnode, which contains a <code>box</code> subnode, which contains two <code>box</code> subnodes at
 * the start and end of the header bar, as well as a center node that represents
 * the title.
 * <p>
 * Each of the boxes contains a <code>windowcontrols</code> subnode, see
 * {@link org.gtk.gtk.WindowControls} for details, as well as other children.
 * <p>
 * <h1>ccessibility</h1>
 * <p><code>GtkHeaderBar</code> uses the {@link org.gtk.gtk.AccessibleRole#GROUP} role.
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
     * See {@link org.gtk.gtk.HeaderBar#setTitleWidget}.
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
     * {@link org.gtk.gtk.HeaderBar#packStart},
     * {@link org.gtk.gtk.HeaderBar#packEnd} or
     * {@link org.gtk.gtk.HeaderBar#setTitleWidget}.
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
     * For example, &#8220;icon:minimize,maximize,close&#8221; specifies a icon
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
     * When set to <code>NULL,</code> the headerbar will display the title of
     * the window it is contained in.
     * 
     * The title should help a user identify the current view.
     * To achieve the same style as the builtin title, use the
     * &#8220;title&#8221; style class.
     * 
     * You should set the title widget to <code>NULL,</code> for the window
     * title label to be visible again.
     */
    public void setTitleWidget(Widget titleWidget) {
        gtk_h.gtk_header_bar_set_title_widget(handle(), titleWidget.handle());
    }
    
}
