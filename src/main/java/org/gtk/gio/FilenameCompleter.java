package org.gtk.gio;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
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
     * Gets an array of completion strings for a given initial text.
     */
    public PointerIterator<java.lang.String> getCompletions(java.lang.String initialText) {
        var RESULT = gtk_h.g_filename_completer_get_completions(handle(), Interop.allocateNativeString(initialText).handle());
        return new PointerString(RESULT).iterator();
    }
    
    /**
     * If {@code dirs_only} is {@code true}, {@code completer} will only
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
            var RESULT = gtk_h.g_signal_connect_data(
                handle(),
                Interop.allocateNativeString("got-completion-data").handle(),
                Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(FilenameCompleter.Callbacks.class, "signalFilenameCompleterGotCompletionData",
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
    
    public static class Callbacks {
    
        public static void signalFilenameCompleterGotCompletionData(MemoryAddress source, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (FilenameCompleter.GotCompletionDataHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new FilenameCompleter(References.get(source)));
        }
        
    }
}
