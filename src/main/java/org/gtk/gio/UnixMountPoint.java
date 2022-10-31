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
    
    static {
        Gio.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GUnixMountPoint";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    private MemorySegment allocatedMemorySegment;
    
    public static UnixMountPoint allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        UnixMountPoint newInstance = new UnixMountPoint(Refcounted.get(segment.address()));
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    @ApiStatus.Internal
    public UnixMountPoint(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /**
     * Compares two unix mount points.
     * @param mount2 a {@code GUnixMount}.
     * @return 1, 0 or -1 if {@code mount1} is greater than, equal to,
     * or less than {@code mount2}, respectively.
     */
    public int compare(@NotNull org.gtk.gio.UnixMountPoint mount2) {
        java.util.Objects.requireNonNull(mount2, "Parameter 'mount2' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_unix_mount_point_compare.invokeExact(
                    handle(),
                    mount2.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Makes a copy of {@code mount_point}.
     * @return a new {@link UnixMountPoint}
     */
    public @NotNull org.gtk.gio.UnixMountPoint copy() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_unix_mount_point_copy.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gio.UnixMountPoint(Refcounted.get(RESULT, true));
    }
    
    /**
     * Frees a unix mount point.
     */
    public void free() {
        try {
            DowncallHandles.g_unix_mount_point_free.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Gets the device path for a unix mount point.
     * @return a string containing the device path.
     */
    public @NotNull java.lang.String getDevicePath() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_unix_mount_point_get_device_path.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Gets the file system type for the mount point.
     * @return a string containing the file system type.
     */
    public @NotNull java.lang.String getFsType() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_unix_mount_point_get_fs_type.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Gets the mount path for a unix mount point.
     * @return a string containing the mount path.
     */
    public @NotNull java.lang.String getMountPath() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_unix_mount_point_get_mount_path.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Gets the options for the mount point.
     * @return a string containing the options.
     */
    public @Nullable java.lang.String getOptions() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_unix_mount_point_get_options.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Guesses whether a Unix mount point can be ejected.
     * @return {@code true} if {@code mount_point} is deemed to be ejectable.
     */
    public boolean guessCanEject() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_unix_mount_point_guess_can_eject.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Guesses the icon of a Unix mount point.
     * @return a {@link Icon}
     */
    public @NotNull org.gtk.gio.Icon guessIcon() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_unix_mount_point_guess_icon.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gio.Icon.IconImpl(Refcounted.get(RESULT, true));
    }
    
    /**
     * Guesses the name of a Unix mount point.
     * The result is a translated string.
     * @return A newly allocated string that must
     *     be freed with g_free()
     */
    public @NotNull java.lang.String guessName() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_unix_mount_point_guess_name.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Guesses the symbolic icon of a Unix mount point.
     * @return a {@link Icon}
     */
    public @NotNull org.gtk.gio.Icon guessSymbolicIcon() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_unix_mount_point_guess_symbolic_icon.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gio.Icon.IconImpl(Refcounted.get(RESULT, true));
    }
    
    /**
     * Checks if a unix mount point is a loopback device.
     * @return {@code true} if the mount point is a loopback. {@code false} otherwise.
     */
    public boolean isLoopback() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_unix_mount_point_is_loopback.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Checks if a unix mount point is read only.
     * @return {@code true} if a mount point is read only.
     */
    public boolean isReadonly() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_unix_mount_point_is_readonly.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Checks if a unix mount point is mountable by the user.
     * @return {@code true} if the mount point is user mountable.
     */
    public boolean isUserMountable() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_unix_mount_point_is_user_mountable.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Gets a {@link UnixMountPoint} for a given mount path. If {@code time_read} is set, it
     * will be filled with a unix timestamp for checking if the mount points have
     * changed since with g_unix_mount_points_changed_since().
     * <p>
     * If more mount points have the same mount path, the last matching mount point
     * is returned.
     * @param mountPath path for a possible unix mount point.
     * @param timeRead guint64 to contain a timestamp.
     * @return a {@link UnixMountPoint}, or {@code null} if no match
     * is found.
     */
    public static @Nullable org.gtk.gio.UnixMountPoint at(@NotNull java.lang.String mountPath, Out<Long> timeRead) {
        java.util.Objects.requireNonNull(mountPath, "Parameter 'mountPath' must not be null");
        java.util.Objects.requireNonNull(timeRead, "Parameter 'timeRead' must not be null");
        MemorySegment timeReadPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_LONG);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_unix_mount_point_at.invokeExact(
                    Interop.allocateNativeString(mountPath),
                    (Addressable) timeReadPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        timeRead.set(timeReadPOINTER.get(ValueLayout.JAVA_LONG, 0));
        return new org.gtk.gio.UnixMountPoint(Refcounted.get(RESULT, true));
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle g_unix_mount_point_compare = Interop.downcallHandle(
            "g_unix_mount_point_compare",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_unix_mount_point_copy = Interop.downcallHandle(
            "g_unix_mount_point_copy",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_unix_mount_point_free = Interop.downcallHandle(
            "g_unix_mount_point_free",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_unix_mount_point_get_device_path = Interop.downcallHandle(
            "g_unix_mount_point_get_device_path",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_unix_mount_point_get_fs_type = Interop.downcallHandle(
            "g_unix_mount_point_get_fs_type",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_unix_mount_point_get_mount_path = Interop.downcallHandle(
            "g_unix_mount_point_get_mount_path",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_unix_mount_point_get_options = Interop.downcallHandle(
            "g_unix_mount_point_get_options",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_unix_mount_point_guess_can_eject = Interop.downcallHandle(
            "g_unix_mount_point_guess_can_eject",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_unix_mount_point_guess_icon = Interop.downcallHandle(
            "g_unix_mount_point_guess_icon",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_unix_mount_point_guess_name = Interop.downcallHandle(
            "g_unix_mount_point_guess_name",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_unix_mount_point_guess_symbolic_icon = Interop.downcallHandle(
            "g_unix_mount_point_guess_symbolic_icon",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_unix_mount_point_is_loopback = Interop.downcallHandle(
            "g_unix_mount_point_is_loopback",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_unix_mount_point_is_readonly = Interop.downcallHandle(
            "g_unix_mount_point_is_readonly",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_unix_mount_point_is_user_mountable = Interop.downcallHandle(
            "g_unix_mount_point_is_user_mountable",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_unix_mount_point_at = Interop.downcallHandle(
            "g_unix_mount_point_at",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
    }
}
