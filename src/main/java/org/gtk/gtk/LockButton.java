package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@code GtkLockButton} is a widget to obtain and revoke authorizations
 * needed to operate the controls.
 * <p>
 * <img src="./doc-files/lock-button.png" alt="An example GtkLockButton">
 * <p>
 * It is typically used in preference dialogs or control panels.
 * <p>
 * The required authorization is represented by a {@code GPermission} object.
 * Concrete implementations of {@code GPermission} may use PolicyKit or some
 * other authorization framework. To obtain a PolicyKit-based
 * {@code GPermission}, use {@code polkit_permission_new()}.
 * <p>
 * If the user is not currently allowed to perform the action, but can
 * obtain the permission, the widget looks like this:
 * <p>
 * <img src="./doc-files/lockbutton-locked.png" alt="">
 * <p>
 * and the user can click the button to request the permission. Depending
 * on the platform, this may pop up an authentication dialog or ask the user
 * to authenticate in some other way. Once the user has obtained the permission,
 * the widget changes to this:
 * <p>
 * <img src="./doc-files/lockbutton-unlocked.png" alt="">
 * <p>
 * and the permission can be dropped again by clicking the button. If the user
 * is not able to obtain the permission at all, the widget looks like this:
 * <p>
 * <img src="./doc-files/lockbutton-sorry.png" alt="">
 * <p>
 * If the user has the permission and cannot drop it, the button is hidden.
 * <p>
 * The text (and tooltips) that are shown in the various cases can be adjusted
 * with the {@code Gtk.LockButton:text-lock},
 * {@code Gtk.LockButton:text-unlock},
 * {@code Gtk.LockButton:tooltip-lock},
 * {@code Gtk.LockButton:tooltip-unlock} and
 * {@code Gtk.LockButton:tooltip-not-authorized} properties.
 */
public class LockButton extends org.gtk.gtk.Button implements org.gtk.gtk.Accessible, org.gtk.gtk.Actionable, org.gtk.gtk.Buildable, org.gtk.gtk.ConstraintTarget {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    public LockButton(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to LockButton */
    public static LockButton castFrom(org.gtk.gobject.Object gobject) {
        return new LockButton(gobject.refcounted());
    }
    
    private static Refcounted constructNew(@Nullable org.gtk.gio.Permission permission) {
        java.util.Objects.requireNonNullElse(permission, MemoryAddress.NULL);
        Refcounted RESULT;
        try {
            RESULT = Refcounted.get((MemoryAddress) DowncallHandles.gtk_lock_button_new.invokeExact(permission.handle()), false);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new lock button which reflects the {@code permission}.
     * @param permission a {@code GPermission}
     */
    public LockButton(@Nullable org.gtk.gio.Permission permission) {
        super(constructNew(permission));
    }
    
    /**
     * Obtains the {@code GPermission} object that controls {@code button}.
     * @return the {@code GPermission} of {@code button}
     */
    public @Nullable org.gtk.gio.Permission getPermission() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_lock_button_get_permission.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gio.Permission(Refcounted.get(RESULT, false));
    }
    
    /**
     * Sets the {@code GPermission} object that controls {@code button}.
     * @param permission a {@code GPermission} object
     */
    public void setPermission(@Nullable org.gtk.gio.Permission permission) {
        java.util.Objects.requireNonNullElse(permission, MemoryAddress.NULL);
        try {
            DowncallHandles.gtk_lock_button_set_permission.invokeExact(handle(), permission.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_lock_button_new = Interop.downcallHandle(
            "gtk_lock_button_new",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_lock_button_get_permission = Interop.downcallHandle(
            "gtk_lock_button_get_permission",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_lock_button_set_permission = Interop.downcallHandle(
            "gtk_lock_button_set_permission",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
    }
}
