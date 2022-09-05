package org.gtk.gio;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * Completes partial file and directory names given a partial string by
 * looking in the file system for clues. Can return a list of possible
 * completion strings for widget implementations.
 */
public class FilenameCompleter extends org.gtk.gobject.Object {

    public FilenameCompleter(io.github.jwharm.javagi.interop.Proxy proxy) {
        super(proxy);
    }
    
    /** Cast object to FilenameCompleter */
    public static FilenameCompleter castFrom(org.gtk.gobject.Object gobject) {
        return new FilenameCompleter(gobject.getProxy());
    }
    
    /**
     * Creates a new filename completer.
     */
    public FilenameCompleter() {
        super(ProxyFactory.getProxy(io.github.jwharm.javagi.interop.jextract.gtk_h.g_filename_completer_new(), true));
    }
    
    /**
     * Obtains a completion for @initial_text from @completer.
     */
    public java.lang.String getCompletionSuffix(java.lang.String initialText) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_filename_completer_get_completion_suffix(HANDLE(), Interop.getAllocator().allocateUtf8String(initialText));
        return RESULT.getUtf8String(0);
    }
    
    /**
     * If @dirs_only is %TRUE, @completer will only
     * complete directory names, and not file names.
     */
    public void setDirsOnly(boolean dirsOnly) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_filename_completer_set_dirs_only(HANDLE(), dirsOnly ? 1 : 0);
    }
    
    @FunctionalInterface
    public interface GotCompletionDataHandler {
        void signalReceived(FilenameCompleter source);
    }
    
    /**
     * Emitted when the file name completion information comes available.
     */
    public void onGotCompletionData(GotCompletionDataHandler handler) {
        try {
            int hash = handler.hashCode();
            JVMCallbacks.signalRegistry.put(hash, handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalFilenameCompleterGotCompletionData", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            io.github.jwharm.javagi.interop.jextract.gtk_h.g_signal_connect_data(this.HANDLE(), Interop.getAllocator().allocateUtf8String("got-completion-data"), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
}
