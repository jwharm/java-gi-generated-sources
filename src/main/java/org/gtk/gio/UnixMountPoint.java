package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Defines a Unix mount point (e.g. &lt;filename&gt;/dev&lt;/filename&gt;).
 * This corresponds roughly to a fstab entry.
 */
public class UnixMountPoint extends io.github.jwharm.javagi.ResourceBase {

    public UnixMountPoint(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    private static final MethodHandle g_unix_mount_point_compare = Interop.downcallHandle(
        "g_unix_mount_point_compare",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Compares two unix mount points.
     */
    public int compare(@NotNull UnixMountPoint mount2) {
        int RESULT;
        try {
            RESULT = (int) g_unix_mount_point_compare.invokeExact(handle(), mount2.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static final MethodHandle g_unix_mount_point_copy = Interop.downcallHandle(
        "g_unix_mount_point_copy",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Makes a copy of {@code mount_point}.
     */
    public @NotNull UnixMountPoint copy() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_unix_mount_point_copy.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new UnixMountPoint(Refcounted.get(RESULT, true));
    }
    
    private static final MethodHandle g_unix_mount_point_free = Interop.downcallHandle(
        "g_unix_mount_point_free",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Frees a unix mount point.
     */
    public @NotNull void free() {
        try {
            g_unix_mount_point_free.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle g_unix_mount_point_get_device_path = Interop.downcallHandle(
        "g_unix_mount_point_get_device_path",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the device path for a unix mount point.
     */
    public @NotNull java.lang.String getDevicePath() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_unix_mount_point_get_device_path.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT.getUtf8String(0);
    }
    
    private static final MethodHandle g_unix_mount_point_get_fs_type = Interop.downcallHandle(
        "g_unix_mount_point_get_fs_type",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the file system type for the mount point.
     */
    public @NotNull java.lang.String getFsType() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_unix_mount_point_get_fs_type.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT.getUtf8String(0);
    }
    
    private static final MethodHandle g_unix_mount_point_get_mount_path = Interop.downcallHandle(
        "g_unix_mount_point_get_mount_path",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the mount path for a unix mount point.
     */
    public @NotNull java.lang.String getMountPath() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_unix_mount_point_get_mount_path.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT.getUtf8String(0);
    }
    
    private static final MethodHandle g_unix_mount_point_get_options = Interop.downcallHandle(
        "g_unix_mount_point_get_options",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the options for the mount point.
     */
    public @Nullable java.lang.String getOptions() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_unix_mount_point_get_options.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT.getUtf8String(0);
    }
    
    private static final MethodHandle g_unix_mount_point_guess_can_eject = Interop.downcallHandle(
        "g_unix_mount_point_guess_can_eject",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Guesses whether a Unix mount point can be ejected.
     */
    public boolean guessCanEject() {
        int RESULT;
        try {
            RESULT = (int) g_unix_mount_point_guess_can_eject.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    private static final MethodHandle g_unix_mount_point_guess_icon = Interop.downcallHandle(
        "g_unix_mount_point_guess_icon",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Guesses the icon of a Unix mount point.
     */
    public @NotNull Icon guessIcon() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_unix_mount_point_guess_icon.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new Icon.IconImpl(Refcounted.get(RESULT, true));
    }
    
    private static final MethodHandle g_unix_mount_point_guess_name = Interop.downcallHandle(
        "g_unix_mount_point_guess_name",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Guesses the name of a Unix mount point.
     * The result is a translated string.
     */
    public @NotNull java.lang.String guessName() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_unix_mount_point_guess_name.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT.getUtf8String(0);
    }
    
    private static final MethodHandle g_unix_mount_point_guess_symbolic_icon = Interop.downcallHandle(
        "g_unix_mount_point_guess_symbolic_icon",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Guesses the symbolic icon of a Unix mount point.
     */
    public @NotNull Icon guessSymbolicIcon() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_unix_mount_point_guess_symbolic_icon.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new Icon.IconImpl(Refcounted.get(RESULT, true));
    }
    
    private static final MethodHandle g_unix_mount_point_is_loopback = Interop.downcallHandle(
        "g_unix_mount_point_is_loopback",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Checks if a unix mount point is a loopback device.
     */
    public boolean isLoopback() {
        int RESULT;
        try {
            RESULT = (int) g_unix_mount_point_is_loopback.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    private static final MethodHandle g_unix_mount_point_is_readonly = Interop.downcallHandle(
        "g_unix_mount_point_is_readonly",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Checks if a unix mount point is read only.
     */
    public boolean isReadonly() {
        int RESULT;
        try {
            RESULT = (int) g_unix_mount_point_is_readonly.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    private static final MethodHandle g_unix_mount_point_is_user_mountable = Interop.downcallHandle(
        "g_unix_mount_point_is_user_mountable",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Checks if a unix mount point is mountable by the user.
     */
    public boolean isUserMountable() {
        int RESULT;
        try {
            RESULT = (int) g_unix_mount_point_is_user_mountable.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    private static final MethodHandle g_unix_mount_point_at = Interop.downcallHandle(
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
    public static @Nullable UnixMountPoint at(@NotNull java.lang.String mountPath, @NotNull Out<Long> timeRead) {
        MemorySegment timeReadPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_LONG);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_unix_mount_point_at.invokeExact(Interop.allocateNativeString(mountPath), (Addressable) timeReadPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        timeRead.set(timeReadPOINTER.get(ValueLayout.JAVA_LONG, 0));
        return new UnixMountPoint(Refcounted.get(RESULT, true));
    }
    
}
