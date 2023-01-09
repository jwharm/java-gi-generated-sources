package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Struct to store date, time and timezone information altogether.
 * {@link DateTime} is refcounted and immutable.
 * <p>
 * Date information is handled using the [proleptic Gregorian calendar].
 * <p>
 * Provides basic creation functions and accessor functions to its fields.
 * <p>
 * [proleptic Gregorian calendar]: https://en.wikipedia.org/wiki/Proleptic_Gregorian_calendar
 */
public class DateTime extends Struct {
    
    static {
        Gst.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstDateTime";
    
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
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        DateTime newInstance = new DateTime(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a DateTime proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected DateTime(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, DateTime> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new DateTime(input);
    
    private static MemoryAddress constructNew(float tzoffset, int year, int month, int day, int hour, int minute, double seconds) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_date_time_new.invokeExact(
                    tzoffset,
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
     * Creates a new {@link DateTime} using the date and times in the gregorian calendar
     * in the supplied timezone.
     * <p>
     * {@code year} should be from 1 to 9999, {@code month} should be from 1 to 12, {@code day} from
     * 1 to 31, {@code hour} from 0 to 23, {@code minutes} and {@code seconds} from 0 to 59.
     * <p>
     * Note that {@code tzoffset} is a float and was chosen so for being able to handle
     * some fractional timezones, while it still keeps the readability of
     * representing it in hours for most timezones.
     * <p>
     * If value is -1 then all over value will be ignored. For example
     * if {@code month} == -1, then {@link DateTime} will be created only for {@code year}. If
     * {@code day} == -1, then {@link DateTime} will be created for {@code year} and {@code month} and
     * so on.
     * @param tzoffset Offset from UTC in hours.
     * @param year the gregorian year
     * @param month the gregorian month
     * @param day the day of the gregorian month
     * @param hour the hour of the day
     * @param minute the minute of the hour
     * @param seconds the second of the minute
     */
    public DateTime(float tzoffset, int year, int month, int day, int hour, int minute, double seconds) {
        super(constructNew(tzoffset, year, month, day, hour, minute, seconds));
        this.takeOwnership();
    }
    
    private static MemoryAddress constructNewFromGDateTime(@Nullable org.gtk.glib.DateTime dt) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_date_time_new_from_g_date_time.invokeExact((Addressable) (dt == null ? MemoryAddress.NULL : dt.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        dt.yieldOwnership();
        return RESULT;
    }
        
    /**
     * Creates a new {@link DateTime} from a {@link org.gtk.glib.DateTime} object.
     * @param dt the {@link org.gtk.glib.DateTime}.
     * @return a newly created {@link DateTime},
     * or {@code null} if {@code dt} is {@code null}.
     */
    public static DateTime newFromGDateTime(@Nullable org.gtk.glib.DateTime dt) {
        var RESULT = constructNewFromGDateTime(dt);
        var OBJECT = org.gstreamer.gst.DateTime.fromAddress.marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    private static MemoryAddress constructNewFromIso8601String(java.lang.String string) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.gst_date_time_new_from_iso8601_string.invokeExact(Marshal.stringToAddress.marshal(string, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return RESULT;
        }
    }
        
    /**
     * Tries to parse common variants of ISO-8601 datetime strings into a
     * {@link DateTime}. Possible input formats are (for example):
     * {@code 2012-06-30T22:46:43Z}, {@code 2012}, {@code 2012-06}, {@code 2012-06-30}, {@code 2012-06-30T22:46:43-0430},
     * {@code 2012-06-30T22:46Z}, {@code 2012-06-30T22:46-0430}, {@code 2012-06-30 22:46},
     * {@code 2012-06-30 22:46:43}, {@code 2012-06-00}, {@code 2012-00-00}, {@code 2012-00-30}, {@code 22:46:43Z}, {@code 22:46Z},
     * {@code 22:46:43-0430}, {@code 22:46-0430}, {@code 22:46:30}, {@code 22:46}
     * If no date is provided, it is assumed to be "today" in the timezone
     * provided (if any), otherwise UTC.
     * @param string ISO 8601-formatted datetime string.
     * @return a newly created {@link DateTime},
     * or {@code null} on error
     */
    public static DateTime newFromIso8601String(java.lang.String string) {
        var RESULT = constructNewFromIso8601String(string);
        var OBJECT = org.gstreamer.gst.DateTime.fromAddress.marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    private static MemoryAddress constructNewFromUnixEpochLocalTime(long secs) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_date_time_new_from_unix_epoch_local_time.invokeExact(secs);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
        
    /**
     * Creates a new {@link DateTime} using the time since Jan 1, 1970 specified by
     * {@code secs}. The {@link DateTime} is in the local timezone.
     * @param secs seconds from the Unix epoch
     * @return the newly created {@link DateTime},
     * or {@code null} on error.
     */
    public static DateTime newFromUnixEpochLocalTime(long secs) {
        var RESULT = constructNewFromUnixEpochLocalTime(secs);
        var OBJECT = org.gstreamer.gst.DateTime.fromAddress.marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    private static MemoryAddress constructNewFromUnixEpochLocalTimeUsecs(long usecs) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_date_time_new_from_unix_epoch_local_time_usecs.invokeExact(usecs);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
        
    /**
     * Creates a new {@link DateTime} using the time since Jan 1, 1970 specified by
     * {@code usecs}. The {@link DateTime} is in the local timezone.
     * @param usecs microseconds from the Unix epoch
     * @return a newly created {@link DateTime}, or {@code null}
     * on error.
     */
    public static DateTime newFromUnixEpochLocalTimeUsecs(long usecs) {
        var RESULT = constructNewFromUnixEpochLocalTimeUsecs(usecs);
        var OBJECT = org.gstreamer.gst.DateTime.fromAddress.marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    private static MemoryAddress constructNewFromUnixEpochUtc(long secs) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_date_time_new_from_unix_epoch_utc.invokeExact(secs);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
        
    /**
     * Creates a new {@link DateTime} using the time since Jan 1, 1970 specified by
     * {@code secs}. The {@link DateTime} is in the UTC timezone.
     * @param secs seconds from the Unix epoch
     * @return the newly created {@link DateTime},
     * or {@code null} on error.
     */
    public static DateTime newFromUnixEpochUtc(long secs) {
        var RESULT = constructNewFromUnixEpochUtc(secs);
        var OBJECT = org.gstreamer.gst.DateTime.fromAddress.marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    private static MemoryAddress constructNewFromUnixEpochUtcUsecs(long usecs) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_date_time_new_from_unix_epoch_utc_usecs.invokeExact(usecs);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
        
    /**
     * Creates a new {@link DateTime} using the time since Jan 1, 1970 specified by
     * {@code usecs}. The {@link DateTime} is in UTC.
     * @param usecs microseconds from the Unix epoch
     * @return a newly created {@link DateTime}, or {@code null}
     * on error.
     */
    public static DateTime newFromUnixEpochUtcUsecs(long usecs) {
        var RESULT = constructNewFromUnixEpochUtcUsecs(usecs);
        var OBJECT = org.gstreamer.gst.DateTime.fromAddress.marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    private static MemoryAddress constructNewLocalTime(int year, int month, int day, int hour, int minute, double seconds) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_date_time_new_local_time.invokeExact(
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
     * Creates a new {@link DateTime} using the date and times in the gregorian calendar
     * in the local timezone.
     * <p>
     * {@code year} should be from 1 to 9999, {@code month} should be from 1 to 12, {@code day} from
     * 1 to 31, {@code hour} from 0 to 23, {@code minutes} and {@code seconds} from 0 to 59.
     * <p>
     * If {@code month} is -1, then the {@link DateTime} created will only contain {@code year},
     * and all other fields will be considered not set.
     * <p>
     * If {@code day} is -1, then the {@link DateTime} created will only contain {@code year} and
     * {@code month} and all other fields will be considered not set.
     * <p>
     * If {@code hour} is -1, then the {@link DateTime} created will only contain {@code year} and
     * {@code month} and {@code day}, and the time fields will be considered not set. In this
     * case {@code minute} and {@code seconds} should also be -1.
     * @param year the gregorian year
     * @param month the gregorian month, or -1
     * @param day the day of the gregorian month, or -1
     * @param hour the hour of the day, or -1
     * @param minute the minute of the hour, or -1
     * @param seconds the second of the minute, or -1
     * @return the newly created {@link DateTime},
     * or {@code null} on error.
     */
    public static DateTime newLocalTime(int year, int month, int day, int hour, int minute, double seconds) {
        var RESULT = constructNewLocalTime(year, month, day, hour, minute, seconds);
        var OBJECT = org.gstreamer.gst.DateTime.fromAddress.marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    private static MemoryAddress constructNewNowLocalTime() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_date_time_new_now_local_time.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
        
    /**
     * Creates a new {@link DateTime} representing the current date and time.
     * @return the newly created {@link DateTime} which should
     *     be freed with gst_date_time_unref(), or {@code null} on error.
     */
    public static DateTime newNowLocalTime() {
        var RESULT = constructNewNowLocalTime();
        var OBJECT = org.gstreamer.gst.DateTime.fromAddress.marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    private static MemoryAddress constructNewNowUtc() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_date_time_new_now_utc.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
        
    /**
     * Creates a new {@link DateTime} that represents the current instant at Universal
     * coordinated time.
     * @return the newly created {@link DateTime} which should
     *   be freed with gst_date_time_unref(), or {@code null} on error.
     */
    public static DateTime newNowUtc() {
        var RESULT = constructNewNowUtc();
        var OBJECT = org.gstreamer.gst.DateTime.fromAddress.marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    private static MemoryAddress constructNewY(int year) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_date_time_new_y.invokeExact(year);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
        
    /**
     * Creates a new {@link DateTime} using the date and times in the gregorian calendar
     * in the local timezone.
     * <p>
     * {@code year} should be from 1 to 9999.
     * @param year the gregorian year
     * @return the newly created {@link DateTime},
     * or {@code null} on error.
     */
    public static DateTime newY(int year) {
        var RESULT = constructNewY(year);
        var OBJECT = org.gstreamer.gst.DateTime.fromAddress.marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    private static MemoryAddress constructNewYm(int year, int month) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_date_time_new_ym.invokeExact(
                    year,
                    month);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
        
    /**
     * Creates a new {@link DateTime} using the date and times in the gregorian calendar
     * in the local timezone.
     * <p>
     * {@code year} should be from 1 to 9999, {@code month} should be from 1 to 12.
     * <p>
     * If value is -1 then all over value will be ignored. For example
     * if {@code month} == -1, then {@link DateTime} will created only for {@code year}.
     * @param year the gregorian year
     * @param month the gregorian month
     * @return the newly created {@link DateTime},
     * or {@code null} on error.
     */
    public static DateTime newYm(int year, int month) {
        var RESULT = constructNewYm(year, month);
        var OBJECT = org.gstreamer.gst.DateTime.fromAddress.marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    private static MemoryAddress constructNewYmd(int year, int month, int day) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_date_time_new_ymd.invokeExact(
                    year,
                    month,
                    day);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
        
    /**
     * Creates a new {@link DateTime} using the date and times in the gregorian calendar
     * in the local timezone.
     * <p>
     * {@code year} should be from 1 to 9999, {@code month} should be from 1 to 12, {@code day} from
     * 1 to 31.
     * <p>
     * If value is -1 then all over value will be ignored. For example
     * if {@code month} == -1, then {@link DateTime} will created only for {@code year}. If
     * {@code day} == -1, then {@link DateTime} will created for {@code year} and {@code month} and
     * so on.
     * @param year the gregorian year
     * @param month the gregorian month
     * @param day the day of the gregorian month
     * @return the newly created {@link DateTime},
     * or {@code null} on error.
     */
    public static DateTime newYmd(int year, int month, int day) {
        var RESULT = constructNewYmd(year, month, day);
        var OBJECT = org.gstreamer.gst.DateTime.fromAddress.marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    /**
     * Returns the day of the month of this {@link DateTime}.
     * @return The day of this {@link DateTime}, or -1 if none is set.
     */
    public int getDay() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_date_time_get_day.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Retrieves the hour of the day represented by {@code datetime} in the gregorian
     * calendar. The return is in the range of 0 to 23.
     * @return the hour of the day, or -1 if none is set.
     */
    public int getHour() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_date_time_get_hour.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Retrieves the fractional part of the seconds in microseconds represented by
     * {@code datetime} in the gregorian calendar.
     * @return the microsecond of the second, or -1 if none is set.
     */
    public int getMicrosecond() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_date_time_get_microsecond.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Retrieves the minute of the hour represented by {@code datetime} in the gregorian
     * calendar.
     * @return the minute of the hour, or -1 if none is set.
     */
    public int getMinute() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_date_time_get_minute.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Returns the month of this {@link DateTime}. January is 1, February is 2, etc..
     * @return The month of this {@link DateTime}, or -1 if none is set.
     */
    public int getMonth() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_date_time_get_month.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Retrieves the second of the minute represented by {@code datetime} in the gregorian
     * calendar.
     * @return the second represented by {@code datetime}, or -1 if none is set.
     */
    public int getSecond() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_date_time_get_second.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Retrieves the offset from UTC in hours that the timezone specified
     * by {@code datetime} represents. Timezones ahead (to the east) of UTC have positive
     * values, timezones before (to the west) of UTC have negative values.
     * If {@code datetime} represents UTC time, then the offset is zero.
     * @return the offset from UTC in hours, or {@code G_MAXDOUBLE} if none is set.
     */
    public float getTimeZoneOffset() {
        float RESULT;
        try {
            RESULT = (float) DowncallHandles.gst_date_time_get_time_zone_offset.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Returns the year of this {@link DateTime}.
     * Call gst_date_time_has_year() before, to avoid warnings.
     * @return The year of this {@link DateTime}
     */
    public int getYear() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_date_time_get_year.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    public boolean hasDay() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_date_time_has_day.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    public boolean hasMonth() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_date_time_has_month.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    public boolean hasSecond() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_date_time_has_second.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    public boolean hasTime() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_date_time_has_time.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    public boolean hasYear() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_date_time_has_year.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Atomically increments the reference count of {@code datetime} by one.
     * @return the reference {@code datetime}
     */
    public org.gstreamer.gst.DateTime ref() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_date_time_ref.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        var OBJECT = org.gstreamer.gst.DateTime.fromAddress.marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    /**
     * Creates a new {@link org.gtk.glib.DateTime} from a fully defined {@link DateTime} object.
     * @return a newly created {@link org.gtk.glib.DateTime}, or
     * {@code null} on error or if {@code datetime} does not have a year, month, day, hour,
     * minute and second.
     */
    public @Nullable org.gtk.glib.DateTime toGDateTime() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_date_time_to_g_date_time.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        var OBJECT = org.gtk.glib.DateTime.fromAddress.marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    /**
     * Create a minimal string compatible with ISO-8601. Possible output formats
     * are (for example): {@code 2012}, {@code 2012-06}, {@code 2012-06-23}, {@code 2012-06-23T23:30Z},
     * {@code 2012-06-23T23:30+0100}, {@code 2012-06-23T23:30:59Z}, {@code 2012-06-23T23:30:59+0100}
     * @return a newly allocated string formatted according
     *     to ISO 8601 and only including the datetime fields that are
     *     valid, or {@code null} in case there was an error.
     */
    public @Nullable java.lang.String toIso8601String() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_date_time_to_iso8601_string.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Atomically decrements the reference count of {@code datetime} by one.  When the
     * reference count reaches zero, the structure is freed.
     */
    public void unref() {
        try {
            DowncallHandles.gst_date_time_unref.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        this.yieldOwnership();
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_date_time_new = Interop.downcallHandle(
                "gst_date_time_new",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_FLOAT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_DOUBLE),
                false
        );
        
        private static final MethodHandle gst_date_time_new_from_g_date_time = Interop.downcallHandle(
                "gst_date_time_new_from_g_date_time",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_date_time_new_from_iso8601_string = Interop.downcallHandle(
                "gst_date_time_new_from_iso8601_string",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_date_time_new_from_unix_epoch_local_time = Interop.downcallHandle(
                "gst_date_time_new_from_unix_epoch_local_time",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG),
                false
        );
        
        private static final MethodHandle gst_date_time_new_from_unix_epoch_local_time_usecs = Interop.downcallHandle(
                "gst_date_time_new_from_unix_epoch_local_time_usecs",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG),
                false
        );
        
        private static final MethodHandle gst_date_time_new_from_unix_epoch_utc = Interop.downcallHandle(
                "gst_date_time_new_from_unix_epoch_utc",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG),
                false
        );
        
        private static final MethodHandle gst_date_time_new_from_unix_epoch_utc_usecs = Interop.downcallHandle(
                "gst_date_time_new_from_unix_epoch_utc_usecs",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG),
                false
        );
        
        private static final MethodHandle gst_date_time_new_local_time = Interop.downcallHandle(
                "gst_date_time_new_local_time",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_DOUBLE),
                false
        );
        
        private static final MethodHandle gst_date_time_new_now_local_time = Interop.downcallHandle(
                "gst_date_time_new_now_local_time",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_date_time_new_now_utc = Interop.downcallHandle(
                "gst_date_time_new_now_utc",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_date_time_new_y = Interop.downcallHandle(
                "gst_date_time_new_y",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gst_date_time_new_ym = Interop.downcallHandle(
                "gst_date_time_new_ym",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gst_date_time_new_ymd = Interop.downcallHandle(
                "gst_date_time_new_ymd",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gst_date_time_get_day = Interop.downcallHandle(
                "gst_date_time_get_day",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_date_time_get_hour = Interop.downcallHandle(
                "gst_date_time_get_hour",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_date_time_get_microsecond = Interop.downcallHandle(
                "gst_date_time_get_microsecond",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_date_time_get_minute = Interop.downcallHandle(
                "gst_date_time_get_minute",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_date_time_get_month = Interop.downcallHandle(
                "gst_date_time_get_month",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_date_time_get_second = Interop.downcallHandle(
                "gst_date_time_get_second",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_date_time_get_time_zone_offset = Interop.downcallHandle(
                "gst_date_time_get_time_zone_offset",
                FunctionDescriptor.of(Interop.valueLayout.C_FLOAT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_date_time_get_year = Interop.downcallHandle(
                "gst_date_time_get_year",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_date_time_has_day = Interop.downcallHandle(
                "gst_date_time_has_day",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_date_time_has_month = Interop.downcallHandle(
                "gst_date_time_has_month",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_date_time_has_second = Interop.downcallHandle(
                "gst_date_time_has_second",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_date_time_has_time = Interop.downcallHandle(
                "gst_date_time_has_time",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_date_time_has_year = Interop.downcallHandle(
                "gst_date_time_has_year",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_date_time_ref = Interop.downcallHandle(
                "gst_date_time_ref",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_date_time_to_g_date_time = Interop.downcallHandle(
                "gst_date_time_to_g_date_time",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_date_time_to_iso8601_string = Interop.downcallHandle(
                "gst_date_time_to_iso8601_string",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_date_time_unref = Interop.downcallHandle(
                "gst_date_time_unref",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
                false
        );
    }
}
