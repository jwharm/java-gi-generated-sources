package org.gtk.gio;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * Defines a Unix mount point (e.g. &lt;filename>/dev</filename&gt;).
 * This corresponds roughly to a fstab entry.
 */
public class UnixMountPoint extends io.github.jwharm.javagi.ResourceBase {

    public UnixMountPoint(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /**
     * Compares two unix mount points.
     */
    public int compare(UnixMountPoint mount2) {
        var RESULT = gtk_h.g_unix_mount_point_compare(handle(), mount2.handle());
        return RESULT;
    }
    
    /**
     * Makes a copy of {@code mount_point}.
     */
    public UnixMountPoint copy() {
        var RESULT = gtk_h.g_unix_mount_point_copy(handle());
        return new UnixMountPoint(Refcounted.get(RESULT, true));
    }
    
    /**
     * Frees a unix mount point.
     */
    public void free() {
        gtk_h.g_unix_mount_point_free(handle());
    }
    
    /**
     * Gets the device path for a unix mount point.
     */
    public java.lang.String getDevicePath() {
        var RESULT = gtk_h.g_unix_mount_point_get_device_path(handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Gets the file system type for the mount point.
     */
    public java.lang.String getFsType() {
        var RESULT = gtk_h.g_unix_mount_point_get_fs_type(handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Gets the mount path for a unix mount point.
     */
    public java.lang.String getMountPath() {
        var RESULT = gtk_h.g_unix_mount_point_get_mount_path(handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Gets the options for the mount point.
     */
    public java.lang.String getOptions() {
        var RESULT = gtk_h.g_unix_mount_point_get_options(handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Guesses whether a Unix mount point can be ejected.
     */
    public boolean guessCanEject() {
        var RESULT = gtk_h.g_unix_mount_point_guess_can_eject(handle());
        return RESULT != 0;
    }
    
    /**
     * Guesses the icon of a Unix mount point.
     */
    public Icon guessIcon() {
        var RESULT = gtk_h.g_unix_mount_point_guess_icon(handle());
        return new Icon.IconImpl(Refcounted.get(RESULT, true));
    }
    
    /**
     * Guesses the name of a Unix mount point.
     * The result is a translated string.
     */
    public java.lang.String guessName() {
        var RESULT = gtk_h.g_unix_mount_point_guess_name(handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Guesses the symbolic icon of a Unix mount point.
     */
    public Icon guessSymbolicIcon() {
        var RESULT = gtk_h.g_unix_mount_point_guess_symbolic_icon(handle());
        return new Icon.IconImpl(Refcounted.get(RESULT, true));
    }
    
    /**
     * Checks if a unix mount point is a loopback device.
     */
    public boolean isLoopback() {
        var RESULT = gtk_h.g_unix_mount_point_is_loopback(handle());
        return RESULT != 0;
    }
    
    /**
     * Checks if a unix mount point is read only.
     */
    public boolean isReadonly() {
        var RESULT = gtk_h.g_unix_mount_point_is_readonly(handle());
        return RESULT != 0;
    }
    
    /**
     * Checks if a unix mount point is mountable by the user.
     */
    public boolean isUserMountable() {
        var RESULT = gtk_h.g_unix_mount_point_is_user_mountable(handle());
        return RESULT != 0;
    }
    
    /**
     * Gets a {@link UnixMountPoint} for a given mount path. If {@code time_read} is set, it
     * will be filled with a unix timestamp for checking if the mount points have
     * changed since with g_unix_mount_points_changed_since().
     * <p>
     * If more mount points have the same mount path, the last matching mount point
     * is returned.
     */
    public static UnixMountPoint at(java.lang.String mountPath, PointerLong timeRead) {
        var RESULT = gtk_h.g_unix_mount_point_at(Interop.allocateNativeString(mountPath).handle(), timeRead.handle());
        return new UnixMountPoint(Refcounted.get(RESULT, true));
    }
    
}
