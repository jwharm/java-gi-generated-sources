package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * <code>GtkLockButton</code> is a widget to obtain and revoke authorizations
 * needed to operate the controls.
 * <p>
 * !{@link [An example GtkLockButton]}(lock-button.png)
 * <p>
 * It is typically used in preference dialogs or control panels.
 * <p>
 * The required authorization is represented by a <code>GPermission</code> object.
 * Concrete implementations of <code>GPermission</code> may use PolicyKit or some
 * other authorization framework. To obtain a PolicyKit-based<code>GPermission</code>, use <code>polkit_permission_new()</code>.
 * 
 * If the user is not currently allowed to perform the action, but can
 * obtain the permission, the widget looks like this:
 * 
 * !{@link []}(lockbutton-locked.png)
 * 
 * and the user can click the button to request the permission. Depending
 * on the platform, this may pop up an authentication dialog or ask the user
 * to authenticate in some other way. Once the user has obtained the permission,
 * the widget changes to this:
 * 
 * !{@link []}(lockbutton-unlocked.png)
 * 
 * and the permission can be dropped again by clicking the button. If the user
 * is not able to obtain the permission at all, the widget looks like this:
 * 
 * !{@link []}(lockbutton-sorry.png)
 * 
 * If the user has the permission and cannot drop it, the button is hidden.
 * 
 * The text (and tooltips) that are shown in the various cases can be adjusted
 * with the {@link [property@Gtk.LockButton:text-lock] (ref=property)},
 * {@link [property@Gtk.LockButton:text-unlock] (ref=property)},
 * {@link [property@Gtk.LockButton:tooltip-lock] (ref=property)},
 * {@link [property@Gtk.LockButton:tooltip-unlock] (ref=property)} and
 * {@link [property@Gtk.LockButton:tooltip-not-authorized] (ref=property)} properties.
 */
public class LockButton extends Button implements Accessible, Actionable, Buildable, ConstraintTarget {

    public LockButton(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to LockButton */
    public static LockButton castFrom(org.gtk.gobject.Object gobject) {
        return new LockButton(gobject.getReference());
    }
    
    private static Reference constructNew(org.gtk.gio.Permission permission) {
        Reference RESULT = References.get(gtk_h.gtk_lock_button_new(permission.handle()), false);
        return RESULT;
    }
    
    /**
     * Creates a new lock button which reflects the @permission.
     */
    public LockButton(org.gtk.gio.Permission permission) {
        super(constructNew(permission));
    }
    
    /**
     * Obtains the <code>GPermission</code> object that controls @button.
     */
    public org.gtk.gio.Permission getPermission() {
        var RESULT = gtk_h.gtk_lock_button_get_permission(handle());
        return new org.gtk.gio.Permission(References.get(RESULT, false));
    }
    
    /**
     * Sets the <code>GPermission</code> object that controls @button.
     */
    public void setPermission(org.gtk.gio.Permission permission) {
        gtk_h.gtk_lock_button_set_permission(handle(), permission.handle());
    }
    
}
