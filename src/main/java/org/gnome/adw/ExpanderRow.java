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
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gnome.adw.PreferencesRow.getMemoryLayout().withName("parent_instance")
        ).withName(C_TYPE_NAME);
    }
    
    /**
     * Create a ExpanderRow proxy instance for the provided memory address.
     * <p>
     * Because ExpanderRow is an {@code InitiallyUnowned} instance, when 
     * {@code ownership == Ownership.NONE}, the ownership is set to {@code FULL} 
     * and a call to {@code g_object_ref_sink()} is executed to sink the floating reference.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected ExpanderRow(Addressable address, Ownership ownership) {
        super(address, Ownership.FULL);
        if (ownership == Ownership.NONE) {
            try {
                var RESULT = (MemoryAddress) Interop.g_object_ref_sink.invokeExact(address);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
        }
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, ExpanderRow> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new ExpanderRow(input, ownership);
    
    private static MemoryAddress constructNew() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.adw_expander_row_new.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new {@code AdwExpanderRow}.
     */
    public ExpanderRow() {
        super(constructNew(), Ownership.NONE);
    }
    
    /**
     * Adds an action widget to {@code self}.
     * @param widget a widget
     */
    public void addAction(org.gtk.gtk.Widget widget) {
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
    public void addPrefix(org.gtk.gtk.Widget widget) {
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
    public void addRow(org.gtk.gtk.Widget child) {
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
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
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
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
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
        return Marshal.addressToString.marshal(RESULT, null);
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
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Gets the subtitle for {@code self}.
     * @return the subtitle for {@code self}
     */
    public java.lang.String getSubtitle() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.adw_expander_row_get_subtitle.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    public void remove(org.gtk.gtk.Widget child) {
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
                    Marshal.booleanToInteger.marshal(enableExpansion, null).intValue());
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
                    Marshal.booleanToInteger.marshal(expanded, null).intValue());
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
                    (Addressable) (iconName == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(iconName, null)));
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
                    Marshal.booleanToInteger.marshal(showEnableSwitch, null).intValue());
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
    public void setSubtitle(java.lang.String subtitle) {
        try {
            DowncallHandles.adw_expander_row_set_subtitle.invokeExact(
                    handle(),
                    Marshal.stringToAddress.marshal(subtitle, null));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.adw_expander_row_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * A {@link ExpanderRow.Builder} object constructs a {@link ExpanderRow} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link ExpanderRow.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a GObject with properties.
     */
    public static class Builder extends org.gnome.adw.PreferencesRow.Builder {
        
        protected Builder() {
        }
        
        /**
         * Finish building the {@link ExpanderRow} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link ExpanderRow}.
         * @return A new instance of {@code ExpanderRow} with the properties 
         *         that were set in the Builder object.
         */
        public ExpanderRow build() {
            return (ExpanderRow) org.gtk.gobject.GObject.newWithProperties(
                ExpanderRow.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
        
        /**
         * Whether expansion is enabled.
         * @param enableExpansion The value for the {@code enable-expansion} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setEnableExpansion(boolean enableExpansion) {
            names.add("enable-expansion");
            values.add(org.gtk.gobject.Value.create(enableExpansion));
            return this;
        }
        
        /**
         * Whether the row is expanded.
         * @param expanded The value for the {@code expanded} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setExpanded(boolean expanded) {
            names.add("expanded");
            values.add(org.gtk.gobject.Value.create(expanded));
            return this;
        }
        
        /**
         * The icon name for this row.
         * @param iconName The value for the {@code icon-name} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setIconName(java.lang.String iconName) {
            names.add("icon-name");
            values.add(org.gtk.gobject.Value.create(iconName));
            return this;
        }
        
        /**
         * Whether the switch enabling the expansion is visible.
         * @param showEnableSwitch The value for the {@code show-enable-switch} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setShowEnableSwitch(boolean showEnableSwitch) {
            names.add("show-enable-switch");
            values.add(org.gtk.gobject.Value.create(showEnableSwitch));
            return this;
        }
        
        /**
         * The subtitle for this row.
         * <p>
         * The subtitle is interpreted as Pango markup unless
         * {@code PreferencesRow:use-markup} is set to {@code FALSE}.
         * @param subtitle The value for the {@code subtitle} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setSubtitle(java.lang.String subtitle) {
            names.add("subtitle");
            values.add(org.gtk.gobject.Value.create(subtitle));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle adw_expander_row_new = Interop.downcallHandle(
            "adw_expander_row_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_expander_row_add_action = Interop.downcallHandle(
            "adw_expander_row_add_action",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_expander_row_add_prefix = Interop.downcallHandle(
            "adw_expander_row_add_prefix",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_expander_row_add_row = Interop.downcallHandle(
            "adw_expander_row_add_row",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_expander_row_get_enable_expansion = Interop.downcallHandle(
            "adw_expander_row_get_enable_expansion",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_expander_row_get_expanded = Interop.downcallHandle(
            "adw_expander_row_get_expanded",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_expander_row_get_icon_name = Interop.downcallHandle(
            "adw_expander_row_get_icon_name",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_expander_row_get_show_enable_switch = Interop.downcallHandle(
            "adw_expander_row_get_show_enable_switch",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_expander_row_get_subtitle = Interop.downcallHandle(
            "adw_expander_row_get_subtitle",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_expander_row_remove = Interop.downcallHandle(
            "adw_expander_row_remove",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_expander_row_set_enable_expansion = Interop.downcallHandle(
            "adw_expander_row_set_enable_expansion",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle adw_expander_row_set_expanded = Interop.downcallHandle(
            "adw_expander_row_set_expanded",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle adw_expander_row_set_icon_name = Interop.downcallHandle(
            "adw_expander_row_set_icon_name",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_expander_row_set_show_enable_switch = Interop.downcallHandle(
            "adw_expander_row_set_show_enable_switch",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle adw_expander_row_set_subtitle = Interop.downcallHandle(
            "adw_expander_row_set_subtitle",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_expander_row_get_type = Interop.downcallHandle(
            "adw_expander_row_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
    }
}
