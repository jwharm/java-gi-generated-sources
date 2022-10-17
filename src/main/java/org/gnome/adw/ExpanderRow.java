package org.gnome.adw;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

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
 * 
 * <h2>AdwExpanderRow as GtkBuildable</h2>
 * The {@code AdwExpanderRow} implementation of the {@code Gtk.Buildable} interface
 * supports adding a child as an action widget by specifying “action” as the
 * “type” attribute of a &lt;child&gt; element.
 * <p>
 * It also supports adding it as a prefix widget by specifying “prefix” as the
 * “type” attribute of a &lt;child&gt; element.
 * 
 * <h2>CSS nodes</h2>
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
    
    private static final MethodHandle adw_expander_row_new = Interop.downcallHandle(
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
    
    private static final MethodHandle adw_expander_row_add_action = Interop.downcallHandle(
        "adw_expander_row_add_action",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Adds an action widget to {@code self}.
     */
    public @NotNull void addAction(@NotNull org.gtk.gtk.Widget widget) {
        try {
            adw_expander_row_add_action.invokeExact(handle(), widget.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle adw_expander_row_add_prefix = Interop.downcallHandle(
        "adw_expander_row_add_prefix",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Adds a prefix widget to {@code self}.
     */
    public @NotNull void addPrefix(@NotNull org.gtk.gtk.Widget widget) {
        try {
            adw_expander_row_add_prefix.invokeExact(handle(), widget.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle adw_expander_row_add_row = Interop.downcallHandle(
        "adw_expander_row_add_row",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Adds a widget to {@code self}.
     * <p>
     * The widget will appear in the expanding list below {@code self}.
     */
    public @NotNull void addRow(@NotNull org.gtk.gtk.Widget child) {
        try {
            adw_expander_row_add_row.invokeExact(handle(), child.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle adw_expander_row_get_enable_expansion = Interop.downcallHandle(
        "adw_expander_row_get_enable_expansion",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets whether the expansion of {@code self} is enabled.
     */
    public boolean getEnableExpansion() {
        int RESULT;
        try {
            RESULT = (int) adw_expander_row_get_enable_expansion.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    private static final MethodHandle adw_expander_row_get_expanded = Interop.downcallHandle(
        "adw_expander_row_get_expanded",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets whether {@code self} is expanded.
     */
    public boolean getExpanded() {
        int RESULT;
        try {
            RESULT = (int) adw_expander_row_get_expanded.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    private static final MethodHandle adw_expander_row_get_icon_name = Interop.downcallHandle(
        "adw_expander_row_get_icon_name",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the icon name for {@code self}.
     */
    public @Nullable java.lang.String getIconName() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) adw_expander_row_get_icon_name.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT.getUtf8String(0);
    }
    
    private static final MethodHandle adw_expander_row_get_show_enable_switch = Interop.downcallHandle(
        "adw_expander_row_get_show_enable_switch",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets whether the switch enabling the expansion of {@code self} is visible.
     */
    public boolean getShowEnableSwitch() {
        int RESULT;
        try {
            RESULT = (int) adw_expander_row_get_show_enable_switch.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    private static final MethodHandle adw_expander_row_get_subtitle = Interop.downcallHandle(
        "adw_expander_row_get_subtitle",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the subtitle for {@code self}.
     */
    public @NotNull java.lang.String getSubtitle() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) adw_expander_row_get_subtitle.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT.getUtf8String(0);
    }
    
    private static final MethodHandle adw_expander_row_remove = Interop.downcallHandle(
        "adw_expander_row_remove",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    public @NotNull void remove(@NotNull org.gtk.gtk.Widget child) {
        try {
            adw_expander_row_remove.invokeExact(handle(), child.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle adw_expander_row_set_enable_expansion = Interop.downcallHandle(
        "adw_expander_row_set_enable_expansion",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets whether the expansion of {@code self} is enabled.
     */
    public @NotNull void setEnableExpansion(@NotNull boolean enableExpansion) {
        try {
            adw_expander_row_set_enable_expansion.invokeExact(handle(), enableExpansion ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle adw_expander_row_set_expanded = Interop.downcallHandle(
        "adw_expander_row_set_expanded",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets whether {@code self} is expanded.
     */
    public @NotNull void setExpanded(@NotNull boolean expanded) {
        try {
            adw_expander_row_set_expanded.invokeExact(handle(), expanded ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle adw_expander_row_set_icon_name = Interop.downcallHandle(
        "adw_expander_row_set_icon_name",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets the icon name for {@code self}.
     */
    public @NotNull void setIconName(@Nullable java.lang.String iconName) {
        try {
            adw_expander_row_set_icon_name.invokeExact(handle(), Interop.allocateNativeString(iconName));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle adw_expander_row_set_show_enable_switch = Interop.downcallHandle(
        "adw_expander_row_set_show_enable_switch",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets whether the switch enabling the expansion of {@code self} is visible.
     */
    public @NotNull void setShowEnableSwitch(@NotNull boolean showEnableSwitch) {
        try {
            adw_expander_row_set_show_enable_switch.invokeExact(handle(), showEnableSwitch ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle adw_expander_row_set_subtitle = Interop.downcallHandle(
        "adw_expander_row_set_subtitle",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets the subtitle for {@code self}.
     */
    public @NotNull void setSubtitle(@NotNull java.lang.String subtitle) {
        try {
            adw_expander_row_set_subtitle.invokeExact(handle(), Interop.allocateNativeString(subtitle));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
}
