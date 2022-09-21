package org.gtk.gio;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * Completes partial file and directory names given a partial string by
 * looking in the file system for clues. Can return a list of possible
 * completion strings for widget implementations.
 */
public class FilenameCompleter extends org.gtk.gobject.Object {

    public FilenameCompleter(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to FilenameCompleter */
    public static FilenameCompleter castFrom(org.gtk.gobject.Object gobject) {
        return new FilenameCompleter(gobject.getReference());
    }
    
    private static Reference constructNew() {
        Reference RESULT = References.get(gtk_h.g_filename_completer_new(), true);
        return RESULT;
    }
    
    /**
     * Creates a new filename completer.
     */
    public FilenameCompleter() {
        super(constructNew());
    }
    
    /**
     * Obtains a completion for {@code initial_text} from {@code completer}.
     */
    public java.lang.String getCompletionSuffix(java.lang.String initialText) {
        var RESULT = gtk_h.g_filename_completer_get_completion_suffix(handle(), Interop.allocateNativeString(initialText).handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * If {@code dirs_only} is <code>true</code>, {@code completer} will only
     * complete directory names, and not file names.
     */
    public void setDirsOnly(boolean dirsOnly) {
        gtk_h.g_filename_completer_set_dirs_only(handle(), dirsOnly ? 1 : 0);
    }
    
    @FunctionalInterface
    public interface GotCompletionDataHandler {
        void signalReceived(FilenameCompleter source);
    }
    
    /**
     * Emitted when the file name completion information comes available.
     */
    public SignalHandle onGotCompletionData(GotCompletionDataHandler handler) {
        try {
            int hash = Interop.registerCallback(handler.hashCode(), handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalFilenameCompleterGotCompletionData", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            long handlerId = gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("got-completion-data").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), handlerId);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
}
