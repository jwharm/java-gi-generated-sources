package org.gtk.glib;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Writer function for log entries. A log entry is a collection of one or more
 * {@code GLogFields}, using the standard [field names from journal
 * specification](https://www.freedesktop.org/software/systemd/man/systemd.journal-fields.html).
 * See g_log_structured() for more information.
 * <p>
 * Writer functions must ignore fields which they do not recognise, unless they
 * can write arbitrary binary output, as field values may be arbitrary binary.
 * <p>
 * {@code log_level} is guaranteed to be included in {@code fields} as the {@code PRIORITY} field,
 * but is provided separately for convenience of deciding whether or where to
 * output the log entry.
 * <p>
 * Writer functions should return {@link LogWriterOutput#HANDLED} if they handled the log
 * message successfully or if they deliberately ignored it. If there was an
 * error handling the message (for example, if the writer function is meant to
 * send messages to a remote logging server and there is a network error), it
 * should return {@link LogWriterOutput#UNHANDLED}. This allows writer functions to be
 * chained and fall back to simpler handlers in case of failure.
 * @version 2.50
 */
/**
 * Functional interface declaration of the {@code LogWriterFunc} callback.
 */
@FunctionalInterface
public interface LogWriterFunc {

    /**
     * Writer function for log entries. A log entry is a collection of one or more
     * {@code GLogFields}, using the standard [field names from journal
     * specification](https://www.freedesktop.org/software/systemd/man/systemd.journal-fields.html).
     * See g_log_structured() for more information.
     * <p>
     * Writer functions must ignore fields which they do not recognise, unless they
     * can write arbitrary binary output, as field values may be arbitrary binary.
     * <p>
     * {@code log_level} is guaranteed to be included in {@code fields} as the {@code PRIORITY} field,
     * but is provided separately for convenience of deciding whether or where to
     * output the log entry.
     * <p>
     * Writer functions should return {@link LogWriterOutput#HANDLED} if they handled the log
     * message successfully or if they deliberately ignored it. If there was an
     * error handling the message (for example, if the writer function is meant to
     * send messages to a remote logging server and there is a network error), it
     * should return {@link LogWriterOutput#UNHANDLED}. This allows writer functions to be
     * chained and fall back to simpler handlers in case of failure.
     * @version 2.50
     */
    org.gtk.glib.LogWriterOutput run(org.gtk.glib.LogLevelFlags logLevel, org.gtk.glib.LogField[] fields, long nFields);
    
    @ApiStatus.Internal default int upcall(int logLevel, MemoryAddress fields, long nFields, MemoryAddress userData) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = run(new org.gtk.glib.LogLevelFlags(logLevel), new PointerProxy<org.gtk.glib.LogField>(fields, org.gtk.glib.LogField.fromAddress).toArray((int) nFields, org.gtk.glib.LogField.class), nFields);
            return RESULT.getValue();
        }
    }
    
    /**
     * Describes the parameter types of the native callback function.
     */
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS);
    
    /**
     * The method handle for the callback.
     */
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), LogWriterFunc.class, DESCRIPTOR);
    
    /**
     * Creates a callback that can be called from native code and executes the {@code run} method.
     * @return the memory address of the callback function
     */
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
    }
}
