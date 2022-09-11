package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * A `GtkWindow` is a toplevel window which can contain other widgets.
 * 
 * ![An example GtkWindow](window.png)
 * 
 * Windows normally have decorations that are under the control
 * of the windowing system and allow the user to manipulate the window
 * (resize it, move it, close it,...).
 * 
 * # GtkWindow as GtkBuildable
 * 
 * The `GtkWindow` implementation of the [iface@Gtk.Buildable] interface supports
 * setting a child as the titlebar by specifying “titlebar” as the “type”
 * attribute of a <child> element.
 * 
 * # CSS nodes
 * 
 * ```
 * window.background [.csd / .solid-csd / .ssd] [.maximized / .fullscreen / .tiled]
 * ├── <child>
 * ╰── <titlebar child>.titlebar [.default-decoration]
 * ```
 * 
 * `GtkWindow` has a main CSS node with name window and style class .background.
 * 
 * Style classes that are typically used with the main CSS node are .csd (when
 * client-side decorations are in use), .solid-csd (for client-side decorations
 * without invisible borders), .ssd (used by mutter when rendering server-side
 * decorations). GtkWindow also represents window states with the following
 * style classes on the main node: .maximized, .fullscreen, .tiled (when supported,
 * also .tiled-top, .tiled-left, .tiled-right, .tiled-bottom).
 * 
 * `GtkWindow` subclasses often add their own discriminating style classes,
 * such as .dialog, .popup or .tooltip.
 * 
 * Generally, some CSS properties don't make sense on the toplevel window node,
 * such as margins or padding. When client-side decorations without invisible
 * borders are in use (i.e. the .solid-csd style class is added to the
 * main window node), the CSS border of the toplevel window is used for
 * resize drags. In the .csd case, the shadow area outside of the window
 * can be used to resize it.
 * 
 * `GtkWindow` adds the .titlebar and .default-decoration style classes to the
 * widget that is added as a titlebar child.
 * 
 * # Accessibility
 * 
 * `GtkWindow` uses the %GTK_ACCESSIBLE_ROLE_WINDOW role.
 * 
 * # Actions
 * 
 * `GtkWindow` defines a set of built-in actions:
 * - `default.activate`: Activate the default widget.
 * - `window.minimize`: Minimize the window.
 * - `window.toggle-maximized`: Maximize or restore the window.
 * - `window.close`: Close the window.
 */
public class Window extends Widget implements Accessible, Buildable, ConstraintTarget, Native, Root, ShortcutManager {

    public Window(io.github.jwharm.javagi.interop.Reference reference) {
        super(reference);
    }
    
    /** Cast object to Window */
    public static Window castFrom(org.gtk.gobject.Object gobject) {
        return new Window(gobject.getReference());
    }
    
    /**
     * Creates a new `GtkWindow`.
     * 
     * To get an undecorated window (no window borders), use
     * [method@Gtk.Window.set_decorated].
     * 
     * All top-level windows created by gtk_window_new() are stored
     * in an internal top-level window list. This list can be obtained
     * from [func@Gtk.Window.list_toplevels]. Due to GTK keeping a
     * reference to the window internally, gtk_window_new() does not
     * return a reference to the caller.
     * 
     * To delete a `GtkWindow`, call [method@Gtk.Window.destroy].
     */
    public Window() {
        super(References.get(gtk_h.gtk_window_new(), false));
    }
    
    /**
     * Requests that the window is closed.
     * 
     * This is similar to what happens when a window manager
     * close button is clicked.
     * 
     * This function can be used with close buttons in custom
     * titlebars.
     */
    public void close() {
        gtk_h.gtk_window_close(handle());
    }
    
    /**
     * Drop the internal reference GTK holds on toplevel windows.
     */
    public void destroy() {
        gtk_h.gtk_window_destroy(handle());
    }
    
    /**
     * Asks to place @window in the fullscreen state.
     * 
     * Note that you shouldn’t assume the window is definitely fullscreen
     * afterward, because other entities (e.g. the user or window manager
     * unfullscreen it again, and not all window managers honor requests
     * to fullscreen windows.
     * 
     * You can track the result of this operation via the
     * [property@Gdk.Toplevel:state] property, or by listening to
     * notifications of the [property@Gtk.Window:fullscreened] property.
     */
    public void fullscreen() {
        gtk_h.gtk_window_fullscreen(handle());
    }
    
    /**
     * Asks to place @window in the fullscreen state on the given @monitor.
     * 
     * Note that you shouldn't assume the window is definitely fullscreen
     * afterward, or that the windowing system allows fullscreen windows on
     * any given monitor.
     * 
     * You can track the result of this operation via the
     * [property@Gdk.Toplevel:state] property, or by listening to
     * notifications of the [property@Gtk.Window:fullscreened] property.
     */
    public void fullscreenOnMonitor(org.gtk.gdk.Monitor monitor) {
        gtk_h.gtk_window_fullscreen_on_monitor(handle(), monitor.handle());
    }
    
    /**
     * Gets the `GtkApplication` associated with the window.
     */
    public Application getApplication() {
        var RESULT = gtk_h.gtk_window_get_application(handle());
        return new Application(References.get(RESULT, false));
    }
    
    /**
     * Gets the child widget of @window.
     */
    public Widget getChild() {
        var RESULT = gtk_h.gtk_window_get_child(handle());
        return new Widget(References.get(RESULT, false));
    }
    
    /**
     * Returns whether the window has been set to have decorations.
     */
    public boolean getDecorated() {
        var RESULT = gtk_h.gtk_window_get_decorated(handle());
        return (RESULT != 0);
    }
    
    /**
     * Returns the default widget for @window.
     */
    public Widget getDefaultWidget() {
        var RESULT = gtk_h.gtk_window_get_default_widget(handle());
        return new Widget(References.get(RESULT, false));
    }
    
    /**
     * Returns whether the window has been set to have a close button.
     */
    public boolean getDeletable() {
        var RESULT = gtk_h.gtk_window_get_deletable(handle());
        return (RESULT != 0);
    }
    
    /**
     * Returns whether the window will be destroyed with its transient parent.
     */
    public boolean getDestroyWithParent() {
        var RESULT = gtk_h.gtk_window_get_destroy_with_parent(handle());
        return (RESULT != 0);
    }
    
    /**
     * Retrieves the current focused widget within the window.
     * 
     * Note that this is the widget that would have the focus
     * if the toplevel window focused; if the toplevel window
     * is not focused then `gtk_widget_has_focus (widget)` will
     * not be %TRUE for the widget.
     */
    public Widget getFocus() {
        var RESULT = gtk_h.gtk_window_get_focus(handle());
        return new Widget(References.get(RESULT, false));
    }
    
    /**
     * Gets whether “focus rectangles” are supposed to be visible.
     */
    public boolean getFocusVisible() {
        var RESULT = gtk_h.gtk_window_get_focus_visible(handle());
        return (RESULT != 0);
    }
    
    /**
     * Returns the group for @window.
     * 
     * If the window has no group, then the default group is returned.
     */
    public WindowGroup getGroup() {
        var RESULT = gtk_h.gtk_window_get_group(handle());
        return new WindowGroup(References.get(RESULT, false));
    }
    
    /**
     * Returns whether this window reacts to F10 key presses by
     * activating a menubar it contains.
     */
    public boolean getHandleMenubarAccel() {
        var RESULT = gtk_h.gtk_window_get_handle_menubar_accel(handle());
        return (RESULT != 0);
    }
    
    /**
     * Returns whether the window will be hidden when the close button is clicked.
     */
    public boolean getHideOnClose() {
        var RESULT = gtk_h.gtk_window_get_hide_on_close(handle());
        return (RESULT != 0);
    }
    
    /**
     * Returns the name of the themed icon for the window.
     */
    public java.lang.String getIconName() {
        var RESULT = gtk_h.gtk_window_get_icon_name(handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Gets whether mnemonics are supposed to be visible.
     */
    public boolean getMnemonicsVisible() {
        var RESULT = gtk_h.gtk_window_get_mnemonics_visible(handle());
        return (RESULT != 0);
    }
    
    /**
     * Returns whether the window is modal.
     */
    public boolean getModal() {
        var RESULT = gtk_h.gtk_window_get_modal(handle());
        return (RESULT != 0);
    }
    
    /**
     * Gets the value set by gtk_window_set_resizable().
     */
    public boolean getResizable() {
        var RESULT = gtk_h.gtk_window_get_resizable(handle());
        return (RESULT != 0);
    }
    
    /**
     * Retrieves the title of the window.
     */
    public java.lang.String getTitle() {
        var RESULT = gtk_h.gtk_window_get_title(handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Returns the custom titlebar that has been set with
     * gtk_window_set_titlebar().
     */
    public Widget getTitlebar() {
        var RESULT = gtk_h.gtk_window_get_titlebar(handle());
        return new Widget(References.get(RESULT, false));
    }
    
    /**
     * Fetches the transient parent for this window.
     */
    public Window getTransientFor() {
        var RESULT = gtk_h.gtk_window_get_transient_for(handle());
        return new Window(References.get(RESULT, false));
    }
    
    /**
     * Returns whether @window has an explicit window group.
     */
    public boolean hasGroup() {
        var RESULT = gtk_h.gtk_window_has_group(handle());
        return (RESULT != 0);
    }
    
    /**
     * Returns whether the window is part of the current active toplevel.
     * 
     * The active toplevel is the window receiving keystrokes.
     * 
     * The return value is %TRUE if the window is active toplevel itself.
     * You might use this function if you wanted to draw a widget
     * differently in an active window from a widget in an inactive window.
     */
    public boolean isActive() {
        var RESULT = gtk_h.gtk_window_is_active(handle());
        return (RESULT != 0);
    }
    
    /**
     * Retrieves the current fullscreen state of @window.
     * 
     * Note that since fullscreening is ultimately handled by the window
     * manager and happens asynchronously to an application request, you
     * shouldn’t assume the return value of this function changing
     * immediately (or at all), as an effect of calling
     * [method@Gtk.Window.fullscreen] or [method@Gtk.Window.unfullscreen].
     * 
     * If the window isn't yet mapped, the value returned will whether the
     * initial requested state is fullscreen.
     */
    public boolean isFullscreen() {
        var RESULT = gtk_h.gtk_window_is_fullscreen(handle());
        return (RESULT != 0);
    }
    
    /**
     * Retrieves the current maximized state of @window.
     * 
     * Note that since maximization is ultimately handled by the window
     * manager and happens asynchronously to an application request, you
     * shouldn’t assume the return value of this function changing
     * immediately (or at all), as an effect of calling
     * [method@Gtk.Window.maximize] or [method@Gtk.Window.unmaximize].
     * 
     * If the window isn't yet mapped, the value returned will whether the
     * initial requested state is maximized.
     */
    public boolean isMaximized() {
        var RESULT = gtk_h.gtk_window_is_maximized(handle());
        return (RESULT != 0);
    }
    
    /**
     * Asks to maximize @window, so that it fills the screen.
     * 
     * Note that you shouldn’t assume the window is definitely maximized
     * afterward, because other entities (e.g. the user or window manager
     * could unmaximize it again, and not all window managers support
     * maximization.
     * 
     * It’s permitted to call this function before showing a window,
     * in which case the window will be maximized when it appears onscreen
     * initially.
     * 
     * You can track the result of this operation via the
     * [property@Gdk.Toplevel:state] property, or by listening to
     * notifications on the [property@Gtk.Window:maximized]
     * property.
     */
    public void maximize() {
        gtk_h.gtk_window_maximize(handle());
    }
    
    /**
     * Asks to minimize the specified @window.
     * 
     * Note that you shouldn’t assume the window is definitely minimized
     * afterward, because the windowing system might not support this
     * functionality; other entities (e.g. the user or the window manager
     * could unminimize it again, or there may not be a window manager in
     * which case minimization isn’t possible, etc.
     * 
     * It’s permitted to call this function before showing a window,
     * in which case the window will be minimized before it ever appears
     * onscreen.
     * 
     * You can track result of this operation via the
     * [property@Gdk.Toplevel:state] property.
     */
    public void minimize() {
        gtk_h.gtk_window_minimize(handle());
    }
    
    /**
     * Presents a window to the user.
     * 
     * This function should not be used as when it is called,
     * it is too late to gather a valid timestamp to allow focus
     * stealing prevention to work correctly.
     */
    public void present() {
        gtk_h.gtk_window_present(handle());
    }
    
    /**
     * Presents a window to the user.
     * 
     * This may mean raising the window in the stacking order,
     * unminimizing it, moving it to the current desktop, and/or
     * giving it the keyboard focus, possibly dependent on the user’s
     * platform, window manager, and preferences.
     * 
     * If @window is hidden, this function calls [method@Gtk.Widget.show]
     * as well.
     * 
     * This function should be used when the user tries to open a window
     * that’s already open. Say for example the preferences dialog is
     * currently open, and the user chooses Preferences from the menu
     * a second time; use [method@Gtk.Window.present] to move the
     * already-open dialog where the user can see it.
     * 
     * Presents a window to the user in response to a user interaction.
     * The timestamp should be gathered when the window was requested
     * to be shown (when clicking a link for example), rather than once
     * the window is ready to be shown.
     */
    public void presentWithTime(int timestamp) {
        gtk_h.gtk_window_present_with_time(handle(), timestamp);
    }
    
    /**
     * Sets or unsets the `GtkApplication` associated with the window.
     * 
     * The application will be kept alive for at least as long as it has
     * any windows associated with it (see g_application_hold() for a way
     * to keep it alive without windows).
     * 
     * Normally, the connection between the application and the window will
     * remain until the window is destroyed, but you can explicitly remove
     * it by setting the @application to %NULL.
     * 
     * This is equivalent to calling [method@Gtk.Application.remove_window]
     * and/or [method@Gtk.Application.add_window] on the old/new applications
     * as relevant.
     */
    public void setApplication(Application application) {
        gtk_h.gtk_window_set_application(handle(), application.handle());
    }
    
    /**
     * Sets the child widget of @window.
     */
    public void setChild(Widget child) {
        gtk_h.gtk_window_set_child(handle(), child.handle());
    }
    
    /**
     * Sets whether the window should be decorated.
     * 
     * By default, windows are decorated with a title bar, resize
     * controls, etc. Some window managers allow GTK to disable these
     * decorations, creating a borderless window. If you set the decorated
     * property to %FALSE using this function, GTK will do its best to
     * convince the window manager not to decorate the window. Depending on
     * the system, this function may not have any effect when called on a
     * window that is already visible, so you should call it before calling
     * [method@Gtk.Widget.show].
     * 
     * On Windows, this function always works, since there’s no window manager
     * policy involved.
     */
    public void setDecorated(boolean setting) {
        gtk_h.gtk_window_set_decorated(handle(), setting ? 1 : 0);
    }
    
    /**
     * Sets the default size of a window.
     * 
     * If the window’s “natural” size (its size request) is larger than
     * the default, the default will be ignored.
     * 
     * Unlike [method@Gtk.Widget.set_size_request], which sets a size
     * request for a widget and thus would keep users from shrinking
     * the window, this function only sets the initial size, just as
     * if the user had resized the window themselves. Users can still
     * shrink the window again as they normally would. Setting a default
     * size of -1 means to use the “natural” default size (the size request
     * of the window).
     * 
     * The default size of a window only affects the first time a window is
     * shown; if a window is hidden and re-shown, it will remember the size
     * it had prior to hiding, rather than using the default size.
     * 
     * Windows can’t actually be 0x0 in size, they must be at least 1x1, but
     * passing 0 for @width and @height is OK, resulting in a 1x1 default size.
     * 
     * If you use this function to reestablish a previously saved window size,
     * note that the appropriate size to save is the one returned by
     * [method@Gtk.Window.get_default_size]. Using the window allocation
     * directly will not work in all circumstances and can lead to growing
     * or shrinking windows.
     */
    public void setDefaultSize(int width, int height) {
        gtk_h.gtk_window_set_default_size(handle(), width, height);
    }
    
    /**
     * Sets the default widget.
     * 
     * The default widget is the widget that is activated when the user
     * presses Enter in a dialog (for example).
     */
    public void setDefaultWidget(Widget defaultWidget) {
        gtk_h.gtk_window_set_default_widget(handle(), defaultWidget.handle());
    }
    
    /**
     * Sets whether the window should be deletable.
     * 
     * By default, windows have a close button in the window frame.
     * Some  window managers allow GTK to disable this button. If you
     * set the deletable property to %FALSE using this function, GTK
     * will do its best to convince the window manager not to show a
     * close button. Depending on the system, this function may not
     * have any effect when called on a window that is already visible,
     * so you should call it before calling [method@Gtk.Widget.show].
     * 
     * On Windows, this function always works, since there’s no window
     * manager policy involved.
     */
    public void setDeletable(boolean setting) {
        gtk_h.gtk_window_set_deletable(handle(), setting ? 1 : 0);
    }
    
    /**
     * If @setting is %TRUE, then destroying the transient parent of @window
     * will also destroy @window itself.
     * 
     * This is useful for dialogs that shouldn’t persist beyond the lifetime
     * of the main window they are associated with, for example.
     */
    public void setDestroyWithParent(boolean setting) {
        gtk_h.gtk_window_set_destroy_with_parent(handle(), setting ? 1 : 0);
    }
    
    /**
     * Sets the `GdkDisplay` where the @window is displayed.
     * 
     * If the window is already mapped, it will be unmapped,
     * and then remapped on the new display.
     */
    public void setDisplay(org.gtk.gdk.Display display) {
        gtk_h.gtk_window_set_display(handle(), display.handle());
    }
    
    /**
     * Sets the focus widget.
     * 
     * If @focus is not the current focus widget, and is focusable,
     * sets it as the focus widget for the window. If @focus is %NULL,
     * unsets the focus widget for this window. To set the focus to a
     * particular widget in the toplevel, it is usually more convenient
     * to use [method@Gtk.Widget.grab_focus] instead of this function.
     */
    public void setFocus(Widget focus) {
        gtk_h.gtk_window_set_focus(handle(), focus.handle());
    }
    
    /**
     * Sets whether “focus rectangles” are supposed to be visible.
     */
    public void setFocusVisible(boolean setting) {
        gtk_h.gtk_window_set_focus_visible(handle(), setting ? 1 : 0);
    }
    
    /**
     * Sets whether this window should react to F10 key presses
     * by activating a menubar it contains.
     */
    public void setHandleMenubarAccel(boolean handleMenubarAccel) {
        gtk_h.gtk_window_set_handle_menubar_accel(handle(), handleMenubarAccel ? 1 : 0);
    }
    
    /**
     * If @setting is %TRUE, then clicking the close button on the window
     * will not destroy it, but only hide it.
     */
    public void setHideOnClose(boolean setting) {
        gtk_h.gtk_window_set_hide_on_close(handle(), setting ? 1 : 0);
    }
    
    /**
     * Sets the icon for the window from a named themed icon.
     * 
     * See the docs for [class@Gtk.IconTheme] for more details.
     * On some platforms, the window icon is not used at all.
     * 
     * Note that this has nothing to do with the WM_ICON_NAME
     * property which is mentioned in the ICCCM.
     */
    public void setIconName(java.lang.String name) {
        gtk_h.gtk_window_set_icon_name(handle(), Interop.allocateNativeString(name).handle());
    }
    
    /**
     * Sets whether mnemonics are supposed to be visible.
     */
    public void setMnemonicsVisible(boolean setting) {
        gtk_h.gtk_window_set_mnemonics_visible(handle(), setting ? 1 : 0);
    }
    
    /**
     * Sets a window modal or non-modal.
     * 
     * Modal windows prevent interaction with other windows in the same
     * application. To keep modal dialogs on top of main application windows,
     * use [method@Gtk.Window.set_transient_for] to make the dialog transient
     * for the parent; most window managers will then disallow lowering the
     * dialog below the parent.
     */
    public void setModal(boolean modal) {
        gtk_h.gtk_window_set_modal(handle(), modal ? 1 : 0);
    }
    
    /**
     * Sets whether the user can resize a window.
     * 
     * Windows are user resizable by default.
     */
    public void setResizable(boolean resizable) {
        gtk_h.gtk_window_set_resizable(handle(), resizable ? 1 : 0);
    }
    
    /**
     * Sets the startup notification ID.
     * 
     * Startup notification identifiers are used by desktop environment
     * to track application startup, to provide user feedback and other
     * features. This function changes the corresponding property on the
     * underlying `GdkSurface`.
     * 
     * Normally, startup identifier is managed automatically and you should
     * only use this function in special cases like transferring focus from
     * other processes. You should use this function before calling
     * [method@Gtk.Window.present] or any equivalent function generating
     * a window map event.
     * 
     * This function is only useful on X11, not with other GTK targets.
     */
    public void setStartupId(java.lang.String startupId) {
        gtk_h.gtk_window_set_startup_id(handle(), Interop.allocateNativeString(startupId).handle());
    }
    
    /**
     * Sets the title of the `GtkWindow`.
     * 
     * The title of a window will be displayed in its title bar; on the
     * X Window System, the title bar is rendered by the window manager
     * so exactly how the title appears to users may vary according to a
     * user’s exact configuration. The title should help a user distinguish
     * this window from other windows they may have open. A good title might
     * include the application name and current document filename, for example.
     * 
     * Passing %NULL does the same as setting the title to an empty string.
     */
    public void setTitle(java.lang.String title) {
        gtk_h.gtk_window_set_title(handle(), Interop.allocateNativeString(title).handle());
    }
    
    /**
     * Sets a custom titlebar for @window.
     * 
     * A typical widget used here is [class@Gtk.HeaderBar], as it
     * provides various features expected of a titlebar while allowing
     * the addition of child widgets to it.
     * 
     * If you set a custom titlebar, GTK will do its best to convince
     * the window manager not to put its own titlebar on the window.
     * Depending on the system, this function may not work for a window
     * that is already visible, so you set the titlebar before calling
     * [method@Gtk.Widget.show].
     */
    public void setTitlebar(Widget titlebar) {
        gtk_h.gtk_window_set_titlebar(handle(), titlebar.handle());
    }
    
    /**
     * Dialog windows should be set transient for the main application
     * window they were spawned from. This allows window managers to e.g.
     * keep the dialog on top of the main window, or center the dialog
     * over the main window. [ctor@Gtk.Dialog.new_with_buttons] and other
     * convenience functions in GTK will sometimes call
     * gtk_window_set_transient_for() on your behalf.
     * 
     * Passing %NULL for @parent unsets the current transient window.
     * 
     * On Windows, this function puts the child window on top of the parent,
     * much as the window manager would have done on X.
     */
    public void setTransientFor(Window parent) {
        gtk_h.gtk_window_set_transient_for(handle(), parent.handle());
    }
    
    /**
     * Asks to remove the fullscreen state for @window, and return to
     * its previous state.
     * 
     * Note that you shouldn’t assume the window is definitely not
     * fullscreen afterward, because other entities (e.g. the user or
     * window manager could fullscreen it again, and not all window
     * managers honor requests to unfullscreen windows; normally the
     * window will end up restored to its normal state. Just don’t
     * write code that crashes if not.
     * 
     * You can track the result of this operation via the
     * [property@Gdk.Toplevel:state] property, or by listening to
     * notifications of the [property@Gtk.Window:fullscreened] property.
     */
    public void unfullscreen() {
        gtk_h.gtk_window_unfullscreen(handle());
    }
    
    /**
     * Asks to unmaximize @window.
     * 
     * Note that you shouldn’t assume the window is definitely unmaximized
     * afterward, because other entities (e.g. the user or window manager
     * maximize it again, and not all window managers honor requests to
     * unmaximize.
     * 
     * You can track the result of this operation via the
     * [property@Gdk.Toplevel:state] property, or by listening to
     * notifications on the [property@Gtk.Window:maximized] property.
     */
    public void unmaximize() {
        gtk_h.gtk_window_unmaximize(handle());
    }
    
    /**
     * Asks to unminimize the specified @window.
     * 
     * Note that you shouldn’t assume the window is definitely unminimized
     * afterward, because the windowing system might not support this
     * functionality; other entities (e.g. the user or the window manager
     * could minimize it again, or there may not be a window manager in
     * which case minimization isn’t possible, etc.
     * 
     * You can track result of this operation via the
     * [property@Gdk.Toplevel:state] property.
     */
    public void unminimize() {
        gtk_h.gtk_window_unminimize(handle());
    }
    
    /**
     * Returns the fallback icon name for windows.
     * 
     * The returned string is owned by GTK and should not
     * be modified. It is only valid until the next call to
     * [func@Gtk.Window.set_default_icon_name].
     */
    public static java.lang.String getDefaultIconName() {
        var RESULT = gtk_h.gtk_window_get_default_icon_name();
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Returns a list of all existing toplevel windows.
     * 
     * If you want to iterate through the list and perform actions involving
     * callbacks that might destroy the widgets or add new ones, be aware that
     * the list of toplevels will change and emit the "items-changed" signal.
     */
    public static org.gtk.gio.ListModel getToplevels() {
        var RESULT = gtk_h.gtk_window_get_toplevels();
        return new org.gtk.gio.ListModel.ListModelImpl(References.get(RESULT, false));
    }
    
    /**
     * Returns a list of all existing toplevel windows.
     * 
     * The widgets in the list are not individually referenced.
     * If you want to iterate through the list and perform actions
     * involving callbacks that might destroy the widgets, you must
     * call `g_list_foreach (result, (GFunc)g_object_ref, NULL)` first,
     * and then unref all the widgets afterwards.
     */
    public static org.gtk.glib.List listToplevels() {
        var RESULT = gtk_h.gtk_window_list_toplevels();
        return new org.gtk.glib.List(References.get(RESULT, false));
    }
    
    /**
     * Sets whether the window should request startup notification.
     * 
     * By default, after showing the first `GtkWindow`, GTK calls
     * [method@Gdk.Display.notify_startup_complete]. Call this function
     * to disable the automatic startup notification. You might do this
     * if your first window is a splash screen, and you want to delay
     * notification until after your real main window has been shown,
     * for example.
     * 
     * In that example, you would disable startup notification
     * temporarily, show your splash screen, then re-enable it so that
     * showing the main window would automatically result in notification.
     */
    public static void setAutoStartupNotification(boolean setting) {
        gtk_h.gtk_window_set_auto_startup_notification(setting ? 1 : 0);
    }
    
    /**
     * Sets an icon to be used as fallback.
     * 
     * The fallback icon is used for windows that
     * haven't had [method@Gtk.Window.set_icon_name]
     * called on them.
     */
    public static void setDefaultIconName(java.lang.String name) {
        gtk_h.gtk_window_set_default_icon_name(Interop.allocateNativeString(name).handle());
    }
    
    /**
     * Opens or closes the [interactive debugger](running.html#interactive-debugging).
     * 
     * The debugger offers access to the widget hierarchy of the application
     * and to useful debugging tools.
     */
    public static void setInteractiveDebugging(boolean enable) {
        gtk_h.gtk_window_set_interactive_debugging(enable ? 1 : 0);
    }
    
    @FunctionalInterface
    public interface ActivateDefaultHandler {
        void signalReceived(Window source);
    }
    
    /**
     * Emitted when the user activates the default widget
     * of @window.
     * 
     * This is a [keybinding signal](class.SignalAction.html).
     */
    public void onActivateDefault(ActivateDefaultHandler handler) {
        try {
            int hash = handler.hashCode();
            Interop.signalRegistry.put(hash, handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalWindowActivateDefault", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("activate-default").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    @FunctionalInterface
    public interface ActivateFocusHandler {
        void signalReceived(Window source);
    }
    
    /**
     * Emitted when the user activates the currently focused
     * widget of @window.
     * 
     * This is a [keybinding signal](class.SignalAction.html).
     */
    public void onActivateFocus(ActivateFocusHandler handler) {
        try {
            int hash = handler.hashCode();
            Interop.signalRegistry.put(hash, handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalWindowActivateFocus", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("activate-focus").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    @FunctionalInterface
    public interface CloseRequestHandler {
        boolean signalReceived(Window source);
    }
    
    /**
     * Emitted when the user clicks on the close button of the window.
     */
    public void onCloseRequest(CloseRequestHandler handler) {
        try {
            int hash = handler.hashCode();
            Interop.signalRegistry.put(hash, handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(boolean.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalWindowCloseRequest", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("close-request").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    @FunctionalInterface
    public interface EnableDebuggingHandler {
        boolean signalReceived(Window source, boolean toggle);
    }
    
    /**
     * Emitted when the user enables or disables interactive debugging.
     * 
     * When @toggle is %TRUE, interactive debugging is toggled on or off,
     * when it is %FALSE, the debugger will be pointed at the widget
     * under the pointer.
     * 
     * This is a [keybinding signal](class.SignalAction.html).
     * 
     * The default bindings for this signal are Ctrl-Shift-I
     * and Ctrl-Shift-D.
     */
    public void onEnableDebugging(EnableDebuggingHandler handler) {
        try {
            int hash = handler.hashCode();
            Interop.signalRegistry.put(hash, handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(boolean.class, MemoryAddress.class, boolean.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalWindowEnableDebugging", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("enable-debugging").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    @FunctionalInterface
    public interface KeysChangedHandler {
        void signalReceived(Window source);
    }
    
    /**
     * emitted when the set of accelerators or mnemonics that
     * are associated with @window changes.
     */
    public void onKeysChanged(KeysChangedHandler handler) {
        try {
            int hash = handler.hashCode();
            Interop.signalRegistry.put(hash, handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalWindowKeysChanged", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("keys-changed").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
}
