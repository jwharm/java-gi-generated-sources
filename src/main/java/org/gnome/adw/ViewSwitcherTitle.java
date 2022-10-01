package org.gnome.adw;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * A view switcher title.
 * <p>
 * &lt;picture&gt;
 *   &lt;source srcset="view-switcher-title-dark.png" media="(prefers-color-scheme: dark)"&gt;
 *   &lt;img src="view-switcher-title.png" alt="view-switcher-title"&gt;
 * &lt;/picture&gt;
 * <p>
 * A widget letting you switch between multiple views contained by a
 * {@code ViewSwitcher}.
 * <p>
 * It is designed to be used as the title widget of a {@link HeaderBar}, and
 * will display the window's title when the window is too narrow to fit the view
 * switcher e.g. on mobile phones, or if there are less than two views.
 * <p>
 * In order to center the title in narrow windows, the header bar should have
 * {@code HeaderBar:centering-policy} set to
 * {@code ADW_CENTERING_POLICY_STRICT}.
 * <p>
 * {@code AdwViewSwitcherTitle} is intended to be used together with
 * {@link ViewSwitcherBar}.
 * <p>
 * A common use case is to bind the {@code ViewSwitcherBar:reveal} property
 * to {@code ViewSwitcherTitle:title-visible} to automatically reveal the
 * view switcher bar when the title label is displayed in place of the view
 * switcher, as follows:
 * <p>
 * <pre>{@code xml
 * <object class="GtkWindow">
 *   <child type="titlebar">
 *     <object class="AdwHeaderBar">
 *       <property name="centering-policy">strict</property>
 *       <child type="title">
 *         <object class="AdwViewSwitcherTitle" id="title">
 *           <property name="stack">stack</property>
 *         </object>
 *       </child>
 *     </object>
 *   </child>
 *   <child>
 *     <object class="GtkBox">
 *       <property name="orientation">vertical</property>
 *       <child>
 *         <object class="AdwViewStack" id="stack"/>
 *       </child>
 *       <child>
 *         <object class="AdwViewSwitcherBar">
 *           <property name="stack">stack</property>
 *           <binding name="reveal">
 *             <lookup name="title-visible">title</lookup>
 *           </binding>
 *         </object>
 *       </child>
 *     </object>
 *   </child>
 * </object>
 * }</pre>
 * <p>
 * <h2>CSS nodes</h2>
 * <p>
 * {@code AdwViewSwitcherTitle} has a single CSS node with name {@code viewswitchertitle}.
 */
public class ViewSwitcherTitle extends org.gtk.gtk.Widget implements org.gtk.gtk.Accessible, org.gtk.gtk.Buildable, org.gtk.gtk.ConstraintTarget {

    public ViewSwitcherTitle(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to ViewSwitcherTitle */
    public static ViewSwitcherTitle castFrom(org.gtk.gobject.Object gobject) {
        return new ViewSwitcherTitle(gobject.refcounted());
    }
    
    private static Refcounted constructNew() {
        Refcounted RESULT = Refcounted.get(gtk_h.adw_view_switcher_title_new(), false);
        return RESULT;
    }
    
    /**
     * Creates a new {@code AdwViewSwitcherTitle}.
     */
    public ViewSwitcherTitle() {
        super(constructNew());
    }
    
    /**
     * Gets the stack controlled by {@code self}.
     */
    public ViewStack getStack() {
        var RESULT = gtk_h.adw_view_switcher_title_get_stack(handle());
        return new ViewStack(Refcounted.get(RESULT, false));
    }
    
    /**
     * Gets the subtitle of {@code self}.
     */
    public java.lang.String getSubtitle() {
        var RESULT = gtk_h.adw_view_switcher_title_get_subtitle(handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Gets the title of {@code self}.
     */
    public java.lang.String getTitle() {
        var RESULT = gtk_h.adw_view_switcher_title_get_title(handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Gets whether the title of {@code self} is currently visible.
     */
    public boolean getTitleVisible() {
        var RESULT = gtk_h.adw_view_switcher_title_get_title_visible(handle());
        return RESULT != 0;
    }
    
    /**
     * Gets whether {@code self}'s view switcher is enabled.
     */
    public boolean getViewSwitcherEnabled() {
        var RESULT = gtk_h.adw_view_switcher_title_get_view_switcher_enabled(handle());
        return RESULT != 0;
    }
    
    /**
     * Sets the stack controlled by {@code self}.
     */
    public void setStack(ViewStack stack) {
        gtk_h.adw_view_switcher_title_set_stack(handle(), stack.handle());
    }
    
    /**
     * Sets the subtitle of {@code self}.
     */
    public void setSubtitle(java.lang.String subtitle) {
        gtk_h.adw_view_switcher_title_set_subtitle(handle(), Interop.allocateNativeString(subtitle).handle());
    }
    
    /**
     * Sets the title of {@code self}.
     */
    public void setTitle(java.lang.String title) {
        gtk_h.adw_view_switcher_title_set_title(handle(), Interop.allocateNativeString(title).handle());
    }
    
    /**
     * Sets whether {@code self}'s view switcher is enabled.
     */
    public void setViewSwitcherEnabled(boolean enabled) {
        gtk_h.adw_view_switcher_title_set_view_switcher_enabled(handle(), enabled ? 1 : 0);
    }
    
}
