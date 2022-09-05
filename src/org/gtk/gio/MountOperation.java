package org.gtk.gio;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * #GMountOperation provides a mechanism for interacting with the user.
 * It can be used for authenticating mountable operations, such as loop
 * mounting files, hard drive partitions or server locations. It can
 * also be used to ask the user questions or show a list of applications
 * preventing unmount or eject operations from completing.
 * 
 * Note that #GMountOperation is used for more than just #GMount
 * objects – for example it is also used in g_drive_start() and
 * g_drive_stop().
 * 
 * Users should instantiate a subclass of this that implements all the
 * various callbacks to show the required dialogs, such as
 * #GtkMountOperation. If no user interaction is desired (for example
 * when automounting filesystems at login time), usually %NULL can be
 * passed, see each method taking a #GMountOperation for details.
 * 
 * The term ‘TCRYPT’ is used to mean ‘compatible with TrueCrypt and VeraCrypt’.
 * [TrueCrypt](https://en.wikipedia.org/wiki/TrueCrypt) is a discontinued system for
 * encrypting file containers, partitions or whole disks, typically used with Windows.
 * [VeraCrypt](https://www.veracrypt.fr/) is a maintained fork of TrueCrypt with various
 * improvements and auditing fixes.
 */
public class MountOperation extends org.gtk.gobject.Object {

    public MountOperation(io.github.jwharm.javagi.interop.Proxy proxy) {
        super(proxy);
    }
    
    /** Cast object to MountOperation */
    public static MountOperation castFrom(org.gtk.gobject.Object gobject) {
        return new MountOperation(gobject.getProxy());
    }
    
    /**
     * Creates a new mount operation.
     */
    public MountOperation() {
        super(ProxyFactory.getProxy(io.github.jwharm.javagi.interop.jextract.gtk_h.g_mount_operation_new(), true));
    }
    
    /**
     * Check to see whether the mount operation is being used
     * for an anonymous user.
     */
    public boolean getAnonymous() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_mount_operation_get_anonymous(HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Gets a choice from the mount operation.
     */
    public int getChoice() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_mount_operation_get_choice(HANDLE());
        return RESULT;
    }
    
    /**
     * Gets the domain of the mount operation.
     */
    public java.lang.String getDomain() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_mount_operation_get_domain(HANDLE());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Check to see whether the mount operation is being used
     * for a TCRYPT hidden volume.
     */
    public boolean getIsTcryptHiddenVolume() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_mount_operation_get_is_tcrypt_hidden_volume(HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Check to see whether the mount operation is being used
     * for a TCRYPT system volume.
     */
    public boolean getIsTcryptSystemVolume() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_mount_operation_get_is_tcrypt_system_volume(HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Gets a password from the mount operation.
     */
    public java.lang.String getPassword() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_mount_operation_get_password(HANDLE());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Gets the state of saving passwords for the mount operation.
     */
    public PasswordSave getPasswordSave() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_mount_operation_get_password_save(HANDLE());
        return PasswordSave.fromValue(RESULT);
    }
    
    /**
     * Gets a PIM from the mount operation.
     */
    public int getPim() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_mount_operation_get_pim(HANDLE());
        return RESULT;
    }
    
    /**
     * Get the user name from the mount operation.
     */
    public java.lang.String getUsername() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_mount_operation_get_username(HANDLE());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Emits the #GMountOperation::reply signal.
     */
    public void reply(MountOperationResult result) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_mount_operation_reply(HANDLE(), result.getValue());
    }
    
    /**
     * Sets the mount operation to use an anonymous user if @anonymous is %TRUE.
     */
    public void setAnonymous(boolean anonymous) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_mount_operation_set_anonymous(HANDLE(), anonymous ? 1 : 0);
    }
    
    /**
     * Sets a default choice for the mount operation.
     */
    public void setChoice(int choice) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_mount_operation_set_choice(HANDLE(), choice);
    }
    
    /**
     * Sets the mount operation's domain.
     */
    public void setDomain(java.lang.String domain) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_mount_operation_set_domain(HANDLE(), Interop.getAllocator().allocateUtf8String(domain));
    }
    
    /**
     * Sets the mount operation to use a hidden volume if @hidden_volume is %TRUE.
     */
    public void setIsTcryptHiddenVolume(boolean hiddenVolume) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_mount_operation_set_is_tcrypt_hidden_volume(HANDLE(), hiddenVolume ? 1 : 0);
    }
    
    /**
     * Sets the mount operation to use a system volume if @system_volume is %TRUE.
     */
    public void setIsTcryptSystemVolume(boolean systemVolume) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_mount_operation_set_is_tcrypt_system_volume(HANDLE(), systemVolume ? 1 : 0);
    }
    
    /**
     * Sets the mount operation's password to @password.
     */
    public void setPassword(java.lang.String password) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_mount_operation_set_password(HANDLE(), Interop.getAllocator().allocateUtf8String(password));
    }
    
    /**
     * Sets the state of saving passwords for the mount operation.
     */
    public void setPasswordSave(PasswordSave save) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_mount_operation_set_password_save(HANDLE(), save.getValue());
    }
    
    /**
     * Sets the mount operation's PIM to @pim.
     */
    public void setPim(int pim) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_mount_operation_set_pim(HANDLE(), pim);
    }
    
    /**
     * Sets the user name within @op to @username.
     */
    public void setUsername(java.lang.String username) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_mount_operation_set_username(HANDLE(), Interop.getAllocator().allocateUtf8String(username));
    }
    
    @FunctionalInterface
    public interface AbortedHandler {
        void signalReceived(MountOperation source);
    }
    
    /**
     * Emitted by the backend when e.g. a device becomes unavailable
     * while a mount operation is in progress.
     * 
     * Implementations of GMountOperation should handle this signal
     * by dismissing open password dialogs.
     */
    public void onAborted(AbortedHandler handler) {
        try {
            int hash = handler.hashCode();
            JVMCallbacks.signalRegistry.put(hash, handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalMountOperationAborted", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            io.github.jwharm.javagi.interop.jextract.gtk_h.g_signal_connect_data(this.HANDLE(), Interop.getAllocator().allocateUtf8String("aborted"), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    @FunctionalInterface
    public interface AskPasswordHandler {
        void signalReceived(MountOperation source, java.lang.String message, java.lang.String defaultUser, java.lang.String defaultDomain, int flags);
    }
    
    /**
     * Emitted when a mount operation asks the user for a password.
     * 
     * If the message contains a line break, the first line should be
     * presented as a heading. For example, it may be used as the
     * primary text in a #GtkMessageDialog.
     */
    public void onAskPassword(AskPasswordHandler handler) {
        try {
            int hash = handler.hashCode();
            JVMCallbacks.signalRegistry.put(hash, handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class, int.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalMountOperationAskPassword", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            io.github.jwharm.javagi.interop.jextract.gtk_h.g_signal_connect_data(this.HANDLE(), Interop.getAllocator().allocateUtf8String("ask-password"), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    @FunctionalInterface
    public interface AskQuestionHandler {
        void signalReceived(MountOperation source, java.lang.String message, java.lang.String[] choices);
    }
    
    /**
     * Emitted when asking the user a question and gives a list of
     * choices for the user to choose from.
     * 
     * If the message contains a line break, the first line should be
     * presented as a heading. For example, it may be used as the
     * primary text in a #GtkMessageDialog.
     */
    public void onAskQuestion(AskQuestionHandler handler) {
        try {
            int hash = handler.hashCode();
            JVMCallbacks.signalRegistry.put(hash, handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalMountOperationAskQuestion", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            io.github.jwharm.javagi.interop.jextract.gtk_h.g_signal_connect_data(this.HANDLE(), Interop.getAllocator().allocateUtf8String("ask-question"), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    @FunctionalInterface
    public interface ReplyHandler {
        void signalReceived(MountOperation source, MountOperationResult result);
    }
    
    /**
     * Emitted when the user has replied to the mount operation.
     */
    public void onReply(ReplyHandler handler) {
        try {
            int hash = handler.hashCode();
            JVMCallbacks.signalRegistry.put(hash, handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, int.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalMountOperationReply", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            io.github.jwharm.javagi.interop.jextract.gtk_h.g_signal_connect_data(this.HANDLE(), Interop.getAllocator().allocateUtf8String("reply"), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    @FunctionalInterface
    public interface ShowProcessesHandler {
        void signalReceived(MountOperation source, java.lang.String message, org.gtk.glib.Pid[] processes, java.lang.String[] choices);
    }
    
    /**
     * Emitted when one or more processes are blocking an operation
     * e.g. unmounting/ejecting a #GMount or stopping a #GDrive.
     * 
     * Note that this signal may be emitted several times to update the
     * list of blocking processes as processes close files. The
     * application should only respond with g_mount_operation_reply() to
     * the latest signal (setting #GMountOperation:choice to the choice
     * the user made).
     * 
     * If the message contains a line break, the first line should be
     * presented as a heading. For example, it may be used as the
     * primary text in a #GtkMessageDialog.
     */
    public void onShowProcesses(ShowProcessesHandler handler) {
        try {
            int hash = handler.hashCode();
            JVMCallbacks.signalRegistry.put(hash, handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalMountOperationShowProcesses", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            io.github.jwharm.javagi.interop.jextract.gtk_h.g_signal_connect_data(this.HANDLE(), Interop.getAllocator().allocateUtf8String("show-processes"), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    @FunctionalInterface
    public interface ShowUnmountProgressHandler {
        void signalReceived(MountOperation source, java.lang.String message, long timeLeft, long bytesLeft);
    }
    
    /**
     * Emitted when an unmount operation has been busy for more than some time
     * (typically 1.5 seconds).
     * 
     * When unmounting or ejecting a volume, the kernel might need to flush
     * pending data in its buffers to the volume stable storage, and this operation
     * can take a considerable amount of time. This signal may be emitted several
     * times as long as the unmount operation is outstanding, and then one
     * last time when the operation is completed, with @bytes_left set to zero.
     * 
     * Implementations of GMountOperation should handle this signal by
     * showing an UI notification, and then dismiss it, or show another notification
     * of completion, when @bytes_left reaches zero.
     * 
     * If the message contains a line break, the first line should be
     * presented as a heading. For example, it may be used as the
     * primary text in a #GtkMessageDialog.
     */
    public void onShowUnmountProgress(ShowUnmountProgressHandler handler) {
        try {
            int hash = handler.hashCode();
            JVMCallbacks.signalRegistry.put(hash, handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, long.class, long.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalMountOperationShowUnmountProgress", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            io.github.jwharm.javagi.interop.jextract.gtk_h.g_signal_connect_data(this.HANDLE(), Interop.getAllocator().allocateUtf8String("show-unmount-progress"), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
}