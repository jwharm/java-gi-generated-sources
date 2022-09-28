package org.gnome.adw;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * A {@link org.gtk.gtk.ListBoxRow} used to reveal widgets.
 * <p>
 * &lt;picture&gt;
 *   &lt;source srcset="expander-row-dark.png" media="(prefers-color-scheme: dark)"&gt;
 *   &lt;img src="expander-row.png" alt="expander-row"&gt;
 * &lt;/picture&gt;
 * <p>
 * The {@code AdwExpanderRow} widget allows the user to reveal or hide widgets below
 * it. It also allows the user to enable the expansion of the row, allowing to
 * disable all that the row contains.
 * <p>
 * <h2>AdwExpanderRow as GtkBuildable</h2>
 * <p>
 * The {@code AdwExpanderRow} implementation of the {@code Gtk.Buildable} interface
 * supports adding a child as an action widget by specifying “action” as the
 * “type” attribute of a &lt;child&gt; element.
 * <p>
 * It also supports adding it as a prefix widget by specifying “prefix” as the
 * “type” attribute of a &lt;child&gt; element.
 * <p>
 * <h2>CSS nodes</h2>
 * <p>
 * {@code AdwExpanderRow} has a main CSS node with name {@code row} and the {@code .expander}
 * style class. It has the {@code .empty} style class when it contains no children.
 * <p>
 * It contains the subnodes {@code row.header} for its main embedded row,
 * {@code list.nested} for the list it can expand, and {@code image.expander-row-arrow} for
 * its arrow.
 */
public class ExpanderRow extends PreferencesRow implements org.gtk.gtk.Accessible, org.gtk.gtk.Actionable, org.gtk.gtk.Buildable, org.gtk.gtk.ConstraintTarget {

    public ExpanderRow(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to ExpanderRow */
    public static ExpanderRow castFrom(org.gtk.gobject.Object gobject) {
        return new ExpanderRow(gobject.getReference());
    }
    
    private static Reference constructNew() {
        Reference RESULT = References.get(gtk_h.adw_expander_row_new(), false);
        return RESULT;
    }
    
    /**
     * Creates a new {@code AdwExpanderRow}.
     */
    public ExpanderRow() {
        super(constructNew());
    }
    
    /**
     * Adds an action widget to {@code self}.
     */
    public void addAction(org.gtk.gtk.Widget widget) {
        gtk_h.adw_expander_row_add_action(handle(), widget.handle());
    }
    
    /**
     * Adds a prefix widget to {@code self}.
     */
    public void addPrefix(org.gtk.gtk.Widget widget) {
        gtk_h.adw_expander_row_add_prefix(handle(), widget.handle());
    }
    
    /**
     * Adds a widget to {@code self}.
     * <p>
     * The widget will appear in the expanding list below {@code self}.
     */
    public void addRow(org.gtk.gtk.Widget child) {
        gtk_h.adw_expander_row_add_row(handle(), child.handle());
    }
    
    /**
     * Gets whether the expansion of {@code self} is enabled.
     */
    public boolean getEnableExpansion() {
        var RESULT = gtk_h.adw_expander_row_get_enable_expansion(handle());
        return RESULT != 0;
    }
    
    /**
     * Gets whether {@code self} is expanded.
     */
    public boolean getExpanded() {
        var RESULT = gtk_h.adw_expander_row_get_expanded(handle());
        return RESULT != 0;
    }
    
    /**
     * Gets the icon name for {@code self}.
     */
    public java.lang.String getIconName() {
        var RESULT = gtk_h.adw_expander_row_get_icon_name(handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Gets whether the switch enabling the expansion of {@code self} is visible.
     */
    public boolean getShowEnableSwitch() {
        var RESULT = gtk_h.adw_expander_row_get_show_enable_switch(handle());
        return RESULT != 0;
    }
    
    /**
     * Gets the subtitle for {@code self}.
     */
    public java.lang.String getSubtitle() {
        var RESULT = gtk_h.adw_expander_row_get_subtitle(handle());
        return RESULT.getUtf8String(0);
    }
    
    public void remove(org.gtk.gtk.Widget child) {
        gtk_h.adw_expander_row_remove(handle(), child.handle());
    }
    
    /**
     * Sets whether the expansion of {@code self} is enabled.
     */
    public void setEnableExpansion(boolean enableExpansion) {
        gtk_h.adw_expander_row_set_enable_expansion(handle(), enableExpansion ? 1 : 0);
    }
    
    /**
     * Sets whether {@code self} is expanded.
     */
    public void setExpanded(boolean expanded) {
        gtk_h.adw_expander_row_set_expanded(handle(), expanded ? 1 : 0);
    }
    
    /**
     * Sets the icon name for {@code self}.
     */
    public void setIconName(java.lang.String iconName) {
        gtk_h.adw_expander_row_set_icon_name(handle(), Interop.allocateNativeString(iconName).handle());
    }
    
    /**
     * Sets whether the switch enabling the expansion of {@code self} is visible.
     */
    public void setShowEnableSwitch(boolean showEnableSwitch) {
        gtk_h.adw_expander_row_set_show_enable_switch(handle(), showEnableSwitch ? 1 : 0);
    }
    
    /**
     * Sets the subtitle for {@code self}.
     */
    public void setSubtitle(java.lang.String subtitle) {
        gtk_h.adw_expander_row_set_subtitle(handle(), Interop.allocateNativeString(subtitle).handle());
    }
    
}
