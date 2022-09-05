package org.gtk.gio;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * Defines a Unix mount point (e.g. <filename>/dev</filename>).
 * This corresponds roughly to a fstab entry.
 */
public class UnixMountPoint extends io.github.jwharm.javagi.interop.ResourceBase {

    public UnixMountPoint(io.github.jwharm.javagi.interop.Proxy proxy) {
        super(proxy);
    }
    
    /**
     * Compares two unix mount points.
     */
    public int compare(UnixMountPoint mount2) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_unix_mount_point_compare(HANDLE(), mount2.HANDLE());
        return RESULT;
    }
    
    /**
     * Makes a copy of @mount_point.
     */
    public UnixMountPoint copy() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_unix_mount_point_copy(HANDLE());
        return new UnixMountPoint(ProxyFactory.getProxy(RESULT, true));
    }
    
    /**
     * Frees a unix mount point.
     */
    public void free() {
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_unix_mount_point_free(HANDLE());
    }
    
    /**
     * Gets the device path for a unix mount point.
     */
    public java.lang.String getDevicePath() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_unix_mount_point_get_device_path(HANDLE());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Gets the file system type for the mount point.
     */
    public java.lang.String getFsType() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_unix_mount_point_get_fs_type(HANDLE());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Gets the mount path for a unix mount point.
     */
    public java.lang.String getMountPath() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_unix_mount_point_get_mount_path(HANDLE());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Gets the options for the mount point.
     */
    public java.lang.String getOptions() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_unix_mount_point_get_options(HANDLE());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Guesses whether a Unix mount point can be ejected.
     */
    public boolean guessCanEject() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_unix_mount_point_guess_can_eject(HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Guesses the icon of a Unix mount point.
     */
    public Icon guessIcon() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_unix_mount_point_guess_icon(HANDLE());
        return new Icon.IconImpl(ProxyFactory.getProxy(RESULT, true));
    }
    
    /**
     * Guesses the name of a Unix mount point.
     * The result is a translated string.
     */
    public java.lang.String guessName() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_unix_mount_point_guess_name(HANDLE());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Guesses the symbolic icon of a Unix mount point.
     */
    public Icon guessSymbolicIcon() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_unix_mount_point_guess_symbolic_icon(HANDLE());
        return new Icon.IconImpl(ProxyFactory.getProxy(RESULT, true));
    }
    
    /**
     * Checks if a unix mount point is a loopback device.
     */
    public boolean isLoopback() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_unix_mount_point_is_loopback(HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Checks if a unix mount point is read only.
     */
    public boolean isReadonly() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_unix_mount_point_is_readonly(HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Checks if a unix mount point is mountable by the user.
     */
    public boolean isUserMountable() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_unix_mount_point_is_user_mountable(HANDLE());
        return (RESULT != 0);
    }
    
}
