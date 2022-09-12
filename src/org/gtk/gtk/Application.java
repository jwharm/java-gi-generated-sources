package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * `GtkApplication` is a high-level API for writing applications.
 * 
 * It supports many aspects of writing a GTK application in a convenient
 * fashion, without enforcing a one-size-fits-all model.
 * 
 * Currently, `GtkApplication` handles GTK initialization, application
 * uniqueness, session management, provides some basic scriptability and
 * desktop shell integration by exporting actions and menus and manages a
 * list of toplevel windows whose life-cycle is automatically tied to the
 * life-cycle of your application.
 * 
 * While `GtkApplication` works fine with plain [class@Gtk.Window]s, it is
 * recommended to use it together with [class@Gtk.ApplicationWindow].
 * 
 * ## Automatic resources
 * 
 * `GtkApplication` will automatically load menus from the `GtkBuilder`
 * resource located at "gtk/menus.ui", relative to the application's
 * resource base path (see [method@Gio.Application.set_resource_base_path]).
 * The menu with the ID "menubar" is taken as the application's
 * menubar. Additional menus (most interesting submenus) can be named
 * and accessed via [method@Gtk.Application.get_menu_by_id] which allows for
 * dynamic population of a part of the menu structure.
 * 
 * It is also possible to provide the menubar manually using
 * [method@Gtk.Application.set_menubar].
 * 
 * `GtkApplication` will also automatically setup an icon search path for
 * the default icon theme by appending "icons" to the resource base
 * path. This allows your application to easily store its icons as
 * resources. See [method@Gtk.IconTheme.add_resource_path] for more
 * information.
 * 
 * If there is a resource located at `gtk/help-overlay.ui` which
 * defines a [class@Gtk.ShortcutsWindow] with ID `help_overlay` then
 * `GtkApplication` associates an instance of this shortcuts window with
 * each [class@Gtk.ApplicationWindow] and sets up the keyboard accelerator
 * <kbd>Control</kbd>+<kbd>?</kbd> to open it. To create a menu item that
 * displays the shortcuts window, associate the item with the action
 * `win.show-help-overlay`.
 * 
 * ## A simple application
 * 
 * [A simple example](https://gitlab.gnome.org/GNOME/gtk/tree/main/examples/bp/bloatpad.c)
 * is available in the GTK source code repository
 * 
 * `GtkApplication` optionally registers with a session manager of the
 * users session (if you set the [property@Gtk.Application:register-session]
 * property) and offers various functionality related to the session
 * life-cycle.
 * 
 * An application can block various ways to end the session with
 * the [method@Gtk.Application.inhibit] function. Typical use cases for
 * this kind of inhibiting are long-running, uninterruptible operations,
 * such as burning a CD or performing a disk backup. The session
 * manager may not honor the inhibitor, but it can be expected to
 * inform the user about the negative consequences of ending the
 * session while inhibitors are present.
 * 
 * ## See Also
 * 
 * [HowDoI: Using GtkApplication](https://wiki.gnome.org/HowDoI/GtkApplication),
 * [Getting Started with GTK: Basics](getting_started.html#basics)
 */
public class Application extends org.gtk.gio.Application implements org.gtk.gio.ActionGroup, org.gtk.gio.ActionMap {

    public Application(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to Application */
    public static Application castFrom(org.gtk.gobject.Object gobject) {
        return new Application(gobject.getReference());
    }
    
    private static Reference constructNew(java.lang.String applicationId, int flags) {
        Reference RESULT = References.get(gtk_h.gtk_application_new(Interop.allocateNativeString(applicationId).handle(), flags), true);
        return RESULT;
    }
    
    /**
     * Creates a new `GtkApplication` instance.
     * 
     * When using `GtkApplication`, it is not necessary to call [func@Gtk.init]
     * manually. It is called as soon as the application gets registered as
     * the primary instance.
     * 
     * Concretely, [func@Gtk.init] is called in the default handler for the
     * `GApplication::startup` signal. Therefore, `GtkApplication` subclasses should
     * always chain up in their `GApplication::startup` handler before using any GTK
     * API.
     * 
     * Note that commandline arguments are not passed to [func@Gtk.init].
     * 
     * If `application_id` is not %NULL, then it must be valid. See
     * `g_application_id_is_valid()`.
     * 
     * If no application ID is given then some features (most notably application
     * uniqueness) will be disabled.
     */
    public Application(java.lang.String applicationId, int flags) {
        super(constructNew(applicationId, flags));
    }
    
    /**
     * Adds a window to `application`.
     * 
     * This call can only happen after the `application` has started;
     * typically, you should add new application windows in response
     * to the emission of the `GApplication::activate` signal.
     * 
     * This call is equivalent to setting the [property@Gtk.Window:application]
     * property of `window` to `application`.
     * 
     * Normally, the connection between the application and the window
     * will remain until the window is destroyed, but you can explicitly
     * remove it with [method@Gtk.Application.remove_window].
     * 
     * GTK will keep the `application` running as long as it has
     * any windows.
     */
    public void addWindow(Window window) {
        gtk_h.gtk_application_add_window(handle(), window.handle());
    }
    
    /**
     * Gets the “active” window for the application.
     * 
     * The active window is the one that was most recently focused (within
     * the application).  This window may not have the focus at the moment
     * if another application has it — this is just the most
     * recently-focused window within this application.
     */
    public Window getActiveWindow() {
        var RESULT = gtk_h.gtk_application_get_active_window(handle());
        return new Window(References.get(RESULT, false));
    }
    
    /**
     * Gets a menu from automatically loaded resources.
     * 
     * See [the section on Automatic resources](class.Application.html#automatic-resources)
     * for more information.
     */
    public org.gtk.gio.Menu getMenuById(java.lang.String id) {
        var RESULT = gtk_h.gtk_application_get_menu_by_id(handle(), Interop.allocateNativeString(id).handle());
        return new org.gtk.gio.Menu(References.get(RESULT, false));
    }
    
    /**
     * Returns the menu model that has been set with
     * [method@Gtk.Application.set_menubar].
     */
    public org.gtk.gio.MenuModel getMenubar() {
        var RESULT = gtk_h.gtk_application_get_menubar(handle());
        return new org.gtk.gio.MenuModel(References.get(RESULT, false));
    }
    
    /**
     * Returns the [class@Gtk.ApplicationWindow] with the given ID.
     * 
     * The ID of a `GtkApplicationWindow` can be retrieved with
     * [method@Gtk.ApplicationWindow.get_id].
     */
    public Window getWindowById(int id) {
        var RESULT = gtk_h.gtk_application_get_window_by_id(handle(), id);
        return new Window(References.get(RESULT, false));
    }
    
    /**
     * Gets a list of the [class@Gtk.Window] instances associated with `application`.
     * 
     * The list is sorted by most recently focused window, such that the first
     * element is the currently focused window. (Useful for choosing a parent
     * for a transient window.)
     * 
     * The list that is returned should not be modified in any way. It will
     * only remain valid until the next focus change or window creation or
     * deletion.
     */
    public org.gtk.glib.List getWindows() {
        var RESULT = gtk_h.gtk_application_get_windows(handle());
        return new org.gtk.glib.List(References.get(RESULT, false));
    }
    
    /**
     * Inform the session manager that certain types of actions should be
     * inhibited.
     * 
     * This is not guaranteed to work on all platforms and for all types of
     * actions.
     * 
     * Applications should invoke this method when they begin an operation
     * that should not be interrupted, such as creating a CD or DVD. The
     * types of actions that may be blocked are specified by the `flags`
     * parameter. When the application completes the operation it should
     * call [method@Gtk.Application.uninhibit] to remove the inhibitor. Note
     * that an application can have multiple inhibitors, and all of them must
     * be individually removed. Inhibitors are also cleared when the
     * application exits.
     * 
     * Applications should not expect that they will always be able to block
     * the action. In most cases, users will be given the option to force
     * the action to take place.
     * 
     * The `reason` message should be short and to the point.
     * 
     * If `window` is given, the session manager may point the user to
     * this window to find out more about why the action is inhibited.
     */
    public int inhibit(Window window, int flags, java.lang.String reason) {
        var RESULT = gtk_h.gtk_application_inhibit(handle(), window.handle(), flags, Interop.allocateNativeString(reason).handle());
        return RESULT;
    }
    
    /**
     * Remove a window from `application`.
     * 
     * If `window` belongs to `application` then this call is equivalent to
     * setting the [property@Gtk.Window:application] property of `window` to
     * `NULL`.
     * 
     * The application may stop running as a result of a call to this
     * function, if `window` was the last window of the `application`.
     */
    public void removeWindow(Window window) {
        gtk_h.gtk_application_remove_window(handle(), window.handle());
    }
    
    /**
     * Sets zero or more keyboard accelerators that will trigger the
     * given action.
     * 
     * The first item in `accels` will be the primary accelerator, which may be
     * displayed in the UI.
     * 
     * To remove all accelerators for an action, use an empty, zero-terminated
     * array for `accels`.
     * 
     * For the `detailed_action_name`, see `g_action_parse_detailed_name()` and
     * `g_action_print_detailed_name()`.
     */
    public void setAccelsForAction(java.lang.String detailedActionName, java.lang.String[] accels) {
        gtk_h.gtk_application_set_accels_for_action(handle(), Interop.allocateNativeString(detailedActionName).handle(), Interop.allocateNativeArray(accels).handle());
    }
    
    /**
     * Sets or unsets the menubar for windows of `application`.
     * 
     * This is a menubar in the traditional sense.
     * 
     * This can only be done in the primary instance of the application,
     * after it has been registered. `GApplication::startup` is a good place
     * to call this.
     * 
     * Depending on the desktop environment, this may appear at the top of
     * each window, or at the top of the screen.  In some environments, if
     * both the application menu and the menubar are set, the application
     * menu will be presented as if it were the first item of the menubar.
     * Other environments treat the two as completely separate — for example,
     * the application menu may be rendered by the desktop shell while the
     * menubar (if set) remains in each individual window.
     * 
     * Use the base `GActionMap` interface to add actions, to respond to the
     * user selecting these menu items.
     */
    public void setMenubar(org.gtk.gio.MenuModel menubar) {
        gtk_h.gtk_application_set_menubar(handle(), menubar.handle());
    }
    
    /**
     * Removes an inhibitor that has been previously established.
     * 
     * See [method@Gtk.Application.inhibit].
     * 
     * Inhibitors are also cleared when the application exits.
     */
    public void uninhibit(int cookie) {
        gtk_h.gtk_application_uninhibit(handle(), cookie);
    }
    
    @FunctionalInterface
    public interface QueryEndHandler {
        void signalReceived(Application source);
    }
    
    /**
     * Emitted when the session manager is about to end the session.
     * 
     * This signal is only emitted if [property@Gtk.Application:register-session]
     * is `TRUE`. Applications can connect to this signal and call
     * [method@Gtk.Application.inhibit] with `GTK_APPLICATION_INHIBIT_LOGOUT`
     * to delay the end of the session until state has been saved.
     */
    public SignalHandle onQueryEnd(QueryEndHandler handler) {
        try {
            int hash = Interop.registerCallback(handler.hashCode(), handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalApplicationQueryEnd", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            long handlerId = gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("query-end").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), handlerId);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    @FunctionalInterface
    public interface WindowAddedHandler {
        void signalReceived(Application source, Window window);
    }
    
    /**
     * Emitted when a [class@Gtk.Window] is added to `application` through
     * [method@Gtk.Application.add_window].
     */
    public SignalHandle onWindowAdded(WindowAddedHandler handler) {
        try {
            int hash = Interop.registerCallback(handler.hashCode(), handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalApplicationWindowAdded", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            long handlerId = gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("window-added").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), handlerId);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    @FunctionalInterface
    public interface WindowRemovedHandler {
        void signalReceived(Application source, Window window);
    }
    
    /**
     * Emitted when a [class@Gtk.Window] is removed from `application`.
     * 
     * This can happen as a side-effect of the window being destroyed
     * or explicitly through [method@Gtk.Application.remove_window].
     */
    public SignalHandle onWindowRemoved(WindowRemovedHandler handler) {
        try {
            int hash = Interop.registerCallback(handler.hashCode(), handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalApplicationWindowRemoved", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            long handlerId = gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("window-removed").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), handlerId);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
}
