package org.gtk.glib;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Represents a day between January 1, Year 1 and a few thousand years in
 * the future. None of its members should be accessed directly.
 * <p>
 * If the {@code GDate} is obtained from g_date_new(), it will be safe
 * to mutate but invalid and thus not safe for calendrical computations.
 * <p>
 * If it's declared on the stack, it will contain garbage so must be
 * initialized with g_date_clear(). g_date_clear() makes the date invalid
 * but safe. An invalid date doesn't represent a day, it's "empty." A date
 * becomes valid after you set it to a Julian day or you set a day, month,
 * and year.
 */
public class Date extends Struct {
    
    static {
        GLib.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GDate";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        Interop.valueLayout.C_INT.withName("julian_days"),
        Interop.valueLayout.C_INT.withName("julian"),
        Interop.valueLayout.C_INT.withName("dmy"),
        Interop.valueLayout.C_INT.withName("day"),
        Interop.valueLayout.C_INT.withName("month"),
        Interop.valueLayout.C_INT.withName("year")
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
    
    /**
     * Allocate a new {@link Date}
     * @return A new, uninitialized @{link Date}
     */
    public static Date allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        Date newInstance = new Date(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code julian_days}
     * @return The value of the field {@code julian_days}
     */
    public int julianDays$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("julian_days"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code julian_days}
     * @param julianDays The new value of the field {@code julian_days}
     */
    public void julianDays$set(int julianDays) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("julian_days"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), julianDays);
    }
    
    /**
     * Get the value of the field {@code julian}
     * @return The value of the field {@code julian}
     */
    public int julian$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("julian"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code julian}
     * @param julian The new value of the field {@code julian}
     */
    public void julian$set(int julian) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("julian"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), julian);
    }
    
    /**
     * Get the value of the field {@code dmy}
     * @return The value of the field {@code dmy}
     */
    public int dmy$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("dmy"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code dmy}
     * @param dmy The new value of the field {@code dmy}
     */
    public void dmy$set(int dmy) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("dmy"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), dmy);
    }
    
    /**
     * Get the value of the field {@code day}
     * @return The value of the field {@code day}
     */
    public int day$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("day"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code day}
     * @param day The new value of the field {@code day}
     */
    public void day$set(int day) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("day"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), day);
    }
    
    /**
     * Get the value of the field {@code month}
     * @return The value of the field {@code month}
     */
    public int month$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("month"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code month}
     * @param month The new value of the field {@code month}
     */
    public void month$set(int month) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("month"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), month);
    }
    
    /**
     * Get the value of the field {@code year}
     * @return The value of the field {@code year}
     */
    public int year$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("year"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code year}
     * @param year The new value of the field {@code year}
     */
    public void year$set(int year) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("year"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), year);
    }
    
    /**
     * Create a Date proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public Date(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    private static Addressable constructNew() {
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_date_new.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Allocates a {@link Date} and initializes
     * it to a safe state. The new date will
     * be cleared (as if you'd called g_date_clear()) but invalid (it won't
     * represent an existing day). Free the return value with g_date_free().
     */
    public Date() {
        super(constructNew(), Ownership.FULL);
    }
    
    private static Addressable constructNewDmy(@NotNull org.gtk.glib.DateDay day, @NotNull org.gtk.glib.DateMonth month, @NotNull org.gtk.glib.DateYear year) {
        java.util.Objects.requireNonNull(day, "Parameter 'day' must not be null");
        java.util.Objects.requireNonNull(month, "Parameter 'month' must not be null");
        java.util.Objects.requireNonNull(year, "Parameter 'year' must not be null");
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_date_new_dmy.invokeExact(
                    day.getValue().byteValue(),
                    month.getValue(),
                    year.getValue().shortValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Create a new {@link Date} representing the given day-month-year triplet.
     * <p>
     * The triplet you pass in must represent a valid date. Use g_date_valid_dmy()
     * if needed to validate it. The returned {@link Date} is guaranteed to be non-{@code null}
     * and valid.
     * @param day day of the month
     * @param month month of the year
     * @param year year
     * @return a newly-allocated {@link Date}
     *   initialized with {@code day}, {@code month}, and {@code year}
     */
    public static Date newDmy(@NotNull org.gtk.glib.DateDay day, @NotNull org.gtk.glib.DateMonth month, @NotNull org.gtk.glib.DateYear year) {
        return new Date(constructNewDmy(day, month, year), Ownership.FULL);
    }
    
    private static Addressable constructNewJulian(int julianDay) {
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_date_new_julian.invokeExact(
                    julianDay);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Create a new {@link Date} representing the given Julian date.
     * <p>
     * The {@code julian_day} you pass in must be valid. Use g_date_valid_julian() if
     * needed to validate it. The returned {@link Date} is guaranteed to be non-{@code null} and
     * valid.
     * @param julianDay days since January 1, Year 1
     * @return a newly-allocated {@link Date} initialized
     *   with {@code julian_day}
     */
    public static Date newJulian(int julianDay) {
        return new Date(constructNewJulian(julianDay), Ownership.FULL);
    }
    
    /**
     * Increments a date some number of days.
     * To move forward by weeks, add weeks*7 days.
     * The date must be valid.
     * @param nDays number of days to move the date forward
     */
    public void addDays(int nDays) {
        try {
            DowncallHandles.g_date_add_days.invokeExact(
                    handle(),
                    nDays);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Increments a date by some number of months.
     * If the day of the month is greater than 28,
     * this routine may change the day of the month
     * (because the destination month may not have
     * the current day in it). The date must be valid.
     * @param nMonths number of months to move forward
     */
    public void addMonths(int nMonths) {
        try {
            DowncallHandles.g_date_add_months.invokeExact(
                    handle(),
                    nMonths);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Increments a date by some number of years.
     * If the date is February 29, and the destination
     * year is not a leap year, the date will be changed
     * to February 28. The date must be valid.
     * @param nYears number of years to move forward
     */
    public void addYears(int nYears) {
        try {
            DowncallHandles.g_date_add_years.invokeExact(
                    handle(),
                    nYears);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * If {@code date} is prior to {@code min_date}, sets {@code date} equal to {@code min_date}.
     * If {@code date} falls after {@code max_date}, sets {@code date} equal to {@code max_date}.
     * Otherwise, {@code date} is unchanged.
     * Either of {@code min_date} and {@code max_date} may be {@code null}.
     * All non-{@code null} dates must be valid.
     * @param minDate minimum accepted value for {@code date}
     * @param maxDate maximum accepted value for {@code date}
     */
    public void clamp(@NotNull org.gtk.glib.Date minDate, @NotNull org.gtk.glib.Date maxDate) {
        java.util.Objects.requireNonNull(minDate, "Parameter 'minDate' must not be null");
        java.util.Objects.requireNonNull(maxDate, "Parameter 'maxDate' must not be null");
        try {
            DowncallHandles.g_date_clamp.invokeExact(
                    handle(),
                    minDate.handle(),
                    maxDate.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Initializes one or more {@link Date} structs to a safe but invalid
     * state. The cleared dates will not represent an existing date, but will
     * not contain garbage. Useful to init a date declared on the stack.
     * Validity can be tested with g_date_valid().
     * @param nDates number of dates to clear
     */
    public void clear(int nDates) {
        try {
            DowncallHandles.g_date_clear.invokeExact(
                    handle(),
                    nDates);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * qsort()-style comparison function for dates.
     * Both dates must be valid.
     * @param rhs second date to compare
     * @return 0 for equal, less than zero if {@code lhs} is less than {@code rhs},
     *     greater than zero if {@code lhs} is greater than {@code rhs}
     */
    public int compare(@NotNull org.gtk.glib.Date rhs) {
        java.util.Objects.requireNonNull(rhs, "Parameter 'rhs' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_date_compare.invokeExact(
                    handle(),
                    rhs.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Copies a GDate to a newly-allocated GDate. If the input was invalid
     * (as determined by g_date_valid()), the invalid state will be copied
     * as is into the new object.
     * @return a newly-allocated {@link Date} initialized from {@code date}
     */
    public @NotNull org.gtk.glib.Date copy() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_date_copy.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Date(RESULT, Ownership.FULL);
    }
    
    /**
     * Computes the number of days between two dates.
     * If {@code date2} is prior to {@code date1}, the returned value is negative.
     * Both dates must be valid.
     * @param date2 the second date
     * @return the number of days between {@code date1} and {@code date2}
     */
    public int daysBetween(@NotNull org.gtk.glib.Date date2) {
        java.util.Objects.requireNonNull(date2, "Parameter 'date2' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_date_days_between.invokeExact(
                    handle(),
                    date2.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Frees a {@link Date} returned from g_date_new().
     */
    public void free() {
        try {
            DowncallHandles.g_date_free.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Returns the day of the month. The date must be valid.
     * @return day of the month
     */
    public @NotNull org.gtk.glib.DateDay getDay() {
        byte RESULT;
        try {
            RESULT = (byte) DowncallHandles.g_date_get_day.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.DateDay(RESULT);
    }
    
    /**
     * Returns the day of the year, where Jan 1 is the first day of the
     * year. The date must be valid.
     * @return day of the year
     */
    public int getDayOfYear() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_date_get_day_of_year.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Returns the week of the year, where weeks are interpreted according
     * to ISO 8601.
     * @return ISO 8601 week number of the year.
     */
    public int getIso8601WeekOfYear() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_date_get_iso8601_week_of_year.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Returns the Julian day or "serial number" of the {@link Date}. The
     * Julian day is simply the number of days since January 1, Year 1; i.e.,
     * January 1, Year 1 is Julian day 1; January 2, Year 1 is Julian day 2,
     * etc. The date must be valid.
     * @return Julian day
     */
    public int getJulian() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_date_get_julian.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Returns the week of the year, where weeks are understood to start on
     * Monday. If the date is before the first Monday of the year, return 0.
     * The date must be valid.
     * @return week of the year
     */
    public int getMondayWeekOfYear() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_date_get_monday_week_of_year.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Returns the month of the year. The date must be valid.
     * @return month of the year as a {@link DateMonth}
     */
    public @NotNull org.gtk.glib.DateMonth getMonth() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_date_get_month.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.glib.DateMonth.of(RESULT);
    }
    
    /**
     * Returns the week of the year during which this date falls, if
     * weeks are understood to begin on Sunday. The date must be valid.
     * Can return 0 if the day is before the first Sunday of the year.
     * @return week number
     */
    public int getSundayWeekOfYear() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_date_get_sunday_week_of_year.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Returns the day of the week for a {@link Date}. The date must be valid.
     * @return day of the week as a {@link DateWeekday}.
     */
    public @NotNull org.gtk.glib.DateWeekday getWeekday() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_date_get_weekday.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.glib.DateWeekday.of(RESULT);
    }
    
    /**
     * Returns the year of a {@link Date}. The date must be valid.
     * @return year in which the date falls
     */
    public @NotNull org.gtk.glib.DateYear getYear() {
        short RESULT;
        try {
            RESULT = (short) DowncallHandles.g_date_get_year.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.DateYear(RESULT);
    }
    
    /**
     * Returns {@code true} if the date is on the first of a month.
     * The date must be valid.
     * @return {@code true} if the date is the first of the month
     */
    public boolean isFirstOfMonth() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_date_is_first_of_month.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Returns {@code true} if the date is the last day of the month.
     * The date must be valid.
     * @return {@code true} if the date is the last day of the month
     */
    public boolean isLastOfMonth() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_date_is_last_of_month.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Checks if {@code date1} is less than or equal to {@code date2},
     * and swap the values if this is not the case.
     * @param date2 the second date
     */
    public void order(@NotNull org.gtk.glib.Date date2) {
        java.util.Objects.requireNonNull(date2, "Parameter 'date2' must not be null");
        try {
            DowncallHandles.g_date_order.invokeExact(
                    handle(),
                    date2.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the day of the month for a {@link Date}. If the resulting
     * day-month-year triplet is invalid, the date will be invalid.
     * @param day day to set
     */
    public void setDay(@NotNull org.gtk.glib.DateDay day) {
        java.util.Objects.requireNonNull(day, "Parameter 'day' must not be null");
        try {
            DowncallHandles.g_date_set_day.invokeExact(
                    handle(),
                    day.getValue().byteValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the value of a {@link Date} from a day, month, and year.
     * The day-month-year triplet must be valid; if you aren't
     * sure it is, call g_date_valid_dmy() to check before you
     * set it.
     * @param day day
     * @param month month
     * @param y year
     */
    public void setDmy(@NotNull org.gtk.glib.DateDay day, @NotNull org.gtk.glib.DateMonth month, @NotNull org.gtk.glib.DateYear y) {
        java.util.Objects.requireNonNull(day, "Parameter 'day' must not be null");
        java.util.Objects.requireNonNull(month, "Parameter 'month' must not be null");
        java.util.Objects.requireNonNull(y, "Parameter 'y' must not be null");
        try {
            DowncallHandles.g_date_set_dmy.invokeExact(
                    handle(),
                    day.getValue().byteValue(),
                    month.getValue(),
                    y.getValue().shortValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the value of a {@link Date} from a Julian day number.
     * @param julianDate Julian day number (days since January 1, Year 1)
     */
    public void setJulian(int julianDate) {
        try {
            DowncallHandles.g_date_set_julian.invokeExact(
                    handle(),
                    julianDate);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the month of the year for a {@link Date}.  If the resulting
     * day-month-year triplet is invalid, the date will be invalid.
     * @param month month to set
     */
    public void setMonth(@NotNull org.gtk.glib.DateMonth month) {
        java.util.Objects.requireNonNull(month, "Parameter 'month' must not be null");
        try {
            DowncallHandles.g_date_set_month.invokeExact(
                    handle(),
                    month.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Parses a user-inputted string {@code str}, and try to figure out what date it
     * represents, taking the [current locale][setlocale] into account. If the
     * string is successfully parsed, the date will be valid after the call.
     * Otherwise, it will be invalid. You should check using g_date_valid()
     * to see whether the parsing succeeded.
     * <p>
     * This function is not appropriate for file formats and the like; it
     * isn't very precise, and its exact behavior varies with the locale.
     * It's intended to be a heuristic routine that guesses what the user
     * means by a given string (and it does work pretty well in that
     * capacity).
     * @param str string to parse
     */
    public void setParse(@NotNull java.lang.String str) {
        java.util.Objects.requireNonNull(str, "Parameter 'str' must not be null");
        try {
            DowncallHandles.g_date_set_parse.invokeExact(
                    handle(),
                    Interop.allocateNativeString(str));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the value of a date from a {@link Time} value.
     * The time to date conversion is done using the user's current timezone.
     * @param time {@link Time} value to set.
     * @deprecated Use g_date_set_time_t() instead.
     */
    @Deprecated
    public void setTime(@NotNull org.gtk.glib.Time time) {
        java.util.Objects.requireNonNull(time, "Parameter 'time' must not be null");
        try {
            DowncallHandles.g_date_set_time.invokeExact(
                    handle(),
                    time.getValue().intValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the value of a date to the date corresponding to a time
     * specified as a time_t. The time to date conversion is done using
     * the user's current timezone.
     * <p>
     * To set the value of a date to the current day, you could write:
     * <pre>{@code <!-- language="C" -->
     *  time_t now = time (NULL);
     *  if (now == (time_t) -1)
     *    // handle the error
     *  g_date_set_time_t (date, now);
     * }</pre>
     * @param timet time_t value to set
     */
    public void setTimeT(long timet) {
        try {
            DowncallHandles.g_date_set_time_t.invokeExact(
                    handle(),
                    timet);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the value of a date from a {@link TimeVal} value.  Note that the
     * {@code tv_usec} member is ignored, because {@link Date} can't make use of the
     * additional precision.
     * <p>
     * The time to date conversion is done using the user's current timezone.
     * @param timeval {@link TimeVal} value to set
     * @deprecated {@link TimeVal} is not year-2038-safe. Use g_date_set_time_t()
     *    instead.
     */
    @Deprecated
    public void setTimeVal(@NotNull org.gtk.glib.TimeVal timeval) {
        java.util.Objects.requireNonNull(timeval, "Parameter 'timeval' must not be null");
        try {
            DowncallHandles.g_date_set_time_val.invokeExact(
                    handle(),
                    timeval.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the year for a {@link Date}. If the resulting day-month-year
     * triplet is invalid, the date will be invalid.
     * @param year year to set
     */
    public void setYear(@NotNull org.gtk.glib.DateYear year) {
        java.util.Objects.requireNonNull(year, "Parameter 'year' must not be null");
        try {
            DowncallHandles.g_date_set_year.invokeExact(
                    handle(),
                    year.getValue().shortValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Moves a date some number of days into the past.
     * To move by weeks, just move by weeks*7 days.
     * The date must be valid.
     * @param nDays number of days to move
     */
    public void subtractDays(int nDays) {
        try {
            DowncallHandles.g_date_subtract_days.invokeExact(
                    handle(),
                    nDays);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Moves a date some number of months into the past.
     * If the current day of the month doesn't exist in
     * the destination month, the day of the month
     * may change. The date must be valid.
     * @param nMonths number of months to move
     */
    public void subtractMonths(int nMonths) {
        try {
            DowncallHandles.g_date_subtract_months.invokeExact(
                    handle(),
                    nMonths);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Moves a date some number of years into the past.
     * If the current day doesn't exist in the destination
     * year (i.e. it's February 29 and you move to a non-leap-year)
     * then the day is changed to February 29. The date
     * must be valid.
     * @param nYears number of years to move
     */
    public void subtractYears(int nYears) {
        try {
            DowncallHandles.g_date_subtract_years.invokeExact(
                    handle(),
                    nYears);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Fills in the date-related bits of a struct tm using the {@code date} value.
     * Initializes the non-date parts with something safe but meaningless.
     * @param tm struct tm to fill
     */
    public void toStructTm(@NotNull java.lang.foreign.MemoryAddress tm) {
        java.util.Objects.requireNonNull(tm, "Parameter 'tm' must not be null");
        try {
            DowncallHandles.g_date_to_struct_tm.invokeExact(
                    handle(),
                    (Addressable) tm);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Returns {@code true} if the {@link Date} represents an existing day. The date must not
     * contain garbage; it should have been initialized with g_date_clear()
     * if it wasn't allocated by one of the g_date_new() variants.
     * @return Whether the date is valid
     */
    public boolean valid() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_date_valid.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Returns the number of days in a month, taking leap
     * years into account.
     * @param month month
     * @param year year
     * @return number of days in {@code month} during the {@code year}
     */
    public static byte getDaysInMonth(@NotNull org.gtk.glib.DateMonth month, @NotNull org.gtk.glib.DateYear year) {
        java.util.Objects.requireNonNull(month, "Parameter 'month' must not be null");
        java.util.Objects.requireNonNull(year, "Parameter 'year' must not be null");
        byte RESULT;
        try {
            RESULT = (byte) DowncallHandles.g_date_get_days_in_month.invokeExact(
                    month.getValue(),
                    year.getValue().shortValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Returns the number of weeks in the year, where weeks
     * are taken to start on Monday. Will be 52 or 53. The
     * date must be valid. (Years always have 52 7-day periods,
     * plus 1 or 2 extra days depending on whether it's a leap
     * year. This function is basically telling you how many
     * Mondays are in the year, i.e. there are 53 Mondays if
     * one of the extra days happens to be a Monday.)
     * @param year a year
     * @return number of Mondays in the year
     */
    public static byte getMondayWeeksInYear(@NotNull org.gtk.glib.DateYear year) {
        java.util.Objects.requireNonNull(year, "Parameter 'year' must not be null");
        byte RESULT;
        try {
            RESULT = (byte) DowncallHandles.g_date_get_monday_weeks_in_year.invokeExact(
                    year.getValue().shortValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Returns the number of weeks in the year, where weeks
     * are taken to start on Sunday. Will be 52 or 53. The
     * date must be valid. (Years always have 52 7-day periods,
     * plus 1 or 2 extra days depending on whether it's a leap
     * year. This function is basically telling you how many
     * Sundays are in the year, i.e. there are 53 Sundays if
     * one of the extra days happens to be a Sunday.)
     * @param year year to count weeks in
     * @return the number of weeks in {@code year}
     */
    public static byte getSundayWeeksInYear(@NotNull org.gtk.glib.DateYear year) {
        java.util.Objects.requireNonNull(year, "Parameter 'year' must not be null");
        byte RESULT;
        try {
            RESULT = (byte) DowncallHandles.g_date_get_sunday_weeks_in_year.invokeExact(
                    year.getValue().shortValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Returns {@code true} if the year is a leap year.
     * <p>
     * For the purposes of this function, leap year is every year
     * divisible by 4 unless that year is divisible by 100. If it
     * is divisible by 100 it would be a leap year only if that year
     * is also divisible by 400.
     * @param year year to check
     * @return {@code true} if the year is a leap year
     */
    public static boolean isLeapYear(@NotNull org.gtk.glib.DateYear year) {
        java.util.Objects.requireNonNull(year, "Parameter 'year' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_date_is_leap_year.invokeExact(
                    year.getValue().shortValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Generates a printed representation of the date, in a
     * [locale][setlocale]-specific way.
     * Works just like the platform's C library strftime() function,
     * but only accepts date-related formats; time-related formats
     * give undefined results. Date must be valid. Unlike strftime()
     * (which uses the locale encoding), works on a UTF-8 format
     * string and stores a UTF-8 result.
     * <p>
     * This function does not provide any conversion specifiers in
     * addition to those implemented by the platform's C library.
     * For example, don't expect that using g_date_strftime() would
     * make the \\{@code F} provided by the C99 strftime() work on Windows
     * where the C library only complies to C89.
     * @param s destination buffer
     * @param slen buffer size
     * @param format format string
     * @param date valid {@link Date}
     * @return number of characters written to the buffer, or 0 the buffer was too small
     */
    public static long strftime(@NotNull java.lang.String s, long slen, @NotNull java.lang.String format, @NotNull org.gtk.glib.Date date) {
        java.util.Objects.requireNonNull(s, "Parameter 's' must not be null");
        java.util.Objects.requireNonNull(format, "Parameter 'format' must not be null");
        java.util.Objects.requireNonNull(date, "Parameter 'date' must not be null");
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.g_date_strftime.invokeExact(
                    Interop.allocateNativeString(s),
                    slen,
                    Interop.allocateNativeString(format),
                    date.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Returns {@code true} if the day of the month is valid (a day is valid if it's
     * between 1 and 31 inclusive).
     * @param day day to check
     * @return {@code true} if the day is valid
     */
    public static boolean validDay(@NotNull org.gtk.glib.DateDay day) {
        java.util.Objects.requireNonNull(day, "Parameter 'day' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_date_valid_day.invokeExact(
                    day.getValue().byteValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Returns {@code true} if the day-month-year triplet forms a valid, existing day
     * in the range of days {@link Date} understands (Year 1 or later, no more than
     * a few thousand years in the future).
     * @param day day
     * @param month month
     * @param year year
     * @return {@code true} if the date is a valid one
     */
    public static boolean validDmy(@NotNull org.gtk.glib.DateDay day, @NotNull org.gtk.glib.DateMonth month, @NotNull org.gtk.glib.DateYear year) {
        java.util.Objects.requireNonNull(day, "Parameter 'day' must not be null");
        java.util.Objects.requireNonNull(month, "Parameter 'month' must not be null");
        java.util.Objects.requireNonNull(year, "Parameter 'year' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_date_valid_dmy.invokeExact(
                    day.getValue().byteValue(),
                    month.getValue(),
                    year.getValue().shortValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Returns {@code true} if the Julian day is valid. Anything greater than zero
     * is basically a valid Julian, though there is a 32-bit limit.
     * @param julianDate Julian day to check
     * @return {@code true} if the Julian day is valid
     */
    public static boolean validJulian(int julianDate) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_date_valid_julian.invokeExact(
                    julianDate);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Returns {@code true} if the month value is valid. The 12 {@link DateMonth}
     * enumeration values are the only valid months.
     * @param month month
     * @return {@code true} if the month is valid
     */
    public static boolean validMonth(@NotNull org.gtk.glib.DateMonth month) {
        java.util.Objects.requireNonNull(month, "Parameter 'month' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_date_valid_month.invokeExact(
                    month.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Returns {@code true} if the weekday is valid. The seven {@link DateWeekday} enumeration
     * values are the only valid weekdays.
     * @param weekday weekday
     * @return {@code true} if the weekday is valid
     */
    public static boolean validWeekday(@NotNull org.gtk.glib.DateWeekday weekday) {
        java.util.Objects.requireNonNull(weekday, "Parameter 'weekday' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_date_valid_weekday.invokeExact(
                    weekday.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Returns {@code true} if the year is valid. Any year greater than 0 is valid,
     * though there is a 16-bit limit to what {@link Date} will understand.
     * @param year year
     * @return {@code true} if the year is valid
     */
    public static boolean validYear(@NotNull org.gtk.glib.DateYear year) {
        java.util.Objects.requireNonNull(year, "Parameter 'year' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_date_valid_year.invokeExact(
                    year.getValue().shortValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle g_date_new = Interop.downcallHandle(
            "g_date_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_date_new_dmy = Interop.downcallHandle(
            "g_date_new_dmy",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_BYTE, Interop.valueLayout.C_INT, Interop.valueLayout.C_SHORT),
            false
        );
        
        private static final MethodHandle g_date_new_julian = Interop.downcallHandle(
            "g_date_new_julian",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle g_date_add_days = Interop.downcallHandle(
            "g_date_add_days",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle g_date_add_months = Interop.downcallHandle(
            "g_date_add_months",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle g_date_add_years = Interop.downcallHandle(
            "g_date_add_years",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle g_date_clamp = Interop.downcallHandle(
            "g_date_clamp",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_date_clear = Interop.downcallHandle(
            "g_date_clear",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle g_date_compare = Interop.downcallHandle(
            "g_date_compare",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_date_copy = Interop.downcallHandle(
            "g_date_copy",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_date_days_between = Interop.downcallHandle(
            "g_date_days_between",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_date_free = Interop.downcallHandle(
            "g_date_free",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_date_get_day = Interop.downcallHandle(
            "g_date_get_day",
            FunctionDescriptor.of(Interop.valueLayout.C_BYTE, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_date_get_day_of_year = Interop.downcallHandle(
            "g_date_get_day_of_year",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_date_get_iso8601_week_of_year = Interop.downcallHandle(
            "g_date_get_iso8601_week_of_year",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_date_get_julian = Interop.downcallHandle(
            "g_date_get_julian",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_date_get_monday_week_of_year = Interop.downcallHandle(
            "g_date_get_monday_week_of_year",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_date_get_month = Interop.downcallHandle(
            "g_date_get_month",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_date_get_sunday_week_of_year = Interop.downcallHandle(
            "g_date_get_sunday_week_of_year",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_date_get_weekday = Interop.downcallHandle(
            "g_date_get_weekday",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_date_get_year = Interop.downcallHandle(
            "g_date_get_year",
            FunctionDescriptor.of(Interop.valueLayout.C_SHORT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_date_is_first_of_month = Interop.downcallHandle(
            "g_date_is_first_of_month",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_date_is_last_of_month = Interop.downcallHandle(
            "g_date_is_last_of_month",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_date_order = Interop.downcallHandle(
            "g_date_order",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_date_set_day = Interop.downcallHandle(
            "g_date_set_day",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_BYTE),
            false
        );
        
        private static final MethodHandle g_date_set_dmy = Interop.downcallHandle(
            "g_date_set_dmy",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_BYTE, Interop.valueLayout.C_INT, Interop.valueLayout.C_SHORT),
            false
        );
        
        private static final MethodHandle g_date_set_julian = Interop.downcallHandle(
            "g_date_set_julian",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle g_date_set_month = Interop.downcallHandle(
            "g_date_set_month",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle g_date_set_parse = Interop.downcallHandle(
            "g_date_set_parse",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_date_set_time = Interop.downcallHandle(
            "g_date_set_time",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle g_date_set_time_t = Interop.downcallHandle(
            "g_date_set_time_t",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG),
            false
        );
        
        private static final MethodHandle g_date_set_time_val = Interop.downcallHandle(
            "g_date_set_time_val",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_date_set_year = Interop.downcallHandle(
            "g_date_set_year",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_SHORT),
            false
        );
        
        private static final MethodHandle g_date_subtract_days = Interop.downcallHandle(
            "g_date_subtract_days",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle g_date_subtract_months = Interop.downcallHandle(
            "g_date_subtract_months",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle g_date_subtract_years = Interop.downcallHandle(
            "g_date_subtract_years",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle g_date_to_struct_tm = Interop.downcallHandle(
            "g_date_to_struct_tm",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_date_valid = Interop.downcallHandle(
            "g_date_valid",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_date_get_days_in_month = Interop.downcallHandle(
            "g_date_get_days_in_month",
            FunctionDescriptor.of(Interop.valueLayout.C_BYTE, Interop.valueLayout.C_INT, Interop.valueLayout.C_SHORT),
            false
        );
        
        private static final MethodHandle g_date_get_monday_weeks_in_year = Interop.downcallHandle(
            "g_date_get_monday_weeks_in_year",
            FunctionDescriptor.of(Interop.valueLayout.C_BYTE, Interop.valueLayout.C_SHORT),
            false
        );
        
        private static final MethodHandle g_date_get_sunday_weeks_in_year = Interop.downcallHandle(
            "g_date_get_sunday_weeks_in_year",
            FunctionDescriptor.of(Interop.valueLayout.C_BYTE, Interop.valueLayout.C_SHORT),
            false
        );
        
        private static final MethodHandle g_date_is_leap_year = Interop.downcallHandle(
            "g_date_is_leap_year",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.C_SHORT),
            false
        );
        
        private static final MethodHandle g_date_strftime = Interop.downcallHandle(
            "g_date_strftime",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_date_valid_day = Interop.downcallHandle(
            "g_date_valid_day",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.C_BYTE),
            false
        );
        
        private static final MethodHandle g_date_valid_dmy = Interop.downcallHandle(
            "g_date_valid_dmy",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.C_BYTE, Interop.valueLayout.C_INT, Interop.valueLayout.C_SHORT),
            false
        );
        
        private static final MethodHandle g_date_valid_julian = Interop.downcallHandle(
            "g_date_valid_julian",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle g_date_valid_month = Interop.downcallHandle(
            "g_date_valid_month",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle g_date_valid_weekday = Interop.downcallHandle(
            "g_date_valid_weekday",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle g_date_valid_year = Interop.downcallHandle(
            "g_date_valid_year",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.C_SHORT),
            false
        );
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private Date struct;
        
         /**
         * A {@link Date.Build} object constructs a {@link Date} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = Date.allocate();
        }
        
         /**
         * Finish building the {@link Date} struct.
         * @return A new instance of {@code Date} with the fields 
         *         that were set in the Build object.
         */
        public Date construct() {
            return struct;
        }
        
        /**
         * the Julian representation of the date
         * @param julianDays The value for the {@code julianDays} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setJulianDays(int julianDays) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("julian_days"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), julianDays);
            return this;
        }
        
        /**
         * this bit is set if {@code julian_days} is valid
         * @param julian The value for the {@code julian} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setJulian(int julian) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("julian"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), julian);
            return this;
        }
        
        /**
         * this is set if {@code day}, {@code month} and {@code year} are valid
         * @param dmy The value for the {@code dmy} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setDmy(int dmy) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("dmy"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), dmy);
            return this;
        }
        
        /**
         * the day of the day-month-year representation of the date,
         *   as a number between 1 and 31
         * @param day The value for the {@code day} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setDay(int day) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("day"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), day);
            return this;
        }
        
        /**
         * the day of the day-month-year representation of the date,
         *   as a number between 1 and 12
         * @param month The value for the {@code month} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setMonth(int month) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("month"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), month);
            return this;
        }
        
        /**
         * the day of the day-month-year representation of the date
         * @param year The value for the {@code year} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setYear(int year) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("year"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), year);
            return this;
        }
    }
}
