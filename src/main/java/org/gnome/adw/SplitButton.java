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
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    @ApiStatus.Internal
    public SplitButton(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /**
     * Cast object to SplitButton if its GType is a (or inherits from) "AdwSplitButton".
     * @param  gobject            An object that inherits from GObject
     * @return                    An instance of "SplitButton" that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "AdwSplitButton", a ClassCastException will be thrown.
     */
    public static SplitButton castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), org.gtk.gobject.GObject.typeFromName("AdwSplitButton"))) {
            return new SplitButton(gobject.refcounted());
        } else {
            throw new ClassCastException("Object type is not an instance of AdwSplitButton");
        }
    }
    
    private static Refcounted constructNew() {
        Refcounted RESULT;
        try {
            RESULT = Refcounted.get((MemoryAddress) DowncallHandles.adw_split_button_new.invokeExact(), false);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new {@code AdwSplitButton}.
     */
    public SplitButton() {
        super(constructNew());
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
        return new org.gtk.gtk.Widget(Refcounted.get(RESULT, false));
    }
    
    /**
     * Gets the direction in which the popup will be popped up.
     * @return the direction
     */
    public @NotNull org.gtk.gtk.ArrowType getArrowDirection() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.adw_split_button_get_direction.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gtk.ArrowType(RESULT);
    }
    
    /**
     * Gets the tooltip of the dropdown button of {@code self}.
     * @return the dropdown tooltip of {@code self}
     */
    public @NotNull java.lang.String getDropdownTooltip() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.adw_split_button_get_dropdown_tooltip.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
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
        return Interop.getStringFrom(RESULT);
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
        return Interop.getStringFrom(RESULT);
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
        return new org.gtk.gio.MenuModel(Refcounted.get(RESULT, false));
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
        return new org.gtk.gtk.Popover(Refcounted.get(RESULT, false));
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
        return RESULT != 0;
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
    public void setDirection(@NotNull org.gtk.gtk.ArrowType direction) {
        java.util.Objects.requireNonNull(direction, "Parameter 'direction' must not be null");
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
    public void setDropdownTooltip(@NotNull java.lang.String tooltip) {
        java.util.Objects.requireNonNull(tooltip, "Parameter 'tooltip' must not be null");
        try {
            DowncallHandles.adw_split_button_set_dropdown_tooltip.invokeExact(
                    handle(),
                    Interop.allocateNativeString(tooltip));
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
    public void setIconName(@NotNull java.lang.String iconName) {
        java.util.Objects.requireNonNull(iconName, "Parameter 'iconName' must not be null");
        try {
            DowncallHandles.adw_split_button_set_icon_name.invokeExact(
                    handle(),
                    Interop.allocateNativeString(iconName));
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
    public void setLabel(@NotNull java.lang.String label) {
        java.util.Objects.requireNonNull(label, "Parameter 'label' must not be null");
        try {
            DowncallHandles.adw_split_button_set_label.invokeExact(
                    handle(),
                    Interop.allocateNativeString(label));
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
                    useUnderline ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface Activate {
        void signalReceived(SplitButton source);
    }
    
    /**
     * Emitted to animate press then release.
     * <p>
     * This is an action signal. Applications should never connect to this signal,
     * but use the {@code SplitButton::clicked} signal.
     */
    public Signal<SplitButton.Activate> onActivate(SplitButton.Activate handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("activate"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(SplitButton.Callbacks.class, "signalSplitButtonActivate",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<SplitButton.Activate>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface Clicked {
        void signalReceived(SplitButton source);
    }
    
    /**
     * Emitted when the button has been activated (pressed and released).
     */
    public Signal<SplitButton.Clicked> onClicked(SplitButton.Clicked handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("clicked"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(SplitButton.Callbacks.class, "signalSplitButtonClicked",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<SplitButton.Clicked>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle adw_split_button_new = Interop.downcallHandle(
            "adw_split_button_new",
            FunctionDescriptor.of(ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle adw_split_button_get_child = Interop.downcallHandle(
            "adw_split_button_get_child",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle adw_split_button_get_direction = Interop.downcallHandle(
            "adw_split_button_get_direction",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle adw_split_button_get_dropdown_tooltip = Interop.downcallHandle(
            "adw_split_button_get_dropdown_tooltip",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle adw_split_button_get_icon_name = Interop.downcallHandle(
            "adw_split_button_get_icon_name",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle adw_split_button_get_label = Interop.downcallHandle(
            "adw_split_button_get_label",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle adw_split_button_get_menu_model = Interop.downcallHandle(
            "adw_split_button_get_menu_model",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle adw_split_button_get_popover = Interop.downcallHandle(
            "adw_split_button_get_popover",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle adw_split_button_get_use_underline = Interop.downcallHandle(
            "adw_split_button_get_use_underline",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle adw_split_button_popdown = Interop.downcallHandle(
            "adw_split_button_popdown",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle adw_split_button_popup = Interop.downcallHandle(
            "adw_split_button_popup",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle adw_split_button_set_child = Interop.downcallHandle(
            "adw_split_button_set_child",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle adw_split_button_set_direction = Interop.downcallHandle(
            "adw_split_button_set_direction",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
        );
        
        private static final MethodHandle adw_split_button_set_dropdown_tooltip = Interop.downcallHandle(
            "adw_split_button_set_dropdown_tooltip",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle adw_split_button_set_icon_name = Interop.downcallHandle(
            "adw_split_button_set_icon_name",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle adw_split_button_set_label = Interop.downcallHandle(
            "adw_split_button_set_label",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle adw_split_button_set_menu_model = Interop.downcallHandle(
            "adw_split_button_set_menu_model",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle adw_split_button_set_popover = Interop.downcallHandle(
            "adw_split_button_set_popover",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle adw_split_button_set_use_underline = Interop.downcallHandle(
            "adw_split_button_set_use_underline",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
        );
    }
    
    private static class Callbacks {
        
        public static void signalSplitButtonActivate(MemoryAddress source, MemoryAddress data) {
            int HASH = data.get(ValueLayout.JAVA_INT, 0);
            var HANDLER = (SplitButton.Activate) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new SplitButton(Refcounted.get(source)));
        }
        
        public static void signalSplitButtonClicked(MemoryAddress source, MemoryAddress data) {
            int HASH = data.get(ValueLayout.JAVA_INT, 0);
            var HANDLER = (SplitButton.Clicked) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new SplitButton(Refcounted.get(source)));
        }
    }
}
