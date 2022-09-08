package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * `GtkLockButton` is a widget to obtain and revoke authorizations
 * needed to operate the controls.
 * 
 * ![An example GtkLockButton](lock-button.png)
 * 
 * It is typically used in preference dialogs or control panels.
 * 
 * The required authorization is represented by a `GPermission` object.
 * Concrete implementations of `GPermission` may use PolicyKit or some
 * other authorization framework. To obtain a PolicyKit-based
 * `GPermission`, use `polkit_permission_new()`.
 * 
 * If the user is not currently allowed to perform the action, but can
 * obtain the permission, the widget looks like this:
 * 
 * ![](lockbutton-locked.png)
 * 
 * and the user can click the button to request the permission. Depending
 * on the platform, this may pop up an authentication dialog or ask the user
 * to authenticate in some other way. Once the user has obtained the permission,
 * the widget changes to this:
 * 
 * ![](lockbutton-unlocked.png)
 * 
 * and the permission can be dropped again by clicking the button. If the user
 * is not able to obtain the permission at all, the widget looks like this:
 * 
 * ![](lockbutton-sorry.png)
 * 
 * If the user has the permission and cannot drop it, the button is hidden.
 * 
 * The text (and tooltips) that are shown in the various cases can be adjusted
 * with the [property@Gtk.LockButton:text-lock],
 * [property@Gtk.LockButton:text-unlock],
 * [property@Gtk.LockButton:tooltip-lock],
 * [property@Gtk.LockButton:tooltip-unlock] and
 * [property@Gtk.LockButton:tooltip-not-authorized] properties.
 */
public class LockButton extends Button implements Accessible, Actionable, Buildable, ConstraintTarget {

    public LockButton(io.github.jwharm.javagi.interop.Reference reference) {
        super(reference);
    }
    
    /** Cast object to LockButton */
    public static LockButton castFrom(org.gtk.gobject.Object gobject) {
        return new LockButton(gobject.getReference());
    }
    
    /**
     * Creates a new lock button which reflects the @permission.
     */
    public LockButton(org.gtk.gio.Permission permission) {
        super(References.get(gtk_h.gtk_lock_button_new(permission.handle()), false));
    }
    
    /**
     * Obtains the `GPermission` object that controls @button.
     */
    public org.gtk.gio.Permission getPermission() {
        var RESULT = gtk_h.gtk_lock_button_get_permission(handle());
        return new org.gtk.gio.Permission(References.get(RESULT, false));
    }
    
    /**
     * Sets the `GPermission` object that controls @button.
     */
    public void setPermission(org.gtk.gio.Permission permission) {
        gtk_h.gtk_lock_button_set_permission(handle(), permission.handle());
    }
    
}
