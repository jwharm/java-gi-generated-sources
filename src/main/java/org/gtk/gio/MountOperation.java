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
    
    static {
        Gio.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GMountOperation";
    
    private static GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.gobject.Object.getMemoryLayout().withName("parent_instance"),
        Interop.valueLayout.ADDRESS.withName("priv")
    ).withName(C_TYPE_NAME);
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    /**
     * Get the value of the field {@code parent_instance}
     * @return The value of the field {@code parent_instance}
     */
    public org.gtk.gobject.Object parent_instance$get() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("parent_instance"));
        return new org.gtk.gobject.Object(((MemoryAddress) handle()).addOffset(OFFSET), Ownership.UNKNOWN);
    }
    
    /**
     * Create a MountOperation proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public MountOperation(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Cast object to MountOperation if its GType is a (or inherits from) "GMountOperation".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code MountOperation} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GMountOperation", a ClassCastException will be thrown.
     */
    public static MountOperation castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), org.gtk.gobject.GObject.typeFromName("GMountOperation"))) {
            return new MountOperation(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GMountOperation");
        }
    }
    
    private static Addressable constructNew() {
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_mount_operation_new.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new mount operation.
     */
    public MountOperation() {
        super(constructNew(), Ownership.FULL);
    }
    
    /**
     * Check to see whether the mount operation is being used
     * for an anonymous user.
     * @return {@code true} if mount operation is anonymous.
     */
    public boolean getAnonymous() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_mount_operation_get_anonymous.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Gets a choice from the mount operation.
     * @return an integer containing an index of the user's choice from
     * the choice's list, or {@code 0}.
     */
    public int getChoice() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_mount_operation_get_choice.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Gets the domain of the mount operation.
     * @return a string set to the domain.
     */
    public @Nullable java.lang.String getDomain() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_mount_operation_get_domain.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Check to see whether the mount operation is being used
     * for a TCRYPT hidden volume.
     * @return {@code true} if mount operation is for hidden volume.
     */
    public boolean getIsTcryptHiddenVolume() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_mount_operation_get_is_tcrypt_hidden_volume.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Check to see whether the mount operation is being used
     * for a TCRYPT system volume.
     * @return {@code true} if mount operation is for system volume.
     */
    public boolean getIsTcryptSystemVolume() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_mount_operation_get_is_tcrypt_system_volume.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Gets a password from the mount operation.
     * @return a string containing the password within {@code op}.
     */
    public @Nullable java.lang.String getPassword() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_mount_operation_get_password.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Gets the state of saving passwords for the mount operation.
     * @return a {@link PasswordSave} flag.
     */
    public @NotNull org.gtk.gio.PasswordSave getPasswordSave() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_mount_operation_get_password_save.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gio.PasswordSave(RESULT);
    }
    
    /**
     * Gets a PIM from the mount operation.
     * @return The VeraCrypt PIM within {@code op}.
     */
    public int getPim() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_mount_operation_get_pim.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Get the user name from the mount operation.
     * @return a string containing the user name.
     */
    public @Nullable java.lang.String getUsername() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_mount_operation_get_username.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Emits the {@link MountOperation}::reply signal.
     * @param result a {@link MountOperationResult}
     */
    public void reply(@NotNull org.gtk.gio.MountOperationResult result) {
        java.util.Objects.requireNonNull(result, "Parameter 'result' must not be null");
        try {
            DowncallHandles.g_mount_operation_reply.invokeExact(
                    handle(),
                    result.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the mount operation to use an anonymous user if {@code anonymous} is {@code true}.
     * @param anonymous boolean value.
     */
    public void setAnonymous(boolean anonymous) {
        try {
            DowncallHandles.g_mount_operation_set_anonymous.invokeExact(
                    handle(),
                    anonymous ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets a default choice for the mount operation.
     * @param choice an integer.
     */
    public void setChoice(int choice) {
        try {
            DowncallHandles.g_mount_operation_set_choice.invokeExact(
                    handle(),
                    choice);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the mount operation's domain.
     * @param domain the domain to set.
     */
    public void setDomain(@Nullable java.lang.String domain) {
        try {
            DowncallHandles.g_mount_operation_set_domain.invokeExact(
                    handle(),
                    (Addressable) (domain == null ? MemoryAddress.NULL : Interop.allocateNativeString(domain)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the mount operation to use a hidden volume if {@code hidden_volume} is {@code true}.
     * @param hiddenVolume boolean value.
     */
    public void setIsTcryptHiddenVolume(boolean hiddenVolume) {
        try {
            DowncallHandles.g_mount_operation_set_is_tcrypt_hidden_volume.invokeExact(
                    handle(),
                    hiddenVolume ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the mount operation to use a system volume if {@code system_volume} is {@code true}.
     * @param systemVolume boolean value.
     */
    public void setIsTcryptSystemVolume(boolean systemVolume) {
        try {
            DowncallHandles.g_mount_operation_set_is_tcrypt_system_volume.invokeExact(
                    handle(),
                    systemVolume ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the mount operation's password to {@code password}.
     * @param password password to set.
     */
    public void setPassword(@Nullable java.lang.String password) {
        try {
            DowncallHandles.g_mount_operation_set_password.invokeExact(
                    handle(),
                    (Addressable) (password == null ? MemoryAddress.NULL : Interop.allocateNativeString(password)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the state of saving passwords for the mount operation.
     * @param save a set of {@link PasswordSave} flags.
     */
    public void setPasswordSave(@NotNull org.gtk.gio.PasswordSave save) {
        java.util.Objects.requireNonNull(save, "Parameter 'save' must not be null");
        try {
            DowncallHandles.g_mount_operation_set_password_save.invokeExact(
                    handle(),
                    save.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the mount operation's PIM to {@code pim}.
     * @param pim an unsigned integer.
     */
    public void setPim(int pim) {
        try {
            DowncallHandles.g_mount_operation_set_pim.invokeExact(
                    handle(),
                    pim);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the user name within {@code op} to {@code username}.
     * @param username input username.
     */
    public void setUsername(@Nullable java.lang.String username) {
        try {
            DowncallHandles.g_mount_operation_set_username.invokeExact(
                    handle(),
                    (Addressable) (username == null ? MemoryAddress.NULL : Interop.allocateNativeString(username)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface Aborted {
        void signalReceived(MountOperation source);
    }
    
    /**
     * Emitted by the backend when e.g. a device becomes unavailable
     * while a mount operation is in progress.
     * <p>
     * Implementations of GMountOperation should handle this signal
     * by dismissing open password dialogs.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<MountOperation.Aborted> onAborted(MountOperation.Aborted handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("aborted"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(MountOperation.Callbacks.class, "signalMountOperationAborted",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<MountOperation.Aborted>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface AskPassword {
        void signalReceived(MountOperation source, @NotNull java.lang.String message, @NotNull java.lang.String defaultUser, @NotNull java.lang.String defaultDomain, @NotNull org.gtk.gio.AskPasswordFlags flags);
    }
    
    /**
     * Emitted when a mount operation asks the user for a password.
     * <p>
     * If the message contains a line break, the first line should be
     * presented as a heading. For example, it may be used as the
     * primary text in a {@link org.gtk.gtk.MessageDialog}.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<MountOperation.AskPassword> onAskPassword(MountOperation.AskPassword handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("ask-password"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(MountOperation.Callbacks.class, "signalMountOperationAskPassword",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class, int.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<MountOperation.AskPassword>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface AskQuestion {
        void signalReceived(MountOperation source, @NotNull java.lang.String message, @NotNull java.lang.String[] choices);
    }
    
    /**
     * Emitted when asking the user a question and gives a list of
     * choices for the user to choose from.
     * <p>
     * If the message contains a line break, the first line should be
     * presented as a heading. For example, it may be used as the
     * primary text in a {@link org.gtk.gtk.MessageDialog}.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<MountOperation.AskQuestion> onAskQuestion(MountOperation.AskQuestion handler) {
        throw new UnsupportedOperationException("Operation not supported yet");
    }
    
    @FunctionalInterface
    public interface Reply {
        void signalReceived(MountOperation source, @NotNull org.gtk.gio.MountOperationResult result);
    }
    
    /**
     * Emitted when the user has replied to the mount operation.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<MountOperation.Reply> onReply(MountOperation.Reply handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("reply"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(MountOperation.Callbacks.class, "signalMountOperationReply",
                        MethodType.methodType(void.class, MemoryAddress.class, int.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<MountOperation.Reply>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface ShowProcesses {
        void signalReceived(MountOperation source, @NotNull java.lang.String message, @NotNull org.gtk.glib.Pid[] processes, @NotNull java.lang.String[] choices);
    }
    
    /**
     * Emitted when one or more processes are blocking an operation
     * e.g. unmounting/ejecting a {@link Mount} or stopping a {@link Drive}.
     * <p>
     * Note that this signal may be emitted several times to update the
     * list of blocking processes as processes close files. The
     * application should only respond with g_mount_operation_reply() to
     * the latest signal (setting {@link MountOperation}:choice to the choice
     * the user made).
     * <p>
     * If the message contains a line break, the first line should be
     * presented as a heading. For example, it may be used as the
     * primary text in a {@link org.gtk.gtk.MessageDialog}.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<MountOperation.ShowProcesses> onShowProcesses(MountOperation.ShowProcesses handler) {
        throw new UnsupportedOperationException("Operation not supported yet");
    }
    
    @FunctionalInterface
    public interface ShowUnmountProgress {
        void signalReceived(MountOperation source, @NotNull java.lang.String message, long timeLeft, long bytesLeft);
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
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<MountOperation.ShowUnmountProgress> onShowUnmountProgress(MountOperation.ShowUnmountProgress handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("show-unmount-progress"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(MountOperation.Callbacks.class, "signalMountOperationShowUnmountProgress",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, long.class, long.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<MountOperation.ShowUnmountProgress>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle g_mount_operation_new = Interop.downcallHandle(
            "g_mount_operation_new",
            FunctionDescriptor.of(ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_mount_operation_get_anonymous = Interop.downcallHandle(
            "g_mount_operation_get_anonymous",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_mount_operation_get_choice = Interop.downcallHandle(
            "g_mount_operation_get_choice",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_mount_operation_get_domain = Interop.downcallHandle(
            "g_mount_operation_get_domain",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_mount_operation_get_is_tcrypt_hidden_volume = Interop.downcallHandle(
            "g_mount_operation_get_is_tcrypt_hidden_volume",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_mount_operation_get_is_tcrypt_system_volume = Interop.downcallHandle(
            "g_mount_operation_get_is_tcrypt_system_volume",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_mount_operation_get_password = Interop.downcallHandle(
            "g_mount_operation_get_password",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_mount_operation_get_password_save = Interop.downcallHandle(
            "g_mount_operation_get_password_save",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_mount_operation_get_pim = Interop.downcallHandle(
            "g_mount_operation_get_pim",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_mount_operation_get_username = Interop.downcallHandle(
            "g_mount_operation_get_username",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_mount_operation_reply = Interop.downcallHandle(
            "g_mount_operation_reply",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT),
            false
        );
        
        private static final MethodHandle g_mount_operation_set_anonymous = Interop.downcallHandle(
            "g_mount_operation_set_anonymous",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT),
            false
        );
        
        private static final MethodHandle g_mount_operation_set_choice = Interop.downcallHandle(
            "g_mount_operation_set_choice",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT),
            false
        );
        
        private static final MethodHandle g_mount_operation_set_domain = Interop.downcallHandle(
            "g_mount_operation_set_domain",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_mount_operation_set_is_tcrypt_hidden_volume = Interop.downcallHandle(
            "g_mount_operation_set_is_tcrypt_hidden_volume",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT),
            false
        );
        
        private static final MethodHandle g_mount_operation_set_is_tcrypt_system_volume = Interop.downcallHandle(
            "g_mount_operation_set_is_tcrypt_system_volume",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT),
            false
        );
        
        private static final MethodHandle g_mount_operation_set_password = Interop.downcallHandle(
            "g_mount_operation_set_password",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_mount_operation_set_password_save = Interop.downcallHandle(
            "g_mount_operation_set_password_save",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT),
            false
        );
        
        private static final MethodHandle g_mount_operation_set_pim = Interop.downcallHandle(
            "g_mount_operation_set_pim",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT),
            false
        );
        
        private static final MethodHandle g_mount_operation_set_username = Interop.downcallHandle(
            "g_mount_operation_set_username",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
    }
    
    private static class Callbacks {
        
        public static void signalMountOperationAborted(MemoryAddress source, MemoryAddress data) {
            int HASH = data.get(ValueLayout.JAVA_INT, 0);
            var HANDLER = (MountOperation.Aborted) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new MountOperation(source, Ownership.UNKNOWN));
        }
        
        public static void signalMountOperationAskPassword(MemoryAddress source, MemoryAddress message, MemoryAddress defaultUser, MemoryAddress defaultDomain, int flags, MemoryAddress data) {
            int HASH = data.get(ValueLayout.JAVA_INT, 0);
            var HANDLER = (MountOperation.AskPassword) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new MountOperation(source, Ownership.UNKNOWN), Interop.getStringFrom(message), Interop.getStringFrom(defaultUser), Interop.getStringFrom(defaultDomain), new org.gtk.gio.AskPasswordFlags(flags));
        }
        
        public static void signalMountOperationAskQuestion(MemoryAddress source, MemoryAddress message, MemoryAddress choices, MemoryAddress data) {
        // Operation not supported yet
    }
        
        public static void signalMountOperationReply(MemoryAddress source, int result, MemoryAddress data) {
            int HASH = data.get(ValueLayout.JAVA_INT, 0);
            var HANDLER = (MountOperation.Reply) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new MountOperation(source, Ownership.UNKNOWN), new org.gtk.gio.MountOperationResult(result));
        }
        
        public static void signalMountOperationShowProcesses(MemoryAddress source, MemoryAddress message, MemoryAddress processes, MemoryAddress choices, MemoryAddress data) {
        // Operation not supported yet
    }
        
        public static void signalMountOperationShowUnmountProgress(MemoryAddress source, MemoryAddress message, long timeLeft, long bytesLeft, MemoryAddress data) {
            int HASH = data.get(ValueLayout.JAVA_INT, 0);
            var HANDLER = (MountOperation.ShowUnmountProgress) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new MountOperation(source, Ownership.UNKNOWN), Interop.getStringFrom(message), timeLeft, bytesLeft);
        }
    }
}
