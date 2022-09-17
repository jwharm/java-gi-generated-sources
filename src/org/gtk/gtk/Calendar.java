package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * <code>GtkCalendar</code> is a widget that displays a Gregorian calendar, one month
 * at a time.
 * <p>
 * !{@link [An example GtkCalendar]}(calendar.png)
 * <p>
 * A <code>GtkCalendar</code> can be created with {@link [ctor@Gtk.Calendar.new] (ref=ctor)}.
 * <p>
 * The date that is currently displayed can be altered with
 * {@link org.gtk.gtk.Calendar#selectDay}.
 * <p>
 * To place a visual marker on a particular day, use
 * {@link org.gtk.gtk.Calendar#markDay} and to remove the marker,
 * {@link org.gtk.gtk.Calendar#unmarkDay}. Alternative, all
 * marks can be cleared with {@link org.gtk.gtk.Calendar#clearMarks}.
 * <p>
 * The selected date can be retrieved from a <code>GtkCalendar</code> using
 * {@link org.gtk.gtk.Calendar#getDate}.
 * <p>
 * Users should be aware that, although the Gregorian calendar is the
 * legal calendar in most countries, it was adopted progressively
 * between 1582 and 1929. Display before these dates is likely to be
 * historically incorrect.
 * <p>
 * <h1>SS nodes</h1>
 * <p><pre>
 * calendar.view
 * &#9500;&#9472;&#9472; header
 * &#9474;   &#9500;&#9472;&#9472; button
 * &#9474;   &#9500;&#9472;&#9472; stack.month
 * &#9474;   &#9500;&#9472;&#9472; button
 * &#9474;   &#9500;&#9472;&#9472; button
 * &#9474;   &#9500;&#9472;&#9472; label.year
 * &#9474;   &#9584;&#9472;&#9472; button
 * &#9584;&#9472;&#9472; grid
 *     &#9584;&#9472;&#9472; label{@link [.day-name]}{@link [.week-number]}{@link [.day-number]}{@link [.other-month]}{@link [.today]}
 * </pre>
 * <p><code>GtkCalendar</code> has a main node with name calendar. It contains a subnode
 * called header containing the widgets for switching between years and months.
 * 
 * The grid subnode contains all day labels, including week numbers on the left
 * (marked with the .week-number css class) and day names on top (marked with the
 * .day-name css class).
 * 
 * Day labels that belong to the previous or next month get the .other-month
 * style class. The label of the current day get the .today style class.
 * 
 * Marked day labels get the :selected state assigned.
 */
public class Calendar extends Widget implements Accessible, Buildable, ConstraintTarget {

    public Calendar(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to Calendar */
    public static Calendar castFrom(org.gtk.gobject.Object gobject) {
        return new Calendar(gobject.getReference());
    }
    
    private static Reference constructNew() {
        Reference RESULT = References.get(gtk_h.gtk_calendar_new(), false);
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
     * Returns a <code>GDateTime</code> representing the shown
     * year, month and the selected day.
     * 
     * The returned date is in the local time zone.
     */
    public org.gtk.glib.DateTime getDate() {
        var RESULT = gtk_h.gtk_calendar_get_date(handle());
        return new org.gtk.glib.DateTime(References.get(RESULT, true));
    }
    
    /**
     * Returns if the @day of the @calendar is already marked.
     */
    public boolean getDayIsMarked(int day) {
        var RESULT = gtk_h.gtk_calendar_get_day_is_marked(handle(), day);
        return (RESULT != 0);
    }
    
    /**
     * Returns whether @self is currently showing the names
     * of the week days.
     * 
     * This is the value of the {@link [property@Gtk.Calendar:show-day-names] (ref=property)}
     * property.
     */
    public boolean getShowDayNames() {
        var RESULT = gtk_h.gtk_calendar_get_show_day_names(handle());
        return (RESULT != 0);
    }
    
    /**
     * Returns whether @self is currently showing the heading.
     * 
     * This is the value of the {@link [property@Gtk.Calendar:show-heading] (ref=property)}
     * property.
     */
    public boolean getShowHeading() {
        var RESULT = gtk_h.gtk_calendar_get_show_heading(handle());
        return (RESULT != 0);
    }
    
    /**
     * Returns whether @self is showing week numbers right
     * now.
     * 
     * This is the value of the {@link [property@Gtk.Calendar:show-week-numbers] (ref=property)}
     * property.
     */
    public boolean getShowWeekNumbers() {
        var RESULT = gtk_h.gtk_calendar_get_show_week_numbers(handle());
        return (RESULT != 0);
    }
    
    /**
     * Places a visual marker on a particular day.
     */
    public void markDay(int day) {
        gtk_h.gtk_calendar_mark_day(handle(), day);
    }
    
    /**
     * Switches to @date&#39;s year and month and select its day.
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
     * 
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
            int hash = Interop.registerCallback(handler.hashCode(), handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalCalendarDaySelected", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            long handlerId = gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("day-selected").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), handlerId);
        } catch (Exception e) {
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
            int hash = Interop.registerCallback(handler.hashCode(), handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalCalendarNextMonth", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            long handlerId = gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("next-month").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), handlerId);
        } catch (Exception e) {
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
            int hash = Interop.registerCallback(handler.hashCode(), handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalCalendarNextYear", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            long handlerId = gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("next-year").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), handlerId);
        } catch (Exception e) {
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
            int hash = Interop.registerCallback(handler.hashCode(), handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalCalendarPrevMonth", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            long handlerId = gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("prev-month").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), handlerId);
        } catch (Exception e) {
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
            int hash = Interop.registerCallback(handler.hashCode(), handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalCalendarPrevYear", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            long handlerId = gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("prev-year").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), handlerId);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
}
