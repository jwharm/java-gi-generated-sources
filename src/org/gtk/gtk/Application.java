package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * {@code GtkApplication} is a high-level API for writing applications.
 * <p>
 * It supports many aspects of writing a GTK application in a convenient
 * fashion, without enforcing a one-size-fits-all model.
 * <p>
 * Currently, {@code GtkApplication} handles GTK initialization, application
 * uniqueness, session management, provides some basic scriptability and
 * desktop shell integration by exporting actions and menus and manages a
 * list of toplevel windows whose life-cycle is automatically tied to the
 * life-cycle of your application.
 * <p>
 * While {@code GtkApplication} works fine with plain {@link Window}s, it is
 * recommended to use it together with {@link ApplicationWindow}.
 * <p>
 * <h2>Automatic resources</h2>
 * <p>
 * {@code GtkApplication} will automatically load menus from the {@code GtkBuilder}
 * resource located at "gtk/menus.ui", relative to the application's
 * resource base path (see {@link org.gtk.gio.Application#setResourceBasePath}).
 * The menu with the ID "menubar" is taken as the application's
 * menubar. Additional menus (most interesting submenus) can be named
 * and accessed via {@link Application#getMenuById} which allows for
 * dynamic population of a part of the menu structure.
 * <p>
 * It is also possible to provide the menubar manually using
 * {@link Application#setMenubar}.
 * <p>
 * {@code GtkApplication} will also automatically setup an icon search path for
 * the default icon theme by appending "icons" to the resource base
 * path. This allows your application to easily store its icons as
 * resources. See {@link IconTheme#addResourcePath} for more
 * information.
 * <p>
 * If there is a resource located at {@code gtk/help-overlay.ui} which
 * defines a {@link ShortcutsWindow} with ID {@code help_overlay} then
 * {@code GtkApplication} associates an instance of this shortcuts window with
 * each {@link ApplicationWindow} and sets up the keyboard accelerator
 * &lt;kbd>Control</kbd>+<kbd>?</kbd&gt; to open it. To create a menu item that
 * displays the shortcuts window, associate the item with the action
 * {@code win.show-help-overlay}.
 * <p>
 * <h2>A simple application</h2>
 * <p>
 * <a href="https://gitlab.gnome.org/GNOME/gtk/tree/main/examples/bp/bloatpad.c">A simple example</a>
 * is available in the GTK source code repository
 * <p>
 * {@code GtkApplication} optionally registers with a session manager of the
 * users session (if you set the {@code Gtk.Application:register-session}
 * property) and offers various functionality related to the session
 * life-cycle.
 * <p>
 * An application can block various ways to end the session with
 * the {@link Application#inhibit} function. Typical use cases for
 * this kind of inhibiting are long-running, uninterruptible operations,
 * such as burning a CD or performing a disk backup. The session
 * manager may not honor the inhibitor, but it can be expected to
 * inform the user about the negative consequences of ending the
 * session while inhibitors are present.
 * <p>
 * <h2>See Also</h2>
 * <p>
 * <a href="https://wiki.gnome.org/HowDoI/GtkApplication">HowDoI: Using GtkApplication</a>,
 * <a href="getting_started.html#basics">Getting Started with GTK: Basics</a>
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
     * Creates a new {@code GtkApplication} instance.
     * <p>
     * When using {@code GtkApplication}, it is not necessary to call {@link Gtk#init}
     * manually. It is called as soon as the application gets registered as
     * the primary instance.
     * <p>
     * Concretely, {@link Gtk#init} is called in the default handler for the
     * {@code GApplication::startup} signal. Therefore, {@code GtkApplication} subclasses should
     * always chain up in their {@code GApplication::startup} handler before using any GTK
     * API.
     * <p>
     * Note that commandline arguments are not passed to {@link Gtk#init}.
     * <p>
     * If {@code application_id} is not <code>null</code>, then it must be valid. See
     * {@code g_application_id_is_valid()}.
     * <p>
     * If no application ID is given then some features (most notably application
     * uniqueness) will be disabled.
     */
    public Application(java.lang.String applicationId, int flags) {
        super(constructNew(applicationId, flags));
    }
    
    /**
     * Adds a window to {@code application}.
     * <p>
     * This call can only happen after the {@code application} has started;
     * typically, you should add new application windows in response
     * to the emission of the {@code GApplication::activate} signal.
     * <p>
     * This call is equivalent to setting the {@code Gtk.Window:application}
     * property of {@code window} to {@code application}.
     * <p>
     * Normally, the connection between the application and the window
     * will remain until the window is destroyed, but you can explicitly
     * remove it with {@link Application#removeWindow}.
     * <p>
     * GTK will keep the {@code application} running as long as it has
     * any windows.
     */
    public void addWindow(Window window) {
        gtk_h.gtk_application_add_window(handle(), window.handle());
    }
    
    /**
     * Gets the “active” window for the application.
     * <p>
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
     * <p>
     * See <a href="class.Application.html#automatic-resources">the section on Automatic resources</a>
     * for more information.
     */
    public org.gtk.gio.Menu getMenuById(java.lang.String id) {
        var RESULT = gtk_h.gtk_application_get_menu_by_id(handle(), Interop.allocateNativeString(id).handle());
        return new org.gtk.gio.Menu(References.get(RESULT, false));
    }
    
    /**
     * Returns the menu model that has been set with
     * {@link Application#setMenubar}.
     */
    public org.gtk.gio.MenuModel getMenubar() {
        var RESULT = gtk_h.gtk_application_get_menubar(handle());
        return new org.gtk.gio.MenuModel(References.get(RESULT, false));
    }
    
    /**
     * Returns the {@link ApplicationWindow} with the given ID.
     * <p>
     * The ID of a {@code GtkApplicationWindow} can be retrieved with
     * {@link ApplicationWindow#getId}.
     */
    public Window getWindowById(int id) {
        var RESULT = gtk_h.gtk_application_get_window_by_id(handle(), id);
        return new Window(References.get(RESULT, false));
    }
    
    /**
     * Gets a list of the {@link Window} instances associated with {@code application}.
     * <p>
     * The list is sorted by most recently focused window, such that the first
     * element is the currently focused window. (Useful for choosing a parent
     * for a transient window.)
     * <p>
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
     * <p>
     * This is not guaranteed to work on all platforms and for all types of
     * actions.
     * <p>
     * Applications should invoke this method when they begin an operation
     * that should not be interrupted, such as creating a CD or DVD. The
     * types of actions that may be blocked are specified by the {@code flags}
     * parameter. When the application completes the operation it should
     * call {@link Application#uninhibit} to remove the inhibitor. Note
     * that an application can have multiple inhibitors, and all of them must
     * be individually removed. Inhibitors are also cleared when the
     * application exits.
     * <p>
     * Applications should not expect that they will always be able to block
     * the action. In most cases, users will be given the option to force
     * the action to take place.
     * <p>
     * The {@code reason} message should be short and to the point.
     * <p>
     * If {@code window} is given, the session manager may point the user to
     * this window to find out more about why the action is inhibited.
     */
    public int inhibit(Window window, int flags, java.lang.String reason) {
        var RESULT = gtk_h.gtk_application_inhibit(handle(), window.handle(), flags, Interop.allocateNativeString(reason).handle());
        return RESULT;
    }
    
    /**
     * Remove a window from {@code application}.
     * <p>
     * If {@code window} belongs to {@code application} then this call is equivalent to
     * setting the {@code Gtk.Window:application} property of {@code window} to
     * {@code NULL}.
     * <p>
     * The application may stop running as a result of a call to this
     * function, if {@code window} was the last window of the {@code application}.
     */
    public void removeWindow(Window window) {
        gtk_h.gtk_application_remove_window(handle(), window.handle());
    }
    
    /**
     * Sets zero or more keyboard accelerators that will trigger the
     * given action.
     * <p>
     * The first item in {@code accels} will be the primary accelerator, which may be
     * displayed in the UI.
     * <p>
     * To remove all accelerators for an action, use an empty, zero-terminated
     * array for {@code accels}.
     * <p>
     * For the {@code detailed_action_name}, see {@code g_action_parse_detailed_name()} and
     * {@code g_action_print_detailed_name()}.
     */
    public void setAccelsForAction(java.lang.String detailedActionName, java.lang.String[] accels) {
        gtk_h.gtk_application_set_accels_for_action(handle(), Interop.allocateNativeString(detailedActionName).handle(), Interop.allocateNativeArray(accels).handle());
    }
    
    /**
     * Sets or unsets the menubar for windows of {@code application}.
     * <p>
     * This is a menubar in the traditional sense.
     * <p>
     * This can only be done in the primary instance of the application,
     * after it has been registered. {@code GApplication::startup} is a good place
     * to call this.
     * <p>
     * Depending on the desktop environment, this may appear at the top of
     * each window, or at the top of the screen.  In some environments, if
     * both the application menu and the menubar are set, the application
     * menu will be presented as if it were the first item of the menubar.
     * Other environments treat the two as completely separate — for example,
     * the application menu may be rendered by the desktop shell while the
     * menubar (if set) remains in each individual window.
     * <p>
     * Use the base {@code GActionMap} interface to add actions, to respond to the
     * user selecting these menu items.
     */
    public void setMenubar(org.gtk.gio.MenuModel menubar) {
        gtk_h.gtk_application_set_menubar(handle(), menubar.handle());
    }
    
    /**
     * Removes an inhibitor that has been previously established.
     * <p>
     * See {@link Application#inhibit}.
     * <p>
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
     * <p>
     * This signal is only emitted if {@code Gtk.Application:register-session}
     * is {@code TRUE}. Applications can connect to this signal and call
     * {@link Application#inhibit} with {@code GTK_APPLICATION_INHIBIT_LOGOUT}
     * to delay the end of the session until state has been saved.
     */
    public SignalHandle onQueryEnd(QueryEndHandler handler) {
        try {
            int hash = Interop.registerCallback(handler.hashCode(), handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalApplicationQueryEnd", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            MemorySegment nativeSymbol = Linker.nativeLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
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
     * Emitted when a {@link Window} is added to {@code application} through
     * {@link Application#addWindow}.
     */
    public SignalHandle onWindowAdded(WindowAddedHandler handler) {
        try {
            int hash = Interop.registerCallback(handler.hashCode(), handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalApplicationWindowAdded", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            MemorySegment nativeSymbol = Linker.nativeLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
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
     * Emitted when a {@link Window} is removed from {@code application}.
     * <p>
     * This can happen as a side-effect of the window being destroyed
     * or explicitly through {@link Application#removeWindow}.
     */
    public SignalHandle onWindowRemoved(WindowRemovedHandler handler) {
        try {
            int hash = Interop.registerCallback(handler.hashCode(), handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalApplicationWindowRemoved", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            MemorySegment nativeSymbol = Linker.nativeLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            long handlerId = gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("window-removed").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), handlerId);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
}
