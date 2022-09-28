package org.gnome.adw;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * A view switcher action bar.
 * <p>
 * &lt;picture&gt;
 *   &lt;source srcset="view-switcher-bar-dark.png" media="(prefers-color-scheme: dark)"&gt;
 *   &lt;img src="view-switcher-bar.png" alt="view-switcher-bar"&gt;
 * &lt;/picture&gt;
 * <p>
 * An action bar letting you switch between multiple views contained in a
 * {@code ViewSwitcher}. It is designed to be put at
 * the bottom of a window and to be revealed only on really narrow windows, e.g.
 * on mobile phones. It can't be revealed if there are less than two pages.
 * <p>
 * {@code AdwViewSwitcherBar} is intended to be used together with
 * {@link ViewSwitcherTitle}.
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
 * {@code AdwViewSwitcherBar} has a single CSS node with name{@code  viewswitcherbar}.
 */
public class ViewSwitcherBar extends org.gtk.gtk.Widget implements org.gtk.gtk.Accessible, org.gtk.gtk.Buildable, org.gtk.gtk.ConstraintTarget {

    public ViewSwitcherBar(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to ViewSwitcherBar */
    public static ViewSwitcherBar castFrom(org.gtk.gobject.Object gobject) {
        return new ViewSwitcherBar(gobject.getReference());
    }
    
    private static Reference constructNew() {
        Reference RESULT = References.get(gtk_h.adw_view_switcher_bar_new(), false);
        return RESULT;
    }
    
    /**
     * Creates a new {@code AdwViewSwitcherBar}.
     */
    public ViewSwitcherBar() {
        super(constructNew());
    }
    
    /**
     * Gets whether {@code self} should be revealed or hidden.
     */
    public boolean getReveal() {
        var RESULT = gtk_h.adw_view_switcher_bar_get_reveal(handle());
        return RESULT != 0;
    }
    
    /**
     * Gets the stack controlled by {@code self}.
     */
    public ViewStack getStack() {
        var RESULT = gtk_h.adw_view_switcher_bar_get_stack(handle());
        return new ViewStack(References.get(RESULT, false));
    }
    
    /**
     * Sets whether {@code self} should be revealed or hidden.
     */
    public void setReveal(boolean reveal) {
        gtk_h.adw_view_switcher_bar_set_reveal(handle(), reveal ? 1 : 0);
    }
    
    /**
     * Sets the stack controlled by {@code self}.
     */
    public void setStack(ViewStack stack) {
        gtk_h.adw_view_switcher_bar_set_stack(handle(), stack.handle());
    }
    
}
