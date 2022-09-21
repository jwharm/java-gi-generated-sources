package org.gtk.gio;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * Defines a Unix mount point (e.g. &lt;filename>/dev</filename&gt;).
 * This corresponds roughly to a fstab entry.
 */
public class UnixMountPoint extends io.github.jwharm.javagi.ResourceBase {

    public UnixMountPoint(io.github.jwharm.javagi.Reference reference) {
        super(reference);
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
        return new UnixMountPoint(References.get(RESULT, true));
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
        return (RESULT != 0);
    }
    
    /**
     * Guesses the icon of a Unix mount point.
     */
    public Icon guessIcon() {
        var RESULT = gtk_h.g_unix_mount_point_guess_icon(handle());
        return new Icon.IconImpl(References.get(RESULT, true));
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
        return new Icon.IconImpl(References.get(RESULT, true));
    }
    
    /**
     * Checks if a unix mount point is a loopback device.
     */
    public boolean isLoopback() {
        var RESULT = gtk_h.g_unix_mount_point_is_loopback(handle());
        return (RESULT != 0);
    }
    
    /**
     * Checks if a unix mount point is read only.
     */
    public boolean isReadonly() {
        var RESULT = gtk_h.g_unix_mount_point_is_readonly(handle());
        return (RESULT != 0);
    }
    
    /**
     * Checks if a unix mount point is mountable by the user.
     */
    public boolean isUserMountable() {
        var RESULT = gtk_h.g_unix_mount_point_is_user_mountable(handle());
        return (RESULT != 0);
    }
    
}
