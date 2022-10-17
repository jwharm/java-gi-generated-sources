package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

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
 * 
 * <h2>Automatic resources</h2>
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
 * &lt;kbd&gt;Control&lt;/kbd&gt;+&lt;kbd&gt;?&lt;/kbd&gt; to open it. To create a menu item that
 * displays the shortcuts window, associate the item with the action
 * {@code win.show-help-overlay}.
 * 
 * <h2>A simple application</h2>
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
 * 
 * <h2>See Also</h2>
 * <a href="https://wiki.gnome.org/HowDoI/GtkApplication">HowDoI: Using GtkApplication</a>,
 * <a href="getting_started.html#basics">Getting Started with GTK: Basics</a>
 */
public class Application extends org.gtk.gio.Application implements org.gtk.gio.ActionGroup, org.gtk.gio.ActionMap {

    public Application(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to Application */
    public static Application castFrom(org.gtk.gobject.Object gobject) {
        return new Application(gobject.refcounted());
    }
    
    private static final MethodHandle gtk_application_new = Interop.downcallHandle(
        "gtk_application_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    private static Refcounted constructNew(@Nullable java.lang.String applicationId, @NotNull org.gtk.gio.ApplicationFlags flags) {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) gtk_application_new.invokeExact(Interop.allocateNativeString(applicationId), flags.getValue()), true);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
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
     * If {@code application_id} is not {@code null}, then it must be valid. See
     * {@code g_application_id_is_valid()}.
     * <p>
     * If no application ID is given then some features (most notably application
     * uniqueness) will be disabled.
     */
    public Application(@Nullable java.lang.String applicationId, @NotNull org.gtk.gio.ApplicationFlags flags) {
        super(constructNew(applicationId, flags));
    }
    
    private static final MethodHandle gtk_application_add_window = Interop.downcallHandle(
        "gtk_application_add_window",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
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
    public @NotNull void addWindow(@NotNull Window window) {
        try {
            gtk_application_add_window.invokeExact(handle(), window.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gtk_application_get_accels_for_action = Interop.downcallHandle(
        "gtk_application_get_accels_for_action",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the accelerators that are currently associated with
     * the given action.
     */
    public PointerString getAccelsForAction(@NotNull java.lang.String detailedActionName) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) gtk_application_get_accels_for_action.invokeExact(handle(), Interop.allocateNativeString(detailedActionName));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new PointerString(RESULT);
    }
    
    private static final MethodHandle gtk_application_get_actions_for_accel = Interop.downcallHandle(
        "gtk_application_get_actions_for_accel",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the list of actions (possibly empty) that {@code accel} maps to.
     * <p>
     * Each item in the list is a detailed action name in the usual form.
     * <p>
     * This might be useful to discover if an accel already exists in
     * order to prevent installation of a conflicting accelerator (from
     * an accelerator editor or a plugin system, for example). Note that
     * having more than one action per accelerator may not be a bad thing
     * and might make sense in cases where the actions never appear in the
     * same context.
     * <p>
     * In case there are no actions for a given accelerator, an empty array
     * is returned. {@code NULL} is never returned.
     * <p>
     * It is a programmer error to pass an invalid accelerator string.
     * <p>
     * If you are unsure, check it with {@link Gtk#acceleratorParse} first.
     */
    public PointerString getActionsForAccel(@NotNull java.lang.String accel) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) gtk_application_get_actions_for_accel.invokeExact(handle(), Interop.allocateNativeString(accel));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new PointerString(RESULT);
    }
    
    private static final MethodHandle gtk_application_get_active_window = Interop.downcallHandle(
        "gtk_application_get_active_window",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the “active” window for the application.
     * <p>
     * The active window is the one that was most recently focused (within
     * the application).  This window may not have the focus at the moment
     * if another application has it — this is just the most
     * recently-focused window within this application.
     */
    public @Nullable Window getActiveWindow() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) gtk_application_get_active_window.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new Window(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle gtk_application_get_menu_by_id = Interop.downcallHandle(
        "gtk_application_get_menu_by_id",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets a menu from automatically loaded resources.
     * <p>
     * See <a href="class.Application.html#automatic-resources">the section on Automatic resources</a>
     * for more information.
     */
    public @Nullable org.gtk.gio.Menu getMenuById(@NotNull java.lang.String id) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) gtk_application_get_menu_by_id.invokeExact(handle(), Interop.allocateNativeString(id));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gio.Menu(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle gtk_application_get_menubar = Interop.downcallHandle(
        "gtk_application_get_menubar",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the menu model that has been set with
     * {@link Application#setMenubar}.
     */
    public @Nullable org.gtk.gio.MenuModel getMenubar() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) gtk_application_get_menubar.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gio.MenuModel(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle gtk_application_get_window_by_id = Interop.downcallHandle(
        "gtk_application_get_window_by_id",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Returns the {@link ApplicationWindow} with the given ID.
     * <p>
     * The ID of a {@code GtkApplicationWindow} can be retrieved with
     * {@link ApplicationWindow#getId}.
     */
    public @Nullable Window getWindowById(@NotNull int id) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) gtk_application_get_window_by_id.invokeExact(handle(), id);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new Window(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle gtk_application_get_windows = Interop.downcallHandle(
        "gtk_application_get_windows",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
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
    public @NotNull org.gtk.glib.List getWindows() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) gtk_application_get_windows.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.List(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle gtk_application_inhibit = Interop.downcallHandle(
        "gtk_application_inhibit",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
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
    public int inhibit(@Nullable Window window, @NotNull ApplicationInhibitFlags flags, @Nullable java.lang.String reason) {
        int RESULT;
        try {
            RESULT = (int) gtk_application_inhibit.invokeExact(handle(), window.handle(), flags.getValue(), Interop.allocateNativeString(reason));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static final MethodHandle gtk_application_list_action_descriptions = Interop.downcallHandle(
        "gtk_application_list_action_descriptions",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Lists the detailed action names which have associated accelerators.
     * <p>
     * See {@link Application#setAccelsForAction}.
     */
    public PointerString listActionDescriptions() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) gtk_application_list_action_descriptions.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new PointerString(RESULT);
    }
    
    private static final MethodHandle gtk_application_remove_window = Interop.downcallHandle(
        "gtk_application_remove_window",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
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
    public @NotNull void removeWindow(@NotNull Window window) {
        try {
            gtk_application_remove_window.invokeExact(handle(), window.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gtk_application_set_accels_for_action = Interop.downcallHandle(
        "gtk_application_set_accels_for_action",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
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
    public @NotNull void setAccelsForAction(@NotNull java.lang.String detailedActionName, @NotNull java.lang.String[] accels) {
        try {
            gtk_application_set_accels_for_action.invokeExact(handle(), Interop.allocateNativeString(detailedActionName), Interop.allocateNativeArray(accels));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gtk_application_set_menubar = Interop.downcallHandle(
        "gtk_application_set_menubar",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
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
    public @NotNull void setMenubar(@Nullable org.gtk.gio.MenuModel menubar) {
        try {
            gtk_application_set_menubar.invokeExact(handle(), menubar.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gtk_application_uninhibit = Interop.downcallHandle(
        "gtk_application_uninhibit",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Removes an inhibitor that has been previously established.
     * <p>
     * See {@link Application#inhibit}.
     * <p>
     * Inhibitors are also cleared when the application exits.
     */
    public @NotNull void uninhibit(@NotNull int cookie) {
        try {
            gtk_application_uninhibit.invokeExact(handle(), cookie);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
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
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("query-end"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(Application.Callbacks.class, "signalApplicationQueryEnd",
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
    public interface WindowAddedHandler {
        void signalReceived(Application source, @NotNull Window window);
    }
    
    /**
     * Emitted when a {@link Window} is added to {@code application} through
     * {@link Application#addWindow}.
     */
    public SignalHandle onWindowAdded(WindowAddedHandler handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("window-added"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(Application.Callbacks.class, "signalApplicationWindowAdded",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler)),
                (Addressable) MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface WindowRemovedHandler {
        void signalReceived(Application source, @NotNull Window window);
    }
    
    /**
     * Emitted when a {@link Window} is removed from {@code application}.
     * <p>
     * This can happen as a side-effect of the window being destroyed
     * or explicitly through {@link Application#removeWindow}.
     */
    public SignalHandle onWindowRemoved(WindowRemovedHandler handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("window-removed"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(Application.Callbacks.class, "signalApplicationWindowRemoved",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler)),
                (Addressable) MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    public static class Callbacks {
    
        public static void signalApplicationQueryEnd(MemoryAddress source, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (Application.QueryEndHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new Application(Refcounted.get(source)));
        }
        
        public static void signalApplicationWindowAdded(MemoryAddress source, MemoryAddress window, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (Application.WindowAddedHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new Application(Refcounted.get(source)), new Window(Refcounted.get(window, false)));
        }
        
        public static void signalApplicationWindowRemoved(MemoryAddress source, MemoryAddress window, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (Application.WindowRemovedHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new Application(Refcounted.get(source)), new Window(Refcounted.get(window, false)));
        }
        
    }
}
