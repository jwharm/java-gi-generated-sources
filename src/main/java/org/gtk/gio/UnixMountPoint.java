package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Defines a Unix mount point (e.g. &lt;filename&gt;/dev&lt;/filename&gt;).
 * This corresponds roughly to a fstab entry.
 */
public class UnixMountPoint extends Struct {
    
    static {
        Gio.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GUnixMountPoint";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link UnixMountPoint}
     * @return A new, uninitialized @{link UnixMountPoint}
     */
    public static UnixMountPoint allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        UnixMountPoint newInstance = new UnixMountPoint(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a UnixMountPoint proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected UnixMountPoint(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, UnixMountPoint> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new UnixMountPoint(input, ownership);
    
    /**
     * Compares two unix mount points.
     * @param mount2 a {@code GUnixMount}.
     * @return 1, 0 or -1 if {@code mount1} is greater than, equal to,
     * or less than {@code mount2}, respectively.
     */
    public int compare(org.gtk.gio.UnixMountPoint mount2) {
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
    public org.gtk.gio.UnixMountPoint copy() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_unix_mount_point_copy.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.gio.UnixMountPoint.fromAddress.marshal(RESULT, Ownership.FULL);
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
    public java.lang.String getDevicePath() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_unix_mount_point_get_device_path.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Gets the file system type for the mount point.
     * @return a string containing the file system type.
     */
    public java.lang.String getFsType() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_unix_mount_point_get_fs_type.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Gets the mount path for a unix mount point.
     * @return a string containing the mount path.
     */
    public java.lang.String getMountPath() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_unix_mount_point_get_mount_path.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
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
        return Marshal.addressToString.marshal(RESULT, null);
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
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Guesses the icon of a Unix mount point.
     * @return a {@link Icon}
     */
    public org.gtk.gio.Icon guessIcon() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_unix_mount_point_guess_icon.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gtk.gio.Icon) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gtk.gio.Icon.fromAddress).marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * Guesses the name of a Unix mount point.
     * The result is a translated string.
     * @return A newly allocated string that must
     *     be freed with g_free()
     */
    public java.lang.String guessName() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_unix_mount_point_guess_name.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Guesses the symbolic icon of a Unix mount point.
     * @return a {@link Icon}
     */
    public org.gtk.gio.Icon guessSymbolicIcon() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_unix_mount_point_guess_symbolic_icon.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gtk.gio.Icon) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gtk.gio.Icon.fromAddress).marshal(RESULT, Ownership.FULL);
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
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
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
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
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
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
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
    public static @Nullable org.gtk.gio.UnixMountPoint at(java.lang.String mountPath, Out<Long> timeRead) {
        MemorySegment timeReadPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_LONG);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_unix_mount_point_at.invokeExact(
                    Marshal.stringToAddress.marshal(mountPath, null),
                    (Addressable) (timeRead == null ? MemoryAddress.NULL : (Addressable) timeReadPOINTER.address()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (timeRead != null) timeRead.set(timeReadPOINTER.get(Interop.valueLayout.C_LONG, 0));
        return org.gtk.gio.UnixMountPoint.fromAddress.marshal(RESULT, Ownership.FULL);
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle g_unix_mount_point_compare = Interop.downcallHandle(
            "g_unix_mount_point_compare",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_unix_mount_point_copy = Interop.downcallHandle(
            "g_unix_mount_point_copy",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_unix_mount_point_free = Interop.downcallHandle(
            "g_unix_mount_point_free",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_unix_mount_point_get_device_path = Interop.downcallHandle(
            "g_unix_mount_point_get_device_path",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_unix_mount_point_get_fs_type = Interop.downcallHandle(
            "g_unix_mount_point_get_fs_type",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_unix_mount_point_get_mount_path = Interop.downcallHandle(
            "g_unix_mount_point_get_mount_path",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_unix_mount_point_get_options = Interop.downcallHandle(
            "g_unix_mount_point_get_options",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_unix_mount_point_guess_can_eject = Interop.downcallHandle(
            "g_unix_mount_point_guess_can_eject",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_unix_mount_point_guess_icon = Interop.downcallHandle(
            "g_unix_mount_point_guess_icon",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_unix_mount_point_guess_name = Interop.downcallHandle(
            "g_unix_mount_point_guess_name",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_unix_mount_point_guess_symbolic_icon = Interop.downcallHandle(
            "g_unix_mount_point_guess_symbolic_icon",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_unix_mount_point_is_loopback = Interop.downcallHandle(
            "g_unix_mount_point_is_loopback",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_unix_mount_point_is_readonly = Interop.downcallHandle(
            "g_unix_mount_point_is_readonly",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_unix_mount_point_is_user_mountable = Interop.downcallHandle(
            "g_unix_mount_point_is_user_mountable",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_unix_mount_point_at = Interop.downcallHandle(
            "g_unix_mount_point_at",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
    }
}
