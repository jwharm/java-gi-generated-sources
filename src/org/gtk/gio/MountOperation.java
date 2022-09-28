package org.gtk.gio;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

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

    public MountOperation(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to MountOperation */
    public static MountOperation castFrom(org.gtk.gobject.Object gobject) {
        return new MountOperation(gobject.getReference());
    }
    
    private static Reference constructNew() {
        Reference RESULT = References.get(gtk_h.g_mount_operation_new(), true);
        return RESULT;
    }
    
    /**
     * Creates a new mount operation.
     */
    public MountOperation() {
        super(constructNew());
    }
    
    /**
     * Check to see whether the mount operation is being used
     * for an anonymous user.
     */
    public boolean getAnonymous() {
        var RESULT = gtk_h.g_mount_operation_get_anonymous(handle());
        return RESULT != 0;
    }
    
    /**
     * Gets a choice from the mount operation.
     */
    public int getChoice() {
        var RESULT = gtk_h.g_mount_operation_get_choice(handle());
        return RESULT;
    }
    
    /**
     * Gets the domain of the mount operation.
     */
    public java.lang.String getDomain() {
        var RESULT = gtk_h.g_mount_operation_get_domain(handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Check to see whether the mount operation is being used
     * for a TCRYPT hidden volume.
     */
    public boolean getIsTcryptHiddenVolume() {
        var RESULT = gtk_h.g_mount_operation_get_is_tcrypt_hidden_volume(handle());
        return RESULT != 0;
    }
    
    /**
     * Check to see whether the mount operation is being used
     * for a TCRYPT system volume.
     */
    public boolean getIsTcryptSystemVolume() {
        var RESULT = gtk_h.g_mount_operation_get_is_tcrypt_system_volume(handle());
        return RESULT != 0;
    }
    
    /**
     * Gets a password from the mount operation.
     */
    public java.lang.String getPassword() {
        var RESULT = gtk_h.g_mount_operation_get_password(handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Gets the state of saving passwords for the mount operation.
     */
    public PasswordSave getPasswordSave() {
        var RESULT = gtk_h.g_mount_operation_get_password_save(handle());
        return new PasswordSave(RESULT);
    }
    
    /**
     * Gets a PIM from the mount operation.
     */
    public int getPim() {
        var RESULT = gtk_h.g_mount_operation_get_pim(handle());
        return RESULT;
    }
    
    /**
     * Get the user name from the mount operation.
     */
    public java.lang.String getUsername() {
        var RESULT = gtk_h.g_mount_operation_get_username(handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Emits the {@link MountOperation}::reply signal.
     */
    public void reply(MountOperationResult result) {
        gtk_h.g_mount_operation_reply(handle(), result.getValue());
    }
    
    /**
     * Sets the mount operation to use an anonymous user if {@code anonymous} is {@code true}.
     */
    public void setAnonymous(boolean anonymous) {
        gtk_h.g_mount_operation_set_anonymous(handle(), anonymous ? 1 : 0);
    }
    
    /**
     * Sets a default choice for the mount operation.
     */
    public void setChoice(int choice) {
        gtk_h.g_mount_operation_set_choice(handle(), choice);
    }
    
    /**
     * Sets the mount operation's domain.
     */
    public void setDomain(java.lang.String domain) {
        gtk_h.g_mount_operation_set_domain(handle(), Interop.allocateNativeString(domain).handle());
    }
    
    /**
     * Sets the mount operation to use a hidden volume if {@code hidden_volume} is {@code true}.
     */
    public void setIsTcryptHiddenVolume(boolean hiddenVolume) {
        gtk_h.g_mount_operation_set_is_tcrypt_hidden_volume(handle(), hiddenVolume ? 1 : 0);
    }
    
    /**
     * Sets the mount operation to use a system volume if {@code system_volume} is {@code true}.
     */
    public void setIsTcryptSystemVolume(boolean systemVolume) {
        gtk_h.g_mount_operation_set_is_tcrypt_system_volume(handle(), systemVolume ? 1 : 0);
    }
    
    /**
     * Sets the mount operation's password to {@code password}.
     */
    public void setPassword(java.lang.String password) {
        gtk_h.g_mount_operation_set_password(handle(), Interop.allocateNativeString(password).handle());
    }
    
    /**
     * Sets the state of saving passwords for the mount operation.
     */
    public void setPasswordSave(PasswordSave save) {
        gtk_h.g_mount_operation_set_password_save(handle(), save.getValue());
    }
    
    /**
     * Sets the mount operation's PIM to {@code pim}.
     */
    public void setPim(int pim) {
        gtk_h.g_mount_operation_set_pim(handle(), pim);
    }
    
    /**
     * Sets the user name within {@code op} to {@code username}.
     */
    public void setUsername(java.lang.String username) {
        gtk_h.g_mount_operation_set_username(handle(), Interop.allocateNativeString(username).handle());
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
            var RESULT = gtk_h.g_signal_connect_data(
                handle(),
                Interop.allocateNativeString("aborted").handle(),
                Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(MountOperation.class, "__signalMountOperationAborted",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler.hashCode(), handler)),
                MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (IllegalAccessException | NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
    
    public static void __signalMountOperationAborted(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(ValueLayout.JAVA_INT, 0);
        var handler = (MountOperation.AbortedHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new MountOperation(References.get(source)));
    }
    
    @FunctionalInterface
    public interface AskPasswordHandler {
        void signalReceived(MountOperation source, java.lang.String message, java.lang.String defaultUser, java.lang.String defaultDomain, AskPasswordFlags flags);
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
            var RESULT = gtk_h.g_signal_connect_data(
                handle(),
                Interop.allocateNativeString("ask-password").handle(),
                Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(MountOperation.class, "__signalMountOperationAskPassword",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class, int.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler.hashCode(), handler)),
                MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (IllegalAccessException | NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
    
    public static void __signalMountOperationAskPassword(MemoryAddress source, MemoryAddress message, MemoryAddress defaultUser, MemoryAddress defaultDomain, int flags, MemoryAddress data) {
        int hash = data.get(ValueLayout.JAVA_INT, 0);
        var handler = (MountOperation.AskPasswordHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new MountOperation(References.get(source)), message.getUtf8String(0), defaultUser.getUtf8String(0), defaultDomain.getUtf8String(0), new AskPasswordFlags(flags));
    }
    
    @FunctionalInterface
    public interface AskQuestionHandler {
        void signalReceived(MountOperation source, java.lang.String message, PointerIterator<java.lang.String> choices);
    }
    
    /**
     * Emitted when asking the user a question and gives a list of
     * choices for the user to choose from.
     * <p>
     * If the message contains a line break, the first line should be
     * presented as a heading. For example, it may be used as the
     * primary text in a {@link org.gtk.gtk.MessageDialog}.
     */
    public SignalHandle onAskQuestion(AskQuestionHandler handler) {
        try {
            var RESULT = gtk_h.g_signal_connect_data(
                handle(),
                Interop.allocateNativeString("ask-question").handle(),
                Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(MountOperation.class, "__signalMountOperationAskQuestion",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler.hashCode(), handler)),
                MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (IllegalAccessException | NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
    
    public static void __signalMountOperationAskQuestion(MemoryAddress source, MemoryAddress message, MemoryAddress choices, MemoryAddress data) {
        int hash = data.get(ValueLayout.JAVA_INT, 0);
        var handler = (MountOperation.AskQuestionHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new MountOperation(References.get(source)), message.getUtf8String(0), new PointerString(choices).iterator());
    }
    
    @FunctionalInterface
    public interface ReplyHandler {
        void signalReceived(MountOperation source, MountOperationResult result);
    }
    
    /**
     * Emitted when the user has replied to the mount operation.
     */
    public SignalHandle onReply(ReplyHandler handler) {
        try {
            var RESULT = gtk_h.g_signal_connect_data(
                handle(),
                Interop.allocateNativeString("reply").handle(),
                Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(MountOperation.class, "__signalMountOperationReply",
                        MethodType.methodType(void.class, MemoryAddress.class, int.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler.hashCode(), handler)),
                MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (IllegalAccessException | NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
    
    public static void __signalMountOperationReply(MemoryAddress source, int result, MemoryAddress data) {
        int hash = data.get(ValueLayout.JAVA_INT, 0);
        var handler = (MountOperation.ReplyHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new MountOperation(References.get(source)), new MountOperationResult(result));
    }
    
    @FunctionalInterface
    public interface ShowProcessesHandler {
        void signalReceived(MountOperation source, java.lang.String message, PointerIterator<Integer> processes, PointerIterator<java.lang.String> choices);
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
     */
    public SignalHandle onShowProcesses(ShowProcessesHandler handler) {
        try {
            var RESULT = gtk_h.g_signal_connect_data(
                handle(),
                Interop.allocateNativeString("show-processes").handle(),
                Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(MountOperation.class, "__signalMountOperationShowProcesses",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler.hashCode(), handler)),
                MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (IllegalAccessException | NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
    
    public static void __signalMountOperationShowProcesses(MemoryAddress source, MemoryAddress message, MemoryAddress processes, MemoryAddress choices, MemoryAddress data) {
        int hash = data.get(ValueLayout.JAVA_INT, 0);
        var handler = (MountOperation.ShowProcessesHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new MountOperation(References.get(source)), message.getUtf8String(0), new PointerInteger(processes).iterator(), new PointerString(choices).iterator());
    }
    
    @FunctionalInterface
    public interface ShowUnmountProgressHandler {
        void signalReceived(MountOperation source, java.lang.String message, long timeLeft, long bytesLeft);
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
            var RESULT = gtk_h.g_signal_connect_data(
                handle(),
                Interop.allocateNativeString("show-unmount-progress").handle(),
                Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(MountOperation.class, "__signalMountOperationShowUnmountProgress",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, long.class, long.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler.hashCode(), handler)),
                MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (IllegalAccessException | NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
    
    public static void __signalMountOperationShowUnmountProgress(MemoryAddress source, MemoryAddress message, long timeLeft, long bytesLeft, MemoryAddress data) {
        int hash = data.get(ValueLayout.JAVA_INT, 0);
        var handler = (MountOperation.ShowUnmountProgressHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new MountOperation(References.get(source)), message.getUtf8String(0), timeLeft, bytesLeft);
    }
    
}
