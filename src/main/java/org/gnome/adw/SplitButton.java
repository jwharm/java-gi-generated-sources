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
 * The API is very similar to {@code Gtk.MenuButton}, see
 * their documentation for details.
 * 
 * <h2>CSS nodes</h2>
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
 * 
 * <h2>Accessibility</h2>
 * {@code AdwSplitButton} uses the {@code GTK_ACCESSIBLE_ROLE_GROUP} role.
 */
public class SplitButton extends org.gtk.gtk.Widget implements org.gtk.gtk.Accessible, org.gtk.gtk.Actionable, org.gtk.gtk.Buildable, org.gtk.gtk.ConstraintTarget {

    public SplitButton(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to SplitButton */
    public static SplitButton castFrom(org.gtk.gobject.Object gobject) {
        return new SplitButton(gobject.refcounted());
    }
    
    private static final MethodHandle adw_split_button_new = Interop.downcallHandle(
        "adw_split_button_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNew() {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) adw_split_button_new.invokeExact(), false);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a new {@code AdwSplitButton}.
     */
    public SplitButton() {
        super(constructNew());
    }
    
    private static final MethodHandle adw_split_button_get_child = Interop.downcallHandle(
        "adw_split_button_get_child",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the child widget.
     */
    public @Nullable org.gtk.gtk.Widget getChild() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) adw_split_button_get_child.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gtk.Widget(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle adw_split_button_get_direction = Interop.downcallHandle(
        "adw_split_button_get_direction",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the direction in which the popup will be popped up.
     */
    public @NotNull org.gtk.gtk.ArrowType getArrowDirection() {
        int RESULT;
        try {
            RESULT = (int) adw_split_button_get_direction.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gtk.ArrowType(RESULT);
    }
    
    private static final MethodHandle adw_split_button_get_icon_name = Interop.downcallHandle(
        "adw_split_button_get_icon_name",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the name of the icon used to automatically populate the button.
     * <p>
     * If the icon name has not been set with {@link SplitButton#setIconName}
     * the return value will be {@code NULL}.
     */
    public @Nullable java.lang.String getIconName() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) adw_split_button_get_icon_name.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT.getUtf8String(0);
    }
    
    private static final MethodHandle adw_split_button_get_label = Interop.downcallHandle(
        "adw_split_button_get_label",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the label for {@code self}.
     */
    public @Nullable java.lang.String getLabel() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) adw_split_button_get_label.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT.getUtf8String(0);
    }
    
    private static final MethodHandle adw_split_button_get_menu_model = Interop.downcallHandle(
        "adw_split_button_get_menu_model",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the menu model from which the popup will be created.
     */
    public @Nullable org.gtk.gio.MenuModel getMenuModel() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) adw_split_button_get_menu_model.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gio.MenuModel(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle adw_split_button_get_popover = Interop.downcallHandle(
        "adw_split_button_get_popover",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the popover that will be popped up when the dropdown is clicked.
     */
    public @Nullable org.gtk.gtk.Popover getPopover() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) adw_split_button_get_popover.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gtk.Popover(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle adw_split_button_get_use_underline = Interop.downcallHandle(
        "adw_split_button_get_use_underline",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets whether an underline in the text indicates a mnemonic.
     */
    public boolean getUseUnderline() {
        int RESULT;
        try {
            RESULT = (int) adw_split_button_get_use_underline.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    private static final MethodHandle adw_split_button_popdown = Interop.downcallHandle(
        "adw_split_button_popdown",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Dismisses the menu.
     */
    public @NotNull void popdown() {
        try {
            adw_split_button_popdown.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle adw_split_button_popup = Interop.downcallHandle(
        "adw_split_button_popup",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Pops up the menu.
     */
    public @NotNull void popup() {
        try {
            adw_split_button_popup.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle adw_split_button_set_child = Interop.downcallHandle(
        "adw_split_button_set_child",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets the child widget.
     */
    public @NotNull void setChild(@Nullable org.gtk.gtk.Widget child) {
        try {
            adw_split_button_set_child.invokeExact(handle(), child.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle adw_split_button_set_direction = Interop.downcallHandle(
        "adw_split_button_set_direction",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets the direction in which the popup will be popped up.
     */
    public @NotNull void setDirection(@NotNull org.gtk.gtk.ArrowType direction) {
        try {
            adw_split_button_set_direction.invokeExact(handle(), direction.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle adw_split_button_set_icon_name = Interop.downcallHandle(
        "adw_split_button_set_icon_name",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets the name of the icon used to automatically populate the button.
     */
    public @NotNull void setIconName(@NotNull java.lang.String iconName) {
        try {
            adw_split_button_set_icon_name.invokeExact(handle(), Interop.allocateNativeString(iconName));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle adw_split_button_set_label = Interop.downcallHandle(
        "adw_split_button_set_label",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets the label for {@code self}.
     */
    public @NotNull void setLabel(@NotNull java.lang.String label) {
        try {
            adw_split_button_set_label.invokeExact(handle(), Interop.allocateNativeString(label));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle adw_split_button_set_menu_model = Interop.downcallHandle(
        "adw_split_button_set_menu_model",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets the menu model from which the popup will be created.
     */
    public @NotNull void setMenuModel(@Nullable org.gtk.gio.MenuModel menuModel) {
        try {
            adw_split_button_set_menu_model.invokeExact(handle(), menuModel.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle adw_split_button_set_popover = Interop.downcallHandle(
        "adw_split_button_set_popover",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets the popover that will be popped up when the dropdown is clicked.
     */
    public @NotNull void setPopover(@Nullable org.gtk.gtk.Popover popover) {
        try {
            adw_split_button_set_popover.invokeExact(handle(), popover.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle adw_split_button_set_use_underline = Interop.downcallHandle(
        "adw_split_button_set_use_underline",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets whether an underline in the text indicates a mnemonic.
     */
    public @NotNull void setUseUnderline(@NotNull boolean useUnderline) {
        try {
            adw_split_button_set_use_underline.invokeExact(handle(), useUnderline ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface ActivateHandler {
        void signalReceived(SplitButton source);
    }
    
    /**
     * Emitted to animate press then release.
     * <p>
     * This is an action signal. Applications should never connect to this signal,
     * but use the {@code SplitButton::clicked} signal.
     */
    public SignalHandle onActivate(ActivateHandler handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("activate"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(SplitButton.Callbacks.class, "signalSplitButtonActivate",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler)),
                (Addressable) MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface ClickedHandler {
        void signalReceived(SplitButton source);
    }
    
    /**
     * Emitted when the button has been activated (pressed and released).
     */
    public SignalHandle onClicked(ClickedHandler handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("clicked"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(SplitButton.Callbacks.class, "signalSplitButtonClicked",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler)),
                (Addressable) MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    public static class Callbacks {
    
        public static void signalSplitButtonActivate(MemoryAddress source, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (SplitButton.ActivateHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new SplitButton(Refcounted.get(source)));
        }
        
        public static void signalSplitButtonClicked(MemoryAddress source, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (SplitButton.ClickedHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new SplitButton(Refcounted.get(source)));
        }
        
    }
}
