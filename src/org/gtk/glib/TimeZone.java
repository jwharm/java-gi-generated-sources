package org.gtk.glib;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * {@link TimeZone} is an opaque structure whose members cannot be accessed
 * directly.
 */
public class TimeZone extends io.github.jwharm.javagi.ResourceBase {

    public TimeZone(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    private static Reference constructNewIdentifier(java.lang.String identifier) {
        Reference RESULT = References.get(gtk_h.g_time_zone_new_identifier(Interop.allocateNativeString(identifier).handle()), true);
        return RESULT;
    }
    
    /**
     * Creates a {@link TimeZone} corresponding to {@code identifier}. If {@code identifier} cannot be
     * parsed or loaded, <code>null</code> is returned.
     * <p>
     * {@code identifier} can either be an RFC3339/ISO 8601 time offset or
     * something that would pass as a valid value for the {@code TZ} environment
     * variable (including <code>null</code>).
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
     * the value of {@code TZ}, but if {@code identifier} is <code>null</code> then {@code /etc/localtime}
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
    public static TimeZone newIdentifier(java.lang.String identifier) {
        return new TimeZone(constructNewIdentifier(identifier));
    }
    
    private static Reference constructNewLocal() {
        Reference RESULT = References.get(gtk_h.g_time_zone_new_local(), true);
        return RESULT;
    }
    
    /**
     * Creates a {@link TimeZone} corresponding to local time.  The local time
     * zone may change between invocations to this function; for example,
     * if the system administrator changes it.
     * <p>
     * This is equivalent to calling g_time_zone_new() with the value of
     * the {@code TZ} environment variable (including the possibility of <code>null</code>).
     * <p>
     * You should release the return value by calling g_time_zone_unref()
     * when you are done with it.
     */
    public static TimeZone newLocal() {
        return new TimeZone(constructNewLocal());
    }
    
    private static Reference constructNewOffset(int seconds) {
        Reference RESULT = References.get(gtk_h.g_time_zone_new_offset(seconds), true);
        return RESULT;
    }
    
    /**
     * Creates a {@link TimeZone} corresponding to the given constant offset from UTC,
     * in seconds.
     * <p>
     * This is equivalent to calling g_time_zone_new() with a string in the form
     * {@code [+|-]hh[:mm[:ss]]}.
     */
    public static TimeZone newOffset(int seconds) {
        return new TimeZone(constructNewOffset(seconds));
    }
    
    private static Reference constructNewUtc() {
        Reference RESULT = References.get(gtk_h.g_time_zone_new_utc(), true);
        return RESULT;
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
    public int findInterval(TimeType type, long time) {
        var RESULT = gtk_h.g_time_zone_find_interval(handle(), type.getValue(), time);
        return RESULT;
    }
    
    /**
     * Determines the time zone abbreviation to be used during a particular
     * {@code interval} of time in the time zone {@code tz}.
     * <p>
     * For example, in Toronto this is currently "EST" during the winter
     * months and "EDT" during the summer months when daylight savings time
     * is in effect.
     */
    public java.lang.String getAbbreviation(int interval) {
        var RESULT = gtk_h.g_time_zone_get_abbreviation(handle(), interval);
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Get the identifier of this {@link TimeZone}, as passed to g_time_zone_new().
     * If the identifier passed at construction time was not recognised, {@code UTC} will
     * be returned. If it was <code>null</code>, the identifier of the local timezone at
     * construction time will be returned.
     * <p>
     * The identifier will be returned in the same format as provided at
     * construction time: if provided as a time offset, that will be returned by
     * this function.
     */
    public java.lang.String getIdentifier() {
        var RESULT = gtk_h.g_time_zone_get_identifier(handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Determines the offset to UTC in effect during a particular {@code interval}
     * of time in the time zone {@code tz}.
     * <p>
     * The offset is the number of seconds that you add to UTC time to
     * arrive at local time for {@code tz} (ie: negative numbers for time zones
     * west of GMT, positive numbers for east).
     */
    public int getOffset(int interval) {
        var RESULT = gtk_h.g_time_zone_get_offset(handle(), interval);
        return RESULT;
    }
    
    /**
     * Determines if daylight savings time is in effect during a particular
     * {@code interval} of time in the time zone {@code tz}.
     */
    public boolean isDst(int interval) {
        var RESULT = gtk_h.g_time_zone_is_dst(handle(), interval);
        return (RESULT != 0);
    }
    
    /**
     * Increases the reference count on {@code tz}.
     */
    public TimeZone ref() {
        var RESULT = gtk_h.g_time_zone_ref(handle());
        return new TimeZone(References.get(RESULT, true));
    }
    
    /**
     * Decreases the reference count on {@code tz}.
     */
    public void unref() {
        gtk_h.g_time_zone_unref(handle());
    }
    
}
