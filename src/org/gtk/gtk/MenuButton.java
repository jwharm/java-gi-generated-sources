package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * The `GtkMenuButton` widget is used to display a popup when clicked.
 * 
 * ![An example GtkMenuButton](menu-button.png)
 * 
 * This popup can be provided either as a `GtkPopover` or as an abstract
 * `GMenuModel`.
 * 
 * The `GtkMenuButton` widget can show either an icon (set with the
 * [property@Gtk.MenuButton:icon-name] property) or a label (set with the
 * [property@Gtk.MenuButton:label] property). If neither is explicitly set,
 * a [class@Gtk.Image] is automatically created, using an arrow image oriented
 * according to [property@Gtk.MenuButton:direction] or the generic
 * “open-menu-symbolic” icon if the direction is not set.
 * 
 * The positioning of the popup is determined by the
 * [property@Gtk.MenuButton:direction] property of the menu button.
 * 
 * For menus, the [property@Gtk.Widget:halign] and [property@Gtk.Widget:valign]
 * properties of the menu are also taken into account. For example, when the
 * direction is %GTK_ARROW_DOWN and the horizontal alignment is %GTK_ALIGN_START,
 * the menu will be positioned below the button, with the starting edge
 * (depending on the text direction) of the menu aligned with the starting
 * edge of the button. If there is not enough space below the button, the
 * menu is popped up above the button instead. If the alignment would move
 * part of the menu offscreen, it is “pushed in”.
 * 
 * |           | start                | center                | end                |
 * | -         | ---                  | ---                   | ---                |
 * | **down**  | ![](down-start.png)  | ![](down-center.png)  | ![](down-end.png)  |
 * | **up**    | ![](up-start.png)    | ![](up-center.png)    | ![](up-end.png)    |
 * | **left**  | ![](left-start.png)  | ![](left-center.png)  | ![](left-end.png)  |
 * | **right** | ![](right-start.png) | ![](right-center.png) | ![](right-end.png) |
 * 
 * # CSS nodes
 * 
 * ```
 * menubutton
 * ╰── button.toggle
 *     ╰── <content>
 *          ╰── [arrow]
 * ```
 * 
 * `GtkMenuButton` has a single CSS node with name `menubutton`
 * which contains a `button` node with a `.toggle` style class.
 * 
 * If the button contains an icon, it will have the `.image-button` style class,
 * if it contains text, it will have `.text-button` style class. If an arrow is
 * visible in addition to an icon, text or a custom child, it will also have
 * `.arrow-button` style class.
 * 
 * Inside the toggle button content, there is an `arrow` node for
 * the indicator, which will carry one of the `.none`, `.up`, `.down`,
 * `.left` or `.right` style classes to indicate the direction that
 * the menu will appear in. The CSS is expected to provide a suitable
 * image for each of these cases using the `-gtk-icon-source` property.
 * 
 * Optionally, the `menubutton` node can carry the `.circular` style class
 * to request a round appearance.
 * 
 * # Accessibility
 * 
 * `GtkMenuButton` uses the %GTK_ACCESSIBLE_ROLE_BUTTON role.
 */
public class MenuButton extends Widget implements Accessible, Buildable, ConstraintTarget {

    public MenuButton(io.github.jwharm.javagi.interop.Proxy proxy) {
        super(proxy);
    }
    
    /** Cast object to MenuButton */
    public static MenuButton castFrom(org.gtk.gobject.Object gobject) {
        return new MenuButton(gobject.getProxy());
    }
    
    /**
     * Creates a new `GtkMenuButton` widget with downwards-pointing
     * arrow as the only child.
     * 
     * You can replace the child widget with another `GtkWidget`
     * should you wish to.
     */
    public MenuButton() {
        super(ProxyFactory.getProxy(io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_menu_button_new(), false));
    }
    
    /**
     * Gets whether to show a dropdown arrow even when using an icon.
     */
    public boolean getAlwaysShowArrow() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_menu_button_get_always_show_arrow(HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Gets the child widget of @menu_button.
     */
    public Widget getChild() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_menu_button_get_child(HANDLE());
        return new Widget(ProxyFactory.getProxy(RESULT, false));
    }
    
    /**
     * Returns the direction the popup will be pointing at when popped up.
     */
    public ArrowType getArrowDirection() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_menu_button_get_direction(HANDLE());
        return ArrowType.fromValue(RESULT);
    }
    
    /**
     * Returns whether the button has a frame.
     */
    public boolean getHasFrame() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_menu_button_get_has_frame(HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Gets the name of the icon shown in the button.
     */
    public java.lang.String getIconName() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_menu_button_get_icon_name(HANDLE());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Gets the label shown in the button
     */
    public java.lang.String getLabel() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_menu_button_get_label(HANDLE());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Returns the `GMenuModel` used to generate the popup.
     */
    public org.gtk.gio.MenuModel getMenuModel() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_menu_button_get_menu_model(HANDLE());
        return new org.gtk.gio.MenuModel(ProxyFactory.getProxy(RESULT, false));
    }
    
    /**
     * Returns the `GtkPopover` that pops out of the button.
     * 
     * If the button is not using a `GtkPopover`, this function
     * returns %NULL.
     */
    public Popover getPopover() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_menu_button_get_popover(HANDLE());
        return new Popover(ProxyFactory.getProxy(RESULT, false));
    }
    
    /**
     * Returns whether the menu button acts as a primary menu.
     */
    public boolean getPrimary() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_menu_button_get_primary(HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Returns whether an embedded underline in the text indicates a
     * mnemonic.
     */
    public boolean getUseUnderline() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_menu_button_get_use_underline(HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Dismiss the menu.
     */
    public void popdown() {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_menu_button_popdown(HANDLE());
    }
    
    /**
     * Pop up the menu.
     */
    public void popup() {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_menu_button_popup(HANDLE());
    }
    
    /**
     * Sets whether to show a dropdown arrow even when using an icon or a custom
     * child.
     */
    public void setAlwaysShowArrow(boolean alwaysShowArrow) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_menu_button_set_always_show_arrow(HANDLE(), alwaysShowArrow ? 1 : 0);
    }
    
    /**
     * Sets the child widget of @menu_button.
     * 
     * Setting a child resets [property@Gtk.MenuButton:label] and
     * [property@Gtk.MenuButton:icon-name].
     * 
     * If [property@Gtk.MenuButton:always-show-arrow] is set to `TRUE` and
     * [property@Gtk.MenuButton:direction] is not `GTK_ARROW_NONE`, a dropdown arrow
     * will be shown next to the child.
     */
    public void setChild(Widget child) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_menu_button_set_child(HANDLE(), child.HANDLE());
    }
    
    /**
     * Sets the direction in which the popup will be popped up.
     * 
     * If the button is automatically populated with an arrow icon,
     * its direction will be changed to match.
     * 
     * If the does not fit in the available space in the given direction,
     * GTK will its best to keep it inside the screen and fully visible.
     * 
     * If you pass %GTK_ARROW_NONE for a @direction, the popup will behave
     * as if you passed %GTK_ARROW_DOWN (although you won’t see any arrows).
     */
    public void setDirection(ArrowType direction) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_menu_button_set_direction(HANDLE(), direction.getValue());
    }
    
    /**
     * Sets the style of the button.
     */
    public void setHasFrame(boolean hasFrame) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_menu_button_set_has_frame(HANDLE(), hasFrame ? 1 : 0);
    }
    
    /**
     * Sets the name of an icon to show inside the menu button.
     * 
     * Setting icon name resets [property@Gtk.MenuButton:label] and
     * [property@Gtk.MenuButton:child].
     * 
     * If [property@Gtk.MenuButton:always-show-arrow] is set to `TRUE` and
     * [property@Gtk.MenuButton:direction] is not `GTK_ARROW_NONE`, a dropdown arrow
     * will be shown next to the icon.
     */
    public void setIconName(java.lang.String iconName) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_menu_button_set_icon_name(HANDLE(), Interop.getAllocator().allocateUtf8String(iconName));
    }
    
    /**
     * Sets the label to show inside the menu button.
     * 
     * Setting a label resets [property@Gtk.MenuButton:icon-name] and
     * [property@Gtk.MenuButton:child].
     * 
     * If [property@Gtk.MenuButton:direction] is not `GTK_ARROW_NONE`, a dropdown
     * arrow will be shown next to the label.
     */
    public void setLabel(java.lang.String label) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_menu_button_set_label(HANDLE(), Interop.getAllocator().allocateUtf8String(label));
    }
    
    /**
     * Sets the `GMenuModel` from which the popup will be constructed.
     * 
     * If @menu_model is %NULL, the button is disabled.
     * 
     * A [class@Gtk.Popover] will be created from the menu model with
     * [ctor@Gtk.PopoverMenu.new_from_model]. Actions will be connected
     * as documented for this function.
     * 
     * If [property@Gtk.MenuButton:popover] is already set, it will be
     * dissociated from the @menu_button, and the property is set to %NULL.
     */
    public void setMenuModel(org.gtk.gio.MenuModel menuModel) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_menu_button_set_menu_model(HANDLE(), menuModel.HANDLE());
    }
    
    /**
     * Sets the `GtkPopover` that will be popped up when the @menu_button is clicked.
     * 
     * If @popover is %NULL, the button is disabled.
     * 
     * If [property@Gtk.MenuButton:menu-model] is set, the menu model is dissociated
     * from the @menu_button, and the property is set to %NULL.
     */
    public void setPopover(Widget popover) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_menu_button_set_popover(HANDLE(), popover.HANDLE());
    }
    
    /**
     * Sets whether menu button acts as a primary menu.
     * 
     * Primary menus can be opened with the <kbd>F10</kbd> key.
     */
    public void setPrimary(boolean primary) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_menu_button_set_primary(HANDLE(), primary ? 1 : 0);
    }
    
    /**
     * If true, an underline in the text indicates a mnemonic.
     */
    public void setUseUnderline(boolean useUnderline) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_menu_button_set_use_underline(HANDLE(), useUnderline ? 1 : 0);
    }
    
    @FunctionalInterface
    public interface ActivateHandler {
        void signalReceived(MenuButton source);
    }
    
    /**
     * Emitted to when the menu button is activated.
     * 
     * The `::activate` signal on `GtkMenuButton` is an action signal and
     * emitting it causes the button to pop up its menu.
     */
    public void onActivate(ActivateHandler handler) {
        try {
            int hash = handler.hashCode();
            JVMCallbacks.signalRegistry.put(hash, handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalMenuButtonActivate", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            io.github.jwharm.javagi.interop.jextract.gtk_h.g_signal_connect_data(this.HANDLE(), Interop.getAllocator().allocateUtf8String("activate"), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
}