package org.gtk.gtk;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * {@code GtkHeaderBar} is a widget for creating custom title bars for windows.
 * <p>
 * <img src="./doc-files/headerbar.png" alt="An example GtkHeaderBar">
 * <p>
 * {@code GtkHeaderBar} is similar to a horizontal {@code GtkCenterBox}. It allows
 * children to be placed at the start or the end. In addition, it allows
 * the window title to be displayed. The title will be centered with respect
 * to the width of the box, even if the children at either side take up
 * different amounts of space.
 * <p>
 * {@code GtkHeaderBar} can add typical window frame controls, such as minimize,
 * maximize and close buttons, or the window icon.
 * <p>
 * For these reasons, {@code GtkHeaderBar} is the natural choice for use as the
 * custom titlebar widget of a {@code GtkWindow} (see {@link Window#setTitlebar}),
 * as it gives features typical of titlebars while allowing the addition of
 * child widgets.
 * <p>
 * <h2>GtkHeaderBar as GtkBuildable</h2>
 * <p>
 * The {@code GtkHeaderBar} implementation of the {@code GtkBuildable} interface supports
 * adding children at the start or end sides by specifying “start” or “end” as
 * the “type” attribute of a &lt;child&gt; element, or setting the title widget by
 * specifying “title” value.
 * <p>
 * By default the {@code GtkHeaderBar} uses a {@code GtkLabel} displaying the title of the
 * window it is contained in as the title widget, equivalent to the following
 * UI definition:
 * <p>
 * <pre>{@code xml
 * <object class="GtkHeaderBar">
 *   <property name="title-widget">
 *     <object class="GtkLabel">
 *       <property name="label" translatable="yes">Label</property>
 *       <property name="single-line-mode">True</property>
 *       <property name="ellipsize">end</property>
 *       <property name="width-chars">5</property>
 *       <style>
 *         <class name="title"/>
 *       </style>
 *     </object>
 *   </property>
 * </object>
 * }</pre>
 * <p>
 * <h1>CSS nodes</h1>
 * <p>
 * <pre>{@code 
 * headerbar
 * ╰── windowhandle
 *     ╰── box
 *         ├── box.start
 *         │   ├── windowcontrols.start
 *         │   ╰── [other children]
 *         ├── [Title Widget]
 *         ╰── box.end
 *             ├── [other children]
 *             ╰── windowcontrols.end
 * }</pre>
 * <p>
 * A {@code GtkHeaderBar}'s CSS node is called {@code headerbar}. It contains a {@code windowhandle}
 * subnode, which contains a {@code box} subnode, which contains two {@code box} subnodes at
 * the start and end of the header bar, as well as a center node that represents
 * the title.
 * <p>
 * Each of the boxes contains a {@code windowcontrols} subnode, see
 * {@link WindowControls} for details, as well as other children.
 * <p>
 * <h1>Accessibility</h1>
 * <p>
 * {@code GtkHeaderBar} uses the {@link AccessibleRole#GROUP} role.
 */
public class HeaderBar extends Widget implements Accessible, Buildable, ConstraintTarget {

    public HeaderBar(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to HeaderBar */
    public static HeaderBar castFrom(org.gtk.gobject.Object gobject) {
        return new HeaderBar(gobject.refcounted());
    }
    
    private static Refcounted constructNew() {
        Refcounted RESULT = Refcounted.get(gtk_h.gtk_header_bar_new(), false);
        return RESULT;
    }
    
    /**
     * Creates a new {@code GtkHeaderBar} widget.
     */
    public HeaderBar() {
        super(constructNew());
    }
    
    /**
     * Gets the decoration layout of the {@code GtkHeaderBar}.
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
        return RESULT != 0;
    }
    
    /**
     * Retrieves the title widget of the header.
     * <p>
     * See {@link HeaderBar#setTitleWidget}.
     */
    public Widget getTitleWidget() {
        var RESULT = gtk_h.gtk_header_bar_get_title_widget(handle());
        return new Widget(Refcounted.get(RESULT, false));
    }
    
    /**
     * Adds {@code child} to {@code bar}, packed with reference to the
     * end of the {@code bar}.
     */
    public void packEnd(Widget child) {
        gtk_h.gtk_header_bar_pack_end(handle(), child.handle());
    }
    
    /**
     * Adds {@code child} to {@code bar}, packed with reference to the
     * start of the {@code bar}.
     */
    public void packStart(Widget child) {
        gtk_h.gtk_header_bar_pack_start(handle(), child.handle());
    }
    
    /**
     * Removes a child from the {@code GtkHeaderBar}.
     * <p>
     * The child must have been added with
     * {@link HeaderBar#packStart},
     * {@link HeaderBar#packEnd} or
     * {@link HeaderBar#setTitleWidget}.
     */
    public void remove(Widget child) {
        gtk_h.gtk_header_bar_remove(handle(), child.handle());
    }
    
    /**
     * Sets the decoration layout for this header bar.
     * <p>
     * This property overrides the
     * {@code Gtk.Settings:gtk-decoration-layout} setting.
     * <p>
     * There can be valid reasons for overriding the setting, such
     * as a header bar design that does not allow for buttons to take
     * room on the right, or only offers room for a single close button.
     * Split header bars are another example for overriding the setting.
     * <p>
     * The format of the string is button names, separated by commas.
     * A colon separates the buttons that should appear on the left
     * from those on the right. Recognized button names are minimize,
     * maximize, close and icon (the window icon).
     * <p>
     * For example, “icon:minimize,maximize,close” specifies a icon
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
     * Sets the title for the {@code GtkHeaderBar}.
     * <p>
     * When set to {@code null}, the headerbar will display the title of
     * the window it is contained in.
     * <p>
     * The title should help a user identify the current view.
     * To achieve the same style as the builtin title, use the
     * “title” style class.
     * <p>
     * You should set the title widget to {@code null}, for the window
     * title label to be visible again.
     */
    public void setTitleWidget(Widget titleWidget) {
        gtk_h.gtk_header_bar_set_title_widget(handle(), titleWidget.handle());
    }
    
}
