package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@link MountOperation} provides a mechanism for interacting with the user.
 * It can be used for authenticating mountable operations, such as loop
 * mounting files, hard drive partitions or server locations. It can
 * also be used to ask the user questions or show a list of applications
 * preventing unmount or eject operations from completing.
 * <p>
 * Note that {@link MountOperation} is used for more than just {@link Mount}
 * objects – for example it is also used in g_drive_start() and
 * g_drive_stop().
 * <p>
 * Users should instantiate a subclass of this that implements all the
 * various callbacks to show the required dialogs, such as
 * {@link org.gtk.gtk.MountOperation}. If no user interaction is desired (for example
 * when automounting filesystems at login time), usually {@code null} can be
 * passed, see each method taking a {@link MountOperation} for details.
 * <p>
 * The term ‘TCRYPT’ is used to mean ‘compatible with TrueCrypt and VeraCrypt’.
 * <a href="https://en.wikipedia.org/wiki/TrueCrypt">TrueCrypt</a> is a discontinued system for
 * encrypting file containers, partitions or whole disks, typically used with Windows.
 * <a href="https://www.veracrypt.fr/">VeraCrypt</a> is a maintained fork of TrueCrypt with various
 * improvements and auditing fixes.
 */
public class MountOperation extends org.gtk.gobject.Object {

    public MountOperation(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to MountOperation */
    public static MountOperation castFrom(org.gtk.gobject.Object gobject) {
        return new MountOperation(gobject.refcounted());
    }
    
    private static final MethodHandle g_mount_operation_new = Interop.downcallHandle(
        "g_mount_operation_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNew() {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) g_mount_operation_new.invokeExact(), true);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a new mount operation.
     */
    public MountOperation() {
        super(constructNew());
    }
    
    private static final MethodHandle g_mount_operation_get_anonymous = Interop.downcallHandle(
        "g_mount_operation_get_anonymous",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Check to see whether the mount operation is being used
     * for an anonymous user.
     */
    public boolean getAnonymous() {
        int RESULT;
        try {
            RESULT = (int) g_mount_operation_get_anonymous.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    private static final MethodHandle g_mount_operation_get_choice = Interop.downcallHandle(
        "g_mount_operation_get_choice",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets a choice from the mount operation.
     */
    public int getChoice() {
        int RESULT;
        try {
            RESULT = (int) g_mount_operation_get_choice.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static final MethodHandle g_mount_operation_get_domain = Interop.downcallHandle(
        "g_mount_operation_get_domain",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the domain of the mount operation.
     */
    public @Nullable java.lang.String getDomain() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_mount_operation_get_domain.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT.getUtf8String(0);
    }
    
    private static final MethodHandle g_mount_operation_get_is_tcrypt_hidden_volume = Interop.downcallHandle(
        "g_mount_operation_get_is_tcrypt_hidden_volume",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Check to see whether the mount operation is being used
     * for a TCRYPT hidden volume.
     */
    public boolean getIsTcryptHiddenVolume() {
        int RESULT;
        try {
            RESULT = (int) g_mount_operation_get_is_tcrypt_hidden_volume.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    private static final MethodHandle g_mount_operation_get_is_tcrypt_system_volume = Interop.downcallHandle(
        "g_mount_operation_get_is_tcrypt_system_volume",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Check to see whether the mount operation is being used
     * for a TCRYPT system volume.
     */
    public boolean getIsTcryptSystemVolume() {
        int RESULT;
        try {
            RESULT = (int) g_mount_operation_get_is_tcrypt_system_volume.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    private static final MethodHandle g_mount_operation_get_password = Interop.downcallHandle(
        "g_mount_operation_get_password",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets a password from the mount operation.
     */
    public @Nullable java.lang.String getPassword() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_mount_operation_get_password.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT.getUtf8String(0);
    }
    
    private static final MethodHandle g_mount_operation_get_password_save = Interop.downcallHandle(
        "g_mount_operation_get_password_save",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the state of saving passwords for the mount operation.
     */
    public @NotNull PasswordSave getPasswordSave() {
        int RESULT;
        try {
            RESULT = (int) g_mount_operation_get_password_save.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new PasswordSave(RESULT);
    }
    
    private static final MethodHandle g_mount_operation_get_pim = Interop.downcallHandle(
        "g_mount_operation_get_pim",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets a PIM from the mount operation.
     */
    public int getPim() {
        int RESULT;
        try {
            RESULT = (int) g_mount_operation_get_pim.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static final MethodHandle g_mount_operation_get_username = Interop.downcallHandle(
        "g_mount_operation_get_username",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Get the user name from the mount operation.
     */
    public @Nullable java.lang.String getUsername() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_mount_operation_get_username.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT.getUtf8String(0);
    }
    
    private static final MethodHandle g_mount_operation_reply = Interop.downcallHandle(
        "g_mount_operation_reply",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Emits the {@link MountOperation}::reply signal.
     */
    public @NotNull void reply(@NotNull MountOperationResult result) {
        try {
            g_mount_operation_reply.invokeExact(handle(), result.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle g_mount_operation_set_anonymous = Interop.downcallHandle(
        "g_mount_operation_set_anonymous",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets the mount operation to use an anonymous user if {@code anonymous} is {@code true}.
     */
    public @NotNull void setAnonymous(@NotNull boolean anonymous) {
        try {
            g_mount_operation_set_anonymous.invokeExact(handle(), anonymous ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle g_mount_operation_set_choice = Interop.downcallHandle(
        "g_mount_operation_set_choice",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets a default choice for the mount operation.
     */
    public @NotNull void setChoice(@NotNull int choice) {
        try {
            g_mount_operation_set_choice.invokeExact(handle(), choice);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle g_mount_operation_set_domain = Interop.downcallHandle(
        "g_mount_operation_set_domain",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets the mount operation's domain.
     */
    public @NotNull void setDomain(@Nullable java.lang.String domain) {
        try {
            g_mount_operation_set_domain.invokeExact(handle(), Interop.allocateNativeString(domain));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle g_mount_operation_set_is_tcrypt_hidden_volume = Interop.downcallHandle(
        "g_mount_operation_set_is_tcrypt_hidden_volume",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets the mount operation to use a hidden volume if {@code hidden_volume} is {@code true}.
     */
    public @NotNull void setIsTcryptHiddenVolume(@NotNull boolean hiddenVolume) {
        try {
            g_mount_operation_set_is_tcrypt_hidden_volume.invokeExact(handle(), hiddenVolume ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle g_mount_operation_set_is_tcrypt_system_volume = Interop.downcallHandle(
        "g_mount_operation_set_is_tcrypt_system_volume",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets the mount operation to use a system volume if {@code system_volume} is {@code true}.
     */
    public @NotNull void setIsTcryptSystemVolume(@NotNull boolean systemVolume) {
        try {
            g_mount_operation_set_is_tcrypt_system_volume.invokeExact(handle(), systemVolume ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle g_mount_operation_set_password = Interop.downcallHandle(
        "g_mount_operation_set_password",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets the mount operation's password to {@code password}.
     */
    public @NotNull void setPassword(@Nullable java.lang.String password) {
        try {
            g_mount_operation_set_password.invokeExact(handle(), Interop.allocateNativeString(password));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle g_mount_operation_set_password_save = Interop.downcallHandle(
        "g_mount_operation_set_password_save",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets the state of saving passwords for the mount operation.
     */
    public @NotNull void setPasswordSave(@NotNull PasswordSave save) {
        try {
            g_mount_operation_set_password_save.invokeExact(handle(), save.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle g_mount_operation_set_pim = Interop.downcallHandle(
        "g_mount_operation_set_pim",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets the mount operation's PIM to {@code pim}.
     */
    public @NotNull void setPim(@NotNull int pim) {
        try {
            g_mount_operation_set_pim.invokeExact(handle(), pim);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle g_mount_operation_set_username = Interop.downcallHandle(
        "g_mount_operation_set_username",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets the user name within {@code op} to {@code username}.
     */
    public @NotNull void setUsername(@Nullable java.lang.String username) {
        try {
            g_mount_operation_set_username.invokeExact(handle(), Interop.allocateNativeString(username));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface AbortedHandler {
        void signalReceived(MountOperation source);
    }
    
    /**
     * Emitted by the backend when e.g. a device becomes unavailable
     * while a mount operation is in progress.
     * <p>
     * Implementations of GMountOperation should handle this signal
     * by dismissing open password dialogs.
     */
    public SignalHandle onAborted(AbortedHandler handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("aborted"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(MountOperation.Callbacks.class, "signalMountOperationAborted",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler)),
                (Addressable) MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface AskPasswordHandler {
        void signalReceived(MountOperation source, @NotNull java.lang.String message, @NotNull java.lang.String defaultUser, @NotNull java.lang.String defaultDomain, @NotNull AskPasswordFlags flags);
    }
    
    /**
     * Emitted when a mount operation asks the user for a password.
     * <p>
     * If the message contains a line break, the first line should be
     * presented as a heading. For example, it may be used as the
     * primary text in a {@link org.gtk.gtk.MessageDialog}.
     */
    public SignalHandle onAskPassword(AskPasswordHandler handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("ask-password"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(MountOperation.Callbacks.class, "signalMountOperationAskPassword",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class, int.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
                    Interop.getScope()),
                (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler)),
                (Addressable) MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface ReplyHandler {
        void signalReceived(MountOperation source, @NotNull MountOperationResult result);
    }
    
    /**
     * Emitted when the user has replied to the mount operation.
     */
    public SignalHandle onReply(ReplyHandler handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("reply"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(MountOperation.Callbacks.class, "signalMountOperationReply",
                        MethodType.methodType(void.class, MemoryAddress.class, int.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
                    Interop.getScope()),
                (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler)),
                (Addressable) MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface ShowUnmountProgressHandler {
        void signalReceived(MountOperation source, @NotNull java.lang.String message, @NotNull long timeLeft, @NotNull long bytesLeft);
    }
    
    /**
     * Emitted when an unmount operation has been busy for more than some time
     * (typically 1.5 seconds).
     * <p>
     * When unmounting or ejecting a volume, the kernel might need to flush
     * pending data in its buffers to the volume stable storage, and this operation
     * can take a considerable amount of time. This signal may be emitted several
     * times as long as the unmount operation is outstanding, and then one
     * last time when the operation is completed, with {@code bytes_left} set to zero.
     * <p>
     * Implementations of GMountOperation should handle this signal by
     * showing an UI notification, and then dismiss it, or show another notification
     * of completion, when {@code bytes_left} reaches zero.
     * <p>
     * If the message contains a line break, the first line should be
     * presented as a heading. For example, it may be used as the
     * primary text in a {@link org.gtk.gtk.MessageDialog}.
     */
    public SignalHandle onShowUnmountProgress(ShowUnmountProgressHandler handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("show-unmount-progress"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(MountOperation.Callbacks.class, "signalMountOperationShowUnmountProgress",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, long.class, long.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS),
                    Interop.getScope()),
                (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler)),
                (Addressable) MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    public static class Callbacks {
    
        public static void signalMountOperationAborted(MemoryAddress source, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (MountOperation.AbortedHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new MountOperation(Refcounted.get(source)));
        }
        
        public static void signalMountOperationAskPassword(MemoryAddress source, MemoryAddress message, MemoryAddress defaultUser, MemoryAddress defaultDomain, int flags, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (MountOperation.AskPasswordHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new MountOperation(Refcounted.get(source)), message.getUtf8String(0), defaultUser.getUtf8String(0), defaultDomain.getUtf8String(0), new AskPasswordFlags(flags));
        }
        
        public static void signalMountOperationReply(MemoryAddress source, int result, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (MountOperation.ReplyHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new MountOperation(Refcounted.get(source)), new MountOperationResult(result));
        }
        
        public static void signalMountOperationShowUnmountProgress(MemoryAddress source, MemoryAddress message, long timeLeft, long bytesLeft, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (MountOperation.ShowUnmountProgressHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new MountOperation(Refcounted.get(source)), message.getUtf8String(0), timeLeft, bytesLeft);
        }
        
    }
}
