package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

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
 * <p>
 * <h1>CSS nodes</h1>
 * <p>
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
 * <p>
 * <h1>Accessibility</h1>
 * <p>
 * {@code GtkMenuButton} uses the {@link AccessibleRole#BUTTON} role.
 */
public class MenuButton extends Widget implements Accessible, Buildable, ConstraintTarget {

    public MenuButton(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to MenuButton */
    public static MenuButton castFrom(org.gtk.gobject.Object gobject) {
        return new MenuButton(gobject.getReference());
    }
    
    private static Reference constructNew() {
        Reference RESULT = References.get(gtk_h.gtk_menu_button_new(), false);
        return RESULT;
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
    
    /**
     * Gets whether to show a dropdown arrow even when using an icon.
     */
    public boolean getAlwaysShowArrow() {
        var RESULT = gtk_h.gtk_menu_button_get_always_show_arrow(handle());
        return (RESULT != 0);
    }
    
    /**
     * Gets the child widget of {@code menu_button}.
     */
    public Widget getChild() {
        var RESULT = gtk_h.gtk_menu_button_get_child(handle());
        return new Widget(References.get(RESULT, false));
    }
    
    /**
     * Returns the direction the popup will be pointing at when popped up.
     */
    public ArrowType getArrowDirection() {
        var RESULT = gtk_h.gtk_menu_button_get_direction(handle());
        return ArrowType.fromValue(RESULT);
    }
    
    /**
     * Returns whether the button has a frame.
     */
    public boolean getHasFrame() {
        var RESULT = gtk_h.gtk_menu_button_get_has_frame(handle());
        return (RESULT != 0);
    }
    
    /**
     * Gets the name of the icon shown in the button.
     */
    public java.lang.String getIconName() {
        var RESULT = gtk_h.gtk_menu_button_get_icon_name(handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Gets the label shown in the button
     */
    public java.lang.String getLabel() {
        var RESULT = gtk_h.gtk_menu_button_get_label(handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Returns the {@code GMenuModel} used to generate the popup.
     */
    public org.gtk.gio.MenuModel getMenuModel() {
        var RESULT = gtk_h.gtk_menu_button_get_menu_model(handle());
        return new org.gtk.gio.MenuModel(References.get(RESULT, false));
    }
    
    /**
     * Returns the {@code GtkPopover} that pops out of the button.
     * <p>
     * If the button is not using a {@code GtkPopover}, this function
     * returns {@code null}.
     */
    public Popover getPopover() {
        var RESULT = gtk_h.gtk_menu_button_get_popover(handle());
        return new Popover(References.get(RESULT, false));
    }
    
    /**
     * Returns whether the menu button acts as a primary menu.
     */
    public boolean getPrimary() {
        var RESULT = gtk_h.gtk_menu_button_get_primary(handle());
        return (RESULT != 0);
    }
    
    /**
     * Returns whether an embedded underline in the text indicates a
     * mnemonic.
     */
    public boolean getUseUnderline() {
        var RESULT = gtk_h.gtk_menu_button_get_use_underline(handle());
        return (RESULT != 0);
    }
    
    /**
     * Dismiss the menu.
     */
    public void popdown() {
        gtk_h.gtk_menu_button_popdown(handle());
    }
    
    /**
     * Pop up the menu.
     */
    public void popup() {
        gtk_h.gtk_menu_button_popup(handle());
    }
    
    /**
     * Sets whether to show a dropdown arrow even when using an icon or a custom
     * child.
     */
    public void setAlwaysShowArrow(boolean alwaysShowArrow) {
        gtk_h.gtk_menu_button_set_always_show_arrow(handle(), alwaysShowArrow ? 1 : 0);
    }
    
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
    public void setChild(Widget child) {
        gtk_h.gtk_menu_button_set_child(handle(), child.handle());
    }
    
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
    public void setCreatePopupFunc(MenuButtonCreatePopupFunc func) {
        try {
            gtk_h.gtk_menu_button_set_create_popup_func(handle(), 
                    Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(JVMCallbacks.class, "cbMenuButtonCreatePopupFunc",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    Interop.getAllocator().allocate(C_INT, Interop.registerCallback(func.hashCode(), func)), 
                    Interop.cbDestroyNotifySymbol());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
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
    public void setDirection(ArrowType direction) {
        gtk_h.gtk_menu_button_set_direction(handle(), direction.getValue());
    }
    
    /**
     * Sets the style of the button.
     */
    public void setHasFrame(boolean hasFrame) {
        gtk_h.gtk_menu_button_set_has_frame(handle(), hasFrame ? 1 : 0);
    }
    
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
    public void setIconName(java.lang.String iconName) {
        gtk_h.gtk_menu_button_set_icon_name(handle(), Interop.allocateNativeString(iconName).handle());
    }
    
    /**
     * Sets the label to show inside the menu button.
     * <p>
     * Setting a label resets {@code Gtk.MenuButton:icon-name} and
     * {@code Gtk.MenuButton:child}.
     * <p>
     * If {@code Gtk.MenuButton:direction} is not {@code GTK_ARROW_NONE}, a dropdown
     * arrow will be shown next to the label.
     */
    public void setLabel(java.lang.String label) {
        gtk_h.gtk_menu_button_set_label(handle(), Interop.allocateNativeString(label).handle());
    }
    
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
    public void setMenuModel(org.gtk.gio.MenuModel menuModel) {
        gtk_h.gtk_menu_button_set_menu_model(handle(), menuModel.handle());
    }
    
    /**
     * Sets the {@code GtkPopover} that will be popped up when the {@code menu_button} is clicked.
     * <p>
     * If {@code popover} is {@code null}, the button is disabled.
     * <p>
     * If {@code Gtk.MenuButton:menu-model} is set, the menu model is dissociated
     * from the {@code menu_button}, and the property is set to {@code null}.
     */
    public void setPopover(Widget popover) {
        gtk_h.gtk_menu_button_set_popover(handle(), popover.handle());
    }
    
    /**
     * Sets whether menu button acts as a primary menu.
     * <p>
     * Primary menus can be opened with the &lt;kbd>F10</kbd&gt; key.
     */
    public void setPrimary(boolean primary) {
        gtk_h.gtk_menu_button_set_primary(handle(), primary ? 1 : 0);
    }
    
    /**
     * If true, an underline in the text indicates a mnemonic.
     */
    public void setUseUnderline(boolean useUnderline) {
        gtk_h.gtk_menu_button_set_use_underline(handle(), useUnderline ? 1 : 0);
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
            int hash = Interop.registerCallback(handler.hashCode(), handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalMenuButtonActivate", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            MemorySegment nativeSymbol = Linker.nativeLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            long handlerId = gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("activate").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), handlerId);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
}
