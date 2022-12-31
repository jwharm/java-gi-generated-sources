package org.gnome.adw;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A combined button and dropdown widget.
 * <p>
 * &lt;picture&gt;
 *   &lt;source srcset="split-button-dark.png" media="(prefers-color-scheme: dark)"&gt;
 *   &lt;img src="split-button.png" alt="split-button"&gt;
 * &lt;/picture&gt;
 * <p>
 * {@code AdwSplitButton} is typically used to present a set of actions in a menu,
 * but allow access to one of them with a single click.
 * <p>
 * The API is very similar to {@link org.gtk.gtk.Button}, see
 * their documentation for details.
 * <p>
 * <strong>CSS nodes</strong><br/>
 * <pre>{@code 
 * splitbutton[.image-button][.text-button]
 * ├── button
 * │   ╰── <content>
 * ├── separator
 * ╰── menubutton
 *     ╰── button.toggle
 *         ╰── arrow
 * }</pre>
 * <p>
 * {@code AdwSplitButton}'s CSS node is called {@code splitbutton}. It contains the css
 * nodes: {@code button}, {@code separator}, {@code menubutton}. See {@link org.gtk.gtk.MenuButton}
 * documentation for the {@code menubutton} contents.
 * <p>
 * The main CSS node will contain the {@code .image-button} or {@code .text-button} style
 * classes matching the button contents. The nested button nodes will never
 * contain them.
 * <p>
 * <strong>Accessibility</strong><br/>
 * {@code AdwSplitButton} uses the {@code GTK_ACCESSIBLE_ROLE_GROUP} role.
 * @version 1.0
 */
public class SplitButton extends org.gtk.gtk.Widget implements org.gtk.gtk.Accessible, org.gtk.gtk.Actionable, org.gtk.gtk.Buildable, org.gtk.gtk.ConstraintTarget {
    
    static {
        Adw.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "AdwSplitButton";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a SplitButton proxy instance for the provided memory address.
     * <p>
     * Because SplitButton is an {@code InitiallyUnowned} instance, when 
     * {@code ownership == Ownership.NONE}, the ownership is set to {@code FULL} 
     * and a call to {@code g_object_ref_sink()} is executed to sink the floating reference.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected SplitButton(Addressable address, Ownership ownership) {
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
    public static final Marshal<Addressable, SplitButton> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new SplitButton(input, ownership);
    
    private static MemoryAddress constructNew() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.adw_split_button_new.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new {@code AdwSplitButton}.
     */
    public SplitButton() {
        super(constructNew(), Ownership.NONE);
    }
    
    /**
     * Gets the child widget.
     * @return the child widget
     */
    public @Nullable org.gtk.gtk.Widget getChild() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.adw_split_button_get_child.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gtk.gtk.Widget) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gtk.gtk.Widget.fromAddress).marshal(RESULT, Ownership.NONE);
    }
    
    /**
     * Gets the direction in which the popup will be popped up.
     * @return the direction
     */
    public org.gtk.gtk.ArrowType getArrowDirection() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.adw_split_button_get_direction.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.gtk.ArrowType.of(RESULT);
    }
    
    /**
     * Gets the tooltip of the dropdown button of {@code self}.
     * @return the dropdown tooltip of {@code self}
     */
    public java.lang.String getDropdownTooltip() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.adw_split_button_get_dropdown_tooltip.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Gets the name of the icon used to automatically populate the button.
     * @return the icon name
     */
    public @Nullable java.lang.String getIconName() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.adw_split_button_get_icon_name.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Gets the label for {@code self}.
     * @return the label for {@code self}
     */
    public @Nullable java.lang.String getLabel() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.adw_split_button_get_label.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Gets the menu model from which the popup will be created.
     * @return the menu model
     */
    public @Nullable org.gtk.gio.MenuModel getMenuModel() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.adw_split_button_get_menu_model.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gtk.gio.MenuModel) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gtk.gio.MenuModel.fromAddress).marshal(RESULT, Ownership.NONE);
    }
    
    /**
     * Gets the popover that will be popped up when the dropdown is clicked.
     * @return the popover
     */
    public @Nullable org.gtk.gtk.Popover getPopover() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.adw_split_button_get_popover.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gtk.gtk.Popover) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gtk.gtk.Popover.fromAddress).marshal(RESULT, Ownership.NONE);
    }
    
    /**
     * Gets whether an underline in the text indicates a mnemonic.
     * @return whether an underline in the text indicates a mnemonic
     */
    public boolean getUseUnderline() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.adw_split_button_get_use_underline.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Dismisses the menu.
     */
    public void popdown() {
        try {
            DowncallHandles.adw_split_button_popdown.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Pops up the menu.
     */
    public void popup() {
        try {
            DowncallHandles.adw_split_button_popup.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the child widget.
     * <p>
     * Setting the child widget will set {@code SplitButton:label} and
     * {@code SplitButton:icon-name} to {@code NULL}.
     * @param child the new child widget
     */
    public void setChild(@Nullable org.gtk.gtk.Widget child) {
        try {
            DowncallHandles.adw_split_button_set_child.invokeExact(
                    handle(),
                    (Addressable) (child == null ? MemoryAddress.NULL : child.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the direction in which the popup will be popped up.
     * <p>
     * The dropdown arrow icon will point at the same direction.
     * <p>
     * If the does not fit in the available space in the given direction, GTK will
     * try its best to keep it inside the screen and fully visible.
     * <p>
     * If you pass {@code GTK_ARROW_NONE}, it's equivalent to {@code GTK_ARROW_DOWN}.
     * @param direction the direction
     */
    public void setDirection(org.gtk.gtk.ArrowType direction) {
        try {
            DowncallHandles.adw_split_button_set_direction.invokeExact(
                    handle(),
                    direction.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the tooltip of the dropdown button of {@code self}.
     * <p>
     * The tooltip can be marked up with the Pango text markup language.
     * @param tooltip the dropdown tooltip of {@code self}
     */
    public void setDropdownTooltip(java.lang.String tooltip) {
        try {
            DowncallHandles.adw_split_button_set_dropdown_tooltip.invokeExact(
                    handle(),
                    Marshal.stringToAddress.marshal(tooltip, null));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the name of the icon used to automatically populate the button.
     * <p>
     * Setting the icon name will set {@code SplitButton:label} and
     * {@code SplitButton:child} to {@code NULL}.
     * @param iconName the icon name to set
     */
    public void setIconName(java.lang.String iconName) {
        try {
            DowncallHandles.adw_split_button_set_icon_name.invokeExact(
                    handle(),
                    Marshal.stringToAddress.marshal(iconName, null));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the label for {@code self}.
     * <p>
     * Setting the label will set {@code SplitButton:icon-name} and
     * {@code SplitButton:child} to {@code NULL}.
     * @param label the label to set
     */
    public void setLabel(java.lang.String label) {
        try {
            DowncallHandles.adw_split_button_set_label.invokeExact(
                    handle(),
                    Marshal.stringToAddress.marshal(label, null));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the menu model from which the popup will be created.
     * <p>
     * If the menu model is {@code NULL}, the dropdown is disabled.
     * <p>
     * A {@link org.gtk.gtk.Popover} will be created from the menu model with
     * {@link org.gtk.gtk.PopoverMenu#newFromModel}. Actions will be connected as
     * documented for this function.
     * <p>
     * If {@code SplitButton:popover} is already set, it will be dissociated from
     * the button, and the property is set to {@code NULL}.
     * @param menuModel the menu model
     */
    public void setMenuModel(@Nullable org.gtk.gio.MenuModel menuModel) {
        try {
            DowncallHandles.adw_split_button_set_menu_model.invokeExact(
                    handle(),
                    (Addressable) (menuModel == null ? MemoryAddress.NULL : menuModel.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the popover that will be popped up when the dropdown is clicked.
     * <p>
     * If the popover is {@code NULL}, the dropdown is disabled.
     * <p>
     * If {@code SplitButton:menu-model} is set, the menu model is dissociated
     * from the button, and the property is set to {@code NULL}.
     * @param popover the popover
     */
    public void setPopover(@Nullable org.gtk.gtk.Popover popover) {
        try {
            DowncallHandles.adw_split_button_set_popover.invokeExact(
                    handle(),
                    (Addressable) (popover == null ? MemoryAddress.NULL : popover.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets whether an underline in the text indicates a mnemonic.
     * <p>
     * See {@code SplitButton:label}.
     * @param useUnderline whether an underline in the text indicates a mnemonic
     */
    public void setUseUnderline(boolean useUnderline) {
        try {
            DowncallHandles.adw_split_button_set_use_underline.invokeExact(
                    handle(),
                    Marshal.booleanToInteger.marshal(useUnderline, null).intValue());
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
            RESULT = (long) DowncallHandles.adw_split_button_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    @FunctionalInterface
    public interface Activate {
        void run();

        @ApiStatus.Internal default void upcall(MemoryAddress sourceSplitButton) {
            run();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(Activate.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Emitted to animate press then release.
     * <p>
     * This is an action signal. Applications should never connect to this signal,
     * but use the {@code SplitButton::clicked} signal.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<SplitButton.Activate> onActivate(SplitButton.Activate handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("activate"), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface Clicked {
        void run();

        @ApiStatus.Internal default void upcall(MemoryAddress sourceSplitButton) {
            run();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(Clicked.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Emitted when the button has been activated (pressed and released).
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<SplitButton.Clicked> onClicked(SplitButton.Clicked handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("clicked"), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * A {@link SplitButton.Builder} object constructs a {@link SplitButton} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link SplitButton.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a GObject with properties.
     */
    public static class Builder extends org.gtk.gtk.Widget.Builder {
        
        protected Builder() {
        }
        
        /**
         * Finish building the {@link SplitButton} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link SplitButton}.
         * @return A new instance of {@code SplitButton} with the properties 
         *         that were set in the Builder object.
         */
        public SplitButton build() {
            return (SplitButton) org.gtk.gobject.GObject.newWithProperties(
                SplitButton.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
        
        /**
         * The child widget.
         * <p>
         * Setting the child widget will set {@code SplitButton:label} and
         * {@code SplitButton:icon-name} to {@code NULL}.
         * @param child The value for the {@code child} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setChild(org.gtk.gtk.Widget child) {
            names.add("child");
            values.add(org.gtk.gobject.Value.create(child));
            return this;
        }
        
        /**
         * The direction in which the popup will be popped up.
         * <p>
         * The dropdown arrow icon will point at the same direction.
         * <p>
         * If the does not fit in the available space in the given direction, GTK will
         * try its best to keep it inside the screen and fully visible.
         * <p>
         * If you pass {@code GTK_ARROW_NONE}, it's equivalent to {@code GTK_ARROW_DOWN}.
         * @param direction The value for the {@code direction} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setDirection(org.gtk.gtk.ArrowType direction) {
            names.add("direction");
            values.add(org.gtk.gobject.Value.create(direction));
            return this;
        }
        
        /**
         * The tooltip of the dropdown button.
         * <p>
         * The tooltip can be marked up with the Pango text markup language.
         * @param dropdownTooltip The value for the {@code dropdown-tooltip} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setDropdownTooltip(java.lang.String dropdownTooltip) {
            names.add("dropdown-tooltip");
            values.add(org.gtk.gobject.Value.create(dropdownTooltip));
            return this;
        }
        
        /**
         * The name of the icon used to automatically populate the button.
         * <p>
         * Setting the icon name will set {@code SplitButton:label} and
         * {@code SplitButton:child} to {@code NULL}.
         * @param iconName The value for the {@code icon-name} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setIconName(java.lang.String iconName) {
            names.add("icon-name");
            values.add(org.gtk.gobject.Value.create(iconName));
            return this;
        }
        
        /**
         * The label for the button.
         * <p>
         * Setting the label will set {@code SplitButton:icon-name} and
         * {@code SplitButton:child} to {@code NULL}.
         * @param label The value for the {@code label} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setLabel(java.lang.String label) {
            names.add("label");
            values.add(org.gtk.gobject.Value.create(label));
            return this;
        }
        
        /**
         * The {@code GMenuModel} from which the popup will be created.
         * <p>
         * If the menu model is {@code NULL}, the dropdown is disabled.
         * <p>
         * A {@link org.gtk.gtk.Popover} will be created from the menu model with
         * {@link org.gtk.gtk.PopoverMenu#newFromModel}. Actions will be connected as
         * documented for this function.
         * <p>
         * If {@code SplitButton:popover} is already set, it will be dissociated
         * from the button, and the property is set to {@code NULL}.
         * @param menuModel The value for the {@code menu-model} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setMenuModel(org.gtk.gio.MenuModel menuModel) {
            names.add("menu-model");
            values.add(org.gtk.gobject.Value.create(menuModel));
            return this;
        }
        
        /**
         * The {@code GtkPopover} that will be popped up when the dropdown is clicked.
         * <p>
         * If the popover is {@code NULL}, the dropdown is disabled.
         * <p>
         * If {@code SplitButton:menu-model} is set, the menu model is dissociated
         * from the button, and the property is set to {@code NULL}.
         * @param popover The value for the {@code popover} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setPopover(org.gtk.gtk.Popover popover) {
            names.add("popover");
            values.add(org.gtk.gobject.Value.create(popover));
            return this;
        }
        
        /**
         * Whether an underline in the text indicates a mnemonic.
         * <p>
         * See {@code SplitButton:label}.
         * @param useUnderline The value for the {@code use-underline} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setUseUnderline(boolean useUnderline) {
            names.add("use-underline");
            values.add(org.gtk.gobject.Value.create(useUnderline));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle adw_split_button_new = Interop.downcallHandle(
            "adw_split_button_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_split_button_get_child = Interop.downcallHandle(
            "adw_split_button_get_child",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_split_button_get_direction = Interop.downcallHandle(
            "adw_split_button_get_direction",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_split_button_get_dropdown_tooltip = Interop.downcallHandle(
            "adw_split_button_get_dropdown_tooltip",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_split_button_get_icon_name = Interop.downcallHandle(
            "adw_split_button_get_icon_name",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_split_button_get_label = Interop.downcallHandle(
            "adw_split_button_get_label",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_split_button_get_menu_model = Interop.downcallHandle(
            "adw_split_button_get_menu_model",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_split_button_get_popover = Interop.downcallHandle(
            "adw_split_button_get_popover",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_split_button_get_use_underline = Interop.downcallHandle(
            "adw_split_button_get_use_underline",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_split_button_popdown = Interop.downcallHandle(
            "adw_split_button_popdown",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_split_button_popup = Interop.downcallHandle(
            "adw_split_button_popup",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_split_button_set_child = Interop.downcallHandle(
            "adw_split_button_set_child",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_split_button_set_direction = Interop.downcallHandle(
            "adw_split_button_set_direction",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle adw_split_button_set_dropdown_tooltip = Interop.downcallHandle(
            "adw_split_button_set_dropdown_tooltip",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_split_button_set_icon_name = Interop.downcallHandle(
            "adw_split_button_set_icon_name",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_split_button_set_label = Interop.downcallHandle(
            "adw_split_button_set_label",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_split_button_set_menu_model = Interop.downcallHandle(
            "adw_split_button_set_menu_model",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_split_button_set_popover = Interop.downcallHandle(
            "adw_split_button_set_popover",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_split_button_set_use_underline = Interop.downcallHandle(
            "adw_split_button_set_use_underline",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle adw_split_button_get_type = Interop.downcallHandle(
            "adw_split_button_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
    }
}
