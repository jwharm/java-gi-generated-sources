package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@code GtkApplicationWindow} is a {@code GtkWindow} subclass that integrates with
 * {@code GtkApplication}.
 * <p>
 * Notably, {@code GtkApplicationWindow} can handle an application menubar.
 * <p>
 * This class implements the {@code GActionGroup} and {@code GActionMap} interfaces,
 * to let you add window-specific actions that will be exported by the
 * associated {@link Application}, together with its application-wide
 * actions. Window-specific actions are prefixed with the “win.”
 * prefix and application-wide actions are prefixed with the “app.”
 * prefix. Actions must be addressed with the prefixed name when
 * referring to them from a {@code GMenuModel}.
 * <p>
 * Note that widgets that are placed inside a {@code GtkApplicationWindow}
 * can also activate these actions, if they implement the
 * {@code Gtk.Actionable} interface.
 * <p>
 * The settings {@code Gtk.Settings:gtk-shell-shows-app-menu} and
 * {@code Gtk.Settings:gtk-shell-shows-menubar} tell GTK whether the
 * desktop environment is showing the application menu and menubar
 * models outside the application as part of the desktop shell.
 * For instance, on OS X, both menus will be displayed remotely;
 * on Windows neither will be.
 * <p>
 * If the desktop environment does not display the menubar, then
 * {@code GtkApplicationWindow} will automatically show a menubar for it.
 * This behaviour can be overridden with the
 * {@code Gtk.ApplicationWindow:show-menubar} property. If the
 * desktop environment does not display the application menu, then
 * it will automatically be included in the menubar or in the windows
 * client-side decorations.
 * <p>
 * See {@link PopoverMenu} for information about the XML language
 * used by {@code GtkBuilder} for menu models.
 * <p>
 * See also: {@link Application#setMenubar}.
 * <p>
 * <strong>A GtkApplicationWindow with a menubar</strong><br/>
 * The code sample below shows how to set up a {@code GtkApplicationWindow}
 * with a menu bar defined on the {@link Application}:
 * <pre>{@code c
 * GtkApplication *app = gtk_application_new ("org.gtk.test", 0);
 * 
 * GtkBuilder *builder = gtk_builder_new_from_string (
 *     "<interface>"
 *     "  <menu id='menubar'>"
 *     "    <submenu>"
 *     "      <attribute name='label' translatable='yes'>_Edit</attribute>"
 *     "      <item>"
 *     "        <attribute name='label' translatable='yes'>_Copy</attribute>"
 *     "        <attribute name='action'>win.copy</attribute>"
 *     "      </item>"
 *     "      <item>"
 *     "        <attribute name='label' translatable='yes'>_Paste</attribute>"
 *     "        <attribute name='action'>win.paste</attribute>"
 *     "      </item>"
 *     "    </submenu>"
 *     "  </menu>"
 *     "</interface>",
 *     -1);
 * 
 * GMenuModel *menubar = G_MENU_MODEL (gtk_builder_get_object (builder, "menubar"));
 * gtk_application_set_menubar (GTK_APPLICATION (app), menubar);
 * g_object_unref (builder);
 * 
 * // ...
 * 
 * GtkWidget *window = gtk_application_window_new (app);
 * }</pre>
 */
public class ApplicationWindow extends org.gtk.gtk.Window implements org.gtk.gio.ActionGroup, org.gtk.gio.ActionMap, org.gtk.gtk.Accessible, org.gtk.gtk.Buildable, org.gtk.gtk.ConstraintTarget, org.gtk.gtk.Native, org.gtk.gtk.Root, org.gtk.gtk.ShortcutManager {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkApplicationWindow";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gtk.gtk.Window.getMemoryLayout().withName("parent_instance")
        ).withName(C_TYPE_NAME);
    }
    
    /**
     * Create a ApplicationWindow proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected ApplicationWindow(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, ApplicationWindow> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new ApplicationWindow(input);
    
    private static MemoryAddress constructNew(org.gtk.gtk.Application application) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_application_window_new.invokeExact(application.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new {@code GtkApplicationWindow}.
     * @param application a {@code GtkApplication}
     */
    public ApplicationWindow(org.gtk.gtk.Application application) {
        super(constructNew(application));
        this.refSink();
        this.takeOwnership();
    }
    
    /**
     * Gets the {@code GtkShortcutsWindow} that is associated with {@code window}.
     * <p>
     * See {@link ApplicationWindow#setHelpOverlay}.
     * @return the help overlay associated
     *   with {@code window}
     */
    public @Nullable org.gtk.gtk.ShortcutsWindow getHelpOverlay() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_application_window_get_help_overlay.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gtk.gtk.ShortcutsWindow) Interop.register(RESULT, org.gtk.gtk.ShortcutsWindow.fromAddress).marshal(RESULT, null);
    }
    
    /**
     * Returns the unique ID of the window.
     * <p>
     *  If the window has not yet been added to a {@code GtkApplication}, returns {@code 0}.
     * @return the unique ID for {@code window}, or {@code 0} if the window
     *   has not yet been added to a {@code GtkApplication}
     */
    public int getId() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_application_window_get_id.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Returns whether the window will display a menubar for the app menu
     * and menubar as needed.
     * @return {@code true} if {@code window} will display a menubar when needed
     */
    public boolean getShowMenubar() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_application_window_get_show_menubar.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Associates a shortcuts window with the application window.
     * <p>
     * Additionally, sets up an action with the name
     * {@code win.show-help-overlay} to present it.
     * <p>
     * {@code window} takes responsibility for destroying {@code help_overlay}.
     * @param helpOverlay a {@code GtkShortcutsWindow}
     */
    public void setHelpOverlay(@Nullable org.gtk.gtk.ShortcutsWindow helpOverlay) {
        try {
            DowncallHandles.gtk_application_window_set_help_overlay.invokeExact(
                    handle(),
                    (Addressable) (helpOverlay == null ? MemoryAddress.NULL : helpOverlay.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets whether the window will display a menubar for the app menu
     * and menubar as needed.
     * @param showMenubar whether to show a menubar when needed
     */
    public void setShowMenubar(boolean showMenubar) {
        try {
            DowncallHandles.gtk_application_window_set_show_menubar.invokeExact(
                    handle(),
                    Marshal.booleanToInteger.marshal(showMenubar, null).intValue());
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
            RESULT = (long) DowncallHandles.gtk_application_window_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * A {@link ApplicationWindow.Builder} object constructs a {@link ApplicationWindow} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link ApplicationWindow.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a GObject with properties.
     */
    public static class Builder extends org.gtk.gtk.Window.Builder {
        
        /**
         * Default constructor for a {@code Builder} object.
         */
        protected Builder() {
        }
        
        /**
         * Finish building the {@link ApplicationWindow} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link ApplicationWindow}.
         * @return A new instance of {@code ApplicationWindow} with the properties 
         *         that were set in the Builder object.
         */
        public ApplicationWindow build() {
            return (ApplicationWindow) org.gtk.gobject.GObject.newWithProperties(
                ApplicationWindow.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
        
        /**
         * If this property is {@code true}, the window will display a menubar
         * unless it is shown by the desktop shell.
         * <p>
         * See {@link Application#setMenubar}.
         * <p>
         * If {@code false}, the window will not display a menubar, regardless
         * of whether the desktop shell is showing it or not.
         * @param showMenubar The value for the {@code show-menubar} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setShowMenubar(boolean showMenubar) {
            names.add("show-menubar");
            values.add(org.gtk.gobject.Value.create(showMenubar));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_application_window_new = Interop.downcallHandle(
                "gtk_application_window_new",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_application_window_get_help_overlay = Interop.downcallHandle(
                "gtk_application_window_get_help_overlay",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_application_window_get_id = Interop.downcallHandle(
                "gtk_application_window_get_id",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_application_window_get_show_menubar = Interop.downcallHandle(
                "gtk_application_window_get_show_menubar",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_application_window_set_help_overlay = Interop.downcallHandle(
                "gtk_application_window_set_help_overlay",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_application_window_set_show_menubar = Interop.downcallHandle(
                "gtk_application_window_set_show_menubar",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gtk_application_window_get_type = Interop.downcallHandle(
                "gtk_application_window_get_type",
                FunctionDescriptor.of(Interop.valueLayout.C_LONG),
                false
        );
    }
    
    /**
     * Check whether the type is available on the runtime platform.
     * @return {@code true} when the type is available on the runtime platform
     */
    public static boolean isAvailable() {
        return DowncallHandles.gtk_application_window_get_type != null;
    }
}
