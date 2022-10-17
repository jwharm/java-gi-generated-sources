package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The {@code GtkMenuButton} widget is used to display a popup when clicked.
 * <p>
 * <img src="./doc-files/menu-button.png" alt="An example GtkMenuButton">
 * <p>
 * This popup can be provided either as a {@code GtkPopover} or as an abstract
 * {@code GMenuModel}.
 * <p>
 * The {@code GtkMenuButton} widget can show either an icon (set with the
 * {@code Gtk.MenuButton:icon-name} property) or a label (set with the
 * {@code Gtk.MenuButton:label} property). If neither is explicitly set,
 * a {@link Image} is automatically created, using an arrow image oriented
 * according to {@code Gtk.MenuButton:direction} or the generic
 * “open-menu-symbolic” icon if the direction is not set.
 * <p>
 * The positioning of the popup is determined by the
 * {@code Gtk.MenuButton:direction} property of the menu button.
 * <p>
 * For menus, the {@code Gtk.Widget:valign}
 * properties of the menu are also taken into account. For example, when the
 * direction is {@link ArrowType#DOWN} and the horizontal alignment is {@link Align#START},
 * the menu will be positioned below the button, with the starting edge
 * (depending on the text direction) of the menu aligned with the starting
 * edge of the button. If there is not enough space below the button, the
 * menu is popped up above the button instead. If the alignment would move
 * part of the menu offscreen, it is “pushed in”.
 * <p>
 * |           | start                | center                | end                |
 * | -         | ---                  | ---                   | ---                |
 * | <strong>*down*</strong>  | <img src="./doc-files/down-end.png" alt="](down-start.png)  | ![](down-center.png)  | ![">  |
 * | <strong>*up*</strong>    | <img src="./doc-files/up-end.png" alt="](up-start.png)    | ![](up-center.png)    | ![">    |
 * | <strong>*left*</strong>  | <img src="./doc-files/left-end.png" alt="](left-start.png)  | ![](left-center.png)  | ![">  |
 * | <strong>*right*</strong> | <img src="./doc-files/right-end.png" alt="](right-start.png) | ![](right-center.png) | !["> |
 * 
 * <h1>CSS nodes</h1>
 * <pre>{@code 
 * menubutton
 * ╰── button.toggle
 *     ╰── <content>
 *          ╰── [arrow]
 * }</pre>
 * <p>
 * {@code GtkMenuButton} has a single CSS node with name {@code menubutton}
 * which contains a {@code button} node with a {@code .toggle} style class.
 * <p>
 * If the button contains an icon, it will have the {@code .image-button} style class,
 * if it contains text, it will have {@code .text-button} style class. If an arrow is
 * visible in addition to an icon, text or a custom child, it will also have
 * {@code .arrow-button} style class.
 * <p>
 * Inside the toggle button content, there is an {@code arrow} node for
 * the indicator, which will carry one of the {@code .none}, {@code .up}, {@code .down},
 * {@code .left} or {@code .right} style classes to indicate the direction that
 * the menu will appear in. The CSS is expected to provide a suitable
 * image for each of these cases using the {@code -gtk-icon-source} property.
 * <p>
 * Optionally, the {@code menubutton} node can carry the {@code .circular} style class
 * to request a round appearance.
 * 
 * <h1>Accessibility</h1>
 * {@code GtkMenuButton} uses the {@link AccessibleRole#BUTTON} role.
 */
public class MenuButton extends Widget implements Accessible, Buildable, ConstraintTarget {

    public MenuButton(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to MenuButton */
    public static MenuButton castFrom(org.gtk.gobject.Object gobject) {
        return new MenuButton(gobject.refcounted());
    }
    
    private static final MethodHandle gtk_menu_button_new = Interop.downcallHandle(
        "gtk_menu_button_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNew() {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) gtk_menu_button_new.invokeExact(), false);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a new {@code GtkMenuButton} widget with downwards-pointing
     * arrow as the only child.
     * <p>
     * You can replace the child widget with another {@code GtkWidget}
     * should you wish to.
     */
    public MenuButton() {
        super(constructNew());
    }
    
    private static final MethodHandle gtk_menu_button_get_always_show_arrow = Interop.downcallHandle(
        "gtk_menu_button_get_always_show_arrow",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets whether to show a dropdown arrow even when using an icon.
     */
    public boolean getAlwaysShowArrow() {
        int RESULT;
        try {
            RESULT = (int) gtk_menu_button_get_always_show_arrow.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    private static final MethodHandle gtk_menu_button_get_child = Interop.downcallHandle(
        "gtk_menu_button_get_child",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the child widget of {@code menu_button}.
     */
    public @Nullable Widget getChild() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) gtk_menu_button_get_child.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new Widget(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle gtk_menu_button_get_direction = Interop.downcallHandle(
        "gtk_menu_button_get_direction",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the direction the popup will be pointing at when popped up.
     */
    public @NotNull ArrowType getArrowDirection() {
        int RESULT;
        try {
            RESULT = (int) gtk_menu_button_get_direction.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new ArrowType(RESULT);
    }
    
    private static final MethodHandle gtk_menu_button_get_has_frame = Interop.downcallHandle(
        "gtk_menu_button_get_has_frame",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns whether the button has a frame.
     */
    public boolean getHasFrame() {
        int RESULT;
        try {
            RESULT = (int) gtk_menu_button_get_has_frame.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    private static final MethodHandle gtk_menu_button_get_icon_name = Interop.downcallHandle(
        "gtk_menu_button_get_icon_name",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the name of the icon shown in the button.
     */
    public @Nullable java.lang.String getIconName() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) gtk_menu_button_get_icon_name.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT.getUtf8String(0);
    }
    
    private static final MethodHandle gtk_menu_button_get_label = Interop.downcallHandle(
        "gtk_menu_button_get_label",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the label shown in the button
     */
    public @Nullable java.lang.String getLabel() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) gtk_menu_button_get_label.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT.getUtf8String(0);
    }
    
    private static final MethodHandle gtk_menu_button_get_menu_model = Interop.downcallHandle(
        "gtk_menu_button_get_menu_model",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the {@code GMenuModel} used to generate the popup.
     */
    public @Nullable org.gtk.gio.MenuModel getMenuModel() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) gtk_menu_button_get_menu_model.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gio.MenuModel(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle gtk_menu_button_get_popover = Interop.downcallHandle(
        "gtk_menu_button_get_popover",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the {@code GtkPopover} that pops out of the button.
     * <p>
     * If the button is not using a {@code GtkPopover}, this function
     * returns {@code null}.
     */
    public @Nullable Popover getPopover() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) gtk_menu_button_get_popover.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new Popover(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle gtk_menu_button_get_primary = Interop.downcallHandle(
        "gtk_menu_button_get_primary",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns whether the menu button acts as a primary menu.
     */
    public boolean getPrimary() {
        int RESULT;
        try {
            RESULT = (int) gtk_menu_button_get_primary.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    private static final MethodHandle gtk_menu_button_get_use_underline = Interop.downcallHandle(
        "gtk_menu_button_get_use_underline",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns whether an embedded underline in the text indicates a
     * mnemonic.
     */
    public boolean getUseUnderline() {
        int RESULT;
        try {
            RESULT = (int) gtk_menu_button_get_use_underline.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    private static final MethodHandle gtk_menu_button_popdown = Interop.downcallHandle(
        "gtk_menu_button_popdown",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Dismiss the menu.
     */
    public @NotNull void popdown() {
        try {
            gtk_menu_button_popdown.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gtk_menu_button_popup = Interop.downcallHandle(
        "gtk_menu_button_popup",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Pop up the menu.
     */
    public @NotNull void popup() {
        try {
            gtk_menu_button_popup.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gtk_menu_button_set_always_show_arrow = Interop.downcallHandle(
        "gtk_menu_button_set_always_show_arrow",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets whether to show a dropdown arrow even when using an icon or a custom
     * child.
     */
    public @NotNull void setAlwaysShowArrow(@NotNull boolean alwaysShowArrow) {
        try {
            gtk_menu_button_set_always_show_arrow.invokeExact(handle(), alwaysShowArrow ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gtk_menu_button_set_child = Interop.downcallHandle(
        "gtk_menu_button_set_child",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets the child widget of {@code menu_button}.
     * <p>
     * Setting a child resets {@code Gtk.MenuButton:label} and
     * {@code Gtk.MenuButton:icon-name}.
     * <p>
     * If {@code Gtk.MenuButton:always-show-arrow} is set to {@code TRUE} and
     * {@code Gtk.MenuButton:direction} is not {@code GTK_ARROW_NONE}, a dropdown arrow
     * will be shown next to the child.
     */
    public @NotNull void setChild(@Nullable Widget child) {
        try {
            gtk_menu_button_set_child.invokeExact(handle(), child.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gtk_menu_button_set_create_popup_func = Interop.downcallHandle(
        "gtk_menu_button_set_create_popup_func",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets {@code func} to be called when a popup is about to be shown.
     * <p>
     * {@code func} should use one of
     * <p>
     * <ul>
     * <li>{@link MenuButton#setPopover}
     * <li>{@link MenuButton#setMenuModel}
     * </ul>
     * <p>
     * to set a popup for {@code menu_button}.
     * If {@code func} is non-{@code null}, {@code menu_button} will always be sensitive.
     * <p>
     * Using this function will not reset the menu widget attached to
     * {@code menu_button}. Instead, this can be done manually in {@code func}.
     */
    public @NotNull void setCreatePopupFunc(@Nullable MenuButtonCreatePopupFunc func) {
        try {
            gtk_menu_button_set_create_popup_func.invokeExact(handle(), 
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Gtk.class, "__cbMenuButtonCreatePopupFunc",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(func)), 
                    Interop.cbDestroyNotifySymbol());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gtk_menu_button_set_direction = Interop.downcallHandle(
        "gtk_menu_button_set_direction",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets the direction in which the popup will be popped up.
     * <p>
     * If the button is automatically populated with an arrow icon,
     * its direction will be changed to match.
     * <p>
     * If the does not fit in the available space in the given direction,
     * GTK will its best to keep it inside the screen and fully visible.
     * <p>
     * If you pass {@link ArrowType#NONE} for a {@code direction}, the popup will behave
     * as if you passed {@link ArrowType#DOWN} (although you won’t see any arrows).
     */
    public @NotNull void setDirection(@NotNull ArrowType direction) {
        try {
            gtk_menu_button_set_direction.invokeExact(handle(), direction.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gtk_menu_button_set_has_frame = Interop.downcallHandle(
        "gtk_menu_button_set_has_frame",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets the style of the button.
     */
    public @NotNull void setHasFrame(@NotNull boolean hasFrame) {
        try {
            gtk_menu_button_set_has_frame.invokeExact(handle(), hasFrame ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gtk_menu_button_set_icon_name = Interop.downcallHandle(
        "gtk_menu_button_set_icon_name",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets the name of an icon to show inside the menu button.
     * <p>
     * Setting icon name resets {@code Gtk.MenuButton:label} and
     * {@code Gtk.MenuButton:child}.
     * <p>
     * If {@code Gtk.MenuButton:always-show-arrow} is set to {@code TRUE} and
     * {@code Gtk.MenuButton:direction} is not {@code GTK_ARROW_NONE}, a dropdown arrow
     * will be shown next to the icon.
     */
    public @NotNull void setIconName(@NotNull java.lang.String iconName) {
        try {
            gtk_menu_button_set_icon_name.invokeExact(handle(), Interop.allocateNativeString(iconName));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gtk_menu_button_set_label = Interop.downcallHandle(
        "gtk_menu_button_set_label",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets the label to show inside the menu button.
     * <p>
     * Setting a label resets {@code Gtk.MenuButton:icon-name} and
     * {@code Gtk.MenuButton:child}.
     * <p>
     * If {@code Gtk.MenuButton:direction} is not {@code GTK_ARROW_NONE}, a dropdown
     * arrow will be shown next to the label.
     */
    public @NotNull void setLabel(@NotNull java.lang.String label) {
        try {
            gtk_menu_button_set_label.invokeExact(handle(), Interop.allocateNativeString(label));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gtk_menu_button_set_menu_model = Interop.downcallHandle(
        "gtk_menu_button_set_menu_model",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets the {@code GMenuModel} from which the popup will be constructed.
     * <p>
     * If {@code menu_model} is {@code null}, the button is disabled.
     * <p>
     * A {@link Popover} will be created from the menu model with
     * {@link PopoverMenu#newFromModel}. Actions will be connected
     * as documented for this function.
     * <p>
     * If {@code Gtk.MenuButton:popover} is already set, it will be
     * dissociated from the {@code menu_button}, and the property is set to {@code null}.
     */
    public @NotNull void setMenuModel(@Nullable org.gtk.gio.MenuModel menuModel) {
        try {
            gtk_menu_button_set_menu_model.invokeExact(handle(), menuModel.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gtk_menu_button_set_popover = Interop.downcallHandle(
        "gtk_menu_button_set_popover",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets the {@code GtkPopover} that will be popped up when the {@code menu_button} is clicked.
     * <p>
     * If {@code popover} is {@code null}, the button is disabled.
     * <p>
     * If {@code Gtk.MenuButton:menu-model} is set, the menu model is dissociated
     * from the {@code menu_button}, and the property is set to {@code null}.
     */
    public @NotNull void setPopover(@Nullable Widget popover) {
        try {
            gtk_menu_button_set_popover.invokeExact(handle(), popover.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gtk_menu_button_set_primary = Interop.downcallHandle(
        "gtk_menu_button_set_primary",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets whether menu button acts as a primary menu.
     * <p>
     * Primary menus can be opened with the &lt;kbd&gt;F10&lt;/kbd&gt; key.
     */
    public @NotNull void setPrimary(@NotNull boolean primary) {
        try {
            gtk_menu_button_set_primary.invokeExact(handle(), primary ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gtk_menu_button_set_use_underline = Interop.downcallHandle(
        "gtk_menu_button_set_use_underline",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * If true, an underline in the text indicates a mnemonic.
     */
    public @NotNull void setUseUnderline(@NotNull boolean useUnderline) {
        try {
            gtk_menu_button_set_use_underline.invokeExact(handle(), useUnderline ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface ActivateHandler {
        void signalReceived(MenuButton source);
    }
    
    /**
     * Emitted to when the menu button is activated.
     * <p>
     * The {@code ::activate} signal on {@code GtkMenuButton} is an action signal and
     * emitting it causes the button to pop up its menu.
     */
    public SignalHandle onActivate(ActivateHandler handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("activate"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(MenuButton.Callbacks.class, "signalMenuButtonActivate",
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
    
        public static void signalMenuButtonActivate(MemoryAddress source, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (MenuButton.ActivateHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new MenuButton(Refcounted.get(source)));
        }
        
    }
}
