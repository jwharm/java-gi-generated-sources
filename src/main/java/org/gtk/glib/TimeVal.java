package org.gtk.glib;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Represents a precise time, with seconds and microseconds.
 * <p>
 * Similar to the struct timeval returned by the {@code gettimeofday()}
 * UNIX system call.
 * <p>
 * GLib is attempting to unify around the use of 64-bit integers to
 * represent microsecond-precision time. As such, this type will be
 * removed from a future version of GLib. A consequence of using {@code glong} for
 * {@code tv_sec} is that on 32-bit systems {@code GTimeVal} is subject to the year 2038
 * problem.
 */
public class TimeVal extends io.github.jwharm.javagi.ProxyBase {
    
    static {
        GLib.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GTimeVal";
    
    private static GroupLayout memoryLayout = MemoryLayout.structLayout(
        ValueLayout.JAVA_LONG.withName("tv_sec"),
        ValueLayout.JAVA_LONG.withName("tv_usec")
    ).withName(C_TYPE_NAME);
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    private MemorySegment allocatedMemorySegment;
    
    public static TimeVal allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        TimeVal newInstance = new TimeVal(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code tv_sec}
     * @return The value of the field {@code tv_sec}
     */
    public long tv_sec$get() {
        var RESULT = (long) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("tv_sec"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code tv_sec}
     * @param tv_sec The new value of the field {@code tv_sec}
     */
    public void tv_sec$set(long tv_sec) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("tv_sec"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), tv_sec);
    }
    
    /**
     * Get the value of the field {@code tv_usec}
     * @return The value of the field {@code tv_usec}
     */
    public long tv_usec$get() {
        var RESULT = (long) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("tv_usec"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code tv_usec}
     * @param tv_usec The new value of the field {@code tv_usec}
     */
    public void tv_usec$set(long tv_usec) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("tv_usec"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), tv_usec);
    }
    
    /**
     * Create a TimeVal proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public TimeVal(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Adds the given number of microseconds to {@code time_}. {@code microseconds} can
     * also be negative to decrease the value of {@code time_}.
     * @param microseconds number of microseconds to add to {@code time}
     * @deprecated {@link TimeVal} is not year-2038-safe. Use {@code guint64} for
     *    representing microseconds since the epoch, or use {@link DateTime}.
     */
    @Deprecated
    public void add(long microseconds) {
        try {
            DowncallHandles.g_time_val_add.invokeExact(
                    handle(),
                    microseconds);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Converts {@code time_} into an RFC 3339 encoded string, relative to the
     * Coordinated Universal Time (UTC). This is one of the many formats
     * allowed by ISO 8601.
     * <p>
     * ISO 8601 allows a large number of date/time formats, with or without
     * punctuation and optional elements. The format returned by this function
     * is a complete date and time, with optional punctuation included, the
     * UTC time zone represented as "Z", and the {@code tv_usec} part included if
     * and only if it is nonzero, i.e. either
     * "YYYY-MM-DDTHH:MM:SSZ" or "YYYY-MM-DDTHH:MM:SS.fffffZ".
     * <p>
     * This corresponds to the Internet date/time format defined by
     * <a href="https://www.ietf.org/rfc/rfc3339.txt">RFC 3339</a>,
     * and to either of the two most-precise formats defined by
     * the W3C Note
     * <a href="http://www.w3.org/TR/NOTE-datetime-19980827">Date and Time Formats</a>.
     * Both of these documents are profiles of ISO 8601.
     * <p>
     * Use g_date_time_format() or g_strdup_printf() if a different
     * variation of ISO 8601 format is required.
     * <p>
     * If {@code time_} represents a date which is too large to fit into a {@code struct tm},
     * {@code null} will be returned. This is platform dependent. Note also that since
     * {@code GTimeVal} stores the number of seconds as a {@code glong}, on 32-bit systems it
     * is subject to the year 2038 problem. Accordingly, since GLib 2.62, this
     * function has been deprecated. Equivalent functionality is available using:
     * <pre>{@code 
     * GDateTime *dt = g_date_time_new_from_unix_utc (time_val);
     * iso8601_string = g_date_time_format_iso8601 (dt);
     * g_date_time_unref (dt);
     * }</pre>
     * <p>
     * The return value of g_time_val_to_iso8601() has been nullable since GLib
     * 2.54; before then, GLib would crash under the same conditions.
     * @return a newly allocated string containing an ISO 8601 date,
     *    or {@code null} if {@code time_} was too large
     * @deprecated {@link TimeVal} is not year-2038-safe. Use
     *    g_date_time_format_iso8601(dt) instead.
     */
    @Deprecated
    public @Nullable java.lang.String toIso8601() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_time_val_to_iso8601.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Converts a string containing an ISO 8601 encoded date and time
     * to a {@link TimeVal} and puts it into {@code time_}.
     * <p>
     * {@code iso_date} must include year, month, day, hours, minutes, and
     * seconds. It can optionally include fractions of a second and a time
     * zone indicator. (In the absence of any time zone indication, the
     * timestamp is assumed to be in local time.)
     * <p>
     * Any leading or trailing space in {@code iso_date} is ignored.
     * <p>
     * This function was deprecated, along with {@link TimeVal} itself, in GLib 2.62.
     * Equivalent functionality is available using code like:
     * <pre>{@code 
     * GDateTime *dt = g_date_time_new_from_iso8601 (iso8601_string, NULL);
     * gint64 time_val = g_date_time_to_unix (dt);
     * g_date_time_unref (dt);
     * }</pre>
     * @param isoDate an ISO 8601 encoded date string
     * @param time a {@link TimeVal}
     * @return {@code true} if the conversion was successful.
     * @deprecated {@link TimeVal} is not year-2038-safe. Use
     *    g_date_time_new_from_iso8601() instead.
     */
    @Deprecated
    public static boolean fromIso8601(@NotNull java.lang.String isoDate, @NotNull org.gtk.glib.TimeVal time) {
        java.util.Objects.requireNonNull(isoDate, "Parameter 'isoDate' must not be null");
        java.util.Objects.requireNonNull(time, "Parameter 'time' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_time_val_from_iso8601.invokeExact(
                    Interop.allocateNativeString(isoDate),
                    time.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle g_time_val_add = Interop.downcallHandle(
            "g_time_val_add",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG),
            false
        );
        
        private static final MethodHandle g_time_val_to_iso8601 = Interop.downcallHandle(
            "g_time_val_to_iso8601",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_time_val_from_iso8601 = Interop.downcallHandle(
            "g_time_val_from_iso8601",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
    }
}
