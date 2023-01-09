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
 * <p>
 * <strong>Automatic resources</strong><br/>
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
 * <p>
 * <strong>A simple application</strong><br/>
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
 * <strong>See Also</strong><br/>
 * <a href="https://wiki.gnome.org/HowDoI/GtkApplication">HowDoI: Using GtkApplication</a>,
 * <a href="getting_started.html#basics">Getting Started with GTK: Basics</a>
 */
public class Application extends org.gtk.gio.Application implements org.gtk.gio.ActionGroup, org.gtk.gio.ActionMap {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkApplication";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gtk.gio.Application.getMemoryLayout().withName("parent_instance")
        ).withName(C_TYPE_NAME);
    }
    
    /**
     * Create a Application proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected Application(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, Application> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new Application(input);
    
    private static MemoryAddress constructNew(@Nullable java.lang.String applicationId, org.gtk.gio.ApplicationFlags flags) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.gtk_application_new.invokeExact(
                        (Addressable) (applicationId == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(applicationId, SCOPE)),
                        flags.getValue());
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return RESULT;
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
     * @param applicationId The application ID
     * @param flags the application flags
     */
    public Application(@Nullable java.lang.String applicationId, org.gtk.gio.ApplicationFlags flags) {
        super(constructNew(applicationId, flags));
        this.takeOwnership();
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
     * @param window a {@code GtkWindow}
     */
    public void addWindow(org.gtk.gtk.Window window) {
        try {
            DowncallHandles.gtk_application_add_window.invokeExact(
                    handle(),
                    window.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Gets the accelerators that are currently associated with
     * the given action.
     * @param detailedActionName a detailed action name, specifying an action
     *   and target to obtain accelerators for
     * @return accelerators for {@code detailed_action_name}
     */
    public PointerString getAccelsForAction(java.lang.String detailedActionName) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.gtk_application_get_accels_for_action.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(detailedActionName, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return new PointerString(RESULT);
        }
    }
    
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
     * @param accel an accelerator that can be parsed by {@link Gtk#acceleratorParse}
     * @return a {@code null}-terminated array of actions for {@code accel}
     */
    public PointerString getActionsForAccel(java.lang.String accel) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.gtk_application_get_actions_for_accel.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(accel, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return new PointerString(RESULT);
        }
    }
    
    /**
     * Gets the “active” window for the application.
     * <p>
     * The active window is the one that was most recently focused (within
     * the application).  This window may not have the focus at the moment
     * if another application has it — this is just the most
     * recently-focused window within this application.
     * @return the active window
     */
    public @Nullable org.gtk.gtk.Window getActiveWindow() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_application_get_active_window.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gtk.gtk.Window) Interop.register(RESULT, org.gtk.gtk.Window.fromAddress).marshal(RESULT, null);
    }
    
    /**
     * Gets a menu from automatically loaded resources.
     * <p>
     * See <a href="class.Application.html#automatic-resources">the section on Automatic resources</a>
     * for more information.
     * @param id the id of the menu to look up
     * @return Gets the menu with the
     *   given id from the automatically loaded resources
     */
    public @Nullable org.gtk.gio.Menu getMenuById(java.lang.String id) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.gtk_application_get_menu_by_id.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(id, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return (org.gtk.gio.Menu) Interop.register(RESULT, org.gtk.gio.Menu.fromAddress).marshal(RESULT, null);
        }
    }
    
    /**
     * Returns the menu model that has been set with
     * {@link Application#setMenubar}.
     * @return the menubar for windows of {@code application}
     */
    public @Nullable org.gtk.gio.MenuModel getMenubar() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_application_get_menubar.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gtk.gio.MenuModel) Interop.register(RESULT, org.gtk.gio.MenuModel.fromAddress).marshal(RESULT, null);
    }
    
    /**
     * Returns the {@link ApplicationWindow} with the given ID.
     * <p>
     * The ID of a {@code GtkApplicationWindow} can be retrieved with
     * {@link ApplicationWindow#getId}.
     * @param id an identifier number
     * @return the window for the given {@code id}
     */
    public @Nullable org.gtk.gtk.Window getWindowById(int id) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_application_get_window_by_id.invokeExact(
                    handle(),
                    id);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gtk.gtk.Window) Interop.register(RESULT, org.gtk.gtk.Window.fromAddress).marshal(RESULT, null);
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
     * @return a {@code GList} of {@code GtkWindow}
     *   instances
     */
    public org.gtk.glib.List getWindows() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_application_get_windows.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.glib.List.fromAddress.marshal(RESULT, null);
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
     * @param window a {@code GtkWindow}
     * @param flags what types of actions should be inhibited
     * @param reason a short, human-readable string that explains
     *   why these operations are inhibited
     * @return A non-zero cookie that is used to uniquely identify this
     *   request. It should be used as an argument to {@link Application#uninhibit}
     *   in order to remove the request. If the platform does not support
     *   inhibiting or the request failed for some reason, 0 is returned.
     */
    public int inhibit(@Nullable org.gtk.gtk.Window window, org.gtk.gtk.ApplicationInhibitFlags flags, @Nullable java.lang.String reason) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            int RESULT;
            try {
                RESULT = (int) DowncallHandles.gtk_application_inhibit.invokeExact(
                        handle(),
                        (Addressable) (window == null ? MemoryAddress.NULL : window.handle()),
                        flags.getValue(),
                        (Addressable) (reason == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(reason, SCOPE)));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return RESULT;
        }
    }
    
    /**
     * Lists the detailed action names which have associated accelerators.
     * <p>
     * See {@link Application#setAccelsForAction}.
     * @return the detailed action names
     */
    public PointerString listActionDescriptions() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.gtk_application_list_action_descriptions.invokeExact(handle());
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return new PointerString(RESULT);
        }
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
     * @param window a {@code GtkWindow}
     */
    public void removeWindow(org.gtk.gtk.Window window) {
        try {
            DowncallHandles.gtk_application_remove_window.invokeExact(
                    handle(),
                    window.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
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
     * @param detailedActionName a detailed action name, specifying an action
     *   and target to associate accelerators with
     * @param accels a list of accelerators in the format
     *   understood by {@link Gtk#acceleratorParse}
     */
    public void setAccelsForAction(java.lang.String detailedActionName, java.lang.String[] accels) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            try {
                DowncallHandles.gtk_application_set_accels_for_action.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(detailedActionName, SCOPE),
                        Interop.allocateNativeArray(accels, false, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
        }
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
     * @param menubar a {@code GMenuModel}
     */
    public void setMenubar(@Nullable org.gtk.gio.MenuModel menubar) {
        try {
            DowncallHandles.gtk_application_set_menubar.invokeExact(
                    handle(),
                    (Addressable) (menubar == null ? MemoryAddress.NULL : menubar.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Removes an inhibitor that has been previously established.
     * <p>
     * See {@link Application#inhibit}.
     * <p>
     * Inhibitors are also cleared when the application exits.
     * @param cookie a cookie that was returned by {@link Application#inhibit}
     */
    public void uninhibit(int cookie) {
        try {
            DowncallHandles.gtk_application_uninhibit.invokeExact(
                    handle(),
                    cookie);
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
            RESULT = (long) DowncallHandles.gtk_application_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * Functional interface declaration of the {@code QueryEnd} callback.
     */
    @FunctionalInterface
    public interface QueryEnd {
    
        /**
         * Emitted when the session manager is about to end the session.
         * <p>
         * This signal is only emitted if {@code Gtk.Application:register-session}
         * is {@code TRUE}. Applications can connect to this signal and call
         * {@link Application#inhibit} with {@code GTK_APPLICATION_INHIBIT_LOGOUT}
         * to delay the end of the session until state has been saved.
         */
        void run();
        
        @ApiStatus.Internal default void upcall(MemoryAddress sourceApplication) {
            run();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), QueryEnd.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Emitted when the session manager is about to end the session.
     * <p>
     * This signal is only emitted if {@code Gtk.Application:register-session}
     * is {@code TRUE}. Applications can connect to this signal and call
     * {@link Application#inhibit} with {@code GTK_APPLICATION_INHIBIT_LOGOUT}
     * to delay the end of the session until state has been saved.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<Application.QueryEnd> onQueryEnd(Application.QueryEnd handler) {
        MemorySession SCOPE = MemorySession.openImplicit();
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("query-end", SCOPE), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Functional interface declaration of the {@code WindowAdded} callback.
     */
    @FunctionalInterface
    public interface WindowAdded {
    
        /**
         * Emitted when a {@link Window} is added to {@code application} through
         * {@link Application#addWindow}.
         */
        void run(org.gtk.gtk.Window window);
        
        @ApiStatus.Internal default void upcall(MemoryAddress sourceApplication, MemoryAddress window) {
            run((org.gtk.gtk.Window) Interop.register(window, org.gtk.gtk.Window.fromAddress).marshal(window, null));
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), WindowAdded.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Emitted when a {@link Window} is added to {@code application} through
     * {@link Application#addWindow}.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<Application.WindowAdded> onWindowAdded(Application.WindowAdded handler) {
        MemorySession SCOPE = MemorySession.openImplicit();
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("window-added", SCOPE), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Functional interface declaration of the {@code WindowRemoved} callback.
     */
    @FunctionalInterface
    public interface WindowRemoved {
    
        /**
         * Emitted when a {@link Window} is removed from {@code application}.
         * <p>
         * This can happen as a side-effect of the window being destroyed
         * or explicitly through {@link Application#removeWindow}.
         */
        void run(org.gtk.gtk.Window window);
        
        @ApiStatus.Internal default void upcall(MemoryAddress sourceApplication, MemoryAddress window) {
            run((org.gtk.gtk.Window) Interop.register(window, org.gtk.gtk.Window.fromAddress).marshal(window, null));
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), WindowRemoved.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Emitted when a {@link Window} is removed from {@code application}.
     * <p>
     * This can happen as a side-effect of the window being destroyed
     * or explicitly through {@link Application#removeWindow}.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<Application.WindowRemoved> onWindowRemoved(Application.WindowRemoved handler) {
        MemorySession SCOPE = MemorySession.openImplicit();
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("window-removed", SCOPE), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * A {@link Application.Builder} object constructs a {@link Application} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link Application.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a GObject with properties.
     */
    public static class Builder extends org.gtk.gio.Application.Builder {
        
        /**
         * Default constructor for a {@code Builder} object.
         */
        protected Builder() {
        }
        
        /**
         * Finish building the {@link Application} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link Application}.
         * @return A new instance of {@code Application} with the properties 
         *         that were set in the Builder object.
         */
        public Application build() {
            return (Application) org.gtk.gobject.GObject.newWithProperties(
                Application.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
        
        /**
         * The currently focused window of the application.
         * @param activeWindow The value for the {@code active-window} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setActiveWindow(org.gtk.gtk.Window activeWindow) {
            names.add("active-window");
            values.add(org.gtk.gobject.Value.create(activeWindow));
            return this;
        }
        
        /**
         * The {@code GMenuModel} to be used for the application's menu bar.
         * @param menubar The value for the {@code menubar} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setMenubar(org.gtk.gio.MenuModel menubar) {
            names.add("menubar");
            values.add(org.gtk.gobject.Value.create(menubar));
            return this;
        }
        
        /**
         * Set this property to {@code TRUE} to register with the session manager.
         * <p>
         * This will make GTK track the session state (such as the
         * {@code Gtk.Application:screensaver-active} property).
         * @param registerSession The value for the {@code register-session} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setRegisterSession(boolean registerSession) {
            names.add("register-session");
            values.add(org.gtk.gobject.Value.create(registerSession));
            return this;
        }
        
        /**
         * This property is {@code TRUE} if GTK believes that the screensaver is
         * currently active.
         * <p>
         * GTK only tracks session state (including this) when
         * {@code Gtk.Application:register-session} is set to {@code true}.
         * <p>
         * Tracking the screensaver state is currently only supported on
         * Linux.
         * @param screensaverActive The value for the {@code screensaver-active} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setScreensaverActive(boolean screensaverActive) {
            names.add("screensaver-active");
            values.add(org.gtk.gobject.Value.create(screensaverActive));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_application_new = Interop.downcallHandle(
                "gtk_application_new",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gtk_application_add_window = Interop.downcallHandle(
                "gtk_application_add_window",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_application_get_accels_for_action = Interop.downcallHandle(
                "gtk_application_get_accels_for_action",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_application_get_actions_for_accel = Interop.downcallHandle(
                "gtk_application_get_actions_for_accel",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_application_get_active_window = Interop.downcallHandle(
                "gtk_application_get_active_window",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_application_get_menu_by_id = Interop.downcallHandle(
                "gtk_application_get_menu_by_id",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_application_get_menubar = Interop.downcallHandle(
                "gtk_application_get_menubar",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_application_get_window_by_id = Interop.downcallHandle(
                "gtk_application_get_window_by_id",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gtk_application_get_windows = Interop.downcallHandle(
                "gtk_application_get_windows",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_application_inhibit = Interop.downcallHandle(
                "gtk_application_inhibit",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_application_list_action_descriptions = Interop.downcallHandle(
                "gtk_application_list_action_descriptions",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_application_remove_window = Interop.downcallHandle(
                "gtk_application_remove_window",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_application_set_accels_for_action = Interop.downcallHandle(
                "gtk_application_set_accels_for_action",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_application_set_menubar = Interop.downcallHandle(
                "gtk_application_set_menubar",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_application_uninhibit = Interop.downcallHandle(
                "gtk_application_uninhibit",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gtk_application_get_type = Interop.downcallHandle(
                "gtk_application_get_type",
                FunctionDescriptor.of(Interop.valueLayout.C_LONG),
                false
        );
    }
    
    /**
     * Check whether the type is available on the runtime platform.
     * @return {@code true} when the type is available on the runtime platform
     */
    public static boolean isAvailable() {
        return DowncallHandles.gtk_application_get_type != null;
    }
}
