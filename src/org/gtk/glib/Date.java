package org.gtk.glib;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * Represents a day between January 1, Year 1 and a few thousand years in
 * the future. None of its members should be accessed directly.
 * 
 * If the `GDate` is obtained from g_date_new(), it will be safe
 * to mutate but invalid and thus not safe for calendrical computations.
 * 
 * If it's declared on the stack, it will contain garbage so must be
 * initialized with g_date_clear(). g_date_clear() makes the date invalid
 * but safe. An invalid date doesn't represent a day, it's "empty." A date
 * becomes valid after you set it to a Julian day or you set a day, month,
 * and year.
 */
public class Date extends io.github.jwharm.javagi.interop.ResourceBase {

    public Date(io.github.jwharm.javagi.interop.Reference reference) {
        super(reference);
    }
    
    /**
     * Allocates a #GDate and initializes
     * it to a safe state. The new date will
     * be cleared (as if you'd called g_date_clear()) but invalid (it won't
     * represent an existing day). Free the return value with g_date_free().
     */
    public Date() {
        super(References.get(gtk_h.g_date_new(), true));
    }
    
    /**
     * Create a new #GDate representing the given day-month-year triplet.
     * 
     * The triplet you pass in must represent a valid date. Use g_date_valid_dmy()
     * if needed to validate it. The returned #GDate is guaranteed to be non-%NULL
     * and valid.
     */
    public static Date newDmy(DateDay day, DateMonth month, DateYear year) {
        return new Date(References.get(gtk_h.g_date_new_dmy(day.getValue(), month.getValue(), year.getValue()), true));
    }
    
    /**
     * Create a new #GDate representing the given Julian date.
     * 
     * The @julian_day you pass in must be valid. Use g_date_valid_julian() if
     * needed to validate it. The returned #GDate is guaranteed to be non-%NULL and
     * valid.
     */
    public static Date newJulian(int julianDay) {
        return new Date(References.get(gtk_h.g_date_new_julian(julianDay), true));
    }
    
    /**
     * Increments a date some number of days.
     * To move forward by weeks, add weeks*7 days.
     * The date must be valid.
     */
    public void addDays(int nDays) {
        gtk_h.g_date_add_days(handle(), nDays);
    }
    
    /**
     * Increments a date by some number of months.
     * If the day of the month is greater than 28,
     * this routine may change the day of the month
     * (because the destination month may not have
     * the current day in it). The date must be valid.
     */
    public void addMonths(int nMonths) {
        gtk_h.g_date_add_months(handle(), nMonths);
    }
    
    /**
     * Increments a date by some number of years.
     * If the date is February 29, and the destination
     * year is not a leap year, the date will be changed
     * to February 28. The date must be valid.
     */
    public void addYears(int nYears) {
        gtk_h.g_date_add_years(handle(), nYears);
    }
    
    /**
     * If @date is prior to @min_date, sets @date equal to @min_date.
     * If @date falls after @max_date, sets @date equal to @max_date.
     * Otherwise, @date is unchanged.
     * Either of @min_date and @max_date may be %NULL.
     * All non-%NULL dates must be valid.
     */
    public void clamp(Date minDate, Date maxDate) {
        gtk_h.g_date_clamp(handle(), minDate.handle(), maxDate.handle());
    }
    
    /**
     * Initializes one or more #GDate structs to a safe but invalid
     * state. The cleared dates will not represent an existing date, but will
     * not contain garbage. Useful to init a date declared on the stack.
     * Validity can be tested with g_date_valid().
     */
    public void clear(int nDates) {
        gtk_h.g_date_clear(handle(), nDates);
    }
    
    /**
     * qsort()-style comparison function for dates.
     * Both dates must be valid.
     */
    public int compare(Date rhs) {
        var RESULT = gtk_h.g_date_compare(handle(), rhs.handle());
        return RESULT;
    }
    
    /**
     * Copies a GDate to a newly-allocated GDate. If the input was invalid
     * (as determined by g_date_valid()), the invalid state will be copied
     * as is into the new object.
     */
    public Date copy() {
        var RESULT = gtk_h.g_date_copy(handle());
        return new Date(References.get(RESULT, true));
    }
    
    /**
     * Computes the number of days between two dates.
     * If @date2 is prior to @date1, the returned value is negative.
     * Both dates must be valid.
     */
    public int daysBetween(Date date2) {
        var RESULT = gtk_h.g_date_days_between(handle(), date2.handle());
        return RESULT;
    }
    
    /**
     * Frees a #GDate returned from g_date_new().
     */
    public void free() {
        gtk_h.g_date_free(handle());
    }
    
    /**
     * Returns the day of the month. The date must be valid.
     */
    public DateDay getDay() {
        var RESULT = gtk_h.g_date_get_day(handle());
        return new DateDay(RESULT);
    }
    
    /**
     * Returns the day of the year, where Jan 1 is the first day of the
     * year. The date must be valid.
     */
    public int getDayOfYear() {
        var RESULT = gtk_h.g_date_get_day_of_year(handle());
        return RESULT;
    }
    
    /**
     * Returns the week of the year, where weeks are interpreted according
     * to ISO 8601.
     */
    public int getIso8601WeekOfYear() {
        var RESULT = gtk_h.g_date_get_iso8601_week_of_year(handle());
        return RESULT;
    }
    
    /**
     * Returns the Julian day or "serial number" of the #GDate. The
     * Julian day is simply the number of days since January 1, Year 1; i.e.,
     * January 1, Year 1 is Julian day 1; January 2, Year 1 is Julian day 2,
     * etc. The date must be valid.
     */
    public int getJulian() {
        var RESULT = gtk_h.g_date_get_julian(handle());
        return RESULT;
    }
    
    /**
     * Returns the week of the year, where weeks are understood to start on
     * Monday. If the date is before the first Monday of the year, return 0.
     * The date must be valid.
     */
    public int getMondayWeekOfYear() {
        var RESULT = gtk_h.g_date_get_monday_week_of_year(handle());
        return RESULT;
    }
    
    /**
     * Returns the month of the year. The date must be valid.
     */
    public DateMonth getMonth() {
        var RESULT = gtk_h.g_date_get_month(handle());
        return DateMonth.fromValue(RESULT);
    }
    
    /**
     * Returns the week of the year during which this date falls, if
     * weeks are understood to begin on Sunday. The date must be valid.
     * Can return 0 if the day is before the first Sunday of the year.
     */
    public int getSundayWeekOfYear() {
        var RESULT = gtk_h.g_date_get_sunday_week_of_year(handle());
        return RESULT;
    }
    
    /**
     * Returns the day of the week for a #GDate. The date must be valid.
     */
    public DateWeekday getWeekday() {
        var RESULT = gtk_h.g_date_get_weekday(handle());
        return DateWeekday.fromValue(RESULT);
    }
    
    /**
     * Returns the year of a #GDate. The date must be valid.
     */
    public DateYear getYear() {
        var RESULT = gtk_h.g_date_get_year(handle());
        return new DateYear(RESULT);
    }
    
    /**
     * Returns %TRUE if the date is on the first of a month.
     * The date must be valid.
     */
    public boolean isFirstOfMonth() {
        var RESULT = gtk_h.g_date_is_first_of_month(handle());
        return (RESULT != 0);
    }
    
    /**
     * Returns %TRUE if the date is the last day of the month.
     * The date must be valid.
     */
    public boolean isLastOfMonth() {
        var RESULT = gtk_h.g_date_is_last_of_month(handle());
        return (RESULT != 0);
    }
    
    /**
     * Checks if @date1 is less than or equal to @date2,
     * and swap the values if this is not the case.
     */
    public void order(Date date2) {
        gtk_h.g_date_order(handle(), date2.handle());
    }
    
    /**
     * Sets the day of the month for a #GDate. If the resulting
     * day-month-year triplet is invalid, the date will be invalid.
     */
    public void setDay(DateDay day) {
        gtk_h.g_date_set_day(handle(), day.getValue());
    }
    
    /**
     * Sets the value of a #GDate from a day, month, and year.
     * The day-month-year triplet must be valid; if you aren't
     * sure it is, call g_date_valid_dmy() to check before you
     * set it.
     */
    public void setDmy(DateDay day, DateMonth month, DateYear y) {
        gtk_h.g_date_set_dmy(handle(), day.getValue(), month.getValue(), y.getValue());
    }
    
    /**
     * Sets the value of a #GDate from a Julian day number.
     */
    public void setJulian(int julianDate) {
        gtk_h.g_date_set_julian(handle(), julianDate);
    }
    
    /**
     * Sets the month of the year for a #GDate.  If the resulting
     * day-month-year triplet is invalid, the date will be invalid.
     */
    public void setMonth(DateMonth month) {
        gtk_h.g_date_set_month(handle(), month.getValue());
    }
    
    /**
     * Parses a user-inputted string @str, and try to figure out what date it
     * represents, taking the [current locale][setlocale] into account. If the
     * string is successfully parsed, the date will be valid after the call.
     * Otherwise, it will be invalid. You should check using g_date_valid()
     * to see whether the parsing succeeded.
     * 
     * This function is not appropriate for file formats and the like; it
     * isn't very precise, and its exact behavior varies with the locale.
     * It's intended to be a heuristic routine that guesses what the user
     * means by a given string (and it does work pretty well in that
     * capacity).
     */
    public void setParse(java.lang.String str) {
        gtk_h.g_date_set_parse(handle(), Interop.allocateNativeString(str).handle());
    }
    
    /**
     * Sets the value of a date to the date corresponding to a time
     * specified as a time_t. The time to date conversion is done using
     * the user's current timezone.
     * 
     * To set the value of a date to the current day, you could write:
     * |[<!-- language="C" -->
     *  time_t now = time (NULL);
     *  if (now == (time_t) -1)
     *    // handle the error
     *  g_date_set_time_t (date, now);
     * ]|
     */
    public void setTimeT(long timet) {
        gtk_h.g_date_set_time_t(handle(), timet);
    }
    
    /**
     * Sets the year for a #GDate. If the resulting day-month-year
     * triplet is invalid, the date will be invalid.
     */
    public void setYear(DateYear year) {
        gtk_h.g_date_set_year(handle(), year.getValue());
    }
    
    /**
     * Moves a date some number of days into the past.
     * To move by weeks, just move by weeks*7 days.
     * The date must be valid.
     */
    public void subtractDays(int nDays) {
        gtk_h.g_date_subtract_days(handle(), nDays);
    }
    
    /**
     * Moves a date some number of months into the past.
     * If the current day of the month doesn't exist in
     * the destination month, the day of the month
     * may change. The date must be valid.
     */
    public void subtractMonths(int nMonths) {
        gtk_h.g_date_subtract_months(handle(), nMonths);
    }
    
    /**
     * Moves a date some number of years into the past.
     * If the current day doesn't exist in the destination
     * year (i.e. it's February 29 and you move to a non-leap-year)
     * then the day is changed to February 29. The date
     * must be valid.
     */
    public void subtractYears(int nYears) {
        gtk_h.g_date_subtract_years(handle(), nYears);
    }
    
    /**
     * Fills in the date-related bits of a struct tm using the @date value.
     * Initializes the non-date parts with something safe but meaningless.
     */
    public void toStructTm(jdk.incubator.foreign.MemoryAddress tm) {
        gtk_h.g_date_to_struct_tm(handle(), tm);
    }
    
    /**
     * Returns %TRUE if the #GDate represents an existing day. The date must not
     * contain garbage; it should have been initialized with g_date_clear()
     * if it wasn't allocated by one of the g_date_new() variants.
     */
    public boolean valid() {
        var RESULT = gtk_h.g_date_valid(handle());
        return (RESULT != 0);
    }
    
}
