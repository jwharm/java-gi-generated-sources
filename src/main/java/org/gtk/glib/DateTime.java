package org.gtk.glib;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * An opaque structure that represents a date and time, including a time zone.
 * @version 2.26
 */
public class DateTime extends Struct {
    
    static {
        GLib.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GDateTime";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link DateTime}
     * @return A new, uninitialized @{link DateTime}
     */
    public static DateTime allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        DateTime newInstance = new DateTime(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a DateTime proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected DateTime(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, DateTime> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new DateTime(input, ownership);
    
    private static MemoryAddress constructNew(org.gtk.glib.TimeZone tz, int year, int month, int day, int hour, int minute, double seconds) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_date_time_new.invokeExact(
                    tz.handle(),
                    year,
                    month,
                    day,
                    hour,
                    minute,
                    seconds);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new {@link DateTime} corresponding to the given date and time in
     * the time zone {@code tz}.
     * <p>
     * The {@code year} must be between 1 and 9999, {@code month} between 1 and 12 and {@code day}
     * between 1 and 28, 29, 30 or 31 depending on the month and the year.
     * <p>
     * {@code hour} must be between 0 and 23 and {@code minute} must be between 0 and 59.
     * <p>
     * {@code seconds} must be at least 0.0 and must be strictly less than 60.0.
     * It will be rounded down to the nearest microsecond.
     * <p>
     * If the given time is not representable in the given time zone (for
     * example, 02:30 on March 14th 2010 in Toronto, due to daylight savings
     * time) then the time will be rounded up to the nearest existing time
     * (in this case, 03:00).  If this matters to you then you should verify
     * the return value for containing the same as the numbers you gave.
     * <p>
     * In the case that the given time is ambiguous in the given time zone
     * (for example, 01:30 on November 7th 2010 in Toronto, due to daylight
     * savings time) then the time falling within standard (ie:
     * non-daylight) time is taken.
     * <p>
     * It not considered a programmer error for the values to this function
     * to be out of range, but in the case that they are, the function will
     * return {@code null}.
     * <p>
     * You should release the return value by calling g_date_time_unref()
     * when you are done with it.
     * @param tz a {@link TimeZone}
     * @param year the year component of the date
     * @param month the month component of the date
     * @param day the day component of the date
     * @param hour the hour component of the date
     * @param minute the minute component of the date
     * @param seconds the number of seconds past the minute
     */
    public DateTime(org.gtk.glib.TimeZone tz, int year, int month, int day, int hour, int minute, double seconds) {
        super(constructNew(tz, year, month, day, hour, minute, seconds), Ownership.FULL);
    }
    
    private static MemoryAddress constructNewFromIso8601(java.lang.String text, @Nullable org.gtk.glib.TimeZone defaultTz) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_date_time_new_from_iso8601.invokeExact(
                    Marshal.stringToAddress.marshal(text, null),
                    (Addressable) (defaultTz == null ? MemoryAddress.NULL : defaultTz.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a {@link DateTime} corresponding to the given
     * <a href="https://en.wikipedia.org/wiki/ISO_8601">ISO 8601 formatted string</a>
     * {@code text}. ISO 8601 strings of the form &lt;date&gt;&lt;sep&gt;&lt;time&gt;&lt;tz&gt; are supported, with
     * some extensions from <a href="https://tools.ietf.org/html/rfc3339">RFC 3339</a> as
     * mentioned below.
     * <p>
     * Note that as {@link DateTime} "is oblivious to leap seconds", leap seconds information
     * in an ISO-8601 string will be ignored, so a {@code 23:59:60} time would be parsed as
     * {@code 23:59:59}.
     * <p>
     * &lt;sep&gt; is the separator and can be either 'T', 't' or ' '. The latter two
     * separators are an extension from
     * <a href="https://tools.ietf.org/html/rfc3339#section-5.6">RFC 3339</a>.
     * <p>
     * &lt;date&gt; is in the form:
     * <ul>
     * <li>{@code YYYY-MM-DD} - Year/month/day, e.g. 2016-08-24.
     * <li>{@code YYYYMMDD} - Same as above without dividers.
     * <li>{@code YYYY-DDD} - Ordinal day where DDD is from 001 to 366, e.g. 2016-237.
     * <li>{@code YYYYDDD} - Same as above without dividers.
     * <li>{@code YYYY-Www-D} - Week day where ww is from 01 to 52 and D from 1-7,
     *   e.g. 2016-W34-3.
     * <li>{@code YYYYWwwD} - Same as above without dividers.
     * </ul>
     * <p>
     * &lt;time&gt; is in the form:
     * <ul>
     * <li>{@code hh:mm:ss(.sss)} - Hours, minutes, seconds (subseconds), e.g. 22:10:42.123.
     * <li>{@code hhmmss(.sss)} - Same as above without dividers.
     * </ul>
     * <p>
     * &lt;tz&gt; is an optional timezone suffix of the form:
     * <ul>
     * <li>{@code Z} - UTC.
     * <li>{@code +hh:mm} or {@code -hh:mm} - Offset from UTC in hours and minutes, e.g. +12:00.
     * <li>{@code +hh} or {@code -hh} - Offset from UTC in hours, e.g. +12.
     * </ul>
     * <p>
     * If the timezone is not provided in {@code text} it must be provided in {@code default_tz}
     * (this field is otherwise ignored).
     * <p>
     * This call can fail (returning {@code null}) if {@code text} is not a valid ISO 8601
     * formatted string.
     * <p>
     * You should release the return value by calling g_date_time_unref()
     * when you are done with it.
     * @param text an ISO 8601 formatted time string.
     * @param defaultTz a {@link TimeZone} to use if the text doesn't contain a
     *                          timezone, or {@code null}.
     * @return a new {@link DateTime}, or {@code null}
     */
    public static DateTime newFromIso8601(java.lang.String text, @Nullable org.gtk.glib.TimeZone defaultTz) {
        var RESULT = constructNewFromIso8601(text, defaultTz);
        return org.gtk.glib.DateTime.fromAddress.marshal(RESULT, Ownership.FULL);
    }
    
    private static MemoryAddress constructNewFromTimevalLocal(org.gtk.glib.TimeVal tv) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_date_time_new_from_timeval_local.invokeExact(
                    tv.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a {@link DateTime} corresponding to the given {@link TimeVal} {@code tv} in the
     * local time zone.
     * <p>
     * The time contained in a {@link TimeVal} is always stored in the form of
     * seconds elapsed since 1970-01-01 00:00:00 UTC, regardless of the
     * local time offset.
     * <p>
     * This call can fail (returning {@code null}) if {@code tv} represents a time outside
     * of the supported range of {@link DateTime}.
     * <p>
     * You should release the return value by calling g_date_time_unref()
     * when you are done with it.
     * @param tv a {@link TimeVal}
     * @return a new {@link DateTime}, or {@code null}
     * @deprecated {@link TimeVal} is not year-2038-safe. Use
     *    g_date_time_new_from_unix_local() instead.
     */
    @Deprecated
    public static DateTime newFromTimevalLocal(org.gtk.glib.TimeVal tv) {
        var RESULT = constructNewFromTimevalLocal(tv);
        return org.gtk.glib.DateTime.fromAddress.marshal(RESULT, Ownership.FULL);
    }
    
    private static MemoryAddress constructNewFromTimevalUtc(org.gtk.glib.TimeVal tv) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_date_time_new_from_timeval_utc.invokeExact(
                    tv.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a {@link DateTime} corresponding to the given {@link TimeVal} {@code tv} in UTC.
     * <p>
     * The time contained in a {@link TimeVal} is always stored in the form of
     * seconds elapsed since 1970-01-01 00:00:00 UTC.
     * <p>
     * This call can fail (returning {@code null}) if {@code tv} represents a time outside
     * of the supported range of {@link DateTime}.
     * <p>
     * You should release the return value by calling g_date_time_unref()
     * when you are done with it.
     * @param tv a {@link TimeVal}
     * @return a new {@link DateTime}, or {@code null}
     * @deprecated {@link TimeVal} is not year-2038-safe. Use
     *    g_date_time_new_from_unix_utc() instead.
     */
    @Deprecated
    public static DateTime newFromTimevalUtc(org.gtk.glib.TimeVal tv) {
        var RESULT = constructNewFromTimevalUtc(tv);
        return org.gtk.glib.DateTime.fromAddress.marshal(RESULT, Ownership.FULL);
    }
    
    private static MemoryAddress constructNewFromUnixLocal(long t) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_date_time_new_from_unix_local.invokeExact(
                    t);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a {@link DateTime} corresponding to the given Unix time {@code t} in the
     * local time zone.
     * <p>
     * Unix time is the number of seconds that have elapsed since 1970-01-01
     * 00:00:00 UTC, regardless of the local time offset.
     * <p>
     * This call can fail (returning {@code null}) if {@code t} represents a time outside
     * of the supported range of {@link DateTime}.
     * <p>
     * You should release the return value by calling g_date_time_unref()
     * when you are done with it.
     * @param t the Unix time
     * @return a new {@link DateTime}, or {@code null}
     */
    public static DateTime newFromUnixLocal(long t) {
        var RESULT = constructNewFromUnixLocal(t);
        return org.gtk.glib.DateTime.fromAddress.marshal(RESULT, Ownership.FULL);
    }
    
    private static MemoryAddress constructNewFromUnixUtc(long t) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_date_time_new_from_unix_utc.invokeExact(
                    t);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a {@link DateTime} corresponding to the given Unix time {@code t} in UTC.
     * <p>
     * Unix time is the number of seconds that have elapsed since 1970-01-01
     * 00:00:00 UTC.
     * <p>
     * This call can fail (returning {@code null}) if {@code t} represents a time outside
     * of the supported range of {@link DateTime}.
     * <p>
     * You should release the return value by calling g_date_time_unref()
     * when you are done with it.
     * @param t the Unix time
     * @return a new {@link DateTime}, or {@code null}
     */
    public static DateTime newFromUnixUtc(long t) {
        var RESULT = constructNewFromUnixUtc(t);
        return org.gtk.glib.DateTime.fromAddress.marshal(RESULT, Ownership.FULL);
    }
    
    private static MemoryAddress constructNewLocal(int year, int month, int day, int hour, int minute, double seconds) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_date_time_new_local.invokeExact(
                    year,
                    month,
                    day,
                    hour,
                    minute,
                    seconds);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new {@link DateTime} corresponding to the given date and time in
     * the local time zone.
     * <p>
     * This call is equivalent to calling g_date_time_new() with the time
     * zone returned by g_time_zone_new_local().
     * @param year the year component of the date
     * @param month the month component of the date
     * @param day the day component of the date
     * @param hour the hour component of the date
     * @param minute the minute component of the date
     * @param seconds the number of seconds past the minute
     * @return a {@link DateTime}, or {@code null}
     */
    public static DateTime newLocal(int year, int month, int day, int hour, int minute, double seconds) {
        var RESULT = constructNewLocal(year, month, day, hour, minute, seconds);
        return org.gtk.glib.DateTime.fromAddress.marshal(RESULT, Ownership.FULL);
    }
    
    private static MemoryAddress constructNewNow(org.gtk.glib.TimeZone tz) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_date_time_new_now.invokeExact(
                    tz.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a {@link DateTime} corresponding to this exact instant in the given
     * time zone {@code tz}.  The time is as accurate as the system allows, to a
     * maximum accuracy of 1 microsecond.
     * <p>
     * This function will always succeed unless GLib is still being used after the
     * year 9999.
     * <p>
     * You should release the return value by calling g_date_time_unref()
     * when you are done with it.
     * @param tz a {@link TimeZone}
     * @return a new {@link DateTime}, or {@code null}
     */
    public static DateTime newNow(org.gtk.glib.TimeZone tz) {
        var RESULT = constructNewNow(tz);
        return org.gtk.glib.DateTime.fromAddress.marshal(RESULT, Ownership.FULL);
    }
    
    private static MemoryAddress constructNewNowLocal() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_date_time_new_now_local.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a {@link DateTime} corresponding to this exact instant in the local
     * time zone.
     * <p>
     * This is equivalent to calling g_date_time_new_now() with the time
     * zone returned by g_time_zone_new_local().
     * @return a new {@link DateTime}, or {@code null}
     */
    public static DateTime newNowLocal() {
        var RESULT = constructNewNowLocal();
        return org.gtk.glib.DateTime.fromAddress.marshal(RESULT, Ownership.FULL);
    }
    
    private static MemoryAddress constructNewNowUtc() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_date_time_new_now_utc.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a {@link DateTime} corresponding to this exact instant in UTC.
     * <p>
     * This is equivalent to calling g_date_time_new_now() with the time
     * zone returned by g_time_zone_new_utc().
     * @return a new {@link DateTime}, or {@code null}
     */
    public static DateTime newNowUtc() {
        var RESULT = constructNewNowUtc();
        return org.gtk.glib.DateTime.fromAddress.marshal(RESULT, Ownership.FULL);
    }
    
    private static MemoryAddress constructNewUtc(int year, int month, int day, int hour, int minute, double seconds) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_date_time_new_utc.invokeExact(
                    year,
                    month,
                    day,
                    hour,
                    minute,
                    seconds);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new {@link DateTime} corresponding to the given date and time in
     * UTC.
     * <p>
     * This call is equivalent to calling g_date_time_new() with the time
     * zone returned by g_time_zone_new_utc().
     * @param year the year component of the date
     * @param month the month component of the date
     * @param day the day component of the date
     * @param hour the hour component of the date
     * @param minute the minute component of the date
     * @param seconds the number of seconds past the minute
     * @return a {@link DateTime}, or {@code null}
     */
    public static DateTime newUtc(int year, int month, int day, int hour, int minute, double seconds) {
        var RESULT = constructNewUtc(year, month, day, hour, minute, seconds);
        return org.gtk.glib.DateTime.fromAddress.marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * Creates a copy of {@code datetime} and adds the specified timespan to the copy.
     * @param timespan a {@link TimeSpan}
     * @return the newly created {@link DateTime} which
     *   should be freed with g_date_time_unref(), or {@code null}
     */
    public @Nullable org.gtk.glib.DateTime add(org.gtk.glib.TimeSpan timespan) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_date_time_add.invokeExact(
                    handle(),
                    timespan.getValue().longValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.glib.DateTime.fromAddress.marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * Creates a copy of {@code datetime} and adds the specified number of days to the
     * copy. Add negative values to subtract days.
     * @param days the number of days
     * @return the newly created {@link DateTime} which
     *   should be freed with g_date_time_unref(), or {@code null}
     */
    public @Nullable org.gtk.glib.DateTime addDays(int days) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_date_time_add_days.invokeExact(
                    handle(),
                    days);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.glib.DateTime.fromAddress.marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * Creates a new {@link DateTime} adding the specified values to the current date and
     * time in {@code datetime}. Add negative values to subtract.
     * @param years the number of years to add
     * @param months the number of months to add
     * @param days the number of days to add
     * @param hours the number of hours to add
     * @param minutes the number of minutes to add
     * @param seconds the number of seconds to add
     * @return the newly created {@link DateTime} which
     *   should be freed with g_date_time_unref(), or {@code null}
     */
    public @Nullable org.gtk.glib.DateTime addFull(int years, int months, int days, int hours, int minutes, double seconds) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_date_time_add_full.invokeExact(
                    handle(),
                    years,
                    months,
                    days,
                    hours,
                    minutes,
                    seconds);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.glib.DateTime.fromAddress.marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * Creates a copy of {@code datetime} and adds the specified number of hours.
     * Add negative values to subtract hours.
     * @param hours the number of hours to add
     * @return the newly created {@link DateTime} which
     *   should be freed with g_date_time_unref(), or {@code null}
     */
    public @Nullable org.gtk.glib.DateTime addHours(int hours) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_date_time_add_hours.invokeExact(
                    handle(),
                    hours);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.glib.DateTime.fromAddress.marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * Creates a copy of {@code datetime} adding the specified number of minutes.
     * Add negative values to subtract minutes.
     * @param minutes the number of minutes to add
     * @return the newly created {@link DateTime} which
     *   should be freed with g_date_time_unref(), or {@code null}
     */
    public @Nullable org.gtk.glib.DateTime addMinutes(int minutes) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_date_time_add_minutes.invokeExact(
                    handle(),
                    minutes);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.glib.DateTime.fromAddress.marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * Creates a copy of {@code datetime} and adds the specified number of months to the
     * copy. Add negative values to subtract months.
     * <p>
     * The day of the month of the resulting {@link DateTime} is clamped to the number
     * of days in the updated calendar month. For example, if adding 1 month to
     * 31st January 2018, the result would be 28th February 2018. In 2020 (a leap
     * year), the result would be 29th February.
     * @param months the number of months
     * @return the newly created {@link DateTime} which
     *   should be freed with g_date_time_unref(), or {@code null}
     */
    public @Nullable org.gtk.glib.DateTime addMonths(int months) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_date_time_add_months.invokeExact(
                    handle(),
                    months);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.glib.DateTime.fromAddress.marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * Creates a copy of {@code datetime} and adds the specified number of seconds.
     * Add negative values to subtract seconds.
     * @param seconds the number of seconds to add
     * @return the newly created {@link DateTime} which
     *   should be freed with g_date_time_unref(), or {@code null}
     */
    public @Nullable org.gtk.glib.DateTime addSeconds(double seconds) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_date_time_add_seconds.invokeExact(
                    handle(),
                    seconds);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.glib.DateTime.fromAddress.marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * Creates a copy of {@code datetime} and adds the specified number of weeks to the
     * copy. Add negative values to subtract weeks.
     * @param weeks the number of weeks
     * @return the newly created {@link DateTime} which
     *   should be freed with g_date_time_unref(), or {@code null}
     */
    public @Nullable org.gtk.glib.DateTime addWeeks(int weeks) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_date_time_add_weeks.invokeExact(
                    handle(),
                    weeks);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.glib.DateTime.fromAddress.marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * Creates a copy of {@code datetime} and adds the specified number of years to the
     * copy. Add negative values to subtract years.
     * <p>
     * As with g_date_time_add_months(), if the resulting date would be 29th
     * February on a non-leap year, the day will be clamped to 28th February.
     * @param years the number of years
     * @return the newly created {@link DateTime} which
     *   should be freed with g_date_time_unref(), or {@code null}
     */
    public @Nullable org.gtk.glib.DateTime addYears(int years) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_date_time_add_years.invokeExact(
                    handle(),
                    years);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.glib.DateTime.fromAddress.marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * A comparison function for {@code GDateTimes} that is suitable
     * as a {@link CompareFunc}. Both {@code GDateTimes} must be non-{@code null}.
     * @param dt2 second {@link DateTime} to compare
     * @return -1, 0 or 1 if {@code dt1} is less than, equal to or greater
     *   than {@code dt2}.
     */
    public int compare(org.gtk.glib.DateTime dt2) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_date_time_compare.invokeExact(
                    handle(),
                    dt2.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Calculates the difference in time between {@code end} and {@code begin}.  The
     * {@link TimeSpan} that is returned is effectively {@code end} - {@code begin} (ie:
     * positive if the first parameter is larger).
     * @param begin a {@link DateTime}
     * @return the difference between the two {@link DateTime}, as a time
     *   span expressed in microseconds.
     */
    public org.gtk.glib.TimeSpan difference(org.gtk.glib.DateTime begin) {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.g_date_time_difference.invokeExact(
                    handle(),
                    begin.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.TimeSpan(RESULT);
    }
    
    /**
     * Checks to see if {@code dt1} and {@code dt2} are equal.
     * <p>
     * Equal here means that they represent the same moment after converting
     * them to the same time zone.
     * @param dt2 a {@link DateTime}
     * @return {@code true} if {@code dt1} and {@code dt2} are equal
     */
    public boolean equal(org.gtk.glib.DateTime dt2) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_date_time_equal.invokeExact(
                    handle(),
                    dt2.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Creates a newly allocated string representing the requested {@code format}.
     * <p>
     * The format strings understood by this function are a subset of the
     * strftime() format language as specified by C99.  The \\{@code D}, \\{@code U} and \\{@code W}
     * conversions are not supported, nor is the 'E' modifier.  The GNU
     * extensions \\{@code k}, \\{@code l}, \\{@code s} and \\{@code P} are supported, however, as are the
     * '0', '_' and '-' modifiers. The Python extension \\{@code f} is also supported.
     * <p>
     * In contrast to strftime(), this function always produces a UTF-8
     * string, regardless of the current locale.  Note that the rendering of
     * many formats is locale-dependent and may not match the strftime()
     * output exactly.
     * <p>
     * The following format specifiers are supported:
     * <ul>
     * <li>\\{@code a}: the abbreviated weekday name according to the current locale
     * <li>\\{@code A}: the full weekday name according to the current locale
     * <li>\\{@code b}: the abbreviated month name according to the current locale
     * <li>\\{@code B}: the full month name according to the current locale
     * <li>\\{@code c}: the preferred date and time representation for the current locale
     * <li>\\{@code C}: the century number (year/100) as a 2-digit integer (00-99)
     * <li>\\{@code d}: the day of the month as a decimal number (range 01 to 31)
     * <li>\\{@code e}: the day of the month as a decimal number (range 1 to 31);
     *   single digits are preceded by a figure space
     * <li>\\{@code F}: equivalent to {@code %Y-%m-%d} (the ISO 8601 date format)
     * <li>\\{@code g}: the last two digits of the ISO 8601 week-based year as a
     *   decimal number (00-99). This works well with \\{@code V} and \\{@code u}.
     * <li>\\{@code G}: the ISO 8601 week-based year as a decimal number. This works
     *   well with \\{@code V} and \\{@code u}.
     * <li>\\{@code h}: equivalent to \\{@code b}
     * <li>\\{@code H}: the hour as a decimal number using a 24-hour clock (range 00 to 23)
     * <li>\\{@code I}: the hour as a decimal number using a 12-hour clock (range 01 to 12)
     * <li>\\{@code j}: the day of the year as a decimal number (range 001 to 366)
     * <li>\\{@code k}: the hour (24-hour clock) as a decimal number (range 0 to 23);
     *   single digits are preceded by a figure space
     * <li>\\{@code l}: the hour (12-hour clock) as a decimal number (range 1 to 12);
     *   single digits are preceded by a figure space
     * <li>\\{@code m}: the month as a decimal number (range 01 to 12)
     * <li>\\{@code M}: the minute as a decimal number (range 00 to 59)
     * <li>\\{@code f}: the microsecond as a decimal number (range 000000 to 999999)
     * <li>\\{@code p}: either "AM" or "PM" according to the given time value, or the
     *   corresponding  strings for the current locale.  Noon is treated as
     *   "PM" and midnight as "AM". Use of this format specifier is discouraged, as
     *   many locales have no concept of AM/PM formatting. Use \\{@code c} or \\{@code X} instead.
     * <li>\\{@code P}: like \\{@code p} but lowercase: "am" or "pm" or a corresponding string for
     *   the current locale. Use of this format specifier is discouraged, as
     *   many locales have no concept of AM/PM formatting. Use \\{@code c} or \\{@code X} instead.
     * <li>\\{@code r}: the time in a.m. or p.m. notation. Use of this format specifier is
     *   discouraged, as many locales have no concept of AM/PM formatting. Use \\{@code c}
     *   or \\{@code X} instead.
     * <li>\\{@code R}: the time in 24-hour notation (\\{@code H}:\\{@code M})
     * <li>\\{@code s}: the number of seconds since the Epoch, that is, since 1970-01-01
     *   00:00:00 UTC
     * <li>\\{@code S}: the second as a decimal number (range 00 to 60)
     * <li>\\{@code t}: a tab character
     * <li>\\{@code T}: the time in 24-hour notation with seconds (\\{@code H}:\\{@code M}:\\{@code S})
     * <li>\\{@code u}: the ISO 8601 standard day of the week as a decimal, range 1 to 7,
     *    Monday being 1. This works well with \\{@code G} and \\{@code V}.
     * <li>\\{@code V}: the ISO 8601 standard week number of the current year as a decimal
     *   number, range 01 to 53, where week 1 is the first week that has at
     *   least 4 days in the new year. See g_date_time_get_week_of_year().
     *   This works well with \\{@code G} and \\{@code u}.
     * <li>\\{@code w}: the day of the week as a decimal, range 0 to 6, Sunday being 0.
     *   This is not the ISO 8601 standard format -- use \\{@code u} instead.
     * <li>\\{@code x}: the preferred date representation for the current locale without
     *   the time
     * <li>\\{@code X}: the preferred time representation for the current locale without
     *   the date
     * <li>\\{@code y}: the year as a decimal number without the century
     * <li>\\{@code Y}: the year as a decimal number including the century
     * <li>\\{@code z}: the time zone as an offset from UTC (+hhmm)
     * <li>\\%:z: the time zone as an offset from UTC (+hh:mm).
     *   This is a gnulib strftime() extension. Since: 2.38
     * <li>\\%::z: the time zone as an offset from UTC (+hh:mm:ss). This is a
     *   gnulib strftime() extension. Since: 2.38
     * <li>\\%:::z: the time zone as an offset from UTC, with : to necessary
     *   precision (e.g., -04, +05:30). This is a gnulib strftime() extension. Since: 2.38
     * <li>\\{@code Z}: the time zone or name or abbreviation
     * <li>\\%\\%: a literal \\% character
     * </ul>
     * <p>
     * Some conversion specifications can be modified by preceding the
     * conversion specifier by one or more modifier characters. The
     * following modifiers are supported for many of the numeric
     * conversions:
     * <ul>
     * <li>O: Use alternative numeric symbols, if the current locale supports those.
     * <li>_: Pad a numeric result with spaces. This overrides the default padding
     *   for the specifier.
     * <li>-: Do not pad a numeric result. This overrides the default padding
     *   for the specifier.
     * <li>0: Pad a numeric result with zeros. This overrides the default padding
     *   for the specifier.
     * </ul>
     * <p>
     * Additionally, when O is used with B, b, or h, it produces the alternative
     * form of a month name. The alternative form should be used when the month
     * name is used without a day number (e.g., standalone). It is required in
     * some languages (Baltic, Slavic, Greek, and more) due to their grammatical
     * rules. For other languages there is no difference. \\{@code OB} is a GNU and BSD
     * strftime() extension expected to be added to the future POSIX specification,
     * \\{@code Ob} and \\{@code Oh} are GNU strftime() extensions. Since: 2.56
     * @param format a valid UTF-8 string, containing the format for the
     *          {@link DateTime}
     * @return a newly allocated string formatted to
     *    the requested format or {@code null} in the case that there was an error (such
     *    as a format specifier not being supported in the current locale). The
     *    string should be freed with g_free().
     */
    public @Nullable java.lang.String format(java.lang.String format) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_date_time_format.invokeExact(
                    handle(),
                    Marshal.stringToAddress.marshal(format, null));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Format {@code datetime} in <a href="https://en.wikipedia.org/wiki/ISO_8601">ISO 8601 format</a>,
     * including the date, time and time zone, and return that as a UTF-8 encoded
     * string.
     * <p>
     * Since GLib 2.66, this will output to sub-second precision if needed.
     * @return a newly allocated string formatted in
     *   ISO 8601 format or {@code null} in the case that there was an error. The string
     *   should be freed with g_free().
     */
    public @Nullable java.lang.String formatIso8601() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_date_time_format_iso8601.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Retrieves the day of the month represented by {@code datetime} in the gregorian
     * calendar.
     * @return the day of the month
     */
    public int getDayOfMonth() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_date_time_get_day_of_month.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Retrieves the ISO 8601 day of the week on which {@code datetime} falls (1 is
     * Monday, 2 is Tuesday... 7 is Sunday).
     * @return the day of the week
     */
    public int getDayOfWeek() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_date_time_get_day_of_week.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Retrieves the day of the year represented by {@code datetime} in the Gregorian
     * calendar.
     * @return the day of the year
     */
    public int getDayOfYear() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_date_time_get_day_of_year.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Retrieves the hour of the day represented by {@code datetime}
     * @return the hour of the day
     */
    public int getHour() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_date_time_get_hour.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Retrieves the microsecond of the date represented by {@code datetime}
     * @return the microsecond of the second
     */
    public int getMicrosecond() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_date_time_get_microsecond.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Retrieves the minute of the hour represented by {@code datetime}
     * @return the minute of the hour
     */
    public int getMinute() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_date_time_get_minute.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Retrieves the month of the year represented by {@code datetime} in the Gregorian
     * calendar.
     * @return the month represented by {@code datetime}
     */
    public int getMonth() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_date_time_get_month.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Retrieves the second of the minute represented by {@code datetime}
     * @return the second represented by {@code datetime}
     */
    public int getSecond() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_date_time_get_second.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Retrieves the number of seconds since the start of the last minute,
     * including the fractional part.
     * @return the number of seconds
     */
    public double getSeconds() {
        double RESULT;
        try {
            RESULT = (double) DowncallHandles.g_date_time_get_seconds.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Get the time zone for this {@code datetime}.
     * @return the time zone
     */
    public org.gtk.glib.TimeZone getTimezone() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_date_time_get_timezone.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.glib.TimeZone.fromAddress.marshal(RESULT, Ownership.NONE);
    }
    
    /**
     * Determines the time zone abbreviation to be used at the time and in
     * the time zone of {@code datetime}.
     * <p>
     * For example, in Toronto this is currently "EST" during the winter
     * months and "EDT" during the summer months when daylight savings
     * time is in effect.
     * @return the time zone abbreviation. The returned
     *          string is owned by the {@link DateTime} and it should not be
     *          modified or freed
     */
    public java.lang.String getTimezoneAbbreviation() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_date_time_get_timezone_abbreviation.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Determines the offset to UTC in effect at the time and in the time
     * zone of {@code datetime}.
     * <p>
     * The offset is the number of microseconds that you add to UTC time to
     * arrive at local time for the time zone (ie: negative numbers for time
     * zones west of GMT, positive numbers for east).
     * <p>
     * If {@code datetime} represents UTC time, then the offset is always zero.
     * @return the number of microseconds that should be added to UTC to
     *          get the local time
     */
    public org.gtk.glib.TimeSpan getUtcOffset() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.g_date_time_get_utc_offset.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.TimeSpan(RESULT);
    }
    
    /**
     * Returns the ISO 8601 week-numbering year in which the week containing
     * {@code datetime} falls.
     * <p>
     * This function, taken together with g_date_time_get_week_of_year() and
     * g_date_time_get_day_of_week() can be used to determine the full ISO
     * week date on which {@code datetime} falls.
     * <p>
     * This is usually equal to the normal Gregorian year (as returned by
     * g_date_time_get_year()), except as detailed below:
     * <p>
     * For Thursday, the week-numbering year is always equal to the usual
     * calendar year.  For other days, the number is such that every day
     * within a complete week (Monday to Sunday) is contained within the
     * same week-numbering year.
     * <p>
     * For Monday, Tuesday and Wednesday occurring near the end of the year,
     * this may mean that the week-numbering year is one greater than the
     * calendar year (so that these days have the same week-numbering year
     * as the Thursday occurring early in the next year).
     * <p>
     * For Friday, Saturday and Sunday occurring near the start of the year,
     * this may mean that the week-numbering year is one less than the
     * calendar year (so that these days have the same week-numbering year
     * as the Thursday occurring late in the previous year).
     * <p>
     * An equivalent description is that the week-numbering year is equal to
     * the calendar year containing the majority of the days in the current
     * week (Monday to Sunday).
     * <p>
     * Note that January 1 0001 in the proleptic Gregorian calendar is a
     * Monday, so this function never returns 0.
     * @return the ISO 8601 week-numbering year for {@code datetime}
     */
    public int getWeekNumberingYear() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_date_time_get_week_numbering_year.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Returns the ISO 8601 week number for the week containing {@code datetime}.
     * The ISO 8601 week number is the same for every day of the week (from
     * Moday through Sunday).  That can produce some unusual results
     * (described below).
     * <p>
     * The first week of the year is week 1.  This is the week that contains
     * the first Thursday of the year.  Equivalently, this is the first week
     * that has more than 4 of its days falling within the calendar year.
     * <p>
     * The value 0 is never returned by this function.  Days contained
     * within a year but occurring before the first ISO 8601 week of that
     * year are considered as being contained in the last week of the
     * previous year.  Similarly, the final days of a calendar year may be
     * considered as being part of the first ISO 8601 week of the next year
     * if 4 or more days of that week are contained within the new year.
     * @return the ISO 8601 week number for {@code datetime}.
     */
    public int getWeekOfYear() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_date_time_get_week_of_year.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Retrieves the year represented by {@code datetime} in the Gregorian calendar.
     * @return the year represented by {@code datetime}
     */
    public int getYear() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_date_time_get_year.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Retrieves the Gregorian day, month, and year of a given {@link DateTime}.
     * @param year the return location for the gregorian year, or {@code null}.
     * @param month the return location for the month of the year, or {@code null}.
     * @param day the return location for the day of the month, or {@code null}.
     */
    public void getYmd(Out<Integer> year, Out<Integer> month, Out<Integer> day) {
        MemorySegment yearPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        MemorySegment monthPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        MemorySegment dayPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        try {
            DowncallHandles.g_date_time_get_ymd.invokeExact(
                    handle(),
                    (Addressable) (year == null ? MemoryAddress.NULL : (Addressable) yearPOINTER.address()),
                    (Addressable) (month == null ? MemoryAddress.NULL : (Addressable) monthPOINTER.address()),
                    (Addressable) (day == null ? MemoryAddress.NULL : (Addressable) dayPOINTER.address()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (year != null) year.set(yearPOINTER.get(Interop.valueLayout.C_INT, 0));
        if (month != null) month.set(monthPOINTER.get(Interop.valueLayout.C_INT, 0));
        if (day != null) day.set(dayPOINTER.get(Interop.valueLayout.C_INT, 0));
    }
    
    /**
     * Hashes {@code datetime} into a {@code guint}, suitable for use within {@link HashTable}.
     * @return a {@code guint} containing the hash
     */
    public int hash() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_date_time_hash.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Determines if daylight savings time is in effect at the time and in
     * the time zone of {@code datetime}.
     * @return {@code true} if daylight savings time is in effect
     */
    public boolean isDaylightSavings() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_date_time_is_daylight_savings.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Atomically increments the reference count of {@code datetime} by one.
     * @return the {@link DateTime} with the reference count increased
     */
    public org.gtk.glib.DateTime ref() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_date_time_ref.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.glib.DateTime.fromAddress.marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * Creates a new {@link DateTime} corresponding to the same instant in time as
     * {@code datetime}, but in the local time zone.
     * <p>
     * This call is equivalent to calling g_date_time_to_timezone() with the
     * time zone returned by g_time_zone_new_local().
     * @return the newly created {@link DateTime} which
     *   should be freed with g_date_time_unref(), or {@code null}
     */
    public @Nullable org.gtk.glib.DateTime toLocal() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_date_time_to_local.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.glib.DateTime.fromAddress.marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * Stores the instant in time that {@code datetime} represents into {@code tv}.
     * <p>
     * The time contained in a {@link TimeVal} is always stored in the form of
     * seconds elapsed since 1970-01-01 00:00:00 UTC, regardless of the time
     * zone associated with {@code datetime}.
     * <p>
     * On systems where 'long' is 32bit (ie: all 32bit systems and all
     * Windows systems), a {@link TimeVal} is incapable of storing the entire
     * range of values that {@link DateTime} is capable of expressing.  On those
     * systems, this function returns {@code false} to indicate that the time is
     * out of range.
     * <p>
     * On systems where 'long' is 64bit, this function never fails.
     * @param tv a {@link TimeVal} to modify
     * @return {@code true} if successful, else {@code false}
     * @deprecated {@link TimeVal} is not year-2038-safe. Use
     *    g_date_time_to_unix() instead.
     */
    @Deprecated
    public boolean toTimeval(org.gtk.glib.TimeVal tv) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_date_time_to_timeval.invokeExact(
                    handle(),
                    tv.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Create a new {@link DateTime} corresponding to the same instant in time as
     * {@code datetime}, but in the time zone {@code tz}.
     * <p>
     * This call can fail in the case that the time goes out of bounds.  For
     * example, converting 0001-01-01 00:00:00 UTC to a time zone west of
     * Greenwich will fail (due to the year 0 being out of range).
     * @param tz the new {@link TimeZone}
     * @return the newly created {@link DateTime} which
     *   should be freed with g_date_time_unref(), or {@code null}
     */
    public @Nullable org.gtk.glib.DateTime toTimezone(org.gtk.glib.TimeZone tz) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_date_time_to_timezone.invokeExact(
                    handle(),
                    tz.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.glib.DateTime.fromAddress.marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * Gives the Unix time corresponding to {@code datetime}, rounding down to the
     * nearest second.
     * <p>
     * Unix time is the number of seconds that have elapsed since 1970-01-01
     * 00:00:00 UTC, regardless of the time zone associated with {@code datetime}.
     * @return the Unix time corresponding to {@code datetime}
     */
    public long toUnix() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.g_date_time_to_unix.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new {@link DateTime} corresponding to the same instant in time as
     * {@code datetime}, but in UTC.
     * <p>
     * This call is equivalent to calling g_date_time_to_timezone() with the
     * time zone returned by g_time_zone_new_utc().
     * @return the newly created {@link DateTime} which
     *   should be freed with g_date_time_unref(), or {@code null}
     */
    public @Nullable org.gtk.glib.DateTime toUtc() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_date_time_to_utc.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.glib.DateTime.fromAddress.marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * Atomically decrements the reference count of {@code datetime} by one.
     * <p>
     * When the reference count reaches zero, the resources allocated by
     * {@code datetime} are freed
     */
    public void unref() {
        try {
            DowncallHandles.g_date_time_unref.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle g_date_time_new = Interop.downcallHandle(
            "g_date_time_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_DOUBLE),
            false
        );
        
        private static final MethodHandle g_date_time_new_from_iso8601 = Interop.downcallHandle(
            "g_date_time_new_from_iso8601",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_date_time_new_from_timeval_local = Interop.downcallHandle(
            "g_date_time_new_from_timeval_local",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_date_time_new_from_timeval_utc = Interop.downcallHandle(
            "g_date_time_new_from_timeval_utc",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_date_time_new_from_unix_local = Interop.downcallHandle(
            "g_date_time_new_from_unix_local",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG),
            false
        );
        
        private static final MethodHandle g_date_time_new_from_unix_utc = Interop.downcallHandle(
            "g_date_time_new_from_unix_utc",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG),
            false
        );
        
        private static final MethodHandle g_date_time_new_local = Interop.downcallHandle(
            "g_date_time_new_local",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_DOUBLE),
            false
        );
        
        private static final MethodHandle g_date_time_new_now = Interop.downcallHandle(
            "g_date_time_new_now",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_date_time_new_now_local = Interop.downcallHandle(
            "g_date_time_new_now_local",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_date_time_new_now_utc = Interop.downcallHandle(
            "g_date_time_new_now_utc",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_date_time_new_utc = Interop.downcallHandle(
            "g_date_time_new_utc",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_DOUBLE),
            false
        );
        
        private static final MethodHandle g_date_time_add = Interop.downcallHandle(
            "g_date_time_add",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG),
            false
        );
        
        private static final MethodHandle g_date_time_add_days = Interop.downcallHandle(
            "g_date_time_add_days",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle g_date_time_add_full = Interop.downcallHandle(
            "g_date_time_add_full",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_DOUBLE),
            false
        );
        
        private static final MethodHandle g_date_time_add_hours = Interop.downcallHandle(
            "g_date_time_add_hours",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle g_date_time_add_minutes = Interop.downcallHandle(
            "g_date_time_add_minutes",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle g_date_time_add_months = Interop.downcallHandle(
            "g_date_time_add_months",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle g_date_time_add_seconds = Interop.downcallHandle(
            "g_date_time_add_seconds",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_DOUBLE),
            false
        );
        
        private static final MethodHandle g_date_time_add_weeks = Interop.downcallHandle(
            "g_date_time_add_weeks",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle g_date_time_add_years = Interop.downcallHandle(
            "g_date_time_add_years",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle g_date_time_compare = Interop.downcallHandle(
            "g_date_time_compare",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_date_time_difference = Interop.downcallHandle(
            "g_date_time_difference",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_date_time_equal = Interop.downcallHandle(
            "g_date_time_equal",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_date_time_format = Interop.downcallHandle(
            "g_date_time_format",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_date_time_format_iso8601 = Interop.downcallHandle(
            "g_date_time_format_iso8601",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_date_time_get_day_of_month = Interop.downcallHandle(
            "g_date_time_get_day_of_month",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_date_time_get_day_of_week = Interop.downcallHandle(
            "g_date_time_get_day_of_week",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_date_time_get_day_of_year = Interop.downcallHandle(
            "g_date_time_get_day_of_year",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_date_time_get_hour = Interop.downcallHandle(
            "g_date_time_get_hour",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_date_time_get_microsecond = Interop.downcallHandle(
            "g_date_time_get_microsecond",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_date_time_get_minute = Interop.downcallHandle(
            "g_date_time_get_minute",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_date_time_get_month = Interop.downcallHandle(
            "g_date_time_get_month",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_date_time_get_second = Interop.downcallHandle(
            "g_date_time_get_second",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_date_time_get_seconds = Interop.downcallHandle(
            "g_date_time_get_seconds",
            FunctionDescriptor.of(Interop.valueLayout.C_DOUBLE, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_date_time_get_timezone = Interop.downcallHandle(
            "g_date_time_get_timezone",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_date_time_get_timezone_abbreviation = Interop.downcallHandle(
            "g_date_time_get_timezone_abbreviation",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_date_time_get_utc_offset = Interop.downcallHandle(
            "g_date_time_get_utc_offset",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_date_time_get_week_numbering_year = Interop.downcallHandle(
            "g_date_time_get_week_numbering_year",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_date_time_get_week_of_year = Interop.downcallHandle(
            "g_date_time_get_week_of_year",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_date_time_get_year = Interop.downcallHandle(
            "g_date_time_get_year",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_date_time_get_ymd = Interop.downcallHandle(
            "g_date_time_get_ymd",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_date_time_hash = Interop.downcallHandle(
            "g_date_time_hash",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_date_time_is_daylight_savings = Interop.downcallHandle(
            "g_date_time_is_daylight_savings",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_date_time_ref = Interop.downcallHandle(
            "g_date_time_ref",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_date_time_to_local = Interop.downcallHandle(
            "g_date_time_to_local",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_date_time_to_timeval = Interop.downcallHandle(
            "g_date_time_to_timeval",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_date_time_to_timezone = Interop.downcallHandle(
            "g_date_time_to_timezone",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_date_time_to_unix = Interop.downcallHandle(
            "g_date_time_to_unix",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_date_time_to_utc = Interop.downcallHandle(
            "g_date_time_to_utc",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_date_time_unref = Interop.downcallHandle(
            "g_date_time_unref",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
    }
}
