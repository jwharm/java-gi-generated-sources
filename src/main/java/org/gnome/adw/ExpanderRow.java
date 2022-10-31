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
 * <p>
 * <strong>AdwExpanderRow as GtkBuildable</strong><br/>
 * The {@code AdwExpanderRow} implementation of the {@code Gtk.Buildable} interface
 * supports adding a child as an action widget by specifying “action” as the
 * “type” attribute of a &lt;child&gt; element.
 * <p>
 * It also supports adding it as a prefix widget by specifying “prefix” as the
 * “type” attribute of a &lt;child&gt; element.
 * <p>
 * <strong>CSS nodes</strong><br/>
 * {@code AdwExpanderRow} has a main CSS node with name {@code row} and the {@code .expander}
 * style class. It has the {@code .empty} style class when it contains no children.
 * <p>
 * It contains the subnodes {@code row.header} for its main embedded row,
 * {@code list.nested} for the list it can expand, and {@code image.expander-row-arrow} for
 * its arrow.
 * @version 1.0
 */
public class ExpanderRow extends org.gnome.adw.PreferencesRow implements org.gtk.gtk.Accessible, org.gtk.gtk.Actionable, org.gtk.gtk.Buildable, org.gtk.gtk.ConstraintTarget {
    
    static {
        Adw.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "AdwExpanderRow";
    
    private static GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gnome.adw.PreferencesRow.getMemoryLayout().withName("parent_instance")
    ).withName(C_TYPE_NAME);
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    /**
     * Get the value of the field {@code parent_instance}
     * @return The value of the field {@code parent_instance}
     */
    public org.gnome.adw.PreferencesRow parent_instance$get() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("parent_instance"));
        return new org.gnome.adw.PreferencesRow(Refcounted.get(((MemoryAddress) handle()).addOffset(OFFSET), false));
    }
    
    @ApiStatus.Internal
    public ExpanderRow(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /**
     * Cast object to ExpanderRow if its GType is a (or inherits from) "AdwExpanderRow".
     * @param  gobject            An object that inherits from GObject
     * @return                    An instance of "ExpanderRow" that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "AdwExpanderRow", a ClassCastException will be thrown.
     */
    public static ExpanderRow castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), org.gtk.gobject.GObject.typeFromName("AdwExpanderRow"))) {
            return new ExpanderRow(gobject.refcounted());
        } else {
            throw new ClassCastException("Object type is not an instance of AdwExpanderRow");
        }
    }
    
    private static Refcounted constructNew() {
        Refcounted RESULT;
        try {
            RESULT = Refcounted.get((MemoryAddress) DowncallHandles.adw_expander_row_new.invokeExact(), false);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
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
     * @param widget a widget
     */
    public void addAction(@NotNull org.gtk.gtk.Widget widget) {
        java.util.Objects.requireNonNull(widget, "Parameter 'widget' must not be null");
        try {
            DowncallHandles.adw_expander_row_add_action.invokeExact(
                    handle(),
                    widget.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Adds a prefix widget to {@code self}.
     * @param widget a widget
     */
    public void addPrefix(@NotNull org.gtk.gtk.Widget widget) {
        java.util.Objects.requireNonNull(widget, "Parameter 'widget' must not be null");
        try {
            DowncallHandles.adw_expander_row_add_prefix.invokeExact(
                    handle(),
                    widget.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Adds a widget to {@code self}.
     * <p>
     * The widget will appear in the expanding list below {@code self}.
     * @param child a widget
     */
    public void addRow(@NotNull org.gtk.gtk.Widget child) {
        java.util.Objects.requireNonNull(child, "Parameter 'child' must not be null");
        try {
            DowncallHandles.adw_expander_row_add_row.invokeExact(
                    handle(),
                    child.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Gets whether the expansion of {@code self} is enabled.
     * @return whether the expansion of {@code self} is enabled.
     */
    public boolean getEnableExpansion() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.adw_expander_row_get_enable_expansion.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Gets whether {@code self} is expanded.
     * @return whether {@code self} is expanded
     */
    public boolean getExpanded() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.adw_expander_row_get_expanded.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Gets the icon name for {@code self}.
     * @return the icon name for {@code self}
     */
    public @Nullable java.lang.String getIconName() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.adw_expander_row_get_icon_name.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Gets whether the switch enabling the expansion of {@code self} is visible.
     * @return whether the switch enabling the expansion is visible
     */
    public boolean getShowEnableSwitch() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.adw_expander_row_get_show_enable_switch.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Gets the subtitle for {@code self}.
     * @return the subtitle for {@code self}
     */
    public @NotNull java.lang.String getSubtitle() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.adw_expander_row_get_subtitle.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    public void remove(@NotNull org.gtk.gtk.Widget child) {
        java.util.Objects.requireNonNull(child, "Parameter 'child' must not be null");
        try {
            DowncallHandles.adw_expander_row_remove.invokeExact(
                    handle(),
                    child.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets whether the expansion of {@code self} is enabled.
     * @param enableExpansion whether to enable the expansion
     */
    public void setEnableExpansion(boolean enableExpansion) {
        try {
            DowncallHandles.adw_expander_row_set_enable_expansion.invokeExact(
                    handle(),
                    enableExpansion ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets whether {@code self} is expanded.
     * @param expanded whether to expand the row
     */
    public void setExpanded(boolean expanded) {
        try {
            DowncallHandles.adw_expander_row_set_expanded.invokeExact(
                    handle(),
                    expanded ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the icon name for {@code self}.
     * @param iconName the icon name
     */
    public void setIconName(@Nullable java.lang.String iconName) {
        try {
            DowncallHandles.adw_expander_row_set_icon_name.invokeExact(
                    handle(),
                    (Addressable) (iconName == null ? MemoryAddress.NULL : Interop.allocateNativeString(iconName)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets whether the switch enabling the expansion of {@code self} is visible.
     * @param showEnableSwitch whether to show the switch enabling the expansion
     */
    public void setShowEnableSwitch(boolean showEnableSwitch) {
        try {
            DowncallHandles.adw_expander_row_set_show_enable_switch.invokeExact(
                    handle(),
                    showEnableSwitch ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the subtitle for {@code self}.
     * <p>
     * The subtitle is interpreted as Pango markup unless
     * {@code PreferencesRow:use-markup} is set to {@code FALSE}.
     * @param subtitle the subtitle
     */
    public void setSubtitle(@NotNull java.lang.String subtitle) {
        java.util.Objects.requireNonNull(subtitle, "Parameter 'subtitle' must not be null");
        try {
            DowncallHandles.adw_expander_row_set_subtitle.invokeExact(
                    handle(),
                    Interop.allocateNativeString(subtitle));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle adw_expander_row_new = Interop.downcallHandle(
            "adw_expander_row_new",
            FunctionDescriptor.of(ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle adw_expander_row_add_action = Interop.downcallHandle(
            "adw_expander_row_add_action",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle adw_expander_row_add_prefix = Interop.downcallHandle(
            "adw_expander_row_add_prefix",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle adw_expander_row_add_row = Interop.downcallHandle(
            "adw_expander_row_add_row",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle adw_expander_row_get_enable_expansion = Interop.downcallHandle(
            "adw_expander_row_get_enable_expansion",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle adw_expander_row_get_expanded = Interop.downcallHandle(
            "adw_expander_row_get_expanded",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle adw_expander_row_get_icon_name = Interop.downcallHandle(
            "adw_expander_row_get_icon_name",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle adw_expander_row_get_show_enable_switch = Interop.downcallHandle(
            "adw_expander_row_get_show_enable_switch",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle adw_expander_row_get_subtitle = Interop.downcallHandle(
            "adw_expander_row_get_subtitle",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle adw_expander_row_remove = Interop.downcallHandle(
            "adw_expander_row_remove",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle adw_expander_row_set_enable_expansion = Interop.downcallHandle(
            "adw_expander_row_set_enable_expansion",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
        );
        
        private static final MethodHandle adw_expander_row_set_expanded = Interop.downcallHandle(
            "adw_expander_row_set_expanded",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
        );
        
        private static final MethodHandle adw_expander_row_set_icon_name = Interop.downcallHandle(
            "adw_expander_row_set_icon_name",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle adw_expander_row_set_show_enable_switch = Interop.downcallHandle(
            "adw_expander_row_set_show_enable_switch",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
        );
        
        private static final MethodHandle adw_expander_row_set_subtitle = Interop.downcallHandle(
            "adw_expander_row_set_subtitle",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
    }
}
