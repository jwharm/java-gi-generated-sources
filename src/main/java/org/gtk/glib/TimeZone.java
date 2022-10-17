package org.gtk.glib;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@link TimeZone} is an opaque structure whose members cannot be accessed
 * directly.
 */
public class TimeZone extends io.github.jwharm.javagi.ResourceBase {

    public TimeZone(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    private static final MethodHandle g_time_zone_new_identifier = Interop.downcallHandle(
        "g_time_zone_new_identifier",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNewIdentifier(@Nullable java.lang.String identifier) {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) g_time_zone_new_identifier.invokeExact(Interop.allocateNativeString(identifier)), true);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a {@link TimeZone} corresponding to {@code identifier}. If {@code identifier} cannot be
     * parsed or loaded, {@code null} is returned.
     * <p>
     * {@code identifier} can either be an RFC3339/ISO 8601 time offset or
     * something that would pass as a valid value for the {@code TZ} environment
     * variable (including {@code null}).
     * <p>
     * In Windows, {@code identifier} can also be the unlocalized name of a time
     * zone for standard time, for example "Pacific Standard Time".
     * <p>
     * Valid RFC3339 time offsets are {@code "Z"} (for UTC) or
     * {@code "±hh:mm"}.  ISO 8601 additionally specifies
     * {@code "±hhmm"} and {@code "±hh"}.  Offsets are
     * time values to be added to Coordinated Universal Time (UTC) to get
     * the local time.
     * <p>
     * In UNIX, the {@code TZ} environment variable typically corresponds
     * to the name of a file in the zoneinfo database, an absolute path to a file
     * somewhere else, or a string in
     * "std offset [dst [offset],start[/time],end[/time]]" (POSIX) format.
     * There  are  no spaces in the specification. The name of standard
     * and daylight savings time zone must be three or more alphabetic
     * characters. Offsets are time values to be added to local time to
     * get Coordinated Universal Time (UTC) and should be
     * {@code "[±]hh[[:]mm[:ss]]"}.  Dates are either
     * {@code "Jn"} (Julian day with n between 1 and 365, leap
     * years not counted), {@code "n"} (zero-based Julian day
     * with n between 0 and 365) or {@code "Mm.w.d"} (day d
     * (0 <= d <= 6) of week w (1 <= w <= 5) of month m (1 <= m <= 12), day
     * 0 is a Sunday).  Times are in local wall clock time, the default is
     * 02:00:00.
     * <p>
     * In Windows, the "tzn[+|–]hh[:mm[:ss]][dzn]" format is used, but also
     * accepts POSIX format.  The Windows format uses US rules for all time
     * zones; daylight savings time is 60 minutes behind the standard time
     * with date and time of change taken from Pacific Standard Time.
     * Offsets are time values to be added to the local time to get
     * Coordinated Universal Time (UTC).
     * <p>
     * g_time_zone_new_local() calls this function with the value of the
     * {@code TZ} environment variable. This function itself is independent of
     * the value of {@code TZ}, but if {@code identifier} is {@code null} then {@code /etc/localtime}
     * will be consulted to discover the correct time zone on UNIX and the
     * registry will be consulted or GetTimeZoneInformation() will be used
     * to get the local time zone on Windows.
     * <p>
     * If intervals are not available, only time zone rules from {@code TZ}
     * environment variable or other means, then they will be computed
     * from year 1900 to 2037.  If the maximum year for the rules is
     * available and it is greater than 2037, then it will followed
     * instead.
     * <p>
     * See
     * <a href="http://tools.ietf.org/html/rfc3339#section-5.6">RFC3339 §5.6</a>
     * for a precise definition of valid RFC3339 time offsets
     * (the {@code time-offset} expansion) and ISO 8601 for the
     * full list of valid time offsets.  See
     * <a href="http://www.gnu.org/s/libc/manual/html_node/TZ-Variable.html">The GNU C Library manual</a>
     * for an explanation of the possible
     * values of the {@code TZ} environment variable. See
     * <a href="http://msdn.microsoft.com/en-us/library/ms912391%28v=winembedded.11%29.aspx">Microsoft Time Zone Index Values</a>
     * for the list of time zones on Windows.
     * <p>
     * You should release the return value by calling g_time_zone_unref()
     * when you are done with it.
     */
    public static TimeZone newIdentifier(@Nullable java.lang.String identifier) {
        return new TimeZone(constructNewIdentifier(identifier));
    }
    
    private static final MethodHandle g_time_zone_new_local = Interop.downcallHandle(
        "g_time_zone_new_local",
        FunctionDescriptor.of(ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNewLocal() {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) g_time_zone_new_local.invokeExact(), true);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a {@link TimeZone} corresponding to local time.  The local time
     * zone may change between invocations to this function; for example,
     * if the system administrator changes it.
     * <p>
     * This is equivalent to calling g_time_zone_new() with the value of
     * the {@code TZ} environment variable (including the possibility of {@code null}).
     * <p>
     * You should release the return value by calling g_time_zone_unref()
     * when you are done with it.
     */
    public static TimeZone newLocal() {
        return new TimeZone(constructNewLocal());
    }
    
    private static final MethodHandle g_time_zone_new_offset = Interop.downcallHandle(
        "g_time_zone_new_offset",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    private static Refcounted constructNewOffset(@NotNull int seconds) {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) g_time_zone_new_offset.invokeExact(seconds), true);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a {@link TimeZone} corresponding to the given constant offset from UTC,
     * in seconds.
     * <p>
     * This is equivalent to calling g_time_zone_new() with a string in the form
     * {@code [+|-]hh[:mm[:ss]]}.
     */
    public static TimeZone newOffset(@NotNull int seconds) {
        return new TimeZone(constructNewOffset(seconds));
    }
    
    private static final MethodHandle g_time_zone_new_utc = Interop.downcallHandle(
        "g_time_zone_new_utc",
        FunctionDescriptor.of(ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNewUtc() {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) g_time_zone_new_utc.invokeExact(), true);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a {@link TimeZone} corresponding to UTC.
     * <p>
     * This is equivalent to calling g_time_zone_new() with a value like
     * "Z", "UTC", "+00", etc.
     * <p>
     * You should release the return value by calling g_time_zone_unref()
     * when you are done with it.
     */
    public static TimeZone newUtc() {
        return new TimeZone(constructNewUtc());
    }
    
    private static final MethodHandle g_time_zone_adjust_time = Interop.downcallHandle(
        "g_time_zone_adjust_time",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Finds an interval within {@code tz} that corresponds to the given {@code time_},
     * possibly adjusting {@code time_} if required to fit into an interval.
     * The meaning of {@code time_} depends on {@code type}.
     * <p>
     * This function is similar to g_time_zone_find_interval(), with the
     * difference that it always succeeds (by making the adjustments
     * described below).
     * <p>
     * In any of the cases where g_time_zone_find_interval() succeeds then
     * this function returns the same value, without modifying {@code time_}.
     * <p>
     * This function may, however, modify {@code time_} in order to deal with
     * non-existent times.  If the non-existent local {@code time_} of 02:30 were
     * requested on March 14th 2010 in Toronto then this function would
     * adjust {@code time_} to be 03:00 and return the interval containing the
     * adjusted time.
     */
    public int adjustTime(@NotNull TimeType type, @NotNull PointerLong time) {
        int RESULT;
        try {
            RESULT = (int) g_time_zone_adjust_time.invokeExact(handle(), type.getValue(), time.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static final MethodHandle g_time_zone_find_interval = Interop.downcallHandle(
        "g_time_zone_find_interval",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG)
    );
    
    /**
     * Finds an interval within {@code tz} that corresponds to the given {@code time_}.
     * The meaning of {@code time_} depends on {@code type}.
     * <p>
     * If {@code type} is {@link TimeType#UNIVERSAL} then this function will always
     * succeed (since universal time is monotonic and continuous).
     * <p>
     * Otherwise {@code time_} is treated as local time.  The distinction between
     * {@link TimeType#STANDARD} and {@link TimeType#DAYLIGHT} is ignored except in
     * the case that the given {@code time_} is ambiguous.  In Toronto, for example,
     * 01:30 on November 7th 2010 occurred twice (once inside of daylight
     * savings time and the next, an hour later, outside of daylight savings
     * time).  In this case, the different value of {@code type} would result in a
     * different interval being returned.
     * <p>
     * It is still possible for this function to fail.  In Toronto, for
     * example, 02:00 on March 14th 2010 does not exist (due to the leap
     * forward to begin daylight savings time).  -1 is returned in that
     * case.
     */
    public int findInterval(@NotNull TimeType type, @NotNull long time) {
        int RESULT;
        try {
            RESULT = (int) g_time_zone_find_interval.invokeExact(handle(), type.getValue(), time);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static final MethodHandle g_time_zone_get_abbreviation = Interop.downcallHandle(
        "g_time_zone_get_abbreviation",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Determines the time zone abbreviation to be used during a particular
     * {@code interval} of time in the time zone {@code tz}.
     * <p>
     * For example, in Toronto this is currently "EST" during the winter
     * months and "EDT" during the summer months when daylight savings time
     * is in effect.
     */
    public @NotNull java.lang.String getAbbreviation(@NotNull int interval) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_time_zone_get_abbreviation.invokeExact(handle(), interval);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT.getUtf8String(0);
    }
    
    private static final MethodHandle g_time_zone_get_identifier = Interop.downcallHandle(
        "g_time_zone_get_identifier",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Get the identifier of this {@link TimeZone}, as passed to g_time_zone_new().
     * If the identifier passed at construction time was not recognised, {@code UTC} will
     * be returned. If it was {@code null}, the identifier of the local timezone at
     * construction time will be returned.
     * <p>
     * The identifier will be returned in the same format as provided at
     * construction time: if provided as a time offset, that will be returned by
     * this function.
     */
    public @NotNull java.lang.String getIdentifier() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_time_zone_get_identifier.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT.getUtf8String(0);
    }
    
    private static final MethodHandle g_time_zone_get_offset = Interop.downcallHandle(
        "g_time_zone_get_offset",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Determines the offset to UTC in effect during a particular {@code interval}
     * of time in the time zone {@code tz}.
     * <p>
     * The offset is the number of seconds that you add to UTC time to
     * arrive at local time for {@code tz} (ie: negative numbers for time zones
     * west of GMT, positive numbers for east).
     */
    public int getOffset(@NotNull int interval) {
        int RESULT;
        try {
            RESULT = (int) g_time_zone_get_offset.invokeExact(handle(), interval);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static final MethodHandle g_time_zone_is_dst = Interop.downcallHandle(
        "g_time_zone_is_dst",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Determines if daylight savings time is in effect during a particular
     * {@code interval} of time in the time zone {@code tz}.
     */
    public boolean isDst(@NotNull int interval) {
        int RESULT;
        try {
            RESULT = (int) g_time_zone_is_dst.invokeExact(handle(), interval);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    private static final MethodHandle g_time_zone_ref = Interop.downcallHandle(
        "g_time_zone_ref",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Increases the reference count on {@code tz}.
     */
    public @NotNull TimeZone ref() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_time_zone_ref.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new TimeZone(Refcounted.get(RESULT, true));
    }
    
    private static final MethodHandle g_time_zone_unref = Interop.downcallHandle(
        "g_time_zone_unref",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Decreases the reference count on {@code tz}.
     */
    public @NotNull void unref() {
        try {
            g_time_zone_unref.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
}
