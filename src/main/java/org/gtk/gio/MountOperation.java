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
 * {@code GtkMountOperation}. If no user interaction is desired (for example
 * when automounting filesystems at login time), usually {@code null} can be
 * passed, see each method taking a {@link MountOperation} for details.
 * <p>
 * The term ‘TCRYPT’ is used to mean ‘compatible with TrueCrypt and VeraCrypt’.
 * <a href="https://en.wikipedia.org/wiki/TrueCrypt">TrueCrypt</a> is a discontinued system for
 * encrypting file containers, partitions or whole disks, typically used with Windows.
 * <a href="https://www.veracrypt.fr/">VeraCrypt</a> is a maintained fork of TrueCrypt with various
 * improvements and auditing fixes.
 */
public class MountOperation extends org.gtk.gobject.GObject {
    
    static {
        Gio.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GMountOperation";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gtk.gobject.GObject.getMemoryLayout().withName("parent_instance"),
            Interop.valueLayout.ADDRESS.withName("priv")
        ).withName(C_TYPE_NAME);
    }
    
    /**
     * Create a MountOperation proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected MountOperation(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, MountOperation> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new MountOperation(input);
    
    private static MemoryAddress constructNew() {
        MemoryAddress RESULT;
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
        super(constructNew());
        this.takeOwnership();
    }
    
    /**
     * Check to see whether the mount operation is being used
     * for an anonymous user.
     * @return {@code true} if mount operation is anonymous.
     */
    public boolean getAnonymous() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_mount_operation_get_anonymous.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Gets a choice from the mount operation.
     * @return an integer containing an index of the user's choice from
     * the choice's list, or {@code 0}.
     */
    public int getChoice() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_mount_operation_get_choice.invokeExact(handle());
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
            RESULT = (MemoryAddress) DowncallHandles.g_mount_operation_get_domain.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Check to see whether the mount operation is being used
     * for a TCRYPT hidden volume.
     * @return {@code true} if mount operation is for hidden volume.
     */
    public boolean getIsTcryptHiddenVolume() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_mount_operation_get_is_tcrypt_hidden_volume.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Check to see whether the mount operation is being used
     * for a TCRYPT system volume.
     * @return {@code true} if mount operation is for system volume.
     */
    public boolean getIsTcryptSystemVolume() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_mount_operation_get_is_tcrypt_system_volume.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Gets a password from the mount operation.
     * @return a string containing the password within {@code op}.
     */
    public @Nullable java.lang.String getPassword() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_mount_operation_get_password.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Gets the state of saving passwords for the mount operation.
     * @return a {@link PasswordSave} flag.
     */
    public org.gtk.gio.PasswordSave getPasswordSave() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_mount_operation_get_password_save.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.gio.PasswordSave.of(RESULT);
    }
    
    /**
     * Gets a PIM from the mount operation.
     * @return The VeraCrypt PIM within {@code op}.
     */
    public int getPim() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_mount_operation_get_pim.invokeExact(handle());
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
            RESULT = (MemoryAddress) DowncallHandles.g_mount_operation_get_username.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Emits the {@link MountOperation}::reply signal.
     * @param result a {@link MountOperationResult}
     */
    public void reply(org.gtk.gio.MountOperationResult result) {
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
                    Marshal.booleanToInteger.marshal(anonymous, null).intValue());
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
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            try {
                DowncallHandles.g_mount_operation_set_domain.invokeExact(
                        handle(),
                        (Addressable) (domain == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(domain, SCOPE)));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
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
                    Marshal.booleanToInteger.marshal(hiddenVolume, null).intValue());
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
                    Marshal.booleanToInteger.marshal(systemVolume, null).intValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the mount operation's password to {@code password}.
     * @param password password to set.
     */
    public void setPassword(@Nullable java.lang.String password) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            try {
                DowncallHandles.g_mount_operation_set_password.invokeExact(
                        handle(),
                        (Addressable) (password == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(password, SCOPE)));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
        }
    }
    
    /**
     * Sets the state of saving passwords for the mount operation.
     * @param save a set of {@link PasswordSave} flags.
     */
    public void setPasswordSave(org.gtk.gio.PasswordSave save) {
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
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            try {
                DowncallHandles.g_mount_operation_set_username.invokeExact(
                        handle(),
                        (Addressable) (username == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(username, SCOPE)));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
        }
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.g_mount_operation_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * Functional interface declaration of the {@code Aborted} callback.
     */
    @FunctionalInterface
    public interface Aborted {
    
        /**
         * Emitted by the backend when e.g. a device becomes unavailable
         * while a mount operation is in progress.
         * <p>
         * Implementations of GMountOperation should handle this signal
         * by dismissing open password dialogs.
         */
        void run();
        
        @ApiStatus.Internal default void upcall(MemoryAddress sourceMountOperation) {
            run();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), Aborted.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
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
        MemorySession SCOPE = MemorySession.openImplicit();
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("aborted", SCOPE), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Functional interface declaration of the {@code AskPassword} callback.
     */
    @FunctionalInterface
    public interface AskPassword {
    
        /**
         * Emitted when a mount operation asks the user for a password.
         * <p>
         * If the message contains a line break, the first line should be
         * presented as a heading. For example, it may be used as the
         * primary text in a {@code GtkMessageDialog}.
         */
        void run(java.lang.String message, java.lang.String defaultUser, java.lang.String defaultDomain, org.gtk.gio.AskPasswordFlags flags);
        
        @ApiStatus.Internal default void upcall(MemoryAddress sourceMountOperation, MemoryAddress message, MemoryAddress defaultUser, MemoryAddress defaultDomain, int flags) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                run(Marshal.addressToString.marshal(message, null), Marshal.addressToString.marshal(defaultUser, null), Marshal.addressToString.marshal(defaultDomain, null), new org.gtk.gio.AskPasswordFlags(flags));
            }
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), AskPassword.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Emitted when a mount operation asks the user for a password.
     * <p>
     * If the message contains a line break, the first line should be
     * presented as a heading. For example, it may be used as the
     * primary text in a {@code GtkMessageDialog}.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<MountOperation.AskPassword> onAskPassword(MountOperation.AskPassword handler) {
        MemorySession SCOPE = MemorySession.openImplicit();
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("ask-password", SCOPE), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Functional interface declaration of the {@code AskQuestion} callback.
     */
    @FunctionalInterface
    public interface AskQuestion {
    
        /**
         * Emitted when asking the user a question and gives a list of
         * choices for the user to choose from.
         * <p>
         * If the message contains a line break, the first line should be
         * presented as a heading. For example, it may be used as the
         * primary text in a {@code GtkMessageDialog}.
         */
        void run(java.lang.String message, PointerString choices);
        
        @ApiStatus.Internal default void upcall(MemoryAddress sourceMountOperation, MemoryAddress message, MemoryAddress choices) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                run(Marshal.addressToString.marshal(message, null), new PointerString(choices));
            }
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), AskQuestion.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Emitted when asking the user a question and gives a list of
     * choices for the user to choose from.
     * <p>
     * If the message contains a line break, the first line should be
     * presented as a heading. For example, it may be used as the
     * primary text in a {@code GtkMessageDialog}.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<MountOperation.AskQuestion> onAskQuestion(MountOperation.AskQuestion handler) {
        MemorySession SCOPE = MemorySession.openImplicit();
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("ask-question", SCOPE), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Functional interface declaration of the {@code Reply} callback.
     */
    @FunctionalInterface
    public interface Reply {
    
        /**
         * Emitted when the user has replied to the mount operation.
         */
        void run(org.gtk.gio.MountOperationResult result);
        
        @ApiStatus.Internal default void upcall(MemoryAddress sourceMountOperation, int result) {
            run(org.gtk.gio.MountOperationResult.of(result));
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), Reply.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Emitted when the user has replied to the mount operation.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<MountOperation.Reply> onReply(MountOperation.Reply handler) {
        MemorySession SCOPE = MemorySession.openImplicit();
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("reply", SCOPE), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Functional interface declaration of the {@code ShowProcesses} callback.
     */
    @FunctionalInterface
    public interface ShowProcesses {
    
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
         * primary text in a {@code GtkMessageDialog}.
         */
        void run(java.lang.String message, PointerInteger processes, PointerString choices);
        
        @ApiStatus.Internal default void upcall(MemoryAddress sourceMountOperation, MemoryAddress message, MemoryAddress processes, MemoryAddress choices) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                run(Marshal.addressToString.marshal(message, null), new PointerInteger(processes), new PointerString(choices));
            }
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), ShowProcesses.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
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
     * primary text in a {@code GtkMessageDialog}.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<MountOperation.ShowProcesses> onShowProcesses(MountOperation.ShowProcesses handler) {
        MemorySession SCOPE = MemorySession.openImplicit();
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("show-processes", SCOPE), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Functional interface declaration of the {@code ShowUnmountProgress} callback.
     */
    @FunctionalInterface
    public interface ShowUnmountProgress {
    
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
         * primary text in a {@code GtkMessageDialog}.
         */
        void run(java.lang.String message, long timeLeft, long bytesLeft);
        
        @ApiStatus.Internal default void upcall(MemoryAddress sourceMountOperation, MemoryAddress message, long timeLeft, long bytesLeft) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                run(Marshal.addressToString.marshal(message, null), timeLeft, bytesLeft);
            }
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.C_LONG);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), ShowUnmountProgress.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
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
     * primary text in a {@code GtkMessageDialog}.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<MountOperation.ShowUnmountProgress> onShowUnmountProgress(MountOperation.ShowUnmountProgress handler) {
        MemorySession SCOPE = MemorySession.openImplicit();
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("show-unmount-progress", SCOPE), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * A {@link MountOperation.Builder} object constructs a {@link MountOperation} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link MountOperation.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a GObject with properties.
     */
    public static class Builder extends org.gtk.gobject.GObject.Builder {
        
        /**
         * Default constructor for a {@code Builder} object.
         */
        protected Builder() {
        }
        
        /**
         * Finish building the {@link MountOperation} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link MountOperation}.
         * @return A new instance of {@code MountOperation} with the properties 
         *         that were set in the Builder object.
         */
        public MountOperation build() {
            return (MountOperation) org.gtk.gobject.GObject.newWithProperties(
                MountOperation.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
        
        /**
         * Whether to use an anonymous user when authenticating.
         * @param anonymous The value for the {@code anonymous} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setAnonymous(boolean anonymous) {
            names.add("anonymous");
            values.add(org.gtk.gobject.Value.create(anonymous));
            return this;
        }
        
        /**
         * The index of the user's choice when a question is asked during the
         * mount operation. See the {@link MountOperation}::ask-question signal.
         * @param choice The value for the {@code choice} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setChoice(int choice) {
            names.add("choice");
            values.add(org.gtk.gobject.Value.create(choice));
            return this;
        }
        
        /**
         * The domain to use for the mount operation.
         * @param domain The value for the {@code domain} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setDomain(java.lang.String domain) {
            names.add("domain");
            values.add(org.gtk.gobject.Value.create(domain));
            return this;
        }
        
        /**
         * Whether the device to be unlocked is a TCRYPT hidden volume.
         * See <a href="https://www.veracrypt.fr/en/Hidden%20Volume.html">the VeraCrypt documentation</a>.
         * @param isTcryptHiddenVolume The value for the {@code is-tcrypt-hidden-volume} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setIsTcryptHiddenVolume(boolean isTcryptHiddenVolume) {
            names.add("is-tcrypt-hidden-volume");
            values.add(org.gtk.gobject.Value.create(isTcryptHiddenVolume));
            return this;
        }
        
        /**
         * Whether the device to be unlocked is a TCRYPT system volume.
         * In this context, a system volume is a volume with a bootloader
         * and operating system installed. This is only supported for Windows
         * operating systems. For further documentation, see
         * <a href="https://www.veracrypt.fr/en/System%20Encryption.html">the VeraCrypt documentation</a>.
         * @param isTcryptSystemVolume The value for the {@code is-tcrypt-system-volume} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setIsTcryptSystemVolume(boolean isTcryptSystemVolume) {
            names.add("is-tcrypt-system-volume");
            values.add(org.gtk.gobject.Value.create(isTcryptSystemVolume));
            return this;
        }
        
        /**
         * The password that is used for authentication when carrying out
         * the mount operation.
         * @param password The value for the {@code password} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setPassword(java.lang.String password) {
            names.add("password");
            values.add(org.gtk.gobject.Value.create(password));
            return this;
        }
        
        /**
         * Determines if and how the password information should be saved.
         * @param passwordSave The value for the {@code password-save} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setPasswordSave(org.gtk.gio.PasswordSave passwordSave) {
            names.add("password-save");
            values.add(org.gtk.gobject.Value.create(passwordSave));
            return this;
        }
        
        /**
         * The VeraCrypt PIM value, when unlocking a VeraCrypt volume. See
         * <a href="https://www.veracrypt.fr/en/Personal%20Iterations%20Multiplier%20(PIM">the VeraCrypt documentation</a>.html).
         * @param pim The value for the {@code pim} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setPim(int pim) {
            names.add("pim");
            values.add(org.gtk.gobject.Value.create(pim));
            return this;
        }
        
        /**
         * The user name that is used for authentication when carrying out
         * the mount operation.
         * @param username The value for the {@code username} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setUsername(java.lang.String username) {
            names.add("username");
            values.add(org.gtk.gobject.Value.create(username));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle g_mount_operation_new = Interop.downcallHandle(
                "g_mount_operation_new",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_mount_operation_get_anonymous = Interop.downcallHandle(
                "g_mount_operation_get_anonymous",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_mount_operation_get_choice = Interop.downcallHandle(
                "g_mount_operation_get_choice",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_mount_operation_get_domain = Interop.downcallHandle(
                "g_mount_operation_get_domain",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_mount_operation_get_is_tcrypt_hidden_volume = Interop.downcallHandle(
                "g_mount_operation_get_is_tcrypt_hidden_volume",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_mount_operation_get_is_tcrypt_system_volume = Interop.downcallHandle(
                "g_mount_operation_get_is_tcrypt_system_volume",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_mount_operation_get_password = Interop.downcallHandle(
                "g_mount_operation_get_password",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_mount_operation_get_password_save = Interop.downcallHandle(
                "g_mount_operation_get_password_save",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_mount_operation_get_pim = Interop.downcallHandle(
                "g_mount_operation_get_pim",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_mount_operation_get_username = Interop.downcallHandle(
                "g_mount_operation_get_username",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_mount_operation_reply = Interop.downcallHandle(
                "g_mount_operation_reply",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle g_mount_operation_set_anonymous = Interop.downcallHandle(
                "g_mount_operation_set_anonymous",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle g_mount_operation_set_choice = Interop.downcallHandle(
                "g_mount_operation_set_choice",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle g_mount_operation_set_domain = Interop.downcallHandle(
                "g_mount_operation_set_domain",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_mount_operation_set_is_tcrypt_hidden_volume = Interop.downcallHandle(
                "g_mount_operation_set_is_tcrypt_hidden_volume",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle g_mount_operation_set_is_tcrypt_system_volume = Interop.downcallHandle(
                "g_mount_operation_set_is_tcrypt_system_volume",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle g_mount_operation_set_password = Interop.downcallHandle(
                "g_mount_operation_set_password",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_mount_operation_set_password_save = Interop.downcallHandle(
                "g_mount_operation_set_password_save",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle g_mount_operation_set_pim = Interop.downcallHandle(
                "g_mount_operation_set_pim",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle g_mount_operation_set_username = Interop.downcallHandle(
                "g_mount_operation_set_username",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_mount_operation_get_type = Interop.downcallHandle(
                "g_mount_operation_get_type",
                FunctionDescriptor.of(Interop.valueLayout.C_LONG),
                false
        );
    }
    
    /**
     * Check whether the type is available on the runtime platform.
     * @return {@code true} when the type is available on the runtime platform
     */
    public static boolean isAvailable() {
        return DowncallHandles.g_mount_operation_get_type != null;
    }
}
