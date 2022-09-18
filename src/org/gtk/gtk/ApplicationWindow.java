package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * <code>GtkApplicationWindow</code> is a <code>GtkWindow</code> subclass that integrates with<code>GtkApplication</code>.
 * <p>
 * Notably, <code>GtkApplicationWindow</code> can handle an application menubar.
 * <p>
 * This class implements the <code>GActionGroup</code> and <code>GActionMap</code> interfaces,
 * to let you add window-specific actions that will be exported by the
 * associated {@link org.gtk.gtk.Application}, together with its application-wide
 * actions. Window-specific actions are prefixed with the &<code>#8220</code> win.&<code>#8221</code> 
 * prefix and application-wide actions are prefixed with the &<code>#8220</code> app.&<code>#8221</code> 
 * prefix. Actions must be addressed with the prefixed name when
 * referring to them from a <code>GMenuModel</code>.
 * <p>
 * Note that widgets that are placed inside a <code>GtkApplicationWindow</code>
 * can also activate these actions, if they implement the
 * {@link [iface@Gtk.Actionable] (ref=iface)} interface.
 * <p>
 * The settings {@link [property@Gtk.Settings:gtk-shell-shows-app-menu] (ref=property)} and
 * {@link [property@Gtk.Settings:gtk-shell-shows-menubar] (ref=property)} tell GTK whether the
 * desktop environment is showing the application menu and menubar
 * models outside the application as part of the desktop shell.
 * For instance, on OS X, both menus will be displayed remotely;
 * on Windows neither will be.
 * <p>
 * If the desktop environment does not display the menubar, then<code>GtkApplicationWindow</code> will automatically show a menubar for it.
 * This behaviour can be overridden with the
 * {@link [property@Gtk.ApplicationWindow:show-menubar] (ref=property)} property. If the
 * desktop environment does not display the application menu, then
 * it will automatically be included in the menubar or in the windows
 * client-side decorations.
 * <p>
 * See {@link org.gtk.gtk.PopoverMenu} for information about the XML language
 * used by <code>GtkBuilder</code> for menu models.
 * <p>
 * See also: {@link org.gtk.gtk.Application<code>#setMenubar</code> .
 * <p>
 * <h2>A GtkApplicationWindow with a menubar</h2>
 * <p>
 * The code sample below shows how to set up a <code>GtkApplicationWindow</code>
 * with a menu bar defined on the {@link org.gtk.gtk.Application}:
 * <p><pre>c
 * GtkApplication *app = gtk_application_new (&<code>#34</code> org.gtk.test&<code>#34</code> , 0);
 * 
 * GtkBuilder *builder = gtk_builder_new_from_string (
 *     &<code>#34</code> &<code>#60</code> interface&<code>#62</code> &<code>#34</code> 
 *     &<code>#34</code>   &<code>#60</code> menu id=&<code>#39</code> menubar&<code>#39</code> &<code>#62</code> &<code>#34</code> 
 *     &<code>#34</code>     &<code>#60</code> submenu&<code>#62</code> &<code>#34</code> 
 *     &<code>#34</code>       &<code>#60</code> attribute name=&<code>#39</code> label&<code>#39</code>  translatable=&<code>#39</code> yes&<code>#39</code> &<code>#62</code> _Edit&<code>#60</code> /attribute&<code>#62</code> &<code>#34</code> 
 *     &<code>#34</code>       &<code>#60</code> item&<code>#62</code> &<code>#34</code> 
 *     &<code>#34</code>         &<code>#60</code> attribute name=&<code>#39</code> label&<code>#39</code>  translatable=&<code>#39</code> yes&<code>#39</code> &<code>#62</code> _Copy&<code>#60</code> /attribute&<code>#62</code> &<code>#34</code> 
 *     &<code>#34</code>         &<code>#60</code> attribute name=&<code>#39</code> action&<code>#39</code> &<code>#62</code> win.copy&<code>#60</code> /attribute&<code>#62</code> &<code>#34</code> 
 *     &<code>#34</code>       &<code>#60</code> /item&<code>#62</code> &<code>#34</code> 
 *     &<code>#34</code>       &<code>#60</code> item&<code>#62</code> &<code>#34</code> 
 *     &<code>#34</code>         &<code>#60</code> attribute name=&<code>#39</code> label&<code>#39</code>  translatable=&<code>#39</code> yes&<code>#39</code> &<code>#62</code> _Paste&<code>#60</code> /attribute&<code>#62</code> &<code>#34</code> 
 *     &<code>#34</code>         &<code>#60</code> attribute name=&<code>#39</code> action&<code>#39</code> &<code>#62</code> win.paste&<code>#60</code> /attribute&<code>#62</code> &<code>#34</code> 
 *     &<code>#34</code>       &<code>#60</code> /item&<code>#62</code> &<code>#34</code> 
 *     &<code>#34</code>     &<code>#60</code> /submenu&<code>#62</code> &<code>#34</code> 
 *     &<code>#34</code>   &<code>#60</code> /menu&<code>#62</code> &<code>#34</code> 
 *     &<code>#34</code> &<code>#60</code> /interface&<code>#62</code> &<code>#34</code> ,
 *     -1);
 * 
 * GMenuModel *menubar = G_MENU_MODEL (gtk_builder_get_object (builder, &<code>#34</code> menubar&<code>#34</code> ));
 * gtk_application_set_menubar (GTK_APPLICATION (app), menubar);
 * g_object_unref (builder);
 * 
 * // ...
 * 
 * GtkWidget *window = gtk_application_window_new (app);
 * </pre>
 */
public class ApplicationWindow extends Window implements org.gtk.gio.ActionGroup, org.gtk.gio.ActionMap, Accessible, Buildable, ConstraintTarget, Native, Root, ShortcutManager {

    public ApplicationWindow(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to ApplicationWindow */
    public static ApplicationWindow castFrom(org.gtk.gobject.Object gobject) {
        return new ApplicationWindow(gobject.getReference());
    }
    
    private static Reference constructNew(Application application) {
        Reference RESULT = References.get(gtk_h.gtk_application_window_new(application.handle()), false);
        return RESULT;
    }
    
    /**
     * Creates a new <code>GtkApplicationWindow</code>.
     */
    public ApplicationWindow(Application application) {
        super(constructNew(application));
    }
    
    /**
     * Gets the <code>GtkShortcutsWindow</code> that is associated with @window.
     * 
     * See {@link org.gtk.gtk.ApplicationWindow<code>#setHelpOverlay</code> .
     */
    public ShortcutsWindow getHelpOverlay() {
        var RESULT = gtk_h.gtk_application_window_get_help_overlay(handle());
        return new ShortcutsWindow(References.get(RESULT, false));
    }
    
    /**
     * Returns the unique ID of the window.
     * <p>
     *  If the window has not yet been added to a <code>GtkApplication</code>, returns <code>0</code>.
     */
    public int getId() {
        var RESULT = gtk_h.gtk_application_window_get_id(handle());
        return RESULT;
    }
    
    /**
     * Returns whether the window will display a menubar for the app menu
     * and menubar as needed.
     */
    public boolean getShowMenubar() {
        var RESULT = gtk_h.gtk_application_window_get_show_menubar(handle());
        return (RESULT != 0);
    }
    
    /**
     * Associates a shortcuts window with the application window.
     * <p>
     * Additionally, sets up an action with the name<code>win.show-help-overlay</code> to present it.
     * 
     * @window takes responsibility for destroying @help_overlay.
     */
    public void setHelpOverlay(ShortcutsWindow helpOverlay) {
        gtk_h.gtk_application_window_set_help_overlay(handle(), helpOverlay.handle());
    }
    
    /**
     * Sets whether the window will display a menubar for the app menu
     * and menubar as needed.
     */
    public void setShowMenubar(boolean showMenubar) {
        gtk_h.gtk_application_window_set_show_menubar(handle(), showMenubar ? 1 : 0);
    }
    
}
