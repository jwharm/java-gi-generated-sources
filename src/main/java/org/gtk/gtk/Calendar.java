package org.gtk.gtk;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * {@code GtkCalendar} is a widget that displays a Gregorian calendar, one month
 * at a time.
 * <p>
 * <img src="./doc-files/calendar.png" alt="An example GtkCalendar">
 * <p>
 * A {@code GtkCalendar} can be created with {@link Calendar#Calendar}.
 * <p>
 * The date that is currently displayed can be altered with
 * {@link Calendar#selectDay}.
 * <p>
 * To place a visual marker on a particular day, use
 * {@link Calendar#markDay} and to remove the marker,
 * {@link Calendar#unmarkDay}. Alternative, all
 * marks can be cleared with {@link Calendar#clearMarks}.
 * <p>
 * The selected date can be retrieved from a {@code GtkCalendar} using
 * {@link Calendar#getDate}.
 * <p>
 * Users should be aware that, although the Gregorian calendar is the
 * legal calendar in most countries, it was adopted progressively
 * between 1582 and 1929. Display before these dates is likely to be
 * historically incorrect.
 * <p>
 * <h1>CSS nodes</h1>
 * <p>
 * <pre>{@code 
 * calendar.view
 * ├── header
 * │   ├── button
 * │   ├── stack.month
 * │   ├── button
 * │   ├── button
 * │   ├── label.year
 * │   ╰── button
 * ╰── grid
 *     ╰── label[.day-name][.week-number][.day-number][.other-month][.today]
 * }</pre>
 * <p>
 * {@code GtkCalendar} has a main node with name calendar. It contains a subnode
 * called header containing the widgets for switching between years and months.
 * <p>
 * The grid subnode contains all day labels, including week numbers on the left
 * (marked with the .week-number css class) and day names on top (marked with the
 * .day-name css class).
 * <p>
 * Day labels that belong to the previous or next month get the .other-month
 * style class. The label of the current day get the .today style class.
 * <p>
 * Marked day labels get the :selected state assigned.
 */
public class Calendar extends Widget implements Accessible, Buildable, ConstraintTarget {

    public Calendar(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to Calendar */
    public static Calendar castFrom(org.gtk.gobject.Object gobject) {
        return new Calendar(gobject.refcounted());
    }
    
    private static Refcounted constructNew() {
        Refcounted RESULT = Refcounted.get(gtk_h.gtk_calendar_new(), false);
        return RESULT;
    }
    
    /**
     * Creates a new calendar, with the current date being selected.
     */
    public Calendar() {
        super(constructNew());
    }
    
    /**
     * Remove all visual markers.
     */
    public void clearMarks() {
        gtk_h.gtk_calendar_clear_marks(handle());
    }
    
    /**
     * Returns a {@code GDateTime} representing the shown
     * year, month and the selected day.
     * <p>
     * The returned date is in the local time zone.
     */
    public org.gtk.glib.DateTime getDate() {
        var RESULT = gtk_h.gtk_calendar_get_date(handle());
        return new org.gtk.glib.DateTime(Refcounted.get(RESULT, true));
    }
    
    /**
     * Returns if the {@code day} of the {@code calendar} is already marked.
     */
    public boolean getDayIsMarked(int day) {
        var RESULT = gtk_h.gtk_calendar_get_day_is_marked(handle(), day);
        return RESULT != 0;
    }
    
    /**
     * Returns whether {@code self} is currently showing the names
     * of the week days.
     * <p>
     * This is the value of the {@code Gtk.Calendar:show-day-names}
     * property.
     */
    public boolean getShowDayNames() {
        var RESULT = gtk_h.gtk_calendar_get_show_day_names(handle());
        return RESULT != 0;
    }
    
    /**
     * Returns whether {@code self} is currently showing the heading.
     * <p>
     * This is the value of the {@code Gtk.Calendar:show-heading}
     * property.
     */
    public boolean getShowHeading() {
        var RESULT = gtk_h.gtk_calendar_get_show_heading(handle());
        return RESULT != 0;
    }
    
    /**
     * Returns whether {@code self} is showing week numbers right
     * now.
     * <p>
     * This is the value of the {@code Gtk.Calendar:show-week-numbers}
     * property.
     */
    public boolean getShowWeekNumbers() {
        var RESULT = gtk_h.gtk_calendar_get_show_week_numbers(handle());
        return RESULT != 0;
    }
    
    /**
     * Places a visual marker on a particular day.
     */
    public void markDay(int day) {
        gtk_h.gtk_calendar_mark_day(handle(), day);
    }
    
    /**
     * Switches to {@code date}'s year and month and select its day.
     */
    public void selectDay(org.gtk.glib.DateTime date) {
        gtk_h.gtk_calendar_select_day(handle(), date.handle());
    }
    
    /**
     * Sets whether the calendar shows day names.
     */
    public void setShowDayNames(boolean value) {
        gtk_h.gtk_calendar_set_show_day_names(handle(), value ? 1 : 0);
    }
    
    /**
     * Sets whether the calendar should show a heading.
     * <p>
     * The heading contains the current year and month as well as
     * buttons for changing both.
     */
    public void setShowHeading(boolean value) {
        gtk_h.gtk_calendar_set_show_heading(handle(), value ? 1 : 0);
    }
    
    /**
     * Sets whether week numbers are shown in the calendar.
     */
    public void setShowWeekNumbers(boolean value) {
        gtk_h.gtk_calendar_set_show_week_numbers(handle(), value ? 1 : 0);
    }
    
    /**
     * Removes the visual marker from a particular day.
     */
    public void unmarkDay(int day) {
        gtk_h.gtk_calendar_unmark_day(handle(), day);
    }
    
    @FunctionalInterface
    public interface DaySelectedHandler {
        void signalReceived(Calendar source);
    }
    
    /**
     * Emitted when the user selects a day.
     */
    public SignalHandle onDaySelected(DaySelectedHandler handler) {
        try {
            var RESULT = gtk_h.g_signal_connect_data(
                handle(),
                Interop.allocateNativeString("day-selected").handle(),
                Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(Calendar.Callbacks.class, "signalCalendarDaySelected",
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
    
    @FunctionalInterface
    public interface NextMonthHandler {
        void signalReceived(Calendar source);
    }
    
    /**
     * Emitted when the user switched to the next month.
     */
    public SignalHandle onNextMonth(NextMonthHandler handler) {
        try {
            var RESULT = gtk_h.g_signal_connect_data(
                handle(),
                Interop.allocateNativeString("next-month").handle(),
                Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(Calendar.Callbacks.class, "signalCalendarNextMonth",
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
    
    @FunctionalInterface
    public interface NextYearHandler {
        void signalReceived(Calendar source);
    }
    
    /**
     * Emitted when user switched to the next year.
     */
    public SignalHandle onNextYear(NextYearHandler handler) {
        try {
            var RESULT = gtk_h.g_signal_connect_data(
                handle(),
                Interop.allocateNativeString("next-year").handle(),
                Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(Calendar.Callbacks.class, "signalCalendarNextYear",
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
    
    @FunctionalInterface
    public interface PrevMonthHandler {
        void signalReceived(Calendar source);
    }
    
    /**
     * Emitted when the user switched to the previous month.
     */
    public SignalHandle onPrevMonth(PrevMonthHandler handler) {
        try {
            var RESULT = gtk_h.g_signal_connect_data(
                handle(),
                Interop.allocateNativeString("prev-month").handle(),
                Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(Calendar.Callbacks.class, "signalCalendarPrevMonth",
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
    
    @FunctionalInterface
    public interface PrevYearHandler {
        void signalReceived(Calendar source);
    }
    
    /**
     * Emitted when user switched to the previous year.
     */
    public SignalHandle onPrevYear(PrevYearHandler handler) {
        try {
            var RESULT = gtk_h.g_signal_connect_data(
                handle(),
                Interop.allocateNativeString("prev-year").handle(),
                Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(Calendar.Callbacks.class, "signalCalendarPrevYear",
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
    
        public static void signalCalendarDaySelected(MemoryAddress source, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (Calendar.DaySelectedHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new Calendar(Refcounted.get(source)));
        }
        
        public static void signalCalendarNextMonth(MemoryAddress source, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (Calendar.NextMonthHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new Calendar(Refcounted.get(source)));
        }
        
        public static void signalCalendarNextYear(MemoryAddress source, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (Calendar.NextYearHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new Calendar(Refcounted.get(source)));
        }
        
        public static void signalCalendarPrevMonth(MemoryAddress source, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (Calendar.PrevMonthHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new Calendar(Refcounted.get(source)));
        }
        
        public static void signalCalendarPrevYear(MemoryAddress source, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (Calendar.PrevYearHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new Calendar(Refcounted.get(source)));
        }
        
    }
}
