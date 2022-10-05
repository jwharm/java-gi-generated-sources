package org.gnome.adw;

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

    public ExpanderRow(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to ExpanderRow */
    public static ExpanderRow castFrom(org.gtk.gobject.Object gobject) {
        return new ExpanderRow(gobject.refcounted());
    }
    
    static final MethodHandle adw_expander_row_new = Interop.downcallHandle(
        "adw_expander_row_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNew() {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) adw_expander_row_new.invokeExact(), false);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a new {@code AdwExpanderRow}.
     */
    public ExpanderRow() {
        super(constructNew());
    }
    
    static final MethodHandle adw_expander_row_add_action = Interop.downcallHandle(
        "adw_expander_row_add_action",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Adds an action widget to {@code self}.
     */
    public void addAction(org.gtk.gtk.Widget widget) {
        try {
            adw_expander_row_add_action.invokeExact(handle(), widget.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle adw_expander_row_add_prefix = Interop.downcallHandle(
        "adw_expander_row_add_prefix",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Adds a prefix widget to {@code self}.
     */
    public void addPrefix(org.gtk.gtk.Widget widget) {
        try {
            adw_expander_row_add_prefix.invokeExact(handle(), widget.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle adw_expander_row_add_row = Interop.downcallHandle(
        "adw_expander_row_add_row",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Adds a widget to {@code self}.
     * <p>
     * The widget will appear in the expanding list below {@code self}.
     */
    public void addRow(org.gtk.gtk.Widget child) {
        try {
            adw_expander_row_add_row.invokeExact(handle(), child.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle adw_expander_row_get_enable_expansion = Interop.downcallHandle(
        "adw_expander_row_get_enable_expansion",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets whether the expansion of {@code self} is enabled.
     */
    public boolean getEnableExpansion() {
        try {
            var RESULT = (int) adw_expander_row_get_enable_expansion.invokeExact(handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle adw_expander_row_get_expanded = Interop.downcallHandle(
        "adw_expander_row_get_expanded",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets whether {@code self} is expanded.
     */
    public boolean getExpanded() {
        try {
            var RESULT = (int) adw_expander_row_get_expanded.invokeExact(handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle adw_expander_row_get_icon_name = Interop.downcallHandle(
        "adw_expander_row_get_icon_name",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the icon name for {@code self}.
     */
    public java.lang.String getIconName() {
        try {
            var RESULT = (MemoryAddress) adw_expander_row_get_icon_name.invokeExact(handle());
            return RESULT.getUtf8String(0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle adw_expander_row_get_show_enable_switch = Interop.downcallHandle(
        "adw_expander_row_get_show_enable_switch",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets whether the switch enabling the expansion of {@code self} is visible.
     */
    public boolean getShowEnableSwitch() {
        try {
            var RESULT = (int) adw_expander_row_get_show_enable_switch.invokeExact(handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle adw_expander_row_get_subtitle = Interop.downcallHandle(
        "adw_expander_row_get_subtitle",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the subtitle for {@code self}.
     */
    public java.lang.String getSubtitle() {
        try {
            var RESULT = (MemoryAddress) adw_expander_row_get_subtitle.invokeExact(handle());
            return RESULT.getUtf8String(0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle adw_expander_row_remove = Interop.downcallHandle(
        "adw_expander_row_remove",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    public void remove(org.gtk.gtk.Widget child) {
        try {
            adw_expander_row_remove.invokeExact(handle(), child.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle adw_expander_row_set_enable_expansion = Interop.downcallHandle(
        "adw_expander_row_set_enable_expansion",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets whether the expansion of {@code self} is enabled.
     */
    public void setEnableExpansion(boolean enableExpansion) {
        try {
            adw_expander_row_set_enable_expansion.invokeExact(handle(), enableExpansion ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle adw_expander_row_set_expanded = Interop.downcallHandle(
        "adw_expander_row_set_expanded",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets whether {@code self} is expanded.
     */
    public void setExpanded(boolean expanded) {
        try {
            adw_expander_row_set_expanded.invokeExact(handle(), expanded ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle adw_expander_row_set_icon_name = Interop.downcallHandle(
        "adw_expander_row_set_icon_name",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets the icon name for {@code self}.
     */
    public void setIconName(java.lang.String iconName) {
        try {
            adw_expander_row_set_icon_name.invokeExact(handle(), Interop.allocateNativeString(iconName).handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle adw_expander_row_set_show_enable_switch = Interop.downcallHandle(
        "adw_expander_row_set_show_enable_switch",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets whether the switch enabling the expansion of {@code self} is visible.
     */
    public void setShowEnableSwitch(boolean showEnableSwitch) {
        try {
            adw_expander_row_set_show_enable_switch.invokeExact(handle(), showEnableSwitch ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle adw_expander_row_set_subtitle = Interop.downcallHandle(
        "adw_expander_row_set_subtitle",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets the subtitle for {@code self}.
     */
    public void setSubtitle(java.lang.String subtitle) {
        try {
            adw_expander_row_set_subtitle.invokeExact(handle(), Interop.allocateNativeString(subtitle).handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
}
