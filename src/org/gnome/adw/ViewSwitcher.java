package org.gnome.adw;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * An adaptive view switcher.
 * <p>
 * &lt;picture&gt;
 *   &lt;source srcset="view-switcher-dark.png" media="(prefers-color-scheme: dark)"&gt;
 *   &lt;img src="view-switcher.png" alt="view-switcher"&gt;
 * &lt;/picture&gt;
 * <p>
 * An adaptive view switcher designed to switch between multiple views
 * contained in a {@link ViewStack} in a similar fashion to
 * {@link org.gtk.gtk.StackSwitcher}.
 * <p>
 * {@code AdwViewSwitcher} buttons always have an icon and a label. They can be
 * displayed side by side, or icon on top of the label. This can be controlled
 * via the {@code ViewSwitcher:policy} property.
 * <p>
 * Most applications should be using {@link ViewSwitcherBar} and
 * {@link ViewSwitcherTitle}.
 * <p>
 * <h2>CSS nodes</h2>
 * <p>
 * {@code AdwViewSwitcher} has a single CSS node with name {@code viewswitcher}. It can have
 * the style classes {@code .wide} and {@code .narrow}, matching its policy.
 * <p>
 * <h2>Accessibility</h2>
 * <p>
 * {@code AdwViewSwitcher} uses the {@code GTK_ACCESSIBLE_ROLE_TAB_LIST} role and uses the
 * {@code GTK_ACCESSIBLE_ROLE_TAB} for its buttons.
 */
public class ViewSwitcher extends org.gtk.gtk.Widget implements org.gtk.gtk.Accessible, org.gtk.gtk.Buildable, org.gtk.gtk.ConstraintTarget {

    public ViewSwitcher(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to ViewSwitcher */
    public static ViewSwitcher castFrom(org.gtk.gobject.Object gobject) {
        return new ViewSwitcher(gobject.getReference());
    }
    
    private static Reference constructNew() {
        Reference RESULT = References.get(gtk_h.adw_view_switcher_new(), false);
        return RESULT;
    }
    
    /**
     * Creates a new {@code AdwViewSwitcher}.
     */
    public ViewSwitcher() {
        super(constructNew());
    }
    
    /**
     * Gets the policy of {@code self}.
     */
    public ViewSwitcherPolicy getPolicy() {
        var RESULT = gtk_h.adw_view_switcher_get_policy(handle());
        return new ViewSwitcherPolicy(RESULT);
    }
    
    /**
     * Gets the stack controlled by {@code self}.
     */
    public ViewStack getStack() {
        var RESULT = gtk_h.adw_view_switcher_get_stack(handle());
        return new ViewStack(References.get(RESULT, false));
    }
    
    /**
     * Sets the policy of {@code self}.
     */
    public void setPolicy(ViewSwitcherPolicy policy) {
        gtk_h.adw_view_switcher_set_policy(handle(), policy.getValue());
    }
    
    /**
     * Sets the stack controlled by {@code self}.
     */
    public void setStack(ViewStack stack) {
        gtk_h.adw_view_switcher_set_stack(handle(), stack.handle());
    }
    
}
