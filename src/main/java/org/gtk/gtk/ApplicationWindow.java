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
    
    private static GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.gtk.Window.getMemoryLayout().withName("parent_instance")
    ).withName(C_TYPE_NAME);
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    /**
     * Get the value of the field {@code parent_instance}
     * @return The value of the field {@code parent_instance}
     */
    public org.gtk.gtk.Window parent_instance$get() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("parent_instance"));
        return new org.gtk.gtk.Window(((MemoryAddress) handle()).addOffset(OFFSET), Ownership.UNKNOWN);
    }
    
    /**
     * Create a ApplicationWindow proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public ApplicationWindow(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Cast object to ApplicationWindow if its GType is a (or inherits from) "GtkApplicationWindow".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code ApplicationWindow} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GtkApplicationWindow", a ClassCastException will be thrown.
     */
    public static ApplicationWindow castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), org.gtk.gobject.GObject.typeFromName("GtkApplicationWindow"))) {
            return new ApplicationWindow(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GtkApplicationWindow");
        }
    }
    
    private static Addressable constructNew(@NotNull org.gtk.gtk.Application application) {
        java.util.Objects.requireNonNull(application, "Parameter 'application' must not be null");
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_application_window_new.invokeExact(
                    application.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new {@code GtkApplicationWindow}.
     * @param application a {@code GtkApplication}
     */
    public ApplicationWindow(@NotNull org.gtk.gtk.Application application) {
        super(constructNew(application), Ownership.NONE);
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
            RESULT = (MemoryAddress) DowncallHandles.gtk_application_window_get_help_overlay.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gtk.ShortcutsWindow(RESULT, Ownership.NONE);
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
            RESULT = (int) DowncallHandles.gtk_application_window_get_id.invokeExact(
                    handle());
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
            RESULT = (int) DowncallHandles.gtk_application_window_get_show_menubar.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
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
                    showMenubar ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_application_window_new = Interop.downcallHandle(
            "gtk_application_window_new",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_application_window_get_help_overlay = Interop.downcallHandle(
            "gtk_application_window_get_help_overlay",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_application_window_get_id = Interop.downcallHandle(
            "gtk_application_window_get_id",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_application_window_get_show_menubar = Interop.downcallHandle(
            "gtk_application_window_get_show_menubar",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_application_window_set_help_overlay = Interop.downcallHandle(
            "gtk_application_window_set_help_overlay",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_application_window_set_show_menubar = Interop.downcallHandle(
            "gtk_application_window_set_show_menubar",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT),
            false
        );
    }
}
