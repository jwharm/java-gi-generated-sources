package org.gtk.gio;

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
    
    static final MethodHandle g_unix_mount_point_compare = Interop.downcallHandle(
        "g_unix_mount_point_compare",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Compares two unix mount points.
     */
    public int compare(UnixMountPoint mount2) {
        try {
            var RESULT = (int) g_unix_mount_point_compare.invokeExact(handle(), mount2.handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_unix_mount_point_copy = Interop.downcallHandle(
        "g_unix_mount_point_copy",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Makes a copy of {@code mount_point}.
     */
    public UnixMountPoint copy() {
        try {
            var RESULT = (MemoryAddress) g_unix_mount_point_copy.invokeExact(handle());
            return new UnixMountPoint(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_unix_mount_point_free = Interop.downcallHandle(
        "g_unix_mount_point_free",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Frees a unix mount point.
     */
    public void free() {
        try {
            g_unix_mount_point_free.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_unix_mount_point_get_device_path = Interop.downcallHandle(
        "g_unix_mount_point_get_device_path",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the device path for a unix mount point.
     */
    public java.lang.String getDevicePath() {
        try {
            var RESULT = (MemoryAddress) g_unix_mount_point_get_device_path.invokeExact(handle());
            return RESULT.getUtf8String(0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_unix_mount_point_get_fs_type = Interop.downcallHandle(
        "g_unix_mount_point_get_fs_type",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the file system type for the mount point.
     */
    public java.lang.String getFsType() {
        try {
            var RESULT = (MemoryAddress) g_unix_mount_point_get_fs_type.invokeExact(handle());
            return RESULT.getUtf8String(0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_unix_mount_point_get_mount_path = Interop.downcallHandle(
        "g_unix_mount_point_get_mount_path",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the mount path for a unix mount point.
     */
    public java.lang.String getMountPath() {
        try {
            var RESULT = (MemoryAddress) g_unix_mount_point_get_mount_path.invokeExact(handle());
            return RESULT.getUtf8String(0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_unix_mount_point_get_options = Interop.downcallHandle(
        "g_unix_mount_point_get_options",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the options for the mount point.
     */
    public java.lang.String getOptions() {
        try {
            var RESULT = (MemoryAddress) g_unix_mount_point_get_options.invokeExact(handle());
            return RESULT.getUtf8String(0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_unix_mount_point_guess_can_eject = Interop.downcallHandle(
        "g_unix_mount_point_guess_can_eject",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Guesses whether a Unix mount point can be ejected.
     */
    public boolean guessCanEject() {
        try {
            var RESULT = (int) g_unix_mount_point_guess_can_eject.invokeExact(handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_unix_mount_point_guess_icon = Interop.downcallHandle(
        "g_unix_mount_point_guess_icon",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Guesses the icon of a Unix mount point.
     */
    public Icon guessIcon() {
        try {
            var RESULT = (MemoryAddress) g_unix_mount_point_guess_icon.invokeExact(handle());
            return new Icon.IconImpl(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_unix_mount_point_guess_name = Interop.downcallHandle(
        "g_unix_mount_point_guess_name",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Guesses the name of a Unix mount point.
     * The result is a translated string.
     */
    public java.lang.String guessName() {
        try {
            var RESULT = (MemoryAddress) g_unix_mount_point_guess_name.invokeExact(handle());
            return RESULT.getUtf8String(0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_unix_mount_point_guess_symbolic_icon = Interop.downcallHandle(
        "g_unix_mount_point_guess_symbolic_icon",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Guesses the symbolic icon of a Unix mount point.
     */
    public Icon guessSymbolicIcon() {
        try {
            var RESULT = (MemoryAddress) g_unix_mount_point_guess_symbolic_icon.invokeExact(handle());
            return new Icon.IconImpl(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_unix_mount_point_is_loopback = Interop.downcallHandle(
        "g_unix_mount_point_is_loopback",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Checks if a unix mount point is a loopback device.
     */
    public boolean isLoopback() {
        try {
            var RESULT = (int) g_unix_mount_point_is_loopback.invokeExact(handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_unix_mount_point_is_readonly = Interop.downcallHandle(
        "g_unix_mount_point_is_readonly",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Checks if a unix mount point is read only.
     */
    public boolean isReadonly() {
        try {
            var RESULT = (int) g_unix_mount_point_is_readonly.invokeExact(handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_unix_mount_point_is_user_mountable = Interop.downcallHandle(
        "g_unix_mount_point_is_user_mountable",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Checks if a unix mount point is mountable by the user.
     */
    public boolean isUserMountable() {
        try {
            var RESULT = (int) g_unix_mount_point_is_user_mountable.invokeExact(handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_unix_mount_point_at = Interop.downcallHandle(
        "g_unix_mount_point_at",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets a {@link UnixMountPoint} for a given mount path. If {@code time_read} is set, it
     * will be filled with a unix timestamp for checking if the mount points have
     * changed since with g_unix_mount_points_changed_since().
     * <p>
     * If more mount points have the same mount path, the last matching mount point
     * is returned.
     */
    public static UnixMountPoint at(java.lang.String mountPath, PointerLong timeRead) {
        try {
            var RESULT = (MemoryAddress) g_unix_mount_point_at.invokeExact(Interop.allocateNativeString(mountPath).handle(), timeRead.handle());
            return new UnixMountPoint(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
}
