package org.gnome.adw;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * A title bar widget.
 * <p>
 * &lt;picture&gt;
 *   &lt;source srcset="header-bar-dark.png" media="(prefers-color-scheme: dark)"&gt;
 *   &lt;img src="header-bar.png" alt="header-bar"&gt;
 * &lt;/picture&gt;
 * <p>
 * {@code AdwHeaderBar} is similar to {@link org.gtk.gtk.HeaderBar}, but provides additional
 * features compared to it. Refer to {@code GtkHeaderBar} for details.
 * <p>
 * {@code HeaderBar:centering-policy} allows to enforce strict centering of
 * the title widget, this is useful for {@link ViewSwitcherTitle}.
 * <p>
 * {@code HeaderBar:show-start-title-buttons} and
 * {@code HeaderBar:show-end-title-buttons} allow to easily create split
 * header bar layouts using {@link Leaflet}, as follows:
 * <p>
 * <pre>{@code xml
 * <object class="AdwLeaflet" id="leaflet">
 *   <child>
 *     <object class="GtkBox">
 *       <property name="orientation">vertical</property>
 *       <child>
 *         <object class="AdwHeaderBar">
 *           <binding name="show-end-title-buttons">
 *             <lookup name="folded">leaflet</lookup>
 *           </binding>
 *         </object>
 *       </child>
 *       <!-- ... -->
 *     </object>
 *   </child>
 *   <!-- ... -->
 *   <child>
 *     <object class="GtkBox">
 *       <property name="orientation">vertical</property>
 *       <property name="hexpand">True</property>
 *       <child>
 *         <object class="AdwHeaderBar">
 *           <binding name="show-start-title-buttons">
 *             <lookup name="folded">leaflet</lookup>
 *           </binding>
 *         </object>
 *       </child>
 *       <!-- ... -->
 *     </object>
 *   </child>
 * </object>
 * }</pre>
 * <p>
 * &lt;picture&gt;
 *   &lt;source srcset="header-bar-split-dark.png" media="(prefers-color-scheme: dark)"&gt;
 *   &lt;img src="header-bar-split.png" alt="header-bar-split"&gt;
 * &lt;/picture&gt;
 * <p>
 * <h2>CSS nodes</h2>
 * <p>
 * <pre>{@code 
 * headerbar
 * ╰── windowhandle
 *     ╰── box
 *         ├── widget
 *         │   ╰── box.start
 *         │       ├── windowcontrols.start
 *         │       ╰── [other children]
 *         ├── [Title Widget]
 *         ╰── widget
 *             ╰── box.end
 *                 ├── [other children]
 *                 ╰── windowcontrols.end
 * }</pre>
 * <p>
 * {@code AdwHeaderBar}'s CSS node is called {@code headerbar}. It contains a {@code windowhandle}
 * subnode, which contains a {@code box} subnode, which contains two {@code widget} subnodes
 * at the start and end of the header bar, each of which contains a {@code box}
 * subnode with the {@code .start} and {@code .end} style classes respectively, as well as a
 * center node that represents the title.
 * <p>
 * Each of the boxes contains a {@code windowcontrols} subnode, see
 * {@link org.gtk.gtk.WindowControls} for details, as well as other children.
 * <p>
 * <h2>Accessibility</h2>
 * <p>
 * {@code AdwHeaderBar} uses the {@code GTK_ACCESSIBLE_ROLE_GROUP} role.
 */
public class HeaderBar extends org.gtk.gtk.Widget implements org.gtk.gtk.Accessible, org.gtk.gtk.Buildable, org.gtk.gtk.ConstraintTarget {

    public HeaderBar(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to HeaderBar */
    public static HeaderBar castFrom(org.gtk.gobject.Object gobject) {
        return new HeaderBar(gobject.refcounted());
    }
    
    private static Refcounted constructNew() {
        Refcounted RESULT = Refcounted.get(gtk_h.adw_header_bar_new(), false);
        return RESULT;
    }
    
    /**
     * Creates a new {@code AdwHeaderBar}.
     */
    public HeaderBar() {
        super(constructNew());
    }
    
    /**
     * Gets the policy for aligning the center widget.
     */
    public CenteringPolicy getCenteringPolicy() {
        var RESULT = gtk_h.adw_header_bar_get_centering_policy(handle());
        return new CenteringPolicy(RESULT);
    }
    
    /**
     * Gets the decoration layout for {@code self}.
     */
    public java.lang.String getDecorationLayout() {
        var RESULT = gtk_h.adw_header_bar_get_decoration_layout(handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Gets whether to show title buttons at the end of {@code self}.
     */
    public boolean getShowEndTitleButtons() {
        var RESULT = gtk_h.adw_header_bar_get_show_end_title_buttons(handle());
        return RESULT != 0;
    }
    
    /**
     * Gets whether to show title buttons at the start of {@code self}.
     */
    public boolean getShowStartTitleButtons() {
        var RESULT = gtk_h.adw_header_bar_get_show_start_title_buttons(handle());
        return RESULT != 0;
    }
    
    /**
     * Gets the title widget widget of {@code self}.
     */
    public org.gtk.gtk.Widget getTitleWidget() {
        var RESULT = gtk_h.adw_header_bar_get_title_widget(handle());
        return new org.gtk.gtk.Widget(Refcounted.get(RESULT, false));
    }
    
    /**
     * Adds {@code child} to {@code self}, packed with reference to the end of {@code self}.
     */
    public void packEnd(org.gtk.gtk.Widget child) {
        gtk_h.adw_header_bar_pack_end(handle(), child.handle());
    }
    
    /**
     * Adds {@code child} to {@code self}, packed with reference to the start of the {@code self}.
     */
    public void packStart(org.gtk.gtk.Widget child) {
        gtk_h.adw_header_bar_pack_start(handle(), child.handle());
    }
    
    /**
     * Removes a child from {@code self}.
     * <p>
     * The child must have been added with {@link HeaderBar#packStart},
     * {@code HeaderBar:title-widget}.
     */
    public void remove(org.gtk.gtk.Widget child) {
        gtk_h.adw_header_bar_remove(handle(), child.handle());
    }
    
    /**
     * Sets the policy for aligning the center widget.
     */
    public void setCenteringPolicy(CenteringPolicy centeringPolicy) {
        gtk_h.adw_header_bar_set_centering_policy(handle(), centeringPolicy.getValue());
    }
    
    /**
     * Sets the decoration layout for {@code self}.
     */
    public void setDecorationLayout(java.lang.String layout) {
        gtk_h.adw_header_bar_set_decoration_layout(handle(), Interop.allocateNativeString(layout).handle());
    }
    
    /**
     * Sets whether to show title buttons at the end of {@code self}.
     */
    public void setShowEndTitleButtons(boolean setting) {
        gtk_h.adw_header_bar_set_show_end_title_buttons(handle(), setting ? 1 : 0);
    }
    
    /**
     * Sets whether to show title buttons at the start of {@code self}.
     */
    public void setShowStartTitleButtons(boolean setting) {
        gtk_h.adw_header_bar_set_show_start_title_buttons(handle(), setting ? 1 : 0);
    }
    
    /**
     * Sets the title widget for {@code self}.
     */
    public void setTitleWidget(org.gtk.gtk.Widget titleWidget) {
        gtk_h.adw_header_bar_set_title_widget(handle(), titleWidget.handle());
    }
    
}
