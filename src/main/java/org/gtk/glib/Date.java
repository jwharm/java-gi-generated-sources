package org.gtk.glib;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

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
public class Date extends io.github.jwharm.javagi.ResourceBase {

    public Date(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    static final MethodHandle g_date_new = Interop.downcallHandle(
        "g_date_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNew() {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) g_date_new.invokeExact(), true);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Allocates a {@link Date} and initializes
     * it to a safe state. The new date will
     * be cleared (as if you'd called g_date_clear()) but invalid (it won't
     * represent an existing day). Free the return value with g_date_free().
     */
    public Date() {
        super(constructNew());
    }
    
    static final MethodHandle g_date_new_dmy = Interop.downcallHandle(
        "g_date_new_dmy",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_BYTE, ValueLayout.JAVA_INT, ValueLayout.JAVA_SHORT)
    );
    
    private static Refcounted constructNewDmy(DateDay day, DateMonth month, DateYear year) {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) g_date_new_dmy.invokeExact(day.getValue(), month.getValue(), year.getValue()), true);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Create a new {@link Date} representing the given day-month-year triplet.
     * <p>
     * The triplet you pass in must represent a valid date. Use g_date_valid_dmy()
     * if needed to validate it. The returned {@link Date} is guaranteed to be non-{@code null}
     * and valid.
     */
    public static Date newDmy(DateDay day, DateMonth month, DateYear year) {
        return new Date(constructNewDmy(day, month, year));
    }
    
    static final MethodHandle g_date_new_julian = Interop.downcallHandle(
        "g_date_new_julian",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    private static Refcounted constructNewJulian(int julianDay) {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) g_date_new_julian.invokeExact(julianDay), true);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Create a new {@link Date} representing the given Julian date.
     * <p>
     * The {@code julian_day} you pass in must be valid. Use g_date_valid_julian() if
     * needed to validate it. The returned {@link Date} is guaranteed to be non-{@code null} and
     * valid.
     */
    public static Date newJulian(int julianDay) {
        return new Date(constructNewJulian(julianDay));
    }
    
    static final MethodHandle g_date_add_days = Interop.downcallHandle(
        "g_date_add_days",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Increments a date some number of days.
     * To move forward by weeks, add weeks*7 days.
     * The date must be valid.
     */
    public void addDays(int nDays) {
        try {
            g_date_add_days.invokeExact(handle(), nDays);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_date_add_months = Interop.downcallHandle(
        "g_date_add_months",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Increments a date by some number of months.
     * If the day of the month is greater than 28,
     * this routine may change the day of the month
     * (because the destination month may not have
     * the current day in it). The date must be valid.
     */
    public void addMonths(int nMonths) {
        try {
            g_date_add_months.invokeExact(handle(), nMonths);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_date_add_years = Interop.downcallHandle(
        "g_date_add_years",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Increments a date by some number of years.
     * If the date is February 29, and the destination
     * year is not a leap year, the date will be changed
     * to February 28. The date must be valid.
     */
    public void addYears(int nYears) {
        try {
            g_date_add_years.invokeExact(handle(), nYears);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_date_clamp = Interop.downcallHandle(
        "g_date_clamp",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * If {@code date} is prior to {@code min_date}, sets {@code date} equal to {@code min_date}.
     * If {@code date} falls after {@code max_date}, sets {@code date} equal to {@code max_date}.
     * Otherwise, {@code date} is unchanged.
     * Either of {@code min_date} and {@code max_date} may be {@code null}.
     * All non-{@code null} dates must be valid.
     */
    public void clamp(Date minDate, Date maxDate) {
        try {
            g_date_clamp.invokeExact(handle(), minDate.handle(), maxDate.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_date_clear = Interop.downcallHandle(
        "g_date_clear",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Initializes one or more {@link Date} structs to a safe but invalid
     * state. The cleared dates will not represent an existing date, but will
     * not contain garbage. Useful to init a date declared on the stack.
     * Validity can be tested with g_date_valid().
     */
    public void clear(int nDates) {
        try {
            g_date_clear.invokeExact(handle(), nDates);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_date_compare = Interop.downcallHandle(
        "g_date_compare",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * qsort()-style comparison function for dates.
     * Both dates must be valid.
     */
    public int compare(Date rhs) {
        try {
            var RESULT = (int) g_date_compare.invokeExact(handle(), rhs.handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_date_copy = Interop.downcallHandle(
        "g_date_copy",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Copies a GDate to a newly-allocated GDate. If the input was invalid
     * (as determined by g_date_valid()), the invalid state will be copied
     * as is into the new object.
     */
    public Date copy() {
        try {
            var RESULT = (MemoryAddress) g_date_copy.invokeExact(handle());
            return new Date(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_date_days_between = Interop.downcallHandle(
        "g_date_days_between",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Computes the number of days between two dates.
     * If {@code date2} is prior to {@code date1}, the returned value is negative.
     * Both dates must be valid.
     */
    public int daysBetween(Date date2) {
        try {
            var RESULT = (int) g_date_days_between.invokeExact(handle(), date2.handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_date_free = Interop.downcallHandle(
        "g_date_free",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Frees a {@link Date} returned from g_date_new().
     */
    public void free() {
        try {
            g_date_free.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_date_get_day = Interop.downcallHandle(
        "g_date_get_day",
        FunctionDescriptor.of(ValueLayout.JAVA_BYTE, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the day of the month. The date must be valid.
     */
    public DateDay getDay() {
        try {
            var RESULT = (byte) g_date_get_day.invokeExact(handle());
            return new DateDay(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_date_get_day_of_year = Interop.downcallHandle(
        "g_date_get_day_of_year",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the day of the year, where Jan 1 is the first day of the
     * year. The date must be valid.
     */
    public int getDayOfYear() {
        try {
            var RESULT = (int) g_date_get_day_of_year.invokeExact(handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_date_get_iso8601_week_of_year = Interop.downcallHandle(
        "g_date_get_iso8601_week_of_year",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the week of the year, where weeks are interpreted according
     * to ISO 8601.
     */
    public int getIso8601WeekOfYear() {
        try {
            var RESULT = (int) g_date_get_iso8601_week_of_year.invokeExact(handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_date_get_julian = Interop.downcallHandle(
        "g_date_get_julian",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the Julian day or "serial number" of the {@link Date}. The
     * Julian day is simply the number of days since January 1, Year 1; i.e.,
     * January 1, Year 1 is Julian day 1; January 2, Year 1 is Julian day 2,
     * etc. The date must be valid.
     */
    public int getJulian() {
        try {
            var RESULT = (int) g_date_get_julian.invokeExact(handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_date_get_monday_week_of_year = Interop.downcallHandle(
        "g_date_get_monday_week_of_year",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the week of the year, where weeks are understood to start on
     * Monday. If the date is before the first Monday of the year, return 0.
     * The date must be valid.
     */
    public int getMondayWeekOfYear() {
        try {
            var RESULT = (int) g_date_get_monday_week_of_year.invokeExact(handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_date_get_month = Interop.downcallHandle(
        "g_date_get_month",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the month of the year. The date must be valid.
     */
    public DateMonth getMonth() {
        try {
            var RESULT = (int) g_date_get_month.invokeExact(handle());
            return new DateMonth(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_date_get_sunday_week_of_year = Interop.downcallHandle(
        "g_date_get_sunday_week_of_year",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the week of the year during which this date falls, if
     * weeks are understood to begin on Sunday. The date must be valid.
     * Can return 0 if the day is before the first Sunday of the year.
     */
    public int getSundayWeekOfYear() {
        try {
            var RESULT = (int) g_date_get_sunday_week_of_year.invokeExact(handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_date_get_weekday = Interop.downcallHandle(
        "g_date_get_weekday",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the day of the week for a {@link Date}. The date must be valid.
     */
    public DateWeekday getWeekday() {
        try {
            var RESULT = (int) g_date_get_weekday.invokeExact(handle());
            return new DateWeekday(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_date_get_year = Interop.downcallHandle(
        "g_date_get_year",
        FunctionDescriptor.of(ValueLayout.JAVA_SHORT, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the year of a {@link Date}. The date must be valid.
     */
    public DateYear getYear() {
        try {
            var RESULT = (short) g_date_get_year.invokeExact(handle());
            return new DateYear(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_date_is_first_of_month = Interop.downcallHandle(
        "g_date_is_first_of_month",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns {@code true} if the date is on the first of a month.
     * The date must be valid.
     */
    public boolean isFirstOfMonth() {
        try {
            var RESULT = (int) g_date_is_first_of_month.invokeExact(handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_date_is_last_of_month = Interop.downcallHandle(
        "g_date_is_last_of_month",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns {@code true} if the date is the last day of the month.
     * The date must be valid.
     */
    public boolean isLastOfMonth() {
        try {
            var RESULT = (int) g_date_is_last_of_month.invokeExact(handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_date_order = Interop.downcallHandle(
        "g_date_order",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Checks if {@code date1} is less than or equal to {@code date2},
     * and swap the values if this is not the case.
     */
    public void order(Date date2) {
        try {
            g_date_order.invokeExact(handle(), date2.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_date_set_day = Interop.downcallHandle(
        "g_date_set_day",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_BYTE)
    );
    
    /**
     * Sets the day of the month for a {@link Date}. If the resulting
     * day-month-year triplet is invalid, the date will be invalid.
     */
    public void setDay(DateDay day) {
        try {
            g_date_set_day.invokeExact(handle(), day.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_date_set_dmy = Interop.downcallHandle(
        "g_date_set_dmy",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_BYTE, ValueLayout.JAVA_INT, ValueLayout.JAVA_SHORT)
    );
    
    /**
     * Sets the value of a {@link Date} from a day, month, and year.
     * The day-month-year triplet must be valid; if you aren't
     * sure it is, call g_date_valid_dmy() to check before you
     * set it.
     */
    public void setDmy(DateDay day, DateMonth month, DateYear y) {
        try {
            g_date_set_dmy.invokeExact(handle(), day.getValue(), month.getValue(), y.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_date_set_julian = Interop.downcallHandle(
        "g_date_set_julian",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets the value of a {@link Date} from a Julian day number.
     */
    public void setJulian(int julianDate) {
        try {
            g_date_set_julian.invokeExact(handle(), julianDate);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_date_set_month = Interop.downcallHandle(
        "g_date_set_month",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets the month of the year for a {@link Date}.  If the resulting
     * day-month-year triplet is invalid, the date will be invalid.
     */
    public void setMonth(DateMonth month) {
        try {
            g_date_set_month.invokeExact(handle(), month.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_date_set_parse = Interop.downcallHandle(
        "g_date_set_parse",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
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
     */
    public void setParse(java.lang.String str) {
        try {
            g_date_set_parse.invokeExact(handle(), Interop.allocateNativeString(str).handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_date_set_time_t = Interop.downcallHandle(
        "g_date_set_time_t",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG)
    );
    
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
     */
    public void setTimeT(long timet) {
        try {
            g_date_set_time_t.invokeExact(handle(), timet);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_date_set_year = Interop.downcallHandle(
        "g_date_set_year",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_SHORT)
    );
    
    /**
     * Sets the year for a {@link Date}. If the resulting day-month-year
     * triplet is invalid, the date will be invalid.
     */
    public void setYear(DateYear year) {
        try {
            g_date_set_year.invokeExact(handle(), year.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_date_subtract_days = Interop.downcallHandle(
        "g_date_subtract_days",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Moves a date some number of days into the past.
     * To move by weeks, just move by weeks*7 days.
     * The date must be valid.
     */
    public void subtractDays(int nDays) {
        try {
            g_date_subtract_days.invokeExact(handle(), nDays);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_date_subtract_months = Interop.downcallHandle(
        "g_date_subtract_months",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Moves a date some number of months into the past.
     * If the current day of the month doesn't exist in
     * the destination month, the day of the month
     * may change. The date must be valid.
     */
    public void subtractMonths(int nMonths) {
        try {
            g_date_subtract_months.invokeExact(handle(), nMonths);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_date_subtract_years = Interop.downcallHandle(
        "g_date_subtract_years",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Moves a date some number of years into the past.
     * If the current day doesn't exist in the destination
     * year (i.e. it's February 29 and you move to a non-leap-year)
     * then the day is changed to February 29. The date
     * must be valid.
     */
    public void subtractYears(int nYears) {
        try {
            g_date_subtract_years.invokeExact(handle(), nYears);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_date_to_struct_tm = Interop.downcallHandle(
        "g_date_to_struct_tm",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Fills in the date-related bits of a struct tm using the {@code date} value.
     * Initializes the non-date parts with something safe but meaningless.
     */
    public void toStructTm(java.lang.foreign.MemoryAddress tm) {
        try {
            g_date_to_struct_tm.invokeExact(handle(), tm);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_date_valid = Interop.downcallHandle(
        "g_date_valid",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns {@code true} if the {@link Date} represents an existing day. The date must not
     * contain garbage; it should have been initialized with g_date_clear()
     * if it wasn't allocated by one of the g_date_new() variants.
     */
    public boolean valid() {
        try {
            var RESULT = (int) g_date_valid.invokeExact(handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_date_get_days_in_month = Interop.downcallHandle(
        "g_date_get_days_in_month",
        FunctionDescriptor.of(ValueLayout.JAVA_BYTE, ValueLayout.JAVA_INT, ValueLayout.JAVA_SHORT)
    );
    
    /**
     * Returns the number of days in a month, taking leap
     * years into account.
     */
    public static byte getDaysInMonth(DateMonth month, DateYear year) {
        try {
            var RESULT = (byte) g_date_get_days_in_month.invokeExact(month.getValue(), year.getValue());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_date_get_monday_weeks_in_year = Interop.downcallHandle(
        "g_date_get_monday_weeks_in_year",
        FunctionDescriptor.of(ValueLayout.JAVA_BYTE, ValueLayout.JAVA_SHORT)
    );
    
    /**
     * Returns the number of weeks in the year, where weeks
     * are taken to start on Monday. Will be 52 or 53. The
     * date must be valid. (Years always have 52 7-day periods,
     * plus 1 or 2 extra days depending on whether it's a leap
     * year. This function is basically telling you how many
     * Mondays are in the year, i.e. there are 53 Mondays if
     * one of the extra days happens to be a Monday.)
     */
    public static byte getMondayWeeksInYear(DateYear year) {
        try {
            var RESULT = (byte) g_date_get_monday_weeks_in_year.invokeExact(year.getValue());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_date_get_sunday_weeks_in_year = Interop.downcallHandle(
        "g_date_get_sunday_weeks_in_year",
        FunctionDescriptor.of(ValueLayout.JAVA_BYTE, ValueLayout.JAVA_SHORT)
    );
    
    /**
     * Returns the number of weeks in the year, where weeks
     * are taken to start on Sunday. Will be 52 or 53. The
     * date must be valid. (Years always have 52 7-day periods,
     * plus 1 or 2 extra days depending on whether it's a leap
     * year. This function is basically telling you how many
     * Sundays are in the year, i.e. there are 53 Sundays if
     * one of the extra days happens to be a Sunday.)
     */
    public static byte getSundayWeeksInYear(DateYear year) {
        try {
            var RESULT = (byte) g_date_get_sunday_weeks_in_year.invokeExact(year.getValue());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_date_is_leap_year = Interop.downcallHandle(
        "g_date_is_leap_year",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_SHORT)
    );
    
    /**
     * Returns {@code true} if the year is a leap year.
     * <p>
     * For the purposes of this function, leap year is every year
     * divisible by 4 unless that year is divisible by 100. If it
     * is divisible by 100 it would be a leap year only if that year
     * is also divisible by 400.
     */
    public static boolean isLeapYear(DateYear year) {
        try {
            var RESULT = (int) g_date_is_leap_year.invokeExact(year.getValue());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_date_strftime = Interop.downcallHandle(
        "g_date_strftime",
        FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
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
     */
    public static long strftime(java.lang.String s, long slen, java.lang.String format, Date date) {
        try {
            var RESULT = (long) g_date_strftime.invokeExact(Interop.allocateNativeString(s).handle(), slen, Interop.allocateNativeString(format).handle(), date.handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_date_valid_day = Interop.downcallHandle(
        "g_date_valid_day",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_BYTE)
    );
    
    /**
     * Returns {@code true} if the day of the month is valid (a day is valid if it's
     * between 1 and 31 inclusive).
     */
    public static boolean validDay(DateDay day) {
        try {
            var RESULT = (int) g_date_valid_day.invokeExact(day.getValue());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_date_valid_dmy = Interop.downcallHandle(
        "g_date_valid_dmy",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_BYTE, ValueLayout.JAVA_INT, ValueLayout.JAVA_SHORT)
    );
    
    /**
     * Returns {@code true} if the day-month-year triplet forms a valid, existing day
     * in the range of days {@link Date} understands (Year 1 or later, no more than
     * a few thousand years in the future).
     */
    public static boolean validDmy(DateDay day, DateMonth month, DateYear year) {
        try {
            var RESULT = (int) g_date_valid_dmy.invokeExact(day.getValue(), month.getValue(), year.getValue());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_date_valid_julian = Interop.downcallHandle(
        "g_date_valid_julian",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
    );
    
    /**
     * Returns {@code true} if the Julian day is valid. Anything greater than zero
     * is basically a valid Julian, though there is a 32-bit limit.
     */
    public static boolean validJulian(int julianDate) {
        try {
            var RESULT = (int) g_date_valid_julian.invokeExact(julianDate);
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_date_valid_month = Interop.downcallHandle(
        "g_date_valid_month",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
    );
    
    /**
     * Returns {@code true} if the month value is valid. The 12 {@link DateMonth}
     * enumeration values are the only valid months.
     */
    public static boolean validMonth(DateMonth month) {
        try {
            var RESULT = (int) g_date_valid_month.invokeExact(month.getValue());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_date_valid_weekday = Interop.downcallHandle(
        "g_date_valid_weekday",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
    );
    
    /**
     * Returns {@code true} if the weekday is valid. The seven {@link DateWeekday} enumeration
     * values are the only valid weekdays.
     */
    public static boolean validWeekday(DateWeekday weekday) {
        try {
            var RESULT = (int) g_date_valid_weekday.invokeExact(weekday.getValue());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_date_valid_year = Interop.downcallHandle(
        "g_date_valid_year",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_SHORT)
    );
    
    /**
     * Returns {@code true} if the year is valid. Any year greater than 0 is valid,
     * though there is a 16-bit limit to what {@link Date} will understand.
     */
    public static boolean validYear(DateYear year) {
        try {
            var RESULT = (int) g_date_valid_year.invokeExact(year.getValue());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
}
